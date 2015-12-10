package org.apache.commons.lang3.tuple;


public abstract class Triple<L, M, R> implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.tuple.Triple<L, M, R>> {
    private static final long serialVersionUID = 1L;

    public static <L, M, R>org.apache.commons.lang3.tuple.Triple<L, M, R> of(final L left, final M middle, final R right) {
        return ((_returnReplacementOperatorHotSpot1884.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R>(left , middle , right)));
    }

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.tuple.Triple<L, M, R> other) {
        return ((_returnReplacementOperatorHotSpot1888.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1888.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1888.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (new org.apache.commons.lang3.builder.CompareToBuilder().append(getLeft(), other.getLeft()).append(getMiddle(), other.getMiddle()).append(getRight(), other.getRight()).toComparison()));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperatorHotSpot1885.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (obj instanceof org.apache.commons.lang3.tuple.Triple<?, ?, ?>) {
            final org.apache.commons.lang3.tuple.Triple<?, ?, ?> other = ((org.apache.commons.lang3.tuple.Triple<?, ?, ?>)(obj));
            return ((_returnReplacementOperatorHotSpot1886.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((org.apache.commons.lang3.ObjectUtils.equals(getLeft(), other.getLeft())) && (org.apache.commons.lang3.ObjectUtils.equals(getMiddle(), other.getMiddle()))) && (org.apache.commons.lang3.ObjectUtils.equals(getRight(), other.getRight()))));
        } 
        return ((_returnReplacementOperatorHotSpot1887.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot1889.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1889.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1889.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((((getLeft()) == null ? 0 : getLeft().hashCode()) ^ ((getMiddle()) == null ? 0 : getMiddle().hashCode())) ^ ((getRight()) == null ? 0 : getRight().hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot1890.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((((("(" + (getLeft())) + ",") + (getMiddle())) + ",") + (getRight())) + ")"));
    }

    public java.lang.String toString(final java.lang.String format) {
        return ((_returnReplacementOperatorHotSpot1891.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format(format, getLeft(), getMiddle(), getRight())));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1884 = metamutator.Selector.of(1884,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1884");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1885 = metamutator.Selector.of(1885,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1885");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1886 = metamutator.Selector.of(1886,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1886");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1887 = metamutator.Selector.of(1887,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1887");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1888 = metamutator.Selector.of(1888,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1888");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1889 = metamutator.Selector.of(1889,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1889");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1890 = metamutator.Selector.of(1890,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1890");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1891 = metamutator.Selector.of(1891,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Triple.class).id("_returnReplacementOperatorHotSpot1891");
}

