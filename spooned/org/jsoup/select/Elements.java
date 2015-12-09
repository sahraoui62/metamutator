package org.jsoup.select;


public class Elements extends java.util.ArrayList<org.jsoup.nodes.Element> {
    public Elements() {
    }

    public Elements(int initialCapacity) {
        super(initialCapacity);
    }

    public Elements(java.util.Collection<org.jsoup.nodes.Element> elements) {
        super(elements);
    }

    public Elements(java.util.List<org.jsoup.nodes.Element> elements) {
        super(elements);
    }

    public Elements(org.jsoup.nodes.Element... elements) {
        super(java.util.Arrays.asList(elements));
    }

    @java.lang.Override
    public org.jsoup.select.Elements clone() {
        org.jsoup.select.Elements clone = new org.jsoup.select.Elements(size());
        for (org.jsoup.nodes.Element e : this)
            clone.add(e.clone());
        return clone;
    }

    public java.lang.String attr(java.lang.String attributeKey) {
        for (org.jsoup.nodes.Element element : this) {
            if (element.hasAttr(attributeKey))
                return element.attr(attributeKey);
            
        }
        return "";
    }

    public boolean hasAttr(java.lang.String attributeKey) {
        for (org.jsoup.nodes.Element element : this) {
            if (element.hasAttr(attributeKey))
                return true;
            
        }
        return false;
    }

    public org.jsoup.select.Elements attr(java.lang.String attributeKey, java.lang.String attributeValue) {
        for (org.jsoup.nodes.Element element : this) {
            element.attr(attributeKey, attributeValue);
        }
        return this;
    }

    public org.jsoup.select.Elements removeAttr(java.lang.String attributeKey) {
        for (org.jsoup.nodes.Element element : this) {
            element.removeAttr(attributeKey);
        }
        return this;
    }

    public org.jsoup.select.Elements addClass(java.lang.String className) {
        for (org.jsoup.nodes.Element element : this) {
            element.addClass(className);
        }
        return this;
    }

    public org.jsoup.select.Elements removeClass(java.lang.String className) {
        for (org.jsoup.nodes.Element element : this) {
            element.removeClass(className);
        }
        return this;
    }

    public org.jsoup.select.Elements toggleClass(java.lang.String className) {
        for (org.jsoup.nodes.Element element : this) {
            element.toggleClass(className);
        }
        return this;
    }

    public boolean hasClass(java.lang.String className) {
        for (org.jsoup.nodes.Element element : this) {
            if (element.hasClass(className))
                return true;
            
        }
        return false;
    }

    public java.lang.String val() {
        if ((size()) > 0)
            return first().val();
        else
            return "";
        
    }

    public org.jsoup.select.Elements val(java.lang.String value) {
        for (org.jsoup.nodes.Element element : this)
            element.val(value);
        return this;
    }

    public java.lang.String text() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (org.jsoup.nodes.Element element : this) {
            if ((sb.length()) != 0)
                sb.append(" ");
            
            sb.append(element.text());
        }
        return sb.toString();
    }

    public boolean hasText() {
        for (org.jsoup.nodes.Element element : this) {
            if (element.hasText())
                return true;
            
        }
        return false;
    }

    public java.lang.String html() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (org.jsoup.nodes.Element element : this) {
            if ((sb.length()) != 0)
                sb.append("\n");
            
            sb.append(element.html());
        }
        return sb.toString();
    }

    public java.lang.String outerHtml() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (org.jsoup.nodes.Element element : this) {
            if ((sb.length()) != 0)
                sb.append("\n");
            
            sb.append(element.outerHtml());
        }
        return sb.toString();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return outerHtml();
    }

    public org.jsoup.select.Elements tagName(java.lang.String tagName) {
        for (org.jsoup.nodes.Element element : this) {
            element.tagName(tagName);
        }
        return this;
    }

    public org.jsoup.select.Elements html(java.lang.String html) {
        for (org.jsoup.nodes.Element element : this) {
            element.html(html);
        }
        return this;
    }

    public org.jsoup.select.Elements prepend(java.lang.String html) {
        for (org.jsoup.nodes.Element element : this) {
            element.prepend(html);
        }
        return this;
    }

    public org.jsoup.select.Elements append(java.lang.String html) {
        for (org.jsoup.nodes.Element element : this) {
            element.append(html);
        }
        return this;
    }

    public org.jsoup.select.Elements before(java.lang.String html) {
        for (org.jsoup.nodes.Element element : this) {
            element.before(html);
        }
        return this;
    }

    public org.jsoup.select.Elements after(java.lang.String html) {
        for (org.jsoup.nodes.Element element : this) {
            element.after(html);
        }
        return this;
    }

    public org.jsoup.select.Elements wrap(java.lang.String html) {
        org.jsoup.helper.Validate.notEmpty(html);
        for (org.jsoup.nodes.Element element : this) {
            element.wrap(html);
        }
        return this;
    }

    public org.jsoup.select.Elements unwrap() {
        for (org.jsoup.nodes.Element element : this) {
            element.unwrap();
        }
        return this;
    }

    public org.jsoup.select.Elements empty() {
        for (org.jsoup.nodes.Element element : this) {
            element.empty();
        }
        return this;
    }

    public org.jsoup.select.Elements remove() {
        for (org.jsoup.nodes.Element element : this) {
            element.remove();
        }
        return this;
    }

    public org.jsoup.select.Elements select(java.lang.String query) {
        return org.jsoup.select.Selector.select(query, this);
    }

    public org.jsoup.select.Elements not(java.lang.String query) {
        org.jsoup.select.Elements out = org.jsoup.select.Selector.select(query, this);
        return org.jsoup.select.Selector.filterOut(this, out);
    }

    public org.jsoup.select.Elements eq(int index) {
        return (size()) > index ? new org.jsoup.select.Elements(get(index)) : new org.jsoup.select.Elements();
    }

    public boolean is(java.lang.String query) {
        org.jsoup.select.Elements children = select(query);
        return !(children.isEmpty());
    }

    public org.jsoup.select.Elements parents() {
        java.util.HashSet<org.jsoup.nodes.Element> combo = new java.util.LinkedHashSet<org.jsoup.nodes.Element>();
        for (org.jsoup.nodes.Element e : this) {
            combo.addAll(e.parents());
        }
        return new org.jsoup.select.Elements(combo);
    }

    public org.jsoup.nodes.Element first() {
        return isEmpty() ? null : get(0);
    }

    public org.jsoup.nodes.Element last() {
        return isEmpty() ? null : get(((_arithmeticOperatorHotSpot114.is("PLUS") ? (((size()) + 1))) : (_arithmeticOperatorHotSpot114.is("MINUS") ? (((size()) - 1))) : (_arithmeticOperatorHotSpot114.is("MUL") ? (((size()) * 1))) : (_arithmeticOperatorHotSpot114.is("DIV") ? (((size()) / 1)))));
    }

    public org.jsoup.select.Elements traverse(org.jsoup.select.NodeVisitor nodeVisitor) {
        org.jsoup.helper.Validate.notNull(nodeVisitor);
        org.jsoup.select.NodeTraversor traversor = new org.jsoup.select.NodeTraversor(nodeVisitor);
        for (org.jsoup.nodes.Element el : this) {
            traversor.traverse(el);
        }
        return this;
    }

    public java.util.List<org.jsoup.nodes.FormElement> forms() {
        java.util.ArrayList<org.jsoup.nodes.FormElement> forms = new java.util.ArrayList<org.jsoup.nodes.FormElement>();
        for (org.jsoup.nodes.Element el : this)
            if (el instanceof org.jsoup.nodes.FormElement)
                forms.add(((org.jsoup.nodes.FormElement)(el)));
            
        return forms;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot114 = metamutator.Selector.of(114,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.select.Elements.class).id("_arithmeticOperatorHotSpot114");
}

