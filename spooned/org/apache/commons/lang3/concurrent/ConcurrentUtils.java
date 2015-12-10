package org.apache.commons.lang3.concurrent;


public class ConcurrentUtils {
    private ConcurrentUtils() {
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(final java.util.concurrent.ExecutionException ex) {
        if ((ex == null) || ((ex.getCause()) == null)) {
            return ((_returnReplacementOperator478.is("NULL")) ? ( null ) : (null));
        } 
        org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(ex);
        return ((_returnReplacementOperator479.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.concurrent.ConcurrentException(ex.getMessage() , ex.getCause())));
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException extractCauseUnchecked(final java.util.concurrent.ExecutionException ex) {
        if ((ex == null) || ((ex.getCause()) == null)) {
            return ((_returnReplacementOperator480.is("NULL")) ? ( null ) : (null));
        } 
        org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(ex);
        return ((_returnReplacementOperator481.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(ex.getMessage() , ex.getCause())));
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
        return ((_returnReplacementOperator477.is("NULL")) ? ( null ) : (ex));
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
        return ((_returnReplacementOperator474.is("NULL")) ? ( null ) : (initializer != null ? initializer.get() : null));
    }

    public static <T>T initializeUnchecked(final org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> initializer) {
        try {
            return ((_returnReplacementOperator475.is("NULL")) ? ( null ) : (org.apache.commons.lang3.concurrent.ConcurrentUtils.initialize(initializer)));
        } catch (final org.apache.commons.lang3.concurrent.ConcurrentException cex) {
            throw new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(cex.getCause());
        }
    }

    public static <K, V>V putIfAbsent(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final V value) {
        if (map == null) {
            return ((_returnReplacementOperator472.is("NULL")) ? ( null ) : (null));
        } 
        final V result = map.putIfAbsent(key, value);
        return ((_returnReplacementOperator473.is("NULL")) ? ( null ) : (result != null ? result : value));
    }

    public static <K, V>V createIfAbsent(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> init) throws org.apache.commons.lang3.concurrent.ConcurrentException {
        if ((map == null) || (init == null)) {
            return ((_returnReplacementOperator468.is("NULL")) ? ( null ) : (null));
        } 
        final V value = map.get(key);
        if (value == null) {
            return ((_returnReplacementOperator469.is("NULL")) ? ( null ) : (org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(map, key, init.get())));
        } 
        return ((_returnReplacementOperator470.is("NULL")) ? ( null ) : (value));
    }

    public static <K, V>V createIfAbsentUnchecked(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> init) {
        try {
            return ((_returnReplacementOperator471.is("NULL")) ? ( null ) : (org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(map, key, init)));
        } catch (final org.apache.commons.lang3.concurrent.ConcurrentException cex) {
            throw new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(cex.getCause());
        }
    }

    public static <T>java.util.concurrent.Future<T> constantFuture(final T value) {
        return ((_returnReplacementOperator476.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture<T>(value)));
    }

    static final class ConstantFuture<T> implements java.util.concurrent.Future<T> {
        private final T value;

        ConstantFuture(final T value) {
            this.value = value;
        }

        @java.lang.Override
        public boolean isDone() {
            return ((_returnReplacementOperator467.is("NULL")) ? ( null ) : (true));
        }

        @java.lang.Override
        public T get() {
            return ((_returnReplacementOperator463.is("NULL")) ? ( null ) : (value));
        }

        @java.lang.Override
        public T get(final long timeout, final java.util.concurrent.TimeUnit unit) {
            return ((_returnReplacementOperator464.is("NULL")) ? ( null ) : (value));
        }

        @java.lang.Override
        public boolean isCancelled() {
            return ((_returnReplacementOperator466.is("NULL")) ? ( null ) : (false));
        }

        @java.lang.Override
        public boolean cancel(final boolean mayInterruptIfRunning) {
            return ((_returnReplacementOperator465.is("NULL")) ? ( null ) : (false));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator463 = metamutator.Selector.of(463,new String[]{"INIT","NULL"}).id("_returnReplacementOperator463");

    private static final metamutator.Selector _returnReplacementOperator464 = metamutator.Selector.of(464,new String[]{"INIT","NULL"}).id("_returnReplacementOperator464");

    private static final metamutator.Selector _returnReplacementOperator465 = metamutator.Selector.of(465,new String[]{"INIT","NULL"}).id("_returnReplacementOperator465");

    private static final metamutator.Selector _returnReplacementOperator466 = metamutator.Selector.of(466,new String[]{"INIT","NULL"}).id("_returnReplacementOperator466");

    private static final metamutator.Selector _returnReplacementOperator467 = metamutator.Selector.of(467,new String[]{"INIT","NULL"}).id("_returnReplacementOperator467");

    private static final metamutator.Selector _returnReplacementOperator468 = metamutator.Selector.of(468,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator468");

    private static final metamutator.Selector _returnReplacementOperator469 = metamutator.Selector.of(469,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator469");

    private static final metamutator.Selector _returnReplacementOperator470 = metamutator.Selector.of(470,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator470");

    private static final metamutator.Selector _returnReplacementOperator471 = metamutator.Selector.of(471,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator471");

    private static final metamutator.Selector _returnReplacementOperator472 = metamutator.Selector.of(472,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator472");

    private static final metamutator.Selector _returnReplacementOperator473 = metamutator.Selector.of(473,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator473");

    private static final metamutator.Selector _returnReplacementOperator474 = metamutator.Selector.of(474,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator474");

    private static final metamutator.Selector _returnReplacementOperator475 = metamutator.Selector.of(475,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator475");

    private static final metamutator.Selector _returnReplacementOperator476 = metamutator.Selector.of(476,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator476");

    private static final metamutator.Selector _returnReplacementOperator477 = metamutator.Selector.of(477,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator477");

    private static final metamutator.Selector _returnReplacementOperator478 = metamutator.Selector.of(478,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator478");

    private static final metamutator.Selector _returnReplacementOperator479 = metamutator.Selector.of(479,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator479");

    private static final metamutator.Selector _returnReplacementOperator480 = metamutator.Selector.of(480,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator480");

    private static final metamutator.Selector _returnReplacementOperator481 = metamutator.Selector.of(481,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.concurrent.ConcurrentUtils.class).id("_returnReplacementOperator481");
}

