package org.apache.commons.lang3.concurrent;


public abstract class AtomicInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private final java.util.concurrent.atomic.AtomicReference<T> reference = new java.util.concurrent.atomic.AtomicReference<T>();

    @java.lang.Override
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        T result = reference.get();
        if (result == null) {
            result = initialize();
            if (!(reference.compareAndSet(null, result))) {
                result = reference.get();
            } 
        } 
        return ((_returnReplacementOperator436.is("NULL")) ? ( null ) : (result));
    }

    protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;

    private static final metamutator.Selector _returnReplacementOperator436 = metamutator.Selector.of(436,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.AtomicInitializer.class).id("_returnReplacementOperator436");
}

