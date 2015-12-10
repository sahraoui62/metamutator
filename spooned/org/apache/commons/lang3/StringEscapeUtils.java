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
            return ((_returnReplacementOperator2951.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2951.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2951.is("ZERO")) ? ( 0 ) : (java.lang.Character.codePointCount(input, 0, input.length())));
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
            if (((input.charAt(0)) != (CSV_QUOTE)) || ((input.charAt(((input.length()) - 1))) != (CSV_QUOTE))) {
                out.write(input.toString());
                return ((_returnReplacementOperator2952.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2952.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2952.is("ZERO")) ? ( 0 ) : (java.lang.Character.codePointCount(input, 0, input.length())));
            } 
            final java.lang.String quoteless = input.subSequence(1, ((input.length()) - 1)).toString();
            if (org.apache.commons.lang3.StringUtils.containsAny(quoteless, CSV_SEARCH_CHARS)) {
                out.write(org.apache.commons.lang3.StringUtils.replace(quoteless, ((CSV_QUOTE_STR) + (CSV_QUOTE_STR)), CSV_QUOTE_STR));
            } else {
                out.write(input.toString());
            }
            return ((_returnReplacementOperator2953.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2953.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2953.is("ZERO")) ? ( 0 ) : (java.lang.Character.codePointCount(input, 0, input.length())));
        }
    }

    public StringEscapeUtils() {
        super();
    }

    public static final java.lang.String escapeJava(final java.lang.String input) {
        return ((_returnReplacementOperator2958.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA.translate(input)));
    }

    public static final java.lang.String escapeEcmaScript(final java.lang.String input) {
        return ((_returnReplacementOperator2955.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT.translate(input)));
    }

    public static final java.lang.String escapeJson(final java.lang.String input) {
        return ((_returnReplacementOperator2959.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON.translate(input)));
    }

    public static final java.lang.String unescapeJava(final java.lang.String input) {
        return ((_returnReplacementOperator2967.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA.translate(input)));
    }

    public static final java.lang.String unescapeEcmaScript(final java.lang.String input) {
        return ((_returnReplacementOperator2964.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT.translate(input)));
    }

    public static final java.lang.String unescapeJson(final java.lang.String input) {
        return ((_returnReplacementOperator2968.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON.translate(input)));
    }

    public static final java.lang.String escapeHtml4(final java.lang.String input) {
        return ((_returnReplacementOperator2957.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4.translate(input)));
    }

    public static final java.lang.String escapeHtml3(final java.lang.String input) {
        return ((_returnReplacementOperator2956.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3.translate(input)));
    }

    public static final java.lang.String unescapeHtml4(final java.lang.String input) {
        return ((_returnReplacementOperator2966.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4.translate(input)));
    }

    public static final java.lang.String unescapeHtml3(final java.lang.String input) {
        return ((_returnReplacementOperator2965.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3.translate(input)));
    }

    @java.lang.Deprecated
    public static final java.lang.String escapeXml(final java.lang.String input) {
        return ((_returnReplacementOperator2960.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML.translate(input)));
    }

    public static java.lang.String escapeXml10(final java.lang.String input) {
        return ((_returnReplacementOperator2961.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML10.translate(input)));
    }

    public static java.lang.String escapeXml11(final java.lang.String input) {
        return ((_returnReplacementOperator2962.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML11.translate(input)));
    }

    public static final java.lang.String unescapeXml(final java.lang.String input) {
        return ((_returnReplacementOperator2969.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML.translate(input)));
    }

    public static final java.lang.String escapeCsv(final java.lang.String input) {
        return ((_returnReplacementOperator2954.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV.translate(input)));
    }

    public static final java.lang.String unescapeCsv(final java.lang.String input) {
        return ((_returnReplacementOperator2963.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV.translate(input)));
    }

    private static final metamutator.Selector _returnReplacementOperator2951 = metamutator.Selector.of(2951,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator2951");

    private static final metamutator.Selector _returnReplacementOperator2952 = metamutator.Selector.of(2952,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator2952");

    private static final metamutator.Selector _returnReplacementOperator2953 = metamutator.Selector.of(2953,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator2953");

    private static final metamutator.Selector _returnReplacementOperator2954 = metamutator.Selector.of(2954,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2954");

    private static final metamutator.Selector _returnReplacementOperator2955 = metamutator.Selector.of(2955,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2955");

    private static final metamutator.Selector _returnReplacementOperator2956 = metamutator.Selector.of(2956,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2956");

    private static final metamutator.Selector _returnReplacementOperator2957 = metamutator.Selector.of(2957,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2957");

    private static final metamutator.Selector _returnReplacementOperator2958 = metamutator.Selector.of(2958,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2958");

    private static final metamutator.Selector _returnReplacementOperator2959 = metamutator.Selector.of(2959,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2959");

    private static final metamutator.Selector _returnReplacementOperator2960 = metamutator.Selector.of(2960,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2960");

    private static final metamutator.Selector _returnReplacementOperator2961 = metamutator.Selector.of(2961,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2961");

    private static final metamutator.Selector _returnReplacementOperator2962 = metamutator.Selector.of(2962,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2962");

    private static final metamutator.Selector _returnReplacementOperator2963 = metamutator.Selector.of(2963,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2963");

    private static final metamutator.Selector _returnReplacementOperator2964 = metamutator.Selector.of(2964,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2964");

    private static final metamutator.Selector _returnReplacementOperator2965 = metamutator.Selector.of(2965,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2965");

    private static final metamutator.Selector _returnReplacementOperator2966 = metamutator.Selector.of(2966,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2966");

    private static final metamutator.Selector _returnReplacementOperator2967 = metamutator.Selector.of(2967,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2967");

    private static final metamutator.Selector _returnReplacementOperator2968 = metamutator.Selector.of(2968,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2968");

    private static final metamutator.Selector _returnReplacementOperator2969 = metamutator.Selector.of(2969,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.StringEscapeUtils.class).id("_returnReplacementOperator2969");
}

