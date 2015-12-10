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
        return limit;
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
        return shutdown;
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
        return lastCallsPerPeriod;
    }

    public synchronized int getAcquireCount() {
        return acquireCount;
    }

    public synchronized int getAvailablePermits() {
        return ((_arithmeticOperatorHotSpot28.is("PLUS")) ? ((getLimit()) + (getAcquireCount())) : (_arithmeticOperatorHotSpot28.is("MINUS")) ? ((getLimit()) - (getAcquireCount())) : (_arithmeticOperatorHotSpot28.is("MUL")) ? ((getLimit()) * (getAcquireCount())) :  ((getLimit()) / (getAcquireCount())));
    }

    public synchronized double getAverageCallsPerPeriod() {
        return (periodCount) == 0 ? 0 : ((_arithmeticOperatorHotSpot27.is("PLUS")) ? (((double)(totalAcquireCount)) + ((double)(periodCount))) : (_arithmeticOperatorHotSpot27.is("MINUS")) ? (((double)(totalAcquireCount)) - ((double)(periodCount))) : (_arithmeticOperatorHotSpot27.is("MUL")) ? (((double)(totalAcquireCount)) * ((double)(periodCount))) :  (((double)(totalAcquireCount)) / ((double)(periodCount))));
    }

    public long getPeriod() {
        return period;
    }

    public java.util.concurrent.TimeUnit getUnit() {
        return unit;
    }

    protected java.util.concurrent.ScheduledExecutorService getExecutorService() {
        return executorService;
    }

    protected java.util.concurrent.ScheduledFuture<?> startTimer() {
        return getExecutorService().scheduleAtFixedRate(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                endOfPeriod();
            }
        }, getPeriod(), getPeriod(), getUnit());
    }

    synchronized void endOfPeriod() {
        lastCallsPerPeriod = acquireCount;
        totalAcquireCount += acquireCount;
        (periodCount)++;
        acquireCount = 0;
        notifyAll();
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot27 = metamutator.Selector.of(27,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_arithmeticOperatorHotSpot27");

    private static final metamutator.Selector _arithmeticOperatorHotSpot28 = metamutator.Selector.of(28,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.concurrent.TimedSemaphore.class).id("_arithmeticOperatorHotSpot28");
}

