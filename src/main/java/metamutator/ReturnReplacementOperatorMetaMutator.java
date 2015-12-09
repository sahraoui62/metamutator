package metamutator;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;

public class ReturnReplacementOperatorMetaMutator extends AbstractProcessor<CtReturn> {

	public static final String PREFIX = "_returnReplacementOperatorHotSpot";
	private static int index = 0;
	
	//private static final Set CONSTANT_VALUES = new HashSet<String>(Arrays.asList("0",Integer.toString(Integer.MIN_VALUE),Integer.toString(Integer.MAX_VALUE)));
	
	private Set<CtElement> hostSpots = Sets.newHashSet();


	public void process(CtReturn returnStatement) {
		CtExpression returnValue = returnStatement.getReturnedExpression();
		if (isNumber(returnValue)) {
			// mutateOperator(returnStatement, CONSTANT_VALUES);
			CtCodeSnippetExpression<Boolean> codeSnippet = getFactory().Core().createCodeSnippetExpression();
			codeSnippet.setValue("100");
			returnStatement.setReturnedExpression(codeSnippet);
		}else{
			// intégrer un null
			CtCodeSnippetExpression<Boolean> codeSnippet = getFactory().Core().createCodeSnippetExpression();
			codeSnippet.setValue("null");
			returnStatement.setReturnedExpression(codeSnippet);
		}
	}

	private boolean isNumber(CtExpression<?> operand) {
		return operand.getType().getSimpleName().equals("int") || operand.getType().getSimpleName().equals("long")
				|| operand.getType().getSimpleName().equals("byte") || operand.getType().getSimpleName().equals("char")
				|| operand.getType().getSimpleName().equals("float")
				|| operand.getType().getSimpleName().equals("double")
				|| Number.class.isAssignableFrom(operand.getType().getActualClass());
	}

	/**
	 *
	 *
	 * @param ctReturn
	 * @param operators
	 */
	/*private void mutateOperator(final CtReturn ctReturn, String[] operators) {

		/*if (!operators.contains(ctReturn.getKind())) {
			throw new IllegalArgumentException("not consistent");
		}

		if (alreadyInHotsSpot(ctReturn) || ctReturn.toString().contains(".is(\"")) {
			System.out.println(
					String.format("Expression '%s' ignored because it is included in previous hot spot", ctReturn));
			return;
		}*/

		/*int thisIndex = ++index;

		String originalKind = ctReturn.getReturnedExpression().toString();
		String newExpression = operators.stream().map(kind -> {
			expression.setKind(kind);
			return String.format("(" + PREFIX + "%s.is(\"%s\") && (%s))", thisIndex, kind, expression);
		}).collect(Collectors.joining(" || "));

		CtCodeSnippetExpression<Boolean> codeSnippet = getFactory().Core().createCodeSnippetExpression();
		codeSnippet.setValue('(' + newExpression + ')');

		ctReturn.replace(codeSnippet);
		ctReturn.replace(ctReturn);
		Selector.generateSelector(ctReturn, originalKind, thisIndex, operators, PREFIX);

		hostSpots.add(ctReturn);

	}*/

	/*public void process(CtVariableRead candidate) {
		index++;
		
		String expression = "(";
		for(UNARY unary : absSet){
			if(unary.equals(UNARY.INIT)) continue;
			expression += PREFIX+index + ".is(\"" + unary.toString() + "\")?( " + UnaryEquivalent(unary)  + candidate.getVariable().getSimpleName() + ")):";
		}
		expression += "(" + candidate.getVariable().getSimpleName() + "))";
		CtCodeSnippetExpression<Boolean> codeSnippet = getFactory().Core()
				.createCodeSnippetExpression();
		codeSnippet.setValue(expression);
		candidate.replace(codeSnippet);
		Selector.generateSelector(candidate, UNARY.INIT.toString(), index, absSet, PREFIX);
	}*/
	
	
	
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
