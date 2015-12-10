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
        return ((_returnReplacementOperator448.is("NULL")) ? ( null ) : (externalExecutor));
    }

    public synchronized boolean isStarted() {
        return ((_returnReplacementOperator441.is("NULL")) ? ( null ) : ((future) != null));
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
            return ((_returnReplacementOperator442.is("NULL")) ? ( null ) : (true));
        } 
        return ((_returnReplacementOperator443.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        try {
            return ((_returnReplacementOperator439.is("NULL")) ? ( null ) : (getFuture().get()));
        } catch (final java.util.concurrent.ExecutionException execex) {
            org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(execex);
            return ((_returnReplacementOperator440.is("NULL")) ? ( null ) : (null));
        } catch (final java.lang.InterruptedException iex) {
            java.lang.Thread.currentThread().interrupt();
            throw new org.apache.commons.lang3.concurrent.ConcurrentException(iex);
        }
    }

    public synchronized java.util.concurrent.Future<T> getFuture() {
        if ((future) == null) {
            throw new java.lang.IllegalStateException("start() must be called first!");
        } 
        return ((_returnReplacementOperator449.is("NULL")) ? ( null ) : (future));
    }

    protected final synchronized java.util.concurrent.ExecutorService getActiveExecutor() {
        return ((_returnReplacementOperator447.is("NULL")) ? ( null ) : (executor));
    }

    protected int getTaskCount() {
        return ((_returnReplacementOperator444.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator444.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator444.is("ZERO")) ? ( 0 ) : (1));
    }

    protected abstract T initialize() throws java.lang.Exception;

    private java.util.concurrent.Callable<T> createTask(final java.util.concurrent.ExecutorService execDestroy) {
        return ((_returnReplacementOperator445.is("NULL")) ? ( null ) : (new InitializationTask(execDestroy)));
    }

    private java.util.concurrent.ExecutorService createExecutor() {
        return ((_returnReplacementOperator446.is("NULL")) ? ( null ) : (java.util.concurrent.Executors.newFixedThreadPool(getTaskCount())));
    }

    private class InitializationTask implements java.util.concurrent.Callable<T> {
        private final java.util.concurrent.ExecutorService execFinally;

        public InitializationTask(final java.util.concurrent.ExecutorService exec) {
            execFinally = exec;
        }

        @java.lang.Override
        public T call() throws java.lang.Exception {
            try {
                return ((_returnReplacementOperator438.is("NULL")) ? ( null ) : (initialize()));
            } finally {
                if ((execFinally) != null) {
                    execFinally.shutdown();
                } 
            }
        }
    }

    private static final metamutator.Selector _returnReplacementOperator438 = metamutator.Selector.of(438,new String[]{"INIT","NULL"}).id("_returnReplacementOperator438");

    private static final metamutator.Selector _returnReplacementOperator439 = metamutator.Selector.of(439,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator439");

    private static final metamutator.Selector _returnReplacementOperator440 = metamutator.Selector.of(440,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator440");

    private static final metamutator.Selector _returnReplacementOperator441 = metamutator.Selector.of(441,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator441");

    private static final metamutator.Selector _returnReplacementOperator442 = metamutator.Selector.of(442,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator442");

    private static final metamutator.Selector _returnReplacementOperator443 = metamutator.Selector.of(443,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator443");

    private static final metamutator.Selector _returnReplacementOperator444 = metamutator.Selector.of(444,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator444");

    private static final metamutator.Selector _returnReplacementOperator445 = metamutator.Selector.of(445,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator445");

    private static final metamutator.Selector _returnReplacementOperator446 = metamutator.Selector.of(446,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator446");

    private static final metamutator.Selector _returnReplacementOperator447 = metamutator.Selector.of(447,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator447");

    private static final metamutator.Selector _returnReplacementOperator448 = metamutator.Selector.of(448,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator448");

    private static final metamutator.Selector _returnReplacementOperator449 = metamutator.Selector.of(449,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BackgroundInitializer.class).id("_returnReplacementOperator449");
}

