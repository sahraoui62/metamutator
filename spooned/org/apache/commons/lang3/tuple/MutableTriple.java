package org.apache.commons.lang3.tuple;


public class MutableTriple<L, M, R> extends org.apache.commons.lang3.tuple.Triple<L, M, R> {
    private static final long serialVersionUID = 1L;

    public L left;

    public M middle;

    public R right;

    public static <L, M, R>org.apache.commons.lang3.tuple.MutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return ((_returnReplacementOperator1870.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.tuple.MutableTriple<L, M, R>(left , middle , right)));
    }

    public MutableTriple() {
        super();
    }

    public MutableTriple(final L left ,final M middle ,final R right) {
        super();
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return ((_returnReplacementOperator1871.is("NULL")) ? ( null ) : (left));
    }

    public void setLeft(final L left) {
        this.left = left;
    }

    @java.lang.Override
    public M getMiddle() {
        return ((_returnReplacementOperator1872.is("NULL")) ? ( null ) : (middle));
    }

    public void setMiddle(final M middle) {
        this.middle = middle;
    }

    @java.lang.Override
    public R getRight() {
        return ((_returnReplacementOperator1873.is("NULL")) ? ( null ) : (right));
    }

    public void setRight(final R right) {
        this.right = right;
    }

    private static final metamutator.Selector _returnReplacementOperator1870 = metamutator.Selector.of(1870,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperator1870");

    private static final metamutator.Selector _returnReplacementOperator1871 = metamutator.Selector.of(1871,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperator1871");

    private static final metamutator.Selector _returnReplacementOperator1872 = metamutator.Selector.of(1872,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperator1872");

    private static final metamutator.Selector _returnReplacementOperator1873 = metamutator.Selector.of(1873,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperator1873");
}

