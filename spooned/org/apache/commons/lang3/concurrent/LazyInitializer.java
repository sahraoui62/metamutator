package org.apache.commons.lang3.concurrent;


public abstract class LazyInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private volatile T object;

    @java.lang.Override
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        T result = object;
        if (result == null) {
            synchronized(this) {
                result = object;
                if (result == null) {
                    object = result = initialize();
                } 
            }
        } 
        return result;
    }

    protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;
}

