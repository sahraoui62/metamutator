package org.jsoup.nodes;


public class FormElement extends org.jsoup.nodes.Element {
    private final org.jsoup.select.Elements elements = new org.jsoup.select.Elements();

    public FormElement(org.jsoup.parser.Tag tag ,java.lang.String baseUri ,org.jsoup.nodes.Attributes attributes) {
        super(tag, baseUri, attributes);
    }

    public org.jsoup.select.Elements elements() {
        return elements;
    }

    public org.jsoup.nodes.FormElement addElement(org.jsoup.nodes.Element element) {
        elements.add(element);
        return this;
    }

    public org.jsoup.Connection submit() {
        java.lang.String action = hasAttr("action") ? absUrl("action") : baseUri();
        org.jsoup.helper.Validate.notEmpty(action, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        org.jsoup.Connection.Method method = attr("method").toUpperCase().equals("POST") ? org.jsoup.Connection.Method.POST : org.jsoup.Connection.Method.GET;
        return org.jsoup.Jsoup.connect(action).data(formData()).method(method);
    }

    public java.util.List<org.jsoup.Connection.KeyVal> formData() {
        java.util.ArrayList<org.jsoup.Connection.KeyVal> data = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        for (org.jsoup.nodes.Element el : elements) {
            if (!(el.tag().isFormSubmittable()))
                continue;
            
            if (el.hasAttr("disabled"))
                continue;
            
            java.lang.String name = el.attr("name");
            if ((name.length()) == 0)
                continue;
            
            java.lang.String type = el.attr("type");
            if ("select".equals(el.tagName())) {
                org.jsoup.select.Elements options = el.select("option[selected]");
                boolean set = false;
                for (org.jsoup.nodes.Element option : options) {
                    data.add(org.jsoup.helper.HttpConnection.KeyVal.create(name, option.val()));
                    set = true;
                }
                if (!set) {
                    org.jsoup.nodes.Element option = el.select("option").first();
                    if (option != null)
                        data.add(org.jsoup.helper.HttpConnection.KeyVal.create(name, option.val()));
                    
                } 
            } else if (("checkbox".equalsIgnoreCase(type)) || ("radio".equalsIgnoreCase(type))) {
                if (el.hasAttr("checked")) {
                    final java.lang.String val = (el.val().length()) > 0 ? el.val() : "on";
                    data.add(org.jsoup.helper.HttpConnection.KeyVal.create(name, val));
                } 
            } else {
                data.add(org.jsoup.helper.HttpConnection.KeyVal.create(name, el.val()));
            }
        }
        return data;
    }
}

