package org.apache.commons.lang3.tuple;


public final class ImmutablePair<L, R> extends org.apache.commons.lang3.tuple.Pair<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    public final L left;

    public final R right;

    public static <L, R>org.apache.commons.lang3.tuple.ImmutablePair<L, R> of(final L left, final R right) {
        return ((_returnReplacementOperator1859.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutablePair<L, R>(left , right)));
    }

    public ImmutablePair(final L left ,final R right) {
        super();
        this.left = left;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return ((_returnReplacementOperator1860.is("NULL")) ? ( null ) : (left));
    }

    @java.lang.Override
    public R getRight() {
        return ((_returnReplacementOperator1861.is("NULL")) ? ( null ) : (right));
    }

    @java.lang.Override
    public R setValue(final R value) {
        throw new java.lang.UnsupportedOperationException();
    }

    private static final metamutator.Selector _returnReplacementOperator1859 = metamutator.Selector.of(1859,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.ImmutablePair.class).id("_returnReplacementOperator1859");

    private static final metamutator.Selector _returnReplacementOperator1860 = metamutator.Selector.of(1860,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.ImmutablePair.class).id("_returnReplacementOperator1860");

    private static final metamutator.Selector _returnReplacementOperator1861 = metamutator.Selector.of(1861,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.ImmutablePair.class).id("_returnReplacementOperator1861");
}

