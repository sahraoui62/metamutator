package org.apache.commons.lang3;


public class CharSet implements java.io.Serializable {
    private static final long serialVersionUID = 5947847346149275958L;

    public static final org.apache.commons.lang3.CharSet EMPTY = new org.apache.commons.lang3.CharSet(((java.lang.String)(null)));

    public static final org.apache.commons.lang3.CharSet ASCII_ALPHA = new org.apache.commons.lang3.CharSet("a-zA-Z");

    public static final org.apache.commons.lang3.CharSet ASCII_ALPHA_LOWER = new org.apache.commons.lang3.CharSet("a-z");

    public static final org.apache.commons.lang3.CharSet ASCII_ALPHA_UPPER = new org.apache.commons.lang3.CharSet("A-Z");

    public static final org.apache.commons.lang3.CharSet ASCII_NUMERIC = new org.apache.commons.lang3.CharSet("0-9");

    protected static final java.util.Map<java.lang.String, org.apache.commons.lang3.CharSet> COMMON = java.util.Collections.synchronizedMap(new java.util.HashMap<java.lang.String, org.apache.commons.lang3.CharSet>());

    static {
        COMMON.put(null, EMPTY);
        COMMON.put("", EMPTY);
        COMMON.put("a-zA-Z", ASCII_ALPHA);
        COMMON.put("A-Za-z", ASCII_ALPHA);
        COMMON.put("a-z", ASCII_ALPHA_LOWER);
        COMMON.put("A-Z", ASCII_ALPHA_UPPER);
        COMMON.put("0-9", ASCII_NUMERIC);
    }

    private final java.util.Set<org.apache.commons.lang3.CharRange> set = java.util.Collections.synchronizedSet(new java.util.HashSet<org.apache.commons.lang3.CharRange>());

    public static org.apache.commons.lang3.CharSet getInstance(final java.lang.String... setStrs) {
        if (setStrs == null) {
            return null;
        } 
        if ((setStrs.length) == 1) {
            final org.apache.commons.lang3.CharSet common = COMMON.get(setStrs[0]);
            if (common != null) {
                return common;
            } 
        } 
        return new org.apache.commons.lang3.CharSet(setStrs);
    }

    protected CharSet(final java.lang.String... set) {
        super();
        final int sz = set.length;
        for (int i = 0 ; i < sz ; i++) {
            add(set[i]);
        }
    }

    protected void add(final java.lang.String str) {
        if (str == null) {
            return ;
        } 
        final int len = str.length();
        int pos = 0;
        while (pos < len) {
            final int remainder = ((_arithmeticOperatorHotSpot518.is("PLUS")) ? (len + pos) : (_arithmeticOperatorHotSpot518.is("MINUS")) ? (len - pos) : (_arithmeticOperatorHotSpot518.is("MUL")) ? (len * pos) :  (len / pos));
            if (((remainder >= 4) && ((str.charAt(pos)) == '^')) && ((str.charAt(((_arithmeticOperatorHotSpot519.is("PLUS")) ? ((pos + 2)) : (_arithmeticOperatorHotSpot519.is("MINUS")) ? ((pos - 2)) : (_arithmeticOperatorHotSpot519.is("MUL")) ? ((pos * 2)) :  ((pos / 2))))) == '-')) {
                set.add(org.apache.commons.lang3.CharRange.isNotIn(str.charAt(((_arithmeticOperatorHotSpot520.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot520.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot520.is("MUL")) ? ((pos * 1)) :  ((pos / 1)))), str.charAt(((_arithmeticOperatorHotSpot521.is("PLUS")) ? ((pos + 3)) : (_arithmeticOperatorHotSpot521.is("MINUS")) ? ((pos - 3)) : (_arithmeticOperatorHotSpot521.is("MUL")) ? ((pos * 3)) :  ((pos / 3))))));
                pos += 4;
            } else if ((remainder >= 3) && ((str.charAt(((_arithmeticOperatorHotSpot522.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot522.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot522.is("MUL")) ? ((pos * 1)) :  ((pos / 1))))) == '-')) {
                set.add(org.apache.commons.lang3.CharRange.isIn(str.charAt(pos), str.charAt(((_arithmeticOperatorHotSpot523.is("PLUS")) ? ((pos + 2)) : (_arithmeticOperatorHotSpot523.is("MINUS")) ? ((pos - 2)) : (_arithmeticOperatorHotSpot523.is("MUL")) ? ((pos * 2)) :  ((pos / 2))))));
                pos += 3;
            } else if ((remainder >= 2) && ((str.charAt(pos)) == '^')) {
                set.add(org.apache.commons.lang3.CharRange.isNot(str.charAt(((_arithmeticOperatorHotSpot524.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot524.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot524.is("MUL")) ? ((pos * 1)) :  ((pos / 1))))));
                pos += 2;
            } else {
                set.add(org.apache.commons.lang3.CharRange.is(str.charAt(pos)));
                pos += 1;
            }
        }
    }

    org.apache.commons.lang3.CharRange[] getCharRanges() {
        return set.toArray(new org.apache.commons.lang3.CharRange[set.size()]);
    }

    public boolean contains(final char ch) {
        for (final org.apache.commons.lang3.CharRange range : set) {
            if (range.contains(ch)) {
                return true;
            } 
        }
        return false;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return true;
        } 
        if ((obj instanceof org.apache.commons.lang3.CharSet) == false) {
            return false;
        } 
        final org.apache.commons.lang3.CharSet other = ((org.apache.commons.lang3.CharSet)(obj));
        return set.equals(other.set);
    }

    @java.lang.Override
    public int hashCode() {
        return ((_arithmeticOperatorHotSpot517.is("PLUS")) ? (89 + (set.hashCode())) : (_arithmeticOperatorHotSpot517.is("MINUS")) ? (89 - (set.hashCode())) : (_arithmeticOperatorHotSpot517.is("MUL")) ? (89 * (set.hashCode())) :  (89 / (set.hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return set.toString();
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot517 = metamutator.Selector.of(517,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot517");

    private static final metamutator.Selector _arithmeticOperatorHotSpot518 = metamutator.Selector.of(518,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot518");

    private static final metamutator.Selector _arithmeticOperatorHotSpot519 = metamutator.Selector.of(519,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot519");

    private static final metamutator.Selector _arithmeticOperatorHotSpot520 = metamutator.Selector.of(520,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot520");

    private static final metamutator.Selector _arithmeticOperatorHotSpot521 = metamutator.Selector.of(521,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot521");

    private static final metamutator.Selector _arithmeticOperatorHotSpot522 = metamutator.Selector.of(522,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot522");

    private static final metamutator.Selector _arithmeticOperatorHotSpot523 = metamutator.Selector.of(523,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot523");

    private static final metamutator.Selector _arithmeticOperatorHotSpot524 = metamutator.Selector.of(524,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharSet.class).id("_arithmeticOperatorHotSpot524");
}

