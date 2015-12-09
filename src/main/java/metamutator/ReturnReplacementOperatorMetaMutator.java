package metamutator;

import java.util.EnumSet;
import java.util.Set;

import com.google.common.collect.Sets;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;

public class ReturnReplacementOperatorMetaMutator extends AbstractProcessor<CtReturn> {

	public static final String PREFIX = "_returnReplacementOperatorHotSpot";
	private static int index = 0;	
	private static final EnumSet<RETURN_REPLACEMENT> absSet = EnumSet.of(RETURN_REPLACEMENT.INT_MIN, RETURN_REPLACEMENT.INT_MAX, RETURN_REPLACEMENT.NULL, RETURN_REPLACEMENT.ZERO);
	
	
	public enum RETURN_REPLACEMENT {
		INIT, // INIT VALUE
		NULL, // CHANGE BY NULL
		INT_MIN, // CHANGE BY MIN INT
		INT_MAX, // CHANGE BY MAX INT,
		ZERO // CHANGE BY 0
	};
	
	private String permutations(RETURN_REPLACEMENT value) {
		switch(value) {
			case NULL : return "null";
			case INT_MIN : return Integer.toString(Integer.MIN_VALUE);
			case INT_MAX : return Integer.toString(Integer.MAX_VALUE);
			case ZERO : return Integer.toString(0);
			default : return "";
		}
	}
	
	private Set<CtElement> hostSpots = Sets.newHashSet();

	private boolean isNumber(CtExpression<?> operand) {
		return operand.getType().getSimpleName().equals("int") || operand.getType().getSimpleName().equals("long")
				|| operand.getType().getSimpleName().equals("byte") || operand.getType().getSimpleName().equals("char")
				|| operand.getType().getSimpleName().equals("float")
				|| operand.getType().getSimpleName().equals("double")
				|| Number.class.isAssignableFrom(operand.getType().getActualClass());
	}

	public void process(CtReturn returnStatement) {
		index++;
		
		String expression = "(";
		CtExpression returnValue = returnStatement.getReturnedExpression();
		System.out.println(returnValue.getType());

		if (isNumber(returnValue)) {	
			for(RETURN_REPLACEMENT replacement : absSet){
				if(replacement.equals(RETURN_REPLACEMENT.INIT) || replacement.equals(RETURN_REPLACEMENT.NULL)) continue;
				expression += PREFIX+index + ".is(\"" + replacement.toString() + "\")?( " + permutations(replacement) + " )):";
			}		
		}//if(returnValue.getType()){
			
		//}
		else{
			expression += PREFIX+index + ".is(\" NULL \")?( " + permutations(RETURN_REPLACEMENT.NULL) +" )):";
		}
		
		
		expression += "(" + returnValue + "))";
		CtCodeSnippetExpression<Boolean> codeSnippet = getFactory().Core()
				.createCodeSnippetExpression();
		codeSnippet.setValue(expression);
		
		CtReturn newReturn = getFactory().Core().createReturn();
		newReturn.setReturnedExpression(codeSnippet);
		returnStatement.replace(newReturn);
		Selector.generateSelector(returnStatement, RETURN_REPLACEMENT.INIT.toString(), index, absSet, PREFIX);
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
