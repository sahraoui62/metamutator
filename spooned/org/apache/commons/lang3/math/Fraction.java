package org.apache.commons.lang3.math;


public final class Fraction extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.math.Fraction> {
    private static final long serialVersionUID = 65382027393090L;

    public static final org.apache.commons.lang3.math.Fraction ZERO = new org.apache.commons.lang3.math.Fraction(0 , 1);

    public static final org.apache.commons.lang3.math.Fraction ONE = new org.apache.commons.lang3.math.Fraction(1 , 1);

    public static final org.apache.commons.lang3.math.Fraction ONE_HALF = new org.apache.commons.lang3.math.Fraction(1 , 2);

    public static final org.apache.commons.lang3.math.Fraction ONE_THIRD = new org.apache.commons.lang3.math.Fraction(1 , 3);

    public static final org.apache.commons.lang3.math.Fraction TWO_THIRDS = new org.apache.commons.lang3.math.Fraction(2 , 3);

    public static final org.apache.commons.lang3.math.Fraction ONE_QUARTER = new org.apache.commons.lang3.math.Fraction(1 , 4);

    public static final org.apache.commons.lang3.math.Fraction TWO_QUARTERS = new org.apache.commons.lang3.math.Fraction(2 , 4);

    public static final org.apache.commons.lang3.math.Fraction THREE_QUARTERS = new org.apache.commons.lang3.math.Fraction(3 , 4);

    public static final org.apache.commons.lang3.math.Fraction ONE_FIFTH = new org.apache.commons.lang3.math.Fraction(1 , 5);

    public static final org.apache.commons.lang3.math.Fraction TWO_FIFTHS = new org.apache.commons.lang3.math.Fraction(2 , 5);

    public static final org.apache.commons.lang3.math.Fraction THREE_FIFTHS = new org.apache.commons.lang3.math.Fraction(3 , 5);

    public static final org.apache.commons.lang3.math.Fraction FOUR_FIFTHS = new org.apache.commons.lang3.math.Fraction(4 , 5);

    private final int numerator;

    private final int denominator;

    private transient int hashCode = 0;

    private transient java.lang.String toString = null;

    private transient java.lang.String toProperString = null;

    private Fraction(final int numerator ,final int denominator) {
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new java.lang.ArithmeticException("The denominator must not be zero");
        } 
        if (denominator < 0) {
            if ((numerator == (java.lang.Integer.MIN_VALUE)) || (denominator == (java.lang.Integer.MIN_VALUE))) {
                throw new java.lang.ArithmeticException("overflow: can't negate");
            } 
            numerator = -numerator;
            denominator = -denominator;
        } 
        return ((_returnReplacementOperatorHotSpot612.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(numerator , denominator)));
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(final int whole, final int numerator, final int denominator) {
        if (denominator == 0) {
            throw new java.lang.ArithmeticException("The denominator must not be zero");
        } 
        if (denominator < 0) {
            throw new java.lang.ArithmeticException("The denominator must not be negative");
        } 
        if (numerator < 0) {
            throw new java.lang.ArithmeticException("The numerator must not be negative");
        } 
        long numeratorValue;
        if (whole < 0) {
            numeratorValue = (whole * ((long)(denominator))) - numerator;
        } else {
            numeratorValue = (whole * ((long)(denominator))) + numerator;
        }
        if ((numeratorValue < (java.lang.Integer.MIN_VALUE)) || (numeratorValue > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("Numerator too large to represent as an Integer.");
        } 
        return ((_returnReplacementOperatorHotSpot613.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(((int)(numeratorValue)) , denominator)));
    }

    public static org.apache.commons.lang3.math.Fraction getReducedFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new java.lang.ArithmeticException("The denominator must not be zero");
        } 
        if (numerator == 0) {
            return ((_returnReplacementOperatorHotSpot618.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.ZERO));
        } 
        if ((denominator == (java.lang.Integer.MIN_VALUE)) && ((numerator & 1) == 0)) {
            numerator /= 2;
            denominator /= 2;
        } 
        if (denominator < 0) {
            if ((numerator == (java.lang.Integer.MIN_VALUE)) || (denominator == (java.lang.Integer.MIN_VALUE))) {
                throw new java.lang.ArithmeticException("overflow: can't negate");
            } 
            numerator = -numerator;
            denominator = -denominator;
        } 
        final int gcd = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return ((_returnReplacementOperatorHotSpot619.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(numerator , denominator)));
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(double value) {
        final int sign = value < 0 ? -1 : 1;
        value = java.lang.Math.abs(value);
        if ((value > (java.lang.Integer.MAX_VALUE)) || (java.lang.Double.isNaN(value))) {
            throw new java.lang.ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
        } 
        final int wholeNumber = ((int)(value));
        value -= wholeNumber;
        int numer0 = 0;
        int denom0 = 1;
        int numer1 = 1;
        int denom1 = 0;
        int numer2 = 0;
        int denom2 = 0;
        int a1 = ((int)(value));
        int a2 = 0;
        double x1 = 1;
        double x2 = 0;
        double y1 = value - a1;
        double y2 = 0;
        double delta1;
        double delta2 = java.lang.Double.MAX_VALUE;
        double fraction;
        int i = 1;
        do {
            delta1 = delta2;
            a2 = ((int)(x1 / y1));
            x2 = y1;
            y2 = x1 - (a2 * y1);
            numer2 = (a1 * numer1) + numer0;
            denom2 = (a1 * denom1) + denom0;
            fraction = ((double)(numer2)) / ((double)(denom2));
            delta2 = java.lang.Math.abs((value - fraction));
            a1 = a2;
            x1 = x2;
            y1 = y2;
            numer0 = numer1;
            denom0 = denom1;
            numer1 = numer2;
            denom1 = denom2;
            i++;
        } while ((((delta1 > delta2) && (denom2 <= 10000)) && (denom2 > 0)) && (i < 25) );
        if (i == 25) {
            throw new java.lang.ArithmeticException("Unable to convert double to fraction");
        } 
        return ((_returnReplacementOperatorHotSpot611.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getReducedFraction(((numer0 + (wholeNumber * denom0)) * sign), denom0)));
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The string must not be null");
        } 
        int pos = str.indexOf('.');
        if (pos >= 0) {
            return ((_returnReplacementOperatorHotSpot614.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(java.lang.Double.parseDouble(str))));
        } 
        pos = str.indexOf(' ');
        if (pos > 0) {
            final int whole = java.lang.Integer.parseInt(str.substring(0, pos));
            str = str.substring((pos + 1));
            pos = str.indexOf('/');
            if (pos < 0) {
                throw new java.lang.NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            } 
            final int numer = java.lang.Integer.parseInt(str.substring(0, pos));
            final int denom = java.lang.Integer.parseInt(str.substring((pos + 1)));
            return ((_returnReplacementOperatorHotSpot615.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(whole, numer, denom)));
        } 
        pos = str.indexOf('/');
        if (pos < 0) {
            return ((_returnReplacementOperatorHotSpot616.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(java.lang.Integer.parseInt(str), 1)));
        } 
        final int numer = java.lang.Integer.parseInt(str.substring(0, pos));
        final int denom = java.lang.Integer.parseInt(str.substring((pos + 1)));
        return ((_returnReplacementOperatorHotSpot617.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(numer, denom)));
    }

    public int getNumerator() {
        return ((_returnReplacementOperatorHotSpot589.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot589.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot589.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (numerator));
    }

    public int getDenominator() {
        return ((_returnReplacementOperatorHotSpot588.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot588.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot588.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (denominator));
    }

    public int getProperNumerator() {
        return ((_returnReplacementOperatorHotSpot590.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot590.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot590.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.Math.abs(((numerator) % (denominator)))));
    }

    public int getProperWhole() {
        return ((_returnReplacementOperatorHotSpot591.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot591.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot591.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((numerator) / (denominator)));
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperatorHotSpot596.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot596.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot596.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((numerator) / (denominator)));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperatorHotSpot602.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long)(numerator)) / (denominator)));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperatorHotSpot581.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((float)(numerator)) / ((float)(denominator))));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperatorHotSpot580.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((double)(numerator)) / ((double)(denominator))));
    }

    public org.apache.commons.lang3.math.Fraction reduce() {
        if ((numerator) == 0) {
            return ((_returnReplacementOperatorHotSpot631.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (equals(org.apache.commons.lang3.math.Fraction.ZERO) ? this : org.apache.commons.lang3.math.Fraction.ZERO));
        } 
        final int gcd = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(java.lang.Math.abs(numerator), denominator);
        if (gcd == 1) {
            return ((_returnReplacementOperatorHotSpot632.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperatorHotSpot633.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(((numerator) / gcd), ((denominator) / gcd))));
    }

    public org.apache.commons.lang3.math.Fraction invert() {
        if ((numerator) == 0) {
            throw new java.lang.ArithmeticException("Unable to invert zero.");
        } 
        if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: can't negate numerator");
        } 
        if ((numerator) < 0) {
            return ((_returnReplacementOperatorHotSpot620.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(-(denominator) , -(numerator))));
        } 
        return ((_returnReplacementOperatorHotSpot621.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(denominator , numerator)));
    }

    public org.apache.commons.lang3.math.Fraction negate() {
        if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: too large to negate");
        } 
        return ((_returnReplacementOperatorHotSpot624.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(-(numerator) , denominator)));
    }

    public org.apache.commons.lang3.math.Fraction abs() {
        if ((numerator) >= 0) {
            return ((_returnReplacementOperatorHotSpot603.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperatorHotSpot604.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (negate()));
    }

    public org.apache.commons.lang3.math.Fraction pow(final int power) {
        if (power == 1) {
            return ((_returnReplacementOperatorHotSpot625.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } else if (power == 0) {
            return ((_returnReplacementOperatorHotSpot626.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.ONE));
        } else if (power < 0) {
            if (power == (java.lang.Integer.MIN_VALUE)) {
                return ((_returnReplacementOperatorHotSpot627.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (invert().pow(2).pow(-(power / 2))));
            } 
            return ((_returnReplacementOperatorHotSpot628.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (invert().pow(-power)));
        } else {
            final org.apache.commons.lang3.math.Fraction f = multiplyBy(this);
            if ((power % 2) == 0) {
                return ((_returnReplacementOperatorHotSpot629.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (f.pow((power / 2))));
            } 
            return ((_returnReplacementOperatorHotSpot630.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (f.pow((power / 2)).multiplyBy(this)));
        }
    }

    private static int greatestCommonDivisor(int u, int v) {
        if ((u == 0) || (v == 0)) {
            if ((u == (java.lang.Integer.MIN_VALUE)) || (v == (java.lang.Integer.MIN_VALUE))) {
                throw new java.lang.ArithmeticException("overflow: gcd is 2^31");
            } 
            return ((_returnReplacementOperatorHotSpot592.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot592.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot592.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((java.lang.Math.abs(u)) + (java.lang.Math.abs(v))));
        } 
        if (((java.lang.Math.abs(u)) == 1) || ((java.lang.Math.abs(v)) == 1)) {
            return ((_returnReplacementOperatorHotSpot593.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot593.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot593.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        } 
        if (u > 0) {
            u = -u;
        } 
        if (v > 0) {
            v = -v;
        } 
        int k = 0;
        while ((((u & 1) == 0) && ((v & 1) == 0)) && (k < 31)) {
            u /= 2;
            v /= 2;
            k++;
        }
        if (k == 31) {
            throw new java.lang.ArithmeticException("overflow: gcd is 2^31");
        } 
        int t = (u & 1) == 1 ? v : -(u / 2);
        do {
            while ((t & 1) == 0) {
                t /= 2;
            }
            if (t > 0) {
                u = -t;
            } else {
                v = t;
            }
            t = (v - u) / 2;
        } while (t != 0 );
        return ((_returnReplacementOperatorHotSpot594.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot594.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot594.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((-u) * (1 << k)));
    }

    private static int mulAndCheck(final int x, final int y) {
        final long m = ((long)(x)) * ((long)(y));
        if ((m < (java.lang.Integer.MIN_VALUE)) || (m > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: mul");
        } 
        return ((_returnReplacementOperatorHotSpot597.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int)(m))));
    }

    private static int mulPosAndCheck(final int x, final int y) {
        final long m = ((long)(x)) * ((long)(y));
        if (m > (java.lang.Integer.MAX_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: mulPos");
        } 
        return ((_returnReplacementOperatorHotSpot598.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int)(m))));
    }

    private static int addAndCheck(final int x, final int y) {
        final long s = ((long)(x)) + ((long)(y));
        if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: add");
        } 
        return ((_returnReplacementOperatorHotSpot582.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int)(s))));
    }

    private static int subAndCheck(final int x, final int y) {
        final long s = ((long)(x)) - ((long)(y));
        if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: add");
        } 
        return ((_returnReplacementOperatorHotSpot599.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int)(s))));
    }

    public org.apache.commons.lang3.math.Fraction add(final org.apache.commons.lang3.math.Fraction fraction) {
        return ((_returnReplacementOperatorHotSpot605.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (addSub(fraction, true)));
    }

    public org.apache.commons.lang3.math.Fraction subtract(final org.apache.commons.lang3.math.Fraction fraction) {
        return ((_returnReplacementOperatorHotSpot634.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (addSub(fraction, false)));
    }

    private org.apache.commons.lang3.math.Fraction addSub(final org.apache.commons.lang3.math.Fraction fraction, final boolean isAdd) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if ((numerator) == 0) {
            return ((_returnReplacementOperatorHotSpot606.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (isAdd ? fraction : fraction.negate()));
        } 
        if ((fraction.numerator) == 0) {
            return ((_returnReplacementOperatorHotSpot607.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        final int d1 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(denominator, fraction.denominator);
        if (d1 == 1) {
            final int uvp = org.apache.commons.lang3.math.Fraction.mulAndCheck(numerator, fraction.denominator);
            final int upv = org.apache.commons.lang3.math.Fraction.mulAndCheck(fraction.numerator, denominator);
            return ((_returnReplacementOperatorHotSpot608.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction((isAdd ? org.apache.commons.lang3.math.Fraction.addAndCheck(uvp, upv) : org.apache.commons.lang3.math.Fraction.subAndCheck(uvp, upv)) , org.apache.commons.lang3.math.Fraction.mulPosAndCheck(denominator, fraction.denominator))));
        } 
        final java.math.BigInteger uvp = java.math.BigInteger.valueOf(numerator).multiply(java.math.BigInteger.valueOf(((fraction.denominator) / d1)));
        final java.math.BigInteger upv = java.math.BigInteger.valueOf(fraction.numerator).multiply(java.math.BigInteger.valueOf(((denominator) / d1)));
        final java.math.BigInteger t = isAdd ? uvp.add(upv) : uvp.subtract(upv);
        final int tmodd1 = t.mod(java.math.BigInteger.valueOf(d1)).intValue();
        final int d2 = tmodd1 == 0 ? d1 : org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(tmodd1, d1);
        final java.math.BigInteger w = t.divide(java.math.BigInteger.valueOf(d2));
        if ((w.bitLength()) > 31) {
            throw new java.lang.ArithmeticException("overflow: numerator too large after multiply");
        } 
        return ((_returnReplacementOperatorHotSpot609.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(w.intValue() , org.apache.commons.lang3.math.Fraction.mulPosAndCheck(((denominator) / d1), ((fraction.denominator) / d2)))));
    }

    public org.apache.commons.lang3.math.Fraction multiplyBy(final org.apache.commons.lang3.math.Fraction fraction) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if (((numerator) == 0) || ((fraction.numerator) == 0)) {
            return ((_returnReplacementOperatorHotSpot622.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.ZERO));
        } 
        final int d1 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(numerator, fraction.denominator);
        final int d2 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(fraction.numerator, denominator);
        return ((_returnReplacementOperatorHotSpot623.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getReducedFraction(org.apache.commons.lang3.math.Fraction.mulAndCheck(((numerator) / d1), ((fraction.numerator) / d2)), org.apache.commons.lang3.math.Fraction.mulPosAndCheck(((denominator) / d2), ((fraction.denominator) / d1)))));
    }

    public org.apache.commons.lang3.math.Fraction divideBy(final org.apache.commons.lang3.math.Fraction fraction) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if ((fraction.numerator) == 0) {
            throw new java.lang.ArithmeticException("The fraction to divide by must not be zero");
        } 
        return ((_returnReplacementOperatorHotSpot610.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (multiplyBy(fraction.invert())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperatorHotSpot577.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((obj instanceof org.apache.commons.lang3.math.Fraction) == false) {
            return ((_returnReplacementOperatorHotSpot578.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.math.Fraction other = ((org.apache.commons.lang3.math.Fraction)(obj));
        return ((_returnReplacementOperatorHotSpot579.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((getNumerator()) == (other.getNumerator())) && ((getDenominator()) == (other.getDenominator()))));
    }

    @java.lang.Override
    public int hashCode() {
        if ((hashCode) == 0) {
            hashCode = (37 * ((37 * 17) + (getNumerator()))) + (getDenominator());
        } 
        return ((_returnReplacementOperatorHotSpot595.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot595.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot595.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (hashCode));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.math.Fraction other) {
        if ((this) == other) {
            return ((_returnReplacementOperatorHotSpot583.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot583.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot583.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        if (((numerator) == (other.numerator)) && ((denominator) == (other.denominator))) {
            return ((_returnReplacementOperatorHotSpot584.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot584.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot584.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        final long first = ((long)(numerator)) * ((long)(other.denominator));
        final long second = ((long)(other.numerator)) * ((long)(denominator));
        if (first == second) {
            return ((_returnReplacementOperatorHotSpot585.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot585.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot585.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } else if (first < second) {
            return ((_returnReplacementOperatorHotSpot586.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot586.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot586.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperatorHotSpot587.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot587.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot587.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((toString) == null) {
            toString = ((getNumerator()) + "/") + (getDenominator());
        } 
        return ((_returnReplacementOperatorHotSpot601.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toString));
    }

    public java.lang.String toProperString() {
        if ((toProperString) == null) {
            if ((numerator) == 0) {
                toProperString = "0";
            } else if ((numerator) == (denominator)) {
                toProperString = "1";
            } else if ((numerator) == ((-1) * (denominator))) {
                toProperString = "-1";
            } else if (((numerator) > 0 ? -(numerator) : numerator) < (-(denominator))) {
                final int properNumerator = getProperNumerator();
                if (properNumerator == 0) {
                    toProperString = java.lang.Integer.toString(getProperWhole());
                } else {
                    toProperString = ((((getProperWhole()) + " ") + properNumerator) + "/") + (getDenominator());
                }
            } else {
                toProperString = ((getNumerator()) + "/") + (getDenominator());
            }
        } 
        return ((_returnReplacementOperatorHotSpot600.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toProperString));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot577 = metamutator.Selector.of(577,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot577");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot578 = metamutator.Selector.of(578,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot578");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot579 = metamutator.Selector.of(579,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot579");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot580 = metamutator.Selector.of(580,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot580");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot581 = metamutator.Selector.of(581,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot581");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot582 = metamutator.Selector.of(582,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot582");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot583 = metamutator.Selector.of(583,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot583");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot584 = metamutator.Selector.of(584,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot584");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot585 = metamutator.Selector.of(585,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot585");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot586 = metamutator.Selector.of(586,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot586");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot587 = metamutator.Selector.of(587,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot587");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot588 = metamutator.Selector.of(588,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot588");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot589 = metamutator.Selector.of(589,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot589");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot590 = metamutator.Selector.of(590,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot590");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot591 = metamutator.Selector.of(591,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot591");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot592 = metamutator.Selector.of(592,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot592");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot593 = metamutator.Selector.of(593,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot593");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot594 = metamutator.Selector.of(594,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot594");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot595 = metamutator.Selector.of(595,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot595");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot596 = metamutator.Selector.of(596,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot596");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot597 = metamutator.Selector.of(597,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot597");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot598 = metamutator.Selector.of(598,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot598");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot599 = metamutator.Selector.of(599,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot599");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot600 = metamutator.Selector.of(600,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot600");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot601 = metamutator.Selector.of(601,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot601");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot602 = metamutator.Selector.of(602,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot602");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot603 = metamutator.Selector.of(603,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot603");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot604 = metamutator.Selector.of(604,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot604");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot605 = metamutator.Selector.of(605,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot605");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot606 = metamutator.Selector.of(606,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot606");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot607 = metamutator.Selector.of(607,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot607");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot608 = metamutator.Selector.of(608,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot608");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot609 = metamutator.Selector.of(609,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot609");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot610 = metamutator.Selector.of(610,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot610");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot611 = metamutator.Selector.of(611,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot611");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot612 = metamutator.Selector.of(612,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot612");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot613 = metamutator.Selector.of(613,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot613");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot614 = metamutator.Selector.of(614,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot614");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot615 = metamutator.Selector.of(615,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot615");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot616 = metamutator.Selector.of(616,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot616");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot617 = metamutator.Selector.of(617,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot617");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot618 = metamutator.Selector.of(618,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot618");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot619 = metamutator.Selector.of(619,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot619");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot620 = metamutator.Selector.of(620,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot620");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot621 = metamutator.Selector.of(621,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot621");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot622 = metamutator.Selector.of(622,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot622");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot623 = metamutator.Selector.of(623,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot623");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot624 = metamutator.Selector.of(624,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot624");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot625 = metamutator.Selector.of(625,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot625");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot626 = metamutator.Selector.of(626,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot626");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot627 = metamutator.Selector.of(627,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot627");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot628 = metamutator.Selector.of(628,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot628");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot629 = metamutator.Selector.of(629,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot629");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot630 = metamutator.Selector.of(630,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot630");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot631 = metamutator.Selector.of(631,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot631");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot632 = metamutator.Selector.of(632,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot632");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot633 = metamutator.Selector.of(633,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot633");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot634 = metamutator.Selector.of(634,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperatorHotSpot634");
}

