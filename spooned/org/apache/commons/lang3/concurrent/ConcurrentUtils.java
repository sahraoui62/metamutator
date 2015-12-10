package org.apache.commons.lang3.concurrent;


public class ConcurrentUtils {
    private ConcurrentUtils() {
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(final java.util.concurrent.ExecutionException ex) {
        if ((ex == null) || ((ex.getCause()) == null)) {
            return ((_returnReplacementOperatorHotSpot478.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(ex);
        return ((_returnReplacementOperatorHotSpot479.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.concurrent.ConcurrentException(ex.getMessage() , ex.getCause())));
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException extractCauseUnchecked(final java.util.concurrent.ExecutionException ex) {
        if ((ex == null) || ((ex.getCause()) == null)) {
            return ((_returnReplacementOperatorHotSpot480.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(ex);
        return ((_returnReplacementOperatorHotSpot481.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(ex.getMessage() , ex.getCause())));
    }

    public static void handleCause(final java.util.concurrent.ExecutionException ex) throws org.apache.commons.lang3.concurrent.ConcurrentException {
        final org.apache.commons.lang3.concurrent.ConcurrentException cex = org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(ex);
        if (cex != null) {
            throw cex;
        } 
    }

    public static void handleCauseUnchecked(final java.util.concurrent.ExecutionException ex) {
        final org.apache.commons.lang3.concurrent.ConcurrentRuntimeException crex = org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(ex);
        if (crex != null) {
            throw crex;
        } 
    }

    static java.lang.Throwable checkedException(final java.lang.Throwable ex) {
        org.apache.commons.lang3.Validate.isTrue((((ex != null) && (!(ex instanceof java.lang.RuntimeException))) && (!(ex instanceof java.lang.Error))), ("Not a checked exception: " + ex));
        return ((_returnReplacementOperatorHotSpot477.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ex));
    }

    private static void throwCause(final java.util.concurrent.ExecutionException ex) {
        if ((ex.getCause()) instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException)(ex.getCause()));
        } 
        if ((ex.getCause()) instanceof java.lang.Error) {
            throw ((java.lang.Error)(ex.getCause()));
        } 
    }

    public static <T>T initialize(final org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> initializer) throws org.apache.commons.lang3.concurrent.ConcurrentException {
        return ((_returnReplacementOperatorHotSpot474.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (initializer != null ? initializer.get() : null));
    }

    public static <T>T initializeUnchecked(final org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> initializer) {
        try {
            return ((_returnReplacementOperatorHotSpot475.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.concurrent.ConcurrentUtils.initialize(initializer)));
        } catch (final org.apache.commons.lang3.concurrent.ConcurrentException cex) {
            throw new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(cex.getCause());
        }
    }

    public static <K, V>V putIfAbsent(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final V value) {
        if (map == null) {
            return ((_returnReplacementOperatorHotSpot472.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final V result = map.putIfAbsent(key, value);
        return ((_returnReplacementOperatorHotSpot473.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result != null ? result : value));
    }

    public static <K, V>V createIfAbsent(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> init) throws org.apache.commons.lang3.concurrent.ConcurrentException {
        if ((map == null) || (init == null)) {
            return ((_returnReplacementOperatorHotSpot468.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final V value = map.get(key);
        if (value == null) {
            return ((_returnReplacementOperatorHotSpot469.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(map, key, init.get())));
        } 
        return ((_returnReplacementOperatorHotSpot470.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    public static <K, V>V createIfAbsentUnchecked(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> init) {
        try {
            return ((_returnReplacementOperatorHotSpot471.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(map, key, init)));
        } catch (final org.apache.commons.lang3.concurrent.ConcurrentException cex) {
            throw new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(cex.getCause());
        }
    }

    public static <T>java.util.concurrent.Future<T> constantFuture(final T value) {
        return ((_returnReplacementOperatorHotSpot476.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture<T>(value)));
    }

    static final class ConstantFuture<T> implements java.util.concurrent.Future<T> {
        private final T value;

        ConstantFuture(final T value) {
            this.value = value;
        }

        @java.lang.Override
        public boolean isDone() {
            return ((_returnReplacementOperatorHotSpot467.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        }

        @java.lang.Override
        public T get() {
            return ((_returnReplacementOperatorHotSpot463.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
        }

        @java.lang.Override
        public T get(final long timeout, final java.util.concurrent.TimeUnit unit) {
            return ((_returnReplacementOperatorHotSpot464.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
        }

        @java.lang.Override
        public boolean isCancelled() {
            return ((_returnReplacementOperatorHotSpot466.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }

        @java.lang.Override
        public boolean cancel(final boolean mayInterruptIfRunning) {
            return ((_returnReplacementOperatorHotSpot465.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot463 = metamutator.Selector.of(463,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot463");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot464 = metamutator.Selector.of(464,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot464");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot465 = metamutator.Selector.of(465,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot465");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot466 = metamutator.Selector.of(466,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot466");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot467 = metamutator.Selector.of(467,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot467");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot468 = metamutator.Selector.of(468,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot468");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot469 = metamutator.Selector.of(469,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot469");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot470 = metamutator.Selector.of(470,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot470");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot471 = metamutator.Selector.of(471,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot471");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot472 = metamutator.Selector.of(472,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot472");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot473 = metamutator.Selector.of(473,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot473");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot474 = metamutator.Selector.of(474,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot474");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot475 = metamutator.Selector.of(475,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot475");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot476 = metamutator.Selector.of(476,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot476");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot477 = metamutator.Selector.of(477,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot477");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot478 = metamutator.Selector.of(478,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot478");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot479 = metamutator.Selector.of(479,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot479");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot480 = metamutator.Selector.of(480,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot480");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot481 = metamutator.Selector.of(481,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperatorHotSpot481");
}

