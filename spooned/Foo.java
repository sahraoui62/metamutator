// default package (CtPackage.TOP_LEVEL_PACKAGE_NAME in Spoon= unnamed package)



public class Foo {
    public boolean op(java.lang.Boolean a, java.lang.Boolean b) {
        return ((_binaryLogicalOperatorHotSpot1.is("OR") && (a || b)) || (_binaryLogicalOperatorHotSpot1.is("AND") && (a && b)));
    }

    public boolean op2(java.lang.Integer a, java.lang.Integer b) {
        return ((_binaryLogicalOperatorHotSpot2.is("EQ") && (a == b)) || (_binaryLogicalOperatorHotSpot2.is("NE") && (a != b)) || (_binaryLogicalOperatorHotSpot2.is("LT") && (a < b)) || (_binaryLogicalOperatorHotSpot2.is("GT") && (a > b)) || (_binaryLogicalOperatorHotSpot2.is("LE") && (a <= b)) || (_binaryLogicalOperatorHotSpot2.is("GE") && (a >= b)));
    }

    public boolean op3(java.lang.Class c) {
        return ((_binaryLogicalOperatorHotSpot3.is("EQ") && ((Foo.class) == c)) || (_binaryLogicalOperatorHotSpot3.is("NE") && ((Foo.class) != c)));
    }

    public void op4(int a, int b) {
        java.lang.System.out.println((a + b));
    }

    public int op5(int a, int b) {
        return a + b;
    }

    private static final metamutator.Selector _binaryLogicalOperatorHotSpot1 = metamutator.Selector.of(1,new String[]{"OR","AND"}).in(Foo.class).id("_binaryLogicalOperatorHotSpot1");

    private static final metamutator.Selector _binaryLogicalOperatorHotSpot2 = metamutator.Selector.of(2,new String[]{"GT","EQ","NE","LT","LE","GE"}).in(Foo.class).id("_binaryLogicalOperatorHotSpot2");

    private static final metamutator.Selector _binaryLogicalOperatorHotSpot3 = metamutator.Selector.of(3,new String[]{"EQ","NE"}).in(Foo.class).id("_binaryLogicalOperatorHotSpot3");
}

