package org.jsoup.parser;


public class ParseError {
    private int pos;

    private java.lang.String errorMsg;

    ParseError(int pos ,java.lang.String errorMsg) {
        this.pos = pos;
        this.errorMsg = errorMsg;
    }

    ParseError(int pos ,java.lang.String errorFormat ,java.lang.Object... args) {
        this.errorMsg = java.lang.String.format(errorFormat, args);
        this.pos = pos;
    }

    public java.lang.String getErrorMessage() {
        return errorMsg;
    }

    public int getPosition() {
        return pos;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((pos) + ": ") + (errorMsg);
    }
}

