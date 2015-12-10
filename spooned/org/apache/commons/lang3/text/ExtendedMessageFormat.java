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
        return toPattern;
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
            return true;
        } 
        if (obj == null) {
            return false;
        } 
        if (!(super.equals(obj))) {
            return false;
        } 
        if (org.apache.commons.lang3.ObjectUtils.notEqual(getClass(), obj.getClass())) {
            return false;
        } 
        final org.apache.commons.lang3.text.ExtendedMessageFormat rhs = ((org.apache.commons.lang3.text.ExtendedMessageFormat)(obj));
        if (org.apache.commons.lang3.ObjectUtils.notEqual(toPattern, rhs.toPattern)) {
            return false;
        } 
        if (org.apache.commons.lang3.ObjectUtils.notEqual(registry, rhs.registry)) {
            return false;
        } 
        return true;
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public int hashCode() {
        int result = super.hashCode();
        result = ((_arithmeticOperatorHotSpot127.is("PLUS")) ? (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) + result)) : (_arithmeticOperatorHotSpot127.is("MINUS")) ? (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) - result)) : (_arithmeticOperatorHotSpot127.is("MUL")) ? (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) * result)) :  (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) / result))) + (org.apache.commons.lang3.ObjectUtils.hashCode(registry));
        result = ((_arithmeticOperatorHotSpot128.is("PLUS")) ? (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) + result)) : (_arithmeticOperatorHotSpot128.is("MINUS")) ? (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) - result)) : (_arithmeticOperatorHotSpot128.is("MUL")) ? (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) * result)) :  (((org.apache.commons.lang3.text.ExtendedMessageFormat.HASH_SEED) / result))) + (org.apache.commons.lang3.ObjectUtils.hashCode(toPattern));
        return result;
    }

    private java.text.Format getFormat(final java.lang.String desc) {
        if ((registry) != null) {
            java.lang.String name = desc;
            java.lang.String args = null;
            final int i = desc.indexOf(START_FMT);
            if (i > 0) {
                name = desc.substring(0, i).trim();
                args = desc.substring(((_arithmeticOperatorHotSpot131.is("PLUS")) ? ((i + 1)) : (_arithmeticOperatorHotSpot131.is("MINUS")) ? ((i - 1)) : (_arithmeticOperatorHotSpot131.is("MUL")) ? ((i * 1)) :  ((i / 1)))).trim();
            } 
            final org.apache.commons.lang3.text.FormatFactory factory = registry.get(name);
            if (factory != null) {
                return factory.getFormat(name, args, getLocale());
            } 
        } 
        return null;
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
                    return java.lang.Integer.parseInt(result.toString());
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
                        return pattern.substring(text, pos.getIndex());
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
            return pattern;
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(((_arithmeticOperatorHotSpot129.is("PLUS")) ? (((pattern.length()) + 2)) : (_arithmeticOperatorHotSpot129.is("MINUS")) ? (((pattern.length()) - 2)) : (_arithmeticOperatorHotSpot129.is("MUL")) ? (((pattern.length()) * 2)) :  (((pattern.length()) / 2))));
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
        return sb.toString();
    }

    private void seekNonWs(final java.lang.String pattern, final java.text.ParsePosition pos) {
        int len = 0;
        final char[] buffer = pattern.toCharArray();
        do {
            len = org.apache.commons.lang3.text.StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
            pos.setIndex(((_arithmeticOperatorHotSpot133.is("PLUS")) ? (((pos.getIndex()) + len)) : (_arithmeticOperatorHotSpot133.is("MINUS")) ? (((pos.getIndex()) - len)) : (_arithmeticOperatorHotSpot133.is("MUL")) ? (((pos.getIndex()) * len)) :  (((pos.getIndex()) / len))));
        } while ((len > 0) && ((pos.getIndex()) < (pattern.length())) );
    }

    private java.text.ParsePosition next(final java.text.ParsePosition pos) {
        pos.setIndex(((_arithmeticOperatorHotSpot132.is("PLUS")) ? (((pos.getIndex()) + 1)) : (_arithmeticOperatorHotSpot132.is("MINUS")) ? (((pos.getIndex()) - 1)) : (_arithmeticOperatorHotSpot132.is("MUL")) ? (((pos.getIndex()) * 1)) :  (((pos.getIndex()) / 1))));
        return pos;
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
                    return appendTo == null ? null : appendTo.append(c, lastHold, ((_arithmeticOperatorHotSpot130.is("PLUS")) ? (((pos.getIndex()) + lastHold)) : (_arithmeticOperatorHotSpot130.is("MINUS")) ? (((pos.getIndex()) - lastHold)) : (_arithmeticOperatorHotSpot130.is("MUL")) ? (((pos.getIndex()) * lastHold)) :  (((pos.getIndex()) / lastHold))));
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
            return false;
        } 
        for (final java.lang.Object name : coll) {
            if (name != null) {
                return true;
            } 
        }
        return false;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot127 = metamutator.Selector.of(127,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_arithmeticOperatorHotSpot127");

    private static final metamutator.Selector _arithmeticOperatorHotSpot128 = metamutator.Selector.of(128,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_arithmeticOperatorHotSpot128");

    private static final metamutator.Selector _arithmeticOperatorHotSpot129 = metamutator.Selector.of(129,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_arithmeticOperatorHotSpot129");

    private static final metamutator.Selector _arithmeticOperatorHotSpot130 = metamutator.Selector.of(130,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_arithmeticOperatorHotSpot130");

    private static final metamutator.Selector _arithmeticOperatorHotSpot131 = metamutator.Selector.of(131,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_arithmeticOperatorHotSpot131");

    private static final metamutator.Selector _arithmeticOperatorHotSpot132 = metamutator.Selector.of(132,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_arithmeticOperatorHotSpot132");

    private static final metamutator.Selector _arithmeticOperatorHotSpot133 = metamutator.Selector.of(133,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.ExtendedMessageFormat.class).id("_arithmeticOperatorHotSpot133");
}

