package org.jsoup.select;


public abstract class Evaluator {
    protected Evaluator() {
    }

    public abstract boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element);

    public static final class Tag extends org.jsoup.select.Evaluator {
        private java.lang.String tagName;

        public Tag(java.lang.String tagName) {
            this.tagName = tagName;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return element.tagName().equals(tagName);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("%s", tagName);
        }
    }

    public static final class Id extends org.jsoup.select.Evaluator {
        private java.lang.String id;

        public Id(java.lang.String id) {
            this.id = id;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return id.equals(element.id());
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("#%s", id);
        }
    }

    public static final class Class extends org.jsoup.select.Evaluator {
        private java.lang.String className;

        public Class(java.lang.String className) {
            this.className = className;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return element.hasClass(className);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(".%s", className);
        }
    }

    public static final class Attribute extends org.jsoup.select.Evaluator {
        private java.lang.String key;

        public Attribute(java.lang.String key) {
            this.key = key;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return element.hasAttr(key);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[%s]", key);
        }
    }

    public static final class AttributeStarting extends org.jsoup.select.Evaluator {
        private java.lang.String keyPrefix;

        public AttributeStarting(java.lang.String keyPrefix) {
            this.keyPrefix = keyPrefix;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            java.util.List<org.jsoup.nodes.Attribute> values = element.attributes().asList();
            for (org.jsoup.nodes.Attribute attribute : values) {
                if (attribute.getKey().startsWith(keyPrefix))
                    return true;
                
            }
            return false;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[^%s]", keyPrefix);
        }
    }

    public static final class AttributeWithValue extends org.jsoup.select.Evaluator.AttributeKeyPair {
        public AttributeWithValue(java.lang.String key ,java.lang.String value) {
            super(key, value);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.hasAttr(key)) && (value.equalsIgnoreCase(element.attr(key).trim()));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[%s=%s]", key, value);
        }
    }

    public static final class AttributeWithValueNot extends org.jsoup.select.Evaluator.AttributeKeyPair {
        public AttributeWithValueNot(java.lang.String key ,java.lang.String value) {
            super(key, value);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return !(value.equalsIgnoreCase(element.attr(key)));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[%s!=%s]", key, value);
        }
    }

    public static final class AttributeWithValueStarting extends org.jsoup.select.Evaluator.AttributeKeyPair {
        public AttributeWithValueStarting(java.lang.String key ,java.lang.String value) {
            super(key, value);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.hasAttr(key)) && (element.attr(key).toLowerCase().startsWith(value));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[%s^=%s]", key, value);
        }
    }

    public static final class AttributeWithValueEnding extends org.jsoup.select.Evaluator.AttributeKeyPair {
        public AttributeWithValueEnding(java.lang.String key ,java.lang.String value) {
            super(key, value);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.hasAttr(key)) && (element.attr(key).toLowerCase().endsWith(value));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[%s$=%s]", key, value);
        }
    }

    public static final class AttributeWithValueContaining extends org.jsoup.select.Evaluator.AttributeKeyPair {
        public AttributeWithValueContaining(java.lang.String key ,java.lang.String value) {
            super(key, value);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.hasAttr(key)) && (element.attr(key).toLowerCase().contains(value));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[%s*=%s]", key, value);
        }
    }

    public static final class AttributeWithValueMatching extends org.jsoup.select.Evaluator {
        java.lang.String key;

        java.util.regex.Pattern pattern;

        public AttributeWithValueMatching(java.lang.String key ,java.util.regex.Pattern pattern) {
            this.key = key.trim().toLowerCase();
            this.pattern = pattern;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.hasAttr(key)) && (pattern.matcher(element.attr(key)).find());
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format("[%s~=%s]", key, pattern.toString());
        }
    }

    public abstract static class AttributeKeyPair extends org.jsoup.select.Evaluator {
        java.lang.String key;

        java.lang.String value;

        public AttributeKeyPair(java.lang.String key ,java.lang.String value) {
            org.jsoup.helper.Validate.notEmpty(key);
            org.jsoup.helper.Validate.notEmpty(value);
            this.key = key.trim().toLowerCase();
            if ((value.startsWith("\"")) && (value.endsWith("\""))) {
                value = value.substring(1, ((value.length()) - 1));
            } 
            this.value = value.trim().toLowerCase();
        }
    }

    public static final class AllElements extends org.jsoup.select.Evaluator {
        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return true;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "*";
        }
    }

    public static final class IndexLessThan extends org.jsoup.select.Evaluator.IndexEvaluator {
        public IndexLessThan(int index) {
            super(index);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.elementSiblingIndex()) < (index);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":lt(%d)", index);
        }
    }

    public static final class IndexGreaterThan extends org.jsoup.select.Evaluator.IndexEvaluator {
        public IndexGreaterThan(int index) {
            super(index);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.elementSiblingIndex()) > (index);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":gt(%d)", index);
        }
    }

    public static final class IndexEquals extends org.jsoup.select.Evaluator.IndexEvaluator {
        public IndexEquals(int index) {
            super(index);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return (element.elementSiblingIndex()) == (index);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":eq(%d)", index);
        }
    }

    public static final class IsLastChild extends org.jsoup.select.Evaluator {
        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            final org.jsoup.nodes.Element p = element.parent();
            return ((p != null) && (!(p instanceof org.jsoup.nodes.Document))) && ((element.elementSiblingIndex()) == ((_arithmeticOperatorHotSpot117.is("PLUS") ? (((p.children().size()) + 1))) : (_arithmeticOperatorHotSpot117.is("MINUS") ? (((p.children().size()) - 1))) : (_arithmeticOperatorHotSpot117.is("MUL") ? (((p.children().size()) * 1))) : (_arithmeticOperatorHotSpot117.is("DIV") ? (((p.children().size()) / 1)))));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":last-child";
        }
    }

    public static final class IsFirstOfType extends org.jsoup.select.Evaluator.IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":first-of-type";
        }
    }

    public static final class IsLastOfType extends org.jsoup.select.Evaluator.IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":last-of-type";
        }
    }

    public abstract static class CssNthEvaluator extends org.jsoup.select.Evaluator {
        protected final int a;

        protected final int b;

        public CssNthEvaluator(int a ,int b) {
            this.a = a;
            this.b = b;
        }

        public CssNthEvaluator(int b) {
            this(0, b);
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            final org.jsoup.nodes.Element p = element.parent();
            if ((p == null) || (p instanceof org.jsoup.nodes.Document))
                return false;
            
            final int pos = calculatePosition(root, element);
            if ((a) == 0)
                return pos == (b);
            
            return ((((_arithmeticOperatorHotSpot115.is("PLUS") ? ((pos + (b)))) : (_arithmeticOperatorHotSpot115.is("MINUS") ? ((pos - (b)))) : (_arithmeticOperatorHotSpot115.is("MUL") ? ((pos * (b)))) : (_arithmeticOperatorHotSpot115.is("DIV") ? ((pos / (b))))) * (a)) >= 0) && ((((_arithmeticOperatorHotSpot116.is("PLUS") ? ((pos + (b)))) : (_arithmeticOperatorHotSpot116.is("MINUS") ? ((pos - (b)))) : (_arithmeticOperatorHotSpot116.is("MUL") ? ((pos * (b)))) : (_arithmeticOperatorHotSpot116.is("DIV") ? ((pos / (b))))) % (a)) == 0);
        }

        @java.lang.Override
        public java.lang.String toString() {
            if ((a) == 0)
                return java.lang.String.format(":%s(%d)", getPseudoClass(), b);
            
            if ((b) == 0)
                return java.lang.String.format(":%s(%dn)", getPseudoClass(), a);
            
            return java.lang.String.format(":%s(%dn%+d)", getPseudoClass(), a, b);
        }

        protected abstract java.lang.String getPseudoClass();

        protected abstract int calculatePosition(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element);
    }

    public static final class IsNthChild extends org.jsoup.select.Evaluator.CssNthEvaluator {
        public IsNthChild(int a ,int b) {
            super(a, b);
        }

        protected int calculatePosition(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return ((_arithmeticOperatorHotSpot118.is("PLUS") ? ((element.elementSiblingIndex()) + 1)) : (_arithmeticOperatorHotSpot118.is("MINUS") ? ((element.elementSiblingIndex()) - 1)) : (_arithmeticOperatorHotSpot118.is("MUL") ? ((element.elementSiblingIndex()) * 1)) : (_arithmeticOperatorHotSpot118.is("DIV") ? ((element.elementSiblingIndex()) / 1)));
        }

        protected java.lang.String getPseudoClass() {
            return "nth-child";
        }
    }

    public static final class IsNthLastChild extends org.jsoup.select.Evaluator.CssNthEvaluator {
        public IsNthLastChild(int a ,int b) {
            super(a, b);
        }

        @java.lang.Override
        protected int calculatePosition(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return ((_arithmeticOperatorHotSpot119.is("PLUS") ? ((element.parent().children().size()) + (element.elementSiblingIndex()))) : (_arithmeticOperatorHotSpot119.is("MINUS") ? ((element.parent().children().size()) - (element.elementSiblingIndex()))) : (_arithmeticOperatorHotSpot119.is("MUL") ? ((element.parent().children().size()) * (element.elementSiblingIndex()))) : (_arithmeticOperatorHotSpot119.is("DIV") ? ((element.parent().children().size()) / (element.elementSiblingIndex()))));
        }

        @java.lang.Override
        protected java.lang.String getPseudoClass() {
            return "nth-last-child";
        }
    }

    public static class IsNthOfType extends org.jsoup.select.Evaluator.CssNthEvaluator {
        public IsNthOfType(int a ,int b) {
            super(a, b);
        }

        protected int calculatePosition(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            int pos = 0;
            org.jsoup.select.Elements family = element.parent().children();
            for (int i = 0 ; i < (family.size()) ; i++) {
                if (family.get(i).tag().equals(element.tag()))
                    pos++;
                
                if ((family.get(i)) == element)
                    break;
                
            }
            return pos;
        }

        @java.lang.Override
        protected java.lang.String getPseudoClass() {
            return "nth-of-type";
        }
    }

    public static class IsNthLastOfType extends org.jsoup.select.Evaluator.CssNthEvaluator {
        public IsNthLastOfType(int a ,int b) {
            super(a, b);
        }

        @java.lang.Override
        protected int calculatePosition(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            int pos = 0;
            org.jsoup.select.Elements family = element.parent().children();
            for (int i = element.elementSiblingIndex() ; i < (family.size()) ; i++) {
                if (family.get(i).tag().equals(element.tag()))
                    pos++;
                
            }
            return pos;
        }

        @java.lang.Override
        protected java.lang.String getPseudoClass() {
            return "nth-last-of-type";
        }
    }

    public static final class IsFirstChild extends org.jsoup.select.Evaluator {
        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            final org.jsoup.nodes.Element p = element.parent();
            return ((p != null) && (!(p instanceof org.jsoup.nodes.Document))) && ((element.elementSiblingIndex()) == 0);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":first-child";
        }
    }

    public static final class IsRoot extends org.jsoup.select.Evaluator {
        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            final org.jsoup.nodes.Element r = root instanceof org.jsoup.nodes.Document ? root.child(0) : root;
            return element == r;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":root";
        }
    }

    public static final class IsOnlyChild extends org.jsoup.select.Evaluator {
        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            final org.jsoup.nodes.Element p = element.parent();
            return ((p != null) && (!(p instanceof org.jsoup.nodes.Document))) && ((element.siblingElements().size()) == 0);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":only-child";
        }
    }

    public static final class IsOnlyOfType extends org.jsoup.select.Evaluator {
        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            final org.jsoup.nodes.Element p = element.parent();
            if ((p == null) || (p instanceof org.jsoup.nodes.Document))
                return false;
            
            int pos = 0;
            org.jsoup.select.Elements family = p.children();
            for (int i = 0 ; i < (family.size()) ; i++) {
                if (family.get(i).tag().equals(element.tag()))
                    pos++;
                
            }
            return pos == 1;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":only-of-type";
        }
    }

    public static final class IsEmpty extends org.jsoup.select.Evaluator {
        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            java.util.List<org.jsoup.nodes.Node> family = element.childNodes();
            for (int i = 0 ; i < (family.size()) ; i++) {
                org.jsoup.nodes.Node n = family.get(i);
                if (!(((n instanceof org.jsoup.nodes.Comment) || (n instanceof org.jsoup.nodes.XmlDeclaration)) || (n instanceof org.jsoup.nodes.DocumentType)))
                    return false;
                
            }
            return true;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ":empty";
        }
    }

    public abstract static class IndexEvaluator extends org.jsoup.select.Evaluator {
        int index;

        public IndexEvaluator(int index) {
            this.index = index;
        }
    }

    public static final class ContainsText extends org.jsoup.select.Evaluator {
        private java.lang.String searchText;

        public ContainsText(java.lang.String searchText) {
            this.searchText = searchText.toLowerCase();
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return element.text().toLowerCase().contains(searchText);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":contains(%s", searchText);
        }
    }

    public static final class ContainsOwnText extends org.jsoup.select.Evaluator {
        private java.lang.String searchText;

        public ContainsOwnText(java.lang.String searchText) {
            this.searchText = searchText.toLowerCase();
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            return element.ownText().toLowerCase().contains(searchText);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":containsOwn(%s", searchText);
        }
    }

    public static final class Matches extends org.jsoup.select.Evaluator {
        private java.util.regex.Pattern pattern;

        public Matches(java.util.regex.Pattern pattern) {
            this.pattern = pattern;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            java.util.regex.Matcher m = pattern.matcher(element.text());
            return m.find();
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":matches(%s", pattern);
        }
    }

    public static final class MatchesOwn extends org.jsoup.select.Evaluator {
        private java.util.regex.Pattern pattern;

        public MatchesOwn(java.util.regex.Pattern pattern) {
            this.pattern = pattern;
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element) {
            java.util.regex.Matcher m = pattern.matcher(element.ownText());
            return m.find();
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":matchesOwn(%s", pattern);
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot115 = metamutator.Selector.of(115,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot115");

    private static final metamutator.Selector _arithmeticOperatorHotSpot116 = metamutator.Selector.of(116,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot116");

    private static final metamutator.Selector _arithmeticOperatorHotSpot117 = metamutator.Selector.of(117,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot117");

    private static final metamutator.Selector _arithmeticOperatorHotSpot118 = metamutator.Selector.of(118,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot118");

    private static final metamutator.Selector _arithmeticOperatorHotSpot119 = metamutator.Selector.of(119,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot119");
}

