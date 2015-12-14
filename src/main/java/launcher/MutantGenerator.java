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
		arguments.add("/Users/slimane/Documents/master2/OPL/jsoup-master/src/main");
		
		//l.addProcessor(new ReturnReplacementOperatorMetaMutator());
	    l.addProcessor(new ArithmeticOperatorMetaMutator());
	    //l.addProcessor(new BinaryOperatorMetaMutator());
	    
	    System.out.println("Start running ...");
	    l.run(arguments.toArray(new String[arguments.size()]));
		System.out.println("Finished ! ");
	}
}
