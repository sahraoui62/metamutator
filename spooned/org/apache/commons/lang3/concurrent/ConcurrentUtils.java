package org.apache.commons.lang3.concurrent;


public class ConcurrentUtils {
    private ConcurrentUtils() {
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(final java.util.concurrent.ExecutionException ex) {
        if ((ex == null) || ((ex.getCause()) == null)) {
            return null;
        } 
        org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(ex);
        return new org.apache.commons.lang3.concurrent.ConcurrentException(ex.getMessage() , ex.getCause());
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException extractCauseUnchecked(final java.util.concurrent.ExecutionException ex) {
        if ((ex == null) || ((ex.getCause()) == null)) {
            return null;
        } 
        org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(ex);
        return new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(ex.getMessage() , ex.getCause());
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
        return ex;
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
        return initializer != null ? initializer.get() : null;
    }

    public static <T>T initializeUnchecked(final org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> initializer) {
        try {
            return org.apache.commons.lang3.concurrent.ConcurrentUtils.initialize(initializer);
        } catch (final org.apache.commons.lang3.concurrent.ConcurrentException cex) {
            throw new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(cex.getCause());
        }
    }

    public static <K, V>V putIfAbsent(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final V value) {
        if (map == null) {
            return null;
        } 
        final V result = map.putIfAbsent(key, value);
        return result != null ? result : value;
    }

    public static <K, V>V createIfAbsent(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> init) throws org.apache.commons.lang3.concurrent.ConcurrentException {
        if ((map == null) || (init == null)) {
            return null;
        } 
        final V value = map.get(key);
        if (value == null) {
            return org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(map, key, init.get());
        } 
        return value;
    }

    public static <K, V>V createIfAbsentUnchecked(final java.util.concurrent.ConcurrentMap<K, V> map, final K key, final org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> init) {
        try {
            return org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(map, key, init);
        } catch (final org.apache.commons.lang3.concurrent.ConcurrentException cex) {
            throw new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException(cex.getCause());
        }
    }

    public static <T>java.util.concurrent.Future<T> constantFuture(final T value) {
        return new org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture<T>(value);
    }

    static final class ConstantFuture<T> implements java.util.concurrent.Future<T> {
        private final T value;

        ConstantFuture(final T value) {
            this.value = value;
        }

        @java.lang.Override
        public boolean isDone() {
            return true;
        }

        @java.lang.Override
        public T get() {
            return value;
        }

        @java.lang.Override
        public T get(final long timeout, final java.util.concurrent.TimeUnit unit) {
            return value;
        }

        @java.lang.Override
        public boolean isCancelled() {
            return false;
        }

        @java.lang.Override
        public boolean cancel(final boolean mayInterruptIfRunning) {
            return false;
        }
    }
}

