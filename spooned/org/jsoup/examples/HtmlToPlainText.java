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

        private int width = 0;

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
            
            if ((text.equals(" ")) && (((accum.length()) == 0) || (org.jsoup.helper.StringUtil.in(accum.substring(((_arithmeticOperatorHotSpot1.is("PLUS") ? (((accum.length()) + 1))) : (_arithmeticOperatorHotSpot1.is("MINUS") ? (((accum.length()) - 1))) : (_arithmeticOperatorHotSpot1.is("MUL") ? (((accum.length()) * 1))) : (_arithmeticOperatorHotSpot1.is("DIV") ? (((accum.length()) / 1))))), " ", "\n"))))
                return ;
            
            if (((_arithmeticOperatorHotSpot2.is("PLUS") ? (((text.length()) + (width)))) : (_arithmeticOperatorHotSpot2.is("MINUS") ? (((text.length()) - (width)))) : (_arithmeticOperatorHotSpot2.is("MUL") ? (((text.length()) * (width)))) : (_arithmeticOperatorHotSpot2.is("DIV") ? (((text.length()) / (width))))) > (maxWidth)) {
                java.lang.String[] words = text.split("\\s+");
                for (int i = 0 ; i < (words.length) ; i++) {
                    java.lang.String word = words[i];
                    boolean last = i == ((_arithmeticOperatorHotSpot3.is("PLUS") ? (((words.length) + 1))) : (_arithmeticOperatorHotSpot3.is("MINUS") ? (((words.length) - 1))) : (_arithmeticOperatorHotSpot3.is("MUL") ? (((words.length) * 1))) : (_arithmeticOperatorHotSpot3.is("DIV") ? (((words.length) / 1))));
                    if (!last)
                        word = ((_arithmeticOperatorHotSpot4.is("PLUS") ? (word + " ")) : (_arithmeticOperatorHotSpot4.is("MINUS") ? (word - " ")) : (_arithmeticOperatorHotSpot4.is("MUL") ? (word * " ")) : (_arithmeticOperatorHotSpot4.is("DIV") ? (word / " ")));
                    
                    if (((_arithmeticOperatorHotSpot5.is("PLUS") ? (((word.length()) + (width)))) : (_arithmeticOperatorHotSpot5.is("MINUS") ? (((word.length()) - (width)))) : (_arithmeticOperatorHotSpot5.is("MUL") ? (((word.length()) * (width)))) : (_arithmeticOperatorHotSpot5.is("DIV") ? (((word.length()) / (width))))) > (maxWidth)) {
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

    private static final metamutator.Selector _arithmeticOperatorHotSpot1 = metamutator.Selector.of(1,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot1");

    private static final metamutator.Selector _arithmeticOperatorHotSpot2 = metamutator.Selector.of(2,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot2");

    private static final metamutator.Selector _arithmeticOperatorHotSpot3 = metamutator.Selector.of(3,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot3");

    private static final metamutator.Selector _arithmeticOperatorHotSpot4 = metamutator.Selector.of(4,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot4");

    private static final metamutator.Selector _arithmeticOperatorHotSpot5 = metamutator.Selector.of(5,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot5");
}

