package org.apache.commons.lang3.tuple;


public abstract class Triple<L, M, R> implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.tuple.Triple<L, M, R>> {
    private static final long serialVersionUID = 1L;

    public static <L, M, R>org.apache.commons.lang3.tuple.Triple<L, M, R> of(final L left, final M middle, final R right) {
        return ((_returnReplacementOperator1884.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R>(left , middle , right)));
    }

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.tuple.Triple<L, M, R> other) {
        return ((_returnReplacementOperator1888.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1888.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1888.is("ZERO")) ? ( 0 ) : (new org.apache.commons.lang3.builder.CompareToBuilder().append(getLeft(), other.getLeft()).append(getMiddle(), other.getMiddle()).append(getRight(), other.getRight()).toComparison()));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperator1885.is("NULL")) ? ( null ) : (true));
        } 
        if (obj instanceof org.apache.commons.lang3.tuple.Triple<?, ?, ?>) {
            final org.apache.commons.lang3.tuple.Triple<?, ?, ?> other = ((org.apache.commons.lang3.tuple.Triple<?, ?, ?>)(obj));
            return ((_returnReplacementOperator1886.is("NULL")) ? ( null ) : (((org.apache.commons.lang3.ObjectUtils.equals(getLeft(), other.getLeft())) && (org.apache.commons.lang3.ObjectUtils.equals(getMiddle(), other.getMiddle()))) && (org.apache.commons.lang3.ObjectUtils.equals(getRight(), other.getRight()))));
        } 
        return ((_returnReplacementOperator1887.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator1889.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1889.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1889.is("ZERO")) ? ( 0 ) : ((((getLeft()) == null ? 0 : getLeft().hashCode()) ^ ((getMiddle()) == null ? 0 : getMiddle().hashCode())) ^ ((getRight()) == null ? 0 : getRight().hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator1890.is("NULL")) ? ( null ) : (((((("(" + (getLeft())) + ",") + (getMiddle())) + ",") + (getRight())) + ")"));
    }

    public java.lang.String toString(final java.lang.String format) {
        return ((_returnReplacementOperator1891.is("NULL")) ? ( null ) : (java.lang.String.format(format, getLeft(), getMiddle(), getRight())));
    }

    private static final metamutator.Selector _returnReplacementOperator1884 = metamutator.Selector.of(1884,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1884");

    private static final metamutator.Selector _returnReplacementOperator1885 = metamutator.Selector.of(1885,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1885");

    private static final metamutator.Selector _returnReplacementOperator1886 = metamutator.Selector.of(1886,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1886");

    private static final metamutator.Selector _returnReplacementOperator1887 = metamutator.Selector.of(1887,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1887");

    private static final metamutator.Selector _returnReplacementOperator1888 = metamutator.Selector.of(1888,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1888");

    private static final metamutator.Selector _returnReplacementOperator1889 = metamutator.Selector.of(1889,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1889");

    private static final metamutator.Selector _returnReplacementOperator1890 = metamutator.Selector.of(1890,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1890");

    private static final metamutator.Selector _returnReplacementOperator1891 = metamutator.Selector.of(1891,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperator1891");
}

