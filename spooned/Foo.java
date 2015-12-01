// default package (CtPackage.TOP_LEVEL_PACKAGE_NAME in Spoon= unnamed package)



public class Foo {
    public boolean op(java.lang.Boolean a, java.lang.Boolean b) {
        return ((_s1.is("OR") && (a || b)) || (_s1.is("AND") && (a && b)));
    }

    public boolean op2(java.lang.Integer a, java.lang.Integer b) {
        return ((_s2.is("EQ") && (a == b)) || (_s2.is("NE") && (a != b)) || (_s2.is("LT") && (a < b)) || (_s2.is("GT") && (a > b)) || (_s2.is("LE") && (a <= b)) || (_s2.is("GE") && (a >= b)));
    }

    public boolean op3(java.lang.Class c) {
        return ((_s3.is("EQ") && ((Foo.class) == c)) || (_s3.is("NE") && ((Foo.class) != c)));
    }

    public int op4(int a, int b) {
        return a + b;
    }

    private static final metamutator.Selector _s1 = metamutator.Selector.of(1,new String[]{"OR","AND"}).in(Foo.class).id("_s1");

    private static final metamutator.Selector _s2 = metamutator.Selector.of(2,new String[]{"GT","EQ","NE","LT","LE","GE"}).in(Foo.class).id("_s2");

    private static final metamutator.Selector _s3 = metamutator.Selector.of(3,new String[]{"EQ","NE"}).in(Foo.class).id("_s3");
}

