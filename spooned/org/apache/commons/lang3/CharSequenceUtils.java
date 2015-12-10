package org.apache.commons.lang3;


public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;

    public CharSequenceUtils() {
        super();
    }

    public static java.lang.CharSequence subSequence(final java.lang.CharSequence cs, final int start) {
        return ((_returnReplacementOperator2495.is("NULL")) ? ( null ) : (cs == null ? null : cs.subSequence(start, cs.length())));
    }

    static int indexOf(final java.lang.CharSequence cs, final int searchChar, int start) {
        if (cs instanceof java.lang.String) {
            return ((_returnReplacementOperator2486.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2486.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2486.is("ZERO")) ? ( 0 ) : (((java.lang.String)(cs)).indexOf(searchChar, start)));
        } 
        final int sz = cs.length();
        if (start < 0) {
            start = 0;
        } 
        for (int i = start ; i < sz ; i++) {
            if ((cs.charAt(i)) == searchChar) {
                return ((_returnReplacementOperator2487.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2487.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2487.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2488.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2488.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2488.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.NOT_FOUND));
    }

    static int indexOf(final java.lang.CharSequence cs, final java.lang.CharSequence searchChar, final int start) {
        return ((_returnReplacementOperator2489.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2489.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2489.is("ZERO")) ? ( 0 ) : (cs.toString().indexOf(searchChar.toString(), start)));
    }

    static int lastIndexOf(final java.lang.CharSequence cs, final int searchChar, int start) {
        if (cs instanceof java.lang.String) {
            return ((_returnReplacementOperator2490.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2490.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2490.is("ZERO")) ? ( 0 ) : (((java.lang.String)(cs)).lastIndexOf(searchChar, start)));
        } 
        final int sz = cs.length();
        if (start < 0) {
            return ((_returnReplacementOperator2491.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2491.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2491.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.NOT_FOUND));
        } 
        if (start >= sz) {
            start = sz - 1;
        } 
        for (int i = start ; i >= 0 ; --i) {
            if ((cs.charAt(i)) == searchChar) {
                return ((_returnReplacementOperator2492.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2492.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2492.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2493.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2493.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2493.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.NOT_FOUND));
    }

    static int lastIndexOf(final java.lang.CharSequence cs, final java.lang.CharSequence searchChar, final int start) {
        return ((_returnReplacementOperator2494.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2494.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2494.is("ZERO")) ? ( 0 ) : (cs.toString().lastIndexOf(searchChar.toString(), start)));
    }

    static char[] toCharArray(final java.lang.CharSequence cs) {
        if (cs instanceof java.lang.String) {
            return ((_returnReplacementOperator2484.is("NULL")) ? ( null ) : (((java.lang.String)(cs)).toCharArray()));
        } 
        final int sz = cs.length();
        final char[] array = new char[cs.length()];
        for (int i = 0 ; i < sz ; i++) {
            array[i] = cs.charAt(i);
        }
        return ((_returnReplacementOperator2485.is("NULL")) ? ( null ) : (array));
    }

    static boolean regionMatches(final java.lang.CharSequence cs, final boolean ignoreCase, final int thisStart, final java.lang.CharSequence substring, final int start, final int length) {
        if ((cs instanceof java.lang.String) && (substring instanceof java.lang.String)) {
            return ((_returnReplacementOperator2478.is("NULL")) ? ( null ) : (((java.lang.String)(cs)).regionMatches(ignoreCase, thisStart, ((java.lang.String)(substring)), start, length)));
        } 
        int index1 = thisStart;
        int index2 = start;
        int tmpLen = length;
        final int srcLen = (cs.length()) - thisStart;
        final int otherLen = (substring.length()) - start;
        if (((thisStart < 0) || (start < 0)) || (length < 0)) {
            return ((_returnReplacementOperator2479.is("NULL")) ? ( null ) : (false));
        } 
        if ((srcLen < length) || (otherLen < length)) {
            return ((_returnReplacementOperator2480.is("NULL")) ? ( null ) : (false));
        } 
        while ((tmpLen--) > 0) {
            final char c1 = cs.charAt(index1++);
            final char c2 = substring.charAt(index2++);
            if (c1 == c2) {
                continue;
            } 
            if (!ignoreCase) {
                return ((_returnReplacementOperator2481.is("NULL")) ? ( null ) : (false));
            } 
            if (((java.lang.Character.toUpperCase(c1)) != (java.lang.Character.toUpperCase(c2))) && ((java.lang.Character.toLowerCase(c1)) != (java.lang.Character.toLowerCase(c2)))) {
                return ((_returnReplacementOperator2482.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator2483.is("NULL")) ? ( null ) : (true));
    }

    private static final metamutator.Selector _returnReplacementOperator2478 = metamutator.Selector.of(2478,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2478");

    private static final metamutator.Selector _returnReplacementOperator2479 = metamutator.Selector.of(2479,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2479");

    private static final metamutator.Selector _returnReplacementOperator2480 = metamutator.Selector.of(2480,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2480");

    private static final metamutator.Selector _returnReplacementOperator2481 = metamutator.Selector.of(2481,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2481");

    private static final metamutator.Selector _returnReplacementOperator2482 = metamutator.Selector.of(2482,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2482");

    private static final metamutator.Selector _returnReplacementOperator2483 = metamutator.Selector.of(2483,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2483");

    private static final metamutator.Selector _returnReplacementOperator2484 = metamutator.Selector.of(2484,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2484");

    private static final metamutator.Selector _returnReplacementOperator2485 = metamutator.Selector.of(2485,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2485");

    private static final metamutator.Selector _returnReplacementOperator2486 = metamutator.Selector.of(2486,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2486");

    private static final metamutator.Selector _returnReplacementOperator2487 = metamutator.Selector.of(2487,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2487");

    private static final metamutator.Selector _returnReplacementOperator2488 = metamutator.Selector.of(2488,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2488");

    private static final metamutator.Selector _returnReplacementOperator2489 = metamutator.Selector.of(2489,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2489");

    private static final metamutator.Selector _returnReplacementOperator2490 = metamutator.Selector.of(2490,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2490");

    private static final metamutator.Selector _returnReplacementOperator2491 = metamutator.Selector.of(2491,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2491");

    private static final metamutator.Selector _returnReplacementOperator2492 = metamutator.Selector.of(2492,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2492");

    private static final metamutator.Selector _returnReplacementOperator2493 = metamutator.Selector.of(2493,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2493");

    private static final metamutator.Selector _returnReplacementOperator2494 = metamutator.Selector.of(2494,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2494");

    private static final metamutator.Selector _returnReplacementOperator2495 = metamutator.Selector.of(2495,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_returnReplacementOperator2495");
}

