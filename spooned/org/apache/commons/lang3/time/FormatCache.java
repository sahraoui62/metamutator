package org.apache.commons.lang3.time;


abstract class FormatCache<F extends java.text.Format> {
    static final int NONE = -1;

    private final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, F> cInstanceCache = new java.util.concurrent.ConcurrentHashMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, F>(7);

    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, java.lang.String> cDateTimeInstanceCache = new java.util.concurrent.ConcurrentHashMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, java.lang.String>(7);

    public F getInstance() {
        return ((_returnReplacementOperator1842.is("NULL")) ? ( null ) : (getDateTimeInstance(java.text.DateFormat.SHORT, java.text.DateFormat.SHORT, java.util.TimeZone.getDefault(), java.util.Locale.getDefault())));
    }

    public F getInstance(final java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale) {
        if (pattern == null) {
            throw new java.lang.NullPointerException("pattern must not be null");
        } 
        if (timeZone == null) {
            timeZone = java.util.TimeZone.getDefault();
        } 
        if (locale == null) {
            locale = java.util.Locale.getDefault();
        } 
        final org.apache.commons.lang3.time.FormatCache.MultipartKey key = new org.apache.commons.lang3.time.FormatCache.MultipartKey(pattern , timeZone , locale);
        F format = cInstanceCache.get(key);
        if (format == null) {
            format = createInstance(pattern, timeZone, locale);
            final F previousValue = cInstanceCache.putIfAbsent(key, format);
            if (previousValue != null) {
                format = previousValue;
            } 
        } 
        return ((_returnReplacementOperator1843.is("NULL")) ? ( null ) : (format));
    }

    protected abstract F createInstance(java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale);

    private F getDateTimeInstance(final java.lang.Integer dateStyle, final java.lang.Integer timeStyle, final java.util.TimeZone timeZone, java.util.Locale locale) {
        if (locale == null) {
            locale = java.util.Locale.getDefault();
        } 
        final java.lang.String pattern = org.apache.commons.lang3.time.FormatCache.getPatternForStyle(dateStyle, timeStyle, locale);
        return ((_returnReplacementOperator1841.is("NULL")) ? ( null ) : (getInstance(pattern, timeZone, locale)));
    }

    F getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1840.is("NULL")) ? ( null ) : (getDateTimeInstance(java.lang.Integer.valueOf(dateStyle), java.lang.Integer.valueOf(timeStyle), timeZone, locale)));
    }

    F getDateInstance(final int dateStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1839.is("NULL")) ? ( null ) : (getDateTimeInstance(java.lang.Integer.valueOf(dateStyle), null, timeZone, locale)));
    }

    F getTimeInstance(final int timeStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1844.is("NULL")) ? ( null ) : (getDateTimeInstance(null, java.lang.Integer.valueOf(timeStyle), timeZone, locale)));
    }

    static java.lang.String getPatternForStyle(final java.lang.Integer dateStyle, final java.lang.Integer timeStyle, final java.util.Locale locale) {
        final org.apache.commons.lang3.time.FormatCache.MultipartKey key = new org.apache.commons.lang3.time.FormatCache.MultipartKey(dateStyle , timeStyle , locale);
        java.lang.String pattern = cDateTimeInstanceCache.get(key);
        if (pattern == null) {
            try {
                java.text.DateFormat formatter;
                if (dateStyle == null) {
                    formatter = java.text.DateFormat.getTimeInstance(timeStyle.intValue(), locale);
                } else if (timeStyle == null) {
                    formatter = java.text.DateFormat.getDateInstance(dateStyle.intValue(), locale);
                } else {
                    formatter = java.text.DateFormat.getDateTimeInstance(dateStyle.intValue(), timeStyle.intValue(), locale);
                }
                pattern = ((java.text.SimpleDateFormat)(formatter)).toPattern();
                final java.lang.String previous = cDateTimeInstanceCache.putIfAbsent(key, pattern);
                if (previous != null) {
                    pattern = previous;
                } 
            } catch (final java.lang.ClassCastException ex) {
                throw new java.lang.IllegalArgumentException(("No date time pattern for locale: " + locale));
            }
        } 
        return ((_returnReplacementOperator1845.is("NULL")) ? ( null ) : (pattern));
    }

    private static class MultipartKey {
        private final java.lang.Object[] keys;

        private int hashCode;

        public MultipartKey(final java.lang.Object... keys) {
            this.keys = keys;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return ((_returnReplacementOperator1837.is("NULL")) ? ( null ) : (java.util.Arrays.equals(keys, ((org.apache.commons.lang3.time.FormatCache.MultipartKey)(obj)).keys)));
        }

        @java.lang.Override
        public int hashCode() {
            if ((hashCode) == 0) {
                int rc = 0;
                for (final java.lang.Object key : keys) {
                    if (key != null) {
                        rc = (rc * 7) + (key.hashCode());
                    } 
                }
                hashCode = rc;
            } 
            return ((_returnReplacementOperator1838.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1838.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1838.is("ZERO")) ? ( 0 ) : (hashCode));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator1837 = metamutator.Selector.of(1837,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1837");

    private static final metamutator.Selector _returnReplacementOperator1838 = metamutator.Selector.of(1838,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1838");

    private static final metamutator.Selector _returnReplacementOperator1839 = metamutator.Selector.of(1839,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FormatCache.class).id("_returnReplacementOperator1839");

    private static final metamutator.Selector _returnReplacementOperator1840 = metamutator.Selector.of(1840,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FormatCache.class).id("_returnReplacementOperator1840");

    private static final metamutator.Selector _returnReplacementOperator1841 = metamutator.Selector.of(1841,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FormatCache.class).id("_returnReplacementOperator1841");

    private static final metamutator.Selector _returnReplacementOperator1842 = metamutator.Selector.of(1842,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FormatCache.class).id("_returnReplacementOperator1842");

    private static final metamutator.Selector _returnReplacementOperator1843 = metamutator.Selector.of(1843,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FormatCache.class).id("_returnReplacementOperator1843");

    private static final metamutator.Selector _returnReplacementOperator1844 = metamutator.Selector.of(1844,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FormatCache.class).id("_returnReplacementOperator1844");

    private static final metamutator.Selector _returnReplacementOperator1845 = metamutator.Selector.of(1845,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FormatCache.class).id("_returnReplacementOperator1845");
}

