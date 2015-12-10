package org.apache.commons.lang3.text;


public class WordUtils {
    public WordUtils() {
        super();
    }

    public static java.lang.String wrap(final java.lang.String str, final int wrapLength) {
        return ((_returnReplacementOperatorHotSpot1580.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.wrap(str, wrapLength, null, false)));
    }

    public static java.lang.String wrap(final java.lang.String str, int wrapLength, java.lang.String newLineStr, final boolean wrapLongWords) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1581.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (newLineStr == null) {
            newLineStr = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        } 
        if (wrapLength < 1) {
            wrapLength = 1;
        } 
        final int inputLineLength = str.length();
        int offset = 0;
        final java.lang.StringBuilder wrappedLine = new java.lang.StringBuilder((inputLineLength + 32));
        while (offset < inputLineLength) {
            if ((str.charAt(offset)) == ' ') {
                offset++;
                continue;
            } 
            if ((inputLineLength - offset) <= wrapLength) {
                break;
            } 
            int spaceToWrapAt = str.lastIndexOf(' ', (wrapLength + offset));
            if (spaceToWrapAt >= offset) {
                wrappedLine.append(str.substring(offset, spaceToWrapAt));
                wrappedLine.append(newLineStr);
                offset = spaceToWrapAt + 1;
            } else {
                if (wrapLongWords) {
                    wrappedLine.append(str.substring(offset, (wrapLength + offset)));
                    wrappedLine.append(newLineStr);
                    offset += wrapLength;
                } else {
                    spaceToWrapAt = str.indexOf(' ', (wrapLength + offset));
                    if (spaceToWrapAt >= 0) {
                        wrappedLine.append(str.substring(offset, spaceToWrapAt));
                        wrappedLine.append(newLineStr);
                        offset = spaceToWrapAt + 1;
                    } else {
                        wrappedLine.append(str.substring(offset));
                        offset = inputLineLength;
                    }
                }
            }
        }
        wrappedLine.append(str.substring(offset));
        return ((_returnReplacementOperatorHotSpot1582.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (wrappedLine.toString()));
    }

    public static java.lang.String capitalize(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1565.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.capitalize(str, null)));
    }

    public static java.lang.String capitalize(final java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return ((_returnReplacementOperatorHotSpot1566.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
        } 
        final char[] buffer = str.toCharArray();
        boolean capitalizeNext = true;
        for (int i = 0 ; i < (buffer.length) ; i++) {
            final char ch = buffer[i];
            if (org.apache.commons.lang3.text.WordUtils.isDelimiter(ch, delimiters)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                buffer[i] = java.lang.Character.toTitleCase(ch);
                capitalizeNext = false;
            } 
        }
        return ((_returnReplacementOperatorHotSpot1567.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static java.lang.String capitalizeFully(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1568.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.capitalizeFully(str, null)));
    }

    public static java.lang.String capitalizeFully(java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return ((_returnReplacementOperatorHotSpot1569.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
        } 
        str = str.toLowerCase();
        return ((_returnReplacementOperatorHotSpot1570.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.capitalize(str, delimiters)));
    }

    public static java.lang.String uncapitalize(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1577.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.uncapitalize(str, null)));
    }

    public static java.lang.String uncapitalize(final java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return ((_returnReplacementOperatorHotSpot1578.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
        } 
        final char[] buffer = str.toCharArray();
        boolean uncapitalizeNext = true;
        for (int i = 0 ; i < (buffer.length) ; i++) {
            final char ch = buffer[i];
            if (org.apache.commons.lang3.text.WordUtils.isDelimiter(ch, delimiters)) {
                uncapitalizeNext = true;
            } else if (uncapitalizeNext) {
                buffer[i] = java.lang.Character.toLowerCase(ch);
                uncapitalizeNext = false;
            } 
        }
        return ((_returnReplacementOperatorHotSpot1579.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static java.lang.String swapCase(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperatorHotSpot1575.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
        } 
        final char[] buffer = str.toCharArray();
        boolean whitespace = true;
        for (int i = 0 ; i < (buffer.length) ; i++) {
            final char ch = buffer[i];
            if (java.lang.Character.isUpperCase(ch)) {
                buffer[i] = java.lang.Character.toLowerCase(ch);
                whitespace = false;
            } else if (java.lang.Character.isTitleCase(ch)) {
                buffer[i] = java.lang.Character.toLowerCase(ch);
                whitespace = false;
            } else if (java.lang.Character.isLowerCase(ch)) {
                if (whitespace) {
                    buffer[i] = java.lang.Character.toTitleCase(ch);
                    whitespace = false;
                } else {
                    buffer[i] = java.lang.Character.toUpperCase(ch);
                }
            } else {
                whitespace = java.lang.Character.isWhitespace(ch);
            }
        }
        return ((_returnReplacementOperatorHotSpot1576.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static java.lang.String initials(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1571.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.initials(str, null)));
    }

    public static java.lang.String initials(final java.lang.String str, final char... delimiters) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperatorHotSpot1572.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
        } 
        if ((delimiters != null) && ((delimiters.length) == 0)) {
            return ((_returnReplacementOperatorHotSpot1573.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (""));
        } 
        final int strLen = str.length();
        final char[] buf = new char[(strLen / 2) + 1];
        int count = 0;
        boolean lastWasGap = true;
        for (int i = 0 ; i < strLen ; i++) {
            final char ch = str.charAt(i);
            if (org.apache.commons.lang3.text.WordUtils.isDelimiter(ch, delimiters)) {
                lastWasGap = true;
            } else if (lastWasGap) {
                buf[count++] = ch;
                lastWasGap = false;
            } else {
                continue;
            }
        }
        return ((_returnReplacementOperatorHotSpot1574.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buf , 0 , count)));
    }

    public static boolean containsAllWords(java.lang.CharSequence word, java.lang.CharSequence... words) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(word)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(words))) {
            return ((_returnReplacementOperatorHotSpot1558.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        for (java.lang.CharSequence w : words) {
            if (org.apache.commons.lang3.StringUtils.isBlank(w)) {
                return ((_returnReplacementOperatorHotSpot1559.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(((".*\\b" + w) + "\\b.*"));
            if (!(p.matcher(word).matches())) {
                return ((_returnReplacementOperatorHotSpot1560.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1561.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static boolean isDelimiter(final char ch, final char[] delimiters) {
        if (delimiters == null) {
            return ((_returnReplacementOperatorHotSpot1562.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Character.isWhitespace(ch)));
        } 
        for (final char delimiter : delimiters) {
            if (ch == delimiter) {
                return ((_returnReplacementOperatorHotSpot1563.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1564.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1558 = metamutator.Selector.of(1558,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1558");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1559 = metamutator.Selector.of(1559,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1559");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1560 = metamutator.Selector.of(1560,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1560");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1561 = metamutator.Selector.of(1561,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1561");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1562 = metamutator.Selector.of(1562,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1562");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1563 = metamutator.Selector.of(1563,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1563");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1564 = metamutator.Selector.of(1564,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1564");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1565 = metamutator.Selector.of(1565,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1565");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1566 = metamutator.Selector.of(1566,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1566");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1567 = metamutator.Selector.of(1567,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1567");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1568 = metamutator.Selector.of(1568,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1568");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1569 = metamutator.Selector.of(1569,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1569");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1570 = metamutator.Selector.of(1570,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1570");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1571 = metamutator.Selector.of(1571,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1571");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1572 = metamutator.Selector.of(1572,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1572");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1573 = metamutator.Selector.of(1573,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1573");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1574 = metamutator.Selector.of(1574,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1574");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1575 = metamutator.Selector.of(1575,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1575");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1576 = metamutator.Selector.of(1576,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1576");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1577 = metamutator.Selector.of(1577,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1577");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1578 = metamutator.Selector.of(1578,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1578");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1579 = metamutator.Selector.of(1579,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1579");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1580 = metamutator.Selector.of(1580,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1580");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1581 = metamutator.Selector.of(1581,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1581");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1582 = metamutator.Selector.of(1582,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperatorHotSpot1582");
}

