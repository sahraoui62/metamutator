package org.apache.commons.lang3;


public class CharSetUtils {
    public CharSetUtils() {
        super();
    }

    public static java.lang.String squeeze(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperator2520.is("NULL")) ? ( null ) : (str));
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
        return ((_returnReplacementOperator2521.is("NULL")) ? ( null ) : (buffer.toString()));
    }

    public static boolean containsAny(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperator2507.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        for (final char c : str.toCharArray()) {
            if (chars.contains(c)) {
                return ((_returnReplacementOperator2508.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator2509.is("NULL")) ? ( null ) : (false));
    }

    public static int count(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperator2512.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2512.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2512.is("ZERO")) ? ( 0 ) : (0));
        } 
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        int count = 0;
        for (final char c : str.toCharArray()) {
            if (chars.contains(c)) {
                count++;
            } 
        }
        return ((_returnReplacementOperator2513.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2513.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2513.is("ZERO")) ? ( 0 ) : (count));
    }

    public static java.lang.String keep(final java.lang.String str, final java.lang.String... set) {
        if (str == null) {
            return ((_returnReplacementOperator2516.is("NULL")) ? ( null ) : (null));
        } 
        if ((str.isEmpty()) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperator2517.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2518.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharSetUtils.modify(str, set, true)));
    }

    public static java.lang.String delete(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return ((_returnReplacementOperator2514.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator2515.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharSetUtils.modify(str, set, false)));
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
        return ((_returnReplacementOperator2519.is("NULL")) ? ( null ) : (buffer.toString()));
    }

    private static boolean deepEmpty(final java.lang.String[] strings) {
        if (strings != null) {
            for (final java.lang.String s : strings) {
                if (org.apache.commons.lang3.StringUtils.isNotEmpty(s)) {
                    return ((_returnReplacementOperator2510.is("NULL")) ? ( null ) : (false));
                } 
            }
        } 
        return ((_returnReplacementOperator2511.is("NULL")) ? ( null ) : (true));
    }

    private static final metamutator.Selector _returnReplacementOperator2507 = metamutator.Selector.of(2507,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2507");

    private static final metamutator.Selector _returnReplacementOperator2508 = metamutator.Selector.of(2508,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2508");

    private static final metamutator.Selector _returnReplacementOperator2509 = metamutator.Selector.of(2509,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2509");

    private static final metamutator.Selector _returnReplacementOperator2510 = metamutator.Selector.of(2510,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2510");

    private static final metamutator.Selector _returnReplacementOperator2511 = metamutator.Selector.of(2511,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2511");

    private static final metamutator.Selector _returnReplacementOperator2512 = metamutator.Selector.of(2512,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2512");

    private static final metamutator.Selector _returnReplacementOperator2513 = metamutator.Selector.of(2513,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2513");

    private static final metamutator.Selector _returnReplacementOperator2514 = metamutator.Selector.of(2514,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2514");

    private static final metamutator.Selector _returnReplacementOperator2515 = metamutator.Selector.of(2515,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2515");

    private static final metamutator.Selector _returnReplacementOperator2516 = metamutator.Selector.of(2516,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2516");

    private static final metamutator.Selector _returnReplacementOperator2517 = metamutator.Selector.of(2517,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2517");

    private static final metamutator.Selector _returnReplacementOperator2518 = metamutator.Selector.of(2518,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2518");

    private static final metamutator.Selector _returnReplacementOperator2519 = metamutator.Selector.of(2519,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2519");

    private static final metamutator.Selector _returnReplacementOperator2520 = metamutator.Selector.of(2520,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2520");

    private static final metamutator.Selector _returnReplacementOperator2521 = metamutator.Selector.of(2521,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharSetUtils.class).id("_returnReplacementOperator2521");
}

