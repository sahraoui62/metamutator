package org.jsoup.examples;


public class ListLinks {
    public static void main(java.lang.String[] args) throws java.io.IOException {
        org.jsoup.helper.Validate.isTrue(((args.length) == 1), "usage: supply url to fetch");
        java.lang.String url = args[0];
        org.jsoup.examples.ListLinks.print("Fetching %s...", url);
        org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).get();
        org.jsoup.select.Elements links = doc.select("a[href]");
        org.jsoup.select.Elements media = doc.select("[src]");
        org.jsoup.select.Elements imports = doc.select("link[href]");
        org.jsoup.examples.ListLinks.print("\nMedia: (%d)", media.size());
        for (org.jsoup.nodes.Element src : media) {
            if (src.tagName().equals("img"))
                org.jsoup.examples.ListLinks.print(" * %s: <%s> %sx%s (%s)", src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"), org.jsoup.examples.ListLinks.trim(src.attr("alt"), 20));
            else
                org.jsoup.examples.ListLinks.print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
            
        }
        org.jsoup.examples.ListLinks.print("\nImports: (%d)", imports.size());
        for (org.jsoup.nodes.Element link : imports) {
            org.jsoup.examples.ListLinks.print(" * %s <%s> (%s)", link.tagName(), link.attr("abs:href"), link.attr("rel"));
        }
        org.jsoup.examples.ListLinks.print("\nLinks: (%d)", links.size());
        for (org.jsoup.nodes.Element link : links) {
            org.jsoup.examples.ListLinks.print(" * a: <%s>  (%s)", link.attr("abs:href"), org.jsoup.examples.ListLinks.trim(link.text(), 35));
        }
    }

    private static void print(java.lang.String msg, java.lang.Object... args) {
        java.lang.System.out.println(java.lang.String.format(msg, args));
    }

    private static java.lang.String trim(java.lang.String s, int width) {
        if ((s.length()) > width)
            return (s.substring(0, (width - 1))) + ".";
        else
            return s;
        
    }
}

