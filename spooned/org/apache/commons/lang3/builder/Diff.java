package org.apache.commons.lang3.builder;


public abstract class Diff<T> extends org.apache.commons.lang3.tuple.Pair<T, T> {
    private static final long serialVersionUID = 1L;

    private final java.lang.reflect.Type type;

    private final java.lang.String fieldName;

    protected Diff(final java.lang.String fieldName) {
        this.type = org.apache.commons.lang3.ObjectUtils.defaultIfNull(org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(getClass(), org.apache.commons.lang3.builder.Diff.class).get(org.apache.commons.lang3.builder.Diff.class.getTypeParameters()[0]), java.lang.Object.class);
        this.fieldName = fieldName;
    }

    public final java.lang.reflect.Type getType() {
        return type;
    }

    public final java.lang.String getFieldName() {
        return fieldName;
    }

    @java.lang.Override
    public final java.lang.String toString() {
        return java.lang.String.format("[%s: %s, %s]", fieldName, getLeft(), getRight());
    }

    @java.lang.Override
    public final T setValue(final T value) {
        throw new java.lang.UnsupportedOperationException("Cannot alter Diff object.");
    }
}

