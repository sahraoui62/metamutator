package org.apache.commons.lang3.tuple;


public abstract class Pair<L, R> implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.tuple.Pair<L, R>> , java.util.Map.Entry<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    public static <L, R>org.apache.commons.lang3.tuple.Pair<L, R> of(final L left, final R right) {
        return ((_returnReplacementOperator1874.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutablePair<L, R>(left , right)));
    }

    public abstract L getLeft();

    public abstract R getRight();

    @java.lang.Override
    public final L getKey() {
        return ((_returnReplacementOperator1875.is("NULL")) ? ( null ) : (getLeft()));
    }

    @java.lang.Override
    public R getValue() {
        return ((_returnReplacementOperator1876.is("NULL")) ? ( null ) : (getRight()));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.tuple.Pair<L, R> other) {
        return ((_returnReplacementOperator1880.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1880.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1880.is("ZERO")) ? ( 0 ) : (new org.apache.commons.lang3.builder.CompareToBuilder().append(getLeft(), other.getLeft()).append(getRight(), other.getRight()).toComparison()));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperator1877.is("NULL")) ? ( null ) : (true));
        } 
        if (obj instanceof java.util.Map.Entry<?, ?>) {
            final java.util.Map.Entry<?, ?> other = ((java.util.Map.Entry<?, ?>)(obj));
            return ((_returnReplacementOperator1878.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ObjectUtils.equals(getKey(), other.getKey())) && (org.apache.commons.lang3.ObjectUtils.equals(getValue(), other.getValue()))));
        } 
        return ((_returnReplacementOperator1879.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator1881.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1881.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1881.is("ZERO")) ? ( 0 ) : (((getKey()) == null ? 0 : getKey().hashCode()) ^ ((getValue()) == null ? 0 : getValue().hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator1882.is("NULL")) ? ( null ) : (new java.lang.StringBuilder().append('(').append(getLeft()).append(',').append(getRight()).append(')').toString()));
    }

    public java.lang.String toString(final java.lang.String format) {
        return ((_returnReplacementOperator1883.is("NULL")) ? ( null ) : (java.lang.String.format(format, getLeft(), getRight())));
    }

    private static final metamutator.Selector _returnReplacementOperator1874 = metamutator.Selector.of(1874,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1874");

    private static final metamutator.Selector _returnReplacementOperator1875 = metamutator.Selector.of(1875,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1875");

    private static final metamutator.Selector _returnReplacementOperator1876 = metamutator.Selector.of(1876,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1876");

    private static final metamutator.Selector _returnReplacementOperator1877 = metamutator.Selector.of(1877,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1877");

    private static final metamutator.Selector _returnReplacementOperator1878 = metamutator.Selector.of(1878,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1878");

    private static final metamutator.Selector _returnReplacementOperator1879 = metamutator.Selector.of(1879,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1879");

    private static final metamutator.Selector _returnReplacementOperator1880 = metamutator.Selector.of(1880,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1880");

    private static final metamutator.Selector _returnReplacementOperator1881 = metamutator.Selector.of(1881,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1881");

    private static final metamutator.Selector _returnReplacementOperator1882 = metamutator.Selector.of(1882,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1882");

    private static final metamutator.Selector _returnReplacementOperator1883 = metamutator.Selector.of(1883,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperator1883");
}

