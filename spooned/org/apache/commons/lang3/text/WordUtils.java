package org.apache.commons.lang3.text;


public class WordUtils {
    public WordUtils() {
        super();
    }

    public static java.lang.String wrap(final java.lang.String str, final int wrapLength) {
        return org.apache.commons.lang3.text.WordUtils.wrap(str, wrapLength, null, false);
    }

    public static java.lang.String wrap(final java.lang.String str, int wrapLength, java.lang.String newLineStr, final boolean wrapLongWords) {
        if (str == null) {
            return null;
        } 
        if (newLineStr == null) {
            newLineStr = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        } 
        if (wrapLength < 1) {
            wrapLength = 1;
        } 
        final int inputLineLength = str.length();
        int offset = 0;
        final java.lang.StringBuilder wrappedLine = new java.lang.StringBuilder(((_arithmeticOperatorHotSpot270.is("PLUS")) ? ((inputLineLength + 32)) : (_arithmeticOperatorHotSpot270.is("MINUS")) ? ((inputLineLength - 32)) : (_arithmeticOperatorHotSpot270.is("MUL")) ? ((inputLineLength * 32)) :  ((inputLineLength / 32))));
        while (offset < inputLineLength) {
            if ((str.charAt(offset)) == ' ') {
                offset++;
                continue;
            } 
            if (((_arithmeticOperatorHotSpot271.is("PLUS")) ? ((inputLineLength + offset)) : (_arithmeticOperatorHotSpot271.is("MINUS")) ? ((inputLineLength - offset)) : (_arithmeticOperatorHotSpot271.is("MUL")) ? ((inputLineLength * offset)) :  ((inputLineLength / offset))) <= wrapLength) {
                break;
            } 
            int spaceToWrapAt = str.lastIndexOf(' ', ((_arithmeticOperatorHotSpot272.is("PLUS")) ? ((wrapLength + offset)) : (_arithmeticOperatorHotSpot272.is("MINUS")) ? ((wrapLength - offset)) : (_arithmeticOperatorHotSpot272.is("MUL")) ? ((wrapLength * offset)) :  ((wrapLength / offset))));
            if (spaceToWrapAt >= offset) {
                wrappedLine.append(str.substring(offset, spaceToWrapAt));
                wrappedLine.append(newLineStr);
                offset = ((_arithmeticOperatorHotSpot273.is("PLUS")) ? (spaceToWrapAt + 1) : (_arithmeticOperatorHotSpot273.is("MINUS")) ? (spaceToWrapAt - 1) : (_arithmeticOperatorHotSpot273.is("MUL")) ? (spaceToWrapAt * 1) :  (spaceToWrapAt / 1));
            } else {
                if (wrapLongWords) {
                    wrappedLine.append(str.substring(offset, ((_arithmeticOperatorHotSpot274.is("PLUS")) ? ((wrapLength + offset)) : (_arithmeticOperatorHotSpot274.is("MINUS")) ? ((wrapLength - offset)) : (_arithmeticOperatorHotSpot274.is("MUL")) ? ((wrapLength * offset)) :  ((wrapLength / offset)))));
                    wrappedLine.append(newLineStr);
                    offset += wrapLength;
                } else {
                    spaceToWrapAt = str.indexOf(' ', ((_arithmeticOperatorHotSpot275.is("PLUS")) ? ((wrapLength + offset)) : (_arithmeticOperatorHotSpot275.is("MINUS")) ? ((wrapLength - offset)) : (_arithmeticOperatorHotSpot275.is("MUL")) ? ((wrapLength * offset)) :  ((wrapLength / offset))));
                    if (spaceToWrapAt >= 0) {
                        wrappedLine.append(str.substring(offset, spaceToWrapAt));
                        wrappedLine.append(newLineStr);
                        offset = ((_arithmeticOperatorHotSpot276.is("PLUS")) ? (spaceToWrapAt + 1) : (_arithmeticOperatorHotSpot276.is("MINUS")) ? (spaceToWrapAt - 1) : (_arithmeticOperatorHotSpot276.is("MUL")) ? (spaceToWrapAt * 1) :  (spaceToWrapAt / 1));
                    } else {
                        wrappedLine.append(str.substring(offset));
                        offset = inputLineLength;
                    }
                }
            }
        }
        wrappedLine.append(str.substring(offset));
        return wrappedLine.toString();
    }

    public static java.lang.String capitalize(final java.lang.String str) {
        return org.apache.commons.lang3.text.WordUtils.capitalize(str, null);
    }

    public static java.lang.String capitalize(final java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return str;
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
        return new java.lang.String(buffer);
    }

    public static java.lang.String capitalizeFully(final java.lang.String str) {
        return org.apache.commons.lang3.text.WordUtils.capitalizeFully(str, null);
    }

    public static java.lang.String capitalizeFully(java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return str;
        } 
        str = str.toLowerCase();
        return org.apache.commons.lang3.text.WordUtils.capitalize(str, delimiters);
    }

    public static java.lang.String uncapitalize(final java.lang.String str) {
        return org.apache.commons.lang3.text.WordUtils.uncapitalize(str, null);
    }

    public static java.lang.String uncapitalize(final java.lang.String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if ((org.apache.commons.lang3.StringUtils.isEmpty(str)) || (delimLen == 0)) {
            return str;
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
        return new java.lang.String(buffer);
    }

    public static java.lang.String swapCase(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return str;
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
        return new java.lang.String(buffer);
    }

    public static java.lang.String initials(final java.lang.String str) {
        return org.apache.commons.lang3.text.WordUtils.initials(str, null);
    }

    public static java.lang.String initials(final java.lang.String str, final char... delimiters) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return str;
        } 
        if ((delimiters != null) && ((delimiters.length) == 0)) {
            return "";
        } 
        final int strLen = str.length();
        final char[] buf = new char[((_arithmeticOperatorHotSpot269.is("PLUS")) ? ((strLen + 2)) : (_arithmeticOperatorHotSpot269.is("MINUS")) ? ((strLen - 2)) : (_arithmeticOperatorHotSpot269.is("MUL")) ? ((strLen * 2)) :  ((strLen / 2))) + 1];
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
        return new java.lang.String(buf , 0 , count);
    }

    public static boolean containsAllWords(java.lang.CharSequence word, java.lang.CharSequence... words) {
        if ((org.apache.commons.lang3.StringUtils.isEmpty(word)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(words))) {
            return false;
        } 
        for (java.lang.CharSequence w : words) {
            if (org.apache.commons.lang3.StringUtils.isBlank(w)) {
                return false;
            } 
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(((".*\\b" + w) + "\\b.*"));
            if (!(p.matcher(word).matches())) {
                return false;
            } 
        }
        return true;
    }

    private static boolean isDelimiter(final char ch, final char[] delimiters) {
        if (delimiters == null) {
            return java.lang.Character.isWhitespace(ch);
        } 
        for (final char delimiter : delimiters) {
            if (ch == delimiter) {
                return true;
            } 
        }
        return false;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot269 = metamutator.Selector.of(269,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot269");

    private static final metamutator.Selector _arithmeticOperatorHotSpot270 = metamutator.Selector.of(270,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot270");

    private static final metamutator.Selector _arithmeticOperatorHotSpot271 = metamutator.Selector.of(271,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot271");

    private static final metamutator.Selector _arithmeticOperatorHotSpot272 = metamutator.Selector.of(272,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot272");

    private static final metamutator.Selector _arithmeticOperatorHotSpot273 = metamutator.Selector.of(273,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot273");

    private static final metamutator.Selector _arithmeticOperatorHotSpot274 = metamutator.Selector.of(274,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot274");

    private static final metamutator.Selector _arithmeticOperatorHotSpot275 = metamutator.Selector.of(275,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot275");

    private static final metamutator.Selector _arithmeticOperatorHotSpot276 = metamutator.Selector.of(276,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.WordUtils.class).id("_arithmeticOperatorHotSpot276");
}

