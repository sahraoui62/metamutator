package org.jsoup.nodes;


public class Attribute implements java.lang.Cloneable , java.util.Map.Entry<java.lang.String, java.lang.String> {
    private static final java.lang.String[] booleanAttributes = new java.lang.String[]{ "allowfullscreen" , "async" , "autofocus" , "checked" , "compact" , "declare" , "default" , "defer" , "disabled" , "formnovalidate" , "hidden" , "inert" , "ismap" , "itemscope" , "multiple" , "muted" , "nohref" , "noresize" , "noshade" , "novalidate" , "nowrap" , "open" , "readonly" , "required" , "reversed" , "seamless" , "selected" , "sortable" , "truespeed" , "typemustmatch" };

    private java.lang.String key;

    private java.lang.String value;

    public Attribute(java.lang.String key ,java.lang.String value) {
        org.jsoup.helper.Validate.notEmpty(key);
        org.jsoup.helper.Validate.notNull(value);
        this.key = key.trim().toLowerCase();
        this.value = value;
    }

    public java.lang.String getKey() {
        return key;
    }

    public void setKey(java.lang.String key) {
        org.jsoup.helper.Validate.notEmpty(key);
        this.key = key.trim().toLowerCase();
    }

    public java.lang.String getValue() {
        return value;
    }

    public java.lang.String setValue(java.lang.String value) {
        org.jsoup.helper.Validate.notNull(value);
        java.lang.String old = this.value;
        this.value = value;
        return old;
    }

    public java.lang.String html() {
        java.lang.StringBuilder accum = new java.lang.StringBuilder();
        html(accum, new org.jsoup.nodes.Document("").outputSettings());
        return accum.toString();
    }

    protected void html(java.lang.StringBuilder accum, org.jsoup.nodes.Document.OutputSettings out) {
        accum.append(key);
        if (!(shouldCollapseAttribute(out))) {
            accum.append("=\"");
            org.jsoup.nodes.Entities.escape(accum, value, out, true, false, false);
            accum.append('"');
        } 
    }

    @java.lang.Override
    public java.lang.String toString() {
        return html();
    }

    public static org.jsoup.nodes.Attribute createFromEncoded(java.lang.String unencodedKey, java.lang.String encodedValue) {
        java.lang.String value = org.jsoup.nodes.Entities.unescape(encodedValue, true);
        return new org.jsoup.nodes.Attribute(unencodedKey , value);
    }

    protected boolean isDataAttribute() {
        return (key.startsWith(org.jsoup.nodes.Attributes.dataPrefix)) && ((key.length()) > (org.jsoup.nodes.Attributes.dataPrefix.length()));
    }

    protected final boolean shouldCollapseAttribute(org.jsoup.nodes.Document.OutputSettings out) {
        return ((("".equals(value)) || (value.equalsIgnoreCase(key))) && ((out.syntax()) == (org.jsoup.nodes.Document.OutputSettings.Syntax.html))) && (isBooleanAttribute());
    }

    protected boolean isBooleanAttribute() {
        return (java.util.Arrays.binarySearch(booleanAttributes, key)) >= 0;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if ((this) == o)
            return true;
        
        if (!(o instanceof org.jsoup.nodes.Attribute))
            return false;
        
        org.jsoup.nodes.Attribute attribute = ((org.jsoup.nodes.Attribute)(o));
        if ((key) != null ? !(key.equals(attribute.key)) : (attribute.key) != null)
            return false;
        
        return !((value) != null ? !(value.equals(attribute.value)) : (attribute.value) != null);
    }

    @java.lang.Override
    public int hashCode() {
        int result = (key) != null ? key.hashCode() : 0;
        result = ((_arithmeticOperatorHotSpot14.is("PLUS") ? ((31 + result))) : (_arithmeticOperatorHotSpot14.is("MINUS") ? ((31 - result))) : (_arithmeticOperatorHotSpot14.is("MUL") ? ((31 * result))) : (_arithmeticOperatorHotSpot14.is("DIV") ? ((31 / result)))) + ((value) != null ? value.hashCode() : 0);
        return result;
    }

    @java.lang.Override
    public org.jsoup.nodes.Attribute clone() {
        try {
            return ((org.jsoup.nodes.Attribute)(super.clone()));
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot14 = metamutator.Selector.of(14,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.jsoup.nodes.Attribute.class).id("_arithmeticOperatorHotSpot14");
}

