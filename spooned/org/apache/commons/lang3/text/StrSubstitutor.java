package org.apache.commons.lang3.text;


public class StrSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';

    public static final org.apache.commons.lang3.text.StrMatcher DEFAULT_PREFIX = org.apache.commons.lang3.text.StrMatcher.stringMatcher("${");

    public static final org.apache.commons.lang3.text.StrMatcher DEFAULT_SUFFIX = org.apache.commons.lang3.text.StrMatcher.stringMatcher("}");

    public static final org.apache.commons.lang3.text.StrMatcher DEFAULT_VALUE_DELIMITER = org.apache.commons.lang3.text.StrMatcher.stringMatcher(":-");

    private char escapeChar;

    private org.apache.commons.lang3.text.StrMatcher prefixMatcher;

    private org.apache.commons.lang3.text.StrMatcher suffixMatcher;

    private org.apache.commons.lang3.text.StrMatcher valueDelimiterMatcher;

    private org.apache.commons.lang3.text.StrLookup<?> variableResolver;

    private boolean enableSubstitutionInVariables;

    public static <V>java.lang.String replace(final java.lang.Object source, final java.util.Map<java.lang.String, V> valueMap) {
        return new org.apache.commons.lang3.text.StrSubstitutor(valueMap).replace(source);
    }

    public static <V>java.lang.String replace(final java.lang.Object source, final java.util.Map<java.lang.String, V> valueMap, final java.lang.String prefix, final java.lang.String suffix) {
        return new org.apache.commons.lang3.text.StrSubstitutor(valueMap , prefix , suffix).replace(source);
    }

    public static java.lang.String replace(final java.lang.Object source, final java.util.Properties valueProperties) {
        if (valueProperties == null) {
            return source.toString();
        } 
        final java.util.Map<java.lang.String, java.lang.String> valueMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        final java.util.Enumeration<?> propNames = valueProperties.propertyNames();
        while (propNames.hasMoreElements()) {
            final java.lang.String propName = ((java.lang.String)(propNames.nextElement()));
            final java.lang.String propValue = valueProperties.getProperty(propName);
            valueMap.put(propName, propValue);
        }
        return org.apache.commons.lang3.text.StrSubstitutor.replace(source, valueMap);
    }

    public static java.lang.String replaceSystemProperties(final java.lang.Object source) {
        return new org.apache.commons.lang3.text.StrSubstitutor(org.apache.commons.lang3.text.StrLookup.systemPropertiesLookup()).replace(source);
    }

    public StrSubstitutor() {
        this(((org.apache.commons.lang3.text.StrLookup<?>)(null)), DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);
    }

    public <V>StrSubstitutor(final java.util.Map<java.lang.String, V> valueMap) {
        this(org.apache.commons.lang3.text.StrLookup.mapLookup(valueMap), DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);
    }

    public <V>StrSubstitutor(final java.util.Map<java.lang.String, V> valueMap ,final java.lang.String prefix ,final java.lang.String suffix) {
        this(org.apache.commons.lang3.text.StrLookup.mapLookup(valueMap), prefix, suffix, DEFAULT_ESCAPE);
    }

    public <V>StrSubstitutor(final java.util.Map<java.lang.String, V> valueMap ,final java.lang.String prefix ,final java.lang.String suffix ,final char escape) {
        this(org.apache.commons.lang3.text.StrLookup.mapLookup(valueMap), prefix, suffix, escape);
    }

    public <V>StrSubstitutor(final java.util.Map<java.lang.String, V> valueMap ,final java.lang.String prefix ,final java.lang.String suffix ,final char escape ,final java.lang.String valueDelimiter) {
        this(org.apache.commons.lang3.text.StrLookup.mapLookup(valueMap), prefix, suffix, escape, valueDelimiter);
    }

    public StrSubstitutor(final org.apache.commons.lang3.text.StrLookup<?> variableResolver) {
        this(variableResolver, DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);
    }

    public StrSubstitutor(final org.apache.commons.lang3.text.StrLookup<?> variableResolver ,final java.lang.String prefix ,final java.lang.String suffix ,final char escape) {
        setVariableResolver(variableResolver);
        setVariablePrefix(prefix);
        setVariableSuffix(suffix);
        setEscapeChar(escape);
        setValueDelimiterMatcher(DEFAULT_VALUE_DELIMITER);
    }

    public StrSubstitutor(final org.apache.commons.lang3.text.StrLookup<?> variableResolver ,final java.lang.String prefix ,final java.lang.String suffix ,final char escape ,final java.lang.String valueDelimiter) {
        setVariableResolver(variableResolver);
        setVariablePrefix(prefix);
        setVariableSuffix(suffix);
        setEscapeChar(escape);
        setValueDelimiter(valueDelimiter);
    }

    public StrSubstitutor(final org.apache.commons.lang3.text.StrLookup<?> variableResolver ,final org.apache.commons.lang3.text.StrMatcher prefixMatcher ,final org.apache.commons.lang3.text.StrMatcher suffixMatcher ,final char escape) {
        this(variableResolver, prefixMatcher, suffixMatcher, escape, DEFAULT_VALUE_DELIMITER);
    }

    public StrSubstitutor(final org.apache.commons.lang3.text.StrLookup<?> variableResolver ,final org.apache.commons.lang3.text.StrMatcher prefixMatcher ,final org.apache.commons.lang3.text.StrMatcher suffixMatcher ,final char escape ,final org.apache.commons.lang3.text.StrMatcher valueDelimiterMatcher) {
        setVariableResolver(variableResolver);
        setVariablePrefixMatcher(prefixMatcher);
        setVariableSuffixMatcher(suffixMatcher);
        setEscapeChar(escape);
        setValueDelimiterMatcher(valueDelimiterMatcher);
    }

    public java.lang.String replace(final java.lang.String source) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source);
        if ((substitute(buf, 0, source.length())) == false) {
            return source;
        } 
        return buf.toString();
    }

    public java.lang.String replace(final java.lang.String source, final int offset, final int length) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return source.substring(offset, ((_arithmeticOperatorHotSpot259.is("PLUS")) ? ((offset + length)) : (_arithmeticOperatorHotSpot259.is("MINUS")) ? ((offset - length)) : (_arithmeticOperatorHotSpot259.is("MUL")) ? ((offset * length)) :  ((offset / length))));
        } 
        return buf.toString();
    }

    public java.lang.String replace(final char[] source) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length).append(source);
        substitute(buf, 0, source.length);
        return buf.toString();
    }

    public java.lang.String replace(final char[] source, final int offset, final int length) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return buf.toString();
    }

    public java.lang.String replace(final java.lang.StringBuffer source) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length()).append(source);
        substitute(buf, 0, buf.length());
        return buf.toString();
    }

    public java.lang.String replace(final java.lang.StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return buf.toString();
    }

    public java.lang.String replace(final java.lang.CharSequence source) {
        if (source == null) {
            return null;
        } 
        return replace(source, 0, source.length());
    }

    public java.lang.String replace(final java.lang.CharSequence source, final int offset, final int length) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return buf.toString();
    }

    public java.lang.String replace(final org.apache.commons.lang3.text.StrBuilder source) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length()).append(source);
        substitute(buf, 0, buf.length());
        return buf.toString();
    }

    public java.lang.String replace(final org.apache.commons.lang3.text.StrBuilder source, final int offset, final int length) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return buf.toString();
    }

    public java.lang.String replace(final java.lang.Object source) {
        if (source == null) {
            return null;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder().append(source);
        substitute(buf, 0, buf.length());
        return buf.toString();
    }

    public boolean replaceIn(final java.lang.StringBuffer source) {
        if (source == null) {
            return false;
        } 
        return replaceIn(source, 0, source.length());
    }

    public boolean replaceIn(final java.lang.StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return false;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return false;
        } 
        source.replace(offset, ((_arithmeticOperatorHotSpot248.is("PLUS")) ? ((offset + length)) : (_arithmeticOperatorHotSpot248.is("MINUS")) ? ((offset - length)) : (_arithmeticOperatorHotSpot248.is("MUL")) ? ((offset * length)) :  ((offset / length))), buf.toString());
        return true;
    }

    public boolean replaceIn(final java.lang.StringBuilder source) {
        if (source == null) {
            return false;
        } 
        return replaceIn(source, 0, source.length());
    }

    public boolean replaceIn(final java.lang.StringBuilder source, final int offset, final int length) {
        if (source == null) {
            return false;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return false;
        } 
        source.replace(offset, ((_arithmeticOperatorHotSpot249.is("PLUS")) ? ((offset + length)) : (_arithmeticOperatorHotSpot249.is("MINUS")) ? ((offset - length)) : (_arithmeticOperatorHotSpot249.is("MUL")) ? ((offset * length)) :  ((offset / length))), buf.toString());
        return true;
    }

    public boolean replaceIn(final org.apache.commons.lang3.text.StrBuilder source) {
        if (source == null) {
            return false;
        } 
        return substitute(source, 0, source.length());
    }

    public boolean replaceIn(final org.apache.commons.lang3.text.StrBuilder source, final int offset, final int length) {
        if (source == null) {
            return false;
        } 
        return substitute(source, offset, length);
    }

    protected boolean substitute(final org.apache.commons.lang3.text.StrBuilder buf, final int offset, final int length) {
        return (substitute(buf, offset, length, null)) > 0;
    }

    private int substitute(final org.apache.commons.lang3.text.StrBuilder buf, final int offset, final int length, java.util.List<java.lang.String> priorVariables) {
        final org.apache.commons.lang3.text.StrMatcher pfxMatcher = getVariablePrefixMatcher();
        final org.apache.commons.lang3.text.StrMatcher suffMatcher = getVariableSuffixMatcher();
        final char escape = getEscapeChar();
        final org.apache.commons.lang3.text.StrMatcher valueDelimMatcher = getValueDelimiterMatcher();
        final boolean substitutionInVariablesEnabled = isEnableSubstitutionInVariables();
        final boolean top = priorVariables == null;
        boolean altered = false;
        int lengthChange = 0;
        char[] chars = buf.buffer;
        int bufEnd = ((_arithmeticOperatorHotSpot250.is("PLUS")) ? (offset + length) : (_arithmeticOperatorHotSpot250.is("MINUS")) ? (offset - length) : (_arithmeticOperatorHotSpot250.is("MUL")) ? (offset * length) :  (offset / length));
        int pos = offset;
        while (pos < bufEnd) {
            final int startMatchLen = pfxMatcher.isMatch(chars, pos, offset, bufEnd);
            if (startMatchLen == 0) {
                pos++;
            } else {
                if ((pos > offset) && ((chars[((_arithmeticOperatorHotSpot251.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot251.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot251.is("MUL")) ? ((pos * 1)) :  ((pos / 1)))]) == escape)) {
                    buf.deleteCharAt(((_arithmeticOperatorHotSpot252.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot252.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot252.is("MUL")) ? ((pos * 1)) :  ((pos / 1))));
                    chars = buf.buffer;
                    lengthChange--;
                    altered = true;
                    bufEnd--;
                } else {
                    final int startPos = pos;
                    pos += startMatchLen;
                    int endMatchLen = 0;
                    int nestedVarCount = 0;
                    while (pos < bufEnd) {
                        if (substitutionInVariablesEnabled && ((endMatchLen = pfxMatcher.isMatch(chars, pos, offset, bufEnd)) != 0)) {
                            nestedVarCount++;
                            pos += endMatchLen;
                            continue;
                        } 
                        endMatchLen = suffMatcher.isMatch(chars, pos, offset, bufEnd);
                        if (endMatchLen == 0) {
                            pos++;
                        } else {
                            if (nestedVarCount == 0) {
                                java.lang.String varNameExpr = new java.lang.String(chars , ((_arithmeticOperatorHotSpot253.is("PLUS")) ? ((startPos + startMatchLen)) : (_arithmeticOperatorHotSpot253.is("MINUS")) ? ((startPos - startMatchLen)) : (_arithmeticOperatorHotSpot253.is("MUL")) ? ((startPos * startMatchLen)) :  ((startPos / startMatchLen))) , (((_arithmeticOperatorHotSpot254.is("PLUS")) ? ((pos + startPos)) : (_arithmeticOperatorHotSpot254.is("MINUS")) ? ((pos - startPos)) : (_arithmeticOperatorHotSpot254.is("MUL")) ? ((pos * startPos)) :  ((pos / startPos))) - startMatchLen));
                                if (substitutionInVariablesEnabled) {
                                    final org.apache.commons.lang3.text.StrBuilder bufName = new org.apache.commons.lang3.text.StrBuilder(varNameExpr);
                                    substitute(bufName, 0, bufName.length());
                                    varNameExpr = bufName.toString();
                                } 
                                pos += endMatchLen;
                                final int endPos = pos;
                                java.lang.String varName = varNameExpr;
                                java.lang.String varDefaultValue = null;
                                if (valueDelimMatcher != null) {
                                    final char[] varNameExprChars = varNameExpr.toCharArray();
                                    int valueDelimiterMatchLen = 0;
                                    for (int i = 0 ; i < (varNameExprChars.length) ; i++) {
                                        if ((!substitutionInVariablesEnabled) && ((pfxMatcher.isMatch(varNameExprChars, i, i, varNameExprChars.length)) != 0)) {
                                            break;
                                        } 
                                        if ((valueDelimiterMatchLen = valueDelimMatcher.isMatch(varNameExprChars, i)) != 0) {
                                            varName = varNameExpr.substring(0, i);
                                            varDefaultValue = varNameExpr.substring(((_arithmeticOperatorHotSpot255.is("PLUS")) ? ((i + valueDelimiterMatchLen)) : (_arithmeticOperatorHotSpot255.is("MINUS")) ? ((i - valueDelimiterMatchLen)) : (_arithmeticOperatorHotSpot255.is("MUL")) ? ((i * valueDelimiterMatchLen)) :  ((i / valueDelimiterMatchLen))));
                                            break;
                                        } 
                                    }
                                } 
                                if (priorVariables == null) {
                                    priorVariables = new java.util.ArrayList<java.lang.String>();
                                    priorVariables.add(new java.lang.String(chars , offset , length));
                                } 
                                checkCyclicSubstitution(varName, priorVariables);
                                priorVariables.add(varName);
                                java.lang.String varValue = resolveVariable(varName, buf, startPos, endPos);
                                if (varValue == null) {
                                    varValue = varDefaultValue;
                                } 
                                if (varValue != null) {
                                    final int varLen = varValue.length();
                                    buf.replace(startPos, endPos, varValue);
                                    altered = true;
                                    int change = substitute(buf, startPos, varLen, priorVariables);
                                    change = ((_arithmeticOperatorHotSpot256.is("PLUS")) ? ((change + varLen)) : (_arithmeticOperatorHotSpot256.is("MINUS")) ? ((change - varLen)) : (_arithmeticOperatorHotSpot256.is("MUL")) ? ((change * varLen)) :  ((change / varLen))) - ((_arithmeticOperatorHotSpot257.is("PLUS")) ? ((endPos + startPos)) : (_arithmeticOperatorHotSpot257.is("MINUS")) ? ((endPos - startPos)) : (_arithmeticOperatorHotSpot257.is("MUL")) ? ((endPos * startPos)) :  ((endPos / startPos)));
                                    pos += change;
                                    bufEnd += change;
                                    lengthChange += change;
                                    chars = buf.buffer;
                                } 
                                priorVariables.remove(((_arithmeticOperatorHotSpot258.is("PLUS")) ? (((priorVariables.size()) + 1)) : (_arithmeticOperatorHotSpot258.is("MINUS")) ? (((priorVariables.size()) - 1)) : (_arithmeticOperatorHotSpot258.is("MUL")) ? (((priorVariables.size()) * 1)) :  (((priorVariables.size()) / 1))));
                                break;
                            } 
                            nestedVarCount--;
                            pos += endMatchLen;
                        }
                    }
                }
            }
        }
        if (top) {
            return altered ? 1 : 0;
        } 
        return lengthChange;
    }

    private void checkCyclicSubstitution(final java.lang.String varName, final java.util.List<java.lang.String> priorVariables) {
        if ((priorVariables.contains(varName)) == false) {
            return ;
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(256);
        buf.append("Infinite loop in property interpolation of ");
        buf.append(priorVariables.remove(0));
        buf.append(": ");
        buf.appendWithSeparators(priorVariables, "->");
        throw new java.lang.IllegalStateException(buf.toString());
    }

    protected java.lang.String resolveVariable(final java.lang.String variableName, final org.apache.commons.lang3.text.StrBuilder buf, final int startPos, final int endPos) {
        final org.apache.commons.lang3.text.StrLookup<?> resolver = getVariableResolver();
        if (resolver == null) {
            return null;
        } 
        return resolver.lookup(variableName);
    }

    public char getEscapeChar() {
        return this.escapeChar;
    }

    public void setEscapeChar(final char escapeCharacter) {
        this.escapeChar = escapeCharacter;
    }

    public org.apache.commons.lang3.text.StrMatcher getVariablePrefixMatcher() {
        return prefixMatcher;
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefixMatcher(final org.apache.commons.lang3.text.StrMatcher prefixMatcher) {
        if (prefixMatcher == null) {
            throw new java.lang.IllegalArgumentException("Variable prefix matcher must not be null!");
        } 
        this.prefixMatcher = prefixMatcher;
        return this;
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(final char prefix) {
        return setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(prefix));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(final java.lang.String prefix) {
        if (prefix == null) {
            throw new java.lang.IllegalArgumentException("Variable prefix must not be null!");
        } 
        return setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(prefix));
    }

    public org.apache.commons.lang3.text.StrMatcher getVariableSuffixMatcher() {
        return suffixMatcher;
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffixMatcher(final org.apache.commons.lang3.text.StrMatcher suffixMatcher) {
        if (suffixMatcher == null) {
            throw new java.lang.IllegalArgumentException("Variable suffix matcher must not be null!");
        } 
        this.suffixMatcher = suffixMatcher;
        return this;
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(final char suffix) {
        return setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(suffix));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(final java.lang.String suffix) {
        if (suffix == null) {
            throw new java.lang.IllegalArgumentException("Variable suffix must not be null!");
        } 
        return setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(suffix));
    }

    public org.apache.commons.lang3.text.StrMatcher getValueDelimiterMatcher() {
        return valueDelimiterMatcher;
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiterMatcher(final org.apache.commons.lang3.text.StrMatcher valueDelimiterMatcher) {
        this.valueDelimiterMatcher = valueDelimiterMatcher;
        return this;
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(final char valueDelimiter) {
        return setValueDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(valueDelimiter));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(final java.lang.String valueDelimiter) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(valueDelimiter)) {
            setValueDelimiterMatcher(null);
            return this;
        } 
        return setValueDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(valueDelimiter));
    }

    public org.apache.commons.lang3.text.StrLookup<?> getVariableResolver() {
        return this.variableResolver;
    }

    public void setVariableResolver(final org.apache.commons.lang3.text.StrLookup<?> variableResolver) {
        this.variableResolver = variableResolver;
    }

    public boolean isEnableSubstitutionInVariables() {
        return enableSubstitutionInVariables;
    }

    public void setEnableSubstitutionInVariables(final boolean enableSubstitutionInVariables) {
        this.enableSubstitutionInVariables = enableSubstitutionInVariables;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot248 = metamutator.Selector.of(248,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot248");

    private static final metamutator.Selector _arithmeticOperatorHotSpot249 = metamutator.Selector.of(249,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot249");

    private static final metamutator.Selector _arithmeticOperatorHotSpot250 = metamutator.Selector.of(250,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot250");

    private static final metamutator.Selector _arithmeticOperatorHotSpot251 = metamutator.Selector.of(251,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot251");

    private static final metamutator.Selector _arithmeticOperatorHotSpot252 = metamutator.Selector.of(252,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot252");

    private static final metamutator.Selector _arithmeticOperatorHotSpot253 = metamutator.Selector.of(253,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot253");

    private static final metamutator.Selector _arithmeticOperatorHotSpot254 = metamutator.Selector.of(254,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot254");

    private static final metamutator.Selector _arithmeticOperatorHotSpot255 = metamutator.Selector.of(255,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot255");

    private static final metamutator.Selector _arithmeticOperatorHotSpot256 = metamutator.Selector.of(256,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot256");

    private static final metamutator.Selector _arithmeticOperatorHotSpot257 = metamutator.Selector.of(257,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot257");

    private static final metamutator.Selector _arithmeticOperatorHotSpot258 = metamutator.Selector.of(258,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot258");

    private static final metamutator.Selector _arithmeticOperatorHotSpot259 = metamutator.Selector.of(259,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_arithmeticOperatorHotSpot259");
}

