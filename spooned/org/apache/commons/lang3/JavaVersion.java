package org.apache.commons.lang3;


public enum JavaVersion {
JAVA_0_9(1.5F,"0.9"), JAVA_1_1(1.1F,"1.1"), JAVA_1_2(1.2F,"1.2"), JAVA_1_3(1.3F,"1.3"), JAVA_1_4(1.4F,"1.4"), JAVA_1_5(1.5F,"1.5"), JAVA_1_6(1.6F,"1.6"), JAVA_1_7(1.7F,"1.7"), JAVA_1_8(1.8F,"1.8"), JAVA_1_9(1.9F,"1.9"), JAVA_RECENT(org.apache.commons.lang3.JavaVersion.maxVersion(),java.lang.Float.toString(org.apache.commons.lang3.JavaVersion.maxVersion()));
    private final float value;
    private final java.lang.String name;
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3539 = metamutator.Selector.of(3539,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3539");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3540 = metamutator.Selector.of(3540,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3540");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3541 = metamutator.Selector.of(3541,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3541");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3542 = metamutator.Selector.of(3542,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3542");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3543 = metamutator.Selector.of(3543,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3543");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3544 = metamutator.Selector.of(3544,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3544");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3545 = metamutator.Selector.of(3545,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3545");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3546 = metamutator.Selector.of(3546,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3546");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3547 = metamutator.Selector.of(3547,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3547");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3548 = metamutator.Selector.of(3548,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3548");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3549 = metamutator.Selector.of(3549,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3549");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3550 = metamutator.Selector.of(3550,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3550");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3551 = metamutator.Selector.of(3551,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3551");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3552 = metamutator.Selector.of(3552,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3552");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3553 = metamutator.Selector.of(3553,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3553");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3554 = metamutator.Selector.of(3554,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3554");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3555 = metamutator.Selector.of(3555,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3555");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3556 = metamutator.Selector.of(3556,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3556");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3557 = metamutator.Selector.of(3557,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3557");
    private static final metamutator.Selector _returnReplacementOperatorHotSpot3558 = metamutator.Selector.of(3558,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.JavaVersion.class).id("_returnReplacementOperatorHotSpot3558");
    JavaVersion(final float value ,final java.lang.String name) {
        this.value = value;
        this.name = name;
    }
    public boolean atLeast(final org.apache.commons.lang3.JavaVersion requiredVersion) {
        return ((_returnReplacementOperatorHotSpot3539.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((this.value) >= (requiredVersion.value)));
    }

    static org.apache.commons.lang3.JavaVersion getJavaVersion(final java.lang.String nom) {
        return ((_returnReplacementOperatorHotSpot3558.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.get(nom)));
    }

    static org.apache.commons.lang3.JavaVersion get(final java.lang.String nom) {
        if ("0.9".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3545.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_0_9));
        } else if ("1.1".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3546.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_1));
        } else if ("1.2".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3547.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_2));
        } else if ("1.3".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3548.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_3));
        } else if ("1.4".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3549.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_4));
        } else if ("1.5".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3550.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_5));
        } else if ("1.6".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3551.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_6));
        } else if ("1.7".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3552.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_7));
        } else if ("1.8".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3553.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_8));
        } else if ("1.9".equals(nom)) {
            return ((_returnReplacementOperatorHotSpot3554.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_1_9));
        } 
        if (nom == null) {
            return ((_returnReplacementOperatorHotSpot3555.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final float v = org.apache.commons.lang3.JavaVersion.toFloatVersion(nom);
        if ((v - 1.0) < 1.0) {
            final int firstComma = java.lang.Math.max(nom.indexOf('.'), nom.indexOf(','));
            final int end = java.lang.Math.max(nom.length(), nom.indexOf(',', firstComma));
            if ((java.lang.Float.parseFloat(nom.substring((firstComma + 1), end))) > 0.9F) {
                return ((_returnReplacementOperatorHotSpot3556.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.JavaVersion.JAVA_RECENT));
            } 
        } 
        return ((_returnReplacementOperatorHotSpot3557.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot3544.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (name));
    }

    private static float maxVersion() {
        final float v = org.apache.commons.lang3.JavaVersion.toFloatVersion(java.lang.System.getProperty("java.version", "2.0"));
        if (v > 0) {
            return ((_returnReplacementOperatorHotSpot3540.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
        } 
        return ((_returnReplacementOperatorHotSpot3541.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (2.0F));
    }

    private static float toFloatVersion(final java.lang.String value) {
        final java.lang.String[] toParse = value.split("\\.");
        if ((toParse.length) >= 2) {
            try {
                return ((_returnReplacementOperatorHotSpot3542.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.parseFloat((((toParse[0]) + '.') + (toParse[1])))));
            } catch (final java.lang.NumberFormatException nfe) {
            }
        } 
        return ((_returnReplacementOperatorHotSpot3543.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot3543.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot3543.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }
}

