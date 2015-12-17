package launcher;

import java.util.LinkedList;
import java.util.List;

import metamutator.*;
import spoon.Launcher;

public class MutantGenerator {
	 
	public static void main(String[] args){
		Launcher l = new Launcher();
		final List<String> arguments = new LinkedList<String>();
		arguments.add("-i");
		arguments.add("/home/sofiane/Documents/Master/IAGL/OPL/jsoup-master/src/main");
		
		l.addProcessor(new ReturnReplacementOperatorMetaMutator());
//	    l.addProcessor(new ArithmeticOperatorMetaMutator());
//	    l.addProcessor(new BinaryOperatorMetaMutator());
//	    l.addProcessor(new ConstantReplacementMetaMutator());
	    
	    System.out.println("Start running ...");
	    l.run(arguments.toArray(new String[arguments.size()]));
		System.out.println("Finished ! ");
	}
}
