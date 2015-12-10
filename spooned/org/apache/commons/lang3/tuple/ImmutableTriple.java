package org.apache.commons.lang3.tuple;


public final class ImmutableTriple<L, M, R> extends org.apache.commons.lang3.tuple.Triple<L, M, R> {
    private static final long serialVersionUID = 1L;

    public final L left;

    public final M middle;

    public final R right;

    public static <L, M, R>org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return ((_returnReplacementOperator1862.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R>(left , middle , right)));
    }

    public ImmutableTriple(final L left ,final M middle ,final R right) {
        super();
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return ((_returnReplacementOperator1863.is("NULL")) ? ( null ) : (left));
    }

    @java.lang.Override
    public M getMiddle() {
        return ((_returnReplacementOperator1864.is("NULL")) ? ( null ) : (middle));
    }

    @java.lang.Override
    public R getRight() {
        return ((_returnReplacementOperator1865.is("NULL")) ? ( null ) : (right));
    }

    private static final metamutator.Selector _returnReplacementOperator1862 = metamutator.Selector.of(1862,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperator1862");

    private static final metamutator.Selector _returnReplacementOperator1863 = metamutator.Selector.of(1863,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperator1863");

    private static final metamutator.Selector _returnReplacementOperator1864 = metamutator.Selector.of(1864,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperator1864");

    private static final metamutator.Selector _returnReplacementOperator1865 = metamutator.Selector.of(1865,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperator1865");
}

