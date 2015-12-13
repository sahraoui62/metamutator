package org.jsoup.examples;


public class HtmlToPlainText {
    private static final java.lang.String userAgent = "Mozilla/5.0 (jsoup)";

    private static final int timeout = 5 * 1000;

    public static void main(java.lang.String... args) throws java.io.IOException {
        org.jsoup.helper.Validate.isTrue((((args.length) == 1) || ((args.length) == 2)), "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
        final java.lang.String url = args[0];
        final java.lang.String selector = (args.length) == 2 ? args[1] : null;
        org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get();
        org.jsoup.examples.HtmlToPlainText formatter = new org.jsoup.examples.HtmlToPlainText();
        if (selector != null) {
            org.jsoup.select.Elements elements = doc.select(selector);
            for (org.jsoup.nodes.Element element : elements) {
                java.lang.String plainText = formatter.getPlainText(element);
                java.lang.System.out.println(plainText);
            }
        } else {
            java.lang.String plainText = formatter.getPlainText(doc);
            java.lang.System.out.println(plainText);
        }
    }

    public java.lang.String getPlainText(org.jsoup.nodes.Element element) {
        FormattingVisitor formatter = new FormattingVisitor();
        org.jsoup.select.NodeTraversor traversor = new org.jsoup.select.NodeTraversor(formatter);
        traversor.traverse(element);
        return formatter.toString();
    }

    private class FormattingVisitor implements org.jsoup.select.NodeVisitor {
        private static final int maxWidth = 80;

        private int width = (_constantOperatorMetaMutator1.is("ZERO")?( 0 ):(_constantOperatorMetaMutator1.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator1.is("MIN_MIN")?( -2147483647 ):(0))));

        private java.lang.StringBuilder accum = new java.lang.StringBuilder();

        public void head(org.jsoup.nodes.Node node, int depth) {
            java.lang.String name = node.nodeName();
            if (node instanceof org.jsoup.nodes.TextNode)
                append(((org.jsoup.nodes.TextNode)(node)).text());
            else if (name.equals("li"))
                append("\n * ");
            else if (name.equals("dt"))
                append("  ");
            else if (org.jsoup.helper.StringUtil.in(name, "p", "h1", "h2", "h3", "h4", "h5", "tr"))
                append("\n");
            
        }

        public void tail(org.jsoup.nodes.Node node, int depth) {
            java.lang.String name = node.nodeName();
            if (org.jsoup.helper.StringUtil.in(name, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5"))
                append("\n");
            else if (name.equals("a"))
                append(java.lang.String.format(" <%s>", node.absUrl("href")));
            
        }

        private void append(java.lang.String text) {
            if (text.startsWith("\n"))
                width = 0;
            
            if ((text.equals(" ")) && (((accum.length()) == 0) || (org.jsoup.helper.StringUtil.in(accum.substring(((accum.length()) - 1)), " ", "\n"))))
                return ;
            
            if (((text.length()) + (width)) > (maxWidth)) {
                java.lang.String[] words = text.split("\\s+");
                for (int i = (_constantOperatorMetaMutator2.is("ZERO")?( 0 ):(_constantOperatorMetaMutator2.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator2.is("MIN_MIN")?( -2147483647 ):(0)))) ; i < (words.length) ; i++) {
                    java.lang.String word = words[i];
                    boolean last = i == ((words.length) - 1);
                    if (!last)
                        word = word + " ";
                    
                    if (((word.length()) + (width)) > (maxWidth)) {
                        accum.append("\n").append(word);
                        width = word.length();
                    } else {
                        accum.append(word);
                        width += word.length();
                    }
                }
            } else {
                accum.append(text);
                width += text.length();
            }
        }

        @java.lang.Override
        public java.lang.String toString() {
            return accum.toString();
        }
    }

    private static final metamutator.Selector _constantOperatorMetaMutator1 = metamutator.Selector.of(1,new String[]{"ZERO","INT_MAX","MIN_MIN"}).id("_constantOperatorMetaMutator1");

    private static final metamutator.Selector _constantOperatorMetaMutator2 = metamutator.Selector.of(2,new String[]{"ZERO","INT_MAX","MIN_MIN"}).id("_constantOperatorMetaMutator2");
}

