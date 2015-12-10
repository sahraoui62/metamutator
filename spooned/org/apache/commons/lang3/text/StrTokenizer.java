package org.apache.commons.lang3.text;


public class StrTokenizer implements java.lang.Cloneable , java.util.ListIterator<java.lang.String> {
    private static final org.apache.commons.lang3.text.StrTokenizer CSV_TOKENIZER_PROTOTYPE;

    private static final org.apache.commons.lang3.text.StrTokenizer TSV_TOKENIZER_PROTOTYPE;

    static {
        CSV_TOKENIZER_PROTOTYPE = new org.apache.commons.lang3.text.StrTokenizer();
        CSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.commaMatcher());
        CSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher());
        CSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher.noneMatcher());
        CSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(org.apache.commons.lang3.text.StrMatcher.trimMatcher());
        CSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        CSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
        TSV_TOKENIZER_PROTOTYPE = new org.apache.commons.lang3.text.StrTokenizer();
        TSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.tabMatcher());
        TSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher());
        TSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher.noneMatcher());
        TSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(org.apache.commons.lang3.text.StrMatcher.trimMatcher());
        TSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        TSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
    }

    private char[] chars;

    private java.lang.String[] tokens;

    private int tokenPos;

    private org.apache.commons.lang3.text.StrMatcher delimMatcher = org.apache.commons.lang3.text.StrMatcher.splitMatcher();

    private org.apache.commons.lang3.text.StrMatcher quoteMatcher = org.apache.commons.lang3.text.StrMatcher.noneMatcher();

    private org.apache.commons.lang3.text.StrMatcher ignoredMatcher = org.apache.commons.lang3.text.StrMatcher.noneMatcher();

    private org.apache.commons.lang3.text.StrMatcher trimmerMatcher = org.apache.commons.lang3.text.StrMatcher.noneMatcher();

    private boolean emptyAsNull = false;

    private boolean ignoreEmptyTokens = true;

    private static org.apache.commons.lang3.text.StrTokenizer getCSVClone() {
        return ((org.apache.commons.lang3.text.StrTokenizer)(CSV_TOKENIZER_PROTOTYPE.clone()));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance() {
        return org.apache.commons.lang3.text.StrTokenizer.getCSVClone();
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(final java.lang.String input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getCSVClone();
        tok.reset(input);
        return tok;
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(final char[] input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getCSVClone();
        tok.reset(input);
        return tok;
    }

    private static org.apache.commons.lang3.text.StrTokenizer getTSVClone() {
        return ((org.apache.commons.lang3.text.StrTokenizer)(TSV_TOKENIZER_PROTOTYPE.clone()));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance() {
        return org.apache.commons.lang3.text.StrTokenizer.getTSVClone();
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(final java.lang.String input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getTSVClone();
        tok.reset(input);
        return tok;
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(final char[] input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getTSVClone();
        tok.reset(input);
        return tok;
    }

    public StrTokenizer() {
        super();
        this.chars = null;
    }

    public StrTokenizer(final java.lang.String input) {
        super();
        if (input != null) {
            chars = input.toCharArray();
        } else {
            chars = null;
        }
    }

    public StrTokenizer(final java.lang.String input ,final char delim) {
        this(input);
        setDelimiterChar(delim);
    }

    public StrTokenizer(final java.lang.String input ,final java.lang.String delim) {
        this(input);
        setDelimiterString(delim);
    }

    public StrTokenizer(final java.lang.String input ,final org.apache.commons.lang3.text.StrMatcher delim) {
        this(input);
        setDelimiterMatcher(delim);
    }

    public StrTokenizer(final java.lang.String input ,final char delim ,final char quote) {
        this(input, delim);
        setQuoteChar(quote);
    }

    public StrTokenizer(final java.lang.String input ,final org.apache.commons.lang3.text.StrMatcher delim ,final org.apache.commons.lang3.text.StrMatcher quote) {
        this(input, delim);
        setQuoteMatcher(quote);
    }

    public StrTokenizer(final char[] input) {
        super();
        this.chars = org.apache.commons.lang3.ArrayUtils.clone(input);
    }

    public StrTokenizer(final char[] input ,final char delim) {
        this(input);
        setDelimiterChar(delim);
    }

    public StrTokenizer(final char[] input ,final java.lang.String delim) {
        this(input);
        setDelimiterString(delim);
    }

    public StrTokenizer(final char[] input ,final org.apache.commons.lang3.text.StrMatcher delim) {
        this(input);
        setDelimiterMatcher(delim);
    }

    public StrTokenizer(final char[] input ,final char delim ,final char quote) {
        this(input, delim);
        setQuoteChar(quote);
    }

    public StrTokenizer(final char[] input ,final org.apache.commons.lang3.text.StrMatcher delim ,final org.apache.commons.lang3.text.StrMatcher quote) {
        this(input, delim);
        setQuoteMatcher(quote);
    }

    public int size() {
        checkTokenized();
        return tokens.length;
    }

    public java.lang.String nextToken() {
        if (hasNext()) {
            return tokens[(tokenPos)++];
        } 
        return null;
    }

    public java.lang.String previousToken() {
        if (hasPrevious()) {
            return tokens[--(tokenPos)];
        } 
        return null;
    }

    public java.lang.String[] getTokenArray() {
        checkTokenized();
        return tokens.clone();
    }

    public java.util.List<java.lang.String> getTokenList() {
        checkTokenized();
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(tokens.length);
        for (final java.lang.String element : tokens) {
            list.add(element);
        }
        return list;
    }

    public org.apache.commons.lang3.text.StrTokenizer reset() {
        tokenPos = 0;
        tokens = null;
        return this;
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(final java.lang.String input) {
        reset();
        if (input != null) {
            this.chars = input.toCharArray();
        } else {
            this.chars = null;
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(final char[] input) {
        reset();
        this.chars = org.apache.commons.lang3.ArrayUtils.clone(input);
        return this;
    }

    @java.lang.Override
    public boolean hasNext() {
        checkTokenized();
        return (tokenPos) < (tokens.length);
    }

    @java.lang.Override
    public java.lang.String next() {
        if (hasNext()) {
            return tokens[(tokenPos)++];
        } 
        throw new java.util.NoSuchElementException();
    }

    @java.lang.Override
    public int nextIndex() {
        return tokenPos;
    }

    @java.lang.Override
    public boolean hasPrevious() {
        checkTokenized();
        return (tokenPos) > 0;
    }

    @java.lang.Override
    public java.lang.String previous() {
        if (hasPrevious()) {
            return tokens[--(tokenPos)];
        } 
        throw new java.util.NoSuchElementException();
    }

    @java.lang.Override
    public int previousIndex() {
        return ((_arithmeticOperatorHotSpot263.is("PLUS")) ? ((tokenPos) + 1) : (_arithmeticOperatorHotSpot263.is("MINUS")) ? ((tokenPos) - 1) : (_arithmeticOperatorHotSpot263.is("MUL")) ? ((tokenPos) * 1) :  ((tokenPos) / 1));
    }

    @java.lang.Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove() is unsupported");
    }

    @java.lang.Override
    public void set(final java.lang.String obj) {
        throw new java.lang.UnsupportedOperationException("set() is unsupported");
    }

    @java.lang.Override
    public void add(final java.lang.String obj) {
        throw new java.lang.UnsupportedOperationException("add() is unsupported");
    }

    private void checkTokenized() {
        if ((tokens) == null) {
            if ((chars) == null) {
                final java.util.List<java.lang.String> split = tokenize(null, 0, 0);
                tokens = split.toArray(new java.lang.String[split.size()]);
            } else {
                final java.util.List<java.lang.String> split = tokenize(chars, 0, chars.length);
                tokens = split.toArray(new java.lang.String[split.size()]);
            }
        } 
    }

    protected java.util.List<java.lang.String> tokenize(final char[] srcChars, final int offset, final int count) {
        if ((srcChars == null) || (count == 0)) {
            return java.util.Collections.emptyList();
        } 
        final org.apache.commons.lang3.text.StrBuilder buf = new org.apache.commons.lang3.text.StrBuilder();
        final java.util.List<java.lang.String> tokenList = new java.util.ArrayList<java.lang.String>();
        int pos = offset;
        while ((pos >= 0) && (pos < count)) {
            pos = readNextToken(srcChars, pos, count, buf, tokenList);
            if (pos >= count) {
                addToken(tokenList, "");
            } 
        }
        return tokenList;
    }

    private void addToken(final java.util.List<java.lang.String> list, java.lang.String tok) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(tok)) {
            if (isIgnoreEmptyTokens()) {
                return ;
            } 
            if (isEmptyTokenAsNull()) {
                tok = null;
            } 
        } 
        list.add(tok);
    }

    private int readNextToken(final char[] srcChars, int start, final int len, final org.apache.commons.lang3.text.StrBuilder workArea, final java.util.List<java.lang.String> tokenList) {
        while (start < len) {
            final int removeLen = java.lang.Math.max(getIgnoredMatcher().isMatch(srcChars, start, start, len), getTrimmerMatcher().isMatch(srcChars, start, start, len));
            if (((removeLen == 0) || ((getDelimiterMatcher().isMatch(srcChars, start, start, len)) > 0)) || ((getQuoteMatcher().isMatch(srcChars, start, start, len)) > 0)) {
                break;
            } 
            start += removeLen;
        }
        if (start >= len) {
            addToken(tokenList, "");
            return -1;
        } 
        final int delimLen = getDelimiterMatcher().isMatch(srcChars, start, start, len);
        if (delimLen > 0) {
            addToken(tokenList, "");
            return ((_arithmeticOperatorHotSpot264.is("PLUS")) ? (start + delimLen) : (_arithmeticOperatorHotSpot264.is("MINUS")) ? (start - delimLen) : (_arithmeticOperatorHotSpot264.is("MUL")) ? (start * delimLen) :  (start / delimLen));
        } 
        final int quoteLen = getQuoteMatcher().isMatch(srcChars, start, start, len);
        if (quoteLen > 0) {
            return readWithQuotes(srcChars, ((_arithmeticOperatorHotSpot265.is("PLUS")) ? ((start + quoteLen)) : (_arithmeticOperatorHotSpot265.is("MINUS")) ? ((start - quoteLen)) : (_arithmeticOperatorHotSpot265.is("MUL")) ? ((start * quoteLen)) :  ((start / quoteLen))), len, workArea, tokenList, start, quoteLen);
        } 
        return readWithQuotes(srcChars, start, len, workArea, tokenList, 0, 0);
    }

    private int readWithQuotes(final char[] srcChars, final int start, final int len, final org.apache.commons.lang3.text.StrBuilder workArea, final java.util.List<java.lang.String> tokenList, final int quoteStart, final int quoteLen) {
        workArea.clear();
        int pos = start;
        boolean quoting = quoteLen > 0;
        int trimStart = 0;
        while (pos < len) {
            if (quoting) {
                if (isQuote(srcChars, pos, len, quoteStart, quoteLen)) {
                    if (isQuote(srcChars, ((_arithmeticOperatorHotSpot266.is("PLUS")) ? ((pos + quoteLen)) : (_arithmeticOperatorHotSpot266.is("MINUS")) ? ((pos - quoteLen)) : (_arithmeticOperatorHotSpot266.is("MUL")) ? ((pos * quoteLen)) :  ((pos / quoteLen))), len, quoteStart, quoteLen)) {
                        workArea.append(srcChars, pos, quoteLen);
                        pos += ((_arithmeticOperatorHotSpot267.is("PLUS")) ? (quoteLen + 2) : (_arithmeticOperatorHotSpot267.is("MINUS")) ? (quoteLen - 2) : (_arithmeticOperatorHotSpot267.is("MUL")) ? (quoteLen * 2) :  (quoteLen / 2));
                        trimStart = workArea.size();
                        continue;
                    } 
                    quoting = false;
                    pos += quoteLen;
                    continue;
                } 
                workArea.append(srcChars[pos++]);
                trimStart = workArea.size();
            } else {
                final int delimLen = getDelimiterMatcher().isMatch(srcChars, pos, start, len);
                if (delimLen > 0) {
                    addToken(tokenList, workArea.substring(0, trimStart));
                    return ((_arithmeticOperatorHotSpot268.is("PLUS")) ? (pos + delimLen) : (_arithmeticOperatorHotSpot268.is("MINUS")) ? (pos - delimLen) : (_arithmeticOperatorHotSpot268.is("MUL")) ? (pos * delimLen) :  (pos / delimLen));
                } 
                if ((quoteLen > 0) && (isQuote(srcChars, pos, len, quoteStart, quoteLen))) {
                    quoting = true;
                    pos += quoteLen;
                    continue;
                } 
                final int ignoredLen = getIgnoredMatcher().isMatch(srcChars, pos, start, len);
                if (ignoredLen > 0) {
                    pos += ignoredLen;
                    continue;
                } 
                final int trimmedLen = getTrimmerMatcher().isMatch(srcChars, pos, start, len);
                if (trimmedLen > 0) {
                    workArea.append(srcChars, pos, trimmedLen);
                    pos += trimmedLen;
                    continue;
                } 
                workArea.append(srcChars[pos++]);
                trimStart = workArea.size();
            }
        }
        addToken(tokenList, workArea.substring(0, trimStart));
        return -1;
    }

    private boolean isQuote(final char[] srcChars, final int pos, final int len, final int quoteStart, final int quoteLen) {
        for (int i = 0 ; i < quoteLen ; i++) {
            if ((((_arithmeticOperatorHotSpot260.is("PLUS")) ? ((pos + i)) : (_arithmeticOperatorHotSpot260.is("MINUS")) ? ((pos - i)) : (_arithmeticOperatorHotSpot260.is("MUL")) ? ((pos * i)) :  ((pos / i))) >= len) || ((srcChars[((_arithmeticOperatorHotSpot261.is("PLUS")) ? ((pos + i)) : (_arithmeticOperatorHotSpot261.is("MINUS")) ? ((pos - i)) : (_arithmeticOperatorHotSpot261.is("MUL")) ? ((pos * i)) :  ((pos / i)))]) != (srcChars[((_arithmeticOperatorHotSpot262.is("PLUS")) ? ((quoteStart + i)) : (_arithmeticOperatorHotSpot262.is("MINUS")) ? ((quoteStart - i)) : (_arithmeticOperatorHotSpot262.is("MUL")) ? ((quoteStart * i)) :  ((quoteStart / i)))]))) {
                return false;
            } 
        }
        return true;
    }

    public org.apache.commons.lang3.text.StrMatcher getDelimiterMatcher() {
        return this.delimMatcher;
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterMatcher(final org.apache.commons.lang3.text.StrMatcher delim) {
        if (delim == null) {
            this.delimMatcher = org.apache.commons.lang3.text.StrMatcher.noneMatcher();
        } else {
            this.delimMatcher = delim;
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterChar(final char delim) {
        return setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(delim));
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterString(final java.lang.String delim) {
        return setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(delim));
    }

    public org.apache.commons.lang3.text.StrMatcher getQuoteMatcher() {
        return quoteMatcher;
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteMatcher(final org.apache.commons.lang3.text.StrMatcher quote) {
        if (quote != null) {
            this.quoteMatcher = quote;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteChar(final char quote) {
        return setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(quote));
    }

    public org.apache.commons.lang3.text.StrMatcher getIgnoredMatcher() {
        return ignoredMatcher;
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredMatcher(final org.apache.commons.lang3.text.StrMatcher ignored) {
        if (ignored != null) {
            this.ignoredMatcher = ignored;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredChar(final char ignored) {
        return setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(ignored));
    }

    public org.apache.commons.lang3.text.StrMatcher getTrimmerMatcher() {
        return trimmerMatcher;
    }

    public org.apache.commons.lang3.text.StrTokenizer setTrimmerMatcher(final org.apache.commons.lang3.text.StrMatcher trimmer) {
        if (trimmer != null) {
            this.trimmerMatcher = trimmer;
        } 
        return this;
    }

    public boolean isEmptyTokenAsNull() {
        return this.emptyAsNull;
    }

    public org.apache.commons.lang3.text.StrTokenizer setEmptyTokenAsNull(final boolean emptyAsNull) {
        this.emptyAsNull = emptyAsNull;
        return this;
    }

    public boolean isIgnoreEmptyTokens() {
        return ignoreEmptyTokens;
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoreEmptyTokens(final boolean ignoreEmptyTokens) {
        this.ignoreEmptyTokens = ignoreEmptyTokens;
        return this;
    }

    public java.lang.String getContent() {
        if ((chars) == null) {
            return null;
        } 
        return new java.lang.String(chars);
    }

    @java.lang.Override
    public java.lang.Object clone() {
        try {
            return cloneReset();
        } catch (final java.lang.CloneNotSupportedException ex) {
            return null;
        }
    }

    java.lang.Object cloneReset() throws java.lang.CloneNotSupportedException {
        final org.apache.commons.lang3.text.StrTokenizer cloned = ((org.apache.commons.lang3.text.StrTokenizer)(super.clone()));
        if ((cloned.chars) != null) {
            cloned.chars = cloned.chars.clone();
        } 
        cloned.reset();
        return cloned;
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((tokens) == null) {
            return "StrTokenizer[not tokenized yet]";
        } 
        return "StrTokenizer" + (getTokenList());
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot260 = metamutator.Selector.of(260,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot260");

    private static final metamutator.Selector _arithmeticOperatorHotSpot261 = metamutator.Selector.of(261,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot261");

    private static final metamutator.Selector _arithmeticOperatorHotSpot262 = metamutator.Selector.of(262,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot262");

    private static final metamutator.Selector _arithmeticOperatorHotSpot263 = metamutator.Selector.of(263,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot263");

    private static final metamutator.Selector _arithmeticOperatorHotSpot264 = metamutator.Selector.of(264,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot264");

    private static final metamutator.Selector _arithmeticOperatorHotSpot265 = metamutator.Selector.of(265,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot265");

    private static final metamutator.Selector _arithmeticOperatorHotSpot266 = metamutator.Selector.of(266,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot266");

    private static final metamutator.Selector _arithmeticOperatorHotSpot267 = metamutator.Selector.of(267,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot267");

    private static final metamutator.Selector _arithmeticOperatorHotSpot268 = metamutator.Selector.of(268,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_arithmeticOperatorHotSpot268");
}

