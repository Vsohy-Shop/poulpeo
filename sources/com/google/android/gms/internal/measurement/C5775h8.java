package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5775h8 {

    /* renamed from: a */
    private final Object f6977a;

    /* renamed from: b */
    private final int f6978b;

    C5775h8(Object obj, int i) {
        this.f6977a = obj;
        this.f6978b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5775h8)) {
            return false;
        }
        C5775h8 h8Var = (C5775h8) obj;
        if (this.f6977a == h8Var.f6977a && this.f6978b == h8Var.f6978b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6977a) * 65535) + this.f6978b;
    }
}
