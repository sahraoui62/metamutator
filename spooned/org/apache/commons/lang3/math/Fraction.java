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
        return ((_returnReplacementOperator612.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(numerator , denominator)));
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
        return ((_returnReplacementOperator613.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(((int)(numeratorValue)) , denominator)));
    }

    public static org.apache.commons.lang3.math.Fraction getReducedFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new java.lang.ArithmeticException("The denominator must not be zero");
        } 
        if (numerator == 0) {
            return ((_returnReplacementOperator618.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.ZERO));
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
        return ((_returnReplacementOperator619.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(numerator , denominator)));
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
        return ((_returnReplacementOperator611.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getReducedFraction(((numer0 + (wholeNumber * denom0)) * sign), denom0)));
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The string must not be null");
        } 
        int pos = str.indexOf('.');
        if (pos >= 0) {
            return ((_returnReplacementOperator614.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(java.lang.Double.parseDouble(str))));
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
            return ((_returnReplacementOperator615.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(whole, numer, denom)));
        } 
        pos = str.indexOf('/');
        if (pos < 0) {
            return ((_returnReplacementOperator616.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(java.lang.Integer.parseInt(str), 1)));
        } 
        final int numer = java.lang.Integer.parseInt(str.substring(0, pos));
        final int denom = java.lang.Integer.parseInt(str.substring((pos + 1)));
        return ((_returnReplacementOperator617.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(numer, denom)));
    }

    public int getNumerator() {
        return ((_returnReplacementOperator589.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator589.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator589.is("ZERO")) ? ( 0 ) : (numerator));
    }

    public int getDenominator() {
        return ((_returnReplacementOperator588.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator588.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator588.is("ZERO")) ? ( 0 ) : (denominator));
    }

    public int getProperNumerator() {
        return ((_returnReplacementOperator590.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator590.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator590.is("ZERO")) ? ( 0 ) : (java.lang.Math.abs(((numerator) % (denominator)))));
    }

    public int getProperWhole() {
        return ((_returnReplacementOperator591.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator591.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator591.is("ZERO")) ? ( 0 ) : ((numerator) / (denominator)));
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperator596.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator596.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator596.is("ZERO")) ? ( 0 ) : ((numerator) / (denominator)));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperator602.is("NULL")) ? ( null ) : (((long)(numerator)) / (denominator)));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperator581.is("NULL")) ? ( null ) : (((float)(numerator)) / ((float)(denominator))));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperator580.is("NULL")) ? ( null ) : (((double)(numerator)) / ((double)(denominator))));
    }

    public org.apache.commons.lang3.math.Fraction reduce() {
        if ((numerator) == 0) {
            return ((_returnReplacementOperator631.is("NULL")) ? ( null ) : (equals(org.apache.commons.lang3.math.Fraction.ZERO) ? this : org.apache.commons.lang3.math.Fraction.ZERO));
        } 
        final int gcd = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(java.lang.Math.abs(numerator), denominator);
        if (gcd == 1) {
            return ((_returnReplacementOperator632.is("NULL")) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperator633.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getFraction(((numerator) / gcd), ((denominator) / gcd))));
    }

    public org.apache.commons.lang3.math.Fraction invert() {
        if ((numerator) == 0) {
            throw new java.lang.ArithmeticException("Unable to invert zero.");
        } 
        if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: can't negate numerator");
        } 
        if ((numerator) < 0) {
            return ((_returnReplacementOperator620.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(-(denominator) , -(numerator))));
        } 
        return ((_returnReplacementOperator621.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(denominator , numerator)));
    }

    public org.apache.commons.lang3.math.Fraction negate() {
        if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: too large to negate");
        } 
        return ((_returnReplacementOperator624.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(-(numerator) , denominator)));
    }

    public org.apache.commons.lang3.math.Fraction abs() {
        if ((numerator) >= 0) {
            return ((_returnReplacementOperator603.is("NULL")) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperator604.is("NULL")) ? ( null ) : (negate()));
    }

    public org.apache.commons.lang3.math.Fraction pow(final int power) {
        if (power == 1) {
            return ((_returnReplacementOperator625.is("NULL")) ? ( null ) : (this));
        } else if (power == 0) {
            return ((_returnReplacementOperator626.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.ONE));
        } else if (power < 0) {
            if (power == (java.lang.Integer.MIN_VALUE)) {
                return ((_returnReplacementOperator627.is("NULL")) ? ( null ) : (invert().pow(2).pow(-(power / 2))));
            } 
            return ((_returnReplacementOperator628.is("NULL")) ? ( null ) : (invert().pow(-power)));
        } else {
            final org.apache.commons.lang3.math.Fraction f = multiplyBy(this);
            if ((power % 2) == 0) {
                return ((_returnReplacementOperator629.is("NULL")) ? ( null ) : (f.pow((power / 2))));
            } 
            return ((_returnReplacementOperator630.is("NULL")) ? ( null ) : (f.pow((power / 2)).multiplyBy(this)));
        }
    }

    private static int greatestCommonDivisor(int u, int v) {
        if ((u == 0) || (v == 0)) {
            if ((u == (java.lang.Integer.MIN_VALUE)) || (v == (java.lang.Integer.MIN_VALUE))) {
                throw new java.lang.ArithmeticException("overflow: gcd is 2^31");
            } 
            return ((_returnReplacementOperator592.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator592.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator592.is("ZERO")) ? ( 0 ) : ((java.lang.Math.abs(u)) + (java.lang.Math.abs(v))));
        } 
        if (((java.lang.Math.abs(u)) == 1) || ((java.lang.Math.abs(v)) == 1)) {
            return ((_returnReplacementOperator593.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator593.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator593.is("ZERO")) ? ( 0 ) : (1));
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
        return ((_returnReplacementOperator594.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator594.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator594.is("ZERO")) ? ( 0 ) : ((-u) * (1 << k)));
    }

    private static int mulAndCheck(final int x, final int y) {
        final long m = ((long)(x)) * ((long)(y));
        if ((m < (java.lang.Integer.MIN_VALUE)) || (m > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: mul");
        } 
        return ((_returnReplacementOperator597.is("NULL")) ? ( null ) : (((int)(m))));
    }

    private static int mulPosAndCheck(final int x, final int y) {
        final long m = ((long)(x)) * ((long)(y));
        if (m > (java.lang.Integer.MAX_VALUE)) {
            throw new java.lang.ArithmeticException("overflow: mulPos");
        } 
        return ((_returnReplacementOperator598.is("NULL")) ? ( null ) : (((int)(m))));
    }

    private static int addAndCheck(final int x, final int y) {
        final long s = ((long)(x)) + ((long)(y));
        if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: add");
        } 
        return ((_returnReplacementOperator582.is("NULL")) ? ( null ) : (((int)(s))));
    }

    private static int subAndCheck(final int x, final int y) {
        final long s = ((long)(x)) - ((long)(y));
        if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
            throw new java.lang.ArithmeticException("overflow: add");
        } 
        return ((_returnReplacementOperator599.is("NULL")) ? ( null ) : (((int)(s))));
    }

    public org.apache.commons.lang3.math.Fraction add(final org.apache.commons.lang3.math.Fraction fraction) {
        return ((_returnReplacementOperator605.is("NULL")) ? ( null ) : (addSub(fraction, true)));
    }

    public org.apache.commons.lang3.math.Fraction subtract(final org.apache.commons.lang3.math.Fraction fraction) {
        return ((_returnReplacementOperator634.is("NULL")) ? ( null ) : (addSub(fraction, false)));
    }

    private org.apache.commons.lang3.math.Fraction addSub(final org.apache.commons.lang3.math.Fraction fraction, final boolean isAdd) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if ((numerator) == 0) {
            return ((_returnReplacementOperator606.is("NULL")) ? ( null ) : (isAdd ? fraction : fraction.negate()));
        } 
        if ((fraction.numerator) == 0) {
            return ((_returnReplacementOperator607.is("NULL")) ? ( null ) : (this));
        } 
        final int d1 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(denominator, fraction.denominator);
        if (d1 == 1) {
            final int uvp = org.apache.commons.lang3.math.Fraction.mulAndCheck(numerator, fraction.denominator);
            final int upv = org.apache.commons.lang3.math.Fraction.mulAndCheck(fraction.numerator, denominator);
            return ((_returnReplacementOperator608.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction((isAdd ? org.apache.commons.lang3.math.Fraction.addAndCheck(uvp, upv) : org.apache.commons.lang3.math.Fraction.subAndCheck(uvp, upv)) , org.apache.commons.lang3.math.Fraction.mulPosAndCheck(denominator, fraction.denominator))));
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
        return ((_returnReplacementOperator609.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.math.Fraction(w.intValue() , org.apache.commons.lang3.math.Fraction.mulPosAndCheck(((denominator) / d1), ((fraction.denominator) / d2)))));
    }

    public org.apache.commons.lang3.math.Fraction multiplyBy(final org.apache.commons.lang3.math.Fraction fraction) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if (((numerator) == 0) || ((fraction.numerator) == 0)) {
            return ((_returnReplacementOperator622.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.ZERO));
        } 
        final int d1 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(numerator, fraction.denominator);
        final int d2 = org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(fraction.numerator, denominator);
        return ((_returnReplacementOperator623.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.Fraction.getReducedFraction(org.apache.commons.lang3.math.Fraction.mulAndCheck(((numerator) / d1), ((fraction.numerator) / d2)), org.apache.commons.lang3.math.Fraction.mulPosAndCheck(((denominator) / d2), ((fraction.denominator) / d1)))));
    }

    public org.apache.commons.lang3.math.Fraction divideBy(final org.apache.commons.lang3.math.Fraction fraction) {
        if (fraction == null) {
            throw new java.lang.IllegalArgumentException("The fraction must not be null");
        } 
        if ((fraction.numerator) == 0) {
            throw new java.lang.ArithmeticException("The fraction to divide by must not be zero");
        } 
        return ((_returnReplacementOperator610.is("NULL")) ? ( null ) : (multiplyBy(fraction.invert())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperator577.is("NULL")) ? ( null ) : (true));
        } 
        if ((obj instanceof org.apache.commons.lang3.math.Fraction) == false) {
            return ((_returnReplacementOperator578.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.math.Fraction other = ((org.apache.commons.lang3.math.Fraction)(obj));
        return ((_returnReplacementOperator579.is("NULL")) ? ( null ) : (((getNumerator()) == (other.getNumerator())) && ((getDenominator()) == (other.getDenominator()))));
    }

    @java.lang.Override
    public int hashCode() {
        if ((hashCode) == 0) {
            hashCode = (37 * ((37 * 17) + (getNumerator()))) + (getDenominator());
        } 
        return ((_returnReplacementOperator595.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator595.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator595.is("ZERO")) ? ( 0 ) : (hashCode));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.math.Fraction other) {
        if ((this) == other) {
            return ((_returnReplacementOperator583.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator583.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator583.is("ZERO")) ? ( 0 ) : (0));
        } 
        if (((numerator) == (other.numerator)) && ((denominator) == (other.denominator))) {
            return ((_returnReplacementOperator584.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator584.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator584.is("ZERO")) ? ( 0 ) : (0));
        } 
        final long first = ((long)(numerator)) * ((long)(other.denominator));
        final long second = ((long)(other.numerator)) * ((long)(denominator));
        if (first == second) {
            return ((_returnReplacementOperator585.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator585.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator585.is("ZERO")) ? ( 0 ) : (0));
        } else if (first < second) {
            return ((_returnReplacementOperator586.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator586.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator586.is("ZERO")) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperator587.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator587.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator587.is("ZERO")) ? ( 0 ) : (1));
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((toString) == null) {
            toString = ((getNumerator()) + "/") + (getDenominator());
        } 
        return ((_returnReplacementOperator601.is("NULL")) ? ( null ) : (toString));
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
        return ((_returnReplacementOperator600.is("NULL")) ? ( null ) : (toProperString));
    }

    private static final metamutator.Selector _returnReplacementOperator577 = metamutator.Selector.of(577,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator577");

    private static final metamutator.Selector _returnReplacementOperator578 = metamutator.Selector.of(578,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator578");

    private static final metamutator.Selector _returnReplacementOperator579 = metamutator.Selector.of(579,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator579");

    private static final metamutator.Selector _returnReplacementOperator580 = metamutator.Selector.of(580,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator580");

    private static final metamutator.Selector _returnReplacementOperator581 = metamutator.Selector.of(581,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator581");

    private static final metamutator.Selector _returnReplacementOperator582 = metamutator.Selector.of(582,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator582");

    private static final metamutator.Selector _returnReplacementOperator583 = metamutator.Selector.of(583,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator583");

    private static final metamutator.Selector _returnReplacementOperator584 = metamutator.Selector.of(584,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator584");

    private static final metamutator.Selector _returnReplacementOperator585 = metamutator.Selector.of(585,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator585");

    private static final metamutator.Selector _returnReplacementOperator586 = metamutator.Selector.of(586,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator586");

    private static final metamutator.Selector _returnReplacementOperator587 = metamutator.Selector.of(587,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator587");

    private static final metamutator.Selector _returnReplacementOperator588 = metamutator.Selector.of(588,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator588");

    private static final metamutator.Selector _returnReplacementOperator589 = metamutator.Selector.of(589,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator589");

    private static final metamutator.Selector _returnReplacementOperator590 = metamutator.Selector.of(590,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator590");

    private static final metamutator.Selector _returnReplacementOperator591 = metamutator.Selector.of(591,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator591");

    private static final metamutator.Selector _returnReplacementOperator592 = metamutator.Selector.of(592,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator592");

    private static final metamutator.Selector _returnReplacementOperator593 = metamutator.Selector.of(593,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator593");

    private static final metamutator.Selector _returnReplacementOperator594 = metamutator.Selector.of(594,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator594");

    private static final metamutator.Selector _returnReplacementOperator595 = metamutator.Selector.of(595,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator595");

    private static final metamutator.Selector _returnReplacementOperator596 = metamutator.Selector.of(596,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator596");

    private static final metamutator.Selector _returnReplacementOperator597 = metamutator.Selector.of(597,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator597");

    private static final metamutator.Selector _returnReplacementOperator598 = metamutator.Selector.of(598,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator598");

    private static final metamutator.Selector _returnReplacementOperator599 = metamutator.Selector.of(599,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator599");

    private static final metamutator.Selector _returnReplacementOperator600 = metamutator.Selector.of(600,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator600");

    private static final metamutator.Selector _returnReplacementOperator601 = metamutator.Selector.of(601,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator601");

    private static final metamutator.Selector _returnReplacementOperator602 = metamutator.Selector.of(602,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator602");

    private static final metamutator.Selector _returnReplacementOperator603 = metamutator.Selector.of(603,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator603");

    private static final metamutator.Selector _returnReplacementOperator604 = metamutator.Selector.of(604,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator604");

    private static final metamutator.Selector _returnReplacementOperator605 = metamutator.Selector.of(605,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator605");

    private static final metamutator.Selector _returnReplacementOperator606 = metamutator.Selector.of(606,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator606");

    private static final metamutator.Selector _returnReplacementOperator607 = metamutator.Selector.of(607,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator607");

    private static final metamutator.Selector _returnReplacementOperator608 = metamutator.Selector.of(608,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator608");

    private static final metamutator.Selector _returnReplacementOperator609 = metamutator.Selector.of(609,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator609");

    private static final metamutator.Selector _returnReplacementOperator610 = metamutator.Selector.of(610,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator610");

    private static final metamutator.Selector _returnReplacementOperator611 = metamutator.Selector.of(611,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator611");

    private static final metamutator.Selector _returnReplacementOperator612 = metamutator.Selector.of(612,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator612");

    private static final metamutator.Selector _returnReplacementOperator613 = metamutator.Selector.of(613,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator613");

    private static final metamutator.Selector _returnReplacementOperator614 = metamutator.Selector.of(614,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator614");

    private static final metamutator.Selector _returnReplacementOperator615 = metamutator.Selector.of(615,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator615");

    private static final metamutator.Selector _returnReplacementOperator616 = metamutator.Selector.of(616,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator616");

    private static final metamutator.Selector _returnReplacementOperator617 = metamutator.Selector.of(617,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator617");

    private static final metamutator.Selector _returnReplacementOperator618 = metamutator.Selector.of(618,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator618");

    private static final metamutator.Selector _returnReplacementOperator619 = metamutator.Selector.of(619,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator619");

    private static final metamutator.Selector _returnReplacementOperator620 = metamutator.Selector.of(620,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator620");

    private static final metamutator.Selector _returnReplacementOperator621 = metamutator.Selector.of(621,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator621");

    private static final metamutator.Selector _returnReplacementOperator622 = metamutator.Selector.of(622,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator622");

    private static final metamutator.Selector _returnReplacementOperator623 = metamutator.Selector.of(623,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator623");

    private static final metamutator.Selector _returnReplacementOperator624 = metamutator.Selector.of(624,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator624");

    private static final metamutator.Selector _returnReplacementOperator625 = metamutator.Selector.of(625,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator625");

    private static final metamutator.Selector _returnReplacementOperator626 = metamutator.Selector.of(626,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator626");

    private static final metamutator.Selector _returnReplacementOperator627 = metamutator.Selector.of(627,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator627");

    private static final metamutator.Selector _returnReplacementOperator628 = metamutator.Selector.of(628,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator628");

    private static final metamutator.Selector _returnReplacementOperator629 = metamutator.Selector.of(629,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator629");

    private static final metamutator.Selector _returnReplacementOperator630 = metamutator.Selector.of(630,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator630");

    private static final metamutator.Selector _returnReplacementOperator631 = metamutator.Selector.of(631,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator631");

    private static final metamutator.Selector _returnReplacementOperator632 = metamutator.Selector.of(632,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator632");

    private static final metamutator.Selector _returnReplacementOperator633 = metamutator.Selector.of(633,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator633");

    private static final metamutator.Selector _returnReplacementOperator634 = metamutator.Selector.of(634,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.Fraction.class).id("_returnReplacementOperator634");
}

