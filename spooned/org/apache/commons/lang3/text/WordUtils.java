package org.apache.commons.lang3.text;


public class WordUtils {
    public WordUtils() {
        super();
    }

    public static java.lang.String wrap(final java.lang.String str, final int wrapLength) {
        return ((_returnReplacementOperator1580.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.wrap(str, wrapLength, null, false)));
    }

    public static java.lang.String wrap(final java.lang.String str, int wrapLength, java.lang.String newLineStr, final boolean wrapLongWords) {
        if (str == null) {
            return ((_returnReplacementOperator1581.is("NULL")) ? ( null ) : (null));
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
        return ((_returnReplacementOperator1582.is("NULL")) ? ( null ) : (wrappedLine.toString()));
    }

    public static java.lang.String capitalize(final java.lang.String str) {
        return ((_returnReplacementOperator1565.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.capitalize(str, null)));
    }

    public static java.lang.String capitalize(final java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return ((_returnReplacementOperator1566.is("NULL")) ? ( null ) : (str));
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
        return ((_returnReplacementOperator1567.is("NULL")) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static java.lang.String capitalizeFully(final java.lang.String str) {
        return ((_returnReplacementOperator1568.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.capitalizeFully(str, null)));
    }

    public static java.lang.String capitalizeFully(java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return ((_returnReplacementOperator1569.is("NULL")) ? ( null ) : (str));
        } 
        str = str.toLowerCase();
        return ((_returnReplacementOperator1570.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.capitalize(str, delimiters)));
    }

    public static java.lang.String uncapitalize(final java.lang.String str) {
        return ((_returnReplacementOperator1577.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.uncapitalize(str, null)));
    }

    public static java.lang.String uncapitalize(final java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return ((_returnReplacementOperator1578.is("NULL")) ? ( null ) : (str));
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
        return ((_returnReplacementOperator1579.is("NULL")) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static java.lang.String swapCase(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator1575.is("NULL")) ? ( null ) : (str));
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
        return ((_returnReplacementOperator1576.is("NULL")) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static java.lang.String initials(final java.lang.String str) {
        return ((_returnReplacementOperator1571.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.WordUtils.initials(str, null)));
    }

    public static java.lang.String initials(final java.lang.String str, final char... delimiters) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator1572.is("NULL")) ? ( null ) : (str));
        } 
        if ((delimiters != null) && ((delimiters.length) == 0)) {
            return ((_returnReplacementOperator1573.is("NULL")) ? ( null ) : (""));
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
        return ((_returnReplacementOperator1574.is("NULL")) ? ( null ) : (new java.lang.String(buf , 0 , count)));
    }

    public static boolean containsAllWords(java.lang.CharSequence word, java.lang.CharSequence... words) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(word)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(words))) {
            return ((_returnReplacementOperator1558.is("NULL")) ? ( null ) : (false));
        } 
        for (java.lang.CharSequence w : words) {
            if (org.apache.commons.lang3.StringUtils.isBlank(w)) {
                return ((_returnReplacementOperator1559.is("NULL")) ? ( null ) : (false));
            } 
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(((".*\\b" + w) + "\\b.*"));
            if (!(p.matcher(word).matches())) {
                return ((_returnReplacementOperator1560.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1561.is("NULL")) ? ( null ) : (true));
    }

    private static boolean isDelimiter(final char ch, final char[] delimiters) {
        if (delimiters == null) {
            return ((_returnReplacementOperator1562.is("NULL")) ? ( null ) : (java.lang.Character.isWhitespace(ch)));
        } 
        for (final char delimiter : delimiters) {
            if (ch == delimiter) {
                return ((_returnReplacementOperator1563.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator1564.is("NULL")) ? ( null ) : (false));
    }

    private static final metamutator.Selector _returnReplacementOperator1558 = metamutator.Selector.of(1558,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1558");

    private static final metamutator.Selector _returnReplacementOperator1559 = metamutator.Selector.of(1559,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1559");

    private static final metamutator.Selector _returnReplacementOperator1560 = metamutator.Selector.of(1560,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1560");

    private static final metamutator.Selector _returnReplacementOperator1561 = metamutator.Selector.of(1561,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1561");

    private static final metamutator.Selector _returnReplacementOperator1562 = metamutator.Selector.of(1562,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1562");

    private static final metamutator.Selector _returnReplacementOperator1563 = metamutator.Selector.of(1563,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1563");

    private static final metamutator.Selector _returnReplacementOperator1564 = metamutator.Selector.of(1564,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1564");

    private static final metamutator.Selector _returnReplacementOperator1565 = metamutator.Selector.of(1565,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1565");

    private static final metamutator.Selector _returnReplacementOperator1566 = metamutator.Selector.of(1566,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1566");

    private static final metamutator.Selector _returnReplacementOperator1567 = metamutator.Selector.of(1567,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1567");

    private static final metamutator.Selector _returnReplacementOperator1568 = metamutator.Selector.of(1568,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1568");

    private static final metamutator.Selector _returnReplacementOperator1569 = metamutator.Selector.of(1569,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1569");

    private static final metamutator.Selector _returnReplacementOperator1570 = metamutator.Selector.of(1570,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1570");

    private static final metamutator.Selector _returnReplacementOperator1571 = metamutator.Selector.of(1571,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1571");

    private static final metamutator.Selector _returnReplacementOperator1572 = metamutator.Selector.of(1572,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1572");

    private static final metamutator.Selector _returnReplacementOperator1573 = metamutator.Selector.of(1573,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1573");

    private static final metamutator.Selector _returnReplacementOperator1574 = metamutator.Selector.of(1574,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1574");

    private static final metamutator.Selector _returnReplacementOperator1575 = metamutator.Selector.of(1575,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1575");

    private static final metamutator.Selector _returnReplacementOperator1576 = metamutator.Selector.of(1576,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1576");

    private static final metamutator.Selector _returnReplacementOperator1577 = metamutator.Selector.of(1577,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1577");

    private static final metamutator.Selector _returnReplacementOperator1578 = metamutator.Selector.of(1578,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1578");

    private static final metamutator.Selector _returnReplacementOperator1579 = metamutator.Selector.of(1579,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1579");

    private static final metamutator.Selector _returnReplacementOperator1580 = metamutator.Selector.of(1580,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1580");

    private static final metamutator.Selector _returnReplacementOperator1581 = metamutator.Selector.of(1581,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1581");

    private static final metamutator.Selector _returnReplacementOperator1582 = metamutator.Selector.of(1582,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_returnReplacementOperator1582");
}

