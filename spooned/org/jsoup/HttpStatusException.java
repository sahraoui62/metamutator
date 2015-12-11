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
        return ((((super.toString()) + ". Status=") + (statusCode)) + ", URL=") + (url);
    }
}

