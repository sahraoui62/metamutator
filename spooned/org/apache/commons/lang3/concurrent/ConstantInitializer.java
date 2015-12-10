package org.apache.commons.lang3.concurrent;


public class ConstantInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private static final java.lang.String FMT_TO_STRING = "ConstantInitializer@%d [ object = %s ]";

    private final T object;

    public ConstantInitializer(final T obj) {
        object = obj;
    }

    public final T getObject() {
        return ((_returnReplacementOperator483.is("NULL")) ? ( null ) : (object));
    }

    @java.lang.Override
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        return ((_returnReplacementOperator482.is("NULL")) ? ( null ) : (getObject()));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator487.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator487.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator487.is("ZERO")) ? ( 0 ) : ((getObject()) != null ? getObject().hashCode() : 0));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((this) == obj) {
            return ((_returnReplacementOperator484.is("NULL")) ? ( null ) : (true));
        } 
        if (!(obj instanceof org.apache.commons.lang3.concurrent.ConstantInitializer<?>)) {
            return ((_returnReplacementOperator485.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.concurrent.ConstantInitializer<?> c = ((org.apache.commons.lang3.concurrent.ConstantInitializer<?>)(obj));
        return ((_returnReplacementOperator486.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ObjectUtils.equals(getObject(), c.getObject())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator488.is("NULL")) ? ( null ) : (java.lang.String.format(org.apache.commons.lang3.concurrent.ConstantInitializer.FMT_TO_STRING, java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)), java.lang.String.valueOf(getObject()))));
    }

    private static final metamutator.Selector _returnReplacementOperator482 = metamutator.Selector.of(482,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperator482");

    private static final metamutator.Selector _returnReplacementOperator483 = metamutator.Selector.of(483,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperator483");

    private static final metamutator.Selector _returnReplacementOperator484 = metamutator.Selector.of(484,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperator484");

    private static final metamutator.Selector _returnReplacementOperator485 = metamutator.Selector.of(485,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperator485");

    private static final metamutator.Selector _returnReplacementOperator486 = metamutator.Selector.of(486,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperator486");

    private static final metamutator.Selector _returnReplacementOperator487 = metamutator.Selector.of(487,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperator487");

    private static final metamutator.Selector _returnReplacementOperator488 = metamutator.Selector.of(488,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperator488");
}

