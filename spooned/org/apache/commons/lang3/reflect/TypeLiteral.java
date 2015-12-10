package org.apache.commons.lang3.reflect;


public abstract class TypeLiteral<T> implements org.apache.commons.lang3.reflect.Typed<T> {
    @java.lang.SuppressWarnings(value = "rawtypes")
    private static final java.lang.reflect.TypeVariable<java.lang.Class<org.apache.commons.lang3.reflect.TypeLiteral>> T = org.apache.commons.lang3.reflect.TypeLiteral.class.getTypeParameters()[0];

    public final java.lang.reflect.Type value;

    private final java.lang.String toString;

    protected TypeLiteral() {
        this.value = org.apache.commons.lang3.Validate.notNull(org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(getClass(), org.apache.commons.lang3.reflect.TypeLiteral.class).get(T), "%s does not assign type parameter %s", getClass(), org.apache.commons.lang3.reflect.TypeUtils.toLongString(T));
        this.toString = java.lang.String.format("%s<%s>", org.apache.commons.lang3.reflect.TypeLiteral.class.getSimpleName(), org.apache.commons.lang3.reflect.TypeUtils.toString(value));
    }

    @java.lang.Override
    public final boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperatorHotSpot931.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((obj instanceof org.apache.commons.lang3.reflect.TypeLiteral) == false) {
            return ((_returnReplacementOperatorHotSpot932.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.reflect.TypeLiteral<?> other = ((org.apache.commons.lang3.reflect.TypeLiteral<?>)(obj));
        return ((_returnReplacementOperatorHotSpot933.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(value, other.value)));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot934.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot934.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot934.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((37 << 4) | (value.hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot935.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toString));
    }

    @java.lang.Override
    public java.lang.reflect.Type getType() {
        return ((_returnReplacementOperatorHotSpot936.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot931 = metamutator.Selector.of(931,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperatorHotSpot931");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot932 = metamutator.Selector.of(932,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperatorHotSpot932");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot933 = metamutator.Selector.of(933,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperatorHotSpot933");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot934 = metamutator.Selector.of(934,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperatorHotSpot934");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot935 = metamutator.Selector.of(935,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperatorHotSpot935");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot936 = metamutator.Selector.of(936,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperatorHotSpot936");
}

