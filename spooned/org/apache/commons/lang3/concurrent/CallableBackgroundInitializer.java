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
        return ((_returnReplacementOperatorHotSpot462.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (callable.call()));
    }

    private void checkCallable(final java.util.concurrent.Callable<T> call) {
        if (call == null) {
            throw new java.lang.IllegalArgumentException("Callable must not be null!");
        } 
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot462 = metamutator.Selector.of(462,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.CallableBackgroundInitializer.class).id("_returnReplacementOperatorHotSpot462");
}

