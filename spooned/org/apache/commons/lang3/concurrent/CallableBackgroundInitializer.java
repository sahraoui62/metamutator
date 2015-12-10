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
        return ((_returnReplacementOperator462.is("NULL")) ? ( null ) : (callable.call()));
    }

    private void checkCallable(final java.util.concurrent.Callable<T> call) {
        if (call == null) {
            throw new java.lang.IllegalArgumentException("Callable must not be null!");
        } 
    }

    private static final metamutator.Selector _returnReplacementOperator462 = metamutator.Selector.of(462,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.CallableBackgroundInitializer.class).id("_returnReplacementOperator462");
}

