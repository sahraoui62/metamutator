package org.apache.commons.lang3.concurrent;


public class TimedSemaphore {
    public static final int NO_LIMIT = 0;

    private static final int THREAD_POOL_SIZE = 1;

    private final java.util.concurrent.ScheduledExecutorService executorService;

    private final long period;

    private final java.util.concurrent.TimeUnit unit;

    private final boolean ownExecutor;

    private java.util.concurrent.ScheduledFuture<?> task;

    private long totalAcquireCount;

    private long periodCount;

    private int limit;

    private int acquireCount;

    private int lastCallsPerPeriod;

    private boolean shutdown;

    public TimedSemaphore(final long timePeriod ,final java.util.concurrent.TimeUnit timeUnit ,final int limit) {
        this(null, timePeriod, timeUnit, limit);
    }

    public TimedSemaphore(final java.util.concurrent.ScheduledExecutorService service ,final long timePeriod ,final java.util.concurrent.TimeUnit timeUnit ,final int limit) {
        org.apache.commons.lang3.Validate.inclusiveBetween(1, java.lang.Long.MAX_VALUE, timePeriod, "Time period must be greater than 0!");
        period = timePeriod;
        unit = timeUnit;
        if (service != null) {
            executorService = service;
            ownExecutor = false;
        } else {
            final java.util.concurrent.ScheduledThreadPoolExecutor s = new java.util.concurrent.ScheduledThreadPoolExecutor(THREAD_POOL_SIZE);
            s.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            s.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            executorService = s;
            ownExecutor = true;
        }
        setLimit(limit);
    }

    public final synchronized int getLimit() {
        return ((_returnReplacementOperator504.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator504.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator504.is("ZERO")) ? ( 0 ) : (limit));
    }

    public final synchronized void setLimit(final int limit) {
        this.limit = limit;
    }

    public synchronized void shutdown() {
        if (!(shutdown)) {
            if (ownExecutor) {
                getExecutorService().shutdownNow();
            } 
            if ((task) != null) {
                task.cancel(false);
            } 
            shutdown = true;
        } 
    }

    public synchronized boolean isShutdown() {
        return ((_returnReplacementOperator499.is("NULL")) ? ( null ) : (shutdown));
    }

    public synchronized void acquire() throws java.lang.InterruptedException {
        if (isShutdown()) {
            throw new java.lang.IllegalStateException("TimedSemaphore is shut down!");
        } 
        if ((task) == null) {
            task = startTimer();
        } 
        boolean canPass = false;
        do {
            canPass = ((getLimit()) <= (NO_LIMIT)) || ((acquireCount) < (getLimit()));
            if (!canPass) {
                wait();
            } else {
                (acquireCount)++;
            }
        } while (!canPass );
    }

    public synchronized int getLastAcquiresPerPeriod() {
        return ((_returnReplacementOperator503.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator503.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator503.is("ZERO")) ? ( 0 ) : (lastCallsPerPeriod));
    }

    public synchronized int getAcquireCount() {
        return ((_returnReplacementOperator501.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator501.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator501.is("ZERO")) ? ( 0 ) : (acquireCount));
    }

    public synchronized int getAvailablePermits() {
        return ((_returnReplacementOperator502.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator502.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator502.is("ZERO")) ? ( 0 ) : ((getLimit()) - (getAcquireCount())));
    }

    public synchronized double getAverageCallsPerPeriod() {
        return ((_returnReplacementOperator500.is("NULL")) ? ( null ) : ((periodCount) == 0 ? 0 : ((double)(totalAcquireCount)) / ((double)(periodCount))));
    }

    public long getPeriod() {
        return ((_returnReplacementOperator508.is("NULL")) ? ( null ) : (period));
    }

    public java.util.concurrent.TimeUnit getUnit() {
        return ((_returnReplacementOperator507.is("NULL")) ? ( null ) : (unit));
    }

    protected java.util.concurrent.ScheduledExecutorService getExecutorService() {
        return ((_returnReplacementOperator505.is("NULL")) ? ( null ) : (executorService));
    }

    protected java.util.concurrent.ScheduledFuture<?> startTimer() {
        return ((_returnReplacementOperator506.is("NULL")) ? ( null ) : (getExecutorService().scheduleAtFixedRate(new java.lang.Runnable() {
    @java.lang.Override
    public void run() {
        endOfPeriod();
    }
}, getPeriod(), getPeriod(), getUnit())));
    }

    synchronized void endOfPeriod() {
        lastCallsPerPeriod = acquireCount;
        totalAcquireCount += acquireCount;
        (periodCount)++;
        acquireCount = 0;
        notifyAll();
    }

    private static final metamutator.Selector _returnReplacementOperator499 = metamutator.Selector.of(499,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator499");

    private static final metamutator.Selector _returnReplacementOperator500 = metamutator.Selector.of(500,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator500");

    private static final metamutator.Selector _returnReplacementOperator501 = metamutator.Selector.of(501,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator501");

    private static final metamutator.Selector _returnReplacementOperator502 = metamutator.Selector.of(502,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator502");

    private static final metamutator.Selector _returnReplacementOperator503 = metamutator.Selector.of(503,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator503");

    private static final metamutator.Selector _returnReplacementOperator504 = metamutator.Selector.of(504,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator504");

    private static final metamutator.Selector _returnReplacementOperator505 = metamutator.Selector.of(505,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator505");

    private static final metamutator.Selector _returnReplacementOperator506 = metamutator.Selector.of(506,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator506");

    private static final metamutator.Selector _returnReplacementOperator507 = metamutator.Selector.of(507,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator507");

    private static final metamutator.Selector _returnReplacementOperator508 = metamutator.Selector.of(508,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperator508");
}

