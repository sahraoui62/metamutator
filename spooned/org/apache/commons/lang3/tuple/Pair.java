package org.apache.commons.lang3.tuple;


public abstract class Pair<L, R> implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.tuple.Pair<L, R>> , java.util.Map.Entry<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    public static <L, R>org.apache.commons.lang3.tuple.Pair<L, R> of(final L left, final R right) {
        return new org.apache.commons.lang3.tuple.ImmutablePair<L, R>(left , right);
    }

    public abstract L getLeft();

    public abstract R getRight();

    @java.lang.Override
    public final L getKey() {
        return getLeft();
    }

    @java.lang.Override
    public R getValue() {
        return getRight();
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.tuple.Pair<L, R> other) {
        return new org.apache.commons.lang3.builder.CompareToBuilder().append(getLeft(), other.getLeft()).append(getRight(), other.getRight()).toComparison();
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return true;
        } 
        if (obj instanceof java.util.Map.Entry<?, ?>) {
            final java.util.Map.Entry<?, ?> other = ((java.util.Map.Entry<?, ?>)(obj));
            return (org.apache.commons.lang3.ObjectUtils.equals(getKey(), other.getKey())) && (org.apache.commons.lang3.ObjectUtils.equals(getValue(), other.getValue()));
        } 
        return false;
    }

    @java.lang.Override
    public int hashCode() {
        return ((getKey()) == null ? 0 : getKey().hashCode()) ^ ((getValue()) == null ? 0 : getValue().hashCode());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return new java.lang.StringBuilder().append('(').append(getLeft()).append(',').append(getRight()).append(')').toString();
    }

    public java.lang.String toString(final java.lang.String format) {
        return java.lang.String.format(format, getLeft(), getRight());
    }
}

