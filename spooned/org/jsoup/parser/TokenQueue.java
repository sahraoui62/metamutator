package org.jsoup.parser;


public class TokenQueue {
    private java.lang.String queue;

    private int pos = (_constantOperatorMetaMutator91.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator91.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator91.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0))));

    private static final char ESC = '\\';

    public TokenQueue(java.lang.String data) {
        org.jsoup.helper.Validate.notNull(data);
        queue = data;
    }

    public boolean isEmpty() {
        return (remainingLength()) == 0;
    }

    private int remainingLength() {
        return (queue.length()) - (pos);
    }

    public char peek() {
        return isEmpty() ? 0 : queue.charAt(pos);
    }

    public void addFirst(java.lang.Character c) {
        addFirst(c.toString());
    }

    public void addFirst(java.lang.String seq) {
        queue = seq + (queue.substring(pos));
        pos = 0;
    }

    public boolean matches(java.lang.String seq) {
        return queue.regionMatches(true, pos, seq, 0, seq.length());
    }

    public boolean matchesCS(java.lang.String seq) {
        return queue.startsWith(seq, pos);
    }

    public boolean matchesAny(java.lang.String... seq) {
        for (java.lang.String s : seq) {
            if (matches(s))
                return true;
            
        }
        return false;
    }

    public boolean matchesAny(char... seq) {
        if (isEmpty())
            return false;
        
        for (char c : seq) {
            if ((queue.charAt(pos)) == c)
                return true;
            
        }
        return false;
    }

    public boolean matchesStartTag() {
        return (((remainingLength()) >= 2) && ((queue.charAt(pos)) == '<')) && (java.lang.Character.isLetter(queue.charAt(((pos) + 1))));
    }

    public boolean matchChomp(java.lang.String seq) {
        if (matches(seq)) {
            pos += seq.length();
            return true;
        } else {
            return false;
        }
    }

    public boolean matchesWhitespace() {
        return (!(isEmpty())) && (org.jsoup.helper.StringUtil.isWhitespace(queue.charAt(pos)));
    }

    public boolean matchesWord() {
        return (!(isEmpty())) && (java.lang.Character.isLetterOrDigit(queue.charAt(pos)));
    }

    public void advance() {
        if (!(isEmpty()))
            (pos)++;
        
    }

    public char consume() {
        return queue.charAt((pos)++);
    }

    public void consume(java.lang.String seq) {
        if (!(matches(seq)))
            throw new java.lang.IllegalStateException("Queue did not match expected sequence");
        
        int len = (_constantOperatorMetaMutator104.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator104.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator104.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(seq.length()))));
        if (len > (remainingLength()))
            throw new java.lang.IllegalStateException("Queue not long enough to consume sequence");
        
        pos += len;
    }

    public java.lang.String consumeTo(java.lang.String seq) {
        int offset = (_constantOperatorMetaMutator99.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator99.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator99.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(queue.indexOf(seq, pos)))));
        if (offset != (-1)) {
            java.lang.String consumed = queue.substring(pos, offset);
            pos += consumed.length();
            return consumed;
        } else {
            return remainder();
        }
    }

    public java.lang.String consumeToIgnoreCase(java.lang.String seq) {
        int start = (_constantOperatorMetaMutator102.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator102.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator102.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        java.lang.String first = seq.substring(0, 1);
        boolean canScan = first.toLowerCase().equals(first.toUpperCase());
        while (!(isEmpty())) {
            if (matches(seq))
                break;
            
            if (canScan) {
                int skip = (_constantOperatorMetaMutator101.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator101.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator101.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):((queue.indexOf(first, pos)) - (pos)))));
                if (skip == 0)
                    (pos)++;
                else if (skip < 0)
                    pos = queue.length();
                else
                    pos += skip;
                
            } else
                (pos)++;
            
        }
        return queue.substring(start, pos);
    }

    public java.lang.String consumeToAny(java.lang.String... seq) {
        int start = (_constantOperatorMetaMutator100.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator100.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator100.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        while ((!(isEmpty())) && (!(matchesAny(seq)))) {
            (pos)++;
        }
        return queue.substring(start, pos);
    }

    public java.lang.String chompTo(java.lang.String seq) {
        java.lang.String data = consumeTo(seq);
        matchChomp(seq);
        return data;
    }

    public java.lang.String chompToIgnoreCase(java.lang.String seq) {
        java.lang.String data = consumeToIgnoreCase(seq);
        matchChomp(seq);
        return data;
    }

    public java.lang.String chompBalanced(char open, char close) {
        int start = (_constantOperatorMetaMutator93.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator93.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator93.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(-1))));
        int end = (_constantOperatorMetaMutator94.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator94.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator94.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(-1))));
        int depth = (_constantOperatorMetaMutator92.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator92.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator92.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0))));
        char last = 0;
        do {
            if (isEmpty())
                break;
            
            java.lang.Character c = consume();
            if ((last == 0) || (last != (ESC))) {
                if (c.equals(open)) {
                    depth++;
                    if (start == (-1))
                        start = pos;
                    
                } else if (c.equals(close))
                    depth--;
                
            } 
            if ((depth > 0) && (last != 0))
                end = pos;
            
            last = c;
        } while (depth > 0 );
        return end >= 0 ? queue.substring(start, end) : "";
    }

    public static java.lang.String unescape(java.lang.String in) {
        java.lang.StringBuilder out = new java.lang.StringBuilder();
        char last = 0;
        for (char c : in.toCharArray()) {
            if (c == (ESC)) {
                if ((last != 0) && (last == (ESC)))
                    out.append(c);
                
            } else
                out.append(c);
            
            last = c;
        }
        return out.toString();
    }

    public boolean consumeWhitespace() {
        boolean seen = false;
        while (matchesWhitespace()) {
            (pos)++;
            seen = true;
        }
        return seen;
    }

    public java.lang.String consumeWord() {
        int start = (_constantOperatorMetaMutator103.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator103.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator103.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        while (matchesWord())
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeTagName() {
        int start = (_constantOperatorMetaMutator98.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator98.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator98.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny(':', '_', '-'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeElementSelector() {
        int start = (_constantOperatorMetaMutator97.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator97.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator97.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny('|', '_', '-'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeCssIdentifier() {
        int start = (_constantOperatorMetaMutator96.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator96.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator96.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny('-', '_'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeAttributeKey() {
        int start = (_constantOperatorMetaMutator95.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator95.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator95.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny('-', '_', ':'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String remainder() {
        final java.lang.String remainder = queue.substring(pos, queue.length());
        pos = queue.length();
        return remainder;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return queue.substring(pos);
    }

    private static final metamutator.Selector _constantOperatorMetaMutator91 = metamutator.Selector.of(91,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator91");

    private static final metamutator.Selector _constantOperatorMetaMutator92 = metamutator.Selector.of(92,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator92");

    private static final metamutator.Selector _constantOperatorMetaMutator93 = metamutator.Selector.of(93,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator93");

    private static final metamutator.Selector _constantOperatorMetaMutator94 = metamutator.Selector.of(94,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator94");

    private static final metamutator.Selector _constantOperatorMetaMutator95 = metamutator.Selector.of(95,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator95");

    private static final metamutator.Selector _constantOperatorMetaMutator96 = metamutator.Selector.of(96,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator96");

    private static final metamutator.Selector _constantOperatorMetaMutator97 = metamutator.Selector.of(97,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator97");

    private static final metamutator.Selector _constantOperatorMetaMutator98 = metamutator.Selector.of(98,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator98");

    private static final metamutator.Selector _constantOperatorMetaMutator99 = metamutator.Selector.of(99,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator99");

    private static final metamutator.Selector _constantOperatorMetaMutator100 = metamutator.Selector.of(100,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator100");

    private static final metamutator.Selector _constantOperatorMetaMutator101 = metamutator.Selector.of(101,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator101");

    private static final metamutator.Selector _constantOperatorMetaMutator102 = metamutator.Selector.of(102,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator102");

    private static final metamutator.Selector _constantOperatorMetaMutator103 = metamutator.Selector.of(103,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator103");

    private static final metamutator.Selector _constantOperatorMetaMutator104 = metamutator.Selector.of(104,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.TokenQueue.class).id("_constantOperatorMetaMutator104");
}

