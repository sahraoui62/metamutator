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
        return ((_returnReplacementOperator1537.is("NULL")) ? ( null ) : (((org.apache.commons.lang3.text.StrTokenizer)(org.apache.commons.lang3.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.clone()))));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance() {
        return ((_returnReplacementOperator1538.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrTokenizer.getCSVClone()));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(final java.lang.String input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getCSVClone();
        tok.reset(input);
        return ((_returnReplacementOperator1540.is("NULL")) ? ( null ) : (tok));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(final char[] input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getCSVClone();
        tok.reset(input);
        return ((_returnReplacementOperator1539.is("NULL")) ? ( null ) : (tok));
    }

    private static org.apache.commons.lang3.text.StrTokenizer getTSVClone() {
        return ((_returnReplacementOperator1541.is("NULL")) ? ( null ) : (((org.apache.commons.lang3.text.StrTokenizer)(org.apache.commons.lang3.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.clone()))));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance() {
        return ((_returnReplacementOperator1542.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrTokenizer.getTSVClone()));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(final java.lang.String input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getTSVClone();
        tok.reset(input);
        return ((_returnReplacementOperator1544.is("NULL")) ? ( null ) : (tok));
    }

    public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(final char[] input) {
        final org.apache.commons.lang3.text.StrTokenizer tok = org.apache.commons.lang3.text.StrTokenizer.getTSVClone();
        tok.reset(input);
        return ((_returnReplacementOperator1543.is("NULL")) ? ( null ) : (tok));
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
        return ((_returnReplacementOperator1515.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1515.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1515.is("ZERO")) ? ( 0 ) : (tokens.length));
    }

    public java.lang.String nextToken() {
        if (hasNext()) {
            return ((_returnReplacementOperator1522.is("NULL")) ? ( null ) : (tokens[(tokenPos)++]));
        } 
        return ((_returnReplacementOperator1523.is("NULL")) ? ( null ) : (null));
    }

    public java.lang.String previousToken() {
        if (hasPrevious()) {
            return ((_returnReplacementOperator1525.is("NULL")) ? ( null ) : (tokens[--(tokenPos)]));
        } 
        return ((_returnReplacementOperator1526.is("NULL")) ? ( null ) : (null));
    }

    public java.lang.String[] getTokenArray() {
        checkTokenized();
        return ((_returnReplacementOperator1529.is("NULL")) ? ( null ) : (tokens.clone()));
    }

    public java.util.List<java.lang.String> getTokenList() {
        checkTokenized();
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(tokens.length);
        for (final java.lang.String element : tokens) {
            list.add(element);
        }
        return ((_returnReplacementOperator1530.is("NULL")) ? ( null ) : (list));
    }

    public org.apache.commons.lang3.text.StrTokenizer reset() {
        tokenPos = 0;
        tokens = null;
        return ((_returnReplacementOperator1545.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(final java.lang.String input) {
        reset();
        if (input != null) {
            this.chars = input.toCharArray();
        } else {
            this.chars = null;
        }
        return ((_returnReplacementOperator1547.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer reset(final char[] input) {
        reset();
        this.chars = org.apache.commons.lang3.ArrayUtils.clone(input);
        return ((_returnReplacementOperator1546.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public boolean hasNext() {
        checkTokenized();
        return ((_returnReplacementOperator1501.is("NULL")) ? ( null ) : ((tokenPos) < (tokens.length)));
    }

    @java.lang.Override
    public java.lang.String next() {
        if (hasNext()) {
            return ((_returnReplacementOperator1521.is("NULL")) ? ( null ) : (tokens[(tokenPos)++]));
        } 
        throw new java.util.NoSuchElementException();
    }

    @java.lang.Override
    public int nextIndex() {
        return ((_returnReplacementOperator1507.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1507.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1507.is("ZERO")) ? ( 0 ) : (tokenPos));
    }

    @java.lang.Override
    public boolean hasPrevious() {
        checkTokenized();
        return ((_returnReplacementOperator1502.is("NULL")) ? ( null ) : ((tokenPos) > 0));
    }

    @java.lang.Override
    public java.lang.String previous() {
        if (hasPrevious()) {
            return ((_returnReplacementOperator1524.is("NULL")) ? ( null ) : (tokens[--(tokenPos)]));
        } 
        throw new java.util.NoSuchElementException();
    }

    @java.lang.Override
    public int previousIndex() {
        return ((_returnReplacementOperator1508.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1508.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1508.is("ZERO")) ? ( 0 ) : ((tokenPos) - 1));
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
            return ((_returnReplacementOperator1531.is("NULL")) ? ( null ) : (java.util.Collections.emptyList()));
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
        return ((_returnReplacementOperator1532.is("NULL")) ? ( null ) : (tokenList));
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
            return ((_returnReplacementOperator1509.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1509.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1509.is("ZERO")) ? ( 0 ) : (-1));
        } 
        final int delimLen = getDelimiterMatcher().isMatch(srcChars, start, start, len);
        if (delimLen > 0) {
            addToken(tokenList, "");
            return ((_returnReplacementOperator1510.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1510.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1510.is("ZERO")) ? ( 0 ) : (start + delimLen));
        } 
        final int quoteLen = getQuoteMatcher().isMatch(srcChars, start, start, len);
        if (quoteLen > 0) {
            return ((_returnReplacementOperator1511.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1511.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1511.is("ZERO")) ? ( 0 ) : (readWithQuotes(srcChars, (start + quoteLen), len, workArea, tokenList, start, quoteLen)));
        } 
        return ((_returnReplacementOperator1512.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1512.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1512.is("ZERO")) ? ( 0 ) : (readWithQuotes(srcChars, start, len, workArea, tokenList, 0, 0)));
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
                    return ((_returnReplacementOperator1513.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1513.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1513.is("ZERO")) ? ( 0 ) : (pos + delimLen));
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
        return ((_returnReplacementOperator1514.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1514.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1514.is("ZERO")) ? ( 0 ) : (-1));
    }

    private boolean isQuote(final char[] srcChars, final int pos, final int len, final int quoteStart, final int quoteLen) {
        for (int i = 0 ; i < quoteLen ; i++) {
            if (((pos + i) >= len) || ((srcChars[(pos + i)]) != (srcChars[(quoteStart + i)]))) {
                return ((_returnReplacementOperator1505.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1506.is("NULL")) ? ( null ) : (true));
    }

    public org.apache.commons.lang3.text.StrMatcher getDelimiterMatcher() {
        return ((_returnReplacementOperator1533.is("NULL")) ? ( null ) : (this.delimMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterMatcher(final org.apache.commons.lang3.text.StrMatcher delim) {
        if (delim == null) {
            this.delimMatcher = org.apache.commons.lang3.text.StrMatcher.noneMatcher();
        } else {
            this.delimMatcher = delim;
        }
        return ((_returnReplacementOperator1549.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterChar(final char delim) {
        return ((_returnReplacementOperator1548.is("NULL")) ? ( null ) : (setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(delim))));
    }

    public org.apache.commons.lang3.text.StrTokenizer setDelimiterString(final java.lang.String delim) {
        return ((_returnReplacementOperator1550.is("NULL")) ? ( null ) : (setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher.stringMatcher(delim))));
    }

    public org.apache.commons.lang3.text.StrMatcher getQuoteMatcher() {
        return ((_returnReplacementOperator1535.is("NULL")) ? ( null ) : (quoteMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteMatcher(final org.apache.commons.lang3.text.StrMatcher quote) {
        if (quote != null) {
            this.quoteMatcher = quote;
        } 
        return ((_returnReplacementOperator1556.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer setQuoteChar(final char quote) {
        return ((_returnReplacementOperator1555.is("NULL")) ? ( null ) : (setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(quote))));
    }

    public org.apache.commons.lang3.text.StrMatcher getIgnoredMatcher() {
        return ((_returnReplacementOperator1534.is("NULL")) ? ( null ) : (ignoredMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredMatcher(final org.apache.commons.lang3.text.StrMatcher ignored) {
        if (ignored != null) {
            this.ignoredMatcher = ignored;
        } 
        return ((_returnReplacementOperator1554.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoredChar(final char ignored) {
        return ((_returnReplacementOperator1553.is("NULL")) ? ( null ) : (setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher.charMatcher(ignored))));
    }

    public org.apache.commons.lang3.text.StrMatcher getTrimmerMatcher() {
        return ((_returnReplacementOperator1536.is("NULL")) ? ( null ) : (trimmerMatcher));
    }

    public org.apache.commons.lang3.text.StrTokenizer setTrimmerMatcher(final org.apache.commons.lang3.text.StrMatcher trimmer) {
        if (trimmer != null) {
            this.trimmerMatcher = trimmer;
        } 
        return ((_returnReplacementOperator1557.is("NULL")) ? ( null ) : (this));
    }

    public boolean isEmptyTokenAsNull() {
        return ((_returnReplacementOperator1503.is("NULL")) ? ( null ) : (this.emptyAsNull));
    }

    public org.apache.commons.lang3.text.StrTokenizer setEmptyTokenAsNull(final boolean emptyAsNull) {
        this.emptyAsNull = emptyAsNull;
        return ((_returnReplacementOperator1551.is("NULL")) ? ( null ) : (this));
    }

    public boolean isIgnoreEmptyTokens() {
        return ((_returnReplacementOperator1504.is("NULL")) ? ( null ) : (ignoreEmptyTokens));
    }

    public org.apache.commons.lang3.text.StrTokenizer setIgnoreEmptyTokens(final boolean ignoreEmptyTokens) {
        this.ignoreEmptyTokens = ignoreEmptyTokens;
        return ((_returnReplacementOperator1552.is("NULL")) ? ( null ) : (this));
    }

    public java.lang.String getContent() {
        if ((chars) == null) {
            return ((_returnReplacementOperator1519.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator1520.is("NULL")) ? ( null ) : (new java.lang.String(chars)));
    }

    @java.lang.Override
    public java.lang.Object clone() {
        try {
            return ((_returnReplacementOperator1516.is("NULL")) ? ( null ) : (cloneReset()));
        } catch (final java.lang.CloneNotSupportedException ex) {
            return ((_returnReplacementOperator1517.is("NULL")) ? ( null ) : (null));
        }
    }

    java.lang.Object cloneReset() throws java.lang.CloneNotSupportedException {
        final org.apache.commons.lang3.text.StrTokenizer cloned = ((org.apache.commons.lang3.text.StrTokenizer)(super.clone()));
        if ((cloned.chars) != null) {
            cloned.chars = cloned.chars.clone();
        } 
        cloned.reset();
        return ((_returnReplacementOperator1518.is("NULL")) ? ( null ) : (cloned));
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((tokens) == null) {
            return ((_returnReplacementOperator1527.is("NULL")) ? ( null ) : ("StrTokenizer[not tokenized yet]"));
        } 
        return ((_returnReplacementOperator1528.is("NULL")) ? ( null ) : ("StrTokenizer" + (getTokenList())));
    }

    private static final metamutator.Selector _returnReplacementOperator1501 = metamutator.Selector.of(1501,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1501");

    private static final metamutator.Selector _returnReplacementOperator1502 = metamutator.Selector.of(1502,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1502");

    private static final metamutator.Selector _returnReplacementOperator1503 = metamutator.Selector.of(1503,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1503");

    private static final metamutator.Selector _returnReplacementOperator1504 = metamutator.Selector.of(1504,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1504");

    private static final metamutator.Selector _returnReplacementOperator1505 = metamutator.Selector.of(1505,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1505");

    private static final metamutator.Selector _returnReplacementOperator1506 = metamutator.Selector.of(1506,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1506");

    private static final metamutator.Selector _returnReplacementOperator1507 = metamutator.Selector.of(1507,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1507");

    private static final metamutator.Selector _returnReplacementOperator1508 = metamutator.Selector.of(1508,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1508");

    private static final metamutator.Selector _returnReplacementOperator1509 = metamutator.Selector.of(1509,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1509");

    private static final metamutator.Selector _returnReplacementOperator1510 = metamutator.Selector.of(1510,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1510");

    private static final metamutator.Selector _returnReplacementOperator1511 = metamutator.Selector.of(1511,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1511");

    private static final metamutator.Selector _returnReplacementOperator1512 = metamutator.Selector.of(1512,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1512");

    private static final metamutator.Selector _returnReplacementOperator1513 = metamutator.Selector.of(1513,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1513");

    private static final metamutator.Selector _returnReplacementOperator1514 = metamutator.Selector.of(1514,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1514");

    private static final metamutator.Selector _returnReplacementOperator1515 = metamutator.Selector.of(1515,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1515");

    private static final metamutator.Selector _returnReplacementOperator1516 = metamutator.Selector.of(1516,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1516");

    private static final metamutator.Selector _returnReplacementOperator1517 = metamutator.Selector.of(1517,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1517");

    private static final metamutator.Selector _returnReplacementOperator1518 = metamutator.Selector.of(1518,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1518");

    private static final metamutator.Selector _returnReplacementOperator1519 = metamutator.Selector.of(1519,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1519");

    private static final metamutator.Selector _returnReplacementOperator1520 = metamutator.Selector.of(1520,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1520");

    private static final metamutator.Selector _returnReplacementOperator1521 = metamutator.Selector.of(1521,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1521");

    private static final metamutator.Selector _returnReplacementOperator1522 = metamutator.Selector.of(1522,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1522");

    private static final metamutator.Selector _returnReplacementOperator1523 = metamutator.Selector.of(1523,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1523");

    private static final metamutator.Selector _returnReplacementOperator1524 = metamutator.Selector.of(1524,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1524");

    private static final metamutator.Selector _returnReplacementOperator1525 = metamutator.Selector.of(1525,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1525");

    private static final metamutator.Selector _returnReplacementOperator1526 = metamutator.Selector.of(1526,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1526");

    private static final metamutator.Selector _returnReplacementOperator1527 = metamutator.Selector.of(1527,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1527");

    private static final metamutator.Selector _returnReplacementOperator1528 = metamutator.Selector.of(1528,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1528");

    private static final metamutator.Selector _returnReplacementOperator1529 = metamutator.Selector.of(1529,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1529");

    private static final metamutator.Selector _returnReplacementOperator1530 = metamutator.Selector.of(1530,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1530");

    private static final metamutator.Selector _returnReplacementOperator1531 = metamutator.Selector.of(1531,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1531");

    private static final metamutator.Selector _returnReplacementOperator1532 = metamutator.Selector.of(1532,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1532");

    private static final metamutator.Selector _returnReplacementOperator1533 = metamutator.Selector.of(1533,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1533");

    private static final metamutator.Selector _returnReplacementOperator1534 = metamutator.Selector.of(1534,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1534");

    private static final metamutator.Selector _returnReplacementOperator1535 = metamutator.Selector.of(1535,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1535");

    private static final metamutator.Selector _returnReplacementOperator1536 = metamutator.Selector.of(1536,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1536");

    private static final metamutator.Selector _returnReplacementOperator1537 = metamutator.Selector.of(1537,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1537");

    private static final metamutator.Selector _returnReplacementOperator1538 = metamutator.Selector.of(1538,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1538");

    private static final metamutator.Selector _returnReplacementOperator1539 = metamutator.Selector.of(1539,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1539");

    private static final metamutator.Selector _returnReplacementOperator1540 = metamutator.Selector.of(1540,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1540");

    private static final metamutator.Selector _returnReplacementOperator1541 = metamutator.Selector.of(1541,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1541");

    private static final metamutator.Selector _returnReplacementOperator1542 = metamutator.Selector.of(1542,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1542");

    private static final metamutator.Selector _returnReplacementOperator1543 = metamutator.Selector.of(1543,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1543");

    private static final metamutator.Selector _returnReplacementOperator1544 = metamutator.Selector.of(1544,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1544");

    private static final metamutator.Selector _returnReplacementOperator1545 = metamutator.Selector.of(1545,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1545");

    private static final metamutator.Selector _returnReplacementOperator1546 = metamutator.Selector.of(1546,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1546");

    private static final metamutator.Selector _returnReplacementOperator1547 = metamutator.Selector.of(1547,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1547");

    private static final metamutator.Selector _returnReplacementOperator1548 = metamutator.Selector.of(1548,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1548");

    private static final metamutator.Selector _returnReplacementOperator1549 = metamutator.Selector.of(1549,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1549");

    private static final metamutator.Selector _returnReplacementOperator1550 = metamutator.Selector.of(1550,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1550");

    private static final metamutator.Selector _returnReplacementOperator1551 = metamutator.Selector.of(1551,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1551");

    private static final metamutator.Selector _returnReplacementOperator1552 = metamutator.Selector.of(1552,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1552");

    private static final metamutator.Selector _returnReplacementOperator1553 = metamutator.Selector.of(1553,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1553");

    private static final metamutator.Selector _returnReplacementOperator1554 = metamutator.Selector.of(1554,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1554");

    private static final metamutator.Selector _returnReplacementOperator1555 = metamutator.Selector.of(1555,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1555");

    private static final metamutator.Selector _returnReplacementOperator1556 = metamutator.Selector.of(1556,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1556");

    private static final metamutator.Selector _returnReplacementOperator1557 = metamutator.Selector.of(1557,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrTokenizer.class).id("_returnReplacementOperator1557");
}

