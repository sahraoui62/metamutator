package org.apache.commons.lang3.concurrent;


public abstract class BackgroundInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private java.util.concurrent.ExecutorService externalExecutor;

    private java.util.concurrent.ExecutorService executor;

    private java.util.concurrent.Future<T> future;

    protected BackgroundInitializer() {
        this(null);
    }

    protected BackgroundInitializer(final java.util.concurrent.ExecutorService exec) {
        setExternalExecutor(exec);
    }

    public final synchronized java.util.concurrent.ExecutorService getExternalExecutor() {
        return ((_returnReplacementOperatorHotSpot448.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (externalExecutor));
    }

    public synchronized boolean isStarted() {
        return ((_returnReplacementOperatorHotSpot441.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((future) != null));
    }

    public final synchronized void setExternalExecutor(final java.util.concurrent.ExecutorService externalExecutor) {
        if (isStarted()) {
            throw new java.lang.IllegalStateException("Cannot set ExecutorService after start()!");
        } 
        this.externalExecutor = externalExecutor;
    }

    public synchronized boolean start() {
        if (!(isStarted())) {
            java.util.concurrent.ExecutorService tempExec;
            executor = getExternalExecutor();
            if ((executor) == null) {
                executor = tempExec = createExecutor();
            } else {
                tempExec = null;
            }
            future = executor.submit(createTask(tempExec));
            return ((_returnReplacementOperatorHotSpot442.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        return ((_returnReplacementOperatorHotSpot443.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    @java.lang.Override
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        try {
            return ((_returnReplacementOperatorHotSpot439.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getFuture().get()));
        } catch (final java.util.concurrent.ExecutionException execex) {
            org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(execex);
            return ((_returnReplacementOperatorHotSpot440.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } catch (final java.lang.InterruptedException iex) {
            java.lang.Thread.currentThread().interrupt();
            throw new org.apache.commons.lang3.concurrent.ConcurrentException(iex);
        }
    }

    public synchronized java.util.concurrent.Future<T> getFuture() {
        if ((future) == null) {
            throw new java.lang.IllegalStateException("start() must be called first!");
        } 
        return ((_returnReplacementOperatorHotSpot449.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (future));
    }

    protected final synchronized java.util.concurrent.ExecutorService getActiveExecutor() {
        return ((_returnReplacementOperatorHotSpot447.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (executor));
    }

    protected int getTaskCount() {
        return ((_returnReplacementOperatorHotSpot444.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot444.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot444.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
    }

    protected abstract T initialize() throws java.lang.Exception;

    private java.util.concurrent.Callable<T> createTask(final java.util.concurrent.ExecutorService execDestroy) {
        return ((_returnReplacementOperatorHotSpot445.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new InitializationTask(execDestroy)));
    }

    private java.util.concurrent.ExecutorService createExecutor() {
        return ((_returnReplacementOperatorHotSpot446.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.concurrent.Executors.newFixedThreadPool(getTaskCount())));
    }

    private class InitializationTask implements java.util.concurrent.Callable<T> {
        private final java.util.concurrent.ExecutorService execFinally;

        public InitializationTask(final java.util.concurrent.ExecutorService exec) {
            execFinally = exec;
        }

        @java.lang.Override
        public T call() throws java.lang.Exception {
            try {
                return ((_returnReplacementOperatorHotSpot438.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (initialize()));
            } finally {
                if ((execFinally) != null) {
                    execFinally.shutdown();
                } 
            }
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot438 = metamutator.Selector.of(438,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot438");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot439 = metamutator.Selector.of(439,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot439");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot440 = metamutator.Selector.of(440,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot440");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot441 = metamutator.Selector.of(441,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot441");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot442 = metamutator.Selector.of(442,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot442");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot443 = metamutator.Selector.of(443,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot443");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot444 = metamutator.Selector.of(444,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot444");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot445 = metamutator.Selector.of(445,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot445");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot446 = metamutator.Selector.of(446,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot446");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot447 = metamutator.Selector.of(447,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot447");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot448 = metamutator.Selector.of(448,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot448");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot449 = metamutator.Selector.of(449,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperatorHotSpot449");
}

