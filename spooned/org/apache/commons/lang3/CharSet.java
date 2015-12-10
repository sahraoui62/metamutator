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
            return ((_returnReplacementOperator2504.is("NULL")) ? ( null ) : (null));
        } 
        if ((setStrs.length) == 1) {
            final org.apache.commons.lang3.CharSet common = COMMON.get(setStrs[0]);
            if (common != null) {
                return ((_returnReplacementOperator2505.is("NULL")) ? ( null ) : (common));
            } 
        } 
        return ((_returnReplacementOperator2506.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.CharSet(setStrs)));
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
            final int remainder = len - pos;
            if (((remainder >= 4) && ((str.charAt(pos)) == '^')) && ((str.charAt((pos + 2))) == '-')) {
                set.add(org.apache.commons.lang3.CharRange.isNotIn(str.charAt((pos + 1)), str.charAt((pos + 3))));
                pos += 4;
            } else if ((remainder >= 3) && ((str.charAt((pos + 1))) == '-')) {
                set.add(org.apache.commons.lang3.CharRange.isIn(str.charAt(pos), str.charAt((pos + 2))));
                pos += 3;
            } else if ((remainder >= 2) && ((str.charAt(pos)) == '^')) {
                set.add(org.apache.commons.lang3.CharRange.isNot(str.charAt((pos + 1))));
                pos += 2;
            } else {
                set.add(org.apache.commons.lang3.CharRange.is(str.charAt(pos)));
                pos += 1;
            }
        }
    }

    org.apache.commons.lang3.CharRange[] getCharRanges() {
        return ((_returnReplacementOperator2503.is("NULL")) ? ( null ) : (set.toArray(new org.apache.commons.lang3.CharRange[set.size()])));
    }

    public boolean contains(final char ch) {
        for (final org.apache.commons.lang3.CharRange range : set) {
            if (range.contains(ch)) {
                return ((_returnReplacementOperator2496.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator2497.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperator2498.is("NULL")) ? ( null ) : (true));
        } 
        if ((obj instanceof org.apache.commons.lang3.CharSet) == false) {
            return ((_returnReplacementOperator2499.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.CharSet other = ((org.apache.commons.lang3.CharSet)(obj));
        return ((_returnReplacementOperator2500.is("NULL")) ? ( null ) : (set.equals(other.set)));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator2501.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2501.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2501.is("ZERO")) ? ( 0 ) : (89 + (set.hashCode())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator2502.is("NULL")) ? ( null ) : (set.toString()));
    }

    private static final metamutator.Selector _returnReplacementOperator2496 = metamutator.Selector.of(2496,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2496");

    private static final metamutator.Selector _returnReplacementOperator2497 = metamutator.Selector.of(2497,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2497");

    private static final metamutator.Selector _returnReplacementOperator2498 = metamutator.Selector.of(2498,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2498");

    private static final metamutator.Selector _returnReplacementOperator2499 = metamutator.Selector.of(2499,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2499");

    private static final metamutator.Selector _returnReplacementOperator2500 = metamutator.Selector.of(2500,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2500");

    private static final metamutator.Selector _returnReplacementOperator2501 = metamutator.Selector.of(2501,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2501");

    private static final metamutator.Selector _returnReplacementOperator2502 = metamutator.Selector.of(2502,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2502");

    private static final metamutator.Selector _returnReplacementOperator2503 = metamutator.Selector.of(2503,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2503");

    private static final metamutator.Selector _returnReplacementOperator2504 = metamutator.Selector.of(2504,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2504");

    private static final metamutator.Selector _returnReplacementOperator2505 = metamutator.Selector.of(2505,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2505");

    private static final metamutator.Selector _returnReplacementOperator2506 = metamutator.Selector.of(2506,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSet.class).id("_returnReplacementOperator2506");
}

