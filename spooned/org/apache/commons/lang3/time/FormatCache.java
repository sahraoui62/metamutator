package org.apache.commons.lang3.time;


abstract class FormatCache<F extends java.text.Format> {
    static final int NONE = -1;

    private final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, F> cInstanceCache = new java.util.concurrent.ConcurrentHashMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, F>(7);

    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, java.lang.String> cDateTimeInstanceCache = new java.util.concurrent.ConcurrentHashMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, java.lang.String>(7);

    public F getInstance() {
        return getDateTimeInstance(java.text.DateFormat.SHORT, java.text.DateFormat.SHORT, java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
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
        return format;
    }

    protected abstract F createInstance(java.lang.String pattern, java.util.TimeZone timeZone, java.util.Locale locale);

    private F getDateTimeInstance(final java.lang.Integer dateStyle, final java.lang.Integer timeStyle, final java.util.TimeZone timeZone, java.util.Locale locale) {
        if (locale == null) {
            locale = java.util.Locale.getDefault();
        } 
        final java.lang.String pattern = org.apache.commons.lang3.time.FormatCache.getPatternForStyle(dateStyle, timeStyle, locale);
        return getInstance(pattern, timeZone, locale);
    }

    F getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return getDateTimeInstance(java.lang.Integer.valueOf(dateStyle), java.lang.Integer.valueOf(timeStyle), timeZone, locale);
    }

    F getDateInstance(final int dateStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return getDateTimeInstance(java.lang.Integer.valueOf(dateStyle), null, timeZone, locale);
    }

    F getTimeInstance(final int timeStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return getDateTimeInstance(null, java.lang.Integer.valueOf(timeStyle), timeZone, locale);
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
        return pattern;
    }

    private static class MultipartKey {
        private final java.lang.Object[] keys;

        private int hashCode;

        public MultipartKey(final java.lang.Object... keys) {
            this.keys = keys;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return java.util.Arrays.equals(keys, ((org.apache.commons.lang3.time.FormatCache.MultipartKey)(obj)).keys);
        }

        @java.lang.Override
        public int hashCode() {
            if ((hashCode) == 0) {
                int rc = 0;
                for (final java.lang.Object key : keys) {
                    if (key != null) {
                        rc = ((_arithmeticOperatorHotSpot342.is("PLUS")) ? ((rc + 7)) : (_arithmeticOperatorHotSpot342.is("MINUS")) ? ((rc - 7)) : (_arithmeticOperatorHotSpot342.is("MUL")) ? ((rc * 7)) :  ((rc / 7))) + (key.hashCode());
                    } 
                }
                hashCode = rc;
            } 
            return hashCode;
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot342 = metamutator.Selector.of(342,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot342");
}

