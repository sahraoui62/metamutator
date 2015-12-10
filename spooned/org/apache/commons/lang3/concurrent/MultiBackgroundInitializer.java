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
        return ((_returnReplacementOperatorHotSpot497.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot497.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot497.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (result));
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
        return ((_returnReplacementOperatorHotSpot498.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults(inits , results , excepts)));
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
            return ((_returnReplacementOperatorHotSpot495.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (checkName(name)));
        }

        public java.lang.Object getResultObject(final java.lang.String name) {
            checkName(name);
            return ((_returnReplacementOperatorHotSpot492.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (resultObjects.get(name)));
        }

        public boolean isException(final java.lang.String name) {
            checkName(name);
            return ((_returnReplacementOperatorHotSpot490.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (exceptions.containsKey(name)));
        }

        public org.apache.commons.lang3.concurrent.ConcurrentException getException(final java.lang.String name) {
            checkName(name);
            return ((_returnReplacementOperatorHotSpot496.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (exceptions.get(name)));
        }

        public java.util.Set<java.lang.String> initializerNames() {
            return ((_returnReplacementOperatorHotSpot493.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Collections.unmodifiableSet(initializers.keySet())));
        }

        public boolean isSuccessful() {
            return ((_returnReplacementOperatorHotSpot491.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (exceptions.isEmpty()));
        }

        private org.apache.commons.lang3.concurrent.BackgroundInitializer<?> checkName(final java.lang.String name) {
            final org.apache.commons.lang3.concurrent.BackgroundInitializer<?> init = initializers.get(name);
            if (init == null) {
                throw new java.util.NoSuchElementException(("No child initializer with name " + name));
            } 
            return ((_returnReplacementOperatorHotSpot494.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (init));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot490 = metamutator.Selector.of(490,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot490");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot491 = metamutator.Selector.of(491,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot491");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot492 = metamutator.Selector.of(492,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot492");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot493 = metamutator.Selector.of(493,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot493");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot494 = metamutator.Selector.of(494,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot494");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot495 = metamutator.Selector.of(495,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot495");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot496 = metamutator.Selector.of(496,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot496");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot497 = metamutator.Selector.of(497,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.class).id("_returnReplacementOperatorHotSpot497");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot498 = metamutator.Selector.of(498,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.class).id("_returnReplacementOperatorHotSpot498");
}

