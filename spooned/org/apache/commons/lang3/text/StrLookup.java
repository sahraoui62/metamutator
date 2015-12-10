package org.apache.commons.lang3.text;


public abstract class StrLookup<V> {
    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> NONE_LOOKUP = new org.apache.commons.lang3.text.StrLookup.MapStrLookup<java.lang.String>(null);

    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> SYSTEM_PROPERTIES_LOOKUP = new org.apache.commons.lang3.text.StrLookup.SystemPropertiesStrLookup();

    public static org.apache.commons.lang3.text.StrLookup<?> noneLookup() {
        return ((_returnReplacementOperator1408.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrLookup.NONE_LOOKUP));
    }

    public static org.apache.commons.lang3.text.StrLookup<java.lang.String> systemPropertiesLookup() {
        return ((_returnReplacementOperator1409.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrLookup.SYSTEM_PROPERTIES_LOOKUP));
    }

    public static <V>org.apache.commons.lang3.text.StrLookup<V> mapLookup(final java.util.Map<java.lang.String, V> map) {
        return ((_returnReplacementOperator1407.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrLookup.MapStrLookup<V>(map)));
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
                return ((_returnReplacementOperator1402.is("NULL")) ? ( null ) : (null));
            } 
            final java.lang.Object obj = map.get(key);
            if (obj == null) {
                return ((_returnReplacementOperator1403.is("NULL")) ? ( null ) : (null));
            } 
            return ((_returnReplacementOperator1404.is("NULL")) ? ( null ) : (obj.toString()));
        }
    }

    private static class SystemPropertiesStrLookup extends org.apache.commons.lang3.text.StrLookup<java.lang.String> {
        @java.lang.Override
        public java.lang.String lookup(java.lang.String key) {
            if ((key.length()) > 0) {
                try {
                    return ((_returnReplacementOperator1405.is("NULL")) ? ( null ) : (java.lang.System.getProperty(key)));
                } catch (java.lang.SecurityException scex) {
                }
            } 
            return ((_returnReplacementOperator1406.is("NULL")) ? ( null ) : (null));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator1402 = metamutator.Selector.of(1402,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1402");

    private static final metamutator.Selector _returnReplacementOperator1403 = metamutator.Selector.of(1403,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1403");

    private static final metamutator.Selector _returnReplacementOperator1404 = metamutator.Selector.of(1404,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1404");

    private static final metamutator.Selector _returnReplacementOperator1405 = metamutator.Selector.of(1405,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1405");

    private static final metamutator.Selector _returnReplacementOperator1406 = metamutator.Selector.of(1406,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1406");

    private static final metamutator.Selector _returnReplacementOperator1407 = metamutator.Selector.of(1407,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrLookup.class).id("_returnReplacementOperator1407");

    private static final metamutator.Selector _returnReplacementOperator1408 = metamutator.Selector.of(1408,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrLookup.class).id("_returnReplacementOperator1408");

    private static final metamutator.Selector _returnReplacementOperator1409 = metamutator.Selector.of(1409,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrLookup.class).id("_returnReplacementOperator1409");
}

