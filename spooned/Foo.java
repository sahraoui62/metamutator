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

    public int constant() {
        int i = (_constantOperatorMetaMutator1.is("ZERO")?( 0 ):(_constantOperatorMetaMutator1.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator1.is("MIN_MIN")?( -2147483647 ):(42))));
        return i;
    }

    private static final metamutator.Selector _constantOperatorMetaMutator1 = metamutator.Selector.of(1,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(Foo.class).id("_constantOperatorMetaMutator1");
}

