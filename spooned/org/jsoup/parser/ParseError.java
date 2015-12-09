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
        return ((_arithmeticOperatorHotSpot87.is("PLUS") ? (((pos) + ": "))) : (_arithmeticOperatorHotSpot87.is("MINUS") ? (((pos) - ": "))) : (_arithmeticOperatorHotSpot87.is("MUL") ? (((pos) * ": "))) : (_arithmeticOperatorHotSpot87.is("DIV") ? (((pos) / ": ")))) + (errorMsg);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot87 = metamutator.Selector.of(87,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.ParseError.class).id("_arithmeticOperatorHotSpot87");
}

