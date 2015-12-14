package org.jsoup.parser;


final class Tokeniser {
    static final char replacementChar = '\ufffd';

    private static final char[] notCharRefCharsSorted = new char[]{ '\t' , '\n' , '\r' , '\f' , ' ' , '<' , '&' };

    static {
        java.util.Arrays.sort(notCharRefCharsSorted);
    }

    private org.jsoup.parser.CharacterReader reader;

    private org.jsoup.parser.ParseErrorList errors;

    private org.jsoup.parser.TokeniserState state = org.jsoup.parser.TokeniserState.Data;

    private org.jsoup.parser.Token emitPending;

    private boolean isEmitPending = false;

    private java.lang.String charsString = null;

    private java.lang.StringBuilder charsBuilder = new java.lang.StringBuilder(1024);

    java.lang.StringBuilder dataBuffer = new java.lang.StringBuilder(1024);

    org.jsoup.parser.Token.Tag tagPending;

    org.jsoup.parser.Token.StartTag startPending = new org.jsoup.parser.Token.StartTag();

    org.jsoup.parser.Token.EndTag endPending = new org.jsoup.parser.Token.EndTag();

    org.jsoup.parser.Token.Character charPending = new org.jsoup.parser.Token.Character();

    org.jsoup.parser.Token.Doctype doctypePending = new org.jsoup.parser.Token.Doctype();

    org.jsoup.parser.Token.Comment commentPending = new org.jsoup.parser.Token.Comment();

    private java.lang.String lastStartTag;

    private boolean selfClosingFlagAcknowledged = true;

    Tokeniser(org.jsoup.parser.CharacterReader reader ,org.jsoup.parser.ParseErrorList errors) {
        this.reader = reader;
        this.errors = errors;
    }

    org.jsoup.parser.Token read() {
        if (!(selfClosingFlagAcknowledged)) {
            error("Self closing flag not acknowledged");
            selfClosingFlagAcknowledged = true;
        } 
        while (!(isEmitPending))
            state.read(this, reader);
        if ((charsBuilder.length()) > 0) {
            java.lang.String str = charsBuilder.toString();
            charsBuilder.delete(0, charsBuilder.length());
            charsString = null;
            return charPending.data(str);
        } else if ((charsString) != null) {
            org.jsoup.parser.Token token = charPending.data(charsString);
            charsString = null;
            return token;
        } else {
            isEmitPending = false;
            return emitPending;
        }
    }

    void emit(org.jsoup.parser.Token token) {
        org.jsoup.helper.Validate.isFalse(isEmitPending, "There is an unread token pending!");
        emitPending = token;
        isEmitPending = true;
        if ((token.type) == (org.jsoup.parser.Token.TokenType.StartTag)) {
            org.jsoup.parser.Token.StartTag startTag = ((org.jsoup.parser.Token.StartTag)(token));
            lastStartTag = startTag.tagName;
            if (startTag.selfClosing)
                selfClosingFlagAcknowledged = false;
            
        } else if ((token.type) == (org.jsoup.parser.Token.TokenType.EndTag)) {
            org.jsoup.parser.Token.EndTag endTag = ((org.jsoup.parser.Token.EndTag)(token));
            if ((endTag.attributes) != null)
                error("Attributes incorrectly present on end tag");
            
        } 
    }

    void emit(final java.lang.String str) {
        if ((charsString) == null) {
            charsString = str;
        } else {
            if ((charsBuilder.length()) == 0) {
                charsBuilder.append(charsString);
            } 
            charsBuilder.append(str);
        }
    }

    void emit(char[] chars) {
        emit(java.lang.String.valueOf(chars));
    }

    void emit(char c) {
        emit(java.lang.String.valueOf(c));
    }

    org.jsoup.parser.TokeniserState getState() {
        return state;
    }

    void transition(org.jsoup.parser.TokeniserState state) {
        this.state = state;
    }

    void advanceTransition(org.jsoup.parser.TokeniserState state) {
        reader.advance();
        this.state = state;
    }

    void acknowledgeSelfClosingFlag() {
        selfClosingFlagAcknowledged = true;
    }

    private final char[] charRefHolder = new char[1];

    char[] consumeCharacterReference(java.lang.Character additionalAllowedCharacter, boolean inAttribute) {
        if (reader.isEmpty())
            return null;
        
        if ((additionalAllowedCharacter != null) && (additionalAllowedCharacter == (reader.current())))
            return null;
        
        if (reader.matchesAnySorted(notCharRefCharsSorted))
            return null;
        
        final char[] charRef = charRefHolder;
        reader.mark();
        if (reader.matchConsume("#")) {
            boolean isHexMode = reader.matchConsumeIgnoreCase("X");
            java.lang.String numRef = isHexMode ? reader.consumeHexSequence() : reader.consumeDigitSequence();
            if ((numRef.length()) == 0) {
                characterReferenceError("numeric reference with no numerals");
                reader.rewindToMark();
                return null;
            } 
            if (!(reader.matchConsume(";")))
                characterReferenceError("missing semicolon");
            
            int charval = (_constantOperatorMetaMutator106.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator106.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator106.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(-1))));
            try {
                int base = (_constantOperatorMetaMutator105.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator105.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator105.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(isHexMode ? 16 : 10))));
                charval = java.lang.Integer.valueOf(numRef, base);
            } catch (java.lang.NumberFormatException e) {
            }
            if (((charval == (-1)) || ((charval >= 55296) && (charval <= 57343))) || (charval > 1114111)) {
                characterReferenceError("character outside of valid range");
                charRef[0] = replacementChar;
                return charRef;
            } else {
                if (charval < (java.lang.Character.MIN_SUPPLEMENTARY_CODE_POINT)) {
                    charRef[0] = ((char)(charval));
                    return charRef;
                } else
                    return java.lang.Character.toChars(charval);
                
            }
        } else {
            java.lang.String nameRef = reader.consumeLetterThenDigitSequence();
            boolean looksLegit = reader.matches(';');
            boolean found = (org.jsoup.nodes.Entities.isBaseNamedEntity(nameRef)) || ((org.jsoup.nodes.Entities.isNamedEntity(nameRef)) && looksLegit);
            if (!found) {
                reader.rewindToMark();
                if (looksLegit)
                    characterReferenceError(java.lang.String.format("invalid named referenece '%s'", nameRef));
                
                return null;
            } 
            if (inAttribute && (((reader.matchesLetter()) || (reader.matchesDigit())) || (reader.matchesAny('=', '-', '_')))) {
                reader.rewindToMark();
                return null;
            } 
            if (!(reader.matchConsume(";")))
                characterReferenceError("missing semicolon");
            
            charRef[0] = org.jsoup.nodes.Entities.getCharacterByName(nameRef);
            return charRef;
        }
    }

    org.jsoup.parser.Token.Tag createTagPending(boolean start) {
        tagPending = start ? startPending.reset() : endPending.reset();
        return tagPending;
    }

    void emitTagPending() {
        tagPending.finaliseTag();
        emit(tagPending);
    }

    void createCommentPending() {
        commentPending.reset();
    }

    void emitCommentPending() {
        emit(commentPending);
    }

    void createDoctypePending() {
        doctypePending.reset();
    }

    void emitDoctypePending() {
        emit(doctypePending);
    }

    void createTempBuffer() {
        org.jsoup.parser.Token.reset(dataBuffer);
    }

    boolean isAppropriateEndTagToken() {
        return ((lastStartTag) != null) && (tagPending.tagName.equals(lastStartTag));
    }

    java.lang.String appropriateEndTagName() {
        if ((lastStartTag) == null)
            return null;
        
        return lastStartTag;
    }

    void error(org.jsoup.parser.TokeniserState state) {
        if (errors.canAddError())
            errors.add(new org.jsoup.parser.ParseError(reader.pos() , "Unexpected character '%s' in input state [%s]" , reader.current() , state));
        
    }

    void eofError(org.jsoup.parser.TokeniserState state) {
        if (errors.canAddError())
            errors.add(new org.jsoup.parser.ParseError(reader.pos() , "Unexpectedly reached end of file (EOF) in input state [%s]" , state));
        
    }

    private void characterReferenceError(java.lang.String message) {
        if (errors.canAddError())
            errors.add(new org.jsoup.parser.ParseError(reader.pos() , "Invalid character reference: %s" , message));
        
    }

    private void error(java.lang.String errorMsg) {
        if (errors.canAddError())
            errors.add(new org.jsoup.parser.ParseError(reader.pos() , errorMsg));
        
    }

    boolean currentNodeInHtmlNS() {
        return true;
    }

    java.lang.String unescapeEntities(boolean inAttribute) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        while (!(reader.isEmpty())) {
            builder.append(reader.consumeTo('&'));
            if (reader.matches('&')) {
                reader.consume();
                char[] c = consumeCharacterReference(null, inAttribute);
                if ((c == null) || ((c.length) == 0))
                    builder.append('&');
                else
                    builder.append(c);
                
            } 
        }
        return builder.toString();
    }

    private static final metamutator.Selector _constantOperatorMetaMutator105 = metamutator.Selector.of(105,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.Tokeniser.class).id("_constantOperatorMetaMutator105");

    private static final metamutator.Selector _constantOperatorMetaMutator106 = metamutator.Selector.of(106,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.Tokeniser.class).id("_constantOperatorMetaMutator106");
}

