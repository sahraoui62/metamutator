package org.apache.commons.lang3.tuple;


public final class ImmutableTriple<L, M, R> extends org.apache.commons.lang3.tuple.Triple<L, M, R> {
    private static final long serialVersionUID = 1L;

    public final L left;

    public final M middle;

    public final R right;

    public static <L, M, R>org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return new org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R>(left , middle , right);
    }

    public ImmutableTriple(final L left ,final M middle ,final R right) {
        super();
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return left;
    }

    @java.lang.Override
    public M getMiddle() {
        return middle;
    }

    @java.lang.Override
    public R getRight() {
        return right;
    }
}

