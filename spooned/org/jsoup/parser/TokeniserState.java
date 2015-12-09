package org.jsoup.parser;


enum TokeniserState {
Data {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            switch (r.current()) {
                case '&' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.CharacterReferenceInData);
                    break;
                case '<' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.TagOpen);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.emit(r.consume());
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.emit(new org.jsoup.parser.Token.EOF());
                    break;
                default :
                    java.lang.String data = r.consumeData();
                    t.emit(data);
                    break;
            }
        }
    }, CharacterReferenceInData {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char[] c = t.consumeCharacterReference(null, false);
            if (c == null)
                t.emit('&');
            else
                t.emit(c);
            
            t.transition(org.jsoup.parser.TokeniserState.Data);
        }
    }, Rcdata {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            switch (r.current()) {
                case '&' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata);
                    break;
                case '<' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.RcdataLessthanSign);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    r.advance();
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.emit(new org.jsoup.parser.Token.EOF());
                    break;
                default :
                    java.lang.String data = r.consumeToAny('&', '<', org.jsoup.parser.TokeniserState.nullChar);
                    t.emit(data);
                    break;
            }
        }
    }, CharacterReferenceInRcdata {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char[] c = t.consumeCharacterReference(null, false);
            if (c == null)
                t.emit('&');
            else
                t.emit(c);
            
            t.transition(org.jsoup.parser.TokeniserState.Rcdata);
        }
    }, Rawtext {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            switch (r.current()) {
                case '<' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.RawtextLessthanSign);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    r.advance();
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.emit(new org.jsoup.parser.Token.EOF());
                    break;
                default :
                    java.lang.String data = r.consumeToAny('<', org.jsoup.parser.TokeniserState.nullChar);
                    t.emit(data);
                    break;
            }
        }
    }, ScriptData {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            switch (r.current()) {
                case '<' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataLessthanSign);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    r.advance();
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.emit(new org.jsoup.parser.Token.EOF());
                    break;
                default :
                    java.lang.String data = r.consumeToAny('<', org.jsoup.parser.TokeniserState.nullChar);
                    t.emit(data);
                    break;
            }
        }
    }, PLAINTEXT {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            switch (r.current()) {
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    r.advance();
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.emit(new org.jsoup.parser.Token.EOF());
                    break;
                default :
                    java.lang.String data = r.consumeTo(org.jsoup.parser.TokeniserState.nullChar);
                    t.emit(data);
                    break;
            }
        }
    }, TagOpen {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            switch (r.current()) {
                case '!' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.MarkupDeclarationOpen);
                    break;
                case '/' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.EndTagOpen);
                    break;
                case '?' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.BogusComment);
                    break;
                default :
                    if (r.matchesLetter()) {
                        t.createTagPending(true);
                        t.transition(org.jsoup.parser.TokeniserState.TagName);
                    } else {
                        t.error(this);
                        t.emit('<');
                        t.transition(org.jsoup.parser.TokeniserState.Data);
                    }
                    break;
            }
        }
    }, EndTagOpen {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.isEmpty()) {
                t.eofError(this);
                t.emit("</");
                t.transition(org.jsoup.parser.TokeniserState.Data);
            } else if (r.matchesLetter()) {
                t.createTagPending(false);
                t.transition(org.jsoup.parser.TokeniserState.TagName);
            } else if (r.matches('>')) {
                t.error(this);
                t.advanceTransition(org.jsoup.parser.TokeniserState.Data);
            } else {
                t.error(this);
                t.advanceTransition(org.jsoup.parser.TokeniserState.BogusComment);
            }
        }
    }, TagName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            java.lang.String tagName = r.consumeTagName().toLowerCase();
            t.tagPending.appendTagName(tagName);
            switch (r.consume()) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeName);
                    break;
                case '/' :
                    t.transition(org.jsoup.parser.TokeniserState.SelfClosingStartTag);
                    break;
                case '>' :
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.tagPending.appendTagName(org.jsoup.parser.TokeniserState.replacementStr);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
            }
        }
    }, RcdataLessthanSign {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matches('/')) {
                t.createTempBuffer();
                t.advanceTransition(org.jsoup.parser.TokeniserState.RCDATAEndTagOpen);
            } else if (((r.matchesLetter()) && ((t.appropriateEndTagName()) != null)) && (!(r.containsIgnoreCase(("</" + (t.appropriateEndTagName())))))) {
                t.tagPending = t.createTagPending(false).name(t.appropriateEndTagName());
                t.emitTagPending();
                r.unconsume();
                t.transition(org.jsoup.parser.TokeniserState.Data);
            } else {
                t.emit("<");
                t.transition(org.jsoup.parser.TokeniserState.Rcdata);
            }
        }
    }, RCDATAEndTagOpen {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                t.createTagPending(false);
                t.tagPending.appendTagName(java.lang.Character.toLowerCase(r.current()));
                t.dataBuffer.append(java.lang.Character.toLowerCase(r.current()));
                t.advanceTransition(org.jsoup.parser.TokeniserState.RCDATAEndTagName);
            } else {
                t.emit("</");
                t.transition(org.jsoup.parser.TokeniserState.Rcdata);
            }
        }
    }, RCDATAEndTagName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                java.lang.String name = r.consumeLetterSequence();
                t.tagPending.appendTagName(name.toLowerCase());
                t.dataBuffer.append(name);
                return ;
            } 
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    if (t.isAppropriateEndTagToken())
                        t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeName);
                    else
                        anythingElse(t, r);
                    
                    break;
                case '/' :
                    if (t.isAppropriateEndTagToken())
                        t.transition(org.jsoup.parser.TokeniserState.SelfClosingStartTag);
                    else
                        anythingElse(t, r);
                    
                    break;
                case '>' :
                    if (t.isAppropriateEndTagToken()) {
                        t.emitTagPending();
                        t.transition(org.jsoup.parser.TokeniserState.Data);
                    } else
                        anythingElse(t, r);
                    
                    break;
                default :
                    anythingElse(t, r);
            }
        }

        private void anythingElse(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            t.emit(("</" + (t.dataBuffer.toString())));
            r.unconsume();
            t.transition(org.jsoup.parser.TokeniserState.Rcdata);
        }
    }, RawtextLessthanSign {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matches('/')) {
                t.createTempBuffer();
                t.advanceTransition(org.jsoup.parser.TokeniserState.RawtextEndTagOpen);
            } else {
                t.emit('<');
                t.transition(org.jsoup.parser.TokeniserState.Rawtext);
            }
        }
    }, RawtextEndTagOpen {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                t.createTagPending(false);
                t.transition(org.jsoup.parser.TokeniserState.RawtextEndTagName);
            } else {
                t.emit("</");
                t.transition(org.jsoup.parser.TokeniserState.Rawtext);
            }
        }
    }, RawtextEndTagName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            org.jsoup.parser.TokeniserState.handleDataEndTag(t, r, org.jsoup.parser.TokeniserState.Rawtext);
        }
    }, ScriptDataLessthanSign {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            switch (r.consume()) {
                case '/' :
                    t.createTempBuffer();
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen);
                    break;
                case '!' :
                    t.emit("<!");
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscapeStart);
                    break;
                default :
                    t.emit("<");
                    r.unconsume();
                    t.transition(org.jsoup.parser.TokeniserState.ScriptData);
            }
        }
    }, ScriptDataEndTagOpen {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                t.createTagPending(false);
                t.transition(org.jsoup.parser.TokeniserState.ScriptDataEndTagName);
            } else {
                t.emit("</");
                t.transition(org.jsoup.parser.TokeniserState.ScriptData);
            }
        }
    }, ScriptDataEndTagName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            org.jsoup.parser.TokeniserState.handleDataEndTag(t, r, org.jsoup.parser.TokeniserState.ScriptData);
        }
    }, ScriptDataEscapeStart {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matches('-')) {
                t.emit('-');
                t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash);
            } else {
                t.transition(org.jsoup.parser.TokeniserState.ScriptData);
            }
        }
    }, ScriptDataEscapeStartDash {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matches('-')) {
                t.emit('-');
                t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash);
            } else {
                t.transition(org.jsoup.parser.TokeniserState.ScriptData);
            }
        }
    }, ScriptDataEscaped {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.isEmpty()) {
                t.eofError(this);
                t.transition(org.jsoup.parser.TokeniserState.Data);
                return ;
            } 
            switch (r.current()) {
                case '-' :
                    t.emit('-');
                    t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataEscapedDash);
                    break;
                case '<' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    r.advance();
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                default :
                    java.lang.String data = r.consumeToAny('-', '<', org.jsoup.parser.TokeniserState.nullChar);
                    t.emit(data);
            }
        }
    }, ScriptDataEscapedDash {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.isEmpty()) {
                t.eofError(this);
                t.transition(org.jsoup.parser.TokeniserState.Data);
                return ;
            } 
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash);
                    break;
                case '<' :
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscaped);
                    break;
                default :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscaped);
            }
        }
    }, ScriptDataEscapedDashDash {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.isEmpty()) {
                t.eofError(this);
                t.transition(org.jsoup.parser.TokeniserState.Data);
                return ;
            } 
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.emit(c);
                    break;
                case '<' :
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign);
                    break;
                case '>' :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptData);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscaped);
                    break;
                default :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscaped);
            }
        }
    }, ScriptDataEscapedLessthanSign {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                t.createTempBuffer();
                t.dataBuffer.append(java.lang.Character.toLowerCase(r.current()));
                t.emit(("<" + (r.current())));
                t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart);
            } else if (r.matches('/')) {
                t.createTempBuffer();
                t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                t.emit('<');
                t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscaped);
            }
        }
    }, ScriptDataEscapedEndTagOpen {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                t.createTagPending(false);
                t.tagPending.appendTagName(java.lang.Character.toLowerCase(r.current()));
                t.dataBuffer.append(r.current());
                t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagName);
            } else {
                t.emit("</");
                t.transition(org.jsoup.parser.TokeniserState.ScriptDataEscaped);
            }
        }
    }, ScriptDataEscapedEndTagName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            org.jsoup.parser.TokeniserState.handleDataEndTag(t, r, org.jsoup.parser.TokeniserState.ScriptDataEscaped);
        }
    }, ScriptDataDoubleEscapeStart {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(t, r, org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped, org.jsoup.parser.TokeniserState.ScriptDataEscaped);
        }
    }, ScriptDataDoubleEscaped {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.current();
            switch (c) {
                case '-' :
                    t.emit(c);
                    t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash);
                    break;
                case '<' :
                    t.emit(c);
                    t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    r.advance();
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    java.lang.String data = r.consumeToAny('-', '<', org.jsoup.parser.TokeniserState.nullChar);
                    t.emit(data);
            }
        }
    }, ScriptDataDoubleEscapedDash {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash);
                    break;
                case '<' :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped);
            }
        }
    }, ScriptDataDoubleEscapedDashDash {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.emit(c);
                    break;
                case '<' :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    break;
                case '>' :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptData);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.emit(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.emit(c);
                    t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped);
            }
        }
    }, ScriptDataDoubleEscapedLessthanSign {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matches('/')) {
                t.emit('/');
                t.createTempBuffer();
                t.advanceTransition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd);
            } else {
                t.transition(org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped);
            }
        }
    }, ScriptDataDoubleEscapeEnd {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(t, r, org.jsoup.parser.TokeniserState.ScriptDataEscaped, org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped);
        }
    }, BeforeAttributeName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case '/' :
                    t.transition(org.jsoup.parser.TokeniserState.SelfClosingStartTag);
                    break;
                case '>' :
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.tagPending.newAttribute();
                    r.unconsume();
                    t.transition(org.jsoup.parser.TokeniserState.AttributeName);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '"' :
                case '\'' :
                case '<' :
                case '=' :
                    t.error(this);
                    t.tagPending.newAttribute();
                    t.tagPending.appendAttributeName(c);
                    t.transition(org.jsoup.parser.TokeniserState.AttributeName);
                    break;
                default :
                    t.tagPending.newAttribute();
                    r.unconsume();
                    t.transition(org.jsoup.parser.TokeniserState.AttributeName);
            }
        }
    }, AttributeName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            java.lang.String name = r.consumeToAnySorted(org.jsoup.parser.TokeniserState.attributeNameCharsSorted);
            t.tagPending.appendAttributeName(name.toLowerCase());
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterAttributeName);
                    break;
                case '/' :
                    t.transition(org.jsoup.parser.TokeniserState.SelfClosingStartTag);
                    break;
                case '=' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeValue);
                    break;
                case '>' :
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.tagPending.appendAttributeName(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '"' :
                case '\'' :
                case '<' :
                    t.error(this);
                    t.tagPending.appendAttributeName(c);
            }
        }
    }, AfterAttributeName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case '/' :
                    t.transition(org.jsoup.parser.TokeniserState.SelfClosingStartTag);
                    break;
                case '=' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeValue);
                    break;
                case '>' :
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.tagPending.appendAttributeName(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.AttributeName);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '"' :
                case '\'' :
                case '<' :
                    t.error(this);
                    t.tagPending.newAttribute();
                    t.tagPending.appendAttributeName(c);
                    t.transition(org.jsoup.parser.TokeniserState.AttributeName);
                    break;
                default :
                    t.tagPending.newAttribute();
                    r.unconsume();
                    t.transition(org.jsoup.parser.TokeniserState.AttributeName);
            }
        }
    }, BeforeAttributeValue {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case '"' :
                    t.transition(org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted);
                    break;
                case '&' :
                    r.unconsume();
                    t.transition(org.jsoup.parser.TokeniserState.AttributeValue_unquoted);
                    break;
                case '\'' :
                    t.transition(org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.tagPending.appendAttributeValue(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.AttributeValue_unquoted);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '>' :
                    t.error(this);
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '<' :
                case '=' :
                case '`' :
                    t.error(this);
                    t.tagPending.appendAttributeValue(c);
                    t.transition(org.jsoup.parser.TokeniserState.AttributeValue_unquoted);
                    break;
                default :
                    r.unconsume();
                    t.transition(org.jsoup.parser.TokeniserState.AttributeValue_unquoted);
            }
        }
    }, AttributeValue_doubleQuoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            java.lang.String value = r.consumeToAnySorted(org.jsoup.parser.TokeniserState.attributeDoubleValueCharsSorted);
            if ((value.length()) > 0)
                t.tagPending.appendAttributeValue(value);
            else
                t.tagPending.setEmptyAttributeValue();
            
            char c = r.consume();
            switch (c) {
                case '"' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted);
                    break;
                case '&' :
                    char[] ref = t.consumeCharacterReference('"', true);
                    if (ref != null)
                        t.tagPending.appendAttributeValue(ref);
                    else
                        t.tagPending.appendAttributeValue('&');
                    
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.tagPending.appendAttributeValue(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
            }
        }
    }, AttributeValue_singleQuoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            java.lang.String value = r.consumeToAnySorted(org.jsoup.parser.TokeniserState.attributeSingleValueCharsSorted);
            if ((value.length()) > 0)
                t.tagPending.appendAttributeValue(value);
            else
                t.tagPending.setEmptyAttributeValue();
            
            char c = r.consume();
            switch (c) {
                case '\'' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted);
                    break;
                case '&' :
                    char[] ref = t.consumeCharacterReference('\'', true);
                    if (ref != null)
                        t.tagPending.appendAttributeValue(ref);
                    else
                        t.tagPending.appendAttributeValue('&');
                    
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.tagPending.appendAttributeValue(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
            }
        }
    }, AttributeValue_unquoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            java.lang.String value = r.consumeToAny('\t', '\n', '\r', '\f', ' ', '&', '>', org.jsoup.parser.TokeniserState.nullChar, '"', '\'', '<', '=', '`');
            if ((value.length()) > 0)
                t.tagPending.appendAttributeValue(value);
            
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeName);
                    break;
                case '&' :
                    char[] ref = t.consumeCharacterReference('>', true);
                    if (ref != null)
                        t.tagPending.appendAttributeValue(ref);
                    else
                        t.tagPending.appendAttributeValue('&');
                    
                    break;
                case '>' :
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.tagPending.appendAttributeValue(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '"' :
                case '\'' :
                case '<' :
                case '=' :
                case '`' :
                    t.error(this);
                    t.tagPending.appendAttributeValue(c);
                    break;
            }
        }
    }, AfterAttributeValue_quoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeName);
                    break;
                case '/' :
                    t.transition(org.jsoup.parser.TokeniserState.SelfClosingStartTag);
                    break;
                case '>' :
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    r.unconsume();
                    t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeName);
            }
        }
    }, SelfClosingStartTag {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '>' :
                    t.tagPending.selfClosing = true;
                    t.emitTagPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.BeforeAttributeName);
            }
        }
    }, BogusComment {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            r.unconsume();
            org.jsoup.parser.Token.Comment comment = new org.jsoup.parser.Token.Comment();
            comment.bogus = true;
            comment.data.append(r.consumeTo('>'));
            t.emit(comment);
            t.advanceTransition(org.jsoup.parser.TokeniserState.Data);
        }
    }, MarkupDeclarationOpen {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchConsume("--")) {
                t.createCommentPending();
                t.transition(org.jsoup.parser.TokeniserState.CommentStart);
            } else if (r.matchConsumeIgnoreCase("DOCTYPE")) {
                t.transition(org.jsoup.parser.TokeniserState.Doctype);
            } else if (r.matchConsume("[CDATA[")) {
                t.transition(org.jsoup.parser.TokeniserState.CdataSection);
            } else {
                t.error(this);
                t.advanceTransition(org.jsoup.parser.TokeniserState.BogusComment);
            }
        }
    }, CommentStart {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.transition(org.jsoup.parser.TokeniserState.CommentStartDash);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.commentPending.data.append(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
                    break;
                case '>' :
                    t.error(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.commentPending.data.append(c);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
            }
        }
    }, CommentStartDash {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.transition(org.jsoup.parser.TokeniserState.CommentStartDash);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.commentPending.data.append(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
                    break;
                case '>' :
                    t.error(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.commentPending.data.append(c);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
            }
        }
    }, Comment {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.current();
            switch (c) {
                case '-' :
                    t.advanceTransition(org.jsoup.parser.TokeniserState.CommentEndDash);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    r.advance();
                    t.commentPending.data.append(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.commentPending.data.append(r.consumeToAny('-', org.jsoup.parser.TokeniserState.nullChar));
            }
        }
    }, CommentEndDash {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.transition(org.jsoup.parser.TokeniserState.CommentEnd);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.commentPending.data.append('-').append(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.commentPending.data.append('-').append(c);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
            }
        }
    }, CommentEnd {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '>' :
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.commentPending.data.append("--").append(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
                    break;
                case '!' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.CommentEndBang);
                    break;
                case '-' :
                    t.error(this);
                    t.commentPending.data.append('-');
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.commentPending.data.append("--").append(c);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
            }
        }
    }, CommentEndBang {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '-' :
                    t.commentPending.data.append("--!");
                    t.transition(org.jsoup.parser.TokeniserState.CommentEndDash);
                    break;
                case '>' :
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.commentPending.data.append("--!").append(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.emitCommentPending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.commentPending.data.append("--!").append(c);
                    t.transition(org.jsoup.parser.TokeniserState.Comment);
            }
        }
    }, Doctype {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeDoctypeName);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                case '>' :
                    t.error(this);
                    t.createDoctypePending();
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.BeforeDoctypeName);
            }
        }
    }, BeforeDoctypeName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                t.createDoctypePending();
                t.transition(org.jsoup.parser.TokeniserState.DoctypeName);
                return ;
            } 
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.createDoctypePending();
                    t.doctypePending.name.append(org.jsoup.parser.TokeniserState.replacementChar);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeName);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.createDoctypePending();
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.createDoctypePending();
                    t.doctypePending.name.append(c);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeName);
            }
        }
    }, DoctypeName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.matchesLetter()) {
                java.lang.String name = r.consumeLetterSequence();
                t.doctypePending.name.append(name.toLowerCase());
                return ;
            } 
            char c = r.consume();
            switch (c) {
                case '>' :
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterDoctypeName);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.doctypePending.name.append(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.doctypePending.name.append(c);
            }
        }
    }, AfterDoctypeName {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            if (r.isEmpty()) {
                t.eofError(this);
                t.doctypePending.forceQuirks = true;
                t.emitDoctypePending();
                t.transition(org.jsoup.parser.TokeniserState.Data);
                return ;
            } 
            if (r.matchesAny('\t', '\n', '\r', '\f', ' '))
                r.advance();
            else if (r.matches('>')) {
                t.emitDoctypePending();
                t.advanceTransition(org.jsoup.parser.TokeniserState.Data);
            } else if (r.matchConsumeIgnoreCase("PUBLIC")) {
                t.transition(org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword);
            } else if (r.matchConsumeIgnoreCase("SYSTEM")) {
                t.transition(org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                t.error(this);
                t.doctypePending.forceQuirks = true;
                t.advanceTransition(org.jsoup.parser.TokeniserState.BogusDoctype);
            }
        }
    }, AfterDoctypePublicKeyword {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier);
                    break;
                case '"' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                    break;
                case '\'' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.transition(org.jsoup.parser.TokeniserState.BogusDoctype);
            }
        }
    }, BeforeDoctypePublicIdentifier {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case '"' :
                    t.transition(org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                    break;
                case '\'' :
                    t.transition(org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.transition(org.jsoup.parser.TokeniserState.BogusDoctype);
            }
        }
    }, DoctypePublicIdentifier_doubleQuoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '"' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.doctypePending.publicIdentifier.append(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.doctypePending.publicIdentifier.append(c);
            }
        }
    }, DoctypePublicIdentifier_singleQuoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\'' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.doctypePending.publicIdentifier.append(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.doctypePending.publicIdentifier.append(c);
            }
        }
    }, AfterDoctypePublicIdentifier {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
                    break;
                case '>' :
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '"' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                    break;
                case '\'' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.transition(org.jsoup.parser.TokeniserState.BogusDoctype);
            }
        }
    }, BetweenDoctypePublicAndSystemIdentifiers {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case '>' :
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '"' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                    break;
                case '\'' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.transition(org.jsoup.parser.TokeniserState.BogusDoctype);
            }
        }
    }, AfterDoctypeSystemKeyword {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case '"' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                    break;
                case '\'' :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
            }
        }
    }, BeforeDoctypeSystemIdentifier {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case '"' :
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                    break;
                case '\'' :
                    t.transition(org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.transition(org.jsoup.parser.TokeniserState.BogusDoctype);
            }
        }
    }, DoctypeSystemIdentifier_doubleQuoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '"' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.doctypePending.systemIdentifier.append(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.doctypePending.systemIdentifier.append(c);
            }
        }
    }, DoctypeSystemIdentifier_singleQuoted {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\'' :
                    t.transition(org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier);
                    break;
                case org.jsoup.parser.TokeniserState.nullChar :
                    t.error(this);
                    t.doctypePending.systemIdentifier.append(org.jsoup.parser.TokeniserState.replacementChar);
                    break;
                case '>' :
                    t.error(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.doctypePending.systemIdentifier.append(c);
            }
        }
    }, AfterDoctypeSystemIdentifier {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    break;
                case '>' :
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.eofError(this);
                    t.doctypePending.forceQuirks = true;
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    t.error(this);
                    t.transition(org.jsoup.parser.TokeniserState.BogusDoctype);
            }
        }
    }, BogusDoctype {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            char c = r.consume();
            switch (c) {
                case '>' :
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                case org.jsoup.parser.TokeniserState.eof :
                    t.emitDoctypePending();
                    t.transition(org.jsoup.parser.TokeniserState.Data);
                    break;
                default :
                    break;
            }
        }
    }, CdataSection {
        void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r) {
            java.lang.String data = r.consumeTo("]]>");
            t.emit(data);
            r.matchConsume("]]>");
            t.transition(org.jsoup.parser.TokeniserState.Data);
        }
    };
    static final char nullChar = ' ';
    private static final char[] attributeSingleValueCharsSorted = new char[]{ '\'' , '&' , nullChar };
    private static final char[] attributeDoubleValueCharsSorted = new char[]{ '"' , '&' , nullChar };
    private static final char[] attributeNameCharsSorted = new char[]{ '\t' , '\n' , '\r' , '\f' , ' ' , '/' , '=' , '>' , nullChar , '"' , '\'' , '<' };
    private static final char replacementChar = org.jsoup.parser.Tokeniser.replacementChar;
    private static final java.lang.String replacementStr = java.lang.String.valueOf(org.jsoup.parser.Tokeniser.replacementChar);
    private static final char eof = org.jsoup.parser.CharacterReader.EOF;
    private static final metamutator.Selector _arithmeticOperatorHotSpot110 = metamutator.Selector.of(110,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.TokeniserState.class).id("_arithmeticOperatorHotSpot110");
    abstract void read(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r);

    static {
        java.util.Arrays.sort(attributeSingleValueCharsSorted);
        java.util.Arrays.sort(attributeDoubleValueCharsSorted);
        java.util.Arrays.sort(attributeNameCharsSorted);
    }

    private static void handleDataEndTag(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r, org.jsoup.parser.TokeniserState elseTransition) {
        if (r.matchesLetter()) {
            java.lang.String name = r.consumeLetterSequence();
            t.tagPending.appendTagName(name.toLowerCase());
            t.dataBuffer.append(name);
            return ;
        } 
        boolean needsExitTransition = false;
        if ((t.isAppropriateEndTagToken()) && (!(r.isEmpty()))) {
            char c = r.consume();
            switch (c) {
                case '\t' :
                case '\n' :
                case '\r' :
                case '\f' :
                case ' ' :
                    t.transition(BeforeAttributeName);
                    break;
                case '/' :
                    t.transition(SelfClosingStartTag);
                    break;
                case '>' :
                    t.emitTagPending();
                    t.transition(Data);
                    break;
                default :
                    t.dataBuffer.append(c);
                    needsExitTransition = true;
            }
        } else {
            needsExitTransition = true;
        }
        if (needsExitTransition) {
            t.emit(((_arithmeticOperatorHotSpot110.is("PLUS") ? (("</" + (t.dataBuffer.toString())))) : (_arithmeticOperatorHotSpot110.is("MINUS") ? (("</" - (t.dataBuffer.toString())))) : (_arithmeticOperatorHotSpot110.is("MUL") ? (("</" * (t.dataBuffer.toString())))) : (_arithmeticOperatorHotSpot110.is("DIV") ? (("</" / (t.dataBuffer.toString()))))));
            t.transition(elseTransition);
        } 
    }

    private static void handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser t, org.jsoup.parser.CharacterReader r, org.jsoup.parser.TokeniserState primary, org.jsoup.parser.TokeniserState fallback) {
        if (r.matchesLetter()) {
            java.lang.String name = r.consumeLetterSequence();
            t.dataBuffer.append(name.toLowerCase());
            t.emit(name);
            return ;
        } 
        char c = r.consume();
        switch (c) {
            case '\t' :
            case '\n' :
            case '\r' :
            case '\f' :
            case ' ' :
            case '/' :
            case '>' :
                if (t.dataBuffer.toString().equals("script"))
                    t.transition(primary);
                else
                    t.transition(fallback);
                
                t.emit(c);
                break;
            default :
                r.unconsume();
                t.transition(fallback);
        }
    }
}

