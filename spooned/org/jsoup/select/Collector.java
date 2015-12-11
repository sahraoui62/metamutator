package org.jsoup.select;


public class Collector {
    private Collector() {
    }

    public static org.jsoup.select.Elements collect(org.jsoup.select.Evaluator eval, org.jsoup.nodes.Element root) {
        org.jsoup.select.Elements elements = new org.jsoup.select.Elements();
        new org.jsoup.select.NodeTraversor(new org.jsoup.select.Collector.Accumulator(root , elements , eval)).traverse(root);
        return elements;
    }

    private static class Accumulator implements org.jsoup.select.NodeVisitor {
        private final org.jsoup.nodes.Element root;

        private final org.jsoup.select.Elements elements;

        private final org.jsoup.select.Evaluator eval;

        Accumulator(org.jsoup.nodes.Element root ,org.jsoup.select.Elements elements ,org.jsoup.select.Evaluator eval) {
            this.root = root;
            this.elements = elements;
            this.eval = eval;
        }

        public void head(org.jsoup.nodes.Node node, int depth) {
            if (node instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element el = ((org.jsoup.nodes.Element)(node));
                if (eval.matches(root, el))
                    elements.add(el);
                
            } 
        }

        public void tail(org.jsoup.nodes.Node node, int depth) {
        }
    }
}

