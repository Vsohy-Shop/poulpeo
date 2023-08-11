package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5779hc implements C5762gc {

    /* renamed from: a */
    public static final C5953s6<Boolean> f6991a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f6992b;

    /* renamed from: c */
    public static final C5953s6<Boolean> f6993c;

    /* renamed from: d */
    public static final C5953s6<Long> f6994d;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f6991a = p6Var.mo34265e("measurement.client.consent_state_v1", true);
        f6992b = p6Var.mo34265e("measurement.client.3p_consent_state_v1", true);
        f6993c = p6Var.mo34265e("measurement.service.consent_state_v1_W36", true);
        f6994d = p6Var.mo34263c("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return f6994d.mo34349b().longValue();
    }
}
