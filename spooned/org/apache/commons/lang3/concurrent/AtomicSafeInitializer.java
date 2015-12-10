package org.apache.commons.lang3.concurrent;


public abstract class AtomicSafeInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private final java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>> factory = new java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>>();

    private final java.util.concurrent.atomic.AtomicReference<T> reference = new java.util.concurrent.atomic.AtomicReference<T>();

    @java.lang.Override
    public final T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        T result;
        while ((result = reference.get()) == null) {
            if (factory.compareAndSet(null, this)) {
                reference.set(initialize());
            } 
        }
        return ((_returnReplacementOperator437.is("NULL")) ? ( null ) : (result));
    }

    protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;

    private static final metamutator.Selector _returnReplacementOperator437 = metamutator.Selector.of(437,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.AtomicSafeInitializer.class).id("_returnReplacementOperator437");
}

