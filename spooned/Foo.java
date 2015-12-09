// default package (CtPackage.TOP_LEVEL_PACKAGE_NAME in Spoon= unnamed package)



public class Foo {
    public boolean op(java.lang.Boolean a, java.lang.Boolean b) {
        return a || b;
    }

    public boolean op2(java.lang.Integer a, java.lang.Integer b) {
        return a > b;
    }

    public boolean op3(java.lang.Class c) {
        return (Foo.class) == c;
    }

    public void op4(int a, int b) {
        java.lang.System.out.println(((_arithmeticOperatorHotSpot2.is("PLUS") && ((a + b))) || (_arithmeticOperatorHotSpot2.is("MINUS") && ((a - b))) || (_arithmeticOperatorHotSpot2.is("MUL") && ((a * b))) || (_arithmeticOperatorHotSpot2.is("DIV") && ((a / b)))));
    }

    public int op5(int a, int b) {
        return ((_arithmeticOperatorHotSpot1.is("PLUS") && (a + b)) || (_arithmeticOperatorHotSpot1.is("MINUS") && (a - b)) || (_arithmeticOperatorHotSpot1.is("MUL") && (a * b)) || (_arithmeticOperatorHotSpot1.is("DIV") && (a / b)));
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot1 = metamutator.Selector.of(1,new String[]{"PLUS","MINUS","MUL","DIV"}).in(Foo.class).id("_arithmeticOperatorHotSpot1");

    private static final metamutator.Selector _arithmeticOperatorHotSpot2 = metamutator.Selector.of(2,new String[]{"PLUS","MINUS","MUL","DIV"}).in(Foo.class).id("_arithmeticOperatorHotSpot2");
}

