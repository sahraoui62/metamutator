package org.jsoup.nodes;


public class Document extends org.jsoup.nodes.Element {
    private org.jsoup.nodes.Document.OutputSettings outputSettings = new org.jsoup.nodes.Document.OutputSettings();

    private QuirksMode quirksMode = QuirksMode.noQuirks;

    private java.lang.String location;

    private boolean updateMetaCharset = false;

    public Document(java.lang.String baseUri) {
        super(org.jsoup.parser.Tag.valueOf("#root"), baseUri);
        this.location = baseUri;
    }

    public static org.jsoup.nodes.Document createShell(java.lang.String baseUri) {
        org.jsoup.helper.Validate.notNull(baseUri);
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(baseUri);
        org.jsoup.nodes.Element html = doc.appendElement("html");
        html.appendElement("head");
        html.appendElement("body");
        return doc;
    }

    public java.lang.String location() {
        return location;
    }

    public org.jsoup.nodes.Element head() {
        return findFirstElementByTagName("head", this);
    }

    public org.jsoup.nodes.Element body() {
        return findFirstElementByTagName("body", this);
    }

    public java.lang.String title() {
        org.jsoup.nodes.Element titleEl = getElementsByTag("title").first();
        return titleEl != null ? org.jsoup.helper.StringUtil.normaliseWhitespace(titleEl.text()).trim() : "";
    }

    public void title(java.lang.String title) {
        org.jsoup.helper.Validate.notNull(title);
        org.jsoup.nodes.Element titleEl = getElementsByTag("title").first();
        if (titleEl == null) {
            head().appendElement("title").text(title);
        } else {
            titleEl.text(title);
        }
    }

    public org.jsoup.nodes.Element createElement(java.lang.String tagName) {
        return new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf(tagName) , baseUri());
    }

    public org.jsoup.nodes.Document normalise() {
        org.jsoup.nodes.Element htmlEl = findFirstElementByTagName("html", this);
        if (htmlEl == null)
            htmlEl = appendElement("html");
        
        if ((head()) == null)
            htmlEl.prependElement("head");
        
        if ((body()) == null)
            htmlEl.appendElement("body");
        
        normaliseTextNodes(head());
        normaliseTextNodes(htmlEl);
        normaliseTextNodes(this);
        normaliseStructure("head", htmlEl);
        normaliseStructure("body", htmlEl);
        ensureMetaCharsetElement();
        return this;
    }

    private void normaliseTextNodes(org.jsoup.nodes.Element element) {
        java.util.List<org.jsoup.nodes.Node> toMove = new java.util.ArrayList<org.jsoup.nodes.Node>();
        for (org.jsoup.nodes.Node node : element.childNodes) {
            if (node instanceof org.jsoup.nodes.TextNode) {
                org.jsoup.nodes.TextNode tn = ((org.jsoup.nodes.TextNode)(node));
                if (!(tn.isBlank()))
                    toMove.add(tn);
                
            } 
        }
        for (int i = (_constantOperatorMetaMutator21.is("ZERO")?( 0 ):(_constantOperatorMetaMutator21.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator21.is("MIN_MIN")?( -2147483647 ):((toMove.size()) - 1)))) ; i >= 0 ; i--) {
            org.jsoup.nodes.Node node = toMove.get(i);
            element.removeChild(node);
            body().prependChild(new org.jsoup.nodes.TextNode(" " , ""));
            body().prependChild(node);
        }
    }

    private void normaliseStructure(java.lang.String tag, org.jsoup.nodes.Element htmlEl) {
        org.jsoup.select.Elements elements = getElementsByTag(tag);
        org.jsoup.nodes.Element master = elements.first();
        if ((elements.size()) > 1) {
            java.util.List<org.jsoup.nodes.Node> toMove = new java.util.ArrayList<org.jsoup.nodes.Node>();
            for (int i = (_constantOperatorMetaMutator20.is("ZERO")?( 0 ):(_constantOperatorMetaMutator20.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator20.is("MIN_MIN")?( -2147483647 ):(1)))) ; i < (elements.size()) ; i++) {
                org.jsoup.nodes.Node dupe = elements.get(i);
                for (org.jsoup.nodes.Node node : dupe.childNodes)
                    toMove.add(node);
                dupe.remove();
            }
            for (org.jsoup.nodes.Node dupe : toMove)
                master.appendChild(dupe);
        } 
        if (!(master.parent().equals(htmlEl))) {
            htmlEl.appendChild(master);
        } 
    }

    private org.jsoup.nodes.Element findFirstElementByTagName(java.lang.String tag, org.jsoup.nodes.Node node) {
        if (node.nodeName().equals(tag))
            return ((org.jsoup.nodes.Element)(node));
        else {
            for (org.jsoup.nodes.Node child : node.childNodes) {
                org.jsoup.nodes.Element found = findFirstElementByTagName(tag, child);
                if (found != null)
                    return found;
                
            }
        }
        return null;
    }

    @java.lang.Override
    public java.lang.String outerHtml() {
        return super.html();
    }

    @java.lang.Override
    public org.jsoup.nodes.Element text(java.lang.String text) {
        body().text(text);
        return this;
    }

    @java.lang.Override
    public java.lang.String nodeName() {
        return "#document";
    }

    public void charset(java.nio.charset.Charset charset) {
        updateMetaCharsetElement(true);
        outputSettings.charset(charset);
        ensureMetaCharsetElement();
    }

    public java.nio.charset.Charset charset() {
        return outputSettings.charset();
    }

    public void updateMetaCharsetElement(boolean update) {
        this.updateMetaCharset = update;
    }

    public boolean updateMetaCharsetElement() {
        return updateMetaCharset;
    }

    @java.lang.Override
    public org.jsoup.nodes.Document clone() {
        org.jsoup.nodes.Document clone = ((org.jsoup.nodes.Document)(super.clone()));
        clone.outputSettings = this.outputSettings.clone();
        return clone;
    }

    private void ensureMetaCharsetElement() {
        if (updateMetaCharset) {
            org.jsoup.nodes.Document.OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == (org.jsoup.nodes.Document.OutputSettings.Syntax.html)) {
                org.jsoup.nodes.Element metaCharset = select("meta[charset]").first();
                if (metaCharset != null) {
                    metaCharset.attr("charset", charset().displayName());
                } else {
                    org.jsoup.nodes.Element head = head();
                    if (head != null) {
                        head.appendElement("meta").attr("charset", charset().displayName());
                    } 
                }
                select("meta[name=charset]").remove();
            } else if (syntax == (org.jsoup.nodes.Document.OutputSettings.Syntax.xml)) {
                org.jsoup.nodes.Node node = childNodes().get(0);
                if (node instanceof org.jsoup.nodes.XmlDeclaration) {
                    org.jsoup.nodes.XmlDeclaration decl = ((org.jsoup.nodes.XmlDeclaration)(node));
                    if (decl.attr(org.jsoup.nodes.XmlDeclaration.DECL_KEY).equals("xml")) {
                        decl.attr("encoding", charset().displayName());
                        final java.lang.String version = decl.attr("version");
                        if (version != null) {
                            decl.attr("version", "1.0");
                        } 
                    } else {
                        decl = new org.jsoup.nodes.XmlDeclaration("xml" , baseUri , false);
                        decl.attr("version", "1.0");
                        decl.attr("encoding", charset().displayName());
                        prependChild(decl);
                    }
                } else {
                    org.jsoup.nodes.XmlDeclaration decl = new org.jsoup.nodes.XmlDeclaration("xml" , baseUri , false);
                    decl.attr("version", "1.0");
                    decl.attr("encoding", charset().displayName());
                    prependChild(decl);
                }
            } else {
            }
        } 
    }

    public static class OutputSettings implements java.lang.Cloneable {
        public enum Syntax {
html, xml;        }

        private org.jsoup.nodes.Entities.EscapeMode escapeMode = org.jsoup.nodes.Entities.EscapeMode.base;

        private java.nio.charset.Charset charset = java.nio.charset.Charset.forName("UTF-8");

        private java.nio.charset.CharsetEncoder charsetEncoder = charset.newEncoder();

        private boolean prettyPrint = true;

        private boolean outline = false;

        private int indentAmount = (_constantOperatorMetaMutator19.is("ZERO")?( 0 ):(_constantOperatorMetaMutator19.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator19.is("MIN_MIN")?( -2147483647 ):(1))));

        private Syntax syntax = Syntax.html;

        public OutputSettings() {
        }

        public org.jsoup.nodes.Entities.EscapeMode escapeMode() {
            return escapeMode;
        }

        public org.jsoup.nodes.Document.OutputSettings escapeMode(org.jsoup.nodes.Entities.EscapeMode escapeMode) {
            this.escapeMode = escapeMode;
            return this;
        }

        public java.nio.charset.Charset charset() {
            return charset;
        }

        public org.jsoup.nodes.Document.OutputSettings charset(java.nio.charset.Charset charset) {
            this.charset = charset;
            charsetEncoder = charset.newEncoder();
            return this;
        }

        public org.jsoup.nodes.Document.OutputSettings charset(java.lang.String charset) {
            charset(java.nio.charset.Charset.forName(charset));
            return this;
        }

        java.nio.charset.CharsetEncoder encoder() {
            return charsetEncoder;
        }

        public Syntax syntax() {
            return syntax;
        }

        public org.jsoup.nodes.Document.OutputSettings syntax(Syntax syntax) {
            this.syntax = syntax;
            return this;
        }

        public boolean prettyPrint() {
            return prettyPrint;
        }

        public org.jsoup.nodes.Document.OutputSettings prettyPrint(boolean pretty) {
            prettyPrint = pretty;
            return this;
        }

        public boolean outline() {
            return outline;
        }

        public org.jsoup.nodes.Document.OutputSettings outline(boolean outlineMode) {
            outline = outlineMode;
            return this;
        }

        public int indentAmount() {
            return indentAmount;
        }

        public org.jsoup.nodes.Document.OutputSettings indentAmount(int indentAmount) {
            org.jsoup.helper.Validate.isTrue((indentAmount >= 0));
            this.indentAmount = indentAmount;
            return this;
        }

        @java.lang.Override
        public org.jsoup.nodes.Document.OutputSettings clone() {
            org.jsoup.nodes.Document.OutputSettings clone;
            try {
                clone = ((org.jsoup.nodes.Document.OutputSettings)(super.clone()));
            } catch (java.lang.CloneNotSupportedException e) {
                throw new java.lang.RuntimeException(e);
            }
            clone.charset(charset.name());
            clone.escapeMode = org.jsoup.nodes.Entities.EscapeMode.valueOf(escapeMode.name());
            return clone;
        }
    }

    public org.jsoup.nodes.Document.OutputSettings outputSettings() {
        return outputSettings;
    }

    public org.jsoup.nodes.Document outputSettings(org.jsoup.nodes.Document.OutputSettings outputSettings) {
        org.jsoup.helper.Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public enum QuirksMode {
noQuirks, quirks, limitedQuirks;    }

    public QuirksMode quirksMode() {
        return quirksMode;
    }

    public org.jsoup.nodes.Document quirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }

    private static final metamutator.Selector _constantOperatorMetaMutator19 = metamutator.Selector.of(19,new String[]{"ZERO","INT_MAX","MIN_MIN"}).id("_constantOperatorMetaMutator19");

    private static final metamutator.Selector _constantOperatorMetaMutator20 = metamutator.Selector.of(20,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.nodes.Document.class).id("_constantOperatorMetaMutator20");

    private static final metamutator.Selector _constantOperatorMetaMutator21 = metamutator.Selector.of(21,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.nodes.Document.class).id("_constantOperatorMetaMutator21");
}

