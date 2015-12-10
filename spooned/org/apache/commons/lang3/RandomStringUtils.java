package org.apache.commons.lang3;


public class RandomStringUtils {
    private static final java.util.Random RANDOM = new java.util.Random();

    public RandomStringUtils() {
        super();
    }

    public static java.lang.String random(final int count) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, false, false);
    }

    public static java.lang.String randomAscii(final int count) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, 32, 127, false, false);
    }

    public static java.lang.String randomAlphabetic(final int count) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, true, false);
    }

    public static java.lang.String randomAlphanumeric(final int count) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, true, true);
    }

    public static java.lang.String randomNumeric(final int count) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, false, true);
    }

    public static java.lang.String random(final int count, final boolean letters, final boolean numbers) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, 0, 0, letters, numbers);
    }

    public static java.lang.String random(final int count, final int start, final int end, final boolean letters, final boolean numbers) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, start, end, letters, numbers, null, RANDOM);
    }

    public static java.lang.String random(final int count, final int start, final int end, final boolean letters, final boolean numbers, final char... chars) {
        return org.apache.commons.lang3.RandomStringUtils.random(count, start, end, letters, numbers, chars, RANDOM);
    }

    public static java.lang.String random(int count, int start, int end, final boolean letters, final boolean numbers, final char[] chars, final java.util.Random random) {
        if (count == 0) {
            return "";
        } else if (count < 0) {
            throw new java.lang.IllegalArgumentException((("Requested random string length " + count) + " is less than 0."));
        } 
        if ((chars != null) && ((chars.length) == 0)) {
            throw new java.lang.IllegalArgumentException("The chars array must not be empty");
        } 
        if ((start == 0) && (end == 0)) {
            if (chars != null) {
                end = chars.length;
            } else {
                if ((!letters) && (!numbers)) {
                    end = java.lang.Integer.MAX_VALUE;
                } else {
                    end = ((_arithmeticOperatorHotSpot698.is("PLUS")) ? ('z' + 1) : (_arithmeticOperatorHotSpot698.is("MINUS")) ? ('z' - 1) : (_arithmeticOperatorHotSpot698.is("MUL")) ? ('z' * 1) :  ('z' / 1));
                    start = ' ';
                }
            }
        } else {
            if (end <= start) {
                throw new java.lang.IllegalArgumentException((((("Parameter end (" + end) + ") must be greater than start (") + start) + ")"));
            } 
        }
        final char[] buffer = new char[count];
        final int gap = ((_arithmeticOperatorHotSpot699.is("PLUS")) ? (end + start) : (_arithmeticOperatorHotSpot699.is("MINUS")) ? (end - start) : (_arithmeticOperatorHotSpot699.is("MUL")) ? (end * start) :  (end / start));
        while ((count--) != 0) {
            char ch;
            if (chars == null) {
                ch = ((_arithmeticOperatorHotSpot700.is("PLUS")) ? (((char)((random.nextInt(gap)) + start))) : (_arithmeticOperatorHotSpot700.is("MINUS")) ? (((char)((random.nextInt(gap)) - start))) : (_arithmeticOperatorHotSpot700.is("MUL")) ? (((char)((random.nextInt(gap)) * start))) :  (((char)((random.nextInt(gap)) / start))));
            } else {
                ch = chars[((_arithmeticOperatorHotSpot701.is("PLUS")) ? (((random.nextInt(gap)) + start)) : (_arithmeticOperatorHotSpot701.is("MINUS")) ? (((random.nextInt(gap)) - start)) : (_arithmeticOperatorHotSpot701.is("MUL")) ? (((random.nextInt(gap)) * start)) :  (((random.nextInt(gap)) / start)))];
            }
            if (((letters && (java.lang.Character.isLetter(ch))) || (numbers && (java.lang.Character.isDigit(ch)))) || ((!letters) && (!numbers))) {
                if ((ch >= 56320) && (ch <= 57343)) {
                    if (count == 0) {
                        count++;
                    } else {
                        buffer[count] = ch;
                        count--;
                        buffer[count] = ((_arithmeticOperatorHotSpot702.is("PLUS")) ? (((char)(55296 + (random.nextInt(128))))) : (_arithmeticOperatorHotSpot702.is("MINUS")) ? (((char)(55296 - (random.nextInt(128))))) : (_arithmeticOperatorHotSpot702.is("MUL")) ? (((char)(55296 * (random.nextInt(128))))) :  (((char)(55296 / (random.nextInt(128))))));
                    }
                } else if ((ch >= 55296) && (ch <= 56191)) {
                    if (count == 0) {
                        count++;
                    } else {
                        buffer[count] = ((_arithmeticOperatorHotSpot703.is("PLUS")) ? (((char)(56320 + (random.nextInt(128))))) : (_arithmeticOperatorHotSpot703.is("MINUS")) ? (((char)(56320 - (random.nextInt(128))))) : (_arithmeticOperatorHotSpot703.is("MUL")) ? (((char)(56320 * (random.nextInt(128))))) :  (((char)(56320 / (random.nextInt(128))))));
                        count--;
                        buffer[count] = ch;
                    }
                } else if ((ch >= 56192) && (ch <= 56319)) {
                    count++;
                } else {
                    buffer[count] = ch;
                }
            } else {
                count++;
            }
        }
        return new java.lang.String(buffer);
    }

    public static java.lang.String random(final int count, final java.lang.String chars) {
        if (chars == null) {
            return org.apache.commons.lang3.RandomStringUtils.random(count, 0, 0, false, false, null, RANDOM);
        } 
        return org.apache.commons.lang3.RandomStringUtils.random(count, chars.toCharArray());
    }

    public static java.lang.String random(final int count, final char... chars) {
        if (chars == null) {
            return org.apache.commons.lang3.RandomStringUtils.random(count, 0, 0, false, false, null, RANDOM);
        } 
        return org.apache.commons.lang3.RandomStringUtils.random(count, 0, chars.length, false, false, chars, RANDOM);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot698 = metamutator.Selector.of(698,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_arithmeticOperatorHotSpot698");

    private static final metamutator.Selector _arithmeticOperatorHotSpot699 = metamutator.Selector.of(699,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_arithmeticOperatorHotSpot699");

    private static final metamutator.Selector _arithmeticOperatorHotSpot700 = metamutator.Selector.of(700,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_arithmeticOperatorHotSpot700");

    private static final metamutator.Selector _arithmeticOperatorHotSpot701 = metamutator.Selector.of(701,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_arithmeticOperatorHotSpot701");

    private static final metamutator.Selector _arithmeticOperatorHotSpot702 = metamutator.Selector.of(702,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_arithmeticOperatorHotSpot702");

    private static final metamutator.Selector _arithmeticOperatorHotSpot703 = metamutator.Selector.of(703,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_arithmeticOperatorHotSpot703");
}

