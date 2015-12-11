package org.jsoup.select;


abstract class StructuralEvaluator extends org.jsoup.select.Evaluator {
    org.jsoup.select.Evaluator evaluator;

    static class Root extends org.jsoup.select.Evaluator {
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return root == element;
        }
    }

    static class Has extends org.jsoup.select.StructuralEvaluator {
        public Has(org.jsoup.select.Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            for (org.jsoup.nodes.Element e : element.getAllElements()) {
                if ((e != element) && (evaluator.matches(root, e)))
                    return true;
                
            }
            return false;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":has(%s)", evaluator);
        }
    }

    static class Not extends org.jsoup.select.StructuralEvaluator {
        public Not(org.jsoup.select.Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element node) {
            return !(evaluator.matches(root, node));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":not%s", evaluator);
        }
    }

    static class Parent extends org.jsoup.select.StructuralEvaluator {
        public Parent(org.jsoup.select.Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            if (root == element)
                return false;
            
            org.jsoup.nodes.Element parent = element.parent();
            while (true) {
                if (evaluator.matches(root, parent))
                    return true;
                
                if (parent == root)
                    break;
                
                parent = parent.parent();
            }
            return false;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":parent%s", evaluator);
        }
    }

    static class ImmediateParent extends org.jsoup.select.StructuralEvaluator {
        public ImmediateParent(org.jsoup.select.Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            if (root == element)
                return false;
            
            org.jsoup.nodes.Element parent = element.parent();
            return (parent != null) && (evaluator.matches(root, parent));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":ImmediateParent%s", evaluator);
        }
    }

    static class PreviousSibling extends org.jsoup.select.StructuralEvaluator {
        public PreviousSibling(org.jsoup.select.Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            if (root == element)
                return false;
            
            org.jsoup.nodes.Element prev = element.previousElementSibling();
            while (prev != null) {
                if (evaluator.matches(root, prev))
                    return true;
                
                prev = prev.previousElementSibling();
            }
            return false;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":prev*%s", evaluator);
        }
    }

    static class ImmediatePreviousSibling extends org.jsoup.select.StructuralEvaluator {
        public ImmediatePreviousSibling(org.jsoup.select.Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            if (root == element)
                return false;
            
            org.jsoup.nodes.Element prev = element.previousElementSibling();
            return (prev != null) && (evaluator.matches(root, prev));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":prev%s", evaluator);
        }
    }
}

