package org.apache.commons.lang3;


public class StringUtils {
    public static final java.lang.String SPACE = " ";

    public static final java.lang.String EMPTY = "";

    public static final java.lang.String LF = "\n";

    public static final java.lang.String CR = "\r";

    public static final int INDEX_NOT_FOUND = -1;

    private static final int PAD_LIMIT = 8192;

    public StringUtils() {
        super();
    }

    public static boolean isEmpty(final java.lang.CharSequence cs) {
        return ((_returnReplacementOperator3057.is("NULL")) ? ( null ) : ((cs == null) || ((cs.length()) == 0)));
    }

    public static boolean isNotEmpty(final java.lang.CharSequence cs) {
        return ((_returnReplacementOperator3061.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.StringUtils.isEmpty(cs))));
    }

    public static boolean isAnyEmpty(final java.lang.CharSequence... css) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(css)) {
            return ((_returnReplacementOperator3048.is("NULL")) ? ( null ) : (true));
        } 
        for (final java.lang.CharSequence cs : css) {
            if (org.apache.commons.lang3.StringUtils.isEmpty(cs)) {
                return ((_returnReplacementOperator3049.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator3050.is("NULL")) ? ( null ) : (false));
    }

    public static boolean isNoneEmpty(final java.lang.CharSequence... css) {
        return ((_returnReplacementOperator3059.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.StringUtils.isAnyEmpty(css))));
    }

    public static boolean isBlank(final java.lang.CharSequence cs) {
        int strLen;
        if ((cs == null) || ((strLen = cs.length()) == 0)) {
            return ((_returnReplacementOperator3054.is("NULL")) ? ( null ) : (true));
        } 
        for (int i = 0 ; i < strLen ; i++) {
            if ((java.lang.Character.isWhitespace(cs.charAt(i))) == false) {
                return ((_returnReplacementOperator3055.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3056.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isNotBlank(final java.lang.CharSequence cs) {
        return ((_returnReplacementOperator3060.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.StringUtils.isBlank(cs))));
    }

    public static boolean isAnyBlank(final java.lang.CharSequence... css) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(css)) {
            return ((_returnReplacementOperator3045.is("NULL")) ? ( null ) : (true));
        } 
        for (final java.lang.CharSequence cs : css) {
            if (org.apache.commons.lang3.StringUtils.isBlank(cs)) {
                return ((_returnReplacementOperator3046.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator3047.is("NULL")) ? ( null ) : (false));
    }

    public static boolean isNoneBlank(final java.lang.CharSequence... css) {
        return ((_returnReplacementOperator3058.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.StringUtils.isAnyBlank(css))));
    }

    public static java.lang.String trim(final java.lang.String str) {
        return ((_returnReplacementOperator3426.is("NULL")) ? ( null ) : (str == null ? null : str.trim()));
    }

    public static java.lang.String trimToNull(final java.lang.String str) {
        final java.lang.String ts = org.apache.commons.lang3.StringUtils.trim(str);
        return ((_returnReplacementOperator3428.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.isEmpty(ts) ? null : ts));
    }

    public static java.lang.String trimToEmpty(final java.lang.String str) {
        return ((_returnReplacementOperator3427.is("NULL")) ? ( null ) : (str == null ? org.apache.commons.lang3.StringUtils.EMPTY : str.trim()));
    }

    public static java.lang.String strip(final java.lang.String str) {
        return ((_returnReplacementOperator3383.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.strip(str, null)));
    }

    public static java.lang.String stripToNull(java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator3395.is("NULL")) ? ( null ) : (null));
        } 
        str = org.apache.commons.lang3.StringUtils.strip(str, null);
        return ((_returnReplacementOperator3396.is("NULL")) ? ( null ) : (str.isEmpty() ? null : str));
    }

    public static java.lang.String stripToEmpty(final java.lang.String str) {
        return ((_returnReplacementOperator3394.is("NULL")) ? ( null ) : (str == null ? org.apache.commons.lang3.StringUtils.EMPTY : org.apache.commons.lang3.StringUtils.strip(str, null)));
    }

    public static java.lang.String strip(java.lang.String str, final java.lang.String stripChars) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3384.is("NULL")) ? ( null ) : (str));
        } 
        str = org.apache.commons.lang3.StringUtils.stripStart(str, stripChars);
        return ((_returnReplacementOperator3385.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.stripEnd(str, stripChars)));
    }

    public static java.lang.String stripStart(final java.lang.String str, final java.lang.String stripChars) {
        int strLen;
        if ((str == null) || ((strLen = str.length()) == 0)) {
            return ((_returnReplacementOperator3391.is("NULL")) ? ( null ) : (str));
        } 
        int start = 0;
        if (stripChars == null) {
            while ((start != strLen) && (java.lang.Character.isWhitespace(str.charAt(start)))) {
                start++;
            }
        } else if (stripChars.isEmpty()) {
            return ((_returnReplacementOperator3392.is("NULL")) ? ( null ) : (str));
        } else {
            while ((start != strLen) && ((stripChars.indexOf(str.charAt(start))) != (INDEX_NOT_FOUND))) {
                start++;
            }
        }
        return ((_returnReplacementOperator3393.is("NULL")) ? ( null ) : (str.substring(start)));
    }

    public static java.lang.String stripEnd(final java.lang.String str, final java.lang.String stripChars) {
        int end;
        if ((str == null) || ((end = str.length()) == 0)) {
            return ((_returnReplacementOperator3388.is("NULL")) ? ( null ) : (str));
        } 
        if (stripChars == null) {
            while ((end != 0) && (java.lang.Character.isWhitespace(str.charAt((end - 1))))) {
                end--;
            }
        } else if (stripChars.isEmpty()) {
            return ((_returnReplacementOperator3389.is("NULL")) ? ( null ) : (str));
        } else {
            while ((end != 0) && ((stripChars.indexOf(str.charAt((end - 1)))) != (INDEX_NOT_FOUND))) {
                end--;
            }
        }
        return ((_returnReplacementOperator3390.is("NULL")) ? ( null ) : (str.substring(0, end)));
    }

    public static java.lang.String[] stripAll(final java.lang.String... strs) {
        return ((_returnReplacementOperator3467.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.stripAll(strs, null)));
    }

    public static java.lang.String[] stripAll(final java.lang.String[] strs, final java.lang.String stripChars) {
        int strsLen;
        if ((strs == null) || ((strsLen = strs.length) == 0)) {
            return ((_returnReplacementOperator3468.is("NULL")) ? ( null ) : (strs));
        } 
        final java.lang.String[] newArr = new java.lang.String[strsLen];
        for (int i = 0 ; i < strsLen ; i++) {
            newArr[i] = org.apache.commons.lang3.StringUtils.strip(strs[i], stripChars);
        }
        return ((_returnReplacementOperator3469.is("NULL")) ? ( null ) : (newArr));
    }

    public static java.lang.String stripAccents(final java.lang.String input) {
        if (input == null) {
            return ((_returnReplacementOperator3386.is("NULL")) ? ( null ) : (null));
        } 
        final java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        final java.lang.String decomposed = java.text.Normalizer.normalize(input, java.text.Normalizer.Form.NFD);
        return ((_returnReplacementOperator3387.is("NULL")) ? ( null ) : (pattern.matcher(decomposed).replaceAll("")));
    }

    public static boolean equals(final java.lang.CharSequence cs1, final java.lang.CharSequence cs2) {
        if (cs1 == cs2) {
            return ((_returnReplacementOperator3014.is("NULL")) ? ( null ) : (true));
        } 
        if ((cs1 == null) || (cs2 == null)) {
            return ((_returnReplacementOperator3015.is("NULL")) ? ( null ) : (false));
        } 
        if ((cs1.length()) != (cs2.length())) {
            return ((_returnReplacementOperator3016.is("NULL")) ? ( null ) : (false));
        } 
        if ((cs1 instanceof java.lang.String) && (cs2 instanceof java.lang.String)) {
            return ((_returnReplacementOperator3017.is("NULL")) ? ( null ) : (cs1.equals(cs2)));
        } 
        return ((_returnReplacementOperator3018.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, cs1.length())));
    }

    public static boolean equalsIgnoreCase(final java.lang.CharSequence str1, final java.lang.CharSequence str2) {
        if ((str1 == null) || (str2 == null)) {
            return ((_returnReplacementOperator3023.is("NULL")) ? ( null ) : (str1 == str2));
        } else if (str1 == str2) {
            return ((_returnReplacementOperator3024.is("NULL")) ? ( null ) : (true));
        } else if ((str1.length()) != (str2.length())) {
            return ((_returnReplacementOperator3025.is("NULL")) ? ( null ) : (false));
        } else {
            return ((_returnReplacementOperator3026.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharSequenceUtils.regionMatches(str1, true, 0, str2, 0, str1.length())));
        }
    }

    public static int compare(final java.lang.String str1, final java.lang.String str2) {
        return ((_returnReplacementOperator3084.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3084.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3084.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.compare(str1, str2, true)));
    }

    public static int compare(final java.lang.String str1, final java.lang.String str2, final boolean nullIsLess) {
        if (str1 == str2) {
            return ((_returnReplacementOperator3085.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3085.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3085.is("ZERO")) ? ( 0 ) : (0));
        } 
        if (str1 == null) {
            return ((_returnReplacementOperator3086.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3086.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3086.is("ZERO")) ? ( 0 ) : (nullIsLess ? -1 : 1));
        } 
        if (str2 == null) {
            return ((_returnReplacementOperator3087.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3087.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3087.is("ZERO")) ? ( 0 ) : (nullIsLess ? 1 : -1));
        } 
        return ((_returnReplacementOperator3088.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3088.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3088.is("ZERO")) ? ( 0 ) : (str1.compareTo(str2)));
    }

    public static int compareIgnoreCase(final java.lang.String str1, final java.lang.String str2) {
        return ((_returnReplacementOperator3089.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3089.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3089.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.compareIgnoreCase(str1, str2, true)));
    }

    public static int compareIgnoreCase(final java.lang.String str1, final java.lang.String str2, final boolean nullIsLess) {
        if (str1 == str2) {
            return ((_returnReplacementOperator3090.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3090.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3090.is("ZERO")) ? ( 0 ) : (0));
        } 
        if (str1 == null) {
            return ((_returnReplacementOperator3091.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3091.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3091.is("ZERO")) ? ( 0 ) : (nullIsLess ? -1 : 1));
        } 
        if (str2 == null) {
            return ((_returnReplacementOperator3092.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3092.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3092.is("ZERO")) ? ( 0 ) : (nullIsLess ? 1 : -1));
        } 
        return ((_returnReplacementOperator3093.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3093.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3093.is("ZERO")) ? ( 0 ) : (str1.compareToIgnoreCase(str2)));
    }

    public static boolean equalsAny(final java.lang.CharSequence string, final java.lang.CharSequence... searchStrings) {
        if (org.apache.commons.lang3.ArrayUtils.isNotEmpty(searchStrings)) {
            for (java.lang.CharSequence next : searchStrings) {
                if (org.apache.commons.lang3.StringUtils.equals(string, next)) {
                    return ((_returnReplacementOperator3019.is("NULL")) ? ( null ) : (true));
                } 
            }
        } 
        return ((_returnReplacementOperator3020.is("NULL")) ? ( null ) : (false));
    }

    public static boolean equalsAnyIgnoreCase(final java.lang.CharSequence string, final java.lang.CharSequence... searchStrings) {
        if (org.apache.commons.lang3.ArrayUtils.isNotEmpty(searchStrings)) {
            for (java.lang.CharSequence next : searchStrings) {
                if (org.apache.commons.lang3.StringUtils.equalsIgnoreCase(string, next)) {
                    return ((_returnReplacementOperator3021.is("NULL")) ? ( null ) : (true));
                } 
            }
        } 
        return ((_returnReplacementOperator3022.is("NULL")) ? ( null ) : (false));
    }

    public static int indexOf(final java.lang.CharSequence seq, final int searchChar) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(seq)) {
            return ((_returnReplacementOperator3107.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3107.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3107.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3108.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3108.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3108.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.indexOf(seq, searchChar, 0)));
    }

    public static int indexOf(final java.lang.CharSequence seq, final int searchChar, final int startPos) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(seq)) {
            return ((_returnReplacementOperator3109.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3109.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3109.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3110.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3110.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3110.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.indexOf(seq, searchChar, startPos)));
    }

    public static int indexOf(final java.lang.CharSequence seq, final java.lang.CharSequence searchSeq) {
        if ((seq == null) || (searchSeq == null)) {
            return ((_returnReplacementOperator3111.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3111.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3111.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3112.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3112.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3112.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.indexOf(seq, searchSeq, 0)));
    }

    public static int indexOf(final java.lang.CharSequence seq, final java.lang.CharSequence searchSeq, final int startPos) {
        if ((seq == null) || (searchSeq == null)) {
            return ((_returnReplacementOperator3113.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3113.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3113.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3114.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3114.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3114.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.indexOf(seq, searchSeq, startPos)));
    }

    public static int ordinalIndexOf(final java.lang.CharSequence str, final java.lang.CharSequence searchStr, final int ordinal) {
        return ((_returnReplacementOperator3164.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3164.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3164.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.ordinalIndexOf(str, searchStr, ordinal, false)));
    }

    private static int ordinalIndexOf(final java.lang.CharSequence str, final java.lang.CharSequence searchStr, final int ordinal, final boolean lastIndex) {
        if (((str == null) || (searchStr == null)) || (ordinal <= 0)) {
            return ((_returnReplacementOperator3165.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3165.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3165.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        if ((searchStr.length()) == 0) {
            return ((_returnReplacementOperator3166.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3166.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3166.is("ZERO")) ? ( 0 ) : (lastIndex ? str.length() : 0));
        } 
        int found = 0;
        int index = lastIndex ? str.length() : INDEX_NOT_FOUND;
        do {
            if (lastIndex) {
                index = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(str, searchStr, (index - (searchStr.length())));
            } else {
                index = org.apache.commons.lang3.CharSequenceUtils.indexOf(str, searchStr, (index + (searchStr.length())));
            }
            if (index < 0) {
                return ((_returnReplacementOperator3167.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3167.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3167.is("ZERO")) ? ( 0 ) : (index));
            } 
            found++;
        } while (found < ordinal );
        return ((_returnReplacementOperator3168.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3168.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3168.is("ZERO")) ? ( 0 ) : (index));
    }

    public static int indexOfIgnoreCase(final java.lang.CharSequence str, final java.lang.CharSequence searchStr) {
        return ((_returnReplacementOperator3139.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3139.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3139.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(str, searchStr, 0)));
    }

    public static int indexOfIgnoreCase(final java.lang.CharSequence str, final java.lang.CharSequence searchStr, int startPos) {
        if ((str == null) || (searchStr == null)) {
            return ((_returnReplacementOperator3140.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3140.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3140.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        if (startPos < 0) {
            startPos = 0;
        } 
        final int endLimit = ((str.length()) - (searchStr.length())) + 1;
        if (startPos > endLimit) {
            return ((_returnReplacementOperator3141.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3141.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3141.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        if ((searchStr.length()) == 0) {
            return ((_returnReplacementOperator3142.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3142.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3142.is("ZERO")) ? ( 0 ) : (startPos));
        } 
        for (int i = startPos ; i < endLimit ; i++) {
            if (org.apache.commons.lang3.CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length())) {
                return ((_returnReplacementOperator3143.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3143.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3143.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator3144.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3144.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3144.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final java.lang.CharSequence seq, final int searchChar) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(seq)) {
            return ((_returnReplacementOperator3145.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3145.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3145.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3146.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3146.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3146.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(seq, searchChar, seq.length())));
    }

    public static int lastIndexOf(final java.lang.CharSequence seq, final int searchChar, final int startPos) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(seq)) {
            return ((_returnReplacementOperator3147.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3147.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3147.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3148.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3148.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3148.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(seq, searchChar, startPos)));
    }

    public static int lastIndexOf(final java.lang.CharSequence seq, final java.lang.CharSequence searchSeq) {
        if ((seq == null) || (searchSeq == null)) {
            return ((_returnReplacementOperator3149.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3149.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3149.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3150.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3150.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3150.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(seq, searchSeq, seq.length())));
    }

    public static int lastOrdinalIndexOf(final java.lang.CharSequence str, final java.lang.CharSequence searchStr, final int ordinal) {
        return ((_returnReplacementOperator3162.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3162.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3162.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.ordinalIndexOf(str, searchStr, ordinal, true)));
    }

    public static int lastIndexOf(final java.lang.CharSequence seq, final java.lang.CharSequence searchSeq, final int startPos) {
        if ((seq == null) || (searchSeq == null)) {
            return ((_returnReplacementOperator3151.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3151.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3151.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3152.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3152.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3152.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(seq, searchSeq, startPos)));
    }

    public static int lastIndexOfIgnoreCase(final java.lang.CharSequence str, final java.lang.CharSequence searchStr) {
        if ((str == null) || (searchStr == null)) {
            return ((_returnReplacementOperator3155.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3155.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3155.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3156.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3156.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3156.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(str, searchStr, str.length())));
    }

    public static int lastIndexOfIgnoreCase(final java.lang.CharSequence str, final java.lang.CharSequence searchStr, int startPos) {
        if ((str == null) || (searchStr == null)) {
            return ((_returnReplacementOperator3157.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3157.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3157.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        if (startPos > ((str.length()) - (searchStr.length()))) {
            startPos = (str.length()) - (searchStr.length());
        } 
        if (startPos < 0) {
            return ((_returnReplacementOperator3158.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3158.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3158.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        if ((searchStr.length()) == 0) {
            return ((_returnReplacementOperator3159.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3159.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3159.is("ZERO")) ? ( 0 ) : (startPos));
        } 
        for (int i = startPos ; i >= 0 ; i--) {
            if (org.apache.commons.lang3.CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length())) {
                return ((_returnReplacementOperator3160.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3160.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3160.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator3161.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3161.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3161.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final java.lang.CharSequence seq, final int searchChar) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(seq)) {
            return ((_returnReplacementOperator2973.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2974.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.CharSequenceUtils.indexOf(seq, searchChar, 0)) >= 0));
    }

    public static boolean contains(final java.lang.CharSequence seq, final java.lang.CharSequence searchSeq) {
        if ((seq == null) || (searchSeq == null)) {
            return ((_returnReplacementOperator2975.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2976.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.CharSequenceUtils.indexOf(seq, searchSeq, 0)) >= 0));
    }

    public static boolean containsIgnoreCase(final java.lang.CharSequence str, final java.lang.CharSequence searchStr) {
        if ((str == null) || (searchStr == null)) {
            return ((_returnReplacementOperator2987.is("NULL")) ? ( null ) : (false));
        } 
        final int len = searchStr.length();
        final int max = (str.length()) - len;
        for (int i = 0 ; i <= max ; i++) {
            if (org.apache.commons.lang3.CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, len)) {
                return ((_returnReplacementOperator2988.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator2989.is("NULL")) ? ( null ) : (false));
    }

    public static boolean containsWhitespace(final java.lang.CharSequence seq) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(seq)) {
            return ((_returnReplacementOperator3003.is("NULL")) ? ( null ) : (false));
        } 
        final int strLen = seq.length();
        for (int i = 0 ; i < strLen ; i++) {
            if (java.lang.Character.isWhitespace(seq.charAt(i))) {
                return ((_returnReplacementOperator3004.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator3005.is("NULL")) ? ( null ) : (false));
    }

    public static int indexOfAny(final java.lang.CharSequence cs, final char... searchChars) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchChars))) {
            return ((_returnReplacementOperator3115.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3115.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3115.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        final int csLen = cs.length();
        final int csLast = csLen - 1;
        final int searchLen = searchChars.length;
        final int searchLast = searchLen - 1;
        for (int i = 0 ; i < csLen ; i++) {
            final char ch = cs.charAt(i);
            for (int j = 0 ; j < searchLen ; j++) {
                if ((searchChars[j]) == ch) {
                    if (((i < csLast) && (j < searchLast)) && (java.lang.Character.isHighSurrogate(ch))) {
                        if ((searchChars[(j + 1)]) == (cs.charAt((i + 1)))) {
                            return ((_returnReplacementOperator3116.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3116.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3116.is("ZERO")) ? ( 0 ) : (i));
                        } 
                    } else {
                        return ((_returnReplacementOperator3117.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3117.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3117.is("ZERO")) ? ( 0 ) : (i));
                    }
                } 
            }
        }
        return ((_returnReplacementOperator3118.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3118.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3118.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
    }

    public static int indexOfAny(final java.lang.CharSequence cs, final java.lang.String searchChars) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchChars))) {
            return ((_returnReplacementOperator3121.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3121.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3121.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        return ((_returnReplacementOperator3122.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3122.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3122.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.indexOfAny(cs, searchChars.toCharArray())));
    }

    public static boolean containsAny(final java.lang.CharSequence cs, final char... searchChars) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchChars))) {
            return ((_returnReplacementOperator2977.is("NULL")) ? ( null ) : (false));
        } 
        final int csLength = cs.length();
        final int searchLength = searchChars.length;
        final int csLast = csLength - 1;
        final int searchLast = searchLength - 1;
        for (int i = 0 ; i < csLength ; i++) {
            final char ch = cs.charAt(i);
            for (int j = 0 ; j < searchLength ; j++) {
                if ((searchChars[j]) == ch) {
                    if (java.lang.Character.isHighSurrogate(ch)) {
                        if (j == searchLast) {
                            return ((_returnReplacementOperator2978.is("NULL")) ? ( null ) : (true));
                        } 
                        if ((i < csLast) && ((searchChars[(j + 1)]) == (cs.charAt((i + 1))))) {
                            return ((_returnReplacementOperator2979.is("NULL")) ? ( null ) : (true));
                        } 
                    } else {
                        return ((_returnReplacementOperator2980.is("NULL")) ? ( null ) : (true));
                    }
                } 
            }
        }
        return ((_returnReplacementOperator2981.is("NULL")) ? ( null ) : (false));
    }

    public static boolean containsAny(final java.lang.CharSequence cs, final java.lang.CharSequence searchChars) {
        if (searchChars == null) {
            return ((_returnReplacementOperator2982.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2983.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.containsAny(cs, org.apache.commons.lang3.CharSequenceUtils.toCharArray(searchChars))));
    }

    public static boolean containsAny(java.lang.CharSequence cs, java.lang.CharSequence... searchCharSequences) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchCharSequences))) {
            return ((_returnReplacementOperator2984.is("NULL")) ? ( null ) : (false));
        } 
        for (java.lang.CharSequence searchCharSequence : searchCharSequences) {
            if (org.apache.commons.lang3.StringUtils.contains(cs, searchCharSequence)) {
                return ((_returnReplacementOperator2985.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator2986.is("NULL")) ? ( null ) : (false));
    }

    public static int indexOfAnyBut(final java.lang.CharSequence cs, final char... searchChars) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(cs)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchChars))) {
            return ((_returnReplacementOperator3123.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3123.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3123.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        final int csLen = cs.length();
        final int csLast = csLen - 1;
        final int searchLen = searchChars.length;
        final int searchLast = searchLen - 1;
        outer : for (int i = 0 ; i < csLen ; i++) {
            final char ch = cs.charAt(i);
            for (int j = 0 ; j < searchLen ; j++) {
                if ((searchChars[j]) == ch) {
                    if (((i < csLast) && (j < searchLast)) && (java.lang.Character.isHighSurrogate(ch))) {
                        if ((searchChars[(j + 1)]) == (cs.charAt((i + 1)))) {
                            continue outer;
                        } 
                    } else {
                        continue outer;
                    }
                } 
            }
            return ((_returnReplacementOperator3124.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3124.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3124.is("ZERO")) ? ( 0 ) : (i));
        }
        return ((_returnReplacementOperator3125.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3125.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3125.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
    }

    public static int indexOfAnyBut(final java.lang.CharSequence seq, final java.lang.CharSequence searchChars) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(seq)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchChars))) {
            return ((_returnReplacementOperator3126.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3126.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3126.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        final int strLen = seq.length();
        for (int i = 0 ; i < strLen ; i++) {
            final char ch = seq.charAt(i);
            final boolean chFound = (org.apache.commons.lang3.CharSequenceUtils.indexOf(searchChars, ch, 0)) >= 0;
            if (((i + 1) < strLen) && (java.lang.Character.isHighSurrogate(ch))) {
                final char ch2 = seq.charAt((i + 1));
                if (chFound && ((org.apache.commons.lang3.CharSequenceUtils.indexOf(searchChars, ch2, 0)) < 0)) {
                    return ((_returnReplacementOperator3127.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3127.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3127.is("ZERO")) ? ( 0 ) : (i));
                } 
            } else {
                if (!chFound) {
                    return ((_returnReplacementOperator3128.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3128.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3128.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        }
        return ((_returnReplacementOperator3129.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3129.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3129.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
    }

    public static boolean containsOnly(final java.lang.CharSequence cs, final char... valid) {
        if ((valid == null) || (cs == null)) {
            return ((_returnReplacementOperator2997.is("NULL")) ? ( null ) : (false));
        } 
        if ((cs.length()) == 0) {
            return ((_returnReplacementOperator2998.is("NULL")) ? ( null ) : (true));
        } 
        if ((valid.length) == 0) {
            return ((_returnReplacementOperator2999.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator3000.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.StringUtils.indexOfAnyBut(cs, valid)) == (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND)));
    }

    public static boolean containsOnly(final java.lang.CharSequence cs, final java.lang.String validChars) {
        if ((cs == null) || (validChars == null)) {
            return ((_returnReplacementOperator3001.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator3002.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.containsOnly(cs, validChars.toCharArray())));
    }

    public static boolean containsNone(final java.lang.CharSequence cs, final char... searchChars) {
        if ((cs == null) || (searchChars == null)) {
            return ((_returnReplacementOperator2990.is("NULL")) ? ( null ) : (true));
        } 
        final int csLen = cs.length();
        final int csLast = csLen - 1;
        final int searchLen = searchChars.length;
        final int searchLast = searchLen - 1;
        for (int i = 0 ; i < csLen ; i++) {
            final char ch = cs.charAt(i);
            for (int j = 0 ; j < searchLen ; j++) {
                if ((searchChars[j]) == ch) {
                    if (java.lang.Character.isHighSurrogate(ch)) {
                        if (j == searchLast) {
                            return ((_returnReplacementOperator2991.is("NULL")) ? ( null ) : (false));
                        } 
                        if ((i < csLast) && ((searchChars[(j + 1)]) == (cs.charAt((i + 1))))) {
                            return ((_returnReplacementOperator2992.is("NULL")) ? ( null ) : (false));
                        } 
                    } else {
                        return ((_returnReplacementOperator2993.is("NULL")) ? ( null ) : (false));
                    }
                } 
            }
        }
        return ((_returnReplacementOperator2994.is("NULL")) ? ( null ) : (true));
    }

    public static boolean containsNone(final java.lang.CharSequence cs, final java.lang.String invalidChars) {
        if ((cs == null) || (invalidChars == null)) {
            return ((_returnReplacementOperator2995.is("NULL")) ? ( null ) : (true));
        } 
        return ((_returnReplacementOperator2996.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.containsNone(cs, invalidChars.toCharArray())));
    }

    public static int indexOfAny(final java.lang.CharSequence str, final java.lang.CharSequence... searchStrs) {
        if ((str == null) || (searchStrs == null)) {
            return ((_returnReplacementOperator3119.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3119.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3119.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        final int sz = searchStrs.length;
        int ret = java.lang.Integer.MAX_VALUE;
        int tmp = 0;
        for (int i = 0 ; i < sz ; i++) {
            final java.lang.CharSequence search = searchStrs[i];
            if (search == null) {
                continue;
            } 
            tmp = org.apache.commons.lang3.CharSequenceUtils.indexOf(str, search, 0);
            if (tmp == (INDEX_NOT_FOUND)) {
                continue;
            } 
            if (tmp < ret) {
                ret = tmp;
            } 
        }
        return ((_returnReplacementOperator3120.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3120.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3120.is("ZERO")) ? ( 0 ) : (ret == (java.lang.Integer.MAX_VALUE) ? org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND : ret));
    }

    public static int lastIndexOfAny(final java.lang.CharSequence str, final java.lang.CharSequence... searchStrs) {
        if ((str == null) || (searchStrs == null)) {
            return ((_returnReplacementOperator3153.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3153.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3153.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        final int sz = searchStrs.length;
        int ret = INDEX_NOT_FOUND;
        int tmp = 0;
        for (int i = 0 ; i < sz ; i++) {
            final java.lang.CharSequence search = searchStrs[i];
            if (search == null) {
                continue;
            } 
            tmp = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(str, search, str.length());
            if (tmp > ret) {
                ret = tmp;
            } 
        }
        return ((_returnReplacementOperator3154.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3154.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3154.is("ZERO")) ? ( 0 ) : (ret));
    }

    public static java.lang.String substring(final java.lang.String str, int start) {
        if (str == null) {
            return ((_returnReplacementOperator3397.is("NULL")) ? ( null ) : (null));
        } 
        if (start < 0) {
            start = (str.length()) + start;
        } 
        if (start < 0) {
            start = 0;
        } 
        if (start > (str.length())) {
            return ((_returnReplacementOperator3398.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator3399.is("NULL")) ? ( null ) : (str.substring(start)));
    }

    public static java.lang.String substring(final java.lang.String str, int start, int end) {
        if (str == null) {
            return ((_returnReplacementOperator3400.is("NULL")) ? ( null ) : (null));
        } 
        if (end < 0) {
            end = (str.length()) + end;
        } 
        if (start < 0) {
            start = (str.length()) + start;
        } 
        if (end > (str.length())) {
            end = str.length();
        } 
        if (start > end) {
            return ((_returnReplacementOperator3401.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        if (start < 0) {
            start = 0;
        } 
        if (end < 0) {
            end = 0;
        } 
        return ((_returnReplacementOperator3402.is("NULL")) ? ( null ) : (str.substring(start, end)));
    }

    public static java.lang.String left(final java.lang.String str, final int len) {
        if (str == null) {
            return ((_returnReplacementOperator3276.is("NULL")) ? ( null ) : (null));
        } 
        if (len < 0) {
            return ((_returnReplacementOperator3277.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        if ((str.length()) <= len) {
            return ((_returnReplacementOperator3278.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3279.is("NULL")) ? ( null ) : (str.substring(0, len)));
    }

    public static java.lang.String right(final java.lang.String str, final int len) {
        if (str == null) {
            return ((_returnReplacementOperator3365.is("NULL")) ? ( null ) : (null));
        } 
        if (len < 0) {
            return ((_returnReplacementOperator3366.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        if ((str.length()) <= len) {
            return ((_returnReplacementOperator3367.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3368.is("NULL")) ? ( null ) : (str.substring(((str.length()) - len))));
    }

    public static java.lang.String mid(final java.lang.String str, int pos, final int len) {
        if (str == null) {
            return ((_returnReplacementOperator3295.is("NULL")) ? ( null ) : (null));
        } 
        if ((len < 0) || (pos > (str.length()))) {
            return ((_returnReplacementOperator3296.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        if (pos < 0) {
            pos = 0;
        } 
        if ((str.length()) <= (pos + len)) {
            return ((_returnReplacementOperator3297.is("NULL")) ? ( null ) : (str.substring(pos)));
        } 
        return ((_returnReplacementOperator3298.is("NULL")) ? ( null ) : (str.substring(pos, (pos + len))));
    }

    public static java.lang.String substringBefore(final java.lang.String str, final java.lang.String separator) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (separator == null)) {
            return ((_returnReplacementOperator3411.is("NULL")) ? ( null ) : (str));
        } 
        if (separator.isEmpty()) {
            return ((_returnReplacementOperator3412.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final int pos = str.indexOf(separator);
        if (pos == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator3413.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3414.is("NULL")) ? ( null ) : (str.substring(0, pos)));
    }

    public static java.lang.String substringAfter(final java.lang.String str, final java.lang.String separator) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3403.is("NULL")) ? ( null ) : (str));
        } 
        if (separator == null) {
            return ((_returnReplacementOperator3404.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final int pos = str.indexOf(separator);
        if (pos == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator3405.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator3406.is("NULL")) ? ( null ) : (str.substring((pos + (separator.length())))));
    }

    public static java.lang.String substringBeforeLast(final java.lang.String str, final java.lang.String separator) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(separator))) {
            return ((_returnReplacementOperator3415.is("NULL")) ? ( null ) : (str));
        } 
        final int pos = str.lastIndexOf(separator);
        if (pos == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator3416.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3417.is("NULL")) ? ( null ) : (str.substring(0, pos)));
    }

    public static java.lang.String substringAfterLast(final java.lang.String str, final java.lang.String separator) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3407.is("NULL")) ? ( null ) : (str));
        } 
        if (org.apache.commons.lang3.StringUtils.isEmpty(separator)) {
            return ((_returnReplacementOperator3408.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final int pos = str.lastIndexOf(separator);
        if ((pos == (INDEX_NOT_FOUND)) || (pos == ((str.length()) - (separator.length())))) {
            return ((_returnReplacementOperator3409.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator3410.is("NULL")) ? ( null ) : (str.substring((pos + (separator.length())))));
    }

    public static java.lang.String substringBetween(final java.lang.String str, final java.lang.String tag) {
        return ((_returnReplacementOperator3418.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.substringBetween(str, tag, tag)));
    }

    public static java.lang.String substringBetween(final java.lang.String str, final java.lang.String open, final java.lang.String close) {
        if (((str == null) || (open == null)) || (close == null)) {
            return ((_returnReplacementOperator3419.is("NULL")) ? ( null ) : (null));
        } 
        final int start = str.indexOf(open);
        if (start != (INDEX_NOT_FOUND)) {
            final int end = str.indexOf(close, (start + (open.length())));
            if (end != (INDEX_NOT_FOUND)) {
                return ((_returnReplacementOperator3420.is("NULL")) ? ( null ) : (str.substring((start + (open.length())), end)));
            } 
        } 
        return ((_returnReplacementOperator3421.is("NULL")) ? ( null ) : (null));
    }

    public static java.lang.String[] substringsBetween(final java.lang.String str, final java.lang.String open, final java.lang.String close) {
        if (((str == null) || (org.apache.commons.lang3.StringUtils.isEmpty(open))) || (org.apache.commons.lang3.StringUtils.isEmpty(close))) {
            return ((_returnReplacementOperator3470.is("NULL")) ? ( null ) : (null));
        } 
        final int strLen = str.length();
        if (strLen == 0) {
            return ((_returnReplacementOperator3471.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        final int closeLen = close.length();
        final int openLen = open.length();
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        int pos = 0;
        while (pos < (strLen - closeLen)) {
            int start = str.indexOf(open, pos);
            if (start < 0) {
                break;
            } 
            start += openLen;
            final int end = str.indexOf(close, start);
            if (end < 0) {
                break;
            } 
            list.add(str.substring(start, end));
            pos = end + closeLen;
        }
        if (list.isEmpty()) {
            return ((_returnReplacementOperator3472.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3473.is("NULL")) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
    }

    public static java.lang.String[] split(final java.lang.String str) {
        return ((_returnReplacementOperator3440.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.split(str, null, -1)));
    }

    public static java.lang.String[] split(final java.lang.String str, final char separatorChar) {
        return ((_returnReplacementOperator3441.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChar, false)));
    }

    public static java.lang.String[] split(final java.lang.String str, final java.lang.String separatorChars) {
        return ((_returnReplacementOperator3442.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, -1, false)));
    }

    public static java.lang.String[] split(final java.lang.String str, final java.lang.String separatorChars, final int max) {
        return ((_returnReplacementOperator3443.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, max, false)));
    }

    public static java.lang.String[] splitByWholeSeparator(final java.lang.String str, final java.lang.String separator) {
        return ((_returnReplacementOperator3449.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, -1, false)));
    }

    public static java.lang.String[] splitByWholeSeparator(final java.lang.String str, final java.lang.String separator, final int max) {
        return ((_returnReplacementOperator3450.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, max, false)));
    }

    public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(final java.lang.String str, final java.lang.String separator) {
        return ((_returnReplacementOperator3451.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, -1, true)));
    }

    public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(final java.lang.String str, final java.lang.String separator, final int max) {
        return ((_returnReplacementOperator3452.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(str, separator, max, true)));
    }

    private static java.lang.String[] splitByWholeSeparatorWorker(final java.lang.String str, final java.lang.String separator, final int max, final boolean preserveAllTokens) {
        if (str == null) {
            return ((_returnReplacementOperator3453.is("NULL")) ? ( null ) : (null));
        } 
        final int len = str.length();
        if (len == 0) {
            return ((_returnReplacementOperator3454.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        if ((separator == null) || (EMPTY.equals(separator))) {
            return ((_returnReplacementOperator3455.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, null, max, preserveAllTokens)));
        } 
        final int separatorLength = separator.length();
        final java.util.ArrayList<java.lang.String> substrings = new java.util.ArrayList<java.lang.String>();
        int numberOfSubstrings = 0;
        int beg = 0;
        int end = 0;
        while (end < len) {
            end = str.indexOf(separator, beg);
            if (end > (-1)) {
                if (end > beg) {
                    numberOfSubstrings += 1;
                    if (numberOfSubstrings == max) {
                        end = len;
                        substrings.add(str.substring(beg));
                    } else {
                        substrings.add(str.substring(beg, end));
                        beg = end + separatorLength;
                    }
                } else {
                    if (preserveAllTokens) {
                        numberOfSubstrings += 1;
                        if (numberOfSubstrings == max) {
                            end = len;
                            substrings.add(str.substring(beg));
                        } else {
                            substrings.add(EMPTY);
                        }
                    } 
                    beg = end + separatorLength;
                }
            } else {
                substrings.add(str.substring(beg));
                end = len;
            }
        }
        return ((_returnReplacementOperator3456.is("NULL")) ? ( null ) : (substrings.toArray(new java.lang.String[substrings.size()])));
    }

    public static java.lang.String[] splitPreserveAllTokens(final java.lang.String str) {
        return ((_returnReplacementOperator3457.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, null, -1, true)));
    }

    public static java.lang.String[] splitPreserveAllTokens(final java.lang.String str, final char separatorChar) {
        return ((_returnReplacementOperator3458.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChar, true)));
    }

    private static java.lang.String[] splitWorker(final java.lang.String str, final char separatorChar, final boolean preserveAllTokens) {
        if (str == null) {
            return ((_returnReplacementOperator3461.is("NULL")) ? ( null ) : (null));
        } 
        final int len = str.length();
        if (len == 0) {
            return ((_returnReplacementOperator3462.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        int i = 0;
        int start = 0;
        boolean match = false;
        boolean lastMatch = false;
        while (i < len) {
            if ((str.charAt(i)) == separatorChar) {
                if (match || preserveAllTokens) {
                    list.add(str.substring(start, i));
                    match = false;
                    lastMatch = true;
                } 
                start = ++i;
                continue;
            } 
            lastMatch = false;
            match = true;
            i++;
        }
        if (match || (preserveAllTokens && lastMatch)) {
            list.add(str.substring(start, i));
        } 
        return ((_returnReplacementOperator3463.is("NULL")) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
    }

    public static java.lang.String[] splitPreserveAllTokens(final java.lang.String str, final java.lang.String separatorChars) {
        return ((_returnReplacementOperator3459.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, -1, true)));
    }

    public static java.lang.String[] splitPreserveAllTokens(final java.lang.String str, final java.lang.String separatorChars, final int max) {
        return ((_returnReplacementOperator3460.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitWorker(str, separatorChars, max, true)));
    }

    private static java.lang.String[] splitWorker(final java.lang.String str, final java.lang.String separatorChars, final int max, final boolean preserveAllTokens) {
        if (str == null) {
            return ((_returnReplacementOperator3464.is("NULL")) ? ( null ) : (null));
        } 
        final int len = str.length();
        if (len == 0) {
            return ((_returnReplacementOperator3465.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        int sizePlus1 = 1;
        int i = 0;
        int start = 0;
        boolean match = false;
        boolean lastMatch = false;
        if (separatorChars == null) {
            while (i < len) {
                if (java.lang.Character.isWhitespace(str.charAt(i))) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if ((sizePlus1++) == max) {
                            i = len;
                            lastMatch = false;
                        } 
                        list.add(str.substring(start, i));
                        match = false;
                    } 
                    start = ++i;
                    continue;
                } 
                lastMatch = false;
                match = true;
                i++;
            }
        } else if ((separatorChars.length()) == 1) {
            final char sep = separatorChars.charAt(0);
            while (i < len) {
                if ((str.charAt(i)) == sep) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if ((sizePlus1++) == max) {
                            i = len;
                            lastMatch = false;
                        } 
                        list.add(str.substring(start, i));
                        match = false;
                    } 
                    start = ++i;
                    continue;
                } 
                lastMatch = false;
                match = true;
                i++;
            }
        } else {
            while (i < len) {
                if ((separatorChars.indexOf(str.charAt(i))) >= 0) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if ((sizePlus1++) == max) {
                            i = len;
                            lastMatch = false;
                        } 
                        list.add(str.substring(start, i));
                        match = false;
                    } 
                    start = ++i;
                    continue;
                } 
                lastMatch = false;
                match = true;
                i++;
            }
        }
        if (match || (preserveAllTokens && lastMatch)) {
            list.add(str.substring(start, i));
        } 
        return ((_returnReplacementOperator3466.is("NULL")) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
    }

    public static java.lang.String[] splitByCharacterType(final java.lang.String str) {
        return ((_returnReplacementOperator3444.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitByCharacterType(str, false)));
    }

    public static java.lang.String[] splitByCharacterTypeCamelCase(final java.lang.String str) {
        return ((_returnReplacementOperator3448.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.splitByCharacterType(str, true)));
    }

    private static java.lang.String[] splitByCharacterType(final java.lang.String str, final boolean camelCase) {
        if (str == null) {
            return ((_returnReplacementOperator3445.is("NULL")) ? ( null ) : (null));
        } 
        if (str.isEmpty()) {
            return ((_returnReplacementOperator3446.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        final char[] c = str.toCharArray();
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        int tokenStart = 0;
        int currentType = java.lang.Character.getType(c[tokenStart]);
        for (int pos = tokenStart + 1 ; pos < (c.length) ; pos++) {
            final int type = java.lang.Character.getType(c[pos]);
            if (type == currentType) {
                continue;
            } 
            if ((camelCase && (type == (java.lang.Character.LOWERCASE_LETTER))) && (currentType == (java.lang.Character.UPPERCASE_LETTER))) {
                final int newTokenStart = pos - 1;
                if (newTokenStart != tokenStart) {
                    list.add(new java.lang.String(c , tokenStart , (newTokenStart - tokenStart)));
                    tokenStart = newTokenStart;
                } 
            } else {
                list.add(new java.lang.String(c , tokenStart , (pos - tokenStart)));
                tokenStart = pos;
            }
            currentType = type;
        }
        list.add(new java.lang.String(c , tokenStart , ((c.length) - tokenStart)));
        return ((_returnReplacementOperator3447.is("NULL")) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
    }

    public static <T>java.lang.String join(final T... elements) {
        return ((_returnReplacementOperator2972.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(elements, null)));
    }

    public static java.lang.String join(final java.lang.Object[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3247.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3248.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final long[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3265.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3266.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final int[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3238.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3239.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final short[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3270.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3271.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final byte[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3218.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3219.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final char[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3223.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3224.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final float[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3233.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3234.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final double[] array, final char separator) {
        if (array == null) {
            return ((_returnReplacementOperator3228.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3229.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final java.lang.Object[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3249.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3250.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            if ((array[i]) != null) {
                buf.append(array[i]);
            } 
        }
        return ((_returnReplacementOperator3251.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final long[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3267.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3268.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            buf.append(array[i]);
        }
        return ((_returnReplacementOperator3269.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final int[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3240.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3241.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            buf.append(array[i]);
        }
        return ((_returnReplacementOperator3242.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final byte[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3220.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3221.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            buf.append(array[i]);
        }
        return ((_returnReplacementOperator3222.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final short[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3272.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3273.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            buf.append(array[i]);
        }
        return ((_returnReplacementOperator3274.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final char[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3225.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3226.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            buf.append(array[i]);
        }
        return ((_returnReplacementOperator3227.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final double[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3230.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3231.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            buf.append(array[i]);
        }
        return ((_returnReplacementOperator3232.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final float[] array, final char separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3235.is("NULL")) ? ( null ) : (null));
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3236.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            buf.append(array[i]);
        }
        return ((_returnReplacementOperator3237.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final java.lang.Object[] array, final java.lang.String separator) {
        if (array == null) {
            return ((_returnReplacementOperator3252.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3253.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(array, separator, 0, array.length)));
    }

    public static java.lang.String join(final java.lang.Object[] array, java.lang.String separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return ((_returnReplacementOperator3254.is("NULL")) ? ( null ) : (null));
        } 
        if (separator == null) {
            separator = EMPTY;
        } 
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return ((_returnReplacementOperator3255.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder((noOfItems * 16));
        for (int i = startIndex ; i < endIndex ; i++) {
            if (i > startIndex) {
                buf.append(separator);
            } 
            if ((array[i]) != null) {
                buf.append(array[i]);
            } 
        }
        return ((_returnReplacementOperator3256.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final java.util.Iterator<?> iterator, final char separator) {
        if (iterator == null) {
            return ((_returnReplacementOperator3257.is("NULL")) ? ( null ) : (null));
        } 
        if (!(iterator.hasNext())) {
            return ((_returnReplacementOperator3258.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.Object first = iterator.next();
        if (!(iterator.hasNext())) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String result = org.apache.commons.lang3.ObjectUtils.toString(first);
            return ((_returnReplacementOperator3259.is("NULL")) ? ( null ) : (result));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(256);
        if (first != null) {
            buf.append(first);
        } 
        while (iterator.hasNext()) {
            buf.append(separator);
            final java.lang.Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            } 
        }
        return ((_returnReplacementOperator3260.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final java.util.Iterator<?> iterator, final java.lang.String separator) {
        if (iterator == null) {
            return ((_returnReplacementOperator3261.is("NULL")) ? ( null ) : (null));
        } 
        if (!(iterator.hasNext())) {
            return ((_returnReplacementOperator3262.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.Object first = iterator.next();
        if (!(iterator.hasNext())) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String result = org.apache.commons.lang3.ObjectUtils.toString(first);
            return ((_returnReplacementOperator3263.is("NULL")) ? ( null ) : (result));
        } 
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(256);
        if (first != null) {
            buf.append(first);
        } 
        while (iterator.hasNext()) {
            if (separator != null) {
                buf.append(separator);
            } 
            final java.lang.Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            } 
        }
        return ((_returnReplacementOperator3264.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String join(final java.lang.Iterable<?> iterable, final char separator) {
        if (iterable == null) {
            return ((_returnReplacementOperator3243.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3244.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(iterable.iterator(), separator)));
    }

    public static java.lang.String join(final java.lang.Iterable<?> iterable, final java.lang.String separator) {
        if (iterable == null) {
            return ((_returnReplacementOperator3245.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3246.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(iterable.iterator(), separator)));
    }

    public static java.lang.String joinWith(final java.lang.String separator, final java.lang.Object... objects) {
        if (objects == null) {
            throw new java.lang.IllegalArgumentException("Object varargs must not be null");
        } 
        final java.lang.String sanitizedSeparator = org.apache.commons.lang3.StringUtils.defaultString(separator, EMPTY);
        final java.lang.StringBuilder result = new java.lang.StringBuilder();
        final java.util.Iterator<java.lang.Object> iterator = java.util.Arrays.asList(objects).iterator();
        while (iterator.hasNext()) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String value = org.apache.commons.lang3.ObjectUtils.toString(iterator.next());
            result.append(value);
            if (iterator.hasNext()) {
                result.append(sanitizedSeparator);
            } 
        }
        return ((_returnReplacementOperator3275.is("NULL")) ? ( null ) : (result.toString()));
    }

    public static java.lang.String deleteWhitespace(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3205.is("NULL")) ? ( null ) : (str));
        } 
        final int sz = str.length();
        final char[] chs = new char[sz];
        int count = 0;
        for (int i = 0 ; i < sz ; i++) {
            if (!(java.lang.Character.isWhitespace(str.charAt(i)))) {
                chs[count++] = str.charAt(i);
            } 
        }
        if (count == sz) {
            return ((_returnReplacementOperator3206.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3207.is("NULL")) ? ( null ) : (new java.lang.String(chs , 0 , count)));
    }

    public static java.lang.String removeStart(final java.lang.String str, final java.lang.String remove) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
            return ((_returnReplacementOperator3322.is("NULL")) ? ( null ) : (str));
        } 
        if (str.startsWith(remove)) {
            return ((_returnReplacementOperator3323.is("NULL")) ? ( null ) : (str.substring(remove.length())));
        } 
        return ((_returnReplacementOperator3324.is("NULL")) ? ( null ) : (str));
    }

    public static java.lang.String removeStartIgnoreCase(final java.lang.String str, final java.lang.String remove) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
            return ((_returnReplacementOperator3325.is("NULL")) ? ( null ) : (str));
        } 
        if (org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(str, remove)) {
            return ((_returnReplacementOperator3326.is("NULL")) ? ( null ) : (str.substring(remove.length())));
        } 
        return ((_returnReplacementOperator3327.is("NULL")) ? ( null ) : (str));
    }

    public static java.lang.String removeEnd(final java.lang.String str, final java.lang.String remove) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
            return ((_returnReplacementOperator3314.is("NULL")) ? ( null ) : (str));
        } 
        if (str.endsWith(remove)) {
            return ((_returnReplacementOperator3315.is("NULL")) ? ( null ) : (str.substring(0, ((str.length()) - (remove.length())))));
        } 
        return ((_returnReplacementOperator3316.is("NULL")) ? ( null ) : (str));
    }

    public static java.lang.String removeEndIgnoreCase(final java.lang.String str, final java.lang.String remove) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
            return ((_returnReplacementOperator3317.is("NULL")) ? ( null ) : (str));
        } 
        if (org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(str, remove)) {
            return ((_returnReplacementOperator3318.is("NULL")) ? ( null ) : (str.substring(0, ((str.length()) - (remove.length())))));
        } 
        return ((_returnReplacementOperator3319.is("NULL")) ? ( null ) : (str));
    }

    public static java.lang.String remove(final java.lang.String str, final java.lang.String remove) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(remove))) {
            return ((_returnReplacementOperator3311.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3312.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replace(str, remove, org.apache.commons.lang3.StringUtils.EMPTY, -1)));
    }

    public static java.lang.String remove(final java.lang.String str, final char remove) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || ((str.indexOf(remove)) == (INDEX_NOT_FOUND))) {
            return ((_returnReplacementOperator3309.is("NULL")) ? ( null ) : (str));
        } 
        final char[] chars = str.toCharArray();
        int pos = 0;
        for (int i = 0 ; i < (chars.length) ; i++) {
            if ((chars[i]) != remove) {
                chars[pos++] = chars[i];
            } 
        }
        return ((_returnReplacementOperator3310.is("NULL")) ? ( null ) : (new java.lang.String(chars , 0 , pos)));
    }

    public static java.lang.String removeAll(final java.lang.String text, final java.lang.String regex) {
        return ((_returnReplacementOperator3313.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replaceAll(text, regex, org.apache.commons.lang3.StringUtils.EMPTY)));
    }

    public static java.lang.String removeFirst(final java.lang.String text, final java.lang.String regex) {
        return ((_returnReplacementOperator3320.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replaceFirst(text, regex, org.apache.commons.lang3.StringUtils.EMPTY)));
    }

    public static java.lang.String replaceOnce(final java.lang.String text, final java.lang.String searchString, final java.lang.String replacement) {
        return ((_returnReplacementOperator3358.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replace(text, searchString, replacement, 1)));
    }

    public static java.lang.String replacePattern(final java.lang.String source, final java.lang.String regex, final java.lang.String replacement) {
        if (((source == null) || (regex == null)) || (replacement == null)) {
            return ((_returnReplacementOperator3359.is("NULL")) ? ( null ) : (source));
        } 
        return ((_returnReplacementOperator3360.is("NULL")) ? ( null ) : (java.util.regex.Pattern.compile(regex, java.util.regex.Pattern.DOTALL).matcher(source).replaceAll(replacement)));
    }

    public static java.lang.String removePattern(final java.lang.String source, final java.lang.String regex) {
        return ((_returnReplacementOperator3321.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replacePattern(source, regex, org.apache.commons.lang3.StringUtils.EMPTY)));
    }

    public static java.lang.String replaceAll(final java.lang.String text, final java.lang.String regex, final java.lang.String replacement) {
        if (((text == null) || (regex == null)) || (replacement == null)) {
            return ((_returnReplacementOperator3343.is("NULL")) ? ( null ) : (text));
        } 
        return ((_returnReplacementOperator3344.is("NULL")) ? ( null ) : (text.replaceAll(regex, replacement)));
    }

    public static java.lang.String replaceFirst(final java.lang.String text, final java.lang.String regex, final java.lang.String replacement) {
        if (((text == null) || (regex == null)) || (replacement == null)) {
            return ((_returnReplacementOperator3356.is("NULL")) ? ( null ) : (text));
        } 
        return ((_returnReplacementOperator3357.is("NULL")) ? ( null ) : (text.replaceFirst(regex, replacement)));
    }

    public static java.lang.String replace(final java.lang.String text, final java.lang.String searchString, final java.lang.String replacement) {
        return ((_returnReplacementOperator3339.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replace(text, searchString, replacement, -1)));
    }

    public static java.lang.String replace(final java.lang.String text, final java.lang.String searchString, final java.lang.String replacement, int max) {
        if ((((org.apache.commons.lang3.StringUtils.isEmpty(text)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchString))) || (replacement == null)) || (max == 0)) {
            return ((_returnReplacementOperator3340.is("NULL")) ? ( null ) : (text));
        } 
        int start = 0;
        int end = text.indexOf(searchString, start);
        if (end == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator3341.is("NULL")) ? ( null ) : (text));
        } 
        final int replLength = searchString.length();
        int increase = (replacement.length()) - replLength;
        increase = increase < 0 ? 0 : increase;
        increase *= max < 0 ? 16 : max > 64 ? 64 : max;
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(((text.length()) + increase));
        while (end != (INDEX_NOT_FOUND)) {
            buf.append(text.substring(start, end)).append(replacement);
            start = end + replLength;
            if ((--max) == 0) {
                break;
            } 
            end = text.indexOf(searchString, start);
        }
        buf.append(text.substring(start));
        return ((_returnReplacementOperator3342.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public static java.lang.String replaceEach(final java.lang.String text, final java.lang.String[] searchList, final java.lang.String[] replacementList) {
        return ((_returnReplacementOperator3350.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replaceEach(text, searchList, replacementList, false, 0)));
    }

    public static java.lang.String replaceEachRepeatedly(final java.lang.String text, final java.lang.String[] searchList, final java.lang.String[] replacementList) {
        final int timeToLive = searchList == null ? 0 : searchList.length;
        return ((_returnReplacementOperator3355.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replaceEach(text, searchList, replacementList, true, timeToLive)));
    }

    private static java.lang.String replaceEach(final java.lang.String text, final java.lang.String[] searchList, final java.lang.String[] replacementList, final boolean repeat, final int timeToLive) {
        if ((((((text == null) || (text.isEmpty())) || (searchList == null)) || ((searchList.length) == 0)) || (replacementList == null)) || ((replacementList.length) == 0)) {
            return ((_returnReplacementOperator3351.is("NULL")) ? ( null ) : (text));
        } 
        if (timeToLive < 0) {
            throw new java.lang.IllegalStateException(("Aborting to protect against StackOverflowError - " + "output of one loop is the input of another"));
        } 
        final int searchLength = searchList.length;
        final int replacementLength = replacementList.length;
        if (searchLength != replacementLength) {
            throw new java.lang.IllegalArgumentException(((("Search and Replace array lengths don't match: " + searchLength) + " vs ") + replacementLength));
        } 
        final boolean[] noMoreMatchesForReplIndex = new boolean[searchLength];
        int textIndex = -1;
        int replaceIndex = -1;
        int tempIndex = -1;
        for (int i = 0 ; i < searchLength ; i++) {
            if ((((noMoreMatchesForReplIndex[i]) || ((searchList[i]) == null)) || (searchList[i].isEmpty())) || ((replacementList[i]) == null)) {
                continue;
            } 
            tempIndex = text.indexOf(searchList[i]);
            if (tempIndex == (-1)) {
                noMoreMatchesForReplIndex[i] = true;
            } else {
                if ((textIndex == (-1)) || (tempIndex < textIndex)) {
                    textIndex = tempIndex;
                    replaceIndex = i;
                } 
            }
        }
        if (textIndex == (-1)) {
            return ((_returnReplacementOperator3352.is("NULL")) ? ( null ) : (text));
        } 
        int start = 0;
        int increase = 0;
        for (int i = 0 ; i < (searchList.length) ; i++) {
            if (((searchList[i]) == null) || ((replacementList[i]) == null)) {
                continue;
            } 
            final int greater = (replacementList[i].length()) - (searchList[i].length());
            if (greater > 0) {
                increase += 3 * greater;
            } 
        }
        increase = java.lang.Math.min(increase, ((text.length()) / 5));
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(((text.length()) + increase));
        while (textIndex != (-1)) {
            for (int i = start ; i < textIndex ; i++) {
                buf.append(text.charAt(i));
            }
            buf.append(replacementList[replaceIndex]);
            start = textIndex + (searchList[replaceIndex].length());
            textIndex = -1;
            replaceIndex = -1;
            tempIndex = -1;
            for (int i = 0 ; i < searchLength ; i++) {
                if ((((noMoreMatchesForReplIndex[i]) || ((searchList[i]) == null)) || (searchList[i].isEmpty())) || ((replacementList[i]) == null)) {
                    continue;
                } 
                tempIndex = text.indexOf(searchList[i], start);
                if (tempIndex == (-1)) {
                    noMoreMatchesForReplIndex[i] = true;
                } else {
                    if ((textIndex == (-1)) || (tempIndex < textIndex)) {
                        textIndex = tempIndex;
                        replaceIndex = i;
                    } 
                }
            }
        }
        final int textLength = text.length();
        for (int i = start ; i < textLength ; i++) {
            buf.append(text.charAt(i));
        }
        final java.lang.String result = buf.toString();
        if (!repeat) {
            return ((_returnReplacementOperator3353.is("NULL")) ? ( null ) : (result));
        } 
        return ((_returnReplacementOperator3354.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.replaceEach(result, searchList, replacementList, repeat, (timeToLive - 1))));
    }

    public static java.lang.String replaceChars(final java.lang.String str, final char searchChar, final char replaceChar) {
        if (str == null) {
            return ((_returnReplacementOperator3345.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3346.is("NULL")) ? ( null ) : (str.replace(searchChar, replaceChar)));
    }

    public static java.lang.String replaceChars(final java.lang.String str, final java.lang.String searchChars, java.lang.String replaceChars) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(searchChars))) {
            return ((_returnReplacementOperator3347.is("NULL")) ? ( null ) : (str));
        } 
        if (replaceChars == null) {
            replaceChars = EMPTY;
        } 
        boolean modified = false;
        final int replaceCharsLength = replaceChars.length();
        final int strLength = str.length();
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(strLength);
        for (int i = 0 ; i < strLength ; i++) {
            final char ch = str.charAt(i);
            final int index = searchChars.indexOf(ch);
            if (index >= 0) {
                modified = true;
                if (index < replaceCharsLength) {
                    buf.append(replaceChars.charAt(index));
                } 
            } else {
                buf.append(ch);
            }
        }
        if (modified) {
            return ((_returnReplacementOperator3348.is("NULL")) ? ( null ) : (buf.toString()));
        } 
        return ((_returnReplacementOperator3349.is("NULL")) ? ( null ) : (str));
    }

    public static java.lang.String overlay(final java.lang.String str, java.lang.String overlay, int start, int end) {
        if (str == null) {
            return ((_returnReplacementOperator3302.is("NULL")) ? ( null ) : (null));
        } 
        if (overlay == null) {
            overlay = EMPTY;
        } 
        final int len = str.length();
        if (start < 0) {
            start = 0;
        } 
        if (start > len) {
            start = len;
        } 
        if (end < 0) {
            end = 0;
        } 
        if (end > len) {
            end = len;
        } 
        if (start > end) {
            final int temp = start;
            start = end;
            end = temp;
        } 
        return ((_returnReplacementOperator3303.is("NULL")) ? ( null ) : (new java.lang.StringBuilder(((((len + start) - end) + (overlay.length())) + 1)).append(str.substring(0, start)).append(overlay).append(str.substring(end)).toString()));
    }

    public static java.lang.String chomp(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3194.is("NULL")) ? ( null ) : (str));
        } 
        if ((str.length()) == 1) {
            final char ch = str.charAt(0);
            if ((ch == (org.apache.commons.lang3.CharUtils.CR)) || (ch == (org.apache.commons.lang3.CharUtils.LF))) {
                return ((_returnReplacementOperator3195.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
            } 
            return ((_returnReplacementOperator3196.is("NULL")) ? ( null ) : (str));
        } 
        int lastIdx = (str.length()) - 1;
        final char last = str.charAt(lastIdx);
        if (last == (org.apache.commons.lang3.CharUtils.LF)) {
            if ((str.charAt((lastIdx - 1))) == (org.apache.commons.lang3.CharUtils.CR)) {
                lastIdx--;
            } 
        } else if (last != (org.apache.commons.lang3.CharUtils.CR)) {
            lastIdx++;
        } 
        return ((_returnReplacementOperator3197.is("NULL")) ? ( null ) : (str.substring(0, lastIdx)));
    }

    @java.lang.Deprecated
    public static java.lang.String chomp(final java.lang.String str, final java.lang.String separator) {
        return ((_returnReplacementOperator3198.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.removeEnd(str, separator)));
    }

    public static java.lang.String chop(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator3199.is("NULL")) ? ( null ) : (null));
        } 
        final int strLen = str.length();
        if (strLen < 2) {
            return ((_returnReplacementOperator3200.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final int lastIdx = strLen - 1;
        final java.lang.String ret = str.substring(0, lastIdx);
        final char last = str.charAt(lastIdx);
        if ((last == (org.apache.commons.lang3.CharUtils.LF)) && ((ret.charAt((lastIdx - 1))) == (org.apache.commons.lang3.CharUtils.CR))) {
            return ((_returnReplacementOperator3201.is("NULL")) ? ( null ) : (ret.substring(0, (lastIdx - 1))));
        } 
        return ((_returnReplacementOperator3202.is("NULL")) ? ( null ) : (ret));
    }

    public static java.lang.String repeat(final java.lang.String str, final int repeat) {
        if (str == null) {
            return ((_returnReplacementOperator3330.is("NULL")) ? ( null ) : (null));
        } 
        if (repeat <= 0) {
            return ((_returnReplacementOperator3331.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final int inputLength = str.length();
        if ((repeat == 1) || (inputLength == 0)) {
            return ((_returnReplacementOperator3332.is("NULL")) ? ( null ) : (str));
        } 
        if ((inputLength == 1) && (repeat <= (PAD_LIMIT))) {
            return ((_returnReplacementOperator3333.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.repeat(str.charAt(0), repeat)));
        } 
        final int outputLength = inputLength * repeat;
        switch (inputLength) {
            case 1 :
                return ((_returnReplacementOperator3334.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.repeat(str.charAt(0), repeat)));
            case 2 :
                final char ch0 = str.charAt(0);
                final char ch1 = str.charAt(1);
                final char[] output2 = new char[outputLength];
                for (int i = (repeat * 2) - 2 ; i >= 0 ; i-- , i--) {
                    output2[i] = ch0;
                    output2[(i + 1)] = ch1;
                }
                return ((_returnReplacementOperator3335.is("NULL")) ? ( null ) : (new java.lang.String(output2)));
            default :
                final java.lang.StringBuilder buf = new java.lang.StringBuilder(outputLength);
                for (int i = 0 ; i < repeat ; i++) {
                    buf.append(str);
                }
                return ((_returnReplacementOperator3336.is("NULL")) ? ( null ) : (buf.toString()));
        }
    }

    public static java.lang.String repeat(final java.lang.String str, final java.lang.String separator, final int repeat) {
        if ((str == null) || (separator == null)) {
            return ((_returnReplacementOperator3337.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.repeat(str, repeat)));
        } 
        final java.lang.String result = org.apache.commons.lang3.StringUtils.repeat((str + separator), repeat);
        return ((_returnReplacementOperator3338.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.removeEnd(result, separator)));
    }

    public static java.lang.String repeat(final char ch, final int repeat) {
        if (repeat <= 0) {
            return ((_returnReplacementOperator3328.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final char[] buf = new char[repeat];
        for (int i = repeat - 1 ; i >= 0 ; i--) {
            buf[i] = ch;
        }
        return ((_returnReplacementOperator3329.is("NULL")) ? ( null ) : (new java.lang.String(buf)));
    }

    public static java.lang.String rightPad(final java.lang.String str, final int size) {
        return ((_returnReplacementOperator3369.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.rightPad(str, size, ' ')));
    }

    public static java.lang.String rightPad(final java.lang.String str, final int size, final char padChar) {
        if (str == null) {
            return ((_returnReplacementOperator3370.is("NULL")) ? ( null ) : (null));
        } 
        final int pads = size - (str.length());
        if (pads <= 0) {
            return ((_returnReplacementOperator3371.is("NULL")) ? ( null ) : (str));
        } 
        if (pads > (PAD_LIMIT)) {
            return ((_returnReplacementOperator3372.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.rightPad(str, size, java.lang.String.valueOf(padChar))));
        } 
        return ((_returnReplacementOperator3373.is("NULL")) ? ( null ) : (str.concat(org.apache.commons.lang3.StringUtils.repeat(padChar, pads))));
    }

    public static java.lang.String rightPad(final java.lang.String str, final int size, java.lang.String padStr) {
        if (str == null) {
            return ((_returnReplacementOperator3374.is("NULL")) ? ( null ) : (null));
        } 
        if (org.apache.commons.lang3.StringUtils.isEmpty(padStr)) {
            padStr = SPACE;
        } 
        final int padLen = padStr.length();
        final int strLen = str.length();
        final int pads = size - strLen;
        if (pads <= 0) {
            return ((_returnReplacementOperator3375.is("NULL")) ? ( null ) : (str));
        } 
        if ((padLen == 1) && (pads <= (PAD_LIMIT))) {
            return ((_returnReplacementOperator3376.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.rightPad(str, size, padStr.charAt(0))));
        } 
        if (pads == padLen) {
            return ((_returnReplacementOperator3377.is("NULL")) ? ( null ) : (str.concat(padStr)));
        } else if (pads < padLen) {
            return ((_returnReplacementOperator3378.is("NULL")) ? ( null ) : (str.concat(padStr.substring(0, pads))));
        } else {
            final char[] padding = new char[pads];
            final char[] padChars = padStr.toCharArray();
            for (int i = 0 ; i < pads ; i++) {
                padding[i] = padChars[(i % padLen)];
            }
            return ((_returnReplacementOperator3379.is("NULL")) ? ( null ) : (str.concat(new java.lang.String(padding))));
        }
    }

    public static java.lang.String leftPad(final java.lang.String str, final int size) {
        return ((_returnReplacementOperator3280.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.leftPad(str, size, ' ')));
    }

    public static java.lang.String leftPad(final java.lang.String str, final int size, final char padChar) {
        if (str == null) {
            return ((_returnReplacementOperator3281.is("NULL")) ? ( null ) : (null));
        } 
        final int pads = size - (str.length());
        if (pads <= 0) {
            return ((_returnReplacementOperator3282.is("NULL")) ? ( null ) : (str));
        } 
        if (pads > (PAD_LIMIT)) {
            return ((_returnReplacementOperator3283.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.leftPad(str, size, java.lang.String.valueOf(padChar))));
        } 
        return ((_returnReplacementOperator3284.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.repeat(padChar, pads).concat(str)));
    }

    public static java.lang.String leftPad(final java.lang.String str, final int size, java.lang.String padStr) {
        if (str == null) {
            return ((_returnReplacementOperator3285.is("NULL")) ? ( null ) : (null));
        } 
        if (org.apache.commons.lang3.StringUtils.isEmpty(padStr)) {
            padStr = SPACE;
        } 
        final int padLen = padStr.length();
        final int strLen = str.length();
        final int pads = size - strLen;
        if (pads <= 0) {
            return ((_returnReplacementOperator3286.is("NULL")) ? ( null ) : (str));
        } 
        if ((padLen == 1) && (pads <= (PAD_LIMIT))) {
            return ((_returnReplacementOperator3287.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.leftPad(str, size, padStr.charAt(0))));
        } 
        if (pads == padLen) {
            return ((_returnReplacementOperator3288.is("NULL")) ? ( null ) : (padStr.concat(str)));
        } else if (pads < padLen) {
            return ((_returnReplacementOperator3289.is("NULL")) ? ( null ) : (padStr.substring(0, pads).concat(str)));
        } else {
            final char[] padding = new char[pads];
            final char[] padChars = padStr.toCharArray();
            for (int i = 0 ; i < pads ; i++) {
                padding[i] = padChars[(i % padLen)];
            }
            return ((_returnReplacementOperator3290.is("NULL")) ? ( null ) : (new java.lang.String(padding).concat(str)));
        }
    }

    public static int length(final java.lang.CharSequence cs) {
        return ((_returnReplacementOperator3163.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3163.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3163.is("ZERO")) ? ( 0 ) : (cs == null ? 0 : cs.length()));
    }

    public static java.lang.String center(final java.lang.String str, final int size) {
        return ((_returnReplacementOperator3187.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.center(str, size, ' ')));
    }

    public static java.lang.String center(java.lang.String str, final int size, final char padChar) {
        if ((str == null) || (size <= 0)) {
            return ((_returnReplacementOperator3188.is("NULL")) ? ( null ) : (str));
        } 
        final int strLen = str.length();
        final int pads = size - strLen;
        if (pads <= 0) {
            return ((_returnReplacementOperator3189.is("NULL")) ? ( null ) : (str));
        } 
        str = org.apache.commons.lang3.StringUtils.leftPad(str, (strLen + (pads / 2)), padChar);
        str = org.apache.commons.lang3.StringUtils.rightPad(str, size, padChar);
        return ((_returnReplacementOperator3190.is("NULL")) ? ( null ) : (str));
    }

    public static java.lang.String center(java.lang.String str, final int size, java.lang.String padStr) {
        if ((str == null) || (size <= 0)) {
            return ((_returnReplacementOperator3191.is("NULL")) ? ( null ) : (str));
        } 
        if (org.apache.commons.lang3.StringUtils.isEmpty(padStr)) {
            padStr = SPACE;
        } 
        final int strLen = str.length();
        final int pads = size - strLen;
        if (pads <= 0) {
            return ((_returnReplacementOperator3192.is("NULL")) ? ( null ) : (str));
        } 
        str = org.apache.commons.lang3.StringUtils.leftPad(str, (strLen + (pads / 2)), padStr);
        str = org.apache.commons.lang3.StringUtils.rightPad(str, size, padStr);
        return ((_returnReplacementOperator3193.is("NULL")) ? ( null ) : (str));
    }

    public static java.lang.String upperCase(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator3432.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3433.is("NULL")) ? ( null ) : (str.toUpperCase()));
    }

    public static java.lang.String upperCase(final java.lang.String str, final java.util.Locale locale) {
        if (str == null) {
            return ((_returnReplacementOperator3434.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3435.is("NULL")) ? ( null ) : (str.toUpperCase(locale)));
    }

    public static java.lang.String lowerCase(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator3291.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3292.is("NULL")) ? ( null ) : (str.toLowerCase()));
    }

    public static java.lang.String lowerCase(final java.lang.String str, final java.util.Locale locale) {
        if (str == null) {
            return ((_returnReplacementOperator3293.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3294.is("NULL")) ? ( null ) : (str.toLowerCase(locale)));
    }

    public static java.lang.String capitalize(final java.lang.String str) {
        int strLen;
        if ((str == null) || ((strLen = str.length()) == 0)) {
            return ((_returnReplacementOperator3184.is("NULL")) ? ( null ) : (str));
        } 
        final char firstChar = str.charAt(0);
        final char newChar = java.lang.Character.toTitleCase(firstChar);
        if (firstChar == newChar) {
            return ((_returnReplacementOperator3185.is("NULL")) ? ( null ) : (str));
        } 
        char[] newChars = new char[strLen];
        newChars[0] = newChar;
        str.getChars(1, strLen, newChars, 1);
        return ((_returnReplacementOperator3186.is("NULL")) ? ( null ) : (java.lang.String.valueOf(newChars)));
    }

    public static java.lang.String uncapitalize(final java.lang.String str) {
        int strLen;
        if ((str == null) || ((strLen = str.length()) == 0)) {
            return ((_returnReplacementOperator3429.is("NULL")) ? ( null ) : (str));
        } 
        final char firstChar = str.charAt(0);
        final char newChar = java.lang.Character.toLowerCase(firstChar);
        if (firstChar == newChar) {
            return ((_returnReplacementOperator3430.is("NULL")) ? ( null ) : (str));
        } 
        char[] newChars = new char[strLen];
        newChars[0] = newChar;
        str.getChars(1, strLen, newChars, 1);
        return ((_returnReplacementOperator3431.is("NULL")) ? ( null ) : (java.lang.String.valueOf(newChars)));
    }

    public static java.lang.String swapCase(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3422.is("NULL")) ? ( null ) : (str));
        } 
        final char[] buffer = str.toCharArray();
        for (int i = 0 ; i < (buffer.length) ; i++) {
            final char ch = buffer[i];
            if (java.lang.Character.isUpperCase(ch)) {
                buffer[i] = java.lang.Character.toLowerCase(ch);
            } else if (java.lang.Character.isTitleCase(ch)) {
                buffer[i] = java.lang.Character.toLowerCase(ch);
            } else if (java.lang.Character.isLowerCase(ch)) {
                buffer[i] = java.lang.Character.toUpperCase(ch);
            } 
        }
        return ((_returnReplacementOperator3423.is("NULL")) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static int countMatches(final java.lang.CharSequence str, final java.lang.CharSequence sub) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(sub))) {
            return ((_returnReplacementOperator3096.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3096.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3096.is("ZERO")) ? ( 0 ) : (0));
        } 
        int count = 0;
        int idx = 0;
        while ((idx = org.apache.commons.lang3.CharSequenceUtils.indexOf(str, sub, idx)) != (INDEX_NOT_FOUND)) {
            count++;
            idx += sub.length();
        }
        return ((_returnReplacementOperator3097.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3097.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3097.is("ZERO")) ? ( 0 ) : (count));
    }

    public static int countMatches(final java.lang.CharSequence str, final char ch) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3094.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3094.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3094.is("ZERO")) ? ( 0 ) : (0));
        } 
        int count = 0;
        for (int i = 0 ; i < (str.length()) ; i++) {
            if (ch == (str.charAt(i))) {
                count++;
            } 
        }
        return ((_returnReplacementOperator3095.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3095.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3095.is("ZERO")) ? ( 0 ) : (count));
    }

    public static boolean isAlpha(final java.lang.CharSequence cs) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(cs)) {
            return ((_returnReplacementOperator3033.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if ((java.lang.Character.isLetter(cs.charAt(i))) == false) {
                return ((_returnReplacementOperator3034.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3035.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isAlphaSpace(final java.lang.CharSequence cs) {
        if (cs == null) {
            return ((_returnReplacementOperator3036.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if (((java.lang.Character.isLetter(cs.charAt(i))) == false) && ((cs.charAt(i)) != ' ')) {
                return ((_returnReplacementOperator3037.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3038.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isAlphanumeric(final java.lang.CharSequence cs) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(cs)) {
            return ((_returnReplacementOperator3039.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if ((java.lang.Character.isLetterOrDigit(cs.charAt(i))) == false) {
                return ((_returnReplacementOperator3040.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3041.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isAlphanumericSpace(final java.lang.CharSequence cs) {
        if (cs == null) {
            return ((_returnReplacementOperator3042.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if (((java.lang.Character.isLetterOrDigit(cs.charAt(i))) == false) && ((cs.charAt(i)) != ' ')) {
                return ((_returnReplacementOperator3043.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3044.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isAsciiPrintable(final java.lang.CharSequence cs) {
        if (cs == null) {
            return ((_returnReplacementOperator3051.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if ((org.apache.commons.lang3.CharUtils.isAsciiPrintable(cs.charAt(i))) == false) {
                return ((_returnReplacementOperator3052.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3053.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isNumeric(final java.lang.CharSequence cs) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(cs)) {
            return ((_returnReplacementOperator3062.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if (!(java.lang.Character.isDigit(cs.charAt(i)))) {
                return ((_returnReplacementOperator3063.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3064.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isNumericSpace(final java.lang.CharSequence cs) {
        if (cs == null) {
            return ((_returnReplacementOperator3065.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if (((java.lang.Character.isDigit(cs.charAt(i))) == false) && ((cs.charAt(i)) != ' ')) {
                return ((_returnReplacementOperator3066.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3067.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isWhitespace(final java.lang.CharSequence cs) {
        if (cs == null) {
            return ((_returnReplacementOperator3068.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if ((java.lang.Character.isWhitespace(cs.charAt(i))) == false) {
                return ((_returnReplacementOperator3069.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3070.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isAllLowerCase(final java.lang.CharSequence cs) {
        if ((cs == null) || (org.apache.commons.lang3.StringUtils.isEmpty(cs))) {
            return ((_returnReplacementOperator3027.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if ((java.lang.Character.isLowerCase(cs.charAt(i))) == false) {
                return ((_returnReplacementOperator3028.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3029.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isAllUpperCase(final java.lang.CharSequence cs) {
        if ((cs == null) || (org.apache.commons.lang3.StringUtils.isEmpty(cs))) {
            return ((_returnReplacementOperator3030.is("NULL")) ? ( null ) : (false));
        } 
        final int sz = cs.length();
        for (int i = 0 ; i < sz ; i++) {
            if ((java.lang.Character.isUpperCase(cs.charAt(i))) == false) {
                return ((_returnReplacementOperator3031.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator3032.is("NULL")) ? ( null ) : (true));
    }

    public static java.lang.String defaultString(final java.lang.String str) {
        return ((_returnReplacementOperator3203.is("NULL")) ? ( null ) : (str == null ? org.apache.commons.lang3.StringUtils.EMPTY : str));
    }

    public static java.lang.String defaultString(final java.lang.String str, final java.lang.String defaultStr) {
        return ((_returnReplacementOperator3204.is("NULL")) ? ( null ) : (str == null ? defaultStr : str));
    }

    public static <T extends java.lang.CharSequence>T defaultIfBlank(final T str, final T defaultStr) {
        return ((_returnReplacementOperator2970.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.isBlank(str) ? defaultStr : str));
    }

    public static <T extends java.lang.CharSequence>T defaultIfEmpty(final T str, final T defaultStr) {
        return ((_returnReplacementOperator2971.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.isEmpty(str) ? defaultStr : str));
    }

    public static java.lang.String rotate(java.lang.String str, int shift) {
        if (str == null) {
            return ((_returnReplacementOperator3380.is("NULL")) ? ( null ) : (null));
        } 
        final int strLen = str.length();
        if (((shift == 0) || (strLen == 0)) || ((shift % strLen) == 0)) {
            return ((_returnReplacementOperator3381.is("NULL")) ? ( null ) : (str));
        } 
        final java.lang.StringBuilder builder = new java.lang.StringBuilder(strLen);
        final int offset = -(shift % strLen);
        builder.append(org.apache.commons.lang3.StringUtils.substring(str, offset));
        builder.append(org.apache.commons.lang3.StringUtils.substring(str, 0, offset));
        return ((_returnReplacementOperator3382.is("NULL")) ? ( null ) : (builder.toString()));
    }

    public static java.lang.String reverse(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator3361.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator3362.is("NULL")) ? ( null ) : (new java.lang.StringBuilder(str).reverse().toString()));
    }

    public static java.lang.String reverseDelimited(final java.lang.String str, final char separatorChar) {
        if (str == null) {
            return ((_returnReplacementOperator3363.is("NULL")) ? ( null ) : (null));
        } 
        final java.lang.String[] strs = org.apache.commons.lang3.StringUtils.split(str, separatorChar);
        org.apache.commons.lang3.ArrayUtils.reverse(strs);
        return ((_returnReplacementOperator3364.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(strs, separatorChar)));
    }

    public static java.lang.String abbreviate(final java.lang.String str, final int maxWidth) {
        return ((_returnReplacementOperator3170.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.abbreviate(str, 0, maxWidth)));
    }

    public static java.lang.String abbreviate(final java.lang.String str, int offset, final int maxWidth) {
        if (str == null) {
            return ((_returnReplacementOperator3171.is("NULL")) ? ( null ) : (null));
        } 
        if (maxWidth < 4) {
            throw new java.lang.IllegalArgumentException("Minimum abbreviation width is 4");
        } 
        if ((str.length()) <= maxWidth) {
            return ((_returnReplacementOperator3172.is("NULL")) ? ( null ) : (str));
        } 
        if (offset > (str.length())) {
            offset = str.length();
        } 
        if (((str.length()) - offset) < (maxWidth - 3)) {
            offset = (str.length()) - (maxWidth - 3);
        } 
        final java.lang.String abrevMarker = "...";
        if (offset <= 4) {
            return ((_returnReplacementOperator3173.is("NULL")) ? ( null ) : ((str.substring(0, (maxWidth - 3))) + abrevMarker));
        } 
        if (maxWidth < 7) {
            throw new java.lang.IllegalArgumentException("Minimum abbreviation width with offset is 7");
        } 
        if (((offset + maxWidth) - 3) < (str.length())) {
            return ((_returnReplacementOperator3174.is("NULL")) ? ( null ) : (abrevMarker + (org.apache.commons.lang3.StringUtils.abbreviate(str.substring(offset), (maxWidth - 3)))));
        } 
        return ((_returnReplacementOperator3175.is("NULL")) ? ( null ) : (abrevMarker + (str.substring(((str.length()) - (maxWidth - 3))))));
    }

    public static java.lang.String abbreviateMiddle(final java.lang.String str, final java.lang.String middle, final int length) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(middle))) {
            return ((_returnReplacementOperator3176.is("NULL")) ? ( null ) : (str));
        } 
        if ((length >= (str.length())) || (length < ((middle.length()) + 2))) {
            return ((_returnReplacementOperator3177.is("NULL")) ? ( null ) : (str));
        } 
        final int targetSting = length - (middle.length());
        final int startOffset = (targetSting / 2) + (targetSting % 2);
        final int endOffset = (str.length()) - (targetSting / 2);
        final java.lang.StringBuilder builder = new java.lang.StringBuilder(length);
        builder.append(str.substring(0, startOffset));
        builder.append(middle);
        builder.append(str.substring(endOffset));
        return ((_returnReplacementOperator3178.is("NULL")) ? ( null ) : (builder.toString()));
    }

    public static java.lang.String difference(final java.lang.String str1, final java.lang.String str2) {
        if (str1 == null) {
            return ((_returnReplacementOperator3208.is("NULL")) ? ( null ) : (str2));
        } 
        if (str2 == null) {
            return ((_returnReplacementOperator3209.is("NULL")) ? ( null ) : (str1));
        } 
        final int at = org.apache.commons.lang3.StringUtils.indexOfDifference(str1, str2);
        if (at == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator3210.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator3211.is("NULL")) ? ( null ) : (str2.substring(at)));
    }

    public static int indexOfDifference(final java.lang.CharSequence cs1, final java.lang.CharSequence cs2) {
        if (cs1 == cs2) {
            return ((_returnReplacementOperator3130.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3130.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3130.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        if ((cs1 == null) || (cs2 == null)) {
            return ((_returnReplacementOperator3131.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3131.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3131.is("ZERO")) ? ( 0 ) : (0));
        } 
        int i;
        for (i = 0 ; (i < (cs1.length())) && (i < (cs2.length())) ; ++i) {
            if ((cs1.charAt(i)) != (cs2.charAt(i))) {
                break;
            } 
        }
        if ((i < (cs2.length())) || (i < (cs1.length()))) {
            return ((_returnReplacementOperator3132.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3132.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3132.is("ZERO")) ? ( 0 ) : (i));
        } 
        return ((_returnReplacementOperator3133.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3133.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3133.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
    }

    public static int indexOfDifference(final java.lang.CharSequence... css) {
        if ((css == null) || ((css.length) <= 1)) {
            return ((_returnReplacementOperator3134.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3134.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3134.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        boolean anyStringNull = false;
        boolean allStringsNull = true;
        final int arrayLen = css.length;
        int shortestStrLen = java.lang.Integer.MAX_VALUE;
        int longestStrLen = 0;
        for (int i = 0 ; i < arrayLen ; i++) {
            if ((css[i]) == null) {
                anyStringNull = true;
                shortestStrLen = 0;
            } else {
                allStringsNull = false;
                shortestStrLen = java.lang.Math.min(css[i].length(), shortestStrLen);
                longestStrLen = java.lang.Math.max(css[i].length(), longestStrLen);
            }
        }
        if (allStringsNull || ((longestStrLen == 0) && (!anyStringNull))) {
            return ((_returnReplacementOperator3135.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3135.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3135.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND));
        } 
        if (shortestStrLen == 0) {
            return ((_returnReplacementOperator3136.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3136.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3136.is("ZERO")) ? ( 0 ) : (0));
        } 
        int firstDiff = -1;
        for (int stringPos = 0 ; stringPos < shortestStrLen ; stringPos++) {
            final char comparisonChar = css[0].charAt(stringPos);
            for (int arrayPos = 1 ; arrayPos < arrayLen ; arrayPos++) {
                if ((css[arrayPos].charAt(stringPos)) != comparisonChar) {
                    firstDiff = stringPos;
                    break;
                } 
            }
            if (firstDiff != (-1)) {
                break;
            } 
        }
        if ((firstDiff == (-1)) && (shortestStrLen != longestStrLen)) {
            return ((_returnReplacementOperator3137.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3137.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3137.is("ZERO")) ? ( 0 ) : (shortestStrLen));
        } 
        return ((_returnReplacementOperator3138.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3138.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3138.is("ZERO")) ? ( 0 ) : (firstDiff));
    }

    public static java.lang.String getCommonPrefix(final java.lang.String... strs) {
        if ((strs == null) || ((strs.length) == 0)) {
            return ((_returnReplacementOperator3212.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final int smallestIndexOfDiff = org.apache.commons.lang3.StringUtils.indexOfDifference(strs);
        if (smallestIndexOfDiff == (INDEX_NOT_FOUND)) {
            if ((strs[0]) == null) {
                return ((_returnReplacementOperator3213.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
            } 
            return ((_returnReplacementOperator3214.is("NULL")) ? ( null ) : (strs[0]));
        } else if (smallestIndexOfDiff == 0) {
            return ((_returnReplacementOperator3215.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } else {
            return ((_returnReplacementOperator3216.is("NULL")) ? ( null ) : (strs[0].substring(0, smallestIndexOfDiff)));
        }
    }

    public static int getLevenshteinDistance(java.lang.CharSequence s, java.lang.CharSequence t) {
        if ((s == null) || (t == null)) {
            throw new java.lang.IllegalArgumentException("Strings must not be null");
        } 
        int n = s.length();
        int m = t.length();
        if (n == 0) {
            return ((_returnReplacementOperator3099.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3099.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3099.is("ZERO")) ? ( 0 ) : (m));
        } else if (m == 0) {
            return ((_returnReplacementOperator3100.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3100.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3100.is("ZERO")) ? ( 0 ) : (n));
        } 
        if (n > m) {
            final java.lang.CharSequence tmp = s;
            s = t;
            t = tmp;
            n = m;
            m = t.length();
        } 
        int[] p = new int[n + 1];
        int[] d = new int[n + 1];
        int[] _d;
        int i;
        int j;
        char t_j;
        int cost;
        for (i = 0 ; i <= n ; i++) {
            p[i] = i;
        }
        for (j = 1 ; j <= m ; j++) {
            t_j = t.charAt((j - 1));
            d[0] = j;
            for (i = 1 ; i <= n ; i++) {
                cost = (s.charAt((i - 1))) == t_j ? 0 : 1;
                d[i] = java.lang.Math.min(java.lang.Math.min(((d[(i - 1)]) + 1), ((p[i]) + 1)), ((p[(i - 1)]) + cost));
            }
            _d = p;
            p = d;
            d = _d;
        }
        return ((_returnReplacementOperator3101.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3101.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3101.is("ZERO")) ? ( 0 ) : (p[n]));
    }

    public static int getLevenshteinDistance(java.lang.CharSequence s, java.lang.CharSequence t, final int threshold) {
        if ((s == null) || (t == null)) {
            throw new java.lang.IllegalArgumentException("Strings must not be null");
        } 
        if (threshold < 0) {
            throw new java.lang.IllegalArgumentException("Threshold must not be negative");
        } 
        int n = s.length();
        int m = t.length();
        if (n == 0) {
            return ((_returnReplacementOperator3102.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3102.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3102.is("ZERO")) ? ( 0 ) : (m <= threshold ? m : -1));
        } else if (m == 0) {
            return ((_returnReplacementOperator3103.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3103.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3103.is("ZERO")) ? ( 0 ) : (n <= threshold ? n : -1));
        } 
        if (n > m) {
            final java.lang.CharSequence tmp = s;
            s = t;
            t = tmp;
            n = m;
            m = t.length();
        } 
        int[] p = new int[n + 1];
        int[] d = new int[n + 1];
        int[] _d;
        final int boundary = (java.lang.Math.min(n, threshold)) + 1;
        for (int i = 0 ; i < boundary ; i++) {
            p[i] = i;
        }
        java.util.Arrays.fill(p, boundary, p.length, java.lang.Integer.MAX_VALUE);
        java.util.Arrays.fill(d, java.lang.Integer.MAX_VALUE);
        for (int j = 1 ; j <= m ; j++) {
            final char t_j = t.charAt((j - 1));
            d[0] = j;
            final int min = java.lang.Math.max(1, (j - threshold));
            final int max = j > ((java.lang.Integer.MAX_VALUE) - threshold) ? n : java.lang.Math.min(n, (j + threshold));
            if (min > max) {
                return ((_returnReplacementOperator3104.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3104.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3104.is("ZERO")) ? ( 0 ) : (-1));
            } 
            if (min > 1) {
                d[(min - 1)] = java.lang.Integer.MAX_VALUE;
            } 
            for (int i = min ; i <= max ; i++) {
                if ((s.charAt((i - 1))) == t_j) {
                    d[i] = p[(i - 1)];
                } else {
                    d[i] = 1 + (java.lang.Math.min(java.lang.Math.min(d[(i - 1)], p[i]), p[(i - 1)]));
                }
            }
            _d = p;
            p = d;
            d = _d;
        }
        if ((p[n]) <= threshold) {
            return ((_returnReplacementOperator3105.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3105.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3105.is("ZERO")) ? ( 0 ) : (p[n]));
        } 
        return ((_returnReplacementOperator3106.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3106.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3106.is("ZERO")) ? ( 0 ) : (-1));
    }

    public static double getJaroWinklerDistance(final java.lang.CharSequence first, final java.lang.CharSequence second) {
        final double DEFAULT_SCALING_FACTOR = 0.1;
        if ((first == null) || (second == null)) {
            throw new java.lang.IllegalArgumentException("Strings must not be null");
        } 
        final double jaro = org.apache.commons.lang3.StringUtils.score(first, second);
        final int cl = org.apache.commons.lang3.StringUtils.commonPrefixLength(first, second);
        final double matchScore = (java.lang.Math.round(((jaro + ((DEFAULT_SCALING_FACTOR * cl) * (1.0 - jaro))) * 100.0))) / 100.0;
        return ((_returnReplacementOperator3079.is("NULL")) ? ( null ) : (matchScore));
    }

    private static double score(final java.lang.CharSequence first, final java.lang.CharSequence second) {
        java.lang.String shorter;
        java.lang.String longer;
        if ((first.length()) > (second.length())) {
            longer = first.toString().toLowerCase();
            shorter = second.toString().toLowerCase();
        } else {
            longer = second.toString().toLowerCase();
            shorter = first.toString().toLowerCase();
        }
        final int halflength = ((shorter.length()) / 2) + 1;
        final java.lang.String m1 = org.apache.commons.lang3.StringUtils.getSetOfMatchingCharacterWithin(shorter, longer, halflength);
        final java.lang.String m2 = org.apache.commons.lang3.StringUtils.getSetOfMatchingCharacterWithin(longer, shorter, halflength);
        if (((m1.length()) == 0) || ((m2.length()) == 0)) {
            return ((_returnReplacementOperator3080.is("NULL")) ? ( null ) : (0.0));
        } 
        if ((m1.length()) != (m2.length())) {
            return ((_returnReplacementOperator3081.is("NULL")) ? ( null ) : (0.0));
        } 
        final int transpositions = org.apache.commons.lang3.StringUtils.transpositions(m1, m2);
        final double dist = ((((m1.length()) / ((double)(shorter.length()))) + ((m2.length()) / ((double)(longer.length())))) + (((m1.length()) - transpositions) / ((double)(m1.length())))) / 3.0;
        return ((_returnReplacementOperator3082.is("NULL")) ? ( null ) : (dist));
    }

    public static int getFuzzyDistance(final java.lang.CharSequence term, final java.lang.CharSequence query, final java.util.Locale locale) {
        if ((term == null) || (query == null)) {
            throw new java.lang.IllegalArgumentException("Strings must not be null");
        } else if (locale == null) {
            throw new java.lang.IllegalArgumentException("Locale must not be null");
        } 
        final java.lang.String termLowerCase = term.toString().toLowerCase(locale);
        final java.lang.String queryLowerCase = query.toString().toLowerCase(locale);
        int score = 0;
        int termIndex = 0;
        int previousMatchingCharacterIndex = java.lang.Integer.MIN_VALUE;
        for (int queryIndex = 0 ; queryIndex < (queryLowerCase.length()) ; queryIndex++) {
            final char queryChar = queryLowerCase.charAt(queryIndex);
            boolean termCharacterMatchFound = false;
            for ( ; (termIndex < (termLowerCase.length())) && (!termCharacterMatchFound) ; termIndex++) {
                final char termChar = termLowerCase.charAt(termIndex);
                if (queryChar == termChar) {
                    score++;
                    if ((previousMatchingCharacterIndex + 1) == termIndex) {
                        score += 2;
                    } 
                    previousMatchingCharacterIndex = termIndex;
                    termCharacterMatchFound = true;
                } 
            }
        }
        return ((_returnReplacementOperator3098.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3098.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3098.is("ZERO")) ? ( 0 ) : (score));
    }

    private static java.lang.String getSetOfMatchingCharacterWithin(final java.lang.CharSequence first, final java.lang.CharSequence second, final int limit) {
        final java.lang.StringBuilder common = new java.lang.StringBuilder();
        final java.lang.StringBuilder copy = new java.lang.StringBuilder(second);
        for (int i = 0 ; i < (first.length()) ; i++) {
            final char ch = first.charAt(i);
            boolean found = false;
            for (int j = java.lang.Math.max(0, (i - limit)) ; (!found) && (j < (java.lang.Math.min((i + limit), second.length()))) ; j++) {
                if ((copy.charAt(j)) == ch) {
                    found = true;
                    common.append(ch);
                    copy.setCharAt(j, '*');
                } 
            }
        }
        return ((_returnReplacementOperator3217.is("NULL")) ? ( null ) : (common.toString()));
    }

    private static int transpositions(final java.lang.CharSequence first, final java.lang.CharSequence second) {
        int transpositions = 0;
        for (int i = 0 ; i < (first.length()) ; i++) {
            if ((first.charAt(i)) != (second.charAt(i))) {
                transpositions++;
            } 
        }
        return ((_returnReplacementOperator3169.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3169.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3169.is("ZERO")) ? ( 0 ) : (transpositions / 2));
    }

    private static int commonPrefixLength(final java.lang.CharSequence first, final java.lang.CharSequence second) {
        final int result = org.apache.commons.lang3.StringUtils.getCommonPrefix(first.toString(), second.toString()).length();
        return ((_returnReplacementOperator3083.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3083.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3083.is("ZERO")) ? ( 0 ) : (result > 4 ? 4 : result));
    }

    public static boolean startsWith(final java.lang.CharSequence str, final java.lang.CharSequence prefix) {
        return ((_returnReplacementOperator3071.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.startsWith(str, prefix, false)));
    }

    public static boolean startsWithIgnoreCase(final java.lang.CharSequence str, final java.lang.CharSequence prefix) {
        return ((_returnReplacementOperator3078.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.startsWith(str, prefix, true)));
    }

    private static boolean startsWith(final java.lang.CharSequence str, final java.lang.CharSequence prefix, final boolean ignoreCase) {
        if ((str == null) || (prefix == null)) {
            return ((_returnReplacementOperator3072.is("NULL")) ? ( null ) : ((str == null) && (prefix == null)));
        } 
        if ((prefix.length()) > (str.length())) {
            return ((_returnReplacementOperator3073.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator3074.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharSequenceUtils.regionMatches(str, ignoreCase, 0, prefix, 0, prefix.length())));
    }

    public static boolean startsWithAny(final java.lang.CharSequence string, final java.lang.CharSequence... searchStrings) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(string)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchStrings))) {
            return ((_returnReplacementOperator3075.is("NULL")) ? ( null ) : (false));
        } 
        for (final java.lang.CharSequence searchString : searchStrings) {
            if (org.apache.commons.lang3.StringUtils.startsWith(string, searchString)) {
                return ((_returnReplacementOperator3076.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator3077.is("NULL")) ? ( null ) : (false));
    }

    public static boolean endsWith(final java.lang.CharSequence str, final java.lang.CharSequence suffix) {
        return ((_returnReplacementOperator3006.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.endsWith(str, suffix, false)));
    }

    public static boolean endsWithIgnoreCase(final java.lang.CharSequence str, final java.lang.CharSequence suffix) {
        return ((_returnReplacementOperator3013.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.endsWith(str, suffix, true)));
    }

    private static boolean endsWith(final java.lang.CharSequence str, final java.lang.CharSequence suffix, final boolean ignoreCase) {
        if ((str == null) || (suffix == null)) {
            return ((_returnReplacementOperator3007.is("NULL")) ? ( null ) : ((str == null) && (suffix == null)));
        } 
        if ((suffix.length()) > (str.length())) {
            return ((_returnReplacementOperator3008.is("NULL")) ? ( null ) : (false));
        } 
        final int strOffset = (str.length()) - (suffix.length());
        return ((_returnReplacementOperator3009.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharSequenceUtils.regionMatches(str, ignoreCase, strOffset, suffix, 0, suffix.length())));
    }

    public static java.lang.String normalizeSpace(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator3299.is("NULL")) ? ( null ) : (str));
        } 
        final int size = str.length();
        final char[] newChars = new char[size];
        int count = 0;
        int whitespacesCount = 0;
        boolean startWhitespaces = true;
        for (int i = 0 ; i < size ; i++) {
            char actualChar = str.charAt(i);
            boolean isWhitespace = java.lang.Character.isWhitespace(actualChar);
            if (!isWhitespace) {
                startWhitespaces = false;
                newChars[count++] = actualChar == 160 ? 32 : actualChar;
                whitespacesCount = 0;
            } else {
                if ((whitespacesCount == 0) && (!startWhitespaces)) {
                    newChars[count++] = SPACE.charAt(0);
                } 
                whitespacesCount++;
            }
        }
        if (startWhitespaces) {
            return ((_returnReplacementOperator3300.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator3301.is("NULL")) ? ( null ) : (new java.lang.String(newChars , 0 , (count - (whitespacesCount > 0 ? 1 : 0)))));
    }

    public static boolean endsWithAny(final java.lang.CharSequence string, final java.lang.CharSequence... searchStrings) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(string)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(searchStrings))) {
            return ((_returnReplacementOperator3010.is("NULL")) ? ( null ) : (false));
        } 
        for (final java.lang.CharSequence searchString : searchStrings) {
            if (org.apache.commons.lang3.StringUtils.endsWith(string, searchString)) {
                return ((_returnReplacementOperator3011.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator3012.is("NULL")) ? ( null ) : (false));
    }

    private static java.lang.String appendIfMissing(final java.lang.String str, final java.lang.CharSequence suffix, final boolean ignoreCase, final java.lang.CharSequence... suffixes) {
        if (((str == null) || (org.apache.commons.lang3.StringUtils.isEmpty(suffix))) || (org.apache.commons.lang3.StringUtils.endsWith(str, suffix, ignoreCase))) {
            return ((_returnReplacementOperator3179.is("NULL")) ? ( null ) : (str));
        } 
        if ((suffixes != null) && ((suffixes.length) > 0)) {
            for (final java.lang.CharSequence s : suffixes) {
                if (org.apache.commons.lang3.StringUtils.endsWith(str, s, ignoreCase)) {
                    return ((_returnReplacementOperator3180.is("NULL")) ? ( null ) : (str));
                } 
            }
        } 
        return ((_returnReplacementOperator3181.is("NULL")) ? ( null ) : (str + (suffix.toString())));
    }

    public static java.lang.String appendIfMissing(final java.lang.String str, final java.lang.CharSequence suffix, final java.lang.CharSequence... suffixes) {
        return ((_returnReplacementOperator3182.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.appendIfMissing(str, suffix, false, suffixes)));
    }

    public static java.lang.String appendIfMissingIgnoreCase(final java.lang.String str, final java.lang.CharSequence suffix, final java.lang.CharSequence... suffixes) {
        return ((_returnReplacementOperator3183.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.appendIfMissing(str, suffix, true, suffixes)));
    }

    private static java.lang.String prependIfMissing(final java.lang.String str, final java.lang.CharSequence prefix, final boolean ignoreCase, final java.lang.CharSequence... prefixes) {
        if (((str == null) || (org.apache.commons.lang3.StringUtils.isEmpty(prefix))) || (org.apache.commons.lang3.StringUtils.startsWith(str, prefix, ignoreCase))) {
            return ((_returnReplacementOperator3304.is("NULL")) ? ( null ) : (str));
        } 
        if ((prefixes != null) && ((prefixes.length) > 0)) {
            for (final java.lang.CharSequence p : prefixes) {
                if (org.apache.commons.lang3.StringUtils.startsWith(str, p, ignoreCase)) {
                    return ((_returnReplacementOperator3305.is("NULL")) ? ( null ) : (str));
                } 
            }
        } 
        return ((_returnReplacementOperator3306.is("NULL")) ? ( null ) : ((prefix.toString()) + str));
    }

    public static java.lang.String prependIfMissing(final java.lang.String str, final java.lang.CharSequence prefix, final java.lang.CharSequence... prefixes) {
        return ((_returnReplacementOperator3307.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.prependIfMissing(str, prefix, false, prefixes)));
    }

    public static java.lang.String prependIfMissingIgnoreCase(final java.lang.String str, final java.lang.CharSequence prefix, final java.lang.CharSequence... prefixes) {
        return ((_returnReplacementOperator3308.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.prependIfMissing(str, prefix, true, prefixes)));
    }

    @java.lang.Deprecated
    public static java.lang.String toString(final byte[] bytes, final java.lang.String charsetName) throws java.io.UnsupportedEncodingException {
        return ((_returnReplacementOperator3425.is("NULL")) ? ( null ) : (charsetName != null ? new java.lang.String(bytes , charsetName) : new java.lang.String(bytes , java.nio.charset.Charset.defaultCharset())));
    }

    public static java.lang.String toEncodedString(final byte[] bytes, final java.nio.charset.Charset charset) {
        return ((_returnReplacementOperator3424.is("NULL")) ? ( null ) : (new java.lang.String(bytes , (charset != null ? charset : java.nio.charset.Charset.defaultCharset()))));
    }

    public static java.lang.String wrap(final java.lang.String str, final char wrapWith) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (wrapWith == ' ')) {
            return ((_returnReplacementOperator3436.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3437.is("NULL")) ? ( null ) : ((wrapWith + str) + wrapWith));
    }

    public static java.lang.String wrap(final java.lang.String str, final java.lang.String wrapWith) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (org.apache.commons.lang3.StringUtils.isEmpty(wrapWith))) {
            return ((_returnReplacementOperator3438.is("NULL")) ? ( null ) : (str));
        } 
        return ((_returnReplacementOperator3439.is("NULL")) ? ( null ) : (wrapWith.concat(str).concat(wrapWith)));
    }

    private static final metamutator.Selector _returnReplacementOperator2970 = metamutator.Selector.of(2970,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2970");

    private static final metamutator.Selector _returnReplacementOperator2971 = metamutator.Selector.of(2971,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2971");

    private static final metamutator.Selector _returnReplacementOperator2972 = metamutator.Selector.of(2972,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2972");

    private static final metamutator.Selector _returnReplacementOperator2973 = metamutator.Selector.of(2973,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2973");

    private static final metamutator.Selector _returnReplacementOperator2974 = metamutator.Selector.of(2974,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2974");

    private static final metamutator.Selector _returnReplacementOperator2975 = metamutator.Selector.of(2975,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2975");

    private static final metamutator.Selector _returnReplacementOperator2976 = metamutator.Selector.of(2976,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2976");

    private static final metamutator.Selector _returnReplacementOperator2977 = metamutator.Selector.of(2977,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2977");

    private static final metamutator.Selector _returnReplacementOperator2978 = metamutator.Selector.of(2978,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2978");

    private static final metamutator.Selector _returnReplacementOperator2979 = metamutator.Selector.of(2979,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2979");

    private static final metamutator.Selector _returnReplacementOperator2980 = metamutator.Selector.of(2980,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2980");

    private static final metamutator.Selector _returnReplacementOperator2981 = metamutator.Selector.of(2981,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2981");

    private static final metamutator.Selector _returnReplacementOperator2982 = metamutator.Selector.of(2982,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2982");

    private static final metamutator.Selector _returnReplacementOperator2983 = metamutator.Selector.of(2983,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2983");

    private static final metamutator.Selector _returnReplacementOperator2984 = metamutator.Selector.of(2984,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2984");

    private static final metamutator.Selector _returnReplacementOperator2985 = metamutator.Selector.of(2985,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2985");

    private static final metamutator.Selector _returnReplacementOperator2986 = metamutator.Selector.of(2986,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2986");

    private static final metamutator.Selector _returnReplacementOperator2987 = metamutator.Selector.of(2987,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2987");

    private static final metamutator.Selector _returnReplacementOperator2988 = metamutator.Selector.of(2988,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2988");

    private static final metamutator.Selector _returnReplacementOperator2989 = metamutator.Selector.of(2989,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2989");

    private static final metamutator.Selector _returnReplacementOperator2990 = metamutator.Selector.of(2990,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2990");

    private static final metamutator.Selector _returnReplacementOperator2991 = metamutator.Selector.of(2991,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2991");

    private static final metamutator.Selector _returnReplacementOperator2992 = metamutator.Selector.of(2992,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2992");

    private static final metamutator.Selector _returnReplacementOperator2993 = metamutator.Selector.of(2993,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2993");

    private static final metamutator.Selector _returnReplacementOperator2994 = metamutator.Selector.of(2994,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2994");

    private static final metamutator.Selector _returnReplacementOperator2995 = metamutator.Selector.of(2995,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2995");

    private static final metamutator.Selector _returnReplacementOperator2996 = metamutator.Selector.of(2996,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2996");

    private static final metamutator.Selector _returnReplacementOperator2997 = metamutator.Selector.of(2997,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2997");

    private static final metamutator.Selector _returnReplacementOperator2998 = metamutator.Selector.of(2998,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2998");

    private static final metamutator.Selector _returnReplacementOperator2999 = metamutator.Selector.of(2999,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator2999");

    private static final metamutator.Selector _returnReplacementOperator3000 = metamutator.Selector.of(3000,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3000");

    private static final metamutator.Selector _returnReplacementOperator3001 = metamutator.Selector.of(3001,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3001");

    private static final metamutator.Selector _returnReplacementOperator3002 = metamutator.Selector.of(3002,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3002");

    private static final metamutator.Selector _returnReplacementOperator3003 = metamutator.Selector.of(3003,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3003");

    private static final metamutator.Selector _returnReplacementOperator3004 = metamutator.Selector.of(3004,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3004");

    private static final metamutator.Selector _returnReplacementOperator3005 = metamutator.Selector.of(3005,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3005");

    private static final metamutator.Selector _returnReplacementOperator3006 = metamutator.Selector.of(3006,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3006");

    private static final metamutator.Selector _returnReplacementOperator3007 = metamutator.Selector.of(3007,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3007");

    private static final metamutator.Selector _returnReplacementOperator3008 = metamutator.Selector.of(3008,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3008");

    private static final metamutator.Selector _returnReplacementOperator3009 = metamutator.Selector.of(3009,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3009");

    private static final metamutator.Selector _returnReplacementOperator3010 = metamutator.Selector.of(3010,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3010");

    private static final metamutator.Selector _returnReplacementOperator3011 = metamutator.Selector.of(3011,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3011");

    private static final metamutator.Selector _returnReplacementOperator3012 = metamutator.Selector.of(3012,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3012");

    private static final metamutator.Selector _returnReplacementOperator3013 = metamutator.Selector.of(3013,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3013");

    private static final metamutator.Selector _returnReplacementOperator3014 = metamutator.Selector.of(3014,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3014");

    private static final metamutator.Selector _returnReplacementOperator3015 = metamutator.Selector.of(3015,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3015");

    private static final metamutator.Selector _returnReplacementOperator3016 = metamutator.Selector.of(3016,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3016");

    private static final metamutator.Selector _returnReplacementOperator3017 = metamutator.Selector.of(3017,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3017");

    private static final metamutator.Selector _returnReplacementOperator3018 = metamutator.Selector.of(3018,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3018");

    private static final metamutator.Selector _returnReplacementOperator3019 = metamutator.Selector.of(3019,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3019");

    private static final metamutator.Selector _returnReplacementOperator3020 = metamutator.Selector.of(3020,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3020");

    private static final metamutator.Selector _returnReplacementOperator3021 = metamutator.Selector.of(3021,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3021");

    private static final metamutator.Selector _returnReplacementOperator3022 = metamutator.Selector.of(3022,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3022");

    private static final metamutator.Selector _returnReplacementOperator3023 = metamutator.Selector.of(3023,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3023");

    private static final metamutator.Selector _returnReplacementOperator3024 = metamutator.Selector.of(3024,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3024");

    private static final metamutator.Selector _returnReplacementOperator3025 = metamutator.Selector.of(3025,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3025");

    private static final metamutator.Selector _returnReplacementOperator3026 = metamutator.Selector.of(3026,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3026");

    private static final metamutator.Selector _returnReplacementOperator3027 = metamutator.Selector.of(3027,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3027");

    private static final metamutator.Selector _returnReplacementOperator3028 = metamutator.Selector.of(3028,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3028");

    private static final metamutator.Selector _returnReplacementOperator3029 = metamutator.Selector.of(3029,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3029");

    private static final metamutator.Selector _returnReplacementOperator3030 = metamutator.Selector.of(3030,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3030");

    private static final metamutator.Selector _returnReplacementOperator3031 = metamutator.Selector.of(3031,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3031");

    private static final metamutator.Selector _returnReplacementOperator3032 = metamutator.Selector.of(3032,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3032");

    private static final metamutator.Selector _returnReplacementOperator3033 = metamutator.Selector.of(3033,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3033");

    private static final metamutator.Selector _returnReplacementOperator3034 = metamutator.Selector.of(3034,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3034");

    private static final metamutator.Selector _returnReplacementOperator3035 = metamutator.Selector.of(3035,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3035");

    private static final metamutator.Selector _returnReplacementOperator3036 = metamutator.Selector.of(3036,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3036");

    private static final metamutator.Selector _returnReplacementOperator3037 = metamutator.Selector.of(3037,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3037");

    private static final metamutator.Selector _returnReplacementOperator3038 = metamutator.Selector.of(3038,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3038");

    private static final metamutator.Selector _returnReplacementOperator3039 = metamutator.Selector.of(3039,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3039");

    private static final metamutator.Selector _returnReplacementOperator3040 = metamutator.Selector.of(3040,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3040");

    private static final metamutator.Selector _returnReplacementOperator3041 = metamutator.Selector.of(3041,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3041");

    private static final metamutator.Selector _returnReplacementOperator3042 = metamutator.Selector.of(3042,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3042");

    private static final metamutator.Selector _returnReplacementOperator3043 = metamutator.Selector.of(3043,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3043");

    private static final metamutator.Selector _returnReplacementOperator3044 = metamutator.Selector.of(3044,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3044");

    private static final metamutator.Selector _returnReplacementOperator3045 = metamutator.Selector.of(3045,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3045");

    private static final metamutator.Selector _returnReplacementOperator3046 = metamutator.Selector.of(3046,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3046");

    private static final metamutator.Selector _returnReplacementOperator3047 = metamutator.Selector.of(3047,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3047");

    private static final metamutator.Selector _returnReplacementOperator3048 = metamutator.Selector.of(3048,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3048");

    private static final metamutator.Selector _returnReplacementOperator3049 = metamutator.Selector.of(3049,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3049");

    private static final metamutator.Selector _returnReplacementOperator3050 = metamutator.Selector.of(3050,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3050");

    private static final metamutator.Selector _returnReplacementOperator3051 = metamutator.Selector.of(3051,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3051");

    private static final metamutator.Selector _returnReplacementOperator3052 = metamutator.Selector.of(3052,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3052");

    private static final metamutator.Selector _returnReplacementOperator3053 = metamutator.Selector.of(3053,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3053");

    private static final metamutator.Selector _returnReplacementOperator3054 = metamutator.Selector.of(3054,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3054");

    private static final metamutator.Selector _returnReplacementOperator3055 = metamutator.Selector.of(3055,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3055");

    private static final metamutator.Selector _returnReplacementOperator3056 = metamutator.Selector.of(3056,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3056");

    private static final metamutator.Selector _returnReplacementOperator3057 = metamutator.Selector.of(3057,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3057");

    private static final metamutator.Selector _returnReplacementOperator3058 = metamutator.Selector.of(3058,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3058");

    private static final metamutator.Selector _returnReplacementOperator3059 = metamutator.Selector.of(3059,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3059");

    private static final metamutator.Selector _returnReplacementOperator3060 = metamutator.Selector.of(3060,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3060");

    private static final metamutator.Selector _returnReplacementOperator3061 = metamutator.Selector.of(3061,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3061");

    private static final metamutator.Selector _returnReplacementOperator3062 = metamutator.Selector.of(3062,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3062");

    private static final metamutator.Selector _returnReplacementOperator3063 = metamutator.Selector.of(3063,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3063");

    private static final metamutator.Selector _returnReplacementOperator3064 = metamutator.Selector.of(3064,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3064");

    private static final metamutator.Selector _returnReplacementOperator3065 = metamutator.Selector.of(3065,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3065");

    private static final metamutator.Selector _returnReplacementOperator3066 = metamutator.Selector.of(3066,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3066");

    private static final metamutator.Selector _returnReplacementOperator3067 = metamutator.Selector.of(3067,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3067");

    private static final metamutator.Selector _returnReplacementOperator3068 = metamutator.Selector.of(3068,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3068");

    private static final metamutator.Selector _returnReplacementOperator3069 = metamutator.Selector.of(3069,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3069");

    private static final metamutator.Selector _returnReplacementOperator3070 = metamutator.Selector.of(3070,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3070");

    private static final metamutator.Selector _returnReplacementOperator3071 = metamutator.Selector.of(3071,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3071");

    private static final metamutator.Selector _returnReplacementOperator3072 = metamutator.Selector.of(3072,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3072");

    private static final metamutator.Selector _returnReplacementOperator3073 = metamutator.Selector.of(3073,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3073");

    private static final metamutator.Selector _returnReplacementOperator3074 = metamutator.Selector.of(3074,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3074");

    private static final metamutator.Selector _returnReplacementOperator3075 = metamutator.Selector.of(3075,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3075");

    private static final metamutator.Selector _returnReplacementOperator3076 = metamutator.Selector.of(3076,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3076");

    private static final metamutator.Selector _returnReplacementOperator3077 = metamutator.Selector.of(3077,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3077");

    private static final metamutator.Selector _returnReplacementOperator3078 = metamutator.Selector.of(3078,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3078");

    private static final metamutator.Selector _returnReplacementOperator3079 = metamutator.Selector.of(3079,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3079");

    private static final metamutator.Selector _returnReplacementOperator3080 = metamutator.Selector.of(3080,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3080");

    private static final metamutator.Selector _returnReplacementOperator3081 = metamutator.Selector.of(3081,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3081");

    private static final metamutator.Selector _returnReplacementOperator3082 = metamutator.Selector.of(3082,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3082");

    private static final metamutator.Selector _returnReplacementOperator3083 = metamutator.Selector.of(3083,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3083");

    private static final metamutator.Selector _returnReplacementOperator3084 = metamutator.Selector.of(3084,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3084");

    private static final metamutator.Selector _returnReplacementOperator3085 = metamutator.Selector.of(3085,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3085");

    private static final metamutator.Selector _returnReplacementOperator3086 = metamutator.Selector.of(3086,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3086");

    private static final metamutator.Selector _returnReplacementOperator3087 = metamutator.Selector.of(3087,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3087");

    private static final metamutator.Selector _returnReplacementOperator3088 = metamutator.Selector.of(3088,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3088");

    private static final metamutator.Selector _returnReplacementOperator3089 = metamutator.Selector.of(3089,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3089");

    private static final metamutator.Selector _returnReplacementOperator3090 = metamutator.Selector.of(3090,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3090");

    private static final metamutator.Selector _returnReplacementOperator3091 = metamutator.Selector.of(3091,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3091");

    private static final metamutator.Selector _returnReplacementOperator3092 = metamutator.Selector.of(3092,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3092");

    private static final metamutator.Selector _returnReplacementOperator3093 = metamutator.Selector.of(3093,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3093");

    private static final metamutator.Selector _returnReplacementOperator3094 = metamutator.Selector.of(3094,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3094");

    private static final metamutator.Selector _returnReplacementOperator3095 = metamutator.Selector.of(3095,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3095");

    private static final metamutator.Selector _returnReplacementOperator3096 = metamutator.Selector.of(3096,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3096");

    private static final metamutator.Selector _returnReplacementOperator3097 = metamutator.Selector.of(3097,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3097");

    private static final metamutator.Selector _returnReplacementOperator3098 = metamutator.Selector.of(3098,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3098");

    private static final metamutator.Selector _returnReplacementOperator3099 = metamutator.Selector.of(3099,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3099");

    private static final metamutator.Selector _returnReplacementOperator3100 = metamutator.Selector.of(3100,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3100");

    private static final metamutator.Selector _returnReplacementOperator3101 = metamutator.Selector.of(3101,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3101");

    private static final metamutator.Selector _returnReplacementOperator3102 = metamutator.Selector.of(3102,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3102");

    private static final metamutator.Selector _returnReplacementOperator3103 = metamutator.Selector.of(3103,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3103");

    private static final metamutator.Selector _returnReplacementOperator3104 = metamutator.Selector.of(3104,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3104");

    private static final metamutator.Selector _returnReplacementOperator3105 = metamutator.Selector.of(3105,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3105");

    private static final metamutator.Selector _returnReplacementOperator3106 = metamutator.Selector.of(3106,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3106");

    private static final metamutator.Selector _returnReplacementOperator3107 = metamutator.Selector.of(3107,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3107");

    private static final metamutator.Selector _returnReplacementOperator3108 = metamutator.Selector.of(3108,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3108");

    private static final metamutator.Selector _returnReplacementOperator3109 = metamutator.Selector.of(3109,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3109");

    private static final metamutator.Selector _returnReplacementOperator3110 = metamutator.Selector.of(3110,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3110");

    private static final metamutator.Selector _returnReplacementOperator3111 = metamutator.Selector.of(3111,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3111");

    private static final metamutator.Selector _returnReplacementOperator3112 = metamutator.Selector.of(3112,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3112");

    private static final metamutator.Selector _returnReplacementOperator3113 = metamutator.Selector.of(3113,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3113");

    private static final metamutator.Selector _returnReplacementOperator3114 = metamutator.Selector.of(3114,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3114");

    private static final metamutator.Selector _returnReplacementOperator3115 = metamutator.Selector.of(3115,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3115");

    private static final metamutator.Selector _returnReplacementOperator3116 = metamutator.Selector.of(3116,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3116");

    private static final metamutator.Selector _returnReplacementOperator3117 = metamutator.Selector.of(3117,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3117");

    private static final metamutator.Selector _returnReplacementOperator3118 = metamutator.Selector.of(3118,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3118");

    private static final metamutator.Selector _returnReplacementOperator3119 = metamutator.Selector.of(3119,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3119");

    private static final metamutator.Selector _returnReplacementOperator3120 = metamutator.Selector.of(3120,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3120");

    private static final metamutator.Selector _returnReplacementOperator3121 = metamutator.Selector.of(3121,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3121");

    private static final metamutator.Selector _returnReplacementOperator3122 = metamutator.Selector.of(3122,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3122");

    private static final metamutator.Selector _returnReplacementOperator3123 = metamutator.Selector.of(3123,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3123");

    private static final metamutator.Selector _returnReplacementOperator3124 = metamutator.Selector.of(3124,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3124");

    private static final metamutator.Selector _returnReplacementOperator3125 = metamutator.Selector.of(3125,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3125");

    private static final metamutator.Selector _returnReplacementOperator3126 = metamutator.Selector.of(3126,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3126");

    private static final metamutator.Selector _returnReplacementOperator3127 = metamutator.Selector.of(3127,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3127");

    private static final metamutator.Selector _returnReplacementOperator3128 = metamutator.Selector.of(3128,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3128");

    private static final metamutator.Selector _returnReplacementOperator3129 = metamutator.Selector.of(3129,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3129");

    private static final metamutator.Selector _returnReplacementOperator3130 = metamutator.Selector.of(3130,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3130");

    private static final metamutator.Selector _returnReplacementOperator3131 = metamutator.Selector.of(3131,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3131");

    private static final metamutator.Selector _returnReplacementOperator3132 = metamutator.Selector.of(3132,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3132");

    private static final metamutator.Selector _returnReplacementOperator3133 = metamutator.Selector.of(3133,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3133");

    private static final metamutator.Selector _returnReplacementOperator3134 = metamutator.Selector.of(3134,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3134");

    private static final metamutator.Selector _returnReplacementOperator3135 = metamutator.Selector.of(3135,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3135");

    private static final metamutator.Selector _returnReplacementOperator3136 = metamutator.Selector.of(3136,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3136");

    private static final metamutator.Selector _returnReplacementOperator3137 = metamutator.Selector.of(3137,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3137");

    private static final metamutator.Selector _returnReplacementOperator3138 = metamutator.Selector.of(3138,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3138");

    private static final metamutator.Selector _returnReplacementOperator3139 = metamutator.Selector.of(3139,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3139");

    private static final metamutator.Selector _returnReplacementOperator3140 = metamutator.Selector.of(3140,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3140");

    private static final metamutator.Selector _returnReplacementOperator3141 = metamutator.Selector.of(3141,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3141");

    private static final metamutator.Selector _returnReplacementOperator3142 = metamutator.Selector.of(3142,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3142");

    private static final metamutator.Selector _returnReplacementOperator3143 = metamutator.Selector.of(3143,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3143");

    private static final metamutator.Selector _returnReplacementOperator3144 = metamutator.Selector.of(3144,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3144");

    private static final metamutator.Selector _returnReplacementOperator3145 = metamutator.Selector.of(3145,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3145");

    private static final metamutator.Selector _returnReplacementOperator3146 = metamutator.Selector.of(3146,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3146");

    private static final metamutator.Selector _returnReplacementOperator3147 = metamutator.Selector.of(3147,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3147");

    private static final metamutator.Selector _returnReplacementOperator3148 = metamutator.Selector.of(3148,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3148");

    private static final metamutator.Selector _returnReplacementOperator3149 = metamutator.Selector.of(3149,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3149");

    private static final metamutator.Selector _returnReplacementOperator3150 = metamutator.Selector.of(3150,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3150");

    private static final metamutator.Selector _returnReplacementOperator3151 = metamutator.Selector.of(3151,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3151");

    private static final metamutator.Selector _returnReplacementOperator3152 = metamutator.Selector.of(3152,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3152");

    private static final metamutator.Selector _returnReplacementOperator3153 = metamutator.Selector.of(3153,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3153");

    private static final metamutator.Selector _returnReplacementOperator3154 = metamutator.Selector.of(3154,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3154");

    private static final metamutator.Selector _returnReplacementOperator3155 = metamutator.Selector.of(3155,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3155");

    private static final metamutator.Selector _returnReplacementOperator3156 = metamutator.Selector.of(3156,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3156");

    private static final metamutator.Selector _returnReplacementOperator3157 = metamutator.Selector.of(3157,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3157");

    private static final metamutator.Selector _returnReplacementOperator3158 = metamutator.Selector.of(3158,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3158");

    private static final metamutator.Selector _returnReplacementOperator3159 = metamutator.Selector.of(3159,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3159");

    private static final metamutator.Selector _returnReplacementOperator3160 = metamutator.Selector.of(3160,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3160");

    private static final metamutator.Selector _returnReplacementOperator3161 = metamutator.Selector.of(3161,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3161");

    private static final metamutator.Selector _returnReplacementOperator3162 = metamutator.Selector.of(3162,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3162");

    private static final metamutator.Selector _returnReplacementOperator3163 = metamutator.Selector.of(3163,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3163");

    private static final metamutator.Selector _returnReplacementOperator3164 = metamutator.Selector.of(3164,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3164");

    private static final metamutator.Selector _returnReplacementOperator3165 = metamutator.Selector.of(3165,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3165");

    private static final metamutator.Selector _returnReplacementOperator3166 = metamutator.Selector.of(3166,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3166");

    private static final metamutator.Selector _returnReplacementOperator3167 = metamutator.Selector.of(3167,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3167");

    private static final metamutator.Selector _returnReplacementOperator3168 = metamutator.Selector.of(3168,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3168");

    private static final metamutator.Selector _returnReplacementOperator3169 = metamutator.Selector.of(3169,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3169");

    private static final metamutator.Selector _returnReplacementOperator3170 = metamutator.Selector.of(3170,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3170");

    private static final metamutator.Selector _returnReplacementOperator3171 = metamutator.Selector.of(3171,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3171");

    private static final metamutator.Selector _returnReplacementOperator3172 = metamutator.Selector.of(3172,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3172");

    private static final metamutator.Selector _returnReplacementOperator3173 = metamutator.Selector.of(3173,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3173");

    private static final metamutator.Selector _returnReplacementOperator3174 = metamutator.Selector.of(3174,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3174");

    private static final metamutator.Selector _returnReplacementOperator3175 = metamutator.Selector.of(3175,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3175");

    private static final metamutator.Selector _returnReplacementOperator3176 = metamutator.Selector.of(3176,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3176");

    private static final metamutator.Selector _returnReplacementOperator3177 = metamutator.Selector.of(3177,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3177");

    private static final metamutator.Selector _returnReplacementOperator3178 = metamutator.Selector.of(3178,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3178");

    private static final metamutator.Selector _returnReplacementOperator3179 = metamutator.Selector.of(3179,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3179");

    private static final metamutator.Selector _returnReplacementOperator3180 = metamutator.Selector.of(3180,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3180");

    private static final metamutator.Selector _returnReplacementOperator3181 = metamutator.Selector.of(3181,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3181");

    private static final metamutator.Selector _returnReplacementOperator3182 = metamutator.Selector.of(3182,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3182");

    private static final metamutator.Selector _returnReplacementOperator3183 = metamutator.Selector.of(3183,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3183");

    private static final metamutator.Selector _returnReplacementOperator3184 = metamutator.Selector.of(3184,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3184");

    private static final metamutator.Selector _returnReplacementOperator3185 = metamutator.Selector.of(3185,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3185");

    private static final metamutator.Selector _returnReplacementOperator3186 = metamutator.Selector.of(3186,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3186");

    private static final metamutator.Selector _returnReplacementOperator3187 = metamutator.Selector.of(3187,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3187");

    private static final metamutator.Selector _returnReplacementOperator3188 = metamutator.Selector.of(3188,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3188");

    private static final metamutator.Selector _returnReplacementOperator3189 = metamutator.Selector.of(3189,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3189");

    private static final metamutator.Selector _returnReplacementOperator3190 = metamutator.Selector.of(3190,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3190");

    private static final metamutator.Selector _returnReplacementOperator3191 = metamutator.Selector.of(3191,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3191");

    private static final metamutator.Selector _returnReplacementOperator3192 = metamutator.Selector.of(3192,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3192");

    private static final metamutator.Selector _returnReplacementOperator3193 = metamutator.Selector.of(3193,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3193");

    private static final metamutator.Selector _returnReplacementOperator3194 = metamutator.Selector.of(3194,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3194");

    private static final metamutator.Selector _returnReplacementOperator3195 = metamutator.Selector.of(3195,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3195");

    private static final metamutator.Selector _returnReplacementOperator3196 = metamutator.Selector.of(3196,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3196");

    private static final metamutator.Selector _returnReplacementOperator3197 = metamutator.Selector.of(3197,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3197");

    private static final metamutator.Selector _returnReplacementOperator3198 = metamutator.Selector.of(3198,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3198");

    private static final metamutator.Selector _returnReplacementOperator3199 = metamutator.Selector.of(3199,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3199");

    private static final metamutator.Selector _returnReplacementOperator3200 = metamutator.Selector.of(3200,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3200");

    private static final metamutator.Selector _returnReplacementOperator3201 = metamutator.Selector.of(3201,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3201");

    private static final metamutator.Selector _returnReplacementOperator3202 = metamutator.Selector.of(3202,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3202");

    private static final metamutator.Selector _returnReplacementOperator3203 = metamutator.Selector.of(3203,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3203");

    private static final metamutator.Selector _returnReplacementOperator3204 = metamutator.Selector.of(3204,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3204");

    private static final metamutator.Selector _returnReplacementOperator3205 = metamutator.Selector.of(3205,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3205");

    private static final metamutator.Selector _returnReplacementOperator3206 = metamutator.Selector.of(3206,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3206");

    private static final metamutator.Selector _returnReplacementOperator3207 = metamutator.Selector.of(3207,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3207");

    private static final metamutator.Selector _returnReplacementOperator3208 = metamutator.Selector.of(3208,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3208");

    private static final metamutator.Selector _returnReplacementOperator3209 = metamutator.Selector.of(3209,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3209");

    private static final metamutator.Selector _returnReplacementOperator3210 = metamutator.Selector.of(3210,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3210");

    private static final metamutator.Selector _returnReplacementOperator3211 = metamutator.Selector.of(3211,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3211");

    private static final metamutator.Selector _returnReplacementOperator3212 = metamutator.Selector.of(3212,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3212");

    private static final metamutator.Selector _returnReplacementOperator3213 = metamutator.Selector.of(3213,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3213");

    private static final metamutator.Selector _returnReplacementOperator3214 = metamutator.Selector.of(3214,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3214");

    private static final metamutator.Selector _returnReplacementOperator3215 = metamutator.Selector.of(3215,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3215");

    private static final metamutator.Selector _returnReplacementOperator3216 = metamutator.Selector.of(3216,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3216");

    private static final metamutator.Selector _returnReplacementOperator3217 = metamutator.Selector.of(3217,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3217");

    private static final metamutator.Selector _returnReplacementOperator3218 = metamutator.Selector.of(3218,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3218");

    private static final metamutator.Selector _returnReplacementOperator3219 = metamutator.Selector.of(3219,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3219");

    private static final metamutator.Selector _returnReplacementOperator3220 = metamutator.Selector.of(3220,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3220");

    private static final metamutator.Selector _returnReplacementOperator3221 = metamutator.Selector.of(3221,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3221");

    private static final metamutator.Selector _returnReplacementOperator3222 = metamutator.Selector.of(3222,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3222");

    private static final metamutator.Selector _returnReplacementOperator3223 = metamutator.Selector.of(3223,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3223");

    private static final metamutator.Selector _returnReplacementOperator3224 = metamutator.Selector.of(3224,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3224");

    private static final metamutator.Selector _returnReplacementOperator3225 = metamutator.Selector.of(3225,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3225");

    private static final metamutator.Selector _returnReplacementOperator3226 = metamutator.Selector.of(3226,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3226");

    private static final metamutator.Selector _returnReplacementOperator3227 = metamutator.Selector.of(3227,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3227");

    private static final metamutator.Selector _returnReplacementOperator3228 = metamutator.Selector.of(3228,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3228");

    private static final metamutator.Selector _returnReplacementOperator3229 = metamutator.Selector.of(3229,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3229");

    private static final metamutator.Selector _returnReplacementOperator3230 = metamutator.Selector.of(3230,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3230");

    private static final metamutator.Selector _returnReplacementOperator3231 = metamutator.Selector.of(3231,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3231");

    private static final metamutator.Selector _returnReplacementOperator3232 = metamutator.Selector.of(3232,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3232");

    private static final metamutator.Selector _returnReplacementOperator3233 = metamutator.Selector.of(3233,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3233");

    private static final metamutator.Selector _returnReplacementOperator3234 = metamutator.Selector.of(3234,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3234");

    private static final metamutator.Selector _returnReplacementOperator3235 = metamutator.Selector.of(3235,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3235");

    private static final metamutator.Selector _returnReplacementOperator3236 = metamutator.Selector.of(3236,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3236");

    private static final metamutator.Selector _returnReplacementOperator3237 = metamutator.Selector.of(3237,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3237");

    private static final metamutator.Selector _returnReplacementOperator3238 = metamutator.Selector.of(3238,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3238");

    private static final metamutator.Selector _returnReplacementOperator3239 = metamutator.Selector.of(3239,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3239");

    private static final metamutator.Selector _returnReplacementOperator3240 = metamutator.Selector.of(3240,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3240");

    private static final metamutator.Selector _returnReplacementOperator3241 = metamutator.Selector.of(3241,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3241");

    private static final metamutator.Selector _returnReplacementOperator3242 = metamutator.Selector.of(3242,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3242");

    private static final metamutator.Selector _returnReplacementOperator3243 = metamutator.Selector.of(3243,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3243");

    private static final metamutator.Selector _returnReplacementOperator3244 = metamutator.Selector.of(3244,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3244");

    private static final metamutator.Selector _returnReplacementOperator3245 = metamutator.Selector.of(3245,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3245");

    private static final metamutator.Selector _returnReplacementOperator3246 = metamutator.Selector.of(3246,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3246");

    private static final metamutator.Selector _returnReplacementOperator3247 = metamutator.Selector.of(3247,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3247");

    private static final metamutator.Selector _returnReplacementOperator3248 = metamutator.Selector.of(3248,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3248");

    private static final metamutator.Selector _returnReplacementOperator3249 = metamutator.Selector.of(3249,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3249");

    private static final metamutator.Selector _returnReplacementOperator3250 = metamutator.Selector.of(3250,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3250");

    private static final metamutator.Selector _returnReplacementOperator3251 = metamutator.Selector.of(3251,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3251");

    private static final metamutator.Selector _returnReplacementOperator3252 = metamutator.Selector.of(3252,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3252");

    private static final metamutator.Selector _returnReplacementOperator3253 = metamutator.Selector.of(3253,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3253");

    private static final metamutator.Selector _returnReplacementOperator3254 = metamutator.Selector.of(3254,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3254");

    private static final metamutator.Selector _returnReplacementOperator3255 = metamutator.Selector.of(3255,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3255");

    private static final metamutator.Selector _returnReplacementOperator3256 = metamutator.Selector.of(3256,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3256");

    private static final metamutator.Selector _returnReplacementOperator3257 = metamutator.Selector.of(3257,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3257");

    private static final metamutator.Selector _returnReplacementOperator3258 = metamutator.Selector.of(3258,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3258");

    private static final metamutator.Selector _returnReplacementOperator3259 = metamutator.Selector.of(3259,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3259");

    private static final metamutator.Selector _returnReplacementOperator3260 = metamutator.Selector.of(3260,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3260");

    private static final metamutator.Selector _returnReplacementOperator3261 = metamutator.Selector.of(3261,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3261");

    private static final metamutator.Selector _returnReplacementOperator3262 = metamutator.Selector.of(3262,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3262");

    private static final metamutator.Selector _returnReplacementOperator3263 = metamutator.Selector.of(3263,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3263");

    private static final metamutator.Selector _returnReplacementOperator3264 = metamutator.Selector.of(3264,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3264");

    private static final metamutator.Selector _returnReplacementOperator3265 = metamutator.Selector.of(3265,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3265");

    private static final metamutator.Selector _returnReplacementOperator3266 = metamutator.Selector.of(3266,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3266");

    private static final metamutator.Selector _returnReplacementOperator3267 = metamutator.Selector.of(3267,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3267");

    private static final metamutator.Selector _returnReplacementOperator3268 = metamutator.Selector.of(3268,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3268");

    private static final metamutator.Selector _returnReplacementOperator3269 = metamutator.Selector.of(3269,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3269");

    private static final metamutator.Selector _returnReplacementOperator3270 = metamutator.Selector.of(3270,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3270");

    private static final metamutator.Selector _returnReplacementOperator3271 = metamutator.Selector.of(3271,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3271");

    private static final metamutator.Selector _returnReplacementOperator3272 = metamutator.Selector.of(3272,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3272");

    private static final metamutator.Selector _returnReplacementOperator3273 = metamutator.Selector.of(3273,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3273");

    private static final metamutator.Selector _returnReplacementOperator3274 = metamutator.Selector.of(3274,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3274");

    private static final metamutator.Selector _returnReplacementOperator3275 = metamutator.Selector.of(3275,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3275");

    private static final metamutator.Selector _returnReplacementOperator3276 = metamutator.Selector.of(3276,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3276");

    private static final metamutator.Selector _returnReplacementOperator3277 = metamutator.Selector.of(3277,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3277");

    private static final metamutator.Selector _returnReplacementOperator3278 = metamutator.Selector.of(3278,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3278");

    private static final metamutator.Selector _returnReplacementOperator3279 = metamutator.Selector.of(3279,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3279");

    private static final metamutator.Selector _returnReplacementOperator3280 = metamutator.Selector.of(3280,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3280");

    private static final metamutator.Selector _returnReplacementOperator3281 = metamutator.Selector.of(3281,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3281");

    private static final metamutator.Selector _returnReplacementOperator3282 = metamutator.Selector.of(3282,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3282");

    private static final metamutator.Selector _returnReplacementOperator3283 = metamutator.Selector.of(3283,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3283");

    private static final metamutator.Selector _returnReplacementOperator3284 = metamutator.Selector.of(3284,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3284");

    private static final metamutator.Selector _returnReplacementOperator3285 = metamutator.Selector.of(3285,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3285");

    private static final metamutator.Selector _returnReplacementOperator3286 = metamutator.Selector.of(3286,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3286");

    private static final metamutator.Selector _returnReplacementOperator3287 = metamutator.Selector.of(3287,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3287");

    private static final metamutator.Selector _returnReplacementOperator3288 = metamutator.Selector.of(3288,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3288");

    private static final metamutator.Selector _returnReplacementOperator3289 = metamutator.Selector.of(3289,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3289");

    private static final metamutator.Selector _returnReplacementOperator3290 = metamutator.Selector.of(3290,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3290");

    private static final metamutator.Selector _returnReplacementOperator3291 = metamutator.Selector.of(3291,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3291");

    private static final metamutator.Selector _returnReplacementOperator3292 = metamutator.Selector.of(3292,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3292");

    private static final metamutator.Selector _returnReplacementOperator3293 = metamutator.Selector.of(3293,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3293");

    private static final metamutator.Selector _returnReplacementOperator3294 = metamutator.Selector.of(3294,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3294");

    private static final metamutator.Selector _returnReplacementOperator3295 = metamutator.Selector.of(3295,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3295");

    private static final metamutator.Selector _returnReplacementOperator3296 = metamutator.Selector.of(3296,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3296");

    private static final metamutator.Selector _returnReplacementOperator3297 = metamutator.Selector.of(3297,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3297");

    private static final metamutator.Selector _returnReplacementOperator3298 = metamutator.Selector.of(3298,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3298");

    private static final metamutator.Selector _returnReplacementOperator3299 = metamutator.Selector.of(3299,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3299");

    private static final metamutator.Selector _returnReplacementOperator3300 = metamutator.Selector.of(3300,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3300");

    private static final metamutator.Selector _returnReplacementOperator3301 = metamutator.Selector.of(3301,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3301");

    private static final metamutator.Selector _returnReplacementOperator3302 = metamutator.Selector.of(3302,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3302");

    private static final metamutator.Selector _returnReplacementOperator3303 = metamutator.Selector.of(3303,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3303");

    private static final metamutator.Selector _returnReplacementOperator3304 = metamutator.Selector.of(3304,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3304");

    private static final metamutator.Selector _returnReplacementOperator3305 = metamutator.Selector.of(3305,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3305");

    private static final metamutator.Selector _returnReplacementOperator3306 = metamutator.Selector.of(3306,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3306");

    private static final metamutator.Selector _returnReplacementOperator3307 = metamutator.Selector.of(3307,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3307");

    private static final metamutator.Selector _returnReplacementOperator3308 = metamutator.Selector.of(3308,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3308");

    private static final metamutator.Selector _returnReplacementOperator3309 = metamutator.Selector.of(3309,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3309");

    private static final metamutator.Selector _returnReplacementOperator3310 = metamutator.Selector.of(3310,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3310");

    private static final metamutator.Selector _returnReplacementOperator3311 = metamutator.Selector.of(3311,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3311");

    private static final metamutator.Selector _returnReplacementOperator3312 = metamutator.Selector.of(3312,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3312");

    private static final metamutator.Selector _returnReplacementOperator3313 = metamutator.Selector.of(3313,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3313");

    private static final metamutator.Selector _returnReplacementOperator3314 = metamutator.Selector.of(3314,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3314");

    private static final metamutator.Selector _returnReplacementOperator3315 = metamutator.Selector.of(3315,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3315");

    private static final metamutator.Selector _returnReplacementOperator3316 = metamutator.Selector.of(3316,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3316");

    private static final metamutator.Selector _returnReplacementOperator3317 = metamutator.Selector.of(3317,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3317");

    private static final metamutator.Selector _returnReplacementOperator3318 = metamutator.Selector.of(3318,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3318");

    private static final metamutator.Selector _returnReplacementOperator3319 = metamutator.Selector.of(3319,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3319");

    private static final metamutator.Selector _returnReplacementOperator3320 = metamutator.Selector.of(3320,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3320");

    private static final metamutator.Selector _returnReplacementOperator3321 = metamutator.Selector.of(3321,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3321");

    private static final metamutator.Selector _returnReplacementOperator3322 = metamutator.Selector.of(3322,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3322");

    private static final metamutator.Selector _returnReplacementOperator3323 = metamutator.Selector.of(3323,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3323");

    private static final metamutator.Selector _returnReplacementOperator3324 = metamutator.Selector.of(3324,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3324");

    private static final metamutator.Selector _returnReplacementOperator3325 = metamutator.Selector.of(3325,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3325");

    private static final metamutator.Selector _returnReplacementOperator3326 = metamutator.Selector.of(3326,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3326");

    private static final metamutator.Selector _returnReplacementOperator3327 = metamutator.Selector.of(3327,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3327");

    private static final metamutator.Selector _returnReplacementOperator3328 = metamutator.Selector.of(3328,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3328");

    private static final metamutator.Selector _returnReplacementOperator3329 = metamutator.Selector.of(3329,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3329");

    private static final metamutator.Selector _returnReplacementOperator3330 = metamutator.Selector.of(3330,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3330");

    private static final metamutator.Selector _returnReplacementOperator3331 = metamutator.Selector.of(3331,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3331");

    private static final metamutator.Selector _returnReplacementOperator3332 = metamutator.Selector.of(3332,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3332");

    private static final metamutator.Selector _returnReplacementOperator3333 = metamutator.Selector.of(3333,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3333");

    private static final metamutator.Selector _returnReplacementOperator3334 = metamutator.Selector.of(3334,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3334");

    private static final metamutator.Selector _returnReplacementOperator3335 = metamutator.Selector.of(3335,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3335");

    private static final metamutator.Selector _returnReplacementOperator3336 = metamutator.Selector.of(3336,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3336");

    private static final metamutator.Selector _returnReplacementOperator3337 = metamutator.Selector.of(3337,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3337");

    private static final metamutator.Selector _returnReplacementOperator3338 = metamutator.Selector.of(3338,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3338");

    private static final metamutator.Selector _returnReplacementOperator3339 = metamutator.Selector.of(3339,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3339");

    private static final metamutator.Selector _returnReplacementOperator3340 = metamutator.Selector.of(3340,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3340");

    private static final metamutator.Selector _returnReplacementOperator3341 = metamutator.Selector.of(3341,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3341");

    private static final metamutator.Selector _returnReplacementOperator3342 = metamutator.Selector.of(3342,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3342");

    private static final metamutator.Selector _returnReplacementOperator3343 = metamutator.Selector.of(3343,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3343");

    private static final metamutator.Selector _returnReplacementOperator3344 = metamutator.Selector.of(3344,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3344");

    private static final metamutator.Selector _returnReplacementOperator3345 = metamutator.Selector.of(3345,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3345");

    private static final metamutator.Selector _returnReplacementOperator3346 = metamutator.Selector.of(3346,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3346");

    private static final metamutator.Selector _returnReplacementOperator3347 = metamutator.Selector.of(3347,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3347");

    private static final metamutator.Selector _returnReplacementOperator3348 = metamutator.Selector.of(3348,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3348");

    private static final metamutator.Selector _returnReplacementOperator3349 = metamutator.Selector.of(3349,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3349");

    private static final metamutator.Selector _returnReplacementOperator3350 = metamutator.Selector.of(3350,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3350");

    private static final metamutator.Selector _returnReplacementOperator3351 = metamutator.Selector.of(3351,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3351");

    private static final metamutator.Selector _returnReplacementOperator3352 = metamutator.Selector.of(3352,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3352");

    private static final metamutator.Selector _returnReplacementOperator3353 = metamutator.Selector.of(3353,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3353");

    private static final metamutator.Selector _returnReplacementOperator3354 = metamutator.Selector.of(3354,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3354");

    private static final metamutator.Selector _returnReplacementOperator3355 = metamutator.Selector.of(3355,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3355");

    private static final metamutator.Selector _returnReplacementOperator3356 = metamutator.Selector.of(3356,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3356");

    private static final metamutator.Selector _returnReplacementOperator3357 = metamutator.Selector.of(3357,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3357");

    private static final metamutator.Selector _returnReplacementOperator3358 = metamutator.Selector.of(3358,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3358");

    private static final metamutator.Selector _returnReplacementOperator3359 = metamutator.Selector.of(3359,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3359");

    private static final metamutator.Selector _returnReplacementOperator3360 = metamutator.Selector.of(3360,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3360");

    private static final metamutator.Selector _returnReplacementOperator3361 = metamutator.Selector.of(3361,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3361");

    private static final metamutator.Selector _returnReplacementOperator3362 = metamutator.Selector.of(3362,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3362");

    private static final metamutator.Selector _returnReplacementOperator3363 = metamutator.Selector.of(3363,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3363");

    private static final metamutator.Selector _returnReplacementOperator3364 = metamutator.Selector.of(3364,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3364");

    private static final metamutator.Selector _returnReplacementOperator3365 = metamutator.Selector.of(3365,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3365");

    private static final metamutator.Selector _returnReplacementOperator3366 = metamutator.Selector.of(3366,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3366");

    private static final metamutator.Selector _returnReplacementOperator3367 = metamutator.Selector.of(3367,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3367");

    private static final metamutator.Selector _returnReplacementOperator3368 = metamutator.Selector.of(3368,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3368");

    private static final metamutator.Selector _returnReplacementOperator3369 = metamutator.Selector.of(3369,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3369");

    private static final metamutator.Selector _returnReplacementOperator3370 = metamutator.Selector.of(3370,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3370");

    private static final metamutator.Selector _returnReplacementOperator3371 = metamutator.Selector.of(3371,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3371");

    private static final metamutator.Selector _returnReplacementOperator3372 = metamutator.Selector.of(3372,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3372");

    private static final metamutator.Selector _returnReplacementOperator3373 = metamutator.Selector.of(3373,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3373");

    private static final metamutator.Selector _returnReplacementOperator3374 = metamutator.Selector.of(3374,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3374");

    private static final metamutator.Selector _returnReplacementOperator3375 = metamutator.Selector.of(3375,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3375");

    private static final metamutator.Selector _returnReplacementOperator3376 = metamutator.Selector.of(3376,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3376");

    private static final metamutator.Selector _returnReplacementOperator3377 = metamutator.Selector.of(3377,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3377");

    private static final metamutator.Selector _returnReplacementOperator3378 = metamutator.Selector.of(3378,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3378");

    private static final metamutator.Selector _returnReplacementOperator3379 = metamutator.Selector.of(3379,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3379");

    private static final metamutator.Selector _returnReplacementOperator3380 = metamutator.Selector.of(3380,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3380");

    private static final metamutator.Selector _returnReplacementOperator3381 = metamutator.Selector.of(3381,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3381");

    private static final metamutator.Selector _returnReplacementOperator3382 = metamutator.Selector.of(3382,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3382");

    private static final metamutator.Selector _returnReplacementOperator3383 = metamutator.Selector.of(3383,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3383");

    private static final metamutator.Selector _returnReplacementOperator3384 = metamutator.Selector.of(3384,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3384");

    private static final metamutator.Selector _returnReplacementOperator3385 = metamutator.Selector.of(3385,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3385");

    private static final metamutator.Selector _returnReplacementOperator3386 = metamutator.Selector.of(3386,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3386");

    private static final metamutator.Selector _returnReplacementOperator3387 = metamutator.Selector.of(3387,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3387");

    private static final metamutator.Selector _returnReplacementOperator3388 = metamutator.Selector.of(3388,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3388");

    private static final metamutator.Selector _returnReplacementOperator3389 = metamutator.Selector.of(3389,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3389");

    private static final metamutator.Selector _returnReplacementOperator3390 = metamutator.Selector.of(3390,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3390");

    private static final metamutator.Selector _returnReplacementOperator3391 = metamutator.Selector.of(3391,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3391");

    private static final metamutator.Selector _returnReplacementOperator3392 = metamutator.Selector.of(3392,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3392");

    private static final metamutator.Selector _returnReplacementOperator3393 = metamutator.Selector.of(3393,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3393");

    private static final metamutator.Selector _returnReplacementOperator3394 = metamutator.Selector.of(3394,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3394");

    private static final metamutator.Selector _returnReplacementOperator3395 = metamutator.Selector.of(3395,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3395");

    private static final metamutator.Selector _returnReplacementOperator3396 = metamutator.Selector.of(3396,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3396");

    private static final metamutator.Selector _returnReplacementOperator3397 = metamutator.Selector.of(3397,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3397");

    private static final metamutator.Selector _returnReplacementOperator3398 = metamutator.Selector.of(3398,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3398");

    private static final metamutator.Selector _returnReplacementOperator3399 = metamutator.Selector.of(3399,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3399");

    private static final metamutator.Selector _returnReplacementOperator3400 = metamutator.Selector.of(3400,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3400");

    private static final metamutator.Selector _returnReplacementOperator3401 = metamutator.Selector.of(3401,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3401");

    private static final metamutator.Selector _returnReplacementOperator3402 = metamutator.Selector.of(3402,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3402");

    private static final metamutator.Selector _returnReplacementOperator3403 = metamutator.Selector.of(3403,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3403");

    private static final metamutator.Selector _returnReplacementOperator3404 = metamutator.Selector.of(3404,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3404");

    private static final metamutator.Selector _returnReplacementOperator3405 = metamutator.Selector.of(3405,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3405");

    private static final metamutator.Selector _returnReplacementOperator3406 = metamutator.Selector.of(3406,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3406");

    private static final metamutator.Selector _returnReplacementOperator3407 = metamutator.Selector.of(3407,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3407");

    private static final metamutator.Selector _returnReplacementOperator3408 = metamutator.Selector.of(3408,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3408");

    private static final metamutator.Selector _returnReplacementOperator3409 = metamutator.Selector.of(3409,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3409");

    private static final metamutator.Selector _returnReplacementOperator3410 = metamutator.Selector.of(3410,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3410");

    private static final metamutator.Selector _returnReplacementOperator3411 = metamutator.Selector.of(3411,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3411");

    private static final metamutator.Selector _returnReplacementOperator3412 = metamutator.Selector.of(3412,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3412");

    private static final metamutator.Selector _returnReplacementOperator3413 = metamutator.Selector.of(3413,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3413");

    private static final metamutator.Selector _returnReplacementOperator3414 = metamutator.Selector.of(3414,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3414");

    private static final metamutator.Selector _returnReplacementOperator3415 = metamutator.Selector.of(3415,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3415");

    private static final metamutator.Selector _returnReplacementOperator3416 = metamutator.Selector.of(3416,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3416");

    private static final metamutator.Selector _returnReplacementOperator3417 = metamutator.Selector.of(3417,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3417");

    private static final metamutator.Selector _returnReplacementOperator3418 = metamutator.Selector.of(3418,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3418");

    private static final metamutator.Selector _returnReplacementOperator3419 = metamutator.Selector.of(3419,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3419");

    private static final metamutator.Selector _returnReplacementOperator3420 = metamutator.Selector.of(3420,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3420");

    private static final metamutator.Selector _returnReplacementOperator3421 = metamutator.Selector.of(3421,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3421");

    private static final metamutator.Selector _returnReplacementOperator3422 = metamutator.Selector.of(3422,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3422");

    private static final metamutator.Selector _returnReplacementOperator3423 = metamutator.Selector.of(3423,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3423");

    private static final metamutator.Selector _returnReplacementOperator3424 = metamutator.Selector.of(3424,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3424");

    private static final metamutator.Selector _returnReplacementOperator3425 = metamutator.Selector.of(3425,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3425");

    private static final metamutator.Selector _returnReplacementOperator3426 = metamutator.Selector.of(3426,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3426");

    private static final metamutator.Selector _returnReplacementOperator3427 = metamutator.Selector.of(3427,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3427");

    private static final metamutator.Selector _returnReplacementOperator3428 = metamutator.Selector.of(3428,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3428");

    private static final metamutator.Selector _returnReplacementOperator3429 = metamutator.Selector.of(3429,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3429");

    private static final metamutator.Selector _returnReplacementOperator3430 = metamutator.Selector.of(3430,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3430");

    private static final metamutator.Selector _returnReplacementOperator3431 = metamutator.Selector.of(3431,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3431");

    private static final metamutator.Selector _returnReplacementOperator3432 = metamutator.Selector.of(3432,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3432");

    private static final metamutator.Selector _returnReplacementOperator3433 = metamutator.Selector.of(3433,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3433");

    private static final metamutator.Selector _returnReplacementOperator3434 = metamutator.Selector.of(3434,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3434");

    private static final metamutator.Selector _returnReplacementOperator3435 = metamutator.Selector.of(3435,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3435");

    private static final metamutator.Selector _returnReplacementOperator3436 = metamutator.Selector.of(3436,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3436");

    private static final metamutator.Selector _returnReplacementOperator3437 = metamutator.Selector.of(3437,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3437");

    private static final metamutator.Selector _returnReplacementOperator3438 = metamutator.Selector.of(3438,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3438");

    private static final metamutator.Selector _returnReplacementOperator3439 = metamutator.Selector.of(3439,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3439");

    private static final metamutator.Selector _returnReplacementOperator3440 = metamutator.Selector.of(3440,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3440");

    private static final metamutator.Selector _returnReplacementOperator3441 = metamutator.Selector.of(3441,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3441");

    private static final metamutator.Selector _returnReplacementOperator3442 = metamutator.Selector.of(3442,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3442");

    private static final metamutator.Selector _returnReplacementOperator3443 = metamutator.Selector.of(3443,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3443");

    private static final metamutator.Selector _returnReplacementOperator3444 = metamutator.Selector.of(3444,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3444");

    private static final metamutator.Selector _returnReplacementOperator3445 = metamutator.Selector.of(3445,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3445");

    private static final metamutator.Selector _returnReplacementOperator3446 = metamutator.Selector.of(3446,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3446");

    private static final metamutator.Selector _returnReplacementOperator3447 = metamutator.Selector.of(3447,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3447");

    private static final metamutator.Selector _returnReplacementOperator3448 = metamutator.Selector.of(3448,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3448");

    private static final metamutator.Selector _returnReplacementOperator3449 = metamutator.Selector.of(3449,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3449");

    private static final metamutator.Selector _returnReplacementOperator3450 = metamutator.Selector.of(3450,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3450");

    private static final metamutator.Selector _returnReplacementOperator3451 = metamutator.Selector.of(3451,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3451");

    private static final metamutator.Selector _returnReplacementOperator3452 = metamutator.Selector.of(3452,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3452");

    private static final metamutator.Selector _returnReplacementOperator3453 = metamutator.Selector.of(3453,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3453");

    private static final metamutator.Selector _returnReplacementOperator3454 = metamutator.Selector.of(3454,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3454");

    private static final metamutator.Selector _returnReplacementOperator3455 = metamutator.Selector.of(3455,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3455");

    private static final metamutator.Selector _returnReplacementOperator3456 = metamutator.Selector.of(3456,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3456");

    private static final metamutator.Selector _returnReplacementOperator3457 = metamutator.Selector.of(3457,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3457");

    private static final metamutator.Selector _returnReplacementOperator3458 = metamutator.Selector.of(3458,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3458");

    private static final metamutator.Selector _returnReplacementOperator3459 = metamutator.Selector.of(3459,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3459");

    private static final metamutator.Selector _returnReplacementOperator3460 = metamutator.Selector.of(3460,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3460");

    private static final metamutator.Selector _returnReplacementOperator3461 = metamutator.Selector.of(3461,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3461");

    private static final metamutator.Selector _returnReplacementOperator3462 = metamutator.Selector.of(3462,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3462");

    private static final metamutator.Selector _returnReplacementOperator3463 = metamutator.Selector.of(3463,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3463");

    private static final metamutator.Selector _returnReplacementOperator3464 = metamutator.Selector.of(3464,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3464");

    private static final metamutator.Selector _returnReplacementOperator3465 = metamutator.Selector.of(3465,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3465");

    private static final metamutator.Selector _returnReplacementOperator3466 = metamutator.Selector.of(3466,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3466");

    private static final metamutator.Selector _returnReplacementOperator3467 = metamutator.Selector.of(3467,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3467");

    private static final metamutator.Selector _returnReplacementOperator3468 = metamutator.Selector.of(3468,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3468");

    private static final metamutator.Selector _returnReplacementOperator3469 = metamutator.Selector.of(3469,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3469");

    private static final metamutator.Selector _returnReplacementOperator3470 = metamutator.Selector.of(3470,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3470");

    private static final metamutator.Selector _returnReplacementOperator3471 = metamutator.Selector.of(3471,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3471");

    private static final metamutator.Selector _returnReplacementOperator3472 = metamutator.Selector.of(3472,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3472");

    private static final metamutator.Selector _returnReplacementOperator3473 = metamutator.Selector.of(3473,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringUtils.class).id("_returnReplacementOperator3473");
}

