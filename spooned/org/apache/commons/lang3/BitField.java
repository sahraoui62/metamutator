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
        return ((_returnReplacementOperator2390.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2390.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2390.is("ZERO")) ? ( 0 ) : ((getRawValue(holder)) >> (_shift_count)));
    }

    public short getShortValue(final short holder) {
        return ((_returnReplacementOperator2396.is("INT_MIN")) ? ((short)( -2147483647 )) : (_returnReplacementOperator2396.is("INT_MAX")) ? ((short)( 2147483646 )) : (_returnReplacementOperator2396.is("ZERO")) ? ((short)( 0 )) : (((short)(getValue(holder)))));
    }

    public int getRawValue(final int holder) {
        return ((_returnReplacementOperator2389.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2389.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2389.is("ZERO")) ? ( 0 ) : (holder & (_mask)));
    }

    public short getShortRawValue(final short holder) {
        return ((_returnReplacementOperator2395.is("INT_MIN")) ? ((short)( -2147483647 )) : (_returnReplacementOperator2395.is("INT_MAX")) ? ((short)( 2147483646 )) : (_returnReplacementOperator2395.is("ZERO")) ? ((short)( 0 )) : (((short)(getRawValue(holder)))));
    }

    public boolean isSet(final int holder) {
        return ((_returnReplacementOperator2384.is("NULL")) ? ( null ) : ((holder & (_mask)) != 0));
    }

    public boolean isAllSet(final int holder) {
        return ((_returnReplacementOperator2383.is("NULL")) ? ( null ) : ((holder & (_mask)) == (_mask)));
    }

    public int setValue(final int holder, final int value) {
        return ((_returnReplacementOperator2393.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2393.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2393.is("ZERO")) ? ( 0 ) : ((holder & (~(_mask))) | ((value << (_shift_count)) & (_mask))));
    }

    public short setShortValue(final short holder, final short value) {
        return ((_returnReplacementOperator2399.is("INT_MIN")) ? ((short)( -2147483647 )) : (_returnReplacementOperator2399.is("INT_MAX")) ? ((short)( 2147483646 )) : (_returnReplacementOperator2399.is("ZERO")) ? ((short)( 0 )) : (((short)(setValue(holder, value)))));
    }

    public int clear(final int holder) {
        return ((_returnReplacementOperator2388.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2388.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2388.is("ZERO")) ? ( 0 ) : (holder & (~(_mask))));
    }

    public short clearShort(final short holder) {
        return ((_returnReplacementOperator2394.is("INT_MIN")) ? ((short)( -2147483647 )) : (_returnReplacementOperator2394.is("INT_MAX")) ? ((short)( 2147483646 )) : (_returnReplacementOperator2394.is("ZERO")) ? ((short)( 0 )) : (((short)(clear(holder)))));
    }

    public byte clearByte(final byte holder) {
        return ((_returnReplacementOperator2385.is("INT_MIN")) ? ((byte)( -2147483647 )) : (_returnReplacementOperator2385.is("INT_MAX")) ? ((byte)( 2147483646 )) : (_returnReplacementOperator2385.is("ZERO")) ? ((byte)( 0 )) : (((byte)(clear(holder)))));
    }

    public int set(final int holder) {
        return ((_returnReplacementOperator2391.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2391.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2391.is("ZERO")) ? ( 0 ) : (holder | (_mask)));
    }

    public short setShort(final short holder) {
        return ((_returnReplacementOperator2397.is("INT_MIN")) ? ((short)( -2147483647 )) : (_returnReplacementOperator2397.is("INT_MAX")) ? ((short)( 2147483646 )) : (_returnReplacementOperator2397.is("ZERO")) ? ((short)( 0 )) : (((short)(set(holder)))));
    }

    public byte setByte(final byte holder) {
        return ((_returnReplacementOperator2386.is("INT_MIN")) ? ((byte)( -2147483647 )) : (_returnReplacementOperator2386.is("INT_MAX")) ? ((byte)( 2147483646 )) : (_returnReplacementOperator2386.is("ZERO")) ? ((byte)( 0 )) : (((byte)(set(holder)))));
    }

    public int setBoolean(final int holder, final boolean flag) {
        return ((_returnReplacementOperator2392.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2392.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2392.is("ZERO")) ? ( 0 ) : (flag ? set(holder) : clear(holder)));
    }

    public short setShortBoolean(final short holder, final boolean flag) {
        return ((_returnReplacementOperator2398.is("NULL")) ? ( null ) : (flag ? setShort(holder) : clearShort(holder)));
    }

    public byte setByteBoolean(final byte holder, final boolean flag) {
        return ((_returnReplacementOperator2387.is("NULL")) ? ( null ) : (flag ? setByte(holder) : clearByte(holder)));
    }

    private static final metamutator.Selector _returnReplacementOperator2383 = metamutator.Selector.of(2383,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2383");

    private static final metamutator.Selector _returnReplacementOperator2384 = metamutator.Selector.of(2384,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2384");

    private static final metamutator.Selector _returnReplacementOperator2385 = metamutator.Selector.of(2385,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2385");

    private static final metamutator.Selector _returnReplacementOperator2386 = metamutator.Selector.of(2386,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2386");

    private static final metamutator.Selector _returnReplacementOperator2387 = metamutator.Selector.of(2387,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2387");

    private static final metamutator.Selector _returnReplacementOperator2388 = metamutator.Selector.of(2388,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2388");

    private static final metamutator.Selector _returnReplacementOperator2389 = metamutator.Selector.of(2389,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2389");

    private static final metamutator.Selector _returnReplacementOperator2390 = metamutator.Selector.of(2390,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2390");

    private static final metamutator.Selector _returnReplacementOperator2391 = metamutator.Selector.of(2391,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2391");

    private static final metamutator.Selector _returnReplacementOperator2392 = metamutator.Selector.of(2392,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2392");

    private static final metamutator.Selector _returnReplacementOperator2393 = metamutator.Selector.of(2393,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2393");

    private static final metamutator.Selector _returnReplacementOperator2394 = metamutator.Selector.of(2394,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2394");

    private static final metamutator.Selector _returnReplacementOperator2395 = metamutator.Selector.of(2395,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2395");

    private static final metamutator.Selector _returnReplacementOperator2396 = metamutator.Selector.of(2396,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2396");

    private static final metamutator.Selector _returnReplacementOperator2397 = metamutator.Selector.of(2397,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2397");

    private static final metamutator.Selector _returnReplacementOperator2398 = metamutator.Selector.of(2398,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2398");

    private static final metamutator.Selector _returnReplacementOperator2399 = metamutator.Selector.of(2399,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BitField.class).id("_returnReplacementOperator2399");
}

