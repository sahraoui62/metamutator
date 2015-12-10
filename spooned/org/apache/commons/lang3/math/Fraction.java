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
        return new org.apache.commons.lang3.math.Fraction(numerator , denominator);
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
            numeratorValue = ((_arithmeticOperatorHotSpot64.is("PLUS")) ? ((whole + ((long)(denominator)))) : (_arithmeticOperatorHotSpot64.is("MINUS")) ? ((whole - ((long)(denominator)))) : (_arithmeticOperatorHotSpot64.is("MUL")) ? ((whole * ((long)(denominator)))) :  ((whole / ((long)(denominator))))) - numerator;
        } else {
            numeratorValue = ((_arithmeticOperatorHotSpot65.is("PLUS")) ? ((whole + ((long)(denominator)))) : (_arithmeticOperatorHotSpot65.is("MINUS")) ? ((whole - ((long)(denominator)))) : (_arithmeticOperatorHotSpot65.is("MUL")) ? ((whole * ((long)(denominator)))) :  ((whole / ((long)(denominator))))) + numerator;
        }
        if ((numeratorValue < (java.lang.Integer.MIN_VALUE)) || (numeratorValue > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("Numerator too large to represent as an Integer.");
        } 
        return new org.apache.commons.lang3.math.Fraction(((int)(numeratorValue)) , denominator);
    }

    public static org.apache.commons.lang3.math.Fraction getReducedFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new java.lang.ArithmeticException("The denominator must not be zero");
        } 
        if (numerator == 0) {
            return ZERO;
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
        return new org.apache.commons.lang3.math.Fraction(numerator , denominator);
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
        double y1 = ((_arithmeticOperatorHotSpot56.is("PLUS")) ? (value + a1) : (_arithmeticOperatorHotSpot56.is("MINUS")) ? (value - a1) : (_arithmeticOperatorHotSpot56.is("MUL")) ? (value * a1) :  (value / a1));
        double y2 = 0;
        double delta1;
        double delta2 = java.lang.Double.MAX_VALUE;
        double fraction;
        int i = 1;
        do {
            delta1 = delta2;
            a2 = ((_arithmeticOperatorHotSpot57.is("PLUS")) ? (((int)(x1 + y1))) : (_arithmeticOperatorHotSpot57.is("MINUS")) ? (((int)(x1 - y1))) : (_arithmeticOperatorHotSpot57.is("MUL")) ? (((int)(x1 * y1))) :  (((int)(x1 / y1))));
            x2 = y1;
            y2 = x1 - ((_arithmeticOperatorHotSpot58.is("PLUS")) ? ((a2 + y1)) : (_arithmeticOperatorHotSpot58.is("MINUS")) ? ((a2 - y1)) : (_arithmeticOperatorHotSpot58.is("MUL")) ? ((a2 * y1)) :  ((a2 / y1)));
            numer2 = ((_arithmeticOperatorHotSpot59.is("PLUS")) ? ((a1 + numer1)) : (_arithmeticOperatorHotSpot59.is("MINUS")) ? ((a1 - numer1)) : (_arithmeticOperatorHotSpot59.is("MUL")) ? ((a1 * numer1)) :  ((a1 / numer1))) + numer0;
            denom2 = ((_arithmeticOperatorHotSpot60.is("PLUS")) ? ((a1 + denom1)) : (_arithmeticOperatorHotSpot60.is("MINUS")) ? ((a1 - denom1)) : (_arithmeticOperatorHotSpot60.is("MUL")) ? ((a1 * denom1)) :  ((a1 / denom1))) + denom0;
            fraction = ((_arithmeticOperatorHotSpot61.is("PLUS")) ? (((double)(numer2)) + ((double)(denom2))) : (_arithmeticOperatorHotSpot61.is("MINUS")) ? (((double)(numer2)) - ((double)(denom2))) : (_arithmeticOperatorHotSpot61.is("MUL")) ? (((double)(numer2)) * ((double)(denom2))) :  (((double)(numer2)) / ((double)(denom2))));
            delta2 = java.lang.Math.abs(((_arithmeticOperatorHotSpot62.is("PLUS")) ? ((value + fraction)) : (_arithmeticOperatorHotSpot62.is("MINUS")) ? ((value - fraction)) : (_arithmeticOperatorHotSpot62.is("MUL")) ? ((value * fraction)) :  ((value / fraction))));
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
        return org.apache.commons.lang3.math.Fraction.getReducedFraction(((numer0 + ((_arithmeticOperatorHotSpot63.is("PLUS")) ? ((wholeNumber + denom0)) : (_arithmeticOperatorHotSpot63.is("MINUS")) ? ((wholeNumber - denom0)) : (_arithmeticOperatorHotSpot63.is("MUL")) ? ((wholeNumber * denom0)) :  ((wholeNumber / denom0)))) * sign), denom0);
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The string must not be null");
        } 
        int pos = str.indexOf('.');
        if (pos >= 0) {
            return org.apache.commons.lang3.math.Fraction.getFraction(java.lang.Double.parseDouble(str));
        } 
        pos = str.indexOf(' ');
        if (pos > 0) {
            final int whole = java.lang.Integer.parseInt(str.substring(0, pos));
            str = str.substring(((_arithmeticOperatorHotSpot66.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot66.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot66.is("MUL")) ? ((pos * 1)) :  ((pos / 1))));
            pos = str.indexOf('/');
            if (pos < 0) {
                throw new java.lang.NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            } 
            final int numer = java.lang.Integer.parseInt(str.substring(0, pos));
            final int denom = java.lang.Integer.parseInt(str.substring(((_arithmeticOperatorHotSpot67.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot67.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot67.is("MUL")) ? ((pos * 1)) :  ((pos / 1)))));
            return org.apache.commons.lang3.math.Fraction.getFraction(whole, numer, denom);
        } 
        pos = str.indexOf('/');
        if (pos < 0) {
            return org.apache.commons.lang3.math.Fraction.getFraction(java.lang.Integer.parseInt(str), 1);
        } 
        final int numer = java.lang.Integer.parseInt(str.substring(0, pos));
        final int denom = java.lang.Integer.parseInt(str.substring(((_arithmeticOperatorHotSpot68.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot68.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot68.is("MUL")) ? ((pos * 1)) :  ((pos / 1)))));
        return org.apache.commons.lang3.math.Fraction.getFraction(numer, denom);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getProperNumerator() {
        return java.lang.Math.abs(((numerator) % (denominator)));
    }

    public int getProperWhole() {
        return ((_arithmeticOperatorHotSpot40.is("PLUS")) ? ((numerator) + (denominator)) : (_arithmeticOperatorHotSpot40.is("MINUS")) ? ((numerator) - (denominator)) : (_arithmeticOperatorHotSpot40.is("MUL")) ? ((numerator) * (denominator)) :  ((numerator) / (denominator)));
    }

    @java.lang.Override
    public int intValue() {
        return ((_arithmeticOperatorHotSpot46.is("PLUS")) ? ((numerator) + (denominator)) : (_arithmeticOperatorHotSpot46.is("MINUS")) ? ((numerator) - (denominator)) : (_arithmeticOperatorHotSpot46.is("MUL")) ? ((numerator) * (denominator)) :  ((numerator) / (denominator)));
    }

    @java.lang.Override
    public long longValue() {
        return ((_arithmeticOperatorHotSpot51.is("PLUS")) ? (((long)(numerator)) + (denominator)) : (_arithmeticOperatorHotSpot51.is("MINUS")) ? (((long)(numerator)) - (denominator)) : (_arithmeticOperatorHotSpot51.is("MUL")) ? (((long)(numerator)) * (denominator)) :  (((long)(numerator)) / (denominator)));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_arithmeticOperatorHotSpot36.is("PLUS")) ? (((float)(numerator)) + ((float)(denominator))) : (_arithmeticOperatorHotSpot36.is("MINUS")) ? (((float)(numerator)) - ((float)(denominator))) : (_arithmeticOperatorHotSpot36.is("MUL")) ? (((float)(numerator)) * ((float)(denominator))) :  (((float)(numerator)) / ((float)(denominator))));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_arithmeticOperatorHotSpot35.is("PLUS")) ? (((double)(numerator)) + ((double)(denominator))) : (_arithmeticOperatorHotSpot35.is("MINUS")) ? (((double)(numerator)) - ((double)(denominator))) : (_arithmeticOperatorHotSpot35.is("MUL")) ? (((double)(numerator)) * ((double)(denominator))) :  (((double)(numerator)) / ((double)(denominator))));
    }

    public org.apache.commons.lang3.math.Fraction reduce() {
        if ((numerator) == 0) {
            return equals(ZERO) ? this : ZERO;
        } 
        final int gcd = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(java.lang.Math.abs(numerator), denominator);
        if (gcd == 1) {
            return this;
        } 
        return org.apache.commons.lang3.math.Fraction.getFraction(((_arithmeticOperatorHotSpot76.is("PLUS")) ? (((numerator) + gcd)) : (_arithmeticOperatorHotSpot76.is("MINUS")) ? (((numerator) - gcd)) : (_arithmeticOperatorHotSpot76.is("MUL")) ? (((numerator) * gcd)) :  (((numerator) / gcd))), ((_arithmeticOperatorHotSpot77.is("PLUS")) ? (((denominator) + gcd)) : (_arithmeticOperatorHotSpot77.is("MINUS")) ? (((denominator) - gcd)) : (_arithmeticOperatorHotSpot77.is("MUL")) ? (((denominator) * gcd)) :  (((denominator) / gcd))));
    }

    public org.apache.commons.lang3.math.Fraction invert() {
        if ((numerator) == 0) {
            throw new java.lang.ArithmeticException("Unable to invert zero.");
        } 
        if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: can't negate numerator");
        } 
        if ((numerator) < 0) {
            return new org.apache.commons.lang3.math.Fraction(-(denominator) , -(numerator));
        } 
        return new org.apache.commons.lang3.math.Fraction(denominator , numerator);
    }

    public org.apache.commons.lang3.math.Fraction negate() {
        if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: too large to negate");
        } 
        return new org.apache.commons.lang3.math.Fraction(-(numerator) , denominator);
    }

    public org.apache.commons.lang3.math.Fraction abs() {
        if ((numerator) >= 0) {
            return this;
        } 
        return negate();
    }

    public org.apache.commons.lang3.math.Fraction pow(final int power) {
        if (power == 1) {
            return this;
        } else if (power == 0) {
            return ONE;
        } else if (power < 0) {
            if (power == (java.lang.Integer.MIN_VALUE)) {
                return invert().pow(2).pow(-((_arithmeticOperatorHotSpot73.is("PLUS")) ? ((power + 2)) : (_arithmeticOperatorHotSpot73.is("MINUS")) ? ((power - 2)) : (_arithmeticOperatorHotSpot73.is("MUL")) ? ((power * 2)) :  ((power / 2))));
            } 
            return invert().pow(-power);
        } else {
            final org.apache.commons.lang3.math.Fraction f = multiplyBy(this);
            if ((power % 2) == 0) {
                return f.pow(((_arithmeticOperatorHotSpot74.is("PLUS")) ? ((power + 2)) : (_arithmeticOperatorHotSpot74.is("MINUS")) ? ((power - 2)) : (_arithmeticOperatorHotSpot74.is("MUL")) ? ((power * 2)) :  ((power / 2))));
            } 
            return f.pow(((_arithmeticOperatorHotSpot75.is("PLUS")) ? ((power + 2)) : (_arithmeticOperatorHotSpot75.is("MINUS")) ? ((power - 2)) : (_arithmeticOperatorHotSpot75.is("MUL")) ? ((power * 2)) :  ((power / 2)))).multiplyBy(this);
        }
    }

    private static int greatestCommonDivisor(int u, int v) {
        if ((u == 0) || (v == 0)) {
            if ((u == (java.lang.Integer.MIN_VALUE)) || (v == (java.lang.Integer.MIN_VALUE))) {
                throw new java.lang.ArithmeticException("overflow: gcd is 2^31");
            } 
            return ((_arithmeticOperatorHotSpot41.is("PLUS")) ? ((java.lang.Math.abs(u)) + (java.lang.Math.abs(v))) : (_arithmeticOperatorHotSpot41.is("MINUS")) ? ((java.lang.Math.abs(u)) - (java.lang.Math.abs(v))) : (_arithmeticOperatorHotSpot41.is("MUL")) ? ((java.lang.Math.abs(u)) * (java.lang.Math.abs(v))) :  ((java.lang.Math.abs(u)) / (java.lang.Math.abs(v))));
        } 
        if (((java.lang.Math.abs(u)) == 1) || ((java.lang.Math.abs(v)) == 1)) {
            return 1;
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
        int t = (u & 1) == 1 ? v : -((_arithmeticOperatorHotSpot42.is("PLUS")) ? ((u + 2)) : (_arithmeticOperatorHotSpot42.is("MINUS")) ? ((u - 2)) : (_arithmeticOperatorHotSpot42.is("MUL")) ? ((u * 2)) :  ((u / 2)));
        do {
            while ((t & 1) == 0) {
                t /= 2;
            }
            if (t > 0) {
                u = -t;
            } else {
                v = t;
            }
            t = ((_arithmeticOperatorHotSpot43.is("PLUS")) ? ((v + u)) : (_arithmeticOperatorHotSpot43.is("MINUS")) ? ((v - u)) : (_arithmeticOperatorHotSpot43.is("MUL")) ? ((v * u)) :  ((v / u))) / 2;
        } while (t != 0 );
        return ((_arithmeticOperatorHotSpot44.is("PLUS")) ? ((-u) + (1 << k)) : (_arithmeticOperatorHotSpot44.is("MINUS")) ? ((-u) - (1 << k)) : (_arithmeticOperatorHotSpot44.is("MUL")) ? ((-u) * (1 << k)) :  ((-u) / (1 << k)));
    }

    private static int mulAndCheck(final int x, final int y) {
        final long m = ((_arithmeticOperatorHotSpot47.is("PLUS")) ? (((long)(x)) + ((long)(y))) : (_arithmeticOperatorHotSpot47.is("MINUS")) ? (((long)(x)) - ((long)(y))) : (_arithmeticOperatorHotSpot47.is("MUL")) ? (((long)(x)) * ((long)(y))) :  (((long)(x)) / ((long)(y))));
        if ((m < (java.lang.Integer.MIN_VALUE)) || (m > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: mul");
        } 
        return ((int)(m));
    }

    private static int mulPosAndCheck(final int x, final int y) {
        final long m = ((_arithmeticOperatorHotSpot48.is("PLUS")) ? (((long)(x)) + ((long)(y))) : (_arithmeticOperatorHotSpot48.is("MINUS")) ? (((long)(x)) - ((long)(y))) : (_arithmeticOperatorHotSpot48.is("MUL")) ? (((long)(x)) * ((long)(y))) :  (((long)(x)) / ((long)(y))));
        if (m > (java.lang.Integer.MAX_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: mulPos");
        } 
        return ((int)(m));
    }

    private static int addAndCheck(final int x, final int y) {
        final long s = ((_arithmeticOperatorHotSpot37.is("PLUS")) ? (((long)(x)) + ((long)(y))) : (_arithmeticOperatorHotSpot37.is("MINUS")) ? (((long)(x)) - ((long)(y))) : (_arithmeticOperatorHotSpot37.is("MUL")) ? (((long)(x)) * ((long)(y))) :  (((long)(x)) / ((long)(y))));
        if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: add");
        } 
        return ((int)(s));
    }

    private static int subAndCheck(final int x, final int y) {
        final long s = ((_arithmeticOperatorHotSpot49.is("PLUS")) ? (((long)(x)) + ((long)(y))) : (_arithmeticOperatorHotSpot49.is("MINUS")) ? (((long)(x)) - ((long)(y))) : (_arithmeticOperatorHotSpot49.is("MUL")) ? (((long)(x)) * ((long)(y))) :  (((long)(x)) / ((long)(y))));
        if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: add");
        } 
        return ((int)(s));
    }

    public org.apache.commons.lang3.math.Fraction add(final org.apache.commons.lang3.math.Fraction fraction) {
        return addSub(fraction, true);
    }

    public org.apache.commons.lang3.math.Fraction subtract(final org.apache.commons.lang3.math.Fraction fraction) {
        return addSub(fraction, false);
    }

    private org.apache.commons.lang3.math.Fraction addSub(final org.apache.commons.lang3.math.Fraction fraction, final boolean isAdd) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if ((numerator) == 0) {
            return isAdd ? fraction : fraction.negate();
        } 
        if ((fraction.numerator) == 0) {
            return this;
        } 
        final int d1 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(denominator, fraction.denominator);
        if (d1 == 1) {
            final int uvp = org.apache.commons.lang3.math.Fraction.mulAndCheck(numerator, fraction.denominator);
            final int upv = org.apache.commons.lang3.math.Fraction.mulAndCheck(fraction.numerator, denominator);
            return new org.apache.commons.lang3.math.Fraction((isAdd ? org.apache.commons.lang3.math.Fraction.addAndCheck(uvp, upv) : org.apache.commons.lang3.math.Fraction.subAndCheck(uvp, upv)) , org.apache.commons.lang3.math.Fraction.mulPosAndCheck(denominator, fraction.denominator));
        } 
        final java.math.BigInteger uvp = java.math.BigInteger.valueOf(numerator).multiply(java.math.BigInteger.valueOf(((_arithmeticOperatorHotSpot52.is("PLUS")) ? (((fraction.denominator) + d1)) : (_arithmeticOperatorHotSpot52.is("MINUS")) ? (((fraction.denominator) - d1)) : (_arithmeticOperatorHotSpot52.is("MUL")) ? (((fraction.denominator) * d1)) :  (((fraction.denominator) / d1)))));
        final java.math.BigInteger upv = java.math.BigInteger.valueOf(fraction.numerator).multiply(java.math.BigInteger.valueOf(((_arithmeticOperatorHotSpot53.is("PLUS")) ? (((denominator) + d1)) : (_arithmeticOperatorHotSpot53.is("MINUS")) ? (((denominator) - d1)) : (_arithmeticOperatorHotSpot53.is("MUL")) ? (((denominator) * d1)) :  (((denominator) / d1)))));
        final java.math.BigInteger t = isAdd ? uvp.add(upv) : uvp.subtract(upv);
        final int tmodd1 = t.mod(java.math.BigInteger.valueOf(d1)).intValue();
        final int d2 = tmodd1 == 0 ? d1 : org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(tmodd1, d1);
        final java.math.BigInteger w = t.divide(java.math.BigInteger.valueOf(d2));
        if ((w.bitLength()) > 31) {
            throw new java.lang.ArithmeticException("overflow: numerator too large after multiply");
        } 
        return new org.apache.commons.lang3.math.Fraction(w.intValue() , org.apache.commons.lang3.math.Fraction.mulPosAndCheck(((_arithmeticOperatorHotSpot54.is("PLUS")) ? (((denominator) + d1)) : (_arithmeticOperatorHotSpot54.is("MINUS")) ? (((denominator) - d1)) : (_arithmeticOperatorHotSpot54.is("MUL")) ? (((denominator) * d1)) :  (((denominator) / d1))), ((_arithmeticOperatorHotSpot55.is("PLUS")) ? (((fraction.denominator) + d2)) : (_arithmeticOperatorHotSpot55.is("MINUS")) ? (((fraction.denominator) - d2)) : (_arithmeticOperatorHotSpot55.is("MUL")) ? (((fraction.denominator) * d2)) :  (((fraction.denominator) / d2)))));
    }

    public org.apache.commons.lang3.math.Fraction multiplyBy(final org.apache.commons.lang3.math.Fraction fraction) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if (((numerator) == 0) || ((fraction.numerator) == 0)) {
            return ZERO;
        } 
        final int d1 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(numerator, fraction.denominator);
        final int d2 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(fraction.numerator, denominator);
        return org.apache.commons.lang3.math.Fraction.getReducedFraction(org.apache.commons.lang3.math.Fraction.mulAndCheck(((_arithmeticOperatorHotSpot69.is("PLUS")) ? (((numerator) + d1)) : (_arithmeticOperatorHotSpot69.is("MINUS")) ? (((numerator) - d1)) : (_arithmeticOperatorHotSpot69.is("MUL")) ? (((numerator) * d1)) :  (((numerator) / d1))), ((_arithmeticOperatorHotSpot70.is("PLUS")) ? (((fraction.numerator) + d2)) : (_arithmeticOperatorHotSpot70.is("MINUS")) ? (((fraction.numerator) - d2)) : (_arithmeticOperatorHotSpot70.is("MUL")) ? (((fraction.numerator) * d2)) :  (((fraction.numerator) / d2)))), org.apache.commons.lang3.math.Fraction.mulPosAndCheck(((_arithmeticOperatorHotSpot71.is("PLUS")) ? (((denominator) + d2)) : (_arithmeticOperatorHotSpot71.is("MINUS")) ? (((denominator) - d2)) : (_arithmeticOperatorHotSpot71.is("MUL")) ? (((denominator) * d2)) :  (((denominator) / d2))), ((_arithmeticOperatorHotSpot72.is("PLUS")) ? (((fraction.denominator) + d1)) : (_arithmeticOperatorHotSpot72.is("MINUS")) ? (((fraction.denominator) - d1)) : (_arithmeticOperatorHotSpot72.is("MUL")) ? (((fraction.denominator) * d1)) :  (((fraction.denominator) / d1)))));
    }

    public org.apache.commons.lang3.math.Fraction divideBy(final org.apache.commons.lang3.math.Fraction fraction) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if ((fraction.numerator) == 0) {
            throw new java.lang.ArithmeticException("The fraction to divide by must not be zero");
        } 
        return multiplyBy(fraction.invert());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return true;
        } 
        if ((obj instanceof org.apache.commons.lang3.math.Fraction) == false) {
            return false;
        } 
        final org.apache.commons.lang3.math.Fraction other = ((org.apache.commons.lang3.math.Fraction)(obj));
        return ((getNumerator()) == (other.getNumerator())) && ((getDenominator()) == (other.getDenominator()));
    }

    @java.lang.Override
    public int hashCode() {
        if ((hashCode) == 0) {
            hashCode = (37 * (((_arithmeticOperatorHotSpot45.is("PLUS")) ? ((37 + 17)) : (_arithmeticOperatorHotSpot45.is("MINUS")) ? ((37 - 17)) : (_arithmeticOperatorHotSpot45.is("MUL")) ? ((37 * 17)) :  ((37 / 17))) + (getNumerator()))) + (getDenominator());
        } 
        return hashCode;
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.math.Fraction other) {
        if ((this) == other) {
            return 0;
        } 
        if (((numerator) == (other.numerator)) && ((denominator) == (other.denominator))) {
            return 0;
        } 
        final long first = ((_arithmeticOperatorHotSpot38.is("PLUS")) ? (((long)(numerator)) + ((long)(other.denominator))) : (_arithmeticOperatorHotSpot38.is("MINUS")) ? (((long)(numerator)) - ((long)(other.denominator))) : (_arithmeticOperatorHotSpot38.is("MUL")) ? (((long)(numerator)) * ((long)(other.denominator))) :  (((long)(numerator)) / ((long)(other.denominator))));
        final long second = ((_arithmeticOperatorHotSpot39.is("PLUS")) ? (((long)(other.numerator)) + ((long)(denominator))) : (_arithmeticOperatorHotSpot39.is("MINUS")) ? (((long)(other.numerator)) - ((long)(denominator))) : (_arithmeticOperatorHotSpot39.is("MUL")) ? (((long)(other.numerator)) * ((long)(denominator))) :  (((long)(other.numerator)) / ((long)(denominator))));
        if (first == second) {
            return 0;
        } else if (first < second) {
            return -1;
        } else {
            return 1;
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((toString) == null) {
            toString = ((getNumerator()) + "/") + (getDenominator());
        } 
        return toString;
    }

    public java.lang.String toProperString() {
        if ((toProperString) == null) {
            if ((numerator) == 0) {
                toProperString = "0";
            } else if ((numerator) == (denominator)) {
                toProperString = "1";
            } else if ((numerator) == ((_arithmeticOperatorHotSpot50.is("PLUS")) ? (((-1) + (denominator))) : (_arithmeticOperatorHotSpot50.is("MINUS")) ? (((-1) - (denominator))) : (_arithmeticOperatorHotSpot50.is("MUL")) ? (((-1) * (denominator))) :  (((-1) / (denominator))))) {
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
        return toProperString;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot35 = metamutator.Selector.of(35,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot35");

    private static final metamutator.Selector _arithmeticOperatorHotSpot36 = metamutator.Selector.of(36,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot36");

    private static final metamutator.Selector _arithmeticOperatorHotSpot37 = metamutator.Selector.of(37,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot37");

    private static final metamutator.Selector _arithmeticOperatorHotSpot38 = metamutator.Selector.of(38,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot38");

    private static final metamutator.Selector _arithmeticOperatorHotSpot39 = metamutator.Selector.of(39,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot39");

    private static final metamutator.Selector _arithmeticOperatorHotSpot40 = metamutator.Selector.of(40,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot40");

    private static final metamutator.Selector _arithmeticOperatorHotSpot41 = metamutator.Selector.of(41,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot41");

    private static final metamutator.Selector _arithmeticOperatorHotSpot42 = metamutator.Selector.of(42,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot42");

    private static final metamutator.Selector _arithmeticOperatorHotSpot43 = metamutator.Selector.of(43,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot43");

    private static final metamutator.Selector _arithmeticOperatorHotSpot44 = metamutator.Selector.of(44,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot44");

    private static final metamutator.Selector _arithmeticOperatorHotSpot45 = metamutator.Selector.of(45,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot45");

    private static final metamutator.Selector _arithmeticOperatorHotSpot46 = metamutator.Selector.of(46,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot46");

    private static final metamutator.Selector _arithmeticOperatorHotSpot47 = metamutator.Selector.of(47,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot47");

    private static final metamutator.Selector _arithmeticOperatorHotSpot48 = metamutator.Selector.of(48,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot48");

    private static final metamutator.Selector _arithmeticOperatorHotSpot49 = metamutator.Selector.of(49,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot49");

    private static final metamutator.Selector _arithmeticOperatorHotSpot50 = metamutator.Selector.of(50,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot50");

    private static final metamutator.Selector _arithmeticOperatorHotSpot51 = metamutator.Selector.of(51,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot51");

    private static final metamutator.Selector _arithmeticOperatorHotSpot52 = metamutator.Selector.of(52,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot52");

    private static final metamutator.Selector _arithmeticOperatorHotSpot53 = metamutator.Selector.of(53,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot53");

    private static final metamutator.Selector _arithmeticOperatorHotSpot54 = metamutator.Selector.of(54,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot54");

    private static final metamutator.Selector _arithmeticOperatorHotSpot55 = metamutator.Selector.of(55,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot55");

    private static final metamutator.Selector _arithmeticOperatorHotSpot56 = metamutator.Selector.of(56,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot56");

    private static final metamutator.Selector _arithmeticOperatorHotSpot57 = metamutator.Selector.of(57,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot57");

    private static final metamutator.Selector _arithmeticOperatorHotSpot58 = metamutator.Selector.of(58,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot58");

    private static final metamutator.Selector _arithmeticOperatorHotSpot59 = metamutator.Selector.of(59,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot59");

    private static final metamutator.Selector _arithmeticOperatorHotSpot60 = metamutator.Selector.of(60,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot60");

    private static final metamutator.Selector _arithmeticOperatorHotSpot61 = metamutator.Selector.of(61,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot61");

    private static final metamutator.Selector _arithmeticOperatorHotSpot62 = metamutator.Selector.of(62,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot62");

    private static final metamutator.Selector _arithmeticOperatorHotSpot63 = metamutator.Selector.of(63,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot63");

    private static final metamutator.Selector _arithmeticOperatorHotSpot64 = metamutator.Selector.of(64,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot64");

    private static final metamutator.Selector _arithmeticOperatorHotSpot65 = metamutator.Selector.of(65,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot65");

    private static final metamutator.Selector _arithmeticOperatorHotSpot66 = metamutator.Selector.of(66,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot66");

    private static final metamutator.Selector _arithmeticOperatorHotSpot67 = metamutator.Selector.of(67,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot67");

    private static final metamutator.Selector _arithmeticOperatorHotSpot68 = metamutator.Selector.of(68,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot68");

    private static final metamutator.Selector _arithmeticOperatorHotSpot69 = metamutator.Selector.of(69,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot69");

    private static final metamutator.Selector _arithmeticOperatorHotSpot70 = metamutator.Selector.of(70,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot70");

    private static final metamutator.Selector _arithmeticOperatorHotSpot71 = metamutator.Selector.of(71,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot71");

    private static final metamutator.Selector _arithmeticOperatorHotSpot72 = metamutator.Selector.of(72,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot72");

    private static final metamutator.Selector _arithmeticOperatorHotSpot73 = metamutator.Selector.of(73,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot73");

    private static final metamutator.Selector _arithmeticOperatorHotSpot74 = metamutator.Selector.of(74,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot74");

    private static final metamutator.Selector _arithmeticOperatorHotSpot75 = metamutator.Selector.of(75,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot75");

    private static final metamutator.Selector _arithmeticOperatorHotSpot76 = metamutator.Selector.of(76,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot76");

    private static final metamutator.Selector _arithmeticOperatorHotSpot77 = metamutator.Selector.of(77,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_arithmeticOperatorHotSpot77");
}

