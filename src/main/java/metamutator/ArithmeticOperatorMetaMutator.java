package metamutator;

import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

import metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtAnonymousExecutable;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;

/**
 * inserts a mutation hotspot for each arithmetic operator
 */
public class ArithmeticOperatorMetaMutator extends
		AbstractProcessor<CtBinaryOperator<Boolean>> {

	public static final String PREFIX =  "_arithmeticOperatorHotSpot";
	private static int index = 0;
	private static final EnumSet<BinaryOperatorKind> ARITHMETIC_OPERATORS = EnumSet
			.of(BinaryOperatorKind.PLUS, BinaryOperatorKind.MINUS, BinaryOperatorKind.DIV, BinaryOperatorKind.MUL);
	
	private Set<CtElement> hostSpots = Sets.newHashSet();
	
	private String permutations(BinaryOperatorKind value) {
		switch(value) {
			case PLUS : return "+";
			case MINUS : return "-";
			case DIV : return "/";
			case MUL : return "*";
			default : return "";
		}
	}
	
	
	@Override
	public boolean isToBeProcessed(CtBinaryOperator<Boolean> element) {
		// if (element.getParent(CtAnonymousExecutable.class)!=null) {
		// System.out.println(element.getParent(CtAnonymousExecutable.class));
		// }
		try {
			Selector.getTopLevelClass(element);
		} catch (NullPointerException e) {
			return false;
		}

		// not in constructors because we use static fields
		if (element.getParent(CtConstructor.class) != null) {
			return false;
		}

		// not in fields declaration because we use static fields
		if (element.getParent(CtField.class) != null) {
			return false;
		}

		return (ARITHMETIC_OPERATORS.contains(element.getKind()))
				&& (element.getParent(CtAnonymousExecutable.class) == null);
	}

	public void process(CtBinaryOperator<Boolean> binaryOperator) {
		BinaryOperatorKind kind = binaryOperator.getKind();
		if(ARITHMETIC_OPERATORS.contains(kind)){
			if(binaryOperator.getLeftHandOperand().getType() != null && binaryOperator.getRightHandOperand().getType() != null)
				if ( isNumber(binaryOperator.getLeftHandOperand())
				&& isNumber(binaryOperator.getRightHandOperand()))
				{
					mutateOperator(binaryOperator, ARITHMETIC_OPERATORS);
				}
		}
	}

	private boolean isNumber(CtExpression<?> operand) {
		return operand.getType().getSimpleName().equals("int")
			|| operand.getType().getSimpleName().equals("long")
			|| operand.getType().getSimpleName().equals("byte")
			|| operand.getType().getSimpleName().equals("char")
		|| operand.getType().getSimpleName().equals("float")
		|| operand.getType().getSimpleName().equals("double")
		|| Number.class.isAssignableFrom(operand.getType().getActualClass());
	}

/**
	 * Converts "a op b" bean op one of "-", "+", "*", "/"
	 *    (  (op(1, 0, "-") && (a - b))
	 *    || (op(1, 1, "+") && (a + b))
	 *    || (op(1, 2, "*") && (a * b))
	 *    || (op(1, 3, "/") && (a / b))
	 *    )
	 *
	 * @param expression
	 * @param operators
	 */
	private void mutateOperator(final CtBinaryOperator<Boolean> expression, EnumSet<BinaryOperatorKind> operators) {
		
		if (!operators.contains(expression.getKind())) {
			throw new IllegalArgumentException("not consistent");
		}

		if (alreadyInHotsSpot(expression)
				|| expression.toString().contains(".is(\"")) {
			System.out
					.println(String
							.format("Expression '%s' ignored because it is included in previous hot spot",
									expression));
			return;
		}

		int thisIndex = ++index;
		String originalKind = expression.getKind().toString();
		String originalExpression = expression.toString();
		
		String newExpression = "";
		
		int cpt = 0;
		BinaryOperatorKind tmp = null;
		for(BinaryOperatorKind op : ARITHMETIC_OPERATORS){
			//if(!op.equals(expression.getKind())){
				expression.setKind(op);
				newExpression += "(" + PREFIX + thisIndex + ".is(\"" + op + "\")) ? (" + expression + ")";
				newExpression += " : ";
			//}
		}

		
		//newExpression += "(" + expression + ")";
		newExpression += "(" + originalExpression + ")"; 
		
		/*String newExpression = "";
		for(BinaryOperatorKind op : ARITHMETIC_OPERATORS){
			newExpression += PREFIX + index + ".is(\"" + op.toString() + "\")?( " + permutations(op) + " )):";
		}		
		*/
		CtCodeSnippetExpression<Boolean> codeSnippet = getFactory().Core()
				.createCodeSnippetExpression();
		codeSnippet.setValue('(' + newExpression + ')');

		expression.replace(codeSnippet);
		expression.replace(expression);
		Selector.generateSelector(expression, originalKind, thisIndex, operators, PREFIX);

		hostSpots.add(expression);

	}

	/**
	 * Check if this sub expression was already inside an uppermost expression
	 * that was processed has a hot spot. This version does not allowed
	 * conflicting hot spots
	 * 
	 * @param element
	 *            the current expression to test
	 * @return true if this expression is descendant of an already processed
	 *         expression
	 */
	private boolean alreadyInHotsSpot(CtElement element) {
		CtElement parent = element.getParent();
		while (!isTopLevel(parent) && parent != null) {
			if (hostSpots.contains(parent))
				return true;

			parent = parent.getParent();
		}

		return false;
	}

	private boolean isTopLevel(CtElement parent) {
		return parent instanceof CtClass && ((CtClass) parent).isTopLevel();
	}
}
