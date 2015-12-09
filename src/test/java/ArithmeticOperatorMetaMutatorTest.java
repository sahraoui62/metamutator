import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bsh.Interpreter;
import metamutator.ArithmeticOperatorMetaMutator;
import metamutator.Selector;
import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.NameFilter;

public class ArithmeticOperatorMetaMutatorTest {

	@Test
    public void testBinaryOperatorMetaMutator() throws Exception {
        // build the model and apply the transformation
        Launcher l = new Launcher();
        l.addInputResource("src/test/java");
        l.addProcessor(new ArithmeticOperatorMetaMutator());
        l.run();

        // now we get the code of Foo
        CtClass c = (CtClass) l.getFactory().Package().getRootPackage().getElements(new NameFilter("Foo")).get(0);
        
        // printing the metaprogram
        System.out.println("// Metaprogram: ");
        System.out.println(c.toString());

        // we prepare an interpreter for the transformed code
        Interpreter bsh = new Interpreter();

        // there is no selector before loading the class
        assertEquals(0,Selector.getAllSelectors().size());

        // creating a new instance of the class
        Object o = ((Class)bsh.eval(c.toString())).newInstance();        
        System.out.println(Selector.getAllSelectors().size());
        assertEquals(2,Selector.getAllSelectors().size());
      
        
    }
}
