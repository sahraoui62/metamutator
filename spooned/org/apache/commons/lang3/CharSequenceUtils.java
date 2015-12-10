package org.apache.commons.lang3;


public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;

    public CharSequenceUtils() {
        super();
    }

    public static java.lang.CharSequence subSequence(final java.lang.CharSequence cs, final int start) {
        return ((_returnReplacementOperatorHotSpot2495.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (cs == null ? null : cs.subSequence(start, cs.length())));
    }

    static int indexOf(final java.lang.CharSequence cs, final int searchChar, int start) {
        if (cs instanceof java.lang.String) {
            return ((_returnReplacementOperatorHotSpot2486.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2486.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2486.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (((java.lang.String)(cs)).indexOf(searchChar, start)));
        } 
        final int sz = cs.length();
        if (start < 0) {
            start = 0;
        } 
        for (int i = start ; i < sz ; i++) {
            if ((cs.charAt(i)) == searchChar) {
                return ((_returnReplacementOperatorHotSpot2487.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2487.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2487.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2488.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2488.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2488.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.NOT_FOUND));
    }

    static int indexOf(final java.lang.CharSequence cs, final java.lang.CharSequence searchChar, final int start) {
        return ((_returnReplacementOperatorHotSpot2489.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2489.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2489.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (cs.toString().indexOf(searchChar.toString(), start)));
    }

    static int lastIndexOf(final java.lang.CharSequence cs, final int searchChar, int start) {
        if (cs instanceof java.lang.String) {
            return ((_returnReplacementOperatorHotSpot2490.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2490.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2490.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (((java.lang.String)(cs)).lastIndexOf(searchChar, start)));
        } 
        final int sz = cs.length();
        if (start < 0) {
            return ((_returnReplacementOperatorHotSpot2491.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2491.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2491.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.NOT_FOUND));
        } 
        if (start >= sz) {
            start = sz - 1;
        } 
        for (int i = start ; i >= 0 ; --i) {
            if ((cs.charAt(i)) == searchChar) {
                return ((_returnReplacementOperatorHotSpot2492.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2492.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2492.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2493.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2493.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2493.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.NOT_FOUND));
    }

    static int lastIndexOf(final java.lang.CharSequence cs, final java.lang.CharSequence searchChar, final int start) {
        return ((_returnReplacementOperatorHotSpot2494.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2494.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2494.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (cs.toString().lastIndexOf(searchChar.toString(), start)));
    }

    static char[] toCharArray(final java.lang.CharSequence cs) {
        if (cs instanceof java.lang.String) {
            return ((_returnReplacementOperatorHotSpot2484.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.lang.String)(cs)).toCharArray()));
        } 
        final int sz = cs.length();
        final char[] array = new char[cs.length()];
        for (int i = 0 ; i < sz ; i++) {
            array[i] = cs.charAt(i);
        }
        return ((_returnReplacementOperatorHotSpot2485.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    static boolean regionMatches(final java.lang.CharSequence cs, final boolean ignoreCase, final int thisStart, final java.lang.CharSequence substring, final int start, final int length) {
        if ((cs instanceof java.lang.String) && (substring instanceof java.lang.String)) {
            return ((_returnReplacementOperatorHotSpot2478.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.lang.String)(cs)).regionMatches(ignoreCase, thisStart, ((java.lang.String)(substring)), start, length)));
        } 
        int index1 = thisStart;
        int index2 = start;
        int tmpLen = length;
        final int srcLen = (cs.length()) - thisStart;
        final int otherLen = (substring.length()) - start;
        if (((thisStart < 0) || (start < 0)) || (length < 0)) {
            return ((_returnReplacementOperatorHotSpot2479.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if ((srcLen < length) || (otherLen < length)) {
            return ((_returnReplacementOperatorHotSpot2480.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        while ((tmpLen--) > 0) {
            final char c1 = cs.charAt(index1++);
            final char c2 = substring.charAt(index2++);
            if (c1 == c2) {
                continue;
            } 
            if (!ignoreCase) {
                return ((_returnReplacementOperatorHotSpot2481.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            if (((java.lang.Character.toUpperCase(c1)) != (java.lang.Character.toUpperCase(c2))) && ((java.lang.Character.toLowerCase(c1)) != (java.lang.Character.toLowerCase(c2)))) {
                return ((_returnReplacementOperatorHotSpot2482.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2483.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2478 = metamutator.Selector.of(2478,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2478");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2479 = metamutator.Selector.of(2479,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2479");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2480 = metamutator.Selector.of(2480,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2480");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2481 = metamutator.Selector.of(2481,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2481");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2482 = metamutator.Selector.of(2482,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2482");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2483 = metamutator.Selector.of(2483,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2483");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2484 = metamutator.Selector.of(2484,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2484");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2485 = metamutator.Selector.of(2485,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2485");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2486 = metamutator.Selector.of(2486,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2486");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2487 = metamutator.Selector.of(2487,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2487");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2488 = metamutator.Selector.of(2488,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2488");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2489 = metamutator.Selector.of(2489,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2489");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2490 = metamutator.Selector.of(2490,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2490");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2491 = metamutator.Selector.of(2491,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2491");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2492 = metamutator.Selector.of(2492,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2492");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2493 = metamutator.Selector.of(2493,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2493");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2494 = metamutator.Selector.of(2494,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2494");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2495 = metamutator.Selector.of(2495,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperatorHotSpot2495");
}

