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
        return ((_returnReplacementOperator1169.is("NULL")) ? ( null ) : (toPattern));
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
            return ((_returnReplacementOperator1157.is("NULL")) ? ( null ) : (true));
        } 
        if (obj == null) {
            return ((_returnReplacementOperator1158.is("NULL")) ? ( null ) : (false));
        } 
        if (!(super.equals(obj))) {
            return ((_returnReplacementOperator1159.is("NULL")) ? ( null ) : (false));
        } 
        if (org.apache.commons.lang3.ObjectUtils.notEqual(getClass(), obj.getClass())) {
            return ((_returnReplacementOperator1160.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.text.ExtendedMessageFormat rhs = ((org.apache.commons.lang3.text.ExtendedMessageFormat)(obj));
        if (org.apache.commons.lang3.ObjectUtils.notEqual(toPattern, rhs.toPattern)) {
            return ((_returnReplacementOperator1161.is("NULL")) ? ( null ) : (false));
        } 
        if (org.apache.commons.lang3.ObjectUtils.notEqual(registry, rhs.registry)) {
            return ((_returnReplacementOperator1162.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator1163.is("NULL")) ? ( null ) : (true));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public int hashCode() {
        int result = super.hashCode();
        result = ((HASH_SEED) * result) + (org.apache.commons.lang3.ObjectUtils.hashCode(registry));
        result = ((HASH_SEED) * result) + (org.apache.commons.lang3.ObjectUtils.hashCode(toPattern));
        return ((_returnReplacementOperator1164.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1164.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1164.is("ZERO")) ? ( 0 ) : (result));
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
                return ((_returnReplacementOperator1171.is("NULL")) ? ( null ) : (factory.getFormat(name, args, getLocale())));
            } 
        } 
        return ((_returnReplacementOperator1172.is("NULL")) ? ( null ) : (null));
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
                    return ((_returnReplacementOperator1165.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1165.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1165.is("ZERO")) ? ( 0 ) : (java.lang.Integer.parseInt(result.toString())));
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
                        return ((_returnReplacementOperator1168.is("NULL")) ? ( null ) : (pattern.substring(text, pos.getIndex())));
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
            return ((_returnReplacementOperator1166.is("NULL")) ? ( null ) : (pattern));
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
        return ((_returnReplacementOperator1167.is("NULL")) ? ( null ) : (sb.toString()));
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
        return ((_returnReplacementOperator1173.is("NULL")) ? ( null ) : (pos));
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
                    return ((_returnReplacementOperator1170.is("NULL")) ? ( null ) : (appendTo == null ? null : appendTo.append(c, lastHold, ((pos.getIndex()) - lastHold))));
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
            return ((_returnReplacementOperator1154.is("NULL")) ? ( null ) : (false));
        } 
        for (final java.lang.Object name : coll) {
            if (name != null) {
                return ((_returnReplacementOperator1155.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator1156.is("NULL")) ? ( null ) : (false));
    }

    private static final metamutator.Selector _returnReplacementOperator1154 = metamutator.Selector.of(1154,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1154");

    private static final metamutator.Selector _returnReplacementOperator1155 = metamutator.Selector.of(1155,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1155");

    private static final metamutator.Selector _returnReplacementOperator1156 = metamutator.Selector.of(1156,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1156");

    private static final metamutator.Selector _returnReplacementOperator1157 = metamutator.Selector.of(1157,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1157");

    private static final metamutator.Selector _returnReplacementOperator1158 = metamutator.Selector.of(1158,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1158");

    private static final metamutator.Selector _returnReplacementOperator1159 = metamutator.Selector.of(1159,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1159");

    private static final metamutator.Selector _returnReplacementOperator1160 = metamutator.Selector.of(1160,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1160");

    private static final metamutator.Selector _returnReplacementOperator1161 = metamutator.Selector.of(1161,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1161");

    private static final metamutator.Selector _returnReplacementOperator1162 = metamutator.Selector.of(1162,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1162");

    private static final metamutator.Selector _returnReplacementOperator1163 = metamutator.Selector.of(1163,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1163");

    private static final metamutator.Selector _returnReplacementOperator1164 = metamutator.Selector.of(1164,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1164");

    private static final metamutator.Selector _returnReplacementOperator1165 = metamutator.Selector.of(1165,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1165");

    private static final metamutator.Selector _returnReplacementOperator1166 = metamutator.Selector.of(1166,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1166");

    private static final metamutator.Selector _returnReplacementOperator1167 = metamutator.Selector.of(1167,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1167");

    private static final metamutator.Selector _returnReplacementOperator1168 = metamutator.Selector.of(1168,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1168");

    private static final metamutator.Selector _returnReplacementOperator1169 = metamutator.Selector.of(1169,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1169");

    private static final metamutator.Selector _returnReplacementOperator1170 = metamutator.Selector.of(1170,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1170");

    private static final metamutator.Selector _returnReplacementOperator1171 = metamutator.Selector.of(1171,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1171");

    private static final metamutator.Selector _returnReplacementOperator1172 = metamutator.Selector.of(1172,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1172");

    private static final metamutator.Selector _returnReplacementOperator1173 = metamutator.Selector.of(1173,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_returnReplacementOperator1173");
}

