package arithmetic;
import static org.apache.commons.lang.reflect.MethodUtils.invokeExactMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import bsh.Interpreter;
import metamutator.ArithmeticOperatorMetaMutator;
import metamutator.BinaryOperatorMetaMutator;
import metamutator.Selector;
import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.NameFilter;

public class ArithmeticOperatorMetaMutatorTest {

	@Test
    public void testBinaryOperatorMetaMutator() throws Exception {
        // build the model and apply the transformation
        Launcher l = new Launcher();
        l.addInputResource("src/test/java/arithmetic");
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

        assertEquals(1,Selector.getAllSelectors().size());
      
        // test with the first
        Selector sel=Selector.getSelectorByName(ArithmeticOperatorMetaMutator.PREFIX + "1");
        
        // check PLUS
        sel.choose(0);
        assertEquals(5, invokeExactMethod(o, "op", new Object[] {2, 3}));

        // check MINUS
        sel.choose(1);
        assertEquals(5, invokeExactMethod(o, "op", new Object[] {10, 5}));
        
        // check MUL
        sel.choose(2);
        assertEquals(16, invokeExactMethod(o, "op", new Object[] {4, 4}));
        
        // check DIV
        sel.choose(3);
        assertEquals(4, invokeExactMethod(o, "op", new Object[] {20, 5}));
        
    }
}
