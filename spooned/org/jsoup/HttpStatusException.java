package org.jsoup;


public class HttpStatusException extends java.io.IOException {
    private int statusCode;

    private java.lang.String url;

    public HttpStatusException(java.lang.String message ,int statusCode ,java.lang.String url) {
        super(message);
        this.statusCode = statusCode;
        this.url = url;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public java.lang.String getUrl() {
        return url;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((((_arithmeticOperatorHotSpot121.is("PLUS") ? (((super.toString()) + ". Status="))) : (_arithmeticOperatorHotSpot121.is("MINUS") ? (((super.toString()) - ". Status="))) : (_arithmeticOperatorHotSpot121.is("MUL") ? (((super.toString()) * ". Status="))) : (_arithmeticOperatorHotSpot121.is("DIV") ? (((super.toString()) / ". Status=")))) + (statusCode)) + ", URL=") + (url);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot121 = metamutator.Selector.of(121,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.HttpStatusException.class).id("_arithmeticOperatorHotSpot121");
}

