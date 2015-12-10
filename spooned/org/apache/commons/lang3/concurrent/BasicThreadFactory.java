package org.apache.commons.lang3.concurrent;


public class BasicThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicLong threadCounter;

    private final java.util.concurrent.ThreadFactory wrappedFactory;

    private final java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    private final java.lang.String namingPattern;

    private final java.lang.Integer priority;

    private final java.lang.Boolean daemonFlag;

    private BasicThreadFactory(final org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder) {
        if ((builder.wrappedFactory) == null) {
            wrappedFactory = java.util.concurrent.Executors.defaultThreadFactory();
        } else {
            wrappedFactory = builder.wrappedFactory;
        }
        namingPattern = builder.namingPattern;
        priority = builder.priority;
        daemonFlag = builder.daemonFlag;
        uncaughtExceptionHandler = builder.exceptionHandler;
        threadCounter = new java.util.concurrent.atomic.AtomicLong();
    }

    public final java.util.concurrent.ThreadFactory getWrappedFactory() {
        return wrappedFactory;
    }

    public final java.lang.String getNamingPattern() {
        return namingPattern;
    }

    public final java.lang.Boolean getDaemonFlag() {
        return daemonFlag;
    }

    public final java.lang.Integer getPriority() {
        return priority;
    }

    public final java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return uncaughtExceptionHandler;
    }

    public long getThreadCount() {
        return threadCounter.get();
    }

    @java.lang.Override
    public java.lang.Thread newThread(final java.lang.Runnable r) {
        final java.lang.Thread t = getWrappedFactory().newThread(r);
        initializeThread(t);
        return t;
    }

    private void initializeThread(final java.lang.Thread t) {
        if ((getNamingPattern()) != null) {
            final java.lang.Long count = java.lang.Long.valueOf(threadCounter.incrementAndGet());
            t.setName(java.lang.String.format(getNamingPattern(), count));
        } 
        if ((getUncaughtExceptionHandler()) != null) {
            t.setUncaughtExceptionHandler(getUncaughtExceptionHandler());
        } 
        if ((getPriority()) != null) {
            t.setPriority(getPriority().intValue());
        } 
        if ((getDaemonFlag()) != null) {
            t.setDaemon(getDaemonFlag().booleanValue());
        } 
    }

    public static class Builder implements org.apache.commons.lang3.builder.Builder<org.apache.commons.lang3.concurrent.BasicThreadFactory> {
        private java.util.concurrent.ThreadFactory wrappedFactory;

        private java.lang.Thread.UncaughtExceptionHandler exceptionHandler;

        private java.lang.String namingPattern;

        private java.lang.Integer priority;

        private java.lang.Boolean daemonFlag;

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder wrappedFactory(final java.util.concurrent.ThreadFactory factory) {
            if (factory == null) {
                throw new java.lang.NullPointerException("Wrapped ThreadFactory must not be null!");
            } 
            wrappedFactory = factory;
            return this;
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder namingPattern(final java.lang.String pattern) {
            if (pattern == null) {
                throw new java.lang.NullPointerException("Naming pattern must not be null!");
            } 
            namingPattern = pattern;
            return this;
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder daemon(final boolean f) {
            daemonFlag = java.lang.Boolean.valueOf(f);
            return this;
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder priority(final int prio) {
            priority = java.lang.Integer.valueOf(prio);
            return this;
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder uncaughtExceptionHandler(final java.lang.Thread.UncaughtExceptionHandler handler) {
            if (handler == null) {
                throw new java.lang.NullPointerException("Uncaught exception handler must not be null!");
            } 
            exceptionHandler = handler;
            return this;
        }

        public void reset() {
            wrappedFactory = null;
            exceptionHandler = null;
            namingPattern = null;
            priority = null;
            daemonFlag = null;
        }

        @java.lang.Override
        public org.apache.commons.lang3.concurrent.BasicThreadFactory build() {
            final org.apache.commons.lang3.concurrent.BasicThreadFactory factory = new org.apache.commons.lang3.concurrent.BasicThreadFactory(this);
            reset();
            return factory;
        }
    }
}

