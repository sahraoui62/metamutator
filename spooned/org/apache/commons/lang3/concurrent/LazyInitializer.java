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
        return ((_returnReplacementOperatorHotSpot489.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;

    private static final metamutator.Selector _returnReplacementOperatorHotSpot489 = metamutator.Selector.of(489,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.LazyInitializer.class).id("_returnReplacementOperatorHotSpot489");
}

