package launcher;

import metamutator.ArithmeticOperatorMetaMutator;
import metamutator.BinaryOperatorMetaMutator;
import metamutator.MutantSearchSpaceExplorator;
import metamutator.ReturnReplacementOperatorMetaMutator;
import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.NameFilter;

public class MutantGenerator {
	 
	public static void main(String[] args){
		Launcher l = new Launcher();
	    //l.addInputResource("/local/elouadi/workspace/AppliTestMetamutator/app-test/src");
        l.addInputResource("src/test/java");
		//l.setSourceOutputDirectory("/local/elouadi/workspace/AppliTestMetamutator/spooned");
	    
        //l.addProcessor(new ReturnReplacementOperatorMetaMutator());
	    l.addProcessor(new ArithmeticOperatorMetaMutator());
	    //l.addProcessor(new BinaryOperatorMetaMutator());
	    
	    l.run();
		
		//MutantSearchSpaceExplorator.runMetaProgramWith(HelloWorldTest.class);
	    
        // now we get the code of Foo
        CtClass c = (CtClass) l.getFactory().Package().getRootPackage().getElements(new NameFilter("Foo")).get(0);
        
        // printing the metaprogram
        System.out.println("// Metaprogram: ");
        System.out.println(c.toString());

	}
}
