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
        return ((((super.toString()) + ". Mimetype=") + (mimeType)) + ", URL=") + (url);
    }
}

