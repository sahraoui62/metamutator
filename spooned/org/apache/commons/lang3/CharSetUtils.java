package org.apache.commons.lang3;


public class CharSetUtils {
    public CharSetUtils() {
        super();
    }

    public static java.lang.String squeeze(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return str;
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
        return buffer.toString();
    }

    public static boolean containsAny(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return false;
        } 
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        for (final char c : str.toCharArray()) {
            if (chars.contains(c)) {
                return true;
            } 
        }
        return false;
    }

    public static int count(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return 0;
        } 
        final org.apache.commons.lang3.CharSet chars = org.apache.commons.lang3.CharSet.getInstance(set);
        int count = 0;
        for (final char c : str.toCharArray()) {
            if (chars.contains(c)) {
                count++;
            } 
        }
        return count;
    }

    public static java.lang.String keep(final java.lang.String str, final java.lang.String... set) {
        if (str == null) {
            return null;
        } 
        if ((str.isEmpty()) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return org.apache.commons.lang3.StringUtils.EMPTY;
        } 
        return org.apache.commons.lang3.CharSetUtils.modify(str, set, true);
    }

    public static java.lang.String delete(final java.lang.String str, final java.lang.String... set) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.CharSetUtils.deepEmpty(set))) {
            return str;
        } 
        return org.apache.commons.lang3.CharSetUtils.modify(str, set, false);
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
        return buffer.toString();
    }

    private static boolean deepEmpty(final java.lang.String[] strings) {
        if (strings != null) {
            for (final java.lang.String s : strings) {
                if (org.apache.commons.lang3.StringUtils.isNotEmpty(s)) {
                    return false;
                } 
            }
        } 
        return true;
    }
}

