package org.jsoup.nodes;


public class Entities {
    public enum EscapeMode {
xhtml(org.jsoup.nodes.Entities.xhtmlByVal), base(org.jsoup.nodes.Entities.baseByVal), extended(org.jsoup.nodes.Entities.fullByVal);
        private java.util.Map<java.lang.Character, java.lang.String> map;
        EscapeMode(java.util.Map<java.lang.Character, java.lang.String> map) {
            this.map = map;
        }
        public java.util.Map<java.lang.Character, java.lang.String> getMap() {
            return map;
        }
    }

    private static final java.util.Map<java.lang.String, java.lang.Character> full;

    private static final java.util.Map<java.lang.Character, java.lang.String> xhtmlByVal;

    private static final java.util.Map<java.lang.String, java.lang.Character> base;

    private static final java.util.Map<java.lang.Character, java.lang.String> baseByVal;

    private static final java.util.Map<java.lang.Character, java.lang.String> fullByVal;

    private Entities() {
    }

    public static boolean isNamedEntity(java.lang.String name) {
        return full.containsKey(name);
    }

    public static boolean isBaseNamedEntity(java.lang.String name) {
        return base.containsKey(name);
    }

    public static java.lang.Character getCharacterByName(java.lang.String name) {
        return full.get(name);
    }

    static java.lang.String escape(java.lang.String string, org.jsoup.nodes.Document.OutputSettings out) {
        java.lang.StringBuilder accum = new java.lang.StringBuilder(((string.length()) * 2));
        org.jsoup.nodes.Entities.escape(accum, string, out, false, false, false);
        return accum.toString();
    }

    static void escape(java.lang.StringBuilder accum, java.lang.String string, org.jsoup.nodes.Document.OutputSettings out, boolean inAttribute, boolean normaliseWhite, boolean stripLeadingWhite) {
        boolean lastWasWhite = false;
        boolean reachedNonWhite = false;
        final EscapeMode escapeMode = out.escapeMode();
        final java.nio.charset.CharsetEncoder encoder = out.encoder();
        final CoreCharset coreCharset = CoreCharset.byName(encoder.charset().name());
        final java.util.Map<java.lang.Character, java.lang.String> map = escapeMode.getMap();
        final int length = (_constantOperatorMetaMutator26.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator26.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator26.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(string.length()))));
        int codePoint;
        for (int offset = (_constantOperatorMetaMutator25.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator25.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator25.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0)))) ; offset < length ; offset += java.lang.Character.charCount(codePoint)) {
            codePoint = string.codePointAt(offset);
            if (normaliseWhite) {
                if (org.jsoup.helper.StringUtil.isWhitespace(codePoint)) {
                    if ((stripLeadingWhite && (!reachedNonWhite)) || lastWasWhite)
                        continue;
                    
                    accum.append(' ');
                    lastWasWhite = true;
                    continue;
                } else {
                    lastWasWhite = false;
                    reachedNonWhite = true;
                }
            } 
            if (codePoint < (java.lang.Character.MIN_SUPPLEMENTARY_CODE_POINT)) {
                final char c = ((char)(codePoint));
                switch (c) {
                    case '&' :
                        accum.append("&amp;");
                        break;
                    case 160 :
                        if (escapeMode != (EscapeMode.xhtml))
                            accum.append("&nbsp;");
                        else
                            accum.append("&#xa0;");
                        
                        break;
                    case '<' :
                        if ((!inAttribute) || (escapeMode == (EscapeMode.xhtml)))
                            accum.append("&lt;");
                        else
                            accum.append(c);
                        
                        break;
                    case '>' :
                        if (!inAttribute)
                            accum.append("&gt;");
                        else
                            accum.append(c);
                        
                        break;
                    case '"' :
                        if (inAttribute)
                            accum.append("&quot;");
                        else
                            accum.append(c);
                        
                        break;
                    default :
                        if (org.jsoup.nodes.Entities.canEncode(coreCharset, c, encoder))
                            accum.append(c);
                        else if (map.containsKey(c))
                            accum.append('&').append(map.get(c)).append(';');
                        else
                            accum.append("&#x").append(java.lang.Integer.toHexString(codePoint)).append(';');
                        
                }
            } else {
                final java.lang.String c = new java.lang.String(java.lang.Character.toChars(codePoint));
                if (encoder.canEncode(c))
                    accum.append(c);
                else
                    accum.append("&#x").append(java.lang.Integer.toHexString(codePoint)).append(';');
                
            }
        }
    }

    static java.lang.String unescape(java.lang.String string) {
        return org.jsoup.nodes.Entities.unescape(string, false);
    }

    static java.lang.String unescape(java.lang.String string, boolean strict) {
        return org.jsoup.parser.Parser.unescapeEntities(string, strict);
    }

    private static boolean canEncode(final CoreCharset charset, final char c, final java.nio.charset.CharsetEncoder fallback) {
        switch (charset) {
            case ascii :
                return c < 128;
            case utf :
                return true;
            default :
                return fallback.canEncode(c);
        }
    }

    private enum CoreCharset {
ascii, utf, fallback;
        private static CoreCharset byName(java.lang.String name) {
            if (name.equals("US-ASCII"))
                return ascii;
            
            if (name.startsWith("UTF-"))
                return utf;
            
            return fallback;
        }
    }

    private static final java.lang.Object[][] xhtmlArray = new java.lang.Object[][]{ new java.lang.Object[]{ "quot" , 34 } , new java.lang.Object[]{ "amp" , 38 } , new java.lang.Object[]{ "lt" , 60 } , new java.lang.Object[]{ "gt" , 62 } };

    static {
        xhtmlByVal = new java.util.HashMap<java.lang.Character, java.lang.String>();
        base = org.jsoup.nodes.Entities.loadEntities("entities-base.properties");
        baseByVal = org.jsoup.nodes.Entities.toCharacterKey(base);
        full = org.jsoup.nodes.Entities.loadEntities("entities-full.properties");
        fullByVal = org.jsoup.nodes.Entities.toCharacterKey(full);
        for (java.lang.Object[] entity : xhtmlArray) {
            java.lang.Character c = java.lang.Character.valueOf(((char)(((java.lang.Integer)(entity[1])).intValue())));
            xhtmlByVal.put(c, ((java.lang.String)(entity[0])));
        }
    }

    private static java.util.Map<java.lang.String, java.lang.Character> loadEntities(java.lang.String filename) {
        java.util.Properties properties = new java.util.Properties();
        java.util.Map<java.lang.String, java.lang.Character> entities = new java.util.HashMap<java.lang.String, java.lang.Character>();
        try {
            java.io.InputStream in = org.jsoup.nodes.Entities.class.getResourceAsStream(filename);
            properties.load(in);
            in.close();
        } catch (java.io.IOException e) {
            throw new java.util.MissingResourceException(("Error loading entities resource: " + (e.getMessage())) , "Entities" , filename);
        }
        for (java.util.Map.Entry entry : properties.entrySet()) {
            java.lang.Character val = java.lang.Character.valueOf(((char)(java.lang.Integer.parseInt(((java.lang.String)(entry.getValue())), 16))));
            java.lang.String name = ((java.lang.String)(entry.getKey()));
            entities.put(name, val);
        }
        return entities;
    }

    private static java.util.Map<java.lang.Character, java.lang.String> toCharacterKey(java.util.Map<java.lang.String, java.lang.Character> inMap) {
        java.util.Map<java.lang.Character, java.lang.String> outMap = new java.util.HashMap<java.lang.Character, java.lang.String>();
        for (java.util.Map.Entry<java.lang.String, java.lang.Character> entry : inMap.entrySet()) {
            java.lang.Character character = entry.getValue();
            java.lang.String name = entry.getKey();
            if (outMap.containsKey(character)) {
                if (name.toLowerCase().equals(name))
                    outMap.put(character, name);
                
            } else {
                outMap.put(character, name);
            }
        }
        return outMap;
    }

    private static final metamutator.Selector _constantOperatorMetaMutator25 = metamutator.Selector.of(25,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.nodes.Entities.class).id("_constantOperatorMetaMutator25");

    private static final metamutator.Selector _constantOperatorMetaMutator26 = metamutator.Selector.of(26,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.nodes.Entities.class).id("_constantOperatorMetaMutator26");
}

