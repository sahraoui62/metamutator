package org.jsoup.parser;


public class Parser {
    private static final int DEFAULT_MAX_ERRORS = 0;

    private org.jsoup.parser.TreeBuilder treeBuilder;

    private int maxErrors = DEFAULT_MAX_ERRORS;

    private org.jsoup.parser.ParseErrorList errors;

    public Parser(org.jsoup.parser.TreeBuilder treeBuilder) {
        this.treeBuilder = treeBuilder;
    }

    public org.jsoup.nodes.Document parseInput(java.lang.String html, java.lang.String baseUri) {
        errors = isTrackErrors() ? org.jsoup.parser.ParseErrorList.tracking(maxErrors) : org.jsoup.parser.ParseErrorList.noTracking();
        return treeBuilder.parse(html, baseUri, errors);
    }

    public org.jsoup.parser.TreeBuilder getTreeBuilder() {
        return treeBuilder;
    }

    public org.jsoup.parser.Parser setTreeBuilder(org.jsoup.parser.TreeBuilder treeBuilder) {
        this.treeBuilder = treeBuilder;
        return this;
    }

    public boolean isTrackErrors() {
        return (maxErrors) > 0;
    }

    public org.jsoup.parser.Parser setTrackErrors(int maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    public java.util.List<org.jsoup.parser.ParseError> getErrors() {
        return errors;
    }

    public static org.jsoup.nodes.Document parse(java.lang.String html, java.lang.String baseUri) {
        org.jsoup.parser.TreeBuilder treeBuilder = new org.jsoup.parser.HtmlTreeBuilder();
        return treeBuilder.parse(html, baseUri, org.jsoup.parser.ParseErrorList.noTracking());
    }

    public static java.util.List<org.jsoup.nodes.Node> parseFragment(java.lang.String fragmentHtml, org.jsoup.nodes.Element context, java.lang.String baseUri) {
        org.jsoup.parser.HtmlTreeBuilder treeBuilder = new org.jsoup.parser.HtmlTreeBuilder();
        return treeBuilder.parseFragment(fragmentHtml, context, baseUri, org.jsoup.parser.ParseErrorList.noTracking());
    }

    public static java.util.List<org.jsoup.nodes.Node> parseXmlFragment(java.lang.String fragmentXml, java.lang.String baseUri) {
        org.jsoup.parser.XmlTreeBuilder treeBuilder = new org.jsoup.parser.XmlTreeBuilder();
        return treeBuilder.parseFragment(fragmentXml, baseUri, org.jsoup.parser.ParseErrorList.noTracking());
    }

    public static org.jsoup.nodes.Document parseBodyFragment(java.lang.String bodyHtml, java.lang.String baseUri) {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.createShell(baseUri);
        org.jsoup.nodes.Element body = doc.body();
        java.util.List<org.jsoup.nodes.Node> nodeList = org.jsoup.parser.Parser.parseFragment(bodyHtml, body, baseUri);
        org.jsoup.nodes.Node[] nodes = nodeList.toArray(new org.jsoup.nodes.Node[nodeList.size()]);
        for (int i = (nodes.length) - 1 ; i > 0 ; i--) {
            nodes[i].remove();
        }
        for (org.jsoup.nodes.Node node : nodes) {
            body.appendChild(node);
        }
        return doc;
    }

    public static java.lang.String unescapeEntities(java.lang.String string, boolean inAttribute) {
        org.jsoup.parser.Tokeniser tokeniser = new org.jsoup.parser.Tokeniser(new org.jsoup.parser.CharacterReader(string) , org.jsoup.parser.ParseErrorList.noTracking());
        return tokeniser.unescapeEntities(inAttribute);
    }

    public static org.jsoup.nodes.Document parseBodyFragmentRelaxed(java.lang.String bodyHtml, java.lang.String baseUri) {
        return org.jsoup.parser.Parser.parse(bodyHtml, baseUri);
    }

    public static org.jsoup.parser.Parser htmlParser() {
        return new org.jsoup.parser.Parser(new org.jsoup.parser.HtmlTreeBuilder());
    }

    public static org.jsoup.parser.Parser xmlParser() {
        return new org.jsoup.parser.Parser(new org.jsoup.parser.XmlTreeBuilder());
    }
}

