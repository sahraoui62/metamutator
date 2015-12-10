package org.apache.commons.lang3;


public class RandomStringUtils {
    private static final java.util.Random RANDOM = new java.util.Random();

    public RandomStringUtils() {
        super();
    }

    public static java.lang.String random(final int count) {
        return ((_returnReplacementOperatorHotSpot2877.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, false, false)));
    }

    public static java.lang.String randomAscii(final int count) {
        return ((_returnReplacementOperatorHotSpot2889.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, 32, 127, false, false)));
    }

    public static java.lang.String randomAlphabetic(final int count) {
        return ((_returnReplacementOperatorHotSpot2887.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, true, false)));
    }

    public static java.lang.String randomAlphanumeric(final int count) {
        return ((_returnReplacementOperatorHotSpot2888.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, true, true)));
    }

    public static java.lang.String randomNumeric(final int count) {
        return ((_returnReplacementOperatorHotSpot2890.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, false, true)));
    }

    public static java.lang.String random(final int count, final boolean letters, final boolean numbers) {
        return ((_returnReplacementOperatorHotSpot2878.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, 0, 0, letters, numbers)));
    }

    public static java.lang.String random(final int count, final int start, final int end, final boolean letters, final boolean numbers) {
        return ((_returnReplacementOperatorHotSpot2881.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, start, end, letters, numbers, null, org.apache.commons.lang3.RandomStringUtils.RANDOM)));
    }

    public static java.lang.String random(final int count, final int start, final int end, final boolean letters, final boolean numbers, final char... chars) {
        return ((_returnReplacementOperatorHotSpot2882.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, start, end, letters, numbers, chars, org.apache.commons.lang3.RandomStringUtils.RANDOM)));
    }

    public static java.lang.String random(int count, int start, int end, final boolean letters, final boolean numbers, final char[] chars, final java.util.Random random) {
        if (count == 0) {
            return ((_returnReplacementOperatorHotSpot2883.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (""));
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
                    end = 'z' + 1;
                    start = ' ';
                }
            }
        } else {
            if (end <= start) {
                throw new java.lang.IllegalArgumentException((((("Parameter end (" + end) + ") must be greater than start (") + start) + ")"));
            } 
        }
        final char[] buffer = new char[count];
        final int gap = end - start;
        while ((count--) != 0) {
            char ch;
            if (chars == null) {
                ch = ((char)((random.nextInt(gap)) + start));
            } else {
                ch = chars[((random.nextInt(gap)) + start)];
            }
            if (((letters && (java.lang.Character.isLetter(ch))) || (numbers && (java.lang.Character.isDigit(ch)))) || ((!letters) && (!numbers))) {
                if ((ch >= 56320) && (ch <= 57343)) {
                    if (count == 0) {
                        count++;
                    } else {
                        buffer[count] = ch;
                        count--;
                        buffer[count] = ((char)(55296 + (random.nextInt(128))));
                    }
                } else if ((ch >= 55296) && (ch <= 56191)) {
                    if (count == 0) {
                        count++;
                    } else {
                        buffer[count] = ((char)(56320 + (random.nextInt(128))));
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
        return ((_returnReplacementOperatorHotSpot2884.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer)));
    }

    public static java.lang.String random(final int count, final java.lang.String chars) {
        if (chars == null) {
            return ((_returnReplacementOperatorHotSpot2885.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, 0, 0, false, false, null, org.apache.commons.lang3.RandomStringUtils.RANDOM)));
        } 
        return ((_returnReplacementOperatorHotSpot2886.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, chars.toCharArray())));
    }

    public static java.lang.String random(final int count, final char... chars) {
        if (chars == null) {
            return ((_returnReplacementOperatorHotSpot2879.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, 0, 0, false, false, null, org.apache.commons.lang3.RandomStringUtils.RANDOM)));
        } 
        return ((_returnReplacementOperatorHotSpot2880.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomStringUtils.random(count, 0, chars.length, false, false, chars, org.apache.commons.lang3.RandomStringUtils.RANDOM)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2877 = metamutator.Selector.of(2877,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2877");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2878 = metamutator.Selector.of(2878,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2878");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2879 = metamutator.Selector.of(2879,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2879");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2880 = metamutator.Selector.of(2880,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2880");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2881 = metamutator.Selector.of(2881,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2881");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2882 = metamutator.Selector.of(2882,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2882");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2883 = metamutator.Selector.of(2883,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2883");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2884 = metamutator.Selector.of(2884,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2884");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2885 = metamutator.Selector.of(2885,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2885");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2886 = metamutator.Selector.of(2886,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2886");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2887 = metamutator.Selector.of(2887,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2887");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2888 = metamutator.Selector.of(2888,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2888");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2889 = metamutator.Selector.of(2889,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2889");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2890 = metamutator.Selector.of(2890,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomStringUtils.class).id("_returnReplacementOperatorHotSpot2890");
}

