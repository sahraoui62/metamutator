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
        return ((_returnReplacementOperator1437.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrSubstitutor(valueMap).replace(source)));
    }

    public static <V>java.lang.String replace(final java.lang.Object source, final java.util.Map<java.lang.String, V> valueMap, final java.lang.String prefix, final java.lang.String suffix) {
        return ((_returnReplacementOperator1438.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrSubstitutor(valueMap , prefix , suffix).replace(source)));
    }

    public static java.lang.String replace(final java.lang.Object source, final java.util.Properties valueProperties) {
        if (valueProperties == null) {
            return ((_returnReplacementOperator1468.is("NULL")) ? ( null ) : (source.toString()));
        } 
        final java.util.Map<java.lang.String, java.lang.String> valueMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        final java.util.Enumeration<?> propNames = valueProperties.propertyNames();
        while (propNames.hasMoreElements()) {
            final java.lang.String propName = ((java.lang.String)(propNames.nextElement()));
            final java.lang.String propValue = valueProperties.getProperty(propName);
            valueMap.put(propName, propValue);
        }
        return ((_returnReplacementOperator1469.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrSubstitutor.replace(source, valueMap)));
    }

    public static java.lang.String replaceSystemProperties(final java.lang.Object source) {
        return ((_returnReplacementOperator1484.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrSubstitutor(org.apache.commons.lang3.text.StrLookup.systemPropertiesLookup()).replace(source)));
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
            return ((_returnReplacementOperator1470.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source);
        if ((substitute(buf, 0, source.length())) == false) {
            return ((_returnReplacementOperator1471.is("NULL")) ? ( null ) : (source));
        } 
        return ((_returnReplacementOperator1472.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.String source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1473.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return ((_returnReplacementOperator1474.is("NULL")) ? ( null ) : (source.substring(offset, (offset + length))));
        } 
        return ((_returnReplacementOperator1475.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final char[] source) {
        if (source == null) {
            return ((_returnReplacementOperator1458.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length).append(source);
        substitute(buf, 0, source.length);
        return ((_returnReplacementOperator1459.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final char[] source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1460.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperator1461.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.StringBuffer source) {
        if (source == null) {
            return ((_returnReplacementOperator1476.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length()).append(source);
        substitute(buf, 0, buf.length());
        return ((_returnReplacementOperator1477.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1478.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperator1479.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.CharSequence source) {
        if (source == null) {
            return ((_returnReplacementOperator1462.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator1463.is("NULL")) ? ( null ) : (replace(source, 0, source.length())));
    }

    public java.lang.String replace(final java.lang.CharSequence source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1464.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperator1465.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final org.apache.commons.lang3.text.StrBuilder source) {
        if (source == null) {
            return ((_returnReplacementOperator1480.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(source.length()).append(source);
        substitute(buf, 0, buf.length());
        return ((_returnReplacementOperator1481.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final org.apache.commons.lang3.text.StrBuilder source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1482.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        substitute(buf, 0, length);
        return ((_returnReplacementOperator1483.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public java.lang.String replace(final java.lang.Object source) {
        if (source == null) {
            return ((_returnReplacementOperator1466.is("NULL")) ? ( null ) : (null));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder().append(source);
        substitute(buf, 0, buf.length());
        return ((_returnReplacementOperator1467.is("NULL")) ? ( null ) : (buf.toString()));
    }

    public boolean replaceIn(final java.lang.StringBuffer source) {
        if (source == null) {
            return ((_returnReplacementOperator1440.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator1441.is("NULL")) ? ( null ) : (replaceIn(source, 0, source.length())));
    }

    public boolean replaceIn(final java.lang.StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1442.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return ((_returnReplacementOperator1443.is("NULL")) ? ( null ) : (false));
        } 
        source.replace(offset, (offset + length), buf.toString());
        return ((_returnReplacementOperator1444.is("NULL")) ? ( null ) : (true));
    }

    public boolean replaceIn(final java.lang.StringBuilder source) {
        if (source == null) {
            return ((_returnReplacementOperator1445.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator1446.is("NULL")) ? ( null ) : (replaceIn(source, 0, source.length())));
    }

    public boolean replaceIn(final java.lang.StringBuilder source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1447.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder(length).append(source, offset, length);
        if ((substitute(buf, 0, length)) == false) {
            return ((_returnReplacementOperator1448.is("NULL")) ? ( null ) : (false));
        } 
        source.replace(offset, (offset + length), buf.toString());
        return ((_returnReplacementOperator1449.is("NULL")) ? ( null ) : (true));
    }

    public boolean replaceIn(final org.apache.commons.lang3.text.StrBuilder source) {
        if (source == null) {
            return ((_returnReplacementOperator1450.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator1451.is("NULL")) ? ( null ) : (substitute(source, 0, source.length())));
    }

    public boolean replaceIn(final org.apache.commons.lang3.text.StrBuilder source, final int offset, final int length) {
        if (source == null) {
            return ((_returnReplacementOperator1452.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator1453.is("NULL")) ? ( null ) : (substitute(source, offset, length)));
    }

    protected boolean substitute(final org.apache.commons.lang3.text.StrBuilder buf, final int offset, final int length) {
        return ((_returnReplacementOperator1454.is("NULL")) ? ( null ) : ((substitute(buf, offset, length, null)) > 0));
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
            return ((_returnReplacementOperator1456.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1456.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1456.is("ZERO")) ? ( 0 ) : (altered ? 1 : 0));
        } 
        return ((_returnReplacementOperator1457.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1457.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1457.is("ZERO")) ? ( 0 ) : (lengthChange));
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
            return ((_returnReplacementOperator1485.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator1486.is("NULL")) ? ( null ) : (resolver.lookup(variableName)));
    }

    public char getEscapeChar() {
        return ((_returnReplacementOperator1455.is("NULL")) ? ( null ) : (this.escapeChar));
    }

    public void setEscapeChar(final char escapeCharacter) {
        this.escapeChar = escapeCharacter;
    }

    public org.apache.commons.lang3.text.StrMatcher getVariablePrefixMatcher() {
        return ((_returnReplacementOperator1489.is("NULL")) ? ( null ) : (prefixMatcher));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefixMatcher(final org.apache.commons.lang3.text.StrMatcher prefixMatcher) {
        if (prefixMatcher == null) {
            throw new java.lang.IllegalArgumentException("Variable prefix matcher must not be null!");
        } 
        this.prefixMatcher = prefixMatcher;
        return ((_returnReplacementOperator1497.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(final char prefix) {
        return ((_returnReplacementOperator1495.is("NULL")) ? ( null ) : (setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(prefix))));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariablePrefix(final java.lang.String prefix) {
        if (prefix == null) {
            throw new java.lang.IllegalArgumentException("Variable prefix must not be null!");
        } 
        return ((_returnReplacementOperator1496.is("NULL")) ? ( null ) : (setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(prefix))));
    }

    public org.apache.commons.lang3.text.StrMatcher getVariableSuffixMatcher() {
        return ((_returnReplacementOperator1490.is("NULL")) ? ( null ) : (suffixMatcher));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffixMatcher(final org.apache.commons.lang3.text.StrMatcher suffixMatcher) {
        if (suffixMatcher == null) {
            throw new java.lang.IllegalArgumentException("Variable suffix matcher must not be null!");
        } 
        this.suffixMatcher = suffixMatcher;
        return ((_returnReplacementOperator1500.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(final char suffix) {
        return ((_returnReplacementOperator1498.is("NULL")) ? ( null ) : (setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(suffix))));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setVariableSuffix(final java.lang.String suffix) {
        if (suffix == null) {
            throw new java.lang.IllegalArgumentException("Variable suffix must not be null!");
        } 
        return ((_returnReplacementOperator1499.is("NULL")) ? ( null ) : (setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(suffix))));
    }

    public org.apache.commons.lang3.text.StrMatcher getValueDelimiterMatcher() {
        return ((_returnReplacementOperator1488.is("NULL")) ? ( null ) : (valueDelimiterMatcher));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiterMatcher(final org.apache.commons.lang3.text.StrMatcher valueDelimiterMatcher) {
        this.valueDelimiterMatcher = valueDelimiterMatcher;
        return ((_returnReplacementOperator1494.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(final char valueDelimiter) {
        return ((_returnReplacementOperator1491.is("NULL")) ? ( null ) : (setValueDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(valueDelimiter))));
    }

    public org.apache.commons.lang3.text.StrSubstitutor setValueDelimiter(final java.lang.String valueDelimiter) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(valueDelimiter)) {
            setValueDelimiterMatcher(null);
            return ((_returnReplacementOperator1492.is("NULL")) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperator1493.is("NULL")) ? ( null ) : (setValueDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(valueDelimiter))));
    }

    public org.apache.commons.lang3.text.StrLookup<?> getVariableResolver() {
        return ((_returnReplacementOperator1487.is("NULL")) ? ( null ) : (this.variableResolver));
    }

    public void setVariableResolver(final org.apache.commons.lang3.text.StrLookup<?> variableResolver) {
        this.variableResolver = variableResolver;
    }

    public boolean isEnableSubstitutionInVariables() {
        return ((_returnReplacementOperator1439.is("NULL")) ? ( null ) : (enableSubstitutionInVariables));
    }

    public void setEnableSubstitutionInVariables(final boolean enableSubstitutionInVariables) {
        this.enableSubstitutionInVariables = enableSubstitutionInVariables;
    }

    private static final metamutator.Selector _returnReplacementOperator1437 = metamutator.Selector.of(1437,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1437");

    private static final metamutator.Selector _returnReplacementOperator1438 = metamutator.Selector.of(1438,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1438");

    private static final metamutator.Selector _returnReplacementOperator1439 = metamutator.Selector.of(1439,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1439");

    private static final metamutator.Selector _returnReplacementOperator1440 = metamutator.Selector.of(1440,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1440");

    private static final metamutator.Selector _returnReplacementOperator1441 = metamutator.Selector.of(1441,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1441");

    private static final metamutator.Selector _returnReplacementOperator1442 = metamutator.Selector.of(1442,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1442");

    private static final metamutator.Selector _returnReplacementOperator1443 = metamutator.Selector.of(1443,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1443");

    private static final metamutator.Selector _returnReplacementOperator1444 = metamutator.Selector.of(1444,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1444");

    private static final metamutator.Selector _returnReplacementOperator1445 = metamutator.Selector.of(1445,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1445");

    private static final metamutator.Selector _returnReplacementOperator1446 = metamutator.Selector.of(1446,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1446");

    private static final metamutator.Selector _returnReplacementOperator1447 = metamutator.Selector.of(1447,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1447");

    private static final metamutator.Selector _returnReplacementOperator1448 = metamutator.Selector.of(1448,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1448");

    private static final metamutator.Selector _returnReplacementOperator1449 = metamutator.Selector.of(1449,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1449");

    private static final metamutator.Selector _returnReplacementOperator1450 = metamutator.Selector.of(1450,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1450");

    private static final metamutator.Selector _returnReplacementOperator1451 = metamutator.Selector.of(1451,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1451");

    private static final metamutator.Selector _returnReplacementOperator1452 = metamutator.Selector.of(1452,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1452");

    private static final metamutator.Selector _returnReplacementOperator1453 = metamutator.Selector.of(1453,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1453");

    private static final metamutator.Selector _returnReplacementOperator1454 = metamutator.Selector.of(1454,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1454");

    private static final metamutator.Selector _returnReplacementOperator1455 = metamutator.Selector.of(1455,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1455");

    private static final metamutator.Selector _returnReplacementOperator1456 = metamutator.Selector.of(1456,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1456");

    private static final metamutator.Selector _returnReplacementOperator1457 = metamutator.Selector.of(1457,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1457");

    private static final metamutator.Selector _returnReplacementOperator1458 = metamutator.Selector.of(1458,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1458");

    private static final metamutator.Selector _returnReplacementOperator1459 = metamutator.Selector.of(1459,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1459");

    private static final metamutator.Selector _returnReplacementOperator1460 = metamutator.Selector.of(1460,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1460");

    private static final metamutator.Selector _returnReplacementOperator1461 = metamutator.Selector.of(1461,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1461");

    private static final metamutator.Selector _returnReplacementOperator1462 = metamutator.Selector.of(1462,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1462");

    private static final metamutator.Selector _returnReplacementOperator1463 = metamutator.Selector.of(1463,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1463");

    private static final metamutator.Selector _returnReplacementOperator1464 = metamutator.Selector.of(1464,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1464");

    private static final metamutator.Selector _returnReplacementOperator1465 = metamutator.Selector.of(1465,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1465");

    private static final metamutator.Selector _returnReplacementOperator1466 = metamutator.Selector.of(1466,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1466");

    private static final metamutator.Selector _returnReplacementOperator1467 = metamutator.Selector.of(1467,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1467");

    private static final metamutator.Selector _returnReplacementOperator1468 = metamutator.Selector.of(1468,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1468");

    private static final metamutator.Selector _returnReplacementOperator1469 = metamutator.Selector.of(1469,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1469");

    private static final metamutator.Selector _returnReplacementOperator1470 = metamutator.Selector.of(1470,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1470");

    private static final metamutator.Selector _returnReplacementOperator1471 = metamutator.Selector.of(1471,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1471");

    private static final metamutator.Selector _returnReplacementOperator1472 = metamutator.Selector.of(1472,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1472");

    private static final metamutator.Selector _returnReplacementOperator1473 = metamutator.Selector.of(1473,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1473");

    private static final metamutator.Selector _returnReplacementOperator1474 = metamutator.Selector.of(1474,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1474");

    private static final metamutator.Selector _returnReplacementOperator1475 = metamutator.Selector.of(1475,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1475");

    private static final metamutator.Selector _returnReplacementOperator1476 = metamutator.Selector.of(1476,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1476");

    private static final metamutator.Selector _returnReplacementOperator1477 = metamutator.Selector.of(1477,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1477");

    private static final metamutator.Selector _returnReplacementOperator1478 = metamutator.Selector.of(1478,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1478");

    private static final metamutator.Selector _returnReplacementOperator1479 = metamutator.Selector.of(1479,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1479");

    private static final metamutator.Selector _returnReplacementOperator1480 = metamutator.Selector.of(1480,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1480");

    private static final metamutator.Selector _returnReplacementOperator1481 = metamutator.Selector.of(1481,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1481");

    private static final metamutator.Selector _returnReplacementOperator1482 = metamutator.Selector.of(1482,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1482");

    private static final metamutator.Selector _returnReplacementOperator1483 = metamutator.Selector.of(1483,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1483");

    private static final metamutator.Selector _returnReplacementOperator1484 = metamutator.Selector.of(1484,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1484");

    private static final metamutator.Selector _returnReplacementOperator1485 = metamutator.Selector.of(1485,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1485");

    private static final metamutator.Selector _returnReplacementOperator1486 = metamutator.Selector.of(1486,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1486");

    private static final metamutator.Selector _returnReplacementOperator1487 = metamutator.Selector.of(1487,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1487");

    private static final metamutator.Selector _returnReplacementOperator1488 = metamutator.Selector.of(1488,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1488");

    private static final metamutator.Selector _returnReplacementOperator1489 = metamutator.Selector.of(1489,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1489");

    private static final metamutator.Selector _returnReplacementOperator1490 = metamutator.Selector.of(1490,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1490");

    private static final metamutator.Selector _returnReplacementOperator1491 = metamutator.Selector.of(1491,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1491");

    private static final metamutator.Selector _returnReplacementOperator1492 = metamutator.Selector.of(1492,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1492");

    private static final metamutator.Selector _returnReplacementOperator1493 = metamutator.Selector.of(1493,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1493");

    private static final metamutator.Selector _returnReplacementOperator1494 = metamutator.Selector.of(1494,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1494");

    private static final metamutator.Selector _returnReplacementOperator1495 = metamutator.Selector.of(1495,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1495");

    private static final metamutator.Selector _returnReplacementOperator1496 = metamutator.Selector.of(1496,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1496");

    private static final metamutator.Selector _returnReplacementOperator1497 = metamutator.Selector.of(1497,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1497");

    private static final metamutator.Selector _returnReplacementOperator1498 = metamutator.Selector.of(1498,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1498");

    private static final metamutator.Selector _returnReplacementOperator1499 = metamutator.Selector.of(1499,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1499");

    private static final metamutator.Selector _returnReplacementOperator1500 = metamutator.Selector.of(1500,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrSubstitutor.class).id("_returnReplacementOperator1500");
}

