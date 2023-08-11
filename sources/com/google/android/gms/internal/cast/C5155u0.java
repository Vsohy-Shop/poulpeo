package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.u0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C5155u0 {
    C5155u0() {
    }

    /* renamed from: a */
    static int m7520a(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
