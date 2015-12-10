package org.apache.commons.lang3.tuple;


public abstract class Triple<L, M, R> implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.tuple.Triple<L, M, R>> {
    private static final long serialVersionUID = 1L;

    public static <L, M, R>org.apache.commons.lang3.tuple.Triple<L, M, R> of(final L left, final M middle, final R right) {
        return new org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R>(left , middle , right);
    }

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.tuple.Triple<L, M, R> other) {
        return new org.apache.commons.lang3.builder.CompareToBuilder().append(getLeft(), other.getLeft()).append(getMiddle(), other.getMiddle()).append(getRight(), other.getRight()).toComparison();
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return true;
        } 
        if (obj instanceof org.apache.commons.lang3.tuple.Triple<?, ?, ?>) {
            final org.apache.commons.lang3.tuple.Triple<?, ?, ?> other = ((org.apache.commons.lang3.tuple.Triple<?, ?, ?>)(obj));
            return ((org.apache.commons.lang3.ObjectUtils.equals(getLeft(), other.getLeft())) && (org.apache.commons.lang3.ObjectUtils.equals(getMiddle(), other.getMiddle()))) && (org.apache.commons.lang3.ObjectUtils.equals(getRight(), other.getRight()));
        } 
        return false;
    }

    @java.lang.Override
    public int hashCode() {
        return (((getLeft()) == null ? 0 : getLeft().hashCode()) ^ ((getMiddle()) == null ? 0 : getMiddle().hashCode())) ^ ((getRight()) == null ? 0 : getRight().hashCode());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((((("(" + (getLeft())) + ",") + (getMiddle())) + ",") + (getRight())) + ")";
    }

    public java.lang.String toString(final java.lang.String format) {
        return java.lang.String.format(format, getLeft(), getMiddle(), getRight());
    }
}

