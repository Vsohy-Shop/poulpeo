package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.sf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5136sf extends C5170uf {
    C5136sf(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo33000a(Object obj, long j) {
        return Double.longBitsToDouble(mo33025k(obj, j));
    }

    /* renamed from: b */
    public final float mo33001b(Object obj, long j) {
        return Float.intBitsToFloat(mo33024j(obj, j));
    }

    /* renamed from: c */
    public final void mo33002c(Object obj, long j, boolean z) {
        if (C5187vf.f5571h) {
            C5187vf.m7578d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C5187vf.m7579e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo33003d(Object obj, long j, byte b) {
        if (C5187vf.f5571h) {
            C5187vf.m7578d(obj, j, b);
        } else {
            C5187vf.m7579e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo33004e(Object obj, long j, double d) {
        mo33029o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo33005f(Object obj, long j, float f) {
        mo33028n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo33006g(Object obj, long j) {
        if (C5187vf.f5571h) {
            return C5187vf.m7599y(obj, j);
        }
        return C5187vf.m7600z(obj, j);
    }
}
