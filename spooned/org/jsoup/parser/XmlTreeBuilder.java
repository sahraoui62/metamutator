package org.jsoup.parser;


public class XmlTreeBuilder extends org.jsoup.parser.TreeBuilder {
    @java.lang.Override
    protected void initialiseParse(java.lang.String input, java.lang.String baseUri, org.jsoup.parser.ParseErrorList errors) {
        super.initialiseParse(input, baseUri, errors);
        stack.add(doc);
        doc.outputSettings().syntax(org.jsoup.nodes.Document.OutputSettings.Syntax.xml);
    }

    @java.lang.Override
    protected boolean process(org.jsoup.parser.Token token) {
        switch (token.type) {
            case StartTag :
                insert(token.asStartTag());
                break;
            case EndTag :
                popStackToClose(token.asEndTag());
                break;
            case Comment :
                insert(token.asComment());
                break;
            case Character :
                insert(token.asCharacter());
                break;
            case Doctype :
                insert(token.asDoctype());
                break;
            case EOF :
                break;
            default :
                org.jsoup.helper.Validate.fail(("Unexpected token type: " + (token.type)));
        }
        return true;
    }

    private void insertNode(org.jsoup.nodes.Node node) {
        currentElement().appendChild(node);
    }

    org.jsoup.nodes.Element insert(org.jsoup.parser.Token.StartTag startTag) {
        org.jsoup.parser.Tag tag = org.jsoup.parser.Tag.valueOf(startTag.name());
        org.jsoup.nodes.Element el = new org.jsoup.nodes.Element(tag , baseUri , startTag.attributes);
        insertNode(el);
        if (startTag.isSelfClosing()) {
            tokeniser.acknowledgeSelfClosingFlag();
            if (!(tag.isKnownTag()))
                tag.setSelfClosing();
            
        } else {
            stack.add(el);
        }
        return el;
    }

    void insert(org.jsoup.parser.Token.Comment commentToken) {
        org.jsoup.nodes.Comment comment = new org.jsoup.nodes.Comment(commentToken.getData() , baseUri);
        org.jsoup.nodes.Node insert = comment;
        if (commentToken.bogus) {
            java.lang.String data = comment.getData();
            if (((data.length()) > 1) && ((data.startsWith("!")) || (data.startsWith("?")))) {
                java.lang.String declaration = data.substring(1);
                insert = new org.jsoup.nodes.XmlDeclaration(declaration , comment.baseUri() , data.startsWith("!"));
            } 
        } 
        insertNode(insert);
    }

    void insert(org.jsoup.parser.Token.Character characterToken) {
        org.jsoup.nodes.Node node = new org.jsoup.nodes.TextNode(characterToken.getData() , baseUri);
        insertNode(node);
    }

    void insert(org.jsoup.parser.Token.Doctype d) {
        org.jsoup.nodes.DocumentType doctypeNode = new org.jsoup.nodes.DocumentType(d.getName() , d.getPublicIdentifier() , d.getSystemIdentifier() , baseUri);
        insertNode(doctypeNode);
    }

    private void popStackToClose(org.jsoup.parser.Token.EndTag endTag) {
        java.lang.String elName = endTag.name();
        org.jsoup.nodes.Element firstFound = null;
        for (int pos = (stack.size()) - 1 ; pos >= 0 ; pos--) {
            org.jsoup.nodes.Element next = stack.get(pos);
            if (next.nodeName().equals(elName)) {
                firstFound = next;
                break;
            } 
        }
        if (firstFound == null)
            return ;
        
        for (int pos = (stack.size()) - 1 ; pos >= 0 ; pos--) {
            org.jsoup.nodes.Element next = stack.get(pos);
            stack.remove(pos);
            if (next == firstFound)
                break;
            
        }
    }

    java.util.List<org.jsoup.nodes.Node> parseFragment(java.lang.String inputFragment, java.lang.String baseUri, org.jsoup.parser.ParseErrorList errors) {
        initialiseParse(inputFragment, baseUri, errors);
        runParser();
        return doc.childNodes();
    }
}

