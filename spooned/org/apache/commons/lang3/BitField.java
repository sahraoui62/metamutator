package org.apache.commons.lang3;


public class BitField {
    private final int _mask;

    private final int _shift_count;

    public BitField(final int mask) {
        _mask = mask;
        int count = 0;
        int bit_pattern = mask;
        if (bit_pattern != 0) {
            while ((bit_pattern & 1) == 0) {
                count++;
                bit_pattern >>= 1;
            }
        } 
        _shift_count = count;
    }

    public int getValue(final int holder) {
        return ((_returnReplacementOperatorHotSpot2390.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2390.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2390.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((getRawValue(holder)) >> (_shift_count)));
    }

    public short getShortValue(final short holder) {
        return ((_returnReplacementOperatorHotSpot2396.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((short)( -2147483647 )) : (_returnReplacementOperatorHotSpot2396.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((short)( 2147483646 )) : (_returnReplacementOperatorHotSpot2396.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((short)( 0 )) : (((short)(getValue(holder)))));
    }

    public int getRawValue(final int holder) {
        return ((_returnReplacementOperatorHotSpot2389.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2389.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2389.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (holder & (_mask)));
    }

    public short getShortRawValue(final short holder) {
        return ((_returnReplacementOperatorHotSpot2395.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((short)( -2147483647 )) : (_returnReplacementOperatorHotSpot2395.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((short)( 2147483646 )) : (_returnReplacementOperatorHotSpot2395.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((short)( 0 )) : (((short)(getRawValue(holder)))));
    }

    public boolean isSet(final int holder) {
        return ((_returnReplacementOperatorHotSpot2384.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((holder & (_mask)) != 0));
    }

    public boolean isAllSet(final int holder) {
        return ((_returnReplacementOperatorHotSpot2383.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((holder & (_mask)) == (_mask)));
    }

    public int setValue(final int holder, final int value) {
        return ((_returnReplacementOperatorHotSpot2393.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2393.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2393.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((holder & (~(_mask))) | ((value << (_shift_count)) & (_mask))));
    }

    public short setShortValue(final short holder, final short value) {
        return ((_returnReplacementOperatorHotSpot2399.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((short)( -2147483647 )) : (_returnReplacementOperatorHotSpot2399.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((short)( 2147483646 )) : (_returnReplacementOperatorHotSpot2399.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((short)( 0 )) : (((short)(setValue(holder, value)))));
    }

    public int clear(final int holder) {
        return ((_returnReplacementOperatorHotSpot2388.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2388.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2388.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (holder & (~(_mask))));
    }

    public short clearShort(final short holder) {
        return ((_returnReplacementOperatorHotSpot2394.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((short)( -2147483647 )) : (_returnReplacementOperatorHotSpot2394.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((short)( 2147483646 )) : (_returnReplacementOperatorHotSpot2394.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((short)( 0 )) : (((short)(clear(holder)))));
    }

    public byte clearByte(final byte holder) {
        return ((_returnReplacementOperatorHotSpot2385.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((byte)( -2147483647 )) : (_returnReplacementOperatorHotSpot2385.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((byte)( 2147483646 )) : (_returnReplacementOperatorHotSpot2385.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((byte)( 0 )) : (((byte)(clear(holder)))));
    }

    public int set(final int holder) {
        return ((_returnReplacementOperatorHotSpot2391.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2391.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2391.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (holder | (_mask)));
    }

    public short setShort(final short holder) {
        return ((_returnReplacementOperatorHotSpot2397.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((short)( -2147483647 )) : (_returnReplacementOperatorHotSpot2397.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((short)( 2147483646 )) : (_returnReplacementOperatorHotSpot2397.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((short)( 0 )) : (((short)(set(holder)))));
    }

    public byte setByte(final byte holder) {
        return ((_returnReplacementOperatorHotSpot2386.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((byte)( -2147483647 )) : (_returnReplacementOperatorHotSpot2386.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((byte)( 2147483646 )) : (_returnReplacementOperatorHotSpot2386.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((byte)( 0 )) : (((byte)(set(holder)))));
    }

    public int setBoolean(final int holder, final boolean flag) {
        return ((_returnReplacementOperatorHotSpot2392.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2392.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2392.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (flag ? set(holder) : clear(holder)));
    }

    public short setShortBoolean(final short holder, final boolean flag) {
        return ((_returnReplacementOperatorHotSpot2398.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (flag ? setShort(holder) : clearShort(holder)));
    }

    public byte setByteBoolean(final byte holder, final boolean flag) {
        return ((_returnReplacementOperatorHotSpot2387.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (flag ? setByte(holder) : clearByte(holder)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2383 = metamutator.Selector.of(2383,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2383");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2384 = metamutator.Selector.of(2384,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2384");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2385 = metamutator.Selector.of(2385,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2385");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2386 = metamutator.Selector.of(2386,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2386");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2387 = metamutator.Selector.of(2387,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2387");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2388 = metamutator.Selector.of(2388,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2388");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2389 = metamutator.Selector.of(2389,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2389");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2390 = metamutator.Selector.of(2390,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2390");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2391 = metamutator.Selector.of(2391,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2391");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2392 = metamutator.Selector.of(2392,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2392");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2393 = metamutator.Selector.of(2393,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2393");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2394 = metamutator.Selector.of(2394,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2394");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2395 = metamutator.Selector.of(2395,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2395");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2396 = metamutator.Selector.of(2396,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2396");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2397 = metamutator.Selector.of(2397,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2397");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2398 = metamutator.Selector.of(2398,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2398");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2399 = metamutator.Selector.of(2399,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperatorHotSpot2399");
}

