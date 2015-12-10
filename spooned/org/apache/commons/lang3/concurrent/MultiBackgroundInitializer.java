package org.apache.commons.lang3.concurrent;


public class MultiBackgroundInitializer extends org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> {
    private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> childInitializers = new java.util.HashMap<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>>();

    public MultiBackgroundInitializer() {
        super();
    }

    public MultiBackgroundInitializer(final java.util.concurrent.ExecutorService exec) {
        super(exec);
    }

    public void addInitializer(final java.lang.String name, final org.apache.commons.lang3.concurrent.BackgroundInitializer<?> init) {
        if (name == null) {
            throw new java.lang.IllegalArgumentException("Name of child initializer must not be null!");
        } 
        if (init == null) {
            throw new java.lang.IllegalArgumentException("Child initializer must not be null!");
        } 
        synchronized(this) {
            if (isStarted()) {
                throw new java.lang.IllegalStateException("addInitializer() must not be called after start()!");
            } 
            childInitializers.put(name, init);
        }
    }

    @java.lang.Override
    protected int getTaskCount() {
        int result = 1;
        for (final org.apache.commons.lang3.concurrent.BackgroundInitializer<?> bi : childInitializers.values()) {
            result += bi.getTaskCount();
        }
        return ((_returnReplacementOperator497.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator497.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator497.is("ZERO")) ? ( 0 ) : (result));
    }

    @java.lang.Override
    protected org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults initialize() throws java.lang.Exception {
        java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> inits;
        synchronized(this) {
            inits = new java.util.HashMap<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>>(childInitializers);
        }
        final java.util.concurrent.ExecutorService exec = getActiveExecutor();
        for (final org.apache.commons.lang3.concurrent.BackgroundInitializer<?> bi : inits.values()) {
            if ((bi.getExternalExecutor()) == null) {
                bi.setExternalExecutor(exec);
            } 
            bi.start();
        }
        final java.util.Map<java.lang.String, java.lang.Object> results = new java.util.HashMap<java.lang.String, java.lang.Object>();
        final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> excepts = new java.util.HashMap<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException>();
        for (final java.util.Map.Entry<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> e : inits.entrySet()) {
            try {
                results.put(e.getKey(), e.getValue().get());
            } catch (final org.apache.commons.lang3.concurrent.ConcurrentException cex) {
                excepts.put(e.getKey(), cex);
            }
        }
        return ((_returnReplacementOperator498.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults(inits , results , excepts)));
    }

    public static class MultiBackgroundInitializerResults {
        private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> initializers;

        private final java.util.Map<java.lang.String, java.lang.Object> resultObjects;

        private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> exceptions;

        private MultiBackgroundInitializerResults(final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> inits ,final java.util.Map<java.lang.String, java.lang.Object> results ,final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> excepts) {
            initializers = inits;
            resultObjects = results;
            exceptions = excepts;
        }

        public org.apache.commons.lang3.concurrent.BackgroundInitializer<?> getInitializer(final java.lang.String name) {
            return ((_returnReplacementOperator495.is("NULL")) ? ( null ) : (checkName(name)));
        }

        public java.lang.Object getResultObject(final java.lang.String name) {
            checkName(name);
            return ((_returnReplacementOperator492.is("NULL")) ? ( null ) : (resultObjects.get(name)));
        }

        public boolean isException(final java.lang.String name) {
            checkName(name);
            return ((_returnReplacementOperator490.is("NULL")) ? ( null ) : (exceptions.containsKey(name)));
        }

        public org.apache.commons.lang3.concurrent.ConcurrentException getException(final java.lang.String name) {
            checkName(name);
            return ((_returnReplacementOperator496.is("NULL")) ? ( null ) : (exceptions.get(name)));
        }

        public java.util.Set<java.lang.String> initializerNames() {
            return ((_returnReplacementOperator493.is("NULL")) ? ( null ) : (java.util.Collections.unmodifiableSet(initializers.keySet())));
        }

        public boolean isSuccessful() {
            return ((_returnReplacementOperator491.is("NULL")) ? ( null ) : (exceptions.isEmpty()));
        }

        private org.apache.commons.lang3.concurrent.BackgroundInitializer<?> checkName(final java.lang.String name) {
            final org.apache.commons.lang3.concurrent.BackgroundInitializer<?> init = initializers.get(name);
            if (init == null) {
                throw new java.util.NoSuchElementException(("No child initializer with name " + name));
            } 
            return ((_returnReplacementOperator494.is("NULL")) ? ( null ) : (init));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator490 = metamutator.Selector.of(490,new String[]{"INIT","NULL"}).id("_returnReplacementOperator490");

    private static final metamutator.Selector _returnReplacementOperator491 = metamutator.Selector.of(491,new String[]{"INIT","NULL"}).id("_returnReplacementOperator491");

    private static final metamutator.Selector _returnReplacementOperator492 = metamutator.Selector.of(492,new String[]{"INIT","NULL"}).id("_returnReplacementOperator492");

    private static final metamutator.Selector _returnReplacementOperator493 = metamutator.Selector.of(493,new String[]{"INIT","NULL"}).id("_returnReplacementOperator493");

    private static final metamutator.Selector _returnReplacementOperator494 = metamutator.Selector.of(494,new String[]{"INIT","NULL"}).id("_returnReplacementOperator494");

    private static final metamutator.Selector _returnReplacementOperator495 = metamutator.Selector.of(495,new String[]{"INIT","NULL"}).id("_returnReplacementOperator495");

    private static final metamutator.Selector _returnReplacementOperator496 = metamutator.Selector.of(496,new String[]{"INIT","NULL"}).id("_returnReplacementOperator496");

    private static final metamutator.Selector _returnReplacementOperator497 = metamutator.Selector.of(497,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.class).id("_returnReplacementOperator497");

    private static final metamutator.Selector _returnReplacementOperator498 = metamutator.Selector.of(498,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.class).id("_returnReplacementOperator498");
}

