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
            return ((_returnReplacementOperator931.is("NULL")) ? ( null ) : (true));
        } 
        if ((obj instanceof org.apache.commons.lang3.reflect.TypeLiteral) == false) {
            return ((_returnReplacementOperator932.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.reflect.TypeLiteral<?> other = ((org.apache.commons.lang3.reflect.TypeLiteral<?>)(obj));
        return ((_returnReplacementOperator933.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(value, other.value)));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator934.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator934.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator934.is("ZERO")) ? ( 0 ) : ((37 << 4) | (value.hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator935.is("NULL")) ? ( null ) : (toString));
    }

    @java.lang.Override
    public java.lang.reflect.Type getType() {
        return ((_returnReplacementOperator936.is("NULL")) ? ( null ) : (value));
    }

    private static final metamutator.Selector _returnReplacementOperator931 = metamutator.Selector.of(931,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperator931");

    private static final metamutator.Selector _returnReplacementOperator932 = metamutator.Selector.of(932,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperator932");

    private static final metamutator.Selector _returnReplacementOperator933 = metamutator.Selector.of(933,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperator933");

    private static final metamutator.Selector _returnReplacementOperator934 = metamutator.Selector.of(934,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperator934");

    private static final metamutator.Selector _returnReplacementOperator935 = metamutator.Selector.of(935,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperator935");

    private static final metamutator.Selector _returnReplacementOperator936 = metamutator.Selector.of(936,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeLiteral.class).id("_returnReplacementOperator936");
}

