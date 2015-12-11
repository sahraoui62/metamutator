package org.jsoup.parser;


abstract class Token {
    TokenType type;

    private Token() {
    }

    java.lang.String tokenType() {
        return getClass().getSimpleName();
    }

    abstract org.jsoup.parser.Token reset();

    static void reset(java.lang.StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        } 
    }

    static final class Doctype extends org.jsoup.parser.Token {
        final java.lang.StringBuilder name = new java.lang.StringBuilder();

        final java.lang.StringBuilder publicIdentifier = new java.lang.StringBuilder();

        final java.lang.StringBuilder systemIdentifier = new java.lang.StringBuilder();

        boolean forceQuirks = false;

        Doctype() {
            type = TokenType.Doctype;
        }

        @java.lang.Override
        org.jsoup.parser.Token reset() {
            org.jsoup.parser.Token.reset(name);
            org.jsoup.parser.Token.reset(publicIdentifier);
            org.jsoup.parser.Token.reset(systemIdentifier);
            forceQuirks = false;
            return this;
        }

        java.lang.String getName() {
            return name.toString();
        }

        java.lang.String getPublicIdentifier() {
            return publicIdentifier.toString();
        }

        public java.lang.String getSystemIdentifier() {
            return systemIdentifier.toString();
        }

        public boolean isForceQuirks() {
            return forceQuirks;
        }
    }

    abstract static class Tag extends org.jsoup.parser.Token {
        protected java.lang.String tagName;

        private java.lang.String pendingAttributeName;

        private java.lang.StringBuilder pendingAttributeValue = new java.lang.StringBuilder();

        private boolean hasEmptyAttributeValue = false;

        private boolean hasPendingAttributeValue = false;

        boolean selfClosing = false;

        org.jsoup.nodes.Attributes attributes;

        @java.lang.Override
        org.jsoup.parser.Token.Tag reset() {
            tagName = null;
            pendingAttributeName = null;
            org.jsoup.parser.Token.reset(pendingAttributeValue);
            hasEmptyAttributeValue = false;
            hasPendingAttributeValue = false;
            selfClosing = false;
            attributes = null;
            return this;
        }

        final void newAttribute() {
            if ((attributes) == null)
                attributes = new org.jsoup.nodes.Attributes();
            
            if ((pendingAttributeName) != null) {
                org.jsoup.nodes.Attribute attribute;
                if (hasPendingAttributeValue)
                    attribute = new org.jsoup.nodes.Attribute(pendingAttributeName , pendingAttributeValue.toString());
                else if (hasEmptyAttributeValue)
                    attribute = new org.jsoup.nodes.Attribute(pendingAttributeName , "");
                else
                    attribute = new org.jsoup.nodes.BooleanAttribute(pendingAttributeName);
                
                attributes.put(attribute);
            } 
            pendingAttributeName = null;
            hasEmptyAttributeValue = false;
            hasPendingAttributeValue = false;
            org.jsoup.parser.Token.reset(pendingAttributeValue);
        }

        final void finaliseTag() {
            if ((pendingAttributeName) != null) {
                newAttribute();
            } 
        }

        final java.lang.String name() {
            org.jsoup.helper.Validate.isFalse((((tagName) == null) || ((tagName.length()) == 0)));
            return tagName;
        }

        final org.jsoup.parser.Token.Tag name(java.lang.String name) {
            tagName = name;
            return this;
        }

        final boolean isSelfClosing() {
            return selfClosing;
        }

        @java.lang.SuppressWarnings(value = { "TypeMayBeWeakened" })
        final org.jsoup.nodes.Attributes getAttributes() {
            return attributes;
        }

        final void appendTagName(java.lang.String append) {
            tagName = (tagName) == null ? append : tagName.concat(append);
        }

        final void appendTagName(char append) {
            appendTagName(java.lang.String.valueOf(append));
        }

        final void appendAttributeName(java.lang.String append) {
            pendingAttributeName = (pendingAttributeName) == null ? append : pendingAttributeName.concat(append);
        }

        final void appendAttributeName(char append) {
            appendAttributeName(java.lang.String.valueOf(append));
        }

        final void appendAttributeValue(java.lang.String append) {
            ensureAttributeValue();
            pendingAttributeValue.append(append);
        }

        final void appendAttributeValue(char append) {
            ensureAttributeValue();
            pendingAttributeValue.append(append);
        }

        final void appendAttributeValue(char[] append) {
            ensureAttributeValue();
            pendingAttributeValue.append(append);
        }

        final void setEmptyAttributeValue() {
            hasEmptyAttributeValue = true;
        }

        private void ensureAttributeValue() {
            hasPendingAttributeValue = true;
        }
    }

    static final class StartTag extends org.jsoup.parser.Token.Tag {
        StartTag() {
            super();
            attributes = new org.jsoup.nodes.Attributes();
            type = TokenType.StartTag;
        }

        @java.lang.Override
        org.jsoup.parser.Token.Tag reset() {
            super.reset();
            attributes = new org.jsoup.nodes.Attributes();
            return this;
        }

        org.jsoup.parser.Token.StartTag nameAttr(java.lang.String name, org.jsoup.nodes.Attributes attributes) {
            this.tagName = name;
            this.attributes = attributes;
            return this;
        }

        @java.lang.Override
        public java.lang.String toString() {
            if (((attributes) != null) && ((attributes.size()) > 0))
                return ((("<" + (name())) + " ") + (attributes.toString())) + ">";
            else
                return ("<" + (name())) + ">";
            
        }
    }

    static final class EndTag extends org.jsoup.parser.Token.Tag {
        EndTag() {
            super();
            type = TokenType.EndTag;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ("</" + (name())) + ">";
        }
    }

    static final class Comment extends org.jsoup.parser.Token {
        final java.lang.StringBuilder data = new java.lang.StringBuilder();

        boolean bogus = false;

        @java.lang.Override
        org.jsoup.parser.Token reset() {
            org.jsoup.parser.Token.reset(data);
            bogus = false;
            return this;
        }

        Comment() {
            type = TokenType.Comment;
        }

        java.lang.String getData() {
            return data.toString();
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ("<!--" + (getData())) + "-->";
        }
    }

    static final class Character extends org.jsoup.parser.Token {
        private java.lang.String data;

        Character() {
            super();
            type = TokenType.Character;
        }

        @java.lang.Override
        org.jsoup.parser.Token reset() {
            data = null;
            return this;
        }

        org.jsoup.parser.Token.Character data(java.lang.String data) {
            this.data = data;
            return this;
        }

        java.lang.String getData() {
            return data;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return getData();
        }
    }

    static final class EOF extends org.jsoup.parser.Token {
        EOF() {
            type = TokenType.EOF;
        }

        @java.lang.Override
        org.jsoup.parser.Token reset() {
            return this;
        }
    }

    final boolean isDoctype() {
        return (type) == (TokenType.Doctype);
    }

    final org.jsoup.parser.Token.Doctype asDoctype() {
        return ((org.jsoup.parser.Token.Doctype)(this));
    }

    final boolean isStartTag() {
        return (type) == (TokenType.StartTag);
    }

    final org.jsoup.parser.Token.StartTag asStartTag() {
        return ((org.jsoup.parser.Token.StartTag)(this));
    }

    final boolean isEndTag() {
        return (type) == (TokenType.EndTag);
    }

    final org.jsoup.parser.Token.EndTag asEndTag() {
        return ((org.jsoup.parser.Token.EndTag)(this));
    }

    final boolean isComment() {
        return (type) == (TokenType.Comment);
    }

    final org.jsoup.parser.Token.Comment asComment() {
        return ((org.jsoup.parser.Token.Comment)(this));
    }

    final boolean isCharacter() {
        return (type) == (TokenType.Character);
    }

    final org.jsoup.parser.Token.Character asCharacter() {
        return ((org.jsoup.parser.Token.Character)(this));
    }

    final boolean isEOF() {
        return (type) == (TokenType.EOF);
    }

    enum TokenType {
Doctype, StartTag, EndTag, Comment, Character, EOF;    }
}

