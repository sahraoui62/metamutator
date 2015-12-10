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
        return ((_returnReplacementOperatorHotSpot1437.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrSubstitutor(valueMap).replace(source)));
    }

    public static <V>java.lang.String replace(final java.lang.Object source, final java.util.Map<java.lang.String, V> valueMap, final java.lang.String prefix, final java.lang.String suffix) {
        return ((_returnReplacementOperatorHotSpot1438.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrSubstitutor(valueMap , prefix , suffix).replace(source)));
    }

    public static java.lang.String replace(final java.lang.Object source, final java.util.Properties valueProperties) {
        if (valueProperties == null) {
            return ((_returnReplacementOperatorHotSpot1468.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (source.toString()));
        } 
        final java.util.Map<java.lang.String, java.lang.String> valueMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        final java.util.Enumeration<?> propNames = valueProperties.propertyNames();
        while (propNames.hasMoreElements()) {
            final java.lang.String propName = ((java.lang.String)(propNames.nextElement()));
            final java.lang.String propValue = valueProperties.getProperty(propName);
            valueMap.put(propName, propValue);
        }
        return ((_returnReplacementOperatorHotSpot1469.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrSubstitutor.replace(source, valueMap)));
    }

    public static java.lang.String replaceSystemProperties(final java.lang.Object source) {
        return ((_returnReplacementOperatorHotSpot1484.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrSubstitutor(org.apache.commons.lang3.text.StrLookup.systemPropertiesLookup()).replace(source)));
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
            return ((_returnReplacementOperatorHotSpot1470.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source);
        if ((substitute(buf, 0, source.length())) == false) {
            return ((_returnReplacementOperatorHotSpot1471.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (source));
        } 
        return ((_returnReplacementOperatorHotSpot1472.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.String source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1473.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return ((_returnReplacementOperatorHotSpot1474.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (source.substring(offset, (offset + length))));
        } 
        return ((_returnReplacementOperatorHotSpot1475.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final char[] source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1458.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length).append(source);
        substitute(buf, 0, source.length);
        return ((_returnReplacementOperatorHotSpot1459.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final char[] source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1460.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperatorHotSpot1461.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.StringBuffer source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1476.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length()).append(source);
        substitute(buf, 0, buf.length());
        return ((_returnReplacementOperatorHotSpot1477.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1478.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperatorHotSpot1479.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.CharSequence source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1462.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot1463.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replace(source, 0, source.length())));
    }

    public java.lang.String replace(final java.lang.CharSequence source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1464.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperatorHotSpot1465.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final org.apache.commons.lang3.text.StrBuilder source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1480.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length()).append(source);
        substitute(buf, 0, buf.length());
        return ((_returnReplacementOperatorHotSpot1481.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final org.apache.commons.lang3.text.StrBuilder source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1482.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperatorHotSpot1483.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.Object source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1466.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder().append(source);
        substitute(buf, 0, buf.length());
        return ((_returnReplacementOperatorHotSpot1467.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    public boolean replaceIn(final java.lang.StringBuffer source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1440.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot1441.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replaceIn(source, 0, source.length())));
    }

    public boolean replaceIn(final java.lang.StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1442.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return ((_returnReplacementOperatorHotSpot1443.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        source.replace(offset, (offset + length), buf.toString());
        return ((_returnReplacementOperatorHotSpot1444.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public boolean replaceIn(final java.lang.StringBuilder source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1445.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot1446.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replaceIn(source, 0, source.length())));
    }

    public boolean replaceIn(final java.lang.StringBuilder source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1447.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return ((_returnReplacementOperatorHotSpot1448.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        source.replace(offset, (offset + length), buf.toString());
        return ((_returnReplacementOperatorHotSpot1449.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public boolean replaceIn(final org.apache.commons.lang3.text.StrBuilder source) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1450.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot1451.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (substitute(source, 0, source.length())));
    }

    public boolean replaceIn(final org.apache.commons.lang3.text.StrBuilder source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperatorHotSpot1452.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot1453.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (substitute(source, offset, length)));
    }

    protected boolean substitute(final org.apache.commons.lang3.text.StrBuilder buf, final int offset, final int length) {
        return ((_returnReplacementOperatorHotSpot1454.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((substitute(buf, offset, length, null)) > 0));
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
        int bufEnd = offset + length;
        int pos = offset;
        while (pos < bufEnd) {
            final int startMatchLen = pfxMatcher.isMatch(chars, pos, offset, bufEnd);
            if (startMatchLen == 0) {
                pos++;
            } else {
                if ((pos > offset) && ((chars[(pos - 1)]) == escape)) {
                    buf.deleteCharAt((pos - 1));
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
                                java.lang.String varNameExpr = new java.lang.String(chars , (startPos + startMatchLen) , ((pos - startPos) - startMatchLen));
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
                                            varDefaultValue = varNameExpr.substring((i + valueDelimiterMatchLen));
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
                                    change = (change + varLen) - (endPos - startPos);
                                    pos += change;
                                    bufEnd += change;
                                    lengthChange += change;
                                    chars = buf.buffer;
                                } 
                                priorVariables.remove(((priorVariables.size()) - 1));
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
            return ((_returnReplacementOperatorHotSpot1456.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1456.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1456.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (altered ? 1 : 0));
        } 
        return ((_returnReplacementOperatorHotSpot1457.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1457.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1457.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (lengthChange));
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
            return ((_returnReplacementOperatorHotSpot1485.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot1486.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (resolver.lookup(variableName)));
    }

    public char getEscapeChar() {
        return ((_returnReplacementOperatorHotSpot1455.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.escapeChar));
    }

    public void setEscapeChar(final char escapeCharacter) {
        this.escapeChar = escapeCharacter;
    }

    public org.apache.commons.lang3.text.StrMatcher getVariablePrefixMatcher() {
        return ((_returnReplacementOperatorHotSpot1489.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (prefixMatcher));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefixMatcher(final org.apache.commons.lang3.text.StrMatcher prefixMatcher) {
        if (prefixMatcher == null) {
            throw new java.lang.IllegalArgumentException("Variable prefix matcher must not be null!");
        } 
        this.prefixMatcher = prefixMatcher;
        return ((_returnReplacementOperatorHotSpot1497.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(final char prefix) {
        return ((_returnReplacementOperatorHotSpot1495.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(prefix))));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(final java.lang.String prefix) {
        if (prefix == null) {
            throw new java.lang.IllegalArgumentException("Variable prefix must not be null!");
        } 
        return ((_returnReplacementOperatorHotSpot1496.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(prefix))));
    }

    public org.apache.commons.lang3.text.StrMatcher getVariableSuffixMatcher() {
        return ((_returnReplacementOperatorHotSpot1490.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (suffixMatcher));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffixMatcher(final org.apache.commons.lang3.text.StrMatcher suffixMatcher) {
        if (suffixMatcher == null) {
            throw new java.lang.IllegalArgumentException("Variable suffix matcher must not be null!");
        } 
        this.suffixMatcher = suffixMatcher;
        return ((_returnReplacementOperatorHotSpot1500.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(final char suffix) {
        return ((_returnReplacementOperatorHotSpot1498.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(suffix))));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(final java.lang.String suffix) {
        if (suffix == null) {
            throw new java.lang.IllegalArgumentException("Variable suffix must not be null!");
        } 
        return ((_returnReplacementOperatorHotSpot1499.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(suffix))));
    }

    public org.apache.commons.lang3.text.StrMatcher getValueDelimiterMatcher() {
        return ((_returnReplacementOperatorHotSpot1488.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (valueDelimiterMatcher));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiterMatcher(final org.apache.commons.lang3.text.StrMatcher valueDelimiterMatcher) {
        this.valueDelimiterMatcher = valueDelimiterMatcher;
        return ((_returnReplacementOperatorHotSpot1494.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(final char valueDelimiter) {
        return ((_returnReplacementOperatorHotSpot1491.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setValueDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(valueDelimiter))));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(final java.lang.String valueDelimiter) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(valueDelimiter)) {
            setValueDelimiterMatcher(null);
            return ((_returnReplacementOperatorHotSpot1492.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperatorHotSpot1493.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setValueDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(valueDelimiter))));
    }

    public org.apache.commons.lang3.text.StrLookup<?> getVariableResolver() {
        return ((_returnReplacementOperatorHotSpot1487.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.variableResolver));
    }

    public void setVariableResolver(final org.apache.commons.lang3.text.StrLookup<?> variableResolver) {
        this.variableResolver = variableResolver;
    }

    public boolean isEnableSubstitutionInVariables() {
        return ((_returnReplacementOperatorHotSpot1439.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (enableSubstitutionInVariables));
    }

    public void setEnableSubstitutionInVariables(final boolean enableSubstitutionInVariables) {
        this.enableSubstitutionInVariables = enableSubstitutionInVariables;
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1437 = metamutator.Selector.of(1437,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1437");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1438 = metamutator.Selector.of(1438,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1438");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1439 = metamutator.Selector.of(1439,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1439");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1440 = metamutator.Selector.of(1440,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1440");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1441 = metamutator.Selector.of(1441,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1441");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1442 = metamutator.Selector.of(1442,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1442");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1443 = metamutator.Selector.of(1443,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1443");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1444 = metamutator.Selector.of(1444,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1444");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1445 = metamutator.Selector.of(1445,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1445");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1446 = metamutator.Selector.of(1446,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1446");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1447 = metamutator.Selector.of(1447,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1447");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1448 = metamutator.Selector.of(1448,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1448");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1449 = metamutator.Selector.of(1449,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1449");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1450 = metamutator.Selector.of(1450,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1450");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1451 = metamutator.Selector.of(1451,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1451");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1452 = metamutator.Selector.of(1452,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1452");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1453 = metamutator.Selector.of(1453,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1453");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1454 = metamutator.Selector.of(1454,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1454");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1455 = metamutator.Selector.of(1455,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1455");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1456 = metamutator.Selector.of(1456,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1456");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1457 = metamutator.Selector.of(1457,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1457");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1458 = metamutator.Selector.of(1458,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1458");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1459 = metamutator.Selector.of(1459,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1459");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1460 = metamutator.Selector.of(1460,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1460");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1461 = metamutator.Selector.of(1461,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1461");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1462 = metamutator.Selector.of(1462,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1462");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1463 = metamutator.Selector.of(1463,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1463");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1464 = metamutator.Selector.of(1464,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1464");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1465 = metamutator.Selector.of(1465,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1465");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1466 = metamutator.Selector.of(1466,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1466");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1467 = metamutator.Selector.of(1467,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1467");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1468 = metamutator.Selector.of(1468,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1468");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1469 = metamutator.Selector.of(1469,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1469");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1470 = metamutator.Selector.of(1470,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1470");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1471 = metamutator.Selector.of(1471,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1471");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1472 = metamutator.Selector.of(1472,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1472");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1473 = metamutator.Selector.of(1473,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1473");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1474 = metamutator.Selector.of(1474,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1474");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1475 = metamutator.Selector.of(1475,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1475");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1476 = metamutator.Selector.of(1476,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1476");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1477 = metamutator.Selector.of(1477,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1477");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1478 = metamutator.Selector.of(1478,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1478");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1479 = metamutator.Selector.of(1479,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1479");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1480 = metamutator.Selector.of(1480,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1480");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1481 = metamutator.Selector.of(1481,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1481");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1482 = metamutator.Selector.of(1482,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1482");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1483 = metamutator.Selector.of(1483,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1483");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1484 = metamutator.Selector.of(1484,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1484");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1485 = metamutator.Selector.of(1485,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1485");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1486 = metamutator.Selector.of(1486,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1486");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1487 = metamutator.Selector.of(1487,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1487");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1488 = metamutator.Selector.of(1488,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1488");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1489 = metamutator.Selector.of(1489,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1489");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1490 = metamutator.Selector.of(1490,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1490");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1491 = metamutator.Selector.of(1491,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1491");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1492 = metamutator.Selector.of(1492,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1492");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1493 = metamutator.Selector.of(1493,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1493");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1494 = metamutator.Selector.of(1494,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1494");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1495 = metamutator.Selector.of(1495,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1495");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1496 = metamutator.Selector.of(1496,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1496");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1497 = metamutator.Selector.of(1497,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1497");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1498 = metamutator.Selector.of(1498,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1498");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1499 = metamutator.Selector.of(1499,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1499");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1500 = metamutator.Selector.of(1500,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperatorHotSpot1500");
}

