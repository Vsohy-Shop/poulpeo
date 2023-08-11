package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ib */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5795ib {
    /* renamed from: a */
    static /* synthetic */ void m9406a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m9410e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m9410e(b3) || m9410e(b4)) {
            throw zzkh.m10402c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* synthetic */ void m9407b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m9410e(b2)) {
            throw zzkh.m10402c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: c */
    static /* synthetic */ void m9408c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m9410e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m9410e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkh.m10402c();
    }

    /* renamed from: d */
    static /* synthetic */ boolean m9409d(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m9410e(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
