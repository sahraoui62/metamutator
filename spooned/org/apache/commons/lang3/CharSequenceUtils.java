package org.apache.commons.lang3;


public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;

    public CharSequenceUtils() {
        super();
    }

    public static java.lang.CharSequence subSequence(final java.lang.CharSequence cs, final int start) {
        return cs == null ? null : cs.subSequence(start, cs.length());
    }

    static int indexOf(final java.lang.CharSequence cs, final int searchChar, int start) {
        if (cs instanceof java.lang.String) {
            return ((java.lang.String)(cs)).indexOf(searchChar, start);
        } 
        final int sz = cs.length();
        if (start < 0) {
            start = 0;
        } 
        for (int i = start ; i < sz ; i++) {
            if ((cs.charAt(i)) == searchChar) {
                return i;
            } 
        }
        return NOT_FOUND;
    }

    static int indexOf(final java.lang.CharSequence cs, final java.lang.CharSequence searchChar, final int start) {
        return cs.toString().indexOf(searchChar.toString(), start);
    }

    static int lastIndexOf(final java.lang.CharSequence cs, final int searchChar, int start) {
        if (cs instanceof java.lang.String) {
            return ((java.lang.String)(cs)).lastIndexOf(searchChar, start);
        } 
        final int sz = cs.length();
        if (start < 0) {
            return NOT_FOUND;
        } 
        if (start >= sz) {
            start = ((_arithmeticOperatorHotSpot516.is("PLUS")) ? (sz + 1) : (_arithmeticOperatorHotSpot516.is("MINUS")) ? (sz - 1) : (_arithmeticOperatorHotSpot516.is("MUL")) ? (sz * 1) :  (sz / 1));
        } 
        for (int i = start ; i >= 0 ; --i) {
            if ((cs.charAt(i)) == searchChar) {
                return i;
            } 
        }
        return NOT_FOUND;
    }

    static int lastIndexOf(final java.lang.CharSequence cs, final java.lang.CharSequence searchChar, final int start) {
        return cs.toString().lastIndexOf(searchChar.toString(), start);
    }

    static char[] toCharArray(final java.lang.CharSequence cs) {
        if (cs instanceof java.lang.String) {
            return ((java.lang.String)(cs)).toCharArray();
        } 
        final int sz = cs.length();
        final char[] array = new char[cs.length()];
        for (int i = 0 ; i < sz ; i++) {
            array[i] = cs.charAt(i);
        }
        return array;
    }

    static boolean regionMatches(final java.lang.CharSequence cs, final boolean ignoreCase, final int thisStart, final java.lang.CharSequence substring, final int start, final int length) {
        if ((cs instanceof java.lang.String) && (substring instanceof java.lang.String)) {
            return ((java.lang.String)(cs)).regionMatches(ignoreCase, thisStart, ((java.lang.String)(substring)), start, length);
        } 
        int index1 = thisStart;
        int index2 = start;
        int tmpLen = length;
        final int srcLen = ((_arithmeticOperatorHotSpot514.is("PLUS")) ? ((cs.length()) + thisStart) : (_arithmeticOperatorHotSpot514.is("MINUS")) ? ((cs.length()) - thisStart) : (_arithmeticOperatorHotSpot514.is("MUL")) ? ((cs.length()) * thisStart) :  ((cs.length()) / thisStart));
        final int otherLen = ((_arithmeticOperatorHotSpot515.is("PLUS")) ? ((substring.length()) + start) : (_arithmeticOperatorHotSpot515.is("MINUS")) ? ((substring.length()) - start) : (_arithmeticOperatorHotSpot515.is("MUL")) ? ((substring.length()) * start) :  ((substring.length()) / start));
        if (((thisStart < 0) || (start < 0)) || (length < 0)) {
            return false;
        } 
        if ((srcLen < length) || (otherLen < length)) {
            return false;
        } 
        while ((tmpLen--) > 0) {
            final char c1 = cs.charAt(index1++);
            final char c2 = substring.charAt(index2++);
            if (c1 == c2) {
                continue;
            } 
            if (!ignoreCase) {
                return false;
            } 
            if (((java.lang.Character.toUpperCase(c1)) != (java.lang.Character.toUpperCase(c2))) && ((java.lang.Character.toLowerCase(c1)) != (java.lang.Character.toLowerCase(c2)))) {
                return false;
            } 
        }
        return true;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot514 = metamutator.Selector.of(514,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_arithmeticOperatorHotSpot514");

    private static final metamutator.Selector _arithmeticOperatorHotSpot515 = metamutator.Selector.of(515,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_arithmeticOperatorHotSpot515");

    private static final metamutator.Selector _arithmeticOperatorHotSpot516 = metamutator.Selector.of(516,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSequenceUtils.class).id("_arithmeticOperatorHotSpot516");
}

