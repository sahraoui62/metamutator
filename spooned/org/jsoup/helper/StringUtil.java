package org.jsoup.helper;


public final class StringUtil {
    private static final java.lang.String[] padding = new java.lang.String[]{ "" , " " , "  " , "   " , "    " , "     " , "      " , "       " , "        " , "         " , "          " };

    public static java.lang.String join(java.util.Collection strings, java.lang.String sep) {
        return org.jsoup.helper.StringUtil.join(strings.iterator(), sep);
    }

    public static java.lang.String join(java.util.Iterator strings, java.lang.String sep) {
        if (!(strings.hasNext()))
            return "";
        
        java.lang.String start = strings.next().toString();
        if (!(strings.hasNext()))
            return start;
        
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64).append(start);
        while (strings.hasNext()) {
            sb.append(sep);
            sb.append(strings.next());
        }
        return sb.toString();
    }

    public static java.lang.String padding(int width) {
        if (width < 0)
            throw new java.lang.IllegalArgumentException("width must be > 0");
        
        if (width < (padding.length))
            return padding[width];
        
        char[] out = new char[width];
        for (int i = (_constantOperatorMetaMutator14.is("ZERO")?( 0 ):(_constantOperatorMetaMutator14.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator14.is("MIN_MIN")?( -2147483647 ):(0)))) ; i < width ; i++)
            out[i] = ' ';
        return java.lang.String.valueOf(out);
    }

    public static boolean isBlank(java.lang.String string) {
        if ((string == null) || ((string.length()) == 0))
            return true;
        
        int l = (_constantOperatorMetaMutator11.is("ZERO")?( 0 ):(_constantOperatorMetaMutator11.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator11.is("MIN_MIN")?( -2147483647 ):(string.length()))));
        for (int i = (_constantOperatorMetaMutator10.is("ZERO")?( 0 ):(_constantOperatorMetaMutator10.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator10.is("MIN_MIN")?( -2147483647 ):(0)))) ; i < l ; i++) {
            if (!(org.jsoup.helper.StringUtil.isWhitespace(string.codePointAt(i))))
                return false;
            
        }
        return true;
    }

    public static boolean isNumeric(java.lang.String string) {
        if ((string == null) || ((string.length()) == 0))
            return false;
        
        int l = (_constantOperatorMetaMutator13.is("ZERO")?( 0 ):(_constantOperatorMetaMutator13.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator13.is("MIN_MIN")?( -2147483647 ):(string.length()))));
        for (int i = (_constantOperatorMetaMutator12.is("ZERO")?( 0 ):(_constantOperatorMetaMutator12.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator12.is("MIN_MIN")?( -2147483647 ):(0)))) ; i < l ; i++) {
            if (!(java.lang.Character.isDigit(string.codePointAt(i))))
                return false;
            
        }
        return true;
    }

    public static boolean isWhitespace(int c) {
        return ((((c == ' ') || (c == '\t')) || (c == '\n')) || (c == '\f')) || (c == '\r');
    }

    public static java.lang.String normaliseWhitespace(java.lang.String string) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(string.length());
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(sb, string, false);
        return sb.toString();
    }

    public static void appendNormalisedWhitespace(java.lang.StringBuilder accum, java.lang.String string, boolean stripLeading) {
        boolean lastWasWhite = false;
        boolean reachedNonWhite = false;
        int len = (_constantOperatorMetaMutator16.is("ZERO")?( 0 ):(_constantOperatorMetaMutator16.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator16.is("MIN_MIN")?( -2147483647 ):(string.length()))));
        int c;
        for (int i = (_constantOperatorMetaMutator15.is("ZERO")?( 0 ):(_constantOperatorMetaMutator15.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator15.is("MIN_MIN")?( -2147483647 ):(0)))) ; i < len ; i += java.lang.Character.charCount(c)) {
            c = string.codePointAt(i);
            if (org.jsoup.helper.StringUtil.isWhitespace(c)) {
                if ((stripLeading && (!reachedNonWhite)) || lastWasWhite)
                    continue;
                
                accum.append(' ');
                lastWasWhite = true;
            } else {
                accum.appendCodePoint(c);
                lastWasWhite = false;
                reachedNonWhite = true;
            }
        }
    }

    public static boolean in(java.lang.String needle, java.lang.String... haystack) {
        for (java.lang.String hay : haystack) {
            if (hay.equals(needle))
                return true;
            
        }
        return false;
    }

    public static boolean inSorted(java.lang.String needle, java.lang.String[] haystack) {
        return (java.util.Arrays.binarySearch(haystack, needle)) >= 0;
    }

    public static java.net.URL resolve(java.net.URL base, java.lang.String relUrl) throws java.net.MalformedURLException {
        if (relUrl.startsWith("?"))
            relUrl = (base.getPath()) + relUrl;
        
        if (((relUrl.indexOf('.')) == 0) && ((base.getFile().indexOf('/')) != 0)) {
            base = new java.net.URL(base.getProtocol() , base.getHost() , base.getPort() , ("/" + (base.getFile())));
        } 
        return new java.net.URL(base , relUrl);
    }

    public static java.lang.String resolve(final java.lang.String baseUrl, final java.lang.String relUrl) {
        java.net.URL base;
        try {
            try {
                base = new java.net.URL(baseUrl);
            } catch (java.net.MalformedURLException e) {
                java.net.URL abs = new java.net.URL(relUrl);
                return abs.toExternalForm();
            }
            return org.jsoup.helper.StringUtil.resolve(base, relUrl).toExternalForm();
        } catch (java.net.MalformedURLException e) {
            return "";
        }
    }

    private static final metamutator.Selector _constantOperatorMetaMutator10 = metamutator.Selector.of(10,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.helper.StringUtil.class).id("_constantOperatorMetaMutator10");

    private static final metamutator.Selector _constantOperatorMetaMutator11 = metamutator.Selector.of(11,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.helper.StringUtil.class).id("_constantOperatorMetaMutator11");

    private static final metamutator.Selector _constantOperatorMetaMutator12 = metamutator.Selector.of(12,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.helper.StringUtil.class).id("_constantOperatorMetaMutator12");

    private static final metamutator.Selector _constantOperatorMetaMutator13 = metamutator.Selector.of(13,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.helper.StringUtil.class).id("_constantOperatorMetaMutator13");

    private static final metamutator.Selector _constantOperatorMetaMutator14 = metamutator.Selector.of(14,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.helper.StringUtil.class).id("_constantOperatorMetaMutator14");

    private static final metamutator.Selector _constantOperatorMetaMutator15 = metamutator.Selector.of(15,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.helper.StringUtil.class).id("_constantOperatorMetaMutator15");

    private static final metamutator.Selector _constantOperatorMetaMutator16 = metamutator.Selector.of(16,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.helper.StringUtil.class).id("_constantOperatorMetaMutator16");
}

