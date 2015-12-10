package org.apache.commons.lang3.text;


public class StrBuilder implements java.io.Serializable , java.lang.Appendable , java.lang.CharSequence , org.apache.commons.lang3.builder.Builder<java.lang.String> {
    static final int CAPACITY = 32;

    private static final long serialVersionUID = 7628716375283629643L;

    protected char[] buffer;

    protected int size;

    private java.lang.String newLine;

    private java.lang.String nullText;

    public StrBuilder() {
        this(CAPACITY);
    }

    public StrBuilder(int initialCapacity) {
        super();
        if (initialCapacity <= 0) {
            initialCapacity = CAPACITY;
        } 
        buffer = new char[initialCapacity];
    }

    public StrBuilder(final java.lang.String str) {
        super();
        if (str == null) {
            buffer = new char[CAPACITY];
        } else {
            buffer = new char[(str.length()) + (CAPACITY)];
            append(str);
        }
    }

    public java.lang.String getNewLineText() {
        return ((_returnReplacementOperator1263.is("NULL")) ? ( null ) : (newLine));
    }

    public org.apache.commons.lang3.text.StrBuilder setNewLineText(final java.lang.String newLine) {
        this.newLine = newLine;
        return ((_returnReplacementOperator1397.is("NULL")) ? ( null ) : (this));
    }

    public java.lang.String getNullText() {
        return ((_returnReplacementOperator1264.is("NULL")) ? ( null ) : (nullText));
    }

    public org.apache.commons.lang3.text.StrBuilder setNullText(java.lang.String nullText) {
        if ((nullText != null) && (nullText.isEmpty())) {
            nullText = null;
        } 
        this.nullText = nullText;
        return ((_returnReplacementOperator1398.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public int length() {
        return ((_returnReplacementOperator1255.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1255.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1255.is("ZERO")) ? ( 0 ) : (size));
    }

    public org.apache.commons.lang3.text.StrBuilder setLength(final int length) {
        if (length < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(length);
        } 
        if (length < (size)) {
            size = length;
        } else if (length > (size)) {
            ensureCapacity(length);
            final int oldEnd = size;
            final int newEnd = length;
            size = length;
            for (int i = oldEnd ; i < newEnd ; i++) {
                buffer[i] = ' ';
            }
        } 
        return ((_returnReplacementOperator1396.is("NULL")) ? ( null ) : (this));
    }

    public int capacity() {
        return ((_returnReplacementOperator1224.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1224.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1224.is("ZERO")) ? ( 0 ) : (buffer.length));
    }

    public org.apache.commons.lang3.text.StrBuilder ensureCapacity(final int capacity) {
        if (capacity > (buffer.length)) {
            final char[] old = buffer;
            buffer = new char[capacity * 2];
            java.lang.System.arraycopy(old, 0, buffer, 0, size);
        } 
        return ((_returnReplacementOperator1368.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder minimizeCapacity() {
        if ((buffer.length) > (length())) {
            final char[] old = buffer;
            buffer = new char[length()];
            java.lang.System.arraycopy(old, 0, buffer, 0, size);
        } 
        return ((_returnReplacementOperator1382.is("NULL")) ? ( null ) : (this));
    }

    public int size() {
        return ((_returnReplacementOperator1257.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1257.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1257.is("ZERO")) ? ( 0 ) : (size));
    }

    public boolean isEmpty() {
        return ((_returnReplacementOperator1212.is("NULL")) ? ( null ) : ((size) == 0));
    }

    public org.apache.commons.lang3.text.StrBuilder clear() {
        size = 0;
        return ((_returnReplacementOperator1359.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public char charAt(final int index) {
        if ((index < 0) || (index >= (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        return ((_returnReplacementOperator1218.is("NULL")) ? ( null ) : (buffer[index]));
    }

    public org.apache.commons.lang3.text.StrBuilder setCharAt(final int index, final char ch) {
        if ((index < 0) || (index >= (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        buffer[index] = ch;
        return ((_returnReplacementOperator1395.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteCharAt(final int index) {
        if ((index < 0) || (index >= (size))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        deleteImpl(index, (index + 1), 1);
        return ((_returnReplacementOperator1364.is("NULL")) ? ( null ) : (this));
    }

    public char[] toCharArray() {
        if ((size) == 0) {
            return ((_returnReplacementOperator1220.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] chars = new char[size];
        java.lang.System.arraycopy(buffer, 0, chars, 0, size);
        return ((_returnReplacementOperator1221.is("NULL")) ? ( null ) : (chars));
    }

    public char[] toCharArray(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len == 0) {
            return ((_returnReplacementOperator1222.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] chars = new char[len];
        java.lang.System.arraycopy(buffer, startIndex, chars, 0, len);
        return ((_returnReplacementOperator1223.is("NULL")) ? ( null ) : (chars));
    }

    public char[] getChars(char[] destination) {
        final int len = length();
        if ((destination == null) || ((destination.length) < len)) {
            destination = new char[len];
        } 
        java.lang.System.arraycopy(buffer, 0, destination, 0, len);
        return ((_returnReplacementOperator1219.is("NULL")) ? ( null ) : (destination));
    }

    public void getChars(final int startIndex, final int endIndex, final char[] destination, final int destinationIndex) {
        if (startIndex < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(startIndex);
        } 
        if ((endIndex < 0) || (endIndex > (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(endIndex);
        } 
        if (startIndex > endIndex) {
            throw new java.lang.StringIndexOutOfBoundsException("end < start");
        } 
        java.lang.System.arraycopy(buffer, startIndex, destination, destinationIndex, (endIndex - startIndex));
    }

    public int readFrom(final java.lang.Readable readable) throws java.io.IOException {
        final int oldSize = size;
        if (readable instanceof java.io.Reader) {
            final java.io.Reader r = ((java.io.Reader)(readable));
            ensureCapacity(((size) + 1));
            int read;
            while ((read = r.read(buffer, size, ((buffer.length) - (size)))) != (-1)) {
                size += read;
                ensureCapacity(((size) + 1));
            }
        } else if (readable instanceof java.nio.CharBuffer) {
            final java.nio.CharBuffer cb = ((java.nio.CharBuffer)(readable));
            final int remaining = cb.remaining();
            ensureCapacity(((size) + remaining));
            cb.get(buffer, size, remaining);
            size += remaining;
        } else {
            while (true) {
                ensureCapacity(((size) + 1));
                final java.nio.CharBuffer buf = java.nio.CharBuffer.wrap(buffer, size, ((buffer.length) - (size)));
                final int read = readable.read(buf);
                if (read == (-1)) {
                    break;
                } 
                size += read;
            }
        }
        return ((_returnReplacementOperator1256.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1256.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1256.is("ZERO")) ? ( 0 ) : ((size) - oldSize));
    }

    public org.apache.commons.lang3.text.StrBuilder appendNewLine() {
        if ((newLine) == null) {
            append(org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR);
            return ((_returnReplacementOperator1327.is("NULL")) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperator1328.is("NULL")) ? ( null ) : (append(newLine)));
    }

    public org.apache.commons.lang3.text.StrBuilder appendNull() {
        if ((nullText) == null) {
            return ((_returnReplacementOperator1329.is("NULL")) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperator1330.is("NULL")) ? ( null ) : (append(nullText)));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.Object obj) {
        if (obj == null) {
            return ((_returnReplacementOperator1296.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if (obj instanceof java.lang.CharSequence) {
            return ((_returnReplacementOperator1297.is("NULL")) ? ( null ) : (append(((java.lang.CharSequence)(obj)))));
        } 
        return ((_returnReplacementOperator1298.is("NULL")) ? ( null ) : (append(obj.toString())));
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.CharSequence seq) {
        if (seq == null) {
            return ((_returnReplacementOperator1288.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if (seq instanceof org.apache.commons.lang3.text.StrBuilder) {
            return ((_returnReplacementOperator1289.is("NULL")) ? ( null ) : (append(((org.apache.commons.lang3.text.StrBuilder)(seq)))));
        } 
        if (seq instanceof java.lang.StringBuilder) {
            return ((_returnReplacementOperator1290.is("NULL")) ? ( null ) : (append(((java.lang.StringBuilder)(seq)))));
        } 
        if (seq instanceof java.lang.StringBuffer) {
            return ((_returnReplacementOperator1291.is("NULL")) ? ( null ) : (append(((java.lang.StringBuffer)(seq)))));
        } 
        if (seq instanceof java.nio.CharBuffer) {
            return ((_returnReplacementOperator1292.is("NULL")) ? ( null ) : (append(((java.nio.CharBuffer)(seq)))));
        } 
        return ((_returnReplacementOperator1293.is("NULL")) ? ( null ) : (append(seq.toString())));
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.CharSequence seq, final int startIndex, final int length) {
        if (seq == null) {
            return ((_returnReplacementOperator1294.is("NULL")) ? ( null ) : (appendNull()));
        } 
        return ((_returnReplacementOperator1295.is("NULL")) ? ( null ) : (append(seq.toString(), startIndex, length)));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator1299.is("NULL")) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return ((_returnReplacementOperator1300.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperator1301.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperator1302.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String format, final java.lang.Object... objs) {
        return ((_returnReplacementOperator1303.is("NULL")) ? ( null ) : (append(java.lang.String.format(format, objs))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.nio.CharBuffer buf) {
        if (buf == null) {
            return ((_returnReplacementOperator1312.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if (buf.hasArray()) {
            final int length = buf.remaining();
            final int len = length();
            ensureCapacity((len + length));
            java.lang.System.arraycopy(buf.array(), ((buf.arrayOffset()) + (buf.position())), buffer, len, length);
            size += length;
        } else {
            append(buf.toString());
        }
        return ((_returnReplacementOperator1313.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.nio.CharBuffer buf, final int startIndex, final int length) {
        if (buf == null) {
            return ((_returnReplacementOperator1314.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if (buf.hasArray()) {
            final int totalLength = buf.remaining();
            if ((startIndex < 0) || (startIndex > totalLength)) {
                throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
            } 
            if ((length < 0) || ((startIndex + length) > totalLength)) {
                throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
            } 
            final int len = length();
            ensureCapacity((len + length));
            java.lang.System.arraycopy(buf.array(), (((buf.arrayOffset()) + (buf.position())) + startIndex), buffer, len, length);
            size += length;
        } else {
            append(buf.toString(), startIndex, length);
        }
        return ((_returnReplacementOperator1315.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuffer str) {
        if (str == null) {
            return ((_returnReplacementOperator1304.is("NULL")) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return ((_returnReplacementOperator1305.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuffer str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperator1306.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperator1307.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuilder str) {
        if (str == null) {
            return ((_returnReplacementOperator1308.is("NULL")) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return ((_returnReplacementOperator1309.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuilder str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperator1310.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperator1311.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final org.apache.commons.lang3.text.StrBuilder str) {
        if (str == null) {
            return ((_returnReplacementOperator1317.is("NULL")) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            java.lang.System.arraycopy(str.buffer, 0, buffer, len, strLen);
            size += strLen;
        } 
        return ((_returnReplacementOperator1318.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final org.apache.commons.lang3.text.StrBuilder str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperator1319.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperator1320.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final char[] chars) {
        if (chars == null) {
            return ((_returnReplacementOperator1281.is("NULL")) ? ( null ) : (appendNull()));
        } 
        final int strLen = chars.length;
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            java.lang.System.arraycopy(chars, 0, buffer, len, strLen);
            size += strLen;
        } 
        return ((_returnReplacementOperator1282.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final char[] chars, final int startIndex, final int length) {
        if (chars == null) {
            return ((_returnReplacementOperator1283.is("NULL")) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid startIndex: " + length));
        } 
        if ((length < 0) || ((startIndex + length) > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid length: " + length));
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            java.lang.System.arraycopy(chars, startIndex, buffer, len, length);
            size += length;
        } 
        return ((_returnReplacementOperator1284.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final boolean value) {
        if (value) {
            ensureCapacity(((size) + 4));
            buffer[(size)++] = 't';
            buffer[(size)++] = 'r';
            buffer[(size)++] = 'u';
            buffer[(size)++] = 'e';
        } else {
            ensureCapacity(((size) + 5));
            buffer[(size)++] = 'f';
            buffer[(size)++] = 'a';
            buffer[(size)++] = 'l';
            buffer[(size)++] = 's';
            buffer[(size)++] = 'e';
        }
        return ((_returnReplacementOperator1279.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final char ch) {
        final int len = length();
        ensureCapacity((len + 1));
        buffer[(size)++] = ch;
        return ((_returnReplacementOperator1280.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final int value) {
        return ((_returnReplacementOperator1287.is("NULL")) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final long value) {
        return ((_returnReplacementOperator1316.is("NULL")) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final float value) {
        return ((_returnReplacementOperator1286.is("NULL")) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final double value) {
        return ((_returnReplacementOperator1285.is("NULL")) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.Object obj) {
        return ((_returnReplacementOperator1348.is("NULL")) ? ( null ) : (append(obj).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String str) {
        return ((_returnReplacementOperator1349.is("NULL")) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String str, final int startIndex, final int length) {
        return ((_returnReplacementOperator1350.is("NULL")) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String format, final java.lang.Object... objs) {
        return ((_returnReplacementOperator1351.is("NULL")) ? ( null ) : (append(format, objs).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuffer str) {
        return ((_returnReplacementOperator1352.is("NULL")) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuilder str) {
        return ((_returnReplacementOperator1354.is("NULL")) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuilder str, final int startIndex, final int length) {
        return ((_returnReplacementOperator1355.is("NULL")) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuffer str, final int startIndex, final int length) {
        return ((_returnReplacementOperator1353.is("NULL")) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final org.apache.commons.lang3.text.StrBuilder str) {
        return ((_returnReplacementOperator1357.is("NULL")) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final org.apache.commons.lang3.text.StrBuilder str, final int startIndex, final int length) {
        return ((_returnReplacementOperator1358.is("NULL")) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char[] chars) {
        return ((_returnReplacementOperator1343.is("NULL")) ? ( null ) : (append(chars).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char[] chars, final int startIndex, final int length) {
        return ((_returnReplacementOperator1344.is("NULL")) ? ( null ) : (append(chars, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final boolean value) {
        return ((_returnReplacementOperator1341.is("NULL")) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char ch) {
        return ((_returnReplacementOperator1342.is("NULL")) ? ( null ) : (append(ch).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final int value) {
        return ((_returnReplacementOperator1347.is("NULL")) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final long value) {
        return ((_returnReplacementOperator1356.is("NULL")) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final float value) {
        return ((_returnReplacementOperator1346.is("NULL")) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final double value) {
        return ((_returnReplacementOperator1345.is("NULL")) ? ( null ) : (append(value).appendNewLine()));
    }

    public <T>org.apache.commons.lang3.text.StrBuilder appendAll(final T... array) {
        if ((array != null) && ((array.length) > 0)) {
            for (final java.lang.Object element : array) {
                append(element);
            }
        } 
        return ((_returnReplacementOperator1192.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(final java.lang.Iterable<?> iterable) {
        if (iterable != null) {
            for (final java.lang.Object o : iterable) {
                append(o);
            }
        } 
        return ((_returnReplacementOperator1321.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(final java.util.Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                append(it.next());
            }
        } 
        return ((_returnReplacementOperator1322.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(final java.lang.Object[] array, final java.lang.String separator) {
        if ((array != null) && ((array.length) > 0)) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String sep = org.apache.commons.lang3.ObjectUtils.toString(separator);
            append(array[0]);
            for (int i = 1 ; i < (array.length) ; i++) {
                append(sep);
                append(array[i]);
            }
        } 
        return ((_returnReplacementOperator1339.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(final java.lang.Iterable<?> iterable, final java.lang.String separator) {
        if (iterable != null) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String sep = org.apache.commons.lang3.ObjectUtils.toString(separator);
            final java.util.Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(sep);
                } 
            }
        } 
        return ((_returnReplacementOperator1338.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(final java.util.Iterator<?> it, final java.lang.String separator) {
        if (it != null) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String sep = org.apache.commons.lang3.ObjectUtils.toString(separator);
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(sep);
                } 
            }
        } 
        return ((_returnReplacementOperator1340.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String separator) {
        return ((_returnReplacementOperator1335.is("NULL")) ? ( null ) : (appendSeparator(separator, null)));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String standard, final java.lang.String defaultIfEmpty) {
        final java.lang.String str = isEmpty() ? defaultIfEmpty : standard;
        if (str != null) {
            append(str);
        } 
        return ((_returnReplacementOperator1337.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char separator) {
        if ((size()) > 0) {
            append(separator);
        } 
        return ((_returnReplacementOperator1332.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char standard, final char defaultIfEmpty) {
        if ((size()) > 0) {
            append(standard);
        } else {
            append(defaultIfEmpty);
        }
        return ((_returnReplacementOperator1333.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String separator, final int loopIndex) {
        if ((separator != null) && (loopIndex > 0)) {
            append(separator);
        } 
        return ((_returnReplacementOperator1336.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char separator, final int loopIndex) {
        if (loopIndex > 0) {
            append(separator);
        } 
        return ((_returnReplacementOperator1334.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendPadding(final int length, final char padChar) {
        if (length >= 0) {
            ensureCapacity(((size) + length));
            for (int i = 0 ; i < length ; i++) {
                buffer[(size)++] = padChar;
            }
        } 
        return ((_returnReplacementOperator1331.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(final java.lang.Object obj, final int width, final char padChar) {
        if (width > 0) {
            ensureCapacity(((size) + width));
            java.lang.String str = obj == null ? getNullText() : obj.toString();
            if (str == null) {
                str = "";
            } 
            final int strLen = str.length();
            if (strLen >= width) {
                str.getChars((strLen - width), strLen, buffer, size);
            } else {
                final int padLen = width - strLen;
                for (int i = 0 ; i < padLen ; i++) {
                    buffer[((size) + i)] = padChar;
                }
                str.getChars(0, strLen, buffer, ((size) + padLen));
            }
            size += width;
        } 
        return ((_returnReplacementOperator1324.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(final int value, final int width, final char padChar) {
        return ((_returnReplacementOperator1323.is("NULL")) ? ( null ) : (appendFixedWidthPadLeft(java.lang.String.valueOf(value), width, padChar)));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(final java.lang.Object obj, final int width, final char padChar) {
        if (width > 0) {
            ensureCapacity(((size) + width));
            java.lang.String str = obj == null ? getNullText() : obj.toString();
            if (str == null) {
                str = "";
            } 
            final int strLen = str.length();
            if (strLen >= width) {
                str.getChars(0, width, buffer, size);
            } else {
                final int padLen = width - strLen;
                str.getChars(0, strLen, buffer, size);
                for (int i = 0 ; i < padLen ; i++) {
                    buffer[(((size) + strLen) + i)] = padChar;
                }
            }
            size += width;
        } 
        return ((_returnReplacementOperator1326.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(final int value, final int width, final char padChar) {
        return ((_returnReplacementOperator1325.is("NULL")) ? ( null ) : (appendFixedWidthPadRight(java.lang.String.valueOf(value), width, padChar)));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final java.lang.Object obj) {
        if (obj == null) {
            return ((_returnReplacementOperator1378.is("NULL")) ? ( null ) : (insert(index, nullText)));
        } 
        return ((_returnReplacementOperator1379.is("NULL")) ? ( null ) : (insert(index, obj.toString())));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, java.lang.String str) {
        validateIndex(index);
        if (str == null) {
            str = nullText;
        } 
        if (str != null) {
            final int strLen = str.length();
            if (strLen > 0) {
                final int newSize = (size) + strLen;
                ensureCapacity(newSize);
                java.lang.System.arraycopy(buffer, index, buffer, (index + strLen), ((size) - index));
                size = newSize;
                str.getChars(0, strLen, buffer, index);
            } 
        } 
        return ((_returnReplacementOperator1380.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char[] chars) {
        validateIndex(index);
        if (chars == null) {
            return ((_returnReplacementOperator1371.is("NULL")) ? ( null ) : (insert(index, nullText)));
        } 
        final int len = chars.length;
        if (len > 0) {
            ensureCapacity(((size) + len));
            java.lang.System.arraycopy(buffer, index, buffer, (index + len), ((size) - index));
            java.lang.System.arraycopy(chars, 0, buffer, index, len);
            size += len;
        } 
        return ((_returnReplacementOperator1372.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char[] chars, final int offset, final int length) {
        validateIndex(index);
        if (chars == null) {
            return ((_returnReplacementOperator1373.is("NULL")) ? ( null ) : (insert(index, nullText)));
        } 
        if ((offset < 0) || (offset > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid offset: " + offset));
        } 
        if ((length < 0) || ((offset + length) > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid length: " + length));
        } 
        if (length > 0) {
            ensureCapacity(((size) + length));
            java.lang.System.arraycopy(buffer, index, buffer, (index + length), ((size) - index));
            java.lang.System.arraycopy(chars, offset, buffer, index, length);
            size += length;
        } 
        return ((_returnReplacementOperator1374.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int index, final boolean value) {
        validateIndex(index);
        if (value) {
            ensureCapacity(((size) + 4));
            java.lang.System.arraycopy(buffer, index, buffer, (index + 4), ((size) - index));
            buffer[index++] = 't';
            buffer[index++] = 'r';
            buffer[index++] = 'u';
            buffer[index] = 'e';
            size += 4;
        } else {
            ensureCapacity(((size) + 5));
            java.lang.System.arraycopy(buffer, index, buffer, (index + 5), ((size) - index));
            buffer[index++] = 'f';
            buffer[index++] = 'a';
            buffer[index++] = 'l';
            buffer[index++] = 's';
            buffer[index] = 'e';
            size += 5;
        }
        return ((_returnReplacementOperator1369.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char value) {
        validateIndex(index);
        ensureCapacity(((size) + 1));
        java.lang.System.arraycopy(buffer, index, buffer, (index + 1), ((size) - index));
        buffer[index] = value;
        (size)++;
        return ((_returnReplacementOperator1370.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final int value) {
        return ((_returnReplacementOperator1377.is("NULL")) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final long value) {
        return ((_returnReplacementOperator1381.is("NULL")) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final float value) {
        return ((_returnReplacementOperator1376.is("NULL")) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final double value) {
        return ((_returnReplacementOperator1375.is("NULL")) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    private void deleteImpl(final int startIndex, final int endIndex, final int len) {
        java.lang.System.arraycopy(buffer, endIndex, buffer, startIndex, ((size) - endIndex));
        size -= len;
    }

    public org.apache.commons.lang3.text.StrBuilder delete(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len > 0) {
            deleteImpl(startIndex, endIndex, len);
        } 
        return ((_returnReplacementOperator1360.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final char ch) {
        for (int i = 0 ; i < (size) ; i++) {
            if ((buffer[i]) == ch) {
                final int start = i;
                while ((++i) < (size)) {
                    if ((buffer[i]) != ch) {
                        break;
                    } 
                }
                final int len = i - start;
                deleteImpl(start, i, len);
                i -= len;
            } 
        }
        return ((_returnReplacementOperator1361.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final char ch) {
        for (int i = 0 ; i < (size) ; i++) {
            if ((buffer[i]) == ch) {
                deleteImpl(i, (i + 1), 1);
                break;
            } 
        }
        return ((_returnReplacementOperator1365.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final java.lang.String str) {
        final int len = str == null ? 0 : str.length();
        if (len > 0) {
            int index = indexOf(str, 0);
            while (index >= 0) {
                deleteImpl(index, (index + len), len);
                index = indexOf(str, index);
            }
        } 
        return ((_returnReplacementOperator1362.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final java.lang.String str) {
        final int len = str == null ? 0 : str.length();
        if (len > 0) {
            final int index = indexOf(str, 0);
            if (index >= 0) {
                deleteImpl(index, (index + len), len);
            } 
        } 
        return ((_returnReplacementOperator1366.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperator1363.is("NULL")) ? ( null ) : (replace(matcher, null, 0, size, -1)));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperator1367.is("NULL")) ? ( null ) : (replace(matcher, null, 0, size, 1)));
    }

    private void replaceImpl(final int startIndex, final int endIndex, final int removeLen, final java.lang.String insertStr, final int insertLen) {
        final int newSize = ((size) - removeLen) + insertLen;
        if (insertLen != removeLen) {
            ensureCapacity(newSize);
            java.lang.System.arraycopy(buffer, endIndex, buffer, (startIndex + insertLen), ((size) - endIndex));
            size = newSize;
        } 
        if (insertLen > 0) {
            insertStr.getChars(0, insertLen, buffer, startIndex);
        } 
    }

    public org.apache.commons.lang3.text.StrBuilder replace(final int startIndex, int endIndex, final java.lang.String replaceStr) {
        endIndex = validateRange(startIndex, endIndex);
        final int insertLen = replaceStr == null ? 0 : replaceStr.length();
        replaceImpl(startIndex, endIndex, (endIndex - startIndex), replaceStr, insertLen);
        return ((_returnReplacementOperator1383.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final char search, final char replace) {
        if (search != replace) {
            for (int i = 0 ; i < (size) ; i++) {
                if ((buffer[i]) == search) {
                    buffer[i] = replace;
                } 
            }
        } 
        return ((_returnReplacementOperator1385.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final char search, final char replace) {
        if (search != replace) {
            for (int i = 0 ; i < (size) ; i++) {
                if ((buffer[i]) == search) {
                    buffer[i] = replace;
                    break;
                } 
            }
        } 
        return ((_returnReplacementOperator1388.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final java.lang.String searchStr, final java.lang.String replaceStr) {
        final int searchLen = searchStr == null ? 0 : searchStr.length();
        if (searchLen > 0) {
            final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
            int index = indexOf(searchStr, 0);
            while (index >= 0) {
                replaceImpl(index, (index + searchLen), searchLen, replaceStr, replaceLen);
                index = indexOf(searchStr, (index + replaceLen));
            }
        } 
        return ((_returnReplacementOperator1386.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final java.lang.String searchStr, final java.lang.String replaceStr) {
        final int searchLen = searchStr == null ? 0 : searchStr.length();
        if (searchLen > 0) {
            final int index = indexOf(searchStr, 0);
            if (index >= 0) {
                final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
                replaceImpl(index, (index + searchLen), searchLen, replaceStr, replaceLen);
            } 
        } 
        return ((_returnReplacementOperator1389.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr) {
        return ((_returnReplacementOperator1387.is("NULL")) ? ( null ) : (replace(matcher, replaceStr, 0, size, -1)));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr) {
        return ((_returnReplacementOperator1390.is("NULL")) ? ( null ) : (replace(matcher, replaceStr, 0, size, 1)));
    }

    public org.apache.commons.lang3.text.StrBuilder replace(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr, final int startIndex, int endIndex, final int replaceCount) {
        endIndex = validateRange(startIndex, endIndex);
        return ((_returnReplacementOperator1384.is("NULL")) ? ( null ) : (replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount)));
    }

    private org.apache.commons.lang3.text.StrBuilder replaceImpl(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr, final int from, int to, int replaceCount) {
        if ((matcher == null) || ((size) == 0)) {
            return ((_returnReplacementOperator1391.is("NULL")) ? ( null ) : (this));
        } 
        final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
        final char[] buf = buffer;
        for (int i = from ; (i < to) && (replaceCount != 0) ; i++) {
            final int removeLen = matcher.isMatch(buf, i, from, to);
            if (removeLen > 0) {
                replaceImpl(i, (i + removeLen), removeLen, replaceStr, replaceLen);
                to = (to - removeLen) + replaceLen;
                i = (i + replaceLen) - 1;
                if (replaceCount > 0) {
                    replaceCount--;
                } 
            } 
        }
        return ((_returnReplacementOperator1392.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder reverse() {
        if ((size) == 0) {
            return ((_returnReplacementOperator1393.is("NULL")) ? ( null ) : (this));
        } 
        final int half = (size) / 2;
        final char[] buf = buffer;
        for (int leftIdx = 0, rightIdx = (size) - 1 ; leftIdx < half ; leftIdx++ , rightIdx--) {
            final char swap = buf[leftIdx];
            buf[leftIdx] = buf[rightIdx];
            buf[rightIdx] = swap;
        }
        return ((_returnReplacementOperator1394.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder trim() {
        if ((size) == 0) {
            return ((_returnReplacementOperator1399.is("NULL")) ? ( null ) : (this));
        } 
        int len = size;
        final char[] buf = buffer;
        int pos = 0;
        while ((pos < len) && ((buf[pos]) <= ' ')) {
            pos++;
        }
        while ((pos < len) && ((buf[(len - 1)]) <= ' ')) {
            len--;
        }
        if (len < (size)) {
            delete(len, size);
        } 
        if (pos > 0) {
            delete(0, pos);
        } 
        return ((_returnReplacementOperator1400.is("NULL")) ? ( null ) : (this));
    }

    public boolean startsWith(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator1213.is("NULL")) ? ( null ) : (false));
        } 
        final int len = str.length();
        if (len == 0) {
            return ((_returnReplacementOperator1214.is("NULL")) ? ( null ) : (true));
        } 
        if (len > (size)) {
            return ((_returnReplacementOperator1215.is("NULL")) ? ( null ) : (false));
        } 
        for (int i = 0 ; i < len ; i++) {
            if ((buffer[i]) != (str.charAt(i))) {
                return ((_returnReplacementOperator1216.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1217.is("NULL")) ? ( null ) : (true));
    }

    public boolean endsWith(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator1197.is("NULL")) ? ( null ) : (false));
        } 
        final int len = str.length();
        if (len == 0) {
            return ((_returnReplacementOperator1198.is("NULL")) ? ( null ) : (true));
        } 
        if (len > (size)) {
            return ((_returnReplacementOperator1199.is("NULL")) ? ( null ) : (false));
        } 
        int pos = (size) - len;
        for (int i = 0 ; i < len ; i++ , pos++) {
            if ((buffer[pos]) != (str.charAt(i))) {
                return ((_returnReplacementOperator1200.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1201.is("NULL")) ? ( null ) : (true));
    }

    @java.lang.Override
    public java.lang.CharSequence subSequence(final int startIndex, final int endIndex) {
        if (startIndex < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(startIndex);
        } 
        if (endIndex > (size)) {
            throw new java.lang.StringIndexOutOfBoundsException(endIndex);
        } 
        if (startIndex > endIndex) {
            throw new java.lang.StringIndexOutOfBoundsException((endIndex - startIndex));
        } 
        return ((_returnReplacementOperator1261.is("NULL")) ? ( null ) : (substring(startIndex, endIndex)));
    }

    public java.lang.String substring(final int start) {
        return ((_returnReplacementOperator1274.is("NULL")) ? ( null ) : (substring(start, size)));
    }

    public java.lang.String substring(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        return ((_returnReplacementOperator1275.is("NULL")) ? ( null ) : (new java.lang.String(buffer , startIndex , (endIndex - startIndex))));
    }

    public java.lang.String leftString(final int length) {
        if (length <= 0) {
            return ((_returnReplacementOperator1265.is("NULL")) ? ( null ) : (""));
        } else if (length >= (size)) {
            return ((_returnReplacementOperator1266.is("NULL")) ? ( null ) : (new java.lang.String(buffer , 0 , size)));
        } else {
            return ((_returnReplacementOperator1267.is("NULL")) ? ( null ) : (new java.lang.String(buffer , 0 , length)));
        }
    }

    public java.lang.String rightString(final int length) {
        if (length <= 0) {
            return ((_returnReplacementOperator1271.is("NULL")) ? ( null ) : (""));
        } else if (length >= (size)) {
            return ((_returnReplacementOperator1272.is("NULL")) ? ( null ) : (new java.lang.String(buffer , 0 , size)));
        } else {
            return ((_returnReplacementOperator1273.is("NULL")) ? ( null ) : (new java.lang.String(buffer , ((size) - length) , length)));
        }
    }

    public java.lang.String midString(int index, final int length) {
        if (index < 0) {
            index = 0;
        } 
        if ((length <= 0) || (index >= (size))) {
            return ((_returnReplacementOperator1268.is("NULL")) ? ( null ) : (""));
        } 
        if ((size) <= (index + length)) {
            return ((_returnReplacementOperator1269.is("NULL")) ? ( null ) : (new java.lang.String(buffer , index , ((size) - index))));
        } 
        return ((_returnReplacementOperator1270.is("NULL")) ? ( null ) : (new java.lang.String(buffer , index , length)));
    }

    public boolean contains(final char ch) {
        final char[] thisBuf = buffer;
        for (int i = 0 ; i < (this.size) ; i++) {
            if ((thisBuf[i]) == ch) {
                return ((_returnReplacementOperator1193.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator1194.is("NULL")) ? ( null ) : (false));
    }

    public boolean contains(final java.lang.String str) {
        return ((_returnReplacementOperator1195.is("NULL")) ? ( null ) : ((indexOf(str, 0)) >= 0));
    }

    public boolean contains(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperator1196.is("NULL")) ? ( null ) : ((indexOf(matcher, 0)) >= 0));
    }

    public int indexOf(final char ch) {
        return ((_returnReplacementOperator1226.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1226.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1226.is("ZERO")) ? ( 0 ) : (indexOf(ch, 0)));
    }

    public int indexOf(final char ch, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if (startIndex >= (size)) {
            return ((_returnReplacementOperator1227.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1227.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1227.is("ZERO")) ? ( 0 ) : (-1));
        } 
        final char[] thisBuf = buffer;
        for (int i = startIndex ; i < (size) ; i++) {
            if ((thisBuf[i]) == ch) {
                return ((_returnReplacementOperator1228.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1228.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1228.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator1229.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1229.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1229.is("ZERO")) ? ( 0 ) : (-1));
    }

    public int indexOf(final java.lang.String str) {
        return ((_returnReplacementOperator1230.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1230.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1230.is("ZERO")) ? ( 0 ) : (indexOf(str, 0)));
    }

    public int indexOf(final java.lang.String str, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if ((str == null) || (startIndex >= (size))) {
            return ((_returnReplacementOperator1231.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1231.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1231.is("ZERO")) ? ( 0 ) : (-1));
        } 
        final int strLen = str.length();
        if (strLen == 1) {
            return ((_returnReplacementOperator1232.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1232.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1232.is("ZERO")) ? ( 0 ) : (indexOf(str.charAt(0), startIndex)));
        } 
        if (strLen == 0) {
            return ((_returnReplacementOperator1233.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1233.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1233.is("ZERO")) ? ( 0 ) : (startIndex));
        } 
        if (strLen > (size)) {
            return ((_returnReplacementOperator1234.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1234.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1234.is("ZERO")) ? ( 0 ) : (-1));
        } 
        final char[] thisBuf = buffer;
        final int len = ((size) - strLen) + 1;
        outer : for (int i = startIndex ; i < len ; i++) {
            for (int j = 0 ; j < strLen ; j++) {
                if ((str.charAt(j)) != (thisBuf[(i + j)])) {
                    continue outer;
                } 
            }
            return ((_returnReplacementOperator1235.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1235.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1235.is("ZERO")) ? ( 0 ) : (i));
        }
        return ((_returnReplacementOperator1236.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1236.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1236.is("ZERO")) ? ( 0 ) : (-1));
    }

    public int indexOf(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperator1237.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1237.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1237.is("ZERO")) ? ( 0 ) : (indexOf(matcher, 0)));
    }

    public int indexOf(final org.apache.commons.lang3.text.StrMatcher matcher, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if ((matcher == null) || (startIndex >= (size))) {
            return ((_returnReplacementOperator1238.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1238.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1238.is("ZERO")) ? ( 0 ) : (-1));
        } 
        final int len = size;
        final char[] buf = buffer;
        for (int i = startIndex ; i < len ; i++) {
            if ((matcher.isMatch(buf, i, startIndex, len)) > 0) {
                return ((_returnReplacementOperator1239.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1239.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1239.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator1240.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1240.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1240.is("ZERO")) ? ( 0 ) : (-1));
    }

    public int lastIndexOf(final char ch) {
        return ((_returnReplacementOperator1241.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1241.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1241.is("ZERO")) ? ( 0 ) : (lastIndexOf(ch, ((size) - 1))));
    }

    public int lastIndexOf(final char ch, int startIndex) {
        startIndex = startIndex >= (size) ? (size) - 1 : startIndex;
        if (startIndex < 0) {
            return ((_returnReplacementOperator1242.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1242.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1242.is("ZERO")) ? ( 0 ) : (-1));
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if ((buffer[i]) == ch) {
                return ((_returnReplacementOperator1243.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1243.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1243.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator1244.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1244.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1244.is("ZERO")) ? ( 0 ) : (-1));
    }

    public int lastIndexOf(final java.lang.String str) {
        return ((_returnReplacementOperator1245.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1245.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1245.is("ZERO")) ? ( 0 ) : (lastIndexOf(str, ((size) - 1))));
    }

    public int lastIndexOf(final java.lang.String str, int startIndex) {
        startIndex = startIndex >= (size) ? (size) - 1 : startIndex;
        if ((str == null) || (startIndex < 0)) {
            return ((_returnReplacementOperator1246.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1246.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1246.is("ZERO")) ? ( 0 ) : (-1));
        } 
        final int strLen = str.length();
        if ((strLen > 0) && (strLen <= (size))) {
            if (strLen == 1) {
                return ((_returnReplacementOperator1247.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1247.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1247.is("ZERO")) ? ( 0 ) : (lastIndexOf(str.charAt(0), startIndex)));
            } 
            outer : for (int i = (startIndex - strLen) + 1 ; i >= 0 ; i--) {
                for (int j = 0 ; j < strLen ; j++) {
                    if ((str.charAt(j)) != (buffer[(i + j)])) {
                        continue outer;
                    } 
                }
                return ((_returnReplacementOperator1248.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1248.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1248.is("ZERO")) ? ( 0 ) : (i));
            }
        } else if (strLen == 0) {
            return ((_returnReplacementOperator1249.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1249.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1249.is("ZERO")) ? ( 0 ) : (startIndex));
        } 
        return ((_returnReplacementOperator1250.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1250.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1250.is("ZERO")) ? ( 0 ) : (-1));
    }

    public int lastIndexOf(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperator1251.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1251.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1251.is("ZERO")) ? ( 0 ) : (lastIndexOf(matcher, size)));
    }

    public int lastIndexOf(final org.apache.commons.lang3.text.StrMatcher matcher, int startIndex) {
        startIndex = startIndex >= (size) ? (size) - 1 : startIndex;
        if ((matcher == null) || (startIndex < 0)) {
            return ((_returnReplacementOperator1252.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1252.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1252.is("ZERO")) ? ( 0 ) : (-1));
        } 
        final char[] buf = buffer;
        final int endIndex = startIndex + 1;
        for (int i = startIndex ; i >= 0 ; i--) {
            if ((matcher.isMatch(buf, i, 0, endIndex)) > 0) {
                return ((_returnReplacementOperator1253.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1253.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1253.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator1254.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1254.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1254.is("ZERO")) ? ( 0 ) : (-1));
    }

    public org.apache.commons.lang3.text.StrTokenizer asTokenizer() {
        return ((_returnReplacementOperator1401.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer()));
    }

    public java.io.Reader asReader() {
        return ((_returnReplacementOperator1259.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrBuilder.StrBuilderReader()));
    }

    public java.io.Writer asWriter() {
        return ((_returnReplacementOperator1260.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter()));
    }

    public void appendTo(final java.lang.Appendable appendable) throws java.io.IOException {
        if (appendable instanceof java.io.Writer) {
            ((java.io.Writer)(appendable)).write(buffer, 0, size);
        } else if (appendable instanceof java.lang.StringBuilder) {
            ((java.lang.StringBuilder)(appendable)).append(buffer, 0, size);
        } else if (appendable instanceof java.lang.StringBuffer) {
            ((java.lang.StringBuffer)(appendable)).append(buffer, 0, size);
        } else if (appendable instanceof java.nio.CharBuffer) {
            ((java.nio.CharBuffer)(appendable)).put(buffer, 0, size);
        } else {
            appendable.append(this);
        }
    }

    public boolean equalsIgnoreCase(final org.apache.commons.lang3.text.StrBuilder other) {
        if ((this) == other) {
            return ((_returnReplacementOperator1208.is("NULL")) ? ( null ) : (true));
        } 
        if ((this.size) != (other.size)) {
            return ((_returnReplacementOperator1209.is("NULL")) ? ( null ) : (false));
        } 
        final char[] thisBuf = this.buffer;
        final char[] otherBuf = other.buffer;
        for (int i = (size) - 1 ; i >= 0 ; i--) {
            final char c1 = thisBuf[i];
            final char c2 = otherBuf[i];
            if ((c1 != c2) && ((java.lang.Character.toUpperCase(c1)) != (java.lang.Character.toUpperCase(c2)))) {
                return ((_returnReplacementOperator1210.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1211.is("NULL")) ? ( null ) : (true));
    }

    public boolean equals(final org.apache.commons.lang3.text.StrBuilder other) {
        if ((this) == other) {
            return ((_returnReplacementOperator1203.is("NULL")) ? ( null ) : (true));
        } 
        if (other == null) {
            return ((_returnReplacementOperator1204.is("NULL")) ? ( null ) : (false));
        } 
        if ((this.size) != (other.size)) {
            return ((_returnReplacementOperator1205.is("NULL")) ? ( null ) : (false));
        } 
        final char[] thisBuf = this.buffer;
        final char[] otherBuf = other.buffer;
        for (int i = (size) - 1 ; i >= 0 ; i--) {
            if ((thisBuf[i]) != (otherBuf[i])) {
                return ((_returnReplacementOperator1206.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1207.is("NULL")) ? ( null ) : (true));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return ((_returnReplacementOperator1202.is("NULL")) ? ( null ) : ((obj instanceof org.apache.commons.lang3.text.StrBuilder) && (equals(((org.apache.commons.lang3.text.StrBuilder)(obj))))));
    }

    @java.lang.Override
    public int hashCode() {
        final char[] buf = buffer;
        int hash = 0;
        for (int i = (size) - 1 ; i >= 0 ; i--) {
            hash = (31 * hash) + (buf[i]);
        }
        return ((_returnReplacementOperator1225.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1225.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1225.is("ZERO")) ? ( 0 ) : (hash));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator1276.is("NULL")) ? ( null ) : (new java.lang.String(buffer , 0 , size)));
    }

    public java.lang.StringBuffer toStringBuffer() {
        return ((_returnReplacementOperator1277.is("NULL")) ? ( null ) : (new java.lang.StringBuffer(size).append(buffer, 0, size)));
    }

    public java.lang.StringBuilder toStringBuilder() {
        return ((_returnReplacementOperator1278.is("NULL")) ? ( null ) : (new java.lang.StringBuilder(size).append(buffer, 0, size)));
    }

    @java.lang.Override
    public java.lang.String build() {
        return ((_returnReplacementOperator1262.is("NULL")) ? ( null ) : (toString()));
    }

    protected int validateRange(final int startIndex, int endIndex) {
        if (startIndex < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(startIndex);
        } 
        if (endIndex > (size)) {
            endIndex = size;
        } 
        if (startIndex > endIndex) {
            throw new java.lang.StringIndexOutOfBoundsException("end < start");
        } 
        return ((_returnReplacementOperator1258.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1258.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1258.is("ZERO")) ? ( 0 ) : (endIndex));
    }

    protected void validateIndex(final int index) {
        if ((index < 0) || (index > (size))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
    }

    class StrBuilderTokenizer extends org.apache.commons.lang3.text.StrTokenizer {
        StrBuilderTokenizer() {
            super();
        }

        @java.lang.Override
        protected java.util.List<java.lang.String> tokenize(final char[] chars, final int offset, final int count) {
            if (chars == null) {
                return ((_returnReplacementOperator1190.is("NULL")) ? ( null ) : (super.tokenize(org.apache.commons.lang3.text.StrBuilder.this.buffer, 0, org.apache.commons.lang3.text.StrBuilder.this.size())));
            } 
            return ((_returnReplacementOperator1191.is("NULL")) ? ( null ) : (super.tokenize(chars, offset, count)));
        }

        @java.lang.Override
        public java.lang.String getContent() {
            final java.lang.String str = super.getContent();
            if (str == null) {
                return ((_returnReplacementOperator1188.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrBuilder.this.toString()));
            } 
            return ((_returnReplacementOperator1189.is("NULL")) ? ( null ) : (str));
        }
    }

    class StrBuilderReader extends java.io.Reader {
        private int pos;

        private int mark;

        StrBuilderReader() {
            super();
        }

        @java.lang.Override
        public void close() {
        }

        @java.lang.Override
        public int read() {
            if ((ready()) == false) {
                return ((_returnReplacementOperator1181.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1181.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1181.is("ZERO")) ? ( 0 ) : (-1));
            } 
            return ((_returnReplacementOperator1182.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrBuilder.this.charAt((pos)++)));
        }

        @java.lang.Override
        public int read(final char[] b, final int off, int len) {
            if (((((off < 0) || (len < 0)) || (off > (b.length))) || ((off + len) > (b.length))) || ((off + len) < 0)) {
                throw new java.lang.IndexOutOfBoundsException();
            } 
            if (len == 0) {
                return ((_returnReplacementOperator1183.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1183.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1183.is("ZERO")) ? ( 0 ) : (0));
            } 
            if ((pos) >= (org.apache.commons.lang3.text.StrBuilder.this.size())) {
                return ((_returnReplacementOperator1184.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1184.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1184.is("ZERO")) ? ( 0 ) : (-1));
            } 
            if (((pos) + len) > (size())) {
                len = (org.apache.commons.lang3.text.StrBuilder.this.size()) - (pos);
            } 
            org.apache.commons.lang3.text.StrBuilder.this.getChars(pos, ((pos) + len), b, off);
            pos += len;
            return ((_returnReplacementOperator1185.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1185.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1185.is("ZERO")) ? ( 0 ) : (len));
        }

        @java.lang.Override
        public long skip(long n) {
            if (((pos) + n) > (org.apache.commons.lang3.text.StrBuilder.this.size())) {
                n = (org.apache.commons.lang3.text.StrBuilder.this.size()) - (pos);
            } 
            if (n < 0) {
                return ((_returnReplacementOperator1186.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1186.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1186.is("ZERO")) ? ( 0 ) : (0));
            } 
            pos += n;
            return ((_returnReplacementOperator1187.is("NULL")) ? ( null ) : (n));
        }

        @java.lang.Override
        public boolean ready() {
            return ((_returnReplacementOperator1180.is("NULL")) ? ( null ) : ((pos) < (org.apache.commons.lang3.text.StrBuilder.this.size())));
        }

        @java.lang.Override
        public boolean markSupported() {
            return ((_returnReplacementOperator1179.is("NULL")) ? ( null ) : (true));
        }

        @java.lang.Override
        public void mark(final int readAheadLimit) {
            mark = pos;
        }

        @java.lang.Override
        public void reset() {
            pos = mark;
        }
    }

    class StrBuilderWriter extends java.io.Writer {
        StrBuilderWriter() {
            super();
        }

        @java.lang.Override
        public void close() {
        }

        @java.lang.Override
        public void flush() {
        }

        @java.lang.Override
        public void write(final int c) {
            org.apache.commons.lang3.text.StrBuilder.this.append(((char)(c)));
        }

        @java.lang.Override
        public void write(final char[] cbuf) {
            org.apache.commons.lang3.text.StrBuilder.this.append(cbuf);
        }

        @java.lang.Override
        public void write(final char[] cbuf, final int off, final int len) {
            org.apache.commons.lang3.text.StrBuilder.this.append(cbuf, off, len);
        }

        @java.lang.Override
        public void write(final java.lang.String str) {
            org.apache.commons.lang3.text.StrBuilder.this.append(str);
        }

        @java.lang.Override
        public void write(final java.lang.String str, final int off, final int len) {
            org.apache.commons.lang3.text.StrBuilder.this.append(str, off, len);
        }
    }

    private static final metamutator.Selector _returnReplacementOperator1179 = metamutator.Selector.of(1179,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1179");

    private static final metamutator.Selector _returnReplacementOperator1180 = metamutator.Selector.of(1180,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1180");

    private static final metamutator.Selector _returnReplacementOperator1181 = metamutator.Selector.of(1181,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1181");

    private static final metamutator.Selector _returnReplacementOperator1182 = metamutator.Selector.of(1182,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1182");

    private static final metamutator.Selector _returnReplacementOperator1183 = metamutator.Selector.of(1183,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1183");

    private static final metamutator.Selector _returnReplacementOperator1184 = metamutator.Selector.of(1184,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1184");

    private static final metamutator.Selector _returnReplacementOperator1185 = metamutator.Selector.of(1185,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1185");

    private static final metamutator.Selector _returnReplacementOperator1186 = metamutator.Selector.of(1186,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1186");

    private static final metamutator.Selector _returnReplacementOperator1187 = metamutator.Selector.of(1187,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1187");

    private static final metamutator.Selector _returnReplacementOperator1188 = metamutator.Selector.of(1188,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1188");

    private static final metamutator.Selector _returnReplacementOperator1189 = metamutator.Selector.of(1189,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1189");

    private static final metamutator.Selector _returnReplacementOperator1190 = metamutator.Selector.of(1190,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1190");

    private static final metamutator.Selector _returnReplacementOperator1191 = metamutator.Selector.of(1191,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1191");

    private static final metamutator.Selector _returnReplacementOperator1192 = metamutator.Selector.of(1192,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1192");

    private static final metamutator.Selector _returnReplacementOperator1193 = metamutator.Selector.of(1193,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1193");

    private static final metamutator.Selector _returnReplacementOperator1194 = metamutator.Selector.of(1194,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1194");

    private static final metamutator.Selector _returnReplacementOperator1195 = metamutator.Selector.of(1195,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1195");

    private static final metamutator.Selector _returnReplacementOperator1196 = metamutator.Selector.of(1196,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1196");

    private static final metamutator.Selector _returnReplacementOperator1197 = metamutator.Selector.of(1197,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1197");

    private static final metamutator.Selector _returnReplacementOperator1198 = metamutator.Selector.of(1198,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1198");

    private static final metamutator.Selector _returnReplacementOperator1199 = metamutator.Selector.of(1199,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1199");

    private static final metamutator.Selector _returnReplacementOperator1200 = metamutator.Selector.of(1200,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1200");

    private static final metamutator.Selector _returnReplacementOperator1201 = metamutator.Selector.of(1201,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1201");

    private static final metamutator.Selector _returnReplacementOperator1202 = metamutator.Selector.of(1202,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1202");

    private static final metamutator.Selector _returnReplacementOperator1203 = metamutator.Selector.of(1203,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1203");

    private static final metamutator.Selector _returnReplacementOperator1204 = metamutator.Selector.of(1204,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1204");

    private static final metamutator.Selector _returnReplacementOperator1205 = metamutator.Selector.of(1205,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1205");

    private static final metamutator.Selector _returnReplacementOperator1206 = metamutator.Selector.of(1206,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1206");

    private static final metamutator.Selector _returnReplacementOperator1207 = metamutator.Selector.of(1207,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1207");

    private static final metamutator.Selector _returnReplacementOperator1208 = metamutator.Selector.of(1208,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1208");

    private static final metamutator.Selector _returnReplacementOperator1209 = metamutator.Selector.of(1209,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1209");

    private static final metamutator.Selector _returnReplacementOperator1210 = metamutator.Selector.of(1210,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1210");

    private static final metamutator.Selector _returnReplacementOperator1211 = metamutator.Selector.of(1211,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1211");

    private static final metamutator.Selector _returnReplacementOperator1212 = metamutator.Selector.of(1212,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1212");

    private static final metamutator.Selector _returnReplacementOperator1213 = metamutator.Selector.of(1213,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1213");

    private static final metamutator.Selector _returnReplacementOperator1214 = metamutator.Selector.of(1214,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1214");

    private static final metamutator.Selector _returnReplacementOperator1215 = metamutator.Selector.of(1215,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1215");

    private static final metamutator.Selector _returnReplacementOperator1216 = metamutator.Selector.of(1216,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1216");

    private static final metamutator.Selector _returnReplacementOperator1217 = metamutator.Selector.of(1217,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1217");

    private static final metamutator.Selector _returnReplacementOperator1218 = metamutator.Selector.of(1218,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1218");

    private static final metamutator.Selector _returnReplacementOperator1219 = metamutator.Selector.of(1219,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1219");

    private static final metamutator.Selector _returnReplacementOperator1220 = metamutator.Selector.of(1220,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1220");

    private static final metamutator.Selector _returnReplacementOperator1221 = metamutator.Selector.of(1221,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1221");

    private static final metamutator.Selector _returnReplacementOperator1222 = metamutator.Selector.of(1222,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1222");

    private static final metamutator.Selector _returnReplacementOperator1223 = metamutator.Selector.of(1223,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1223");

    private static final metamutator.Selector _returnReplacementOperator1224 = metamutator.Selector.of(1224,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1224");

    private static final metamutator.Selector _returnReplacementOperator1225 = metamutator.Selector.of(1225,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1225");

    private static final metamutator.Selector _returnReplacementOperator1226 = metamutator.Selector.of(1226,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1226");

    private static final metamutator.Selector _returnReplacementOperator1227 = metamutator.Selector.of(1227,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1227");

    private static final metamutator.Selector _returnReplacementOperator1228 = metamutator.Selector.of(1228,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1228");

    private static final metamutator.Selector _returnReplacementOperator1229 = metamutator.Selector.of(1229,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1229");

    private static final metamutator.Selector _returnReplacementOperator1230 = metamutator.Selector.of(1230,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1230");

    private static final metamutator.Selector _returnReplacementOperator1231 = metamutator.Selector.of(1231,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1231");

    private static final metamutator.Selector _returnReplacementOperator1232 = metamutator.Selector.of(1232,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1232");

    private static final metamutator.Selector _returnReplacementOperator1233 = metamutator.Selector.of(1233,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1233");

    private static final metamutator.Selector _returnReplacementOperator1234 = metamutator.Selector.of(1234,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1234");

    private static final metamutator.Selector _returnReplacementOperator1235 = metamutator.Selector.of(1235,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1235");

    private static final metamutator.Selector _returnReplacementOperator1236 = metamutator.Selector.of(1236,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1236");

    private static final metamutator.Selector _returnReplacementOperator1237 = metamutator.Selector.of(1237,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1237");

    private static final metamutator.Selector _returnReplacementOperator1238 = metamutator.Selector.of(1238,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1238");

    private static final metamutator.Selector _returnReplacementOperator1239 = metamutator.Selector.of(1239,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1239");

    private static final metamutator.Selector _returnReplacementOperator1240 = metamutator.Selector.of(1240,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1240");

    private static final metamutator.Selector _returnReplacementOperator1241 = metamutator.Selector.of(1241,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1241");

    private static final metamutator.Selector _returnReplacementOperator1242 = metamutator.Selector.of(1242,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1242");

    private static final metamutator.Selector _returnReplacementOperator1243 = metamutator.Selector.of(1243,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1243");

    private static final metamutator.Selector _returnReplacementOperator1244 = metamutator.Selector.of(1244,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1244");

    private static final metamutator.Selector _returnReplacementOperator1245 = metamutator.Selector.of(1245,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1245");

    private static final metamutator.Selector _returnReplacementOperator1246 = metamutator.Selector.of(1246,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1246");

    private static final metamutator.Selector _returnReplacementOperator1247 = metamutator.Selector.of(1247,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1247");

    private static final metamutator.Selector _returnReplacementOperator1248 = metamutator.Selector.of(1248,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1248");

    private static final metamutator.Selector _returnReplacementOperator1249 = metamutator.Selector.of(1249,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1249");

    private static final metamutator.Selector _returnReplacementOperator1250 = metamutator.Selector.of(1250,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1250");

    private static final metamutator.Selector _returnReplacementOperator1251 = metamutator.Selector.of(1251,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1251");

    private static final metamutator.Selector _returnReplacementOperator1252 = metamutator.Selector.of(1252,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1252");

    private static final metamutator.Selector _returnReplacementOperator1253 = metamutator.Selector.of(1253,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1253");

    private static final metamutator.Selector _returnReplacementOperator1254 = metamutator.Selector.of(1254,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1254");

    private static final metamutator.Selector _returnReplacementOperator1255 = metamutator.Selector.of(1255,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1255");

    private static final metamutator.Selector _returnReplacementOperator1256 = metamutator.Selector.of(1256,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1256");

    private static final metamutator.Selector _returnReplacementOperator1257 = metamutator.Selector.of(1257,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1257");

    private static final metamutator.Selector _returnReplacementOperator1258 = metamutator.Selector.of(1258,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1258");

    private static final metamutator.Selector _returnReplacementOperator1259 = metamutator.Selector.of(1259,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1259");

    private static final metamutator.Selector _returnReplacementOperator1260 = metamutator.Selector.of(1260,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1260");

    private static final metamutator.Selector _returnReplacementOperator1261 = metamutator.Selector.of(1261,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1261");

    private static final metamutator.Selector _returnReplacementOperator1262 = metamutator.Selector.of(1262,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1262");

    private static final metamutator.Selector _returnReplacementOperator1263 = metamutator.Selector.of(1263,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1263");

    private static final metamutator.Selector _returnReplacementOperator1264 = metamutator.Selector.of(1264,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1264");

    private static final metamutator.Selector _returnReplacementOperator1265 = metamutator.Selector.of(1265,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1265");

    private static final metamutator.Selector _returnReplacementOperator1266 = metamutator.Selector.of(1266,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1266");

    private static final metamutator.Selector _returnReplacementOperator1267 = metamutator.Selector.of(1267,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1267");

    private static final metamutator.Selector _returnReplacementOperator1268 = metamutator.Selector.of(1268,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1268");

    private static final metamutator.Selector _returnReplacementOperator1269 = metamutator.Selector.of(1269,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1269");

    private static final metamutator.Selector _returnReplacementOperator1270 = metamutator.Selector.of(1270,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1270");

    private static final metamutator.Selector _returnReplacementOperator1271 = metamutator.Selector.of(1271,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1271");

    private static final metamutator.Selector _returnReplacementOperator1272 = metamutator.Selector.of(1272,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1272");

    private static final metamutator.Selector _returnReplacementOperator1273 = metamutator.Selector.of(1273,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1273");

    private static final metamutator.Selector _returnReplacementOperator1274 = metamutator.Selector.of(1274,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1274");

    private static final metamutator.Selector _returnReplacementOperator1275 = metamutator.Selector.of(1275,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1275");

    private static final metamutator.Selector _returnReplacementOperator1276 = metamutator.Selector.of(1276,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1276");

    private static final metamutator.Selector _returnReplacementOperator1277 = metamutator.Selector.of(1277,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1277");

    private static final metamutator.Selector _returnReplacementOperator1278 = metamutator.Selector.of(1278,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1278");

    private static final metamutator.Selector _returnReplacementOperator1279 = metamutator.Selector.of(1279,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1279");

    private static final metamutator.Selector _returnReplacementOperator1280 = metamutator.Selector.of(1280,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1280");

    private static final metamutator.Selector _returnReplacementOperator1281 = metamutator.Selector.of(1281,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1281");

    private static final metamutator.Selector _returnReplacementOperator1282 = metamutator.Selector.of(1282,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1282");

    private static final metamutator.Selector _returnReplacementOperator1283 = metamutator.Selector.of(1283,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1283");

    private static final metamutator.Selector _returnReplacementOperator1284 = metamutator.Selector.of(1284,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1284");

    private static final metamutator.Selector _returnReplacementOperator1285 = metamutator.Selector.of(1285,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1285");

    private static final metamutator.Selector _returnReplacementOperator1286 = metamutator.Selector.of(1286,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1286");

    private static final metamutator.Selector _returnReplacementOperator1287 = metamutator.Selector.of(1287,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1287");

    private static final metamutator.Selector _returnReplacementOperator1288 = metamutator.Selector.of(1288,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1288");

    private static final metamutator.Selector _returnReplacementOperator1289 = metamutator.Selector.of(1289,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1289");

    private static final metamutator.Selector _returnReplacementOperator1290 = metamutator.Selector.of(1290,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1290");

    private static final metamutator.Selector _returnReplacementOperator1291 = metamutator.Selector.of(1291,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1291");

    private static final metamutator.Selector _returnReplacementOperator1292 = metamutator.Selector.of(1292,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1292");

    private static final metamutator.Selector _returnReplacementOperator1293 = metamutator.Selector.of(1293,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1293");

    private static final metamutator.Selector _returnReplacementOperator1294 = metamutator.Selector.of(1294,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1294");

    private static final metamutator.Selector _returnReplacementOperator1295 = metamutator.Selector.of(1295,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1295");

    private static final metamutator.Selector _returnReplacementOperator1296 = metamutator.Selector.of(1296,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1296");

    private static final metamutator.Selector _returnReplacementOperator1297 = metamutator.Selector.of(1297,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1297");

    private static final metamutator.Selector _returnReplacementOperator1298 = metamutator.Selector.of(1298,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1298");

    private static final metamutator.Selector _returnReplacementOperator1299 = metamutator.Selector.of(1299,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1299");

    private static final metamutator.Selector _returnReplacementOperator1300 = metamutator.Selector.of(1300,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1300");

    private static final metamutator.Selector _returnReplacementOperator1301 = metamutator.Selector.of(1301,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1301");

    private static final metamutator.Selector _returnReplacementOperator1302 = metamutator.Selector.of(1302,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1302");

    private static final metamutator.Selector _returnReplacementOperator1303 = metamutator.Selector.of(1303,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1303");

    private static final metamutator.Selector _returnReplacementOperator1304 = metamutator.Selector.of(1304,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1304");

    private static final metamutator.Selector _returnReplacementOperator1305 = metamutator.Selector.of(1305,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1305");

    private static final metamutator.Selector _returnReplacementOperator1306 = metamutator.Selector.of(1306,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1306");

    private static final metamutator.Selector _returnReplacementOperator1307 = metamutator.Selector.of(1307,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1307");

    private static final metamutator.Selector _returnReplacementOperator1308 = metamutator.Selector.of(1308,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1308");

    private static final metamutator.Selector _returnReplacementOperator1309 = metamutator.Selector.of(1309,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1309");

    private static final metamutator.Selector _returnReplacementOperator1310 = metamutator.Selector.of(1310,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1310");

    private static final metamutator.Selector _returnReplacementOperator1311 = metamutator.Selector.of(1311,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1311");

    private static final metamutator.Selector _returnReplacementOperator1312 = metamutator.Selector.of(1312,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1312");

    private static final metamutator.Selector _returnReplacementOperator1313 = metamutator.Selector.of(1313,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1313");

    private static final metamutator.Selector _returnReplacementOperator1314 = metamutator.Selector.of(1314,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1314");

    private static final metamutator.Selector _returnReplacementOperator1315 = metamutator.Selector.of(1315,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1315");

    private static final metamutator.Selector _returnReplacementOperator1316 = metamutator.Selector.of(1316,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1316");

    private static final metamutator.Selector _returnReplacementOperator1317 = metamutator.Selector.of(1317,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1317");

    private static final metamutator.Selector _returnReplacementOperator1318 = metamutator.Selector.of(1318,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1318");

    private static final metamutator.Selector _returnReplacementOperator1319 = metamutator.Selector.of(1319,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1319");

    private static final metamutator.Selector _returnReplacementOperator1320 = metamutator.Selector.of(1320,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1320");

    private static final metamutator.Selector _returnReplacementOperator1321 = metamutator.Selector.of(1321,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1321");

    private static final metamutator.Selector _returnReplacementOperator1322 = metamutator.Selector.of(1322,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1322");

    private static final metamutator.Selector _returnReplacementOperator1323 = metamutator.Selector.of(1323,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1323");

    private static final metamutator.Selector _returnReplacementOperator1324 = metamutator.Selector.of(1324,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1324");

    private static final metamutator.Selector _returnReplacementOperator1325 = metamutator.Selector.of(1325,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1325");

    private static final metamutator.Selector _returnReplacementOperator1326 = metamutator.Selector.of(1326,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1326");

    private static final metamutator.Selector _returnReplacementOperator1327 = metamutator.Selector.of(1327,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1327");

    private static final metamutator.Selector _returnReplacementOperator1328 = metamutator.Selector.of(1328,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1328");

    private static final metamutator.Selector _returnReplacementOperator1329 = metamutator.Selector.of(1329,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1329");

    private static final metamutator.Selector _returnReplacementOperator1330 = metamutator.Selector.of(1330,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1330");

    private static final metamutator.Selector _returnReplacementOperator1331 = metamutator.Selector.of(1331,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1331");

    private static final metamutator.Selector _returnReplacementOperator1332 = metamutator.Selector.of(1332,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1332");

    private static final metamutator.Selector _returnReplacementOperator1333 = metamutator.Selector.of(1333,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1333");

    private static final metamutator.Selector _returnReplacementOperator1334 = metamutator.Selector.of(1334,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1334");

    private static final metamutator.Selector _returnReplacementOperator1335 = metamutator.Selector.of(1335,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1335");

    private static final metamutator.Selector _returnReplacementOperator1336 = metamutator.Selector.of(1336,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1336");

    private static final metamutator.Selector _returnReplacementOperator1337 = metamutator.Selector.of(1337,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1337");

    private static final metamutator.Selector _returnReplacementOperator1338 = metamutator.Selector.of(1338,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1338");

    private static final metamutator.Selector _returnReplacementOperator1339 = metamutator.Selector.of(1339,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1339");

    private static final metamutator.Selector _returnReplacementOperator1340 = metamutator.Selector.of(1340,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1340");

    private static final metamutator.Selector _returnReplacementOperator1341 = metamutator.Selector.of(1341,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1341");

    private static final metamutator.Selector _returnReplacementOperator1342 = metamutator.Selector.of(1342,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1342");

    private static final metamutator.Selector _returnReplacementOperator1343 = metamutator.Selector.of(1343,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1343");

    private static final metamutator.Selector _returnReplacementOperator1344 = metamutator.Selector.of(1344,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1344");

    private static final metamutator.Selector _returnReplacementOperator1345 = metamutator.Selector.of(1345,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1345");

    private static final metamutator.Selector _returnReplacementOperator1346 = metamutator.Selector.of(1346,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1346");

    private static final metamutator.Selector _returnReplacementOperator1347 = metamutator.Selector.of(1347,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1347");

    private static final metamutator.Selector _returnReplacementOperator1348 = metamutator.Selector.of(1348,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1348");

    private static final metamutator.Selector _returnReplacementOperator1349 = metamutator.Selector.of(1349,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1349");

    private static final metamutator.Selector _returnReplacementOperator1350 = metamutator.Selector.of(1350,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1350");

    private static final metamutator.Selector _returnReplacementOperator1351 = metamutator.Selector.of(1351,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1351");

    private static final metamutator.Selector _returnReplacementOperator1352 = metamutator.Selector.of(1352,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1352");

    private static final metamutator.Selector _returnReplacementOperator1353 = metamutator.Selector.of(1353,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1353");

    private static final metamutator.Selector _returnReplacementOperator1354 = metamutator.Selector.of(1354,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1354");

    private static final metamutator.Selector _returnReplacementOperator1355 = metamutator.Selector.of(1355,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1355");

    private static final metamutator.Selector _returnReplacementOperator1356 = metamutator.Selector.of(1356,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1356");

    private static final metamutator.Selector _returnReplacementOperator1357 = metamutator.Selector.of(1357,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1357");

    private static final metamutator.Selector _returnReplacementOperator1358 = metamutator.Selector.of(1358,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1358");

    private static final metamutator.Selector _returnReplacementOperator1359 = metamutator.Selector.of(1359,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1359");

    private static final metamutator.Selector _returnReplacementOperator1360 = metamutator.Selector.of(1360,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1360");

    private static final metamutator.Selector _returnReplacementOperator1361 = metamutator.Selector.of(1361,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1361");

    private static final metamutator.Selector _returnReplacementOperator1362 = metamutator.Selector.of(1362,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1362");

    private static final metamutator.Selector _returnReplacementOperator1363 = metamutator.Selector.of(1363,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1363");

    private static final metamutator.Selector _returnReplacementOperator1364 = metamutator.Selector.of(1364,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1364");

    private static final metamutator.Selector _returnReplacementOperator1365 = metamutator.Selector.of(1365,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1365");

    private static final metamutator.Selector _returnReplacementOperator1366 = metamutator.Selector.of(1366,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1366");

    private static final metamutator.Selector _returnReplacementOperator1367 = metamutator.Selector.of(1367,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1367");

    private static final metamutator.Selector _returnReplacementOperator1368 = metamutator.Selector.of(1368,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1368");

    private static final metamutator.Selector _returnReplacementOperator1369 = metamutator.Selector.of(1369,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1369");

    private static final metamutator.Selector _returnReplacementOperator1370 = metamutator.Selector.of(1370,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1370");

    private static final metamutator.Selector _returnReplacementOperator1371 = metamutator.Selector.of(1371,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1371");

    private static final metamutator.Selector _returnReplacementOperator1372 = metamutator.Selector.of(1372,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1372");

    private static final metamutator.Selector _returnReplacementOperator1373 = metamutator.Selector.of(1373,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1373");

    private static final metamutator.Selector _returnReplacementOperator1374 = metamutator.Selector.of(1374,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1374");

    private static final metamutator.Selector _returnReplacementOperator1375 = metamutator.Selector.of(1375,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1375");

    private static final metamutator.Selector _returnReplacementOperator1376 = metamutator.Selector.of(1376,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1376");

    private static final metamutator.Selector _returnReplacementOperator1377 = metamutator.Selector.of(1377,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1377");

    private static final metamutator.Selector _returnReplacementOperator1378 = metamutator.Selector.of(1378,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1378");

    private static final metamutator.Selector _returnReplacementOperator1379 = metamutator.Selector.of(1379,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1379");

    private static final metamutator.Selector _returnReplacementOperator1380 = metamutator.Selector.of(1380,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1380");

    private static final metamutator.Selector _returnReplacementOperator1381 = metamutator.Selector.of(1381,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1381");

    private static final metamutator.Selector _returnReplacementOperator1382 = metamutator.Selector.of(1382,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1382");

    private static final metamutator.Selector _returnReplacementOperator1383 = metamutator.Selector.of(1383,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1383");

    private static final metamutator.Selector _returnReplacementOperator1384 = metamutator.Selector.of(1384,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1384");

    private static final metamutator.Selector _returnReplacementOperator1385 = metamutator.Selector.of(1385,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1385");

    private static final metamutator.Selector _returnReplacementOperator1386 = metamutator.Selector.of(1386,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1386");

    private static final metamutator.Selector _returnReplacementOperator1387 = metamutator.Selector.of(1387,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1387");

    private static final metamutator.Selector _returnReplacementOperator1388 = metamutator.Selector.of(1388,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1388");

    private static final metamutator.Selector _returnReplacementOperator1389 = metamutator.Selector.of(1389,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1389");

    private static final metamutator.Selector _returnReplacementOperator1390 = metamutator.Selector.of(1390,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1390");

    private static final metamutator.Selector _returnReplacementOperator1391 = metamutator.Selector.of(1391,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1391");

    private static final metamutator.Selector _returnReplacementOperator1392 = metamutator.Selector.of(1392,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1392");

    private static final metamutator.Selector _returnReplacementOperator1393 = metamutator.Selector.of(1393,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1393");

    private static final metamutator.Selector _returnReplacementOperator1394 = metamutator.Selector.of(1394,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1394");

    private static final metamutator.Selector _returnReplacementOperator1395 = metamutator.Selector.of(1395,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1395");

    private static final metamutator.Selector _returnReplacementOperator1396 = metamutator.Selector.of(1396,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1396");

    private static final metamutator.Selector _returnReplacementOperator1397 = metamutator.Selector.of(1397,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1397");

    private static final metamutator.Selector _returnReplacementOperator1398 = metamutator.Selector.of(1398,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1398");

    private static final metamutator.Selector _returnReplacementOperator1399 = metamutator.Selector.of(1399,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1399");

    private static final metamutator.Selector _returnReplacementOperator1400 = metamutator.Selector.of(1400,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1400");

    private static final metamutator.Selector _returnReplacementOperator1401 = metamutator.Selector.of(1401,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperator1401");
}

