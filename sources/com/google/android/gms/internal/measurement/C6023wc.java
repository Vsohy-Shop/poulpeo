package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6023wc implements C6007vc {

    /* renamed from: a */
    public static final C5953s6<Boolean> f7460a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f7461b;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f7460a = p6Var.mo34265e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f7461b = p6Var.mo34265e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    /* renamed from: x */
    public final boolean mo34560x() {
        return f7461b.mo34349b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f7460a.mo34349b().booleanValue();
    }
}
