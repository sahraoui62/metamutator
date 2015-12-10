package org.apache.commons.lang3.concurrent;


public class CallableBackgroundInitializer<T> extends org.apache.commons.lang3.concurrent.BackgroundInitializer<T> {
    private final java.util.concurrent.Callable<T> callable;

    public CallableBackgroundInitializer(final java.util.concurrent.Callable<T> call) {
        checkCallable(call);
        callable = call;
    }

    public CallableBackgroundInitializer(final java.util.concurrent.Callable<T> call ,final java.util.concurrent.ExecutorService exec) {
        super(exec);
        checkCallable(call);
        callable = call;
    }

    @java.lang.Override
    protected T initialize() throws java.lang.Exception {
        return callable.call();
    }

    private void checkCallable(final java.util.concurrent.Callable<T> call) {
        if (call == null) {
            throw new java.lang.IllegalArgumentException("Callable must not be null!");
        } 
    }
}

