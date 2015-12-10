package org.apache.commons.lang3.concurrent;


public class ConstantInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private static final java.lang.String FMT_TO_STRING = "ConstantInitializer@%d [ object = %s ]";

    private final T object;

    public ConstantInitializer(final T obj) {
        object = obj;
    }

    public final T getObject() {
        return object;
    }

    @java.lang.Override
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        return getObject();
    }

    @java.lang.Override
    public int hashCode() {
        return (getObject()) != null ? getObject().hashCode() : 0;
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((this) == obj) {
            return true;
        } 
        if (!(obj instanceof org.apache.commons.lang3.concurrent.ConstantInitializer<?>)) {
            return false;
        } 
        final org.apache.commons.lang3.concurrent.ConstantInitializer<?> c = ((org.apache.commons.lang3.concurrent.ConstantInitializer<?>)(obj));
        return org.apache.commons.lang3.ObjectUtils.equals(getObject(), c.getObject());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return java.lang.String.format(FMT_TO_STRING, java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)), java.lang.String.valueOf(getObject()));
    }
}

