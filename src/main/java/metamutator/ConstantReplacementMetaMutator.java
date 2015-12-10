package metamutator;

import java.util.EnumSet;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.code.CtVariableRead;
import spoon.reflect.declaration.CtVariable;

public class ConstantReplacementMetaMutator extends AbstractProcessor<CtVariable<?>> {

	public static final String PREFIX = "_constantOperatorMetaMutator";
	
	public enum CONSTANT_REP {
		
		ZERO,
		
		INT_MAX,
		
		MIN_MIN
	};
	
	private static int thisIndex = 0;
	
	private static final EnumSet<CONSTANT_REP> consRep = EnumSet.
			of(CONSTANT_REP.ZERO, CONSTANT_REP.INT_MAX, CONSTANT_REP.MIN_MIN);
	
	public boolean isToBeProcessed(CtVariable element){
		
		if(element.getType().toString().equals("int")){
			//System.out.println(element.getVariable().getDeclaration().getDefaultExpression());
			return true;		
		}
	
		return false;
		
	}
	
//	private String permutations(RETURN_REPLACEMENT value) {
//		switch(value) {
//			case NULL : return "null";
//			case INT_MIN : return Integer.toString(Integer.MIN_VALUE);
//			case INT_MAX : return Integer.toString(Integer.MAX_VALUE);
//			case ZERO : return Integer.toString(0);
//			default : return "";
//		}
//	}
	
	private String permutations(CONSTANT_REP value) {
		switch(value) {
		case ZERO : return "0";
		case INT_MAX : return Integer.toString(Integer.MAX_VALUE - 1);
		case MIN_MIN : return Integer.toString(Integer.MIN_VALUE + 1);
		default : return "";}
		}
	
	@Override
	public void process(CtVariable element) {
		
		thisIndex++;
		CtExpression valToChange = element.getDefaultExpression();
		System.out.println(element.getClass()+" ***** "+element.toString()+" ***** "+valToChange);
		String expression = "(";
		
		for(CONSTANT_REP c : consRep){
			expression += PREFIX+thisIndex + ".is(\"" + c.toString() + "\")?( "+permutations(c)+" ):(";
		}
		//(_constantOperatorMetaMutator1.is("ZERO")?( 0 ):(_constantOperatorMetaMutator1.is("INT_MAX")?( 2147483647 ):(_constantOperatorMetaMutator1.is("MIN_MIN")?( -2147483648 ):((42)))));
		expression += valToChange + "))))";

		CtCodeSnippetExpression<String> codeSnippet = getFactory().Core()
				.createCodeSnippetExpression();
		codeSnippet.setValue(expression);
		valToChange.replace(codeSnippet);
		Selector.generateSelector(element, CONSTANT_REP.ZERO.toString(), thisIndex, consRep, PREFIX);
	}
	
}
