package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.xf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5221xf extends C5204wf {
    C5221xf() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo33043a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i4 < i3 && bArr[i4] >= 0) {
            i5 = i4 + 1;
        }
        if (i4 >= i3) {
            return 0;
        }
        while (i4 < i3) {
            int i6 = i4 + 1;
            byte b = bArr[i4];
            if (b < 0) {
                if (b < -32) {
                    if (i6 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i4 = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                } else if (b < -16) {
                    if (i6 >= i3 - 1) {
                        return C5255zf.m7728a(bArr, i6, i3);
                    }
                    int i7 = i6 + 1;
                    byte b2 = bArr[i6];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i4 = i7 + 1;
                        if (bArr[i7] > -65) {
                        }
                    }
                } else if (i6 >= i3 - 2) {
                    return C5255zf.m7728a(bArr, i6, i3);
                } else {
                    int i8 = i6 + 1;
                    byte b3 = bArr[i6];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i9 = i8 + 1;
                        if (bArr[i8] <= -65) {
                            i6 = i9 + 1;
                            if (bArr[i9] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i4 = i6;
        }
        return 0;
    }
}
