// default package (CtPackage.TOP_LEVEL_PACKAGE_NAME in Spoon= unnamed package)



public class ArithmeticOperatorMetaMutatorTest {
    @org.junit.Test
    public void testBinaryOperatorMetaMutator() throws java.lang.Exception {
        spoon.Launcher l = new spoon.Launcher();
        l.addInputResource("src/test/java");
        l.addProcessor(new metamutator.ArithmeticOperatorMetaMutator());
        l.run();
        spoon.reflect.declaration.CtClass c = ((spoon.reflect.declaration.CtClass)(l.getFactory().Package().getRootPackage().getElements(new spoon.reflect.visitor.filter.NameFilter("Foo")).get(0)));
        java.lang.System.out.println("// Metaprogram: ");
        java.lang.System.out.println(c.toString());
        bsh.Interpreter bsh = new bsh.Interpreter();
        org.junit.Assert.assertEquals(0, metamutator.Selector.getAllSelectors().size());
        java.lang.Object o = ((java.lang.Class)(bsh.eval(c.toString()))).newInstance();
        java.lang.System.out.println(metamutator.Selector.getAllSelectors().size());
        org.junit.Assert.assertEquals(1, metamutator.Selector.getAllSelectors().size());
    }
}

