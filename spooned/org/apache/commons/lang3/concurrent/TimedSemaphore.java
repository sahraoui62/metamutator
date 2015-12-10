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
        return ((_returnReplacementOperatorHotSpot504.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot504.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot504.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (limit));
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
        return ((_returnReplacementOperatorHotSpot499.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (shutdown));
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
        return ((_returnReplacementOperatorHotSpot503.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot503.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot503.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (lastCallsPerPeriod));
    }

    public synchronized int getAcquireCount() {
        return ((_returnReplacementOperatorHotSpot501.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot501.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot501.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (acquireCount));
    }

    public synchronized int getAvailablePermits() {
        return ((_returnReplacementOperatorHotSpot502.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot502.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot502.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((getLimit()) - (getAcquireCount())));
    }

    public synchronized double getAverageCallsPerPeriod() {
        return ((_returnReplacementOperatorHotSpot500.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((periodCount) == 0 ? 0 : ((double)(totalAcquireCount)) / ((double)(periodCount))));
    }

    public long getPeriod() {
        return ((_returnReplacementOperatorHotSpot508.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (period));
    }

    public java.util.concurrent.TimeUnit getUnit() {
        return ((_returnReplacementOperatorHotSpot507.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (unit));
    }

    protected java.util.concurrent.ScheduledExecutorService getExecutorService() {
        return ((_returnReplacementOperatorHotSpot505.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (executorService));
    }

    protected java.util.concurrent.ScheduledFuture<?> startTimer() {
        return ((_returnReplacementOperatorHotSpot506.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getExecutorService().scheduleAtFixedRate(new java.lang.Runnable() {
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

    private static final metamutator.Selector _returnReplacementOperatorHotSpot499 = metamutator.Selector.of(499,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot499");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot500 = metamutator.Selector.of(500,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot500");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot501 = metamutator.Selector.of(501,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot501");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot502 = metamutator.Selector.of(502,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot502");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot503 = metamutator.Selector.of(503,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot503");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot504 = metamutator.Selector.of(504,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot504");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot505 = metamutator.Selector.of(505,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot505");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot506 = metamutator.Selector.of(506,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot506");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot507 = metamutator.Selector.of(507,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot507");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot508 = metamutator.Selector.of(508,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_returnReplacementOperatorHotSpot508");
}

