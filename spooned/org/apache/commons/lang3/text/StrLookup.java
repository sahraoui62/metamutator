package org.apache.commons.lang3.text;


public abstract class StrLookup<V> {
    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> NONE_LOOKUP = new org.apache.commons.lang3.text.StrLookup.MapStrLookup<java.lang.String>(null);

    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> SYSTEM_PROPERTIES_LOOKUP = new org.apache.commons.lang3.text.StrLookup.SystemPropertiesStrLookup();

    public static org.apache.commons.lang3.text.StrLookup<?> noneLookup() {
        return NONE_LOOKUP;
    }

    public static org.apache.commons.lang3.text.StrLookup<java.lang.String> systemPropertiesLookup() {
        return SYSTEM_PROPERTIES_LOOKUP;
    }

    public static <V>org.apache.commons.lang3.text.StrLookup<V> mapLookup(final java.util.Map<java.lang.String, V> map) {
        return new org.apache.commons.lang3.text.StrLookup.MapStrLookup<V>(map);
    }

    protected StrLookup() {
        super();
    }

    public abstract java.lang.String lookup(java.lang.String key);

    static class MapStrLookup<V> extends org.apache.commons.lang3.text.StrLookup<V> {
        private final java.util.Map<java.lang.String, V> map;

        MapStrLookup(final java.util.Map<java.lang.String, V> map) {
            this.map = map;
        }

        @java.lang.Override
        public java.lang.String lookup(final java.lang.String key) {
            if ((map) == null) {
                return null;
            } 
            final java.lang.Object obj = map.get(key);
            if (obj == null) {
                return null;
            } 
            return obj.toString();
        }
    }

    private static class SystemPropertiesStrLookup extends org.apache.commons.lang3.text.StrLookup<java.lang.String> {
        @java.lang.Override
        public java.lang.String lookup(java.lang.String key) {
            if ((key.length()) > 0) {
                try {
                    return java.lang.System.getProperty(key);
                } catch (java.lang.SecurityException scex) {
                }
            } 
            return null;
        }
    }
}

