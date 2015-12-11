package org.jsoup;


public class Jsoup {
    private Jsoup() {
    }

    public static org.jsoup.nodes.Document parse(java.lang.String html, java.lang.String baseUri) {
        return org.jsoup.parser.Parser.parse(html, baseUri);
    }

    public static org.jsoup.nodes.Document parse(java.lang.String html, java.lang.String baseUri, org.jsoup.parser.Parser parser) {
        return parser.parseInput(html, baseUri);
    }

    public static org.jsoup.nodes.Document parse(java.lang.String html) {
        return org.jsoup.parser.Parser.parse(html, "");
    }

    public static org.jsoup.Connection connect(java.lang.String url) {
        return org.jsoup.helper.HttpConnection.connect(url);
    }

    public static org.jsoup.nodes.Document parse(java.io.File in, java.lang.String charsetName, java.lang.String baseUri) throws java.io.IOException {
        return org.jsoup.helper.DataUtil.load(in, charsetName, baseUri);
    }

    public static org.jsoup.nodes.Document parse(java.io.File in, java.lang.String charsetName) throws java.io.IOException {
        return org.jsoup.helper.DataUtil.load(in, charsetName, in.getAbsolutePath());
    }

    public static org.jsoup.nodes.Document parse(java.io.InputStream in, java.lang.String charsetName, java.lang.String baseUri) throws java.io.IOException {
        return org.jsoup.helper.DataUtil.load(in, charsetName, baseUri);
    }

    public static org.jsoup.nodes.Document parse(java.io.InputStream in, java.lang.String charsetName, java.lang.String baseUri, org.jsoup.parser.Parser parser) throws java.io.IOException {
        return org.jsoup.helper.DataUtil.load(in, charsetName, baseUri, parser);
    }

    public static org.jsoup.nodes.Document parseBodyFragment(java.lang.String bodyHtml, java.lang.String baseUri) {
        return org.jsoup.parser.Parser.parseBodyFragment(bodyHtml, baseUri);
    }

    public static org.jsoup.nodes.Document parseBodyFragment(java.lang.String bodyHtml) {
        return org.jsoup.parser.Parser.parseBodyFragment(bodyHtml, "");
    }

    public static org.jsoup.nodes.Document parse(java.net.URL url, int timeoutMillis) throws java.io.IOException {
        org.jsoup.Connection con = org.jsoup.helper.HttpConnection.connect(url);
        con.timeout(timeoutMillis);
        return con.get();
    }

    public static java.lang.String clean(java.lang.String bodyHtml, java.lang.String baseUri, org.jsoup.safety.Whitelist whitelist) {
        org.jsoup.nodes.Document dirty = org.jsoup.Jsoup.parseBodyFragment(bodyHtml, baseUri);
        org.jsoup.safety.Cleaner cleaner = new org.jsoup.safety.Cleaner(whitelist);
        org.jsoup.nodes.Document clean = cleaner.clean(dirty);
        return clean.body().html();
    }

    public static java.lang.String clean(java.lang.String bodyHtml, org.jsoup.safety.Whitelist whitelist) {
        return org.jsoup.Jsoup.clean(bodyHtml, "", whitelist);
    }

    public static java.lang.String clean(java.lang.String bodyHtml, java.lang.String baseUri, org.jsoup.safety.Whitelist whitelist, org.jsoup.nodes.Document.OutputSettings outputSettings) {
        org.jsoup.nodes.Document dirty = org.jsoup.Jsoup.parseBodyFragment(bodyHtml, baseUri);
        org.jsoup.safety.Cleaner cleaner = new org.jsoup.safety.Cleaner(whitelist);
        org.jsoup.nodes.Document clean = cleaner.clean(dirty);
        clean.outputSettings(outputSettings);
        return clean.body().html();
    }

    public static boolean isValid(java.lang.String bodyHtml, org.jsoup.safety.Whitelist whitelist) {
        org.jsoup.nodes.Document dirty = org.jsoup.Jsoup.parseBodyFragment(bodyHtml, "");
        org.jsoup.safety.Cleaner cleaner = new org.jsoup.safety.Cleaner(whitelist);
        return cleaner.isValid(dirty);
    }
}

