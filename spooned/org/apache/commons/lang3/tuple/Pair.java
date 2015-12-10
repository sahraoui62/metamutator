package org.apache.commons.lang3.tuple;


public abstract class Pair<L, R> implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.tuple.Pair<L, R>> , java.util.Map.Entry<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    public static <L, R>org.apache.commons.lang3.tuple.Pair<L, R> of(final L left, final R right) {
        return ((_returnReplacementOperatorHotSpot1874.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutablePair<L, R>(left , right)));
    }

    public abstract L getLeft();

    public abstract R getRight();

    @java.lang.Override
    public final L getKey() {
        return ((_returnReplacementOperatorHotSpot1875.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getLeft()));
    }

    @java.lang.Override
    public R getValue() {
        return ((_returnReplacementOperatorHotSpot1876.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getRight()));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.tuple.Pair<L, R> other) {
        return ((_returnReplacementOperatorHotSpot1880.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1880.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1880.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (new org.apache.commons.lang3.builder.CompareToBuilder().append(getLeft(), other.getLeft()).append(getRight(), other.getRight()).toComparison()));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperatorHotSpot1877.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (obj instanceof java.util.Map.Entry<?, ?>) {
            final java.util.Map.Entry<?, ?> other = ((java.util.Map.Entry<?, ?>)(obj));
            return ((_returnReplacementOperatorHotSpot1878.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ObjectUtils.equals(getKey(), other.getKey())) && (org.apache.commons.lang3.ObjectUtils.equals(getValue(), other.getValue()))));
        } 
        return ((_returnReplacementOperatorHotSpot1879.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot1881.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1881.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1881.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (((getKey()) == null ? 0 : getKey().hashCode()) ^ ((getValue()) == null ? 0 : getValue().hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot1882.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.StringBuilder().append('(').append(getLeft()).append(',').append(getRight()).append(')').toString()));
    }

    public java.lang.String toString(final java.lang.String format) {
        return ((_returnReplacementOperatorHotSpot1883.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format(format, getLeft(), getRight())));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1874 = metamutator.Selector.of(1874,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1874");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1875 = metamutator.Selector.of(1875,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1875");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1876 = metamutator.Selector.of(1876,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1876");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1877 = metamutator.Selector.of(1877,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1877");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1878 = metamutator.Selector.of(1878,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1878");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1879 = metamutator.Selector.of(1879,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1879");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1880 = metamutator.Selector.of(1880,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1880");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1881 = metamutator.Selector.of(1881,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1881");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1882 = metamutator.Selector.of(1882,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1882");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1883 = metamutator.Selector.of(1883,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.Pair.class).id("_returnReplacementOperatorHotSpot1883");
}

