package okio;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import okio.C13133f;

/* renamed from: okio.c1 */
/* compiled from: -Base64.kt */
public final class C13126c1 {

    /* renamed from: a */
    private static final byte[] f20899a;

    /* renamed from: b */
    private static final byte[] f20900b;

    static {
        C13133f.C13134a aVar = C13133f.f20903e;
        f20899a = aVar.mo52622d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").mo52604h();
        f20900b = aVar.mo52622d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").mo52604h();
    }

    /* renamed from: a */
    public static final byte[] m29598a(String str) {
        boolean z;
        int i;
        boolean z2;
        String str2 = str;
        C12775o.m28639i(str2, "<this>");
        int length = str.length();
        while (length > 0 && ((r6 = str2.charAt(length - 1)) == '=' || r6 == 10 || r6 == 13 || r6 == ' ' || r6 == 9)) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < length) {
                char charAt = str2.charAt(i3);
                if ('A' > charAt || charAt >= '[') {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i = charAt - 'A';
                } else {
                    if ('a' > charAt || charAt >= '{') {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        i = charAt - 'G';
                    } else {
                        if ('0' > charAt || charAt >= ':') {
                            z3 = false;
                        }
                        if (z3) {
                            i = charAt + 4;
                        } else if (charAt == '+' || charAt == '-') {
                            i = 62;
                        } else if (charAt == '/' || charAt == '_') {
                            i = 63;
                        } else {
                            if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                                return null;
                            }
                            i3++;
                        }
                    }
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    int i7 = i6 + 1;
                    bArr[i6] = (byte) (i5 >> 16);
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) (i5 >> 8);
                    bArr[i8] = (byte) i5;
                    i6 = i8 + 1;
                }
                i3++;
            } else {
                int i9 = i4 % 4;
                if (i9 == 1) {
                    return null;
                }
                if (i9 == 2) {
                    bArr[i6] = (byte) ((i5 << 12) >> 16);
                    i6++;
                } else if (i9 == 3) {
                    int i10 = i5 << 6;
                    int i11 = i6 + 1;
                    bArr[i6] = (byte) (i10 >> 16);
                    i6 = i11 + 1;
                    bArr[i11] = (byte) (i10 >> 8);
                }
                if (i6 == i2) {
                    return bArr;
                }
                byte[] copyOf = Arrays.copyOf(bArr, i6);
                C12775o.m28638h(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
        }
    }

    /* renamed from: b */
    public static final String m29599b(byte[] bArr, byte[] bArr2) {
        C12775o.m28639i(bArr, "<this>");
        C12775o.m28639i(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i13] = bArr2[(b6 & 15) << 2];
            bArr3[i13 + 1] = 61;
        }
        return C13129d1.m29613c(bArr3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m29600c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f20899a;
        }
        return m29599b(bArr, bArr2);
    }
}
