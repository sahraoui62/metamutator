package org.apache.commons.lang3.tuple;


public class MutablePair<L, R> extends org.apache.commons.lang3.tuple.Pair<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    public L left;

    public R right;

    public static <L, R>org.apache.commons.lang3.tuple.MutablePair<L, R> of(final L left, final R right) {
        return ((_returnReplacementOperator1866.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.tuple.MutablePair<L, R>(left , right)));
    }

    public MutablePair() {
        super();
    }

    public MutablePair(final L left ,final R right) {
        super();
        this.left = left;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return ((_returnReplacementOperator1867.is("NULL")) ? ( null ) : (left));
    }

    public void setLeft(final L left) {
        this.left = left;
    }

    @java.lang.Override
    public R getRight() {
        return ((_returnReplacementOperator1868.is("NULL")) ? ( null ) : (right));
    }

    public void setRight(final R right) {
        this.right = right;
    }

    @java.lang.Override
    public R setValue(final R value) {
        final R result = getRight();
        setRight(value);
        return ((_returnReplacementOperator1869.is("NULL")) ? ( null ) : (result));
    }

    private static final metamutator.Selector _returnReplacementOperator1866 = metamutator.Selector.of(1866,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutablePair.class).id("_returnReplacementOperator1866");

    private static final metamutator.Selector _returnReplacementOperator1867 = metamutator.Selector.of(1867,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutablePair.class).id("_returnReplacementOperator1867");

    private static final metamutator.Selector _returnReplacementOperator1868 = metamutator.Selector.of(1868,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutablePair.class).id("_returnReplacementOperator1868");

    private static final metamutator.Selector _returnReplacementOperator1869 = metamutator.Selector.of(1869,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.MutablePair.class).id("_returnReplacementOperator1869");
}

