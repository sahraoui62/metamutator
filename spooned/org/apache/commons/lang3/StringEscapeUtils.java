package org.apache.commons.lang3;


public class StringEscapeUtils {
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_JAVA = new org.apache.commons.lang3.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ "\"" , "\\\"" } , new java.lang.String[]{ "\\" , "\\\\" } }).with(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE())).with(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(32, 127));

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_ECMASCRIPT = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ "'" , "\\\'" } , new java.lang.String[]{ "\"" , "\\\"" } , new java.lang.String[]{ "\\" , "\\\\" } , new java.lang.String[]{ "/" , "\\/" } }) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()) , org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(32, 127));

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_JSON = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ "\"" , "\\\"" } , new java.lang.String[]{ "\\" , "\\\\" } , new java.lang.String[]{ "/" , "\\/" } }) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()) , org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(32, 127));

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()));

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML10 = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ " " , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "\b" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "\f" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "" , "" } , new java.lang.String[]{ "\ufffe" , "" } , new java.lang.String[]{ "\uffff" , "" } }) , org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(127, 132) , org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(134, 159) , new org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover());

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML11 = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ " " , "" } , new java.lang.String[]{ "" , "&#11;" } , new java.lang.String[]{ "\f" , "&#12;" } , new java.lang.String[]{ "\ufffe" , "" } , new java.lang.String[]{ "\uffff" , "" } }) , org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 8) , org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(14, 31) , org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(127, 132) , org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(134, 159) , new org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover());

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_HTML3 = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()));

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_HTML4 = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE()));

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_CSV = new org.apache.commons.lang3.StringEscapeUtils.CsvEscaper();

    static class CsvEscaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';

        private static final char CSV_QUOTE = '"';

        private static final java.lang.String CSV_QUOTE_STR = java.lang.String.valueOf(CSV_QUOTE);

        private static final char[] CSV_SEARCH_CHARS = new char[]{ CSV_DELIMITER , CSV_QUOTE , org.apache.commons.lang3.CharUtils.CR , org.apache.commons.lang3.CharUtils.LF };

        @java.lang.Override
        public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
            if (index != 0) {
                throw new java.lang.IllegalStateException("CsvEscaper should never reach the [1] index");
            } 
            if (org.apache.commons.lang3.StringUtils.containsNone(input.toString(), CSV_SEARCH_CHARS)) {
                out.write(input.toString());
            } else {
                out.write(CSV_QUOTE);
                out.write(org.apache.commons.lang3.StringUtils.replace(input.toString(), CSV_QUOTE_STR, ((CSV_QUOTE_STR) + (CSV_QUOTE_STR))));
                out.write(CSV_QUOTE);
            }
            return java.lang.Character.codePointCount(input, 0, input.length());
        }
    }

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_JAVA = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.OctalUnescaper() , new org.apache.commons.lang3.text.translate.UnicodeUnescaper() , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ "\\\\" , "\\" } , new java.lang.String[]{ "\\\"" , "\"" } , new java.lang.String[]{ "\\\'" , "'" } , new java.lang.String[]{ "\\" , "" } }));

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_ECMASCRIPT = UNESCAPE_JAVA;

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_JSON = UNESCAPE_JAVA;

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_HTML3 = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()) , new org.apache.commons.lang3.text.translate.NumericEntityUnescaper());

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_HTML4 = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE()) , new org.apache.commons.lang3.text.translate.NumericEntityUnescaper());

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_XML = new org.apache.commons.lang3.text.translate.AggregateTranslator(new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()) , new org.apache.commons.lang3.text.translate.LookupTranslator(org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE()) , new org.apache.commons.lang3.text.translate.NumericEntityUnescaper());

    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_CSV = new org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper();

    static class CsvUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';

        private static final char CSV_QUOTE = '"';

        private static final java.lang.String CSV_QUOTE_STR = java.lang.String.valueOf(CSV_QUOTE);

        private static final char[] CSV_SEARCH_CHARS = new char[]{ CSV_DELIMITER , CSV_QUOTE , org.apache.commons.lang3.CharUtils.CR , org.apache.commons.lang3.CharUtils.LF };

        @java.lang.Override
        public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
            if (index != 0) {
                throw new java.lang.IllegalStateException("CsvUnescaper should never reach the [1] index");
            } 
            if (((input.charAt(0)) != (CSV_QUOTE)) || ((input.charAt(((_arithmeticOperatorHotSpot710.is("PLUS")) ? (((input.length()) + 1)) : (_arithmeticOperatorHotSpot710.is("MINUS")) ? (((input.length()) - 1)) : (_arithmeticOperatorHotSpot710.is("MUL")) ? (((input.length()) * 1)) :  (((input.length()) / 1))))) != (CSV_QUOTE))) {
                out.write(input.toString());
                return java.lang.Character.codePointCount(input, 0, input.length());
            } 
            final java.lang.String quoteless = input.subSequence(1, ((_arithmeticOperatorHotSpot711.is("PLUS")) ? (((input.length()) + 1)) : (_arithmeticOperatorHotSpot711.is("MINUS")) ? (((input.length()) - 1)) : (_arithmeticOperatorHotSpot711.is("MUL")) ? (((input.length()) * 1)) :  (((input.length()) / 1)))).toString();
            if (org.apache.commons.lang3.StringUtils.containsAny(quoteless, CSV_SEARCH_CHARS)) {
                out.write(org.apache.commons.lang3.StringUtils.replace(quoteless, ((CSV_QUOTE_STR) + (CSV_QUOTE_STR)), CSV_QUOTE_STR));
            } else {
                out.write(input.toString());
            }
            return java.lang.Character.codePointCount(input, 0, input.length());
        }
    }

    public StringEscapeUtils() {
        super();
    }

    public static final java.lang.String escapeJava(final java.lang.String input) {
        return ESCAPE_JAVA.translate(input);
    }

    public static final java.lang.String escapeEcmaScript(final java.lang.String input) {
        return ESCAPE_ECMASCRIPT.translate(input);
    }

    public static final java.lang.String escapeJson(final java.lang.String input) {
        return ESCAPE_JSON.translate(input);
    }

    public static final java.lang.String unescapeJava(final java.lang.String input) {
        return UNESCAPE_JAVA.translate(input);
    }

    public static final java.lang.String unescapeEcmaScript(final java.lang.String input) {
        return UNESCAPE_ECMASCRIPT.translate(input);
    }

    public static final java.lang.String unescapeJson(final java.lang.String input) {
        return UNESCAPE_JSON.translate(input);
    }

    public static final java.lang.String escapeHtml4(final java.lang.String input) {
        return ESCAPE_HTML4.translate(input);
    }

    public static final java.lang.String escapeHtml3(final java.lang.String input) {
        return ESCAPE_HTML3.translate(input);
    }

    public static final java.lang.String unescapeHtml4(final java.lang.String input) {
        return UNESCAPE_HTML4.translate(input);
    }

    public static final java.lang.String unescapeHtml3(final java.lang.String input) {
        return UNESCAPE_HTML3.translate(input);
    }

    @java.lang.Deprecated
    public static final java.lang.String escapeXml(final java.lang.String input) {
        return ESCAPE_XML.translate(input);
    }

    public static java.lang.String escapeXml10(final java.lang.String input) {
        return ESCAPE_XML10.translate(input);
    }

    public static java.lang.String escapeXml11(final java.lang.String input) {
        return ESCAPE_XML11.translate(input);
    }

    public static final java.lang.String unescapeXml(final java.lang.String input) {
        return UNESCAPE_XML.translate(input);
    }

    public static final java.lang.String escapeCsv(final java.lang.String input) {
        return ESCAPE_CSV.translate(input);
    }

    public static final java.lang.String unescapeCsv(final java.lang.String input) {
        return UNESCAPE_CSV.translate(input);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot710 = metamutator.Selector.of(710,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot710");

    private static final metamutator.Selector _arithmeticOperatorHotSpot711 = metamutator.Selector.of(711,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot711");
}

