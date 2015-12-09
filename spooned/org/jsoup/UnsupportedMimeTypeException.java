package org.jsoup;


public class UnsupportedMimeTypeException extends java.io.IOException {
    private java.lang.String mimeType;

    private java.lang.String url;

    public UnsupportedMimeTypeException(java.lang.String message ,java.lang.String mimeType ,java.lang.String url) {
        super(message);
        this.mimeType = mimeType;
        this.url = url;
    }

    public java.lang.String getMimeType() {
        return mimeType;
    }

    public java.lang.String getUrl() {
        return url;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((((_arithmeticOperatorHotSpot122.is("PLUS") ? (((super.toString()) + ". Mimetype="))) : (_arithmeticOperatorHotSpot122.is("MINUS") ? (((super.toString()) - ". Mimetype="))) : (_arithmeticOperatorHotSpot122.is("MUL") ? (((super.toString()) * ". Mimetype="))) : (_arithmeticOperatorHotSpot122.is("DIV") ? (((super.toString()) / ". Mimetype=")))) + (mimeType)) + ", URL=") + (url);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot122 = metamutator.Selector.of(122,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.UnsupportedMimeTypeException.class).id("_arithmeticOperatorHotSpot122");
}

