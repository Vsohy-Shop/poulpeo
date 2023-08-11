package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.fb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5744fb extends C5761gb {
    C5744fb(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo33938a(Object obj, long j) {
        return Double.longBitsToDouble(mo34056k(obj, j));
    }

    /* renamed from: b */
    public final float mo33939b(Object obj, long j) {
        return Float.intBitsToFloat(mo34055j(obj, j));
    }

    /* renamed from: c */
    public final void mo33940c(Object obj, long j, boolean z) {
        if (C5778hb.f6990i) {
            C5778hb.m9354d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C5778hb.m9355e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo33941d(Object obj, long j, byte b) {
        if (C5778hb.f6990i) {
            C5778hb.m9354d(obj, j, b);
        } else {
            C5778hb.m9355e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo33942e(Object obj, long j, double d) {
        mo34060o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo33943f(Object obj, long j, float f) {
        mo34059n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo33944g(Object obj, long j) {
        if (C5778hb.f6990i) {
            return C5778hb.m9375y(obj, j);
        }
        return C5778hb.m9376z(obj, j);
    }
}
