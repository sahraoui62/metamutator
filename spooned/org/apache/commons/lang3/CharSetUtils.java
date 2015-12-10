package org.apache.commons.lang3;


public class CharSetUtils {
    public CharSetUtils() {
        super();
    }

    public static java.lang.String squeeze(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperatorHotSpot2520.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
        } 
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        final java.lang.StringBuilder buffer = new java.lang.StringBuilder(str.length());
        final char[] chrs = str.toCharArray();
        final int sz = chrs.length;
        char lastChar = ' ';
        char ch = ' ';
        for (int i = 0 ; i < sz ; i++) {
            ch = chrs[i];
            if (((ch == lastChar) && (i != 0)) && (chars.contains(ch))) {
                continue;
            } 
            buffer.append(ch);
            lastChar = ch;
        }
        return ((_returnReplacementOperatorHotSpot2521.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buffer.toString()));
    }

    public static boolean containsAny(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperatorHotSpot2507.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        for (final char c : str.toCharArray()) {
            if (chars.contains(c)) {
                return ((_returnReplacementOperatorHotSpot2508.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2509.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    public static int count(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperatorHotSpot2512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        int count = 0;
        for (final char c : str.toCharArray()) {
            if (chars.contains(c)) {
                count++;
            } 
        }
        return ((_returnReplacementOperatorHotSpot2513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (count));
    }

    public static java.lang.String keep(final java.lang.String str, final java.lang.String... set) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot2516.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if ((str.isEmpty()) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperatorHotSpot2517.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2518.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.CharSetUtils.modify(str, set, true)));
    }

    public static java.lang.String delete(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperatorHotSpot2514.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperatorHotSpot2515.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.CharSetUtils.modify(str, set, false)));
    }

    private static java.lang.String modify(final java.lang.String str, final java.lang.String[] set, final boolean expect) {
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        final java.lang.StringBuilder buffer = new java.lang.StringBuilder(str.length());
        final char[] chrs = str.toCharArray();
        final int sz = chrs.length;
        for (int i = 0 ; i < sz ; i++) {
            if ((chars.contains(chrs[i])) == expect) {
                buffer.append(chrs[i]);
            } 
        }
        return ((_returnReplacementOperatorHotSpot2519.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buffer.toString()));
    }

    private static boolean deepEmpty(final java.lang.String[] strings) {
        if (strings != null) {
            for (final java.lang.String s : strings) {
                if (org.apache.commons.lang3.StringUtils.isNotEmpty(s)) {
                    return ((_returnReplacementOperatorHotSpot2510.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
            }
        } 
        return ((_returnReplacementOperatorHotSpot2511.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2507 = metamutator.Selector.of(2507,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2507");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2508 = metamutator.Selector.of(2508,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2508");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2509 = metamutator.Selector.of(2509,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2509");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2510 = metamutator.Selector.of(2510,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2510");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2511 = metamutator.Selector.of(2511,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2511");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2512 = metamutator.Selector.of(2512,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2512");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2513 = metamutator.Selector.of(2513,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2513");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2514 = metamutator.Selector.of(2514,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2514");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2515 = metamutator.Selector.of(2515,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2515");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2516 = metamutator.Selector.of(2516,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2516");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2517 = metamutator.Selector.of(2517,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2517");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2518 = metamutator.Selector.of(2518,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2518");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2519 = metamutator.Selector.of(2519,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2519");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2520 = metamutator.Selector.of(2520,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2520");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2521 = metamutator.Selector.of(2521,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperatorHotSpot2521");
}

