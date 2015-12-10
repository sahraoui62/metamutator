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
            return true;
        } 
        if ((obj instanceof org.apache.commons.lang3.reflect.TypeLiteral) == false) {
            return false;
        } 
        final org.apache.commons.lang3.reflect.TypeLiteral<?> other = ((org.apache.commons.lang3.reflect.TypeLiteral<?>)(obj));
        return org.apache.commons.lang3.reflect.TypeUtils.equals(value, other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return (37 << 4) | (value.hashCode());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return toString;
    }

    @java.lang.Override
    public java.lang.reflect.Type getType() {
        return value;
    }
}

