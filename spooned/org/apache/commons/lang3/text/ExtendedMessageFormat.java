package org.apache.commons.lang3.text;


public class ExtendedMessageFormat extends java.text.MessageFormat {
    private static final long serialVersionUID = -2362048321261811743L;

    private static final int HASH_SEED = 31;

    private static final java.lang.String DUMMY_PATTERN = "";

    private static final char START_FMT = ',';

    private static final char END_FE = '}';

    private static final char START_FE = '{';

    private static final char QUOTE = '\'';

    private java.lang.String toPattern;

    private final java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> registry;

    public ExtendedMessageFormat(final java.lang.String pattern) {
        this(pattern, java.util.Locale.getDefault());
    }

    public ExtendedMessageFormat(final java.lang.String pattern ,final java.util.Locale locale) {
        this(pattern, locale, null);
    }

    public ExtendedMessageFormat(final java.lang.String pattern ,final java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> registry) {
        this(pattern, java.util.Locale.getDefault(), registry);
    }

    public ExtendedMessageFormat(final java.lang.String pattern ,final java.util.Locale locale ,final java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> registry) {
        super(DUMMY_PATTERN);
        setLocale(locale);
        this.registry = registry;
        applyPattern(pattern);
    }

    @java.lang.Override
    public java.lang.String toPattern() {
        return ((_returnReplacementOperatorHotSpot1169.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toPattern));
    }

    @java.lang.Override
    public final void applyPattern(final java.lang.String pattern) {
        if ((registry) == null) {
            super.applyPattern(pattern);
            toPattern = super.toPattern();
            return ;
        } 
        final java.util.ArrayList<java.text.Format> foundFormats = new java.util.ArrayList<java.text.Format>();
        final java.util.ArrayList<java.lang.String> foundDescriptions = new java.util.ArrayList<java.lang.String>();
        final java.lang.StringBuilder stripCustom = new java.lang.StringBuilder(pattern.length());
        final java.text.ParsePosition pos = new java.text.ParsePosition(0);
        final char[] c = pattern.toCharArray();
        int fmtCount = 0;
        while ((pos.getIndex()) < (pattern.length())) {
            switch (c[pos.getIndex()]) {
                case QUOTE :
                    appendQuotedString(pattern, pos, stripCustom);
                    break;
                case START_FE :
                    fmtCount++;
                    seekNonWs(pattern, pos);
                    final int start = pos.getIndex();
                    final int index = readArgumentIndex(pattern, next(pos));
                    stripCustom.append(START_FE).append(index);
                    seekNonWs(pattern, pos);
                    java.text.Format format = null;
                    java.lang.String formatDescription = null;
                    if ((c[pos.getIndex()]) == (START_FMT)) {
                        formatDescription = parseFormatDescription(pattern, next(pos));
                        format = getFormat(formatDescription);
                        if (format == null) {
                            stripCustom.append(START_FMT).append(formatDescription);
                        } 
                    } 
                    foundFormats.add(format);
                    foundDescriptions.add((format == null ? null : formatDescription));
                    org.apache.commons.lang3.Validate.isTrue(((foundFormats.size()) == fmtCount));
                    org.apache.commons.lang3.Validate.isTrue(((foundDescriptions.size()) == fmtCount));
                    if ((c[pos.getIndex()]) != (END_FE)) {
                        throw new java.lang.IllegalArgumentException(("Unreadable format element at position " + start));
                    } 
                default :
                    stripCustom.append(c[pos.getIndex()]);
                    next(pos);
            }
        }
        super.applyPattern(stripCustom.toString());
        toPattern = insertFormats(super.toPattern(), foundDescriptions);
        if (containsElements(foundFormats)) {
            final java.text.Format[] origFormats = getFormats();
            int i = 0;
            for (final java.util.Iterator<java.text.Format> it = foundFormats.iterator() ; it.hasNext() ; i++) {
                final java.text.Format f = it.next();
                if (f != null) {
                    origFormats[i] = f;
                } 
            }
            super.setFormats(origFormats);
        } 
    }

    @java.lang.Override
    public void setFormat(final int formatElementIndex, final java.text.Format newFormat) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Override
    public void setFormatByArgumentIndex(final int argumentIndex, final java.text.Format newFormat) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Override
    public void setFormats(final java.text.Format[] newFormats) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Override
    public void setFormatsByArgumentIndex(final java.text.Format[] newFormats) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperatorHotSpot1157.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (obj == null) {
            return ((_returnReplacementOperatorHotSpot1158.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (!(super.equals(obj))) {
            return ((_returnReplacementOperatorHotSpot1159.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (org.apache.commons.lang3.ObjectUtils.notEqual(getClass(), obj.getClass())) {
            return ((_returnReplacementOperatorHotSpot1160.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.text.ExtendedMessageFormat rhs = ((org.apache.commons.lang3.text.ExtendedMessageFormat)(obj));
        if (org.apache.commons.lang3.ObjectUtils.notEqual(toPattern, rhs.toPattern)) {
            return ((_returnReplacementOperatorHotSpot1161.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (org.apache.commons.lang3.ObjectUtils.notEqual(registry, rhs.registry)) {
            return ((_returnReplacementOperatorHotSpot1162.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot1163.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public int hashCode() {
        int result = super.hashCode();
        result = ((HASH_SEED) * result) + (org.apache.commons.lang3.ObjectUtils.hashCode(registry));
        result = ((HASH_SEED) * result) + (org.apache.commons.lang3.ObjectUtils.hashCode(toPattern));
        return ((_returnReplacementOperatorHotSpot1164.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1164.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1164.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (result));
    }

    private java.text.Format getFormat(final java.lang.String desc) {
        if ((registry) != null) {
            java.lang.String name = desc;
            java.lang.String args = null;
            final int i = desc.indexOf(START_FMT);
            if (i > 0) {
                name = desc.substring(0, i).trim();
                args = desc.substring((i + 1)).trim();
            } 
            final org.apache.commons.lang3.text.FormatFactory factory = registry.get(name);
            if (factory != null) {
                return ((_returnReplacementOperatorHotSpot1171.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (factory.getFormat(name, args, getLocale())));
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1172.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    private int readArgumentIndex(final java.lang.String pattern, final java.text.ParsePosition pos) {
        final int start = pos.getIndex();
        seekNonWs(pattern, pos);
        final java.lang.StringBuilder result = new java.lang.StringBuilder();
        boolean error = false;
        for ( ; (!error) && ((pos.getIndex()) < (pattern.length())) ; next(pos)) {
            char c = pattern.charAt(pos.getIndex());
            if (java.lang.Character.isWhitespace(c)) {
                seekNonWs(pattern, pos);
                c = pattern.charAt(pos.getIndex());
                if ((c != (START_FMT)) && (c != (END_FE))) {
                    error = true;
                    continue;
                } 
            } 
            if (((c == (START_FMT)) || (c == (END_FE))) && ((result.length()) > 0)) {
                try {
                    return ((_returnReplacementOperatorHotSpot1165.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1165.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1165.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.Integer.parseInt(result.toString())));
                } catch (final java.lang.NumberFormatException e) {
                }
            } 
            error = !(java.lang.Character.isDigit(c));
            result.append(c);
        }
        if (error) {
            throw new java.lang.IllegalArgumentException(((("Invalid format argument index at position " + start) + ": ") + (pattern.substring(start, pos.getIndex()))));
        } 
        throw new java.lang.IllegalArgumentException(("Unterminated format element at position " + start));
    }

    private java.lang.String parseFormatDescription(final java.lang.String pattern, final java.text.ParsePosition pos) {
        final int start = pos.getIndex();
        seekNonWs(pattern, pos);
        final int text = pos.getIndex();
        int depth = 1;
        for ( ; (pos.getIndex()) < (pattern.length()) ; next(pos)) {
            switch (pattern.charAt(pos.getIndex())) {
                case START_FE :
                    depth++;
                    break;
                case END_FE :
                    depth--;
                    if (depth == 0) {
                        return ((_returnReplacementOperatorHotSpot1168.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (pattern.substring(text, pos.getIndex())));
                    } 
                    break;
                case QUOTE :
                    getQuotedString(pattern, pos);
                    break;
                default :
                    break;
            }
        }
        throw new java.lang.IllegalArgumentException(("Unterminated format element at position " + start));
    }

    private java.lang.String insertFormats(final java.lang.String pattern, final java.util.ArrayList<java.lang.String> customPatterns) {
        if (!(containsElements(customPatterns))) {
            return ((_returnReplacementOperatorHotSpot1166.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (pattern));
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(((pattern.length()) * 2));
        final java.text.ParsePosition pos = new java.text.ParsePosition(0);
        int fe = -1;
        int depth = 0;
        while ((pos.getIndex()) < (pattern.length())) {
            final char c = pattern.charAt(pos.getIndex());
            switch (c) {
                case QUOTE :
                    appendQuotedString(pattern, pos, sb);
                    break;
                case START_FE :
                    depth++;
                    sb.append(START_FE).append(readArgumentIndex(pattern, next(pos)));
                    if (depth == 1) {
                        fe++;
                        final java.lang.String customPattern = customPatterns.get(fe);
                        if (customPattern != null) {
                            sb.append(START_FMT).append(customPattern);
                        } 
                    } 
                    break;
                case END_FE :
                    depth--;
                default :
                    sb.append(c);
                    next(pos);
            }
        }
        return ((_returnReplacementOperatorHotSpot1167.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sb.toString()));
    }

    private void seekNonWs(final java.lang.String pattern, final java.text.ParsePosition pos) {
        int len = 0;
        final char[] buffer = pattern.toCharArray();
        do {
            len = org.apache.commons.lang3.text.StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
            pos.setIndex(((pos.getIndex()) + len));
        } while ((len > 0) && ((pos.getIndex()) < (pattern.length())) );
    }

    private java.text.ParsePosition next(final java.text.ParsePosition pos) {
        pos.setIndex(((pos.getIndex()) + 1));
        return ((_returnReplacementOperatorHotSpot1173.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (pos));
    }

    private java.lang.StringBuilder appendQuotedString(final java.lang.String pattern, final java.text.ParsePosition pos, final java.lang.StringBuilder appendTo) {
        assert (pattern.toCharArray()[pos.getIndex()]) == (QUOTE) : "Quoted string must start with quote character";
        if (appendTo != null) {
            appendTo.append(QUOTE);
        } 
        next(pos);
        final int start = pos.getIndex();
        final char[] c = pattern.toCharArray();
        int lastHold = start;
        for (int i = pos.getIndex() ; i < (pattern.length()) ; i++) {
            switch (c[pos.getIndex()]) {
                case QUOTE :
                    next(pos);
                    return ((_returnReplacementOperatorHotSpot1170.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendTo == null ? null : appendTo.append(c, lastHold, ((pos.getIndex()) - lastHold))));
                default :
                    next(pos);
            }
        }
        throw new java.lang.IllegalArgumentException(("Unterminated quoted string at position " + start));
    }

    private void getQuotedString(final java.lang.String pattern, final java.text.ParsePosition pos) {
        appendQuotedString(pattern, pos, null);
    }

    private boolean containsElements(final java.util.Collection<?> coll) {
        if ((coll == null) || (coll.isEmpty())) {
            return ((_returnReplacementOperatorHotSpot1154.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        for (final java.lang.Object name : coll) {
            if (name != null) {
                return ((_returnReplacementOperatorHotSpot1155.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1156.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1154 = metamutator.Selector.of(1154,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1154");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1155 = metamutator.Selector.of(1155,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1155");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1156 = metamutator.Selector.of(1156,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1156");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1157 = metamutator.Selector.of(1157,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1157");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1158 = metamutator.Selector.of(1158,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1158");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1159 = metamutator.Selector.of(1159,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1159");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1160 = metamutator.Selector.of(1160,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1160");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1161 = metamutator.Selector.of(1161,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1161");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1162 = metamutator.Selector.of(1162,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1162");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1163 = metamutator.Selector.of(1163,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1163");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1164 = metamutator.Selector.of(1164,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1164");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1165 = metamutator.Selector.of(1165,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1165");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1166 = metamutator.Selector.of(1166,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1166");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1167 = metamutator.Selector.of(1167,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1167");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1168 = metamutator.Selector.of(1168,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1168");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1169 = metamutator.Selector.of(1169,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1169");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1170 = metamutator.Selector.of(1170,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1170");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1171 = metamutator.Selector.of(1171,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1171");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1172 = metamutator.Selector.of(1172,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1172");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1173 = metamutator.Selector.of(1173,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperatorHotSpot1173");
}

