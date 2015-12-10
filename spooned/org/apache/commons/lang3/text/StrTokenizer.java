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
        return ((_returnReplacementOperatorHotSpot1537.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((org.apache.commons.lang3.text.StrTokenizer)(org.apache.commons.lang3.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.clone()))));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance() {
        return ((_returnReplacementOperatorHotSpot1538.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrTokenizer.getCSVClone()));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(final java.lang.String input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getCSVClone();
        tok.reset(input);
        return ((_returnReplacementOperatorHotSpot1540.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tok));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(final char[] input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getCSVClone();
        tok.reset(input);
        return ((_returnReplacementOperatorHotSpot1539.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tok));
    }

    private static org.apache.commons.lang3.text.StrTokenizer getTSVClone() {
        return ((_returnReplacementOperatorHotSpot1541.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((org.apache.commons.lang3.text.StrTokenizer)(org.apache.commons.lang3.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.clone()))));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance() {
        return ((_returnReplacementOperatorHotSpot1542.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrTokenizer.getTSVClone()));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(final java.lang.String input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getTSVClone();
        tok.reset(input);
        return ((_returnReplacementOperatorHotSpot1544.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tok));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(final char[] input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getTSVClone();
        tok.reset(input);
        return ((_returnReplacementOperatorHotSpot1543.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tok));
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
        return ((_returnReplacementOperatorHotSpot1515.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1515.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1515.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (tokens.length));
    }

    public java.lang.String nextToken() {
        if (hasNext()) {
            return ((_returnReplacementOperatorHotSpot1522.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tokens[(tokenPos)++]));
        } 
        return ((_returnReplacementOperatorHotSpot1523.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public java.lang.String previousToken() {
        if (hasPrevious()) {
            return ((_returnReplacementOperatorHotSpot1525.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tokens[--(tokenPos)]));
        } 
        return ((_returnReplacementOperatorHotSpot1526.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public java.lang.String[] getTokenArray() {
        checkTokenized();
        return ((_returnReplacementOperatorHotSpot1529.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tokens.clone()));
    }

    public java.util.List<java.lang.String> getTokenList() {
        checkTokenized();
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(tokens.length);
        for (final java.lang.String element : tokens) {
            list.add(element);
        }
        return ((_returnReplacementOperatorHotSpot1530.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (list));
    }

    public org.apache.commons.lang3.text.StrTokenizer reset() {
        tokenPos = 0;
        tokens = null;
        return ((_returnReplacementOperatorHotSpot1545.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(final java.lang.String input) {
        reset();
        if (input != null) {
            this.chars = input.toCharArray();
        } else {
            this.chars = null;
        }
        return ((_returnReplacementOperatorHotSpot1547.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(final char[] input) {
        reset();
        this.chars = org.apache.commons.lang3.ArrayUtils.clone(input);
        return ((_returnReplacementOperatorHotSpot1546.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public boolean hasNext() {
        checkTokenized();
        return ((_returnReplacementOperatorHotSpot1501.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((tokenPos) < (tokens.length)));
    }

    @java.lang.Override
    public java.lang.String next() {
        if (hasNext()) {
            return ((_returnReplacementOperatorHotSpot1521.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tokens[(tokenPos)++]));
        } 
        throw new java.util.NoSuchElementException();
    }

    @java.lang.Override
    public int nextIndex() {
        return ((_returnReplacementOperatorHotSpot1507.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1507.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1507.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (tokenPos));
    }

    @java.lang.Override
    public boolean hasPrevious() {
        checkTokenized();
        return ((_returnReplacementOperatorHotSpot1502.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((tokenPos) > 0));
    }

    @java.lang.Override
    public java.lang.String previous() {
        if (hasPrevious()) {
            return ((_returnReplacementOperatorHotSpot1524.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tokens[--(tokenPos)]));
        } 
        throw new java.util.NoSuchElementException();
    }

    @java.lang.Override
    public int previousIndex() {
        return ((_returnReplacementOperatorHotSpot1508.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1508.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1508.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((tokenPos) - 1));
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
            return ((_returnReplacementOperatorHotSpot1531.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Collections.emptyList()));
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
        return ((_returnReplacementOperatorHotSpot1532.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (tokenList));
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
            return ((_returnReplacementOperatorHotSpot1509.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1509.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1509.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        final int delimLen = getDelimiterMatcher().isMatch(srcChars, start, start, len);
        if (delimLen > 0) {
            addToken(tokenList, "");
            return ((_returnReplacementOperatorHotSpot1510.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1510.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1510.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (start + delimLen));
        } 
        final int quoteLen = getQuoteMatcher().isMatch(srcChars, start, start, len);
        if (quoteLen > 0) {
            return ((_returnReplacementOperatorHotSpot1511.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1511.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1511.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (readWithQuotes(srcChars, (start + quoteLen), len, workArea, tokenList, start, quoteLen)));
        } 
        return ((_returnReplacementOperatorHotSpot1512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (readWithQuotes(srcChars, start, len, workArea, tokenList, 0, 0)));
    }

    private int readWithQuotes(final char[] srcChars, final int start, final int len, final org.apache.commons.lang3.text.StrBuilder workArea, final java.util.List<java.lang.String> tokenList, final int quoteStart, final int quoteLen) {
        workArea.clear();
        int pos = start;
        boolean quoting = quoteLen > 0;
        int trimStart = 0;
        while (pos < len) {
            if (quoting) {
                if (isQuote(srcChars, pos, len, quoteStart, quoteLen)) {
                    if (isQuote(srcChars, (pos + quoteLen), len, quoteStart, quoteLen)) {
                        workArea.append(srcChars, pos, quoteLen);
                        pos += quoteLen * 2;
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
                    return ((_returnReplacementOperatorHotSpot1513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (pos + delimLen));
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
        return ((_returnReplacementOperatorHotSpot1514.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1514.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1514.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    private boolean isQuote(final char[] srcChars, final int pos, final int len, final int quoteStart, final int quoteLen) {
        for (int i = 0 ; i < quoteLen ; i++) {
            if (((pos + i) >= len) || ((srcChars[(pos + i)]) != (srcChars[(quoteStart + i)]))) {
                return ((_returnReplacementOperatorHotSpot1505.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1506.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public org.apache.commons.lang3.text.StrMatcher getDelimiterMatcher() {
        return ((_returnReplacementOperatorHotSpot1533.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.delimMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterMatcher(final org.apache.commons.lang3.text.StrMatcher delim) {
        if (delim == null) {
            this.delimMatcher = org.apache.commons.lang3.text.StrMatcher.noneMatcher();
        } else {
            this.delimMatcher = delim;
        }
        return ((_returnReplacementOperatorHotSpot1549.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterChar(final char delim) {
        return ((_returnReplacementOperatorHotSpot1548.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(delim))));
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterString(final java.lang.String delim) {
        return ((_returnReplacementOperatorHotSpot1550.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(delim))));
    }

    public org.apache.commons.lang3.text.StrMatcher getQuoteMatcher() {
        return ((_returnReplacementOperatorHotSpot1535.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (quoteMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteMatcher(final org.apache.commons.lang3.text.StrMatcher quote) {
        if (quote != null) {
            this.quoteMatcher = quote;
        } 
        return ((_returnReplacementOperatorHotSpot1556.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteChar(final char quote) {
        return ((_returnReplacementOperatorHotSpot1555.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(quote))));
    }

    public org.apache.commons.lang3.text.StrMatcher getIgnoredMatcher() {
        return ((_returnReplacementOperatorHotSpot1534.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ignoredMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredMatcher(final org.apache.commons.lang3.text.StrMatcher ignored) {
        if (ignored != null) {
            this.ignoredMatcher = ignored;
        } 
        return ((_returnReplacementOperatorHotSpot1554.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredChar(final char ignored) {
        return ((_returnReplacementOperatorHotSpot1553.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(ignored))));
    }

    public org.apache.commons.lang3.text.StrMatcher getTrimmerMatcher() {
        return ((_returnReplacementOperatorHotSpot1536.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (trimmerMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setTrimmerMatcher(final org.apache.commons.lang3.text.StrMatcher trimmer) {
        if (trimmer != null) {
            this.trimmerMatcher = trimmer;
        } 
        return ((_returnReplacementOperatorHotSpot1557.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public boolean isEmptyTokenAsNull() {
        return ((_returnReplacementOperatorHotSpot1503.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.emptyAsNull));
    }

    public org.apache.commons.lang3.text.StrTokenizer setEmptyTokenAsNull(final boolean emptyAsNull) {
        this.emptyAsNull = emptyAsNull;
        return ((_returnReplacementOperatorHotSpot1551.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public boolean isIgnoreEmptyTokens() {
        return ((_returnReplacementOperatorHotSpot1504.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ignoreEmptyTokens));
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoreEmptyTokens(final boolean ignoreEmptyTokens) {
        this.ignoreEmptyTokens = ignoreEmptyTokens;
        return ((_returnReplacementOperatorHotSpot1552.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public java.lang.String getContent() {
        if ((chars) == null) {
            return ((_returnReplacementOperatorHotSpot1519.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot1520.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(chars)));
    }

    @java.lang.Override
    public java.lang.Object clone() {
        try {
            return ((_returnReplacementOperatorHotSpot1516.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (cloneReset()));
        } catch (final java.lang.CloneNotSupportedException ex) {
            return ((_returnReplacementOperatorHotSpot1517.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        }
    }

    java.lang.Object cloneReset() throws java.lang.CloneNotSupportedException {
        final org.apache.commons.lang3.text.StrTokenizer cloned = ((org.apache.commons.lang3.text.StrTokenizer)(super.clone()));
        if ((cloned.chars) != null) {
            cloned.chars = cloned.chars.clone();
        } 
        cloned.reset();
        return ((_returnReplacementOperatorHotSpot1518.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (cloned));
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((tokens) == null) {
            return ((_returnReplacementOperatorHotSpot1527.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ("StrTokenizer[not tokenized yet]"));
        } 
        return ((_returnReplacementOperatorHotSpot1528.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ("StrTokenizer" + (getTokenList())));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1501 = metamutator.Selector.of(1501,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1501");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1502 = metamutator.Selector.of(1502,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1502");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1503 = metamutator.Selector.of(1503,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1503");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1504 = metamutator.Selector.of(1504,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1504");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1505 = metamutator.Selector.of(1505,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1505");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1506 = metamutator.Selector.of(1506,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1506");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1507 = metamutator.Selector.of(1507,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1507");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1508 = metamutator.Selector.of(1508,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1508");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1509 = metamutator.Selector.of(1509,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1509");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1510 = metamutator.Selector.of(1510,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1510");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1511 = metamutator.Selector.of(1511,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1511");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1512 = metamutator.Selector.of(1512,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1512");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1513 = metamutator.Selector.of(1513,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1513");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1514 = metamutator.Selector.of(1514,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1514");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1515 = metamutator.Selector.of(1515,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1515");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1516 = metamutator.Selector.of(1516,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1516");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1517 = metamutator.Selector.of(1517,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1517");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1518 = metamutator.Selector.of(1518,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1518");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1519 = metamutator.Selector.of(1519,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1519");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1520 = metamutator.Selector.of(1520,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1520");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1521 = metamutator.Selector.of(1521,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1521");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1522 = metamutator.Selector.of(1522,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1522");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1523 = metamutator.Selector.of(1523,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1523");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1524 = metamutator.Selector.of(1524,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1524");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1525 = metamutator.Selector.of(1525,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1525");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1526 = metamutator.Selector.of(1526,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1526");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1527 = metamutator.Selector.of(1527,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1527");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1528 = metamutator.Selector.of(1528,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1528");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1529 = metamutator.Selector.of(1529,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1529");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1530 = metamutator.Selector.of(1530,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1530");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1531 = metamutator.Selector.of(1531,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1531");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1532 = metamutator.Selector.of(1532,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1532");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1533 = metamutator.Selector.of(1533,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1533");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1534 = metamutator.Selector.of(1534,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1534");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1535 = metamutator.Selector.of(1535,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1535");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1536 = metamutator.Selector.of(1536,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1536");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1537 = metamutator.Selector.of(1537,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1537");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1538 = metamutator.Selector.of(1538,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1538");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1539 = metamutator.Selector.of(1539,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1539");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1540 = metamutator.Selector.of(1540,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1540");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1541 = metamutator.Selector.of(1541,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1541");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1542 = metamutator.Selector.of(1542,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1542");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1543 = metamutator.Selector.of(1543,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1543");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1544 = metamutator.Selector.of(1544,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1544");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1545 = metamutator.Selector.of(1545,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1545");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1546 = metamutator.Selector.of(1546,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1546");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1547 = metamutator.Selector.of(1547,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1547");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1548 = metamutator.Selector.of(1548,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1548");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1549 = metamutator.Selector.of(1549,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1549");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1550 = metamutator.Selector.of(1550,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1550");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1551 = metamutator.Selector.of(1551,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1551");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1552 = metamutator.Selector.of(1552,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1552");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1553 = metamutator.Selector.of(1553,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1553");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1554 = metamutator.Selector.of(1554,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1554");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1555 = metamutator.Selector.of(1555,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1555");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1556 = metamutator.Selector.of(1556,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1556");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1557 = metamutator.Selector.of(1557,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperatorHotSpot1557");
}

