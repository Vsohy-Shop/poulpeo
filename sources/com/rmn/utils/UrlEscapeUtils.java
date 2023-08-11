package com.rmn.utils;

public final class UrlEscapeUtils {
    private static final int DEST_PAD = 32;
    private static final String SAFE_CHARS = "-_.~";
    private static final boolean[] SAFE_OCTETS = createSafeOctets("-_.~abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    private static final char[] SPACE_PLACEHOLDER = {'%', '2', '0'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();

    private UrlEscapeUtils() {
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static int codePointAt(CharSequence charSequence, int i, int i2) {
        checkNotNull(charSequence, "seq == null");
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append(charAt);
                sb.append(" at index ");
                sb.append(i3 - 1);
                sb.append(" in '");
                sb.append(charSequence);
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + charAt2 + " at index " + i3 + " in '" + charSequence + "'");
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char max : charArray) {
            i = Math.max(max, i);
        }
        boolean[] zArr = new boolean[(i + 1)];
        for (char c : charArray) {
            zArr[c] = true;
        }
        return zArr;
    }

    public static String escape(String str) {
        checkNotNull(str, "string == null");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = SAFE_OCTETS;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    private static String escapeSlow(String str, int i) {
        int i2;
        int length = str.length();
        char[] cArr = new char[1024];
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int codePointAt = codePointAt(str, i, length);
            if (codePointAt >= 0) {
                char[] escape = escape(codePointAt);
                if (Character.isSupplementaryCodePoint(codePointAt)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int i5 = i2 + i;
                if (escape != null) {
                    int i6 = i - i3;
                    int i7 = i4 + i6;
                    int length2 = escape.length + i7;
                    if (cArr.length < length2) {
                        cArr = growBuffer(cArr, i4, length2 + (length - i) + 32);
                    }
                    if (i6 > 0) {
                        str.getChars(i3, i, cArr, i4);
                        i4 = i7;
                    }
                    if (escape.length > 0) {
                        System.arraycopy(escape, 0, cArr, i4, escape.length);
                        i4 += escape.length;
                    }
                    i3 = i5;
                }
                i = nextEscapeIndex(str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i8 + i4;
            if (cArr.length < i9) {
                cArr = growBuffer(cArr, i4, i9);
            }
            str.getChars(i3, length, cArr, i4);
            i4 = i9;
        }
        return new String(cArr, 0, i4);
    }

    private static char[] growBuffer(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    private static int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
        checkNotNull(charSequence, "csq == null");
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = SAFE_OCTETS;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    static char[] escape(int i) {
        boolean[] zArr = SAFE_OCTETS;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32) {
            return SPACE_PLACEHOLDER;
        }
        if (i <= 127) {
            char[] cArr = new char[3];
            cArr[0] = '%';
            char[] cArr2 = UPPER_HEX_DIGITS;
            cArr[2] = cArr2[i & 15];
            cArr[1] = cArr2[i >>> 4];
            return cArr;
        } else if (i <= 2047) {
            char[] cArr3 = new char[6];
            cArr3[0] = '%';
            cArr3[3] = '%';
            char[] cArr4 = UPPER_HEX_DIGITS;
            cArr3[5] = cArr4[i & 15];
            int i2 = i >>> 4;
            cArr3[4] = cArr4[(i2 & 3) | 8];
            int i3 = i2 >>> 2;
            cArr3[2] = cArr4[i3 & 15];
            cArr3[1] = cArr4[(i3 >>> 4) | 12];
            return cArr3;
        } else if (i <= 65535) {
            char[] cArr5 = new char[9];
            cArr5[0] = '%';
            cArr5[1] = 'E';
            cArr5[3] = '%';
            cArr5[6] = '%';
            char[] cArr6 = UPPER_HEX_DIGITS;
            cArr5[8] = cArr6[i & 15];
            int i4 = i >>> 4;
            cArr5[7] = cArr6[(i4 & 3) | 8];
            int i5 = i4 >>> 2;
            cArr5[5] = cArr6[i5 & 15];
            int i6 = i5 >>> 4;
            cArr5[4] = cArr6[(i6 & 3) | 8];
            cArr5[2] = cArr6[i6 >>> 2];
            return cArr5;
        } else if (i <= 1114111) {
            char[] cArr7 = new char[12];
            cArr7[0] = '%';
            cArr7[1] = 'F';
            cArr7[3] = '%';
            cArr7[6] = '%';
            cArr7[9] = '%';
            char[] cArr8 = UPPER_HEX_DIGITS;
            cArr7[11] = cArr8[i & 15];
            int i7 = i >>> 4;
            cArr7[10] = cArr8[(i7 & 3) | 8];
            int i8 = i7 >>> 2;
            cArr7[8] = cArr8[i8 & 15];
            int i9 = i8 >>> 4;
            cArr7[7] = cArr8[(i9 & 3) | 8];
            int i10 = i9 >>> 2;
            cArr7[5] = cArr8[i10 & 15];
            int i11 = i10 >>> 4;
            cArr7[4] = cArr8[(i11 & 3) | 8];
            cArr7[2] = cArr8[(i11 >>> 2) & 7];
            return cArr7;
        } else {
            throw new IllegalArgumentException("Invalid unicode character value " + i);
        }
    }
}
