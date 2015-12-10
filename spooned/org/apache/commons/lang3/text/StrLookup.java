package org.apache.commons.lang3.text;


public abstract class StrLookup<V> {
    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> NONE_LOOKUP = new org.apache.commons.lang3.text.StrLookup.MapStrLookup<java.lang.String>(null);

    private static final org.apache.commons.lang3.text.StrLookup<java.lang.String> SYSTEM_PROPERTIES_LOOKUP = new org.apache.commons.lang3.text.StrLookup.SystemPropertiesStrLookup();

    public static org.apache.commons.lang3.text.StrLookup<?> noneLookup() {
        return ((_returnReplacementOperatorHotSpot1408.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrLookup.NONE_LOOKUP));
    }

    public static org.apache.commons.lang3.text.StrLookup<java.lang.String> systemPropertiesLookup() {
        return ((_returnReplacementOperatorHotSpot1409.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrLookup.SYSTEM_PROPERTIES_LOOKUP));
    }

    public static <V>org.apache.commons.lang3.text.StrLookup<V> mapLookup(final java.util.Map<java.lang.String, V> map) {
        return ((_returnReplacementOperatorHotSpot1407.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrLookup.MapStrLookup<V>(map)));
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
                return ((_returnReplacementOperatorHotSpot1402.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
            final java.lang.Object obj = map.get(key);
            if (obj == null) {
                return ((_returnReplacementOperatorHotSpot1403.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
            return ((_returnReplacementOperatorHotSpot1404.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (obj.toString()));
        }
    }

    private static class SystemPropertiesStrLookup extends org.apache.commons.lang3.text.StrLookup<java.lang.String> {
        @java.lang.Override
        public java.lang.String lookup(java.lang.String key) {
            if ((key.length()) > 0) {
                try {
                    return ((_returnReplacementOperatorHotSpot1405.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.System.getProperty(key)));
                } catch (java.lang.SecurityException scex) {
                }
            } 
            return ((_returnReplacementOperatorHotSpot1406.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1402 = metamutator.Selector.of(1402,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1402");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1403 = metamutator.Selector.of(1403,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1403");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1404 = metamutator.Selector.of(1404,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1404");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1405 = metamutator.Selector.of(1405,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1405");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1406 = metamutator.Selector.of(1406,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1406");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1407 = metamutator.Selector.of(1407,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrLookup.class).id("_returnReplacementOperatorHotSpot1407");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1408 = metamutator.Selector.of(1408,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrLookup.class).id("_returnReplacementOperatorHotSpot1408");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1409 = metamutator.Selector.of(1409,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrLookup.class).id("_returnReplacementOperatorHotSpot1409");
}

