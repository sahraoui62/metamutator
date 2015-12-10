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
        return ((_returnReplacementOperator460.is("NULL")) ? ( null ) : (wrappedFactory));
    }

    public final java.lang.String getNamingPattern() {
        return ((_returnReplacementOperator457.is("NULL")) ? ( null ) : (namingPattern));
    }

    public final java.lang.Boolean getDaemonFlag() {
        return daemonFlag;
    }

    public final java.lang.Integer getPriority() {
        return ((_returnReplacementOperator456.is("NULL")) ? ( null ) : (priority));
    }

    public final java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return ((_returnReplacementOperator459.is("NULL")) ? ( null ) : (uncaughtExceptionHandler));
    }

    public long getThreadCount() {
        return ((_returnReplacementOperator461.is("NULL")) ? ( null ) : (threadCounter.get()));
    }

    @java.lang.Override
    public java.lang.Thread newThread(final java.lang.Runnable r) {
        final java.lang.Thread t = getWrappedFactory().newThread(r);
        initializeThread(t);
        return ((_returnReplacementOperator458.is("NULL")) ? ( null ) : (t));
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
            return ((_returnReplacementOperator455.is("NULL")) ? ( null ) : (this));
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder namingPattern(final java.lang.String pattern) {
            if (pattern == null) {
                throw new java.lang.NullPointerException("Naming pattern must not be null!");
            } 
            namingPattern = pattern;
            return ((_returnReplacementOperator452.is("NULL")) ? ( null ) : (this));
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder daemon(final boolean f) {
            daemonFlag = java.lang.Boolean.valueOf(f);
            return ((_returnReplacementOperator451.is("NULL")) ? ( null ) : (this));
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder priority(final int prio) {
            priority = java.lang.Integer.valueOf(prio);
            return ((_returnReplacementOperator453.is("NULL")) ? ( null ) : (this));
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder uncaughtExceptionHandler(final java.lang.Thread.UncaughtExceptionHandler handler) {
            if (handler == null) {
                throw new java.lang.NullPointerException("Uncaught exception handler must not be null!");
            } 
            exceptionHandler = handler;
            return ((_returnReplacementOperator454.is("NULL")) ? ( null ) : (this));
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
            return ((_returnReplacementOperator450.is("NULL")) ? ( null ) : (factory));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator450 = metamutator.Selector.of(450,new String[]{"INIT","NULL"}).id("_returnReplacementOperator450");

    private static final metamutator.Selector _returnReplacementOperator451 = metamutator.Selector.of(451,new String[]{"INIT","NULL"}).id("_returnReplacementOperator451");

    private static final metamutator.Selector _returnReplacementOperator452 = metamutator.Selector.of(452,new String[]{"INIT","NULL"}).id("_returnReplacementOperator452");

    private static final metamutator.Selector _returnReplacementOperator453 = metamutator.Selector.of(453,new String[]{"INIT","NULL"}).id("_returnReplacementOperator453");

    private static final metamutator.Selector _returnReplacementOperator454 = metamutator.Selector.of(454,new String[]{"INIT","NULL"}).id("_returnReplacementOperator454");

    private static final metamutator.Selector _returnReplacementOperator455 = metamutator.Selector.of(455,new String[]{"INIT","NULL"}).id("_returnReplacementOperator455");

    private static final metamutator.Selector _returnReplacementOperator456 = metamutator.Selector.of(456,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BasicThreadFactory.class).id("_returnReplacementOperator456");

    private static final metamutator.Selector _returnReplacementOperator457 = metamutator.Selector.of(457,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BasicThreadFactory.class).id("_returnReplacementOperator457");

    private static final metamutator.Selector _returnReplacementOperator458 = metamutator.Selector.of(458,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BasicThreadFactory.class).id("_returnReplacementOperator458");

    private static final metamutator.Selector _returnReplacementOperator459 = metamutator.Selector.of(459,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BasicThreadFactory.class).id("_returnReplacementOperator459");

    private static final metamutator.Selector _returnReplacementOperator460 = metamutator.Selector.of(460,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BasicThreadFactory.class).id("_returnReplacementOperator460");

    private static final metamutator.Selector _returnReplacementOperator461 = metamutator.Selector.of(461,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.BasicThreadFactory.class).id("_returnReplacementOperator461");
}

