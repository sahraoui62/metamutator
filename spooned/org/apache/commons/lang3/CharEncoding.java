package org.apache.commons.lang3;


public class CharEncoding {
    public static final java.lang.String ISO_8859_1 = "ISO-8859-1";

    public static final java.lang.String US_ASCII = "US-ASCII";

    public static final java.lang.String UTF_16 = "UTF-16";

    public static final java.lang.String UTF_16BE = "UTF-16BE";

    public static final java.lang.String UTF_16LE = "UTF-16LE";

    public static final java.lang.String UTF_8 = "UTF-8";

    public static boolean isSupported(final java.lang.String name) {
        if (name == null) {
            return ((_returnReplacementOperatorHotSpot2455.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot2456.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.nio.charset.Charset.isSupported(name)));
        } catch (final java.nio.charset.IllegalCharsetNameException ex) {
            return ((_returnReplacementOperatorHotSpot2457.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2455 = metamutator.Selector.of(2455,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharEncoding.class).id("_returnReplacementOperatorHotSpot2455");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2456 = metamutator.Selector.of(2456,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharEncoding.class).id("_returnReplacementOperatorHotSpot2456");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2457 = metamutator.Selector.of(2457,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharEncoding.class).id("_returnReplacementOperatorHotSpot2457");
}

