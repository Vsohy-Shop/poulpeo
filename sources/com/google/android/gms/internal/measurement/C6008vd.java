package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.vd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6008vd implements C5992ud {

    /* renamed from: a */
    public static final C5953s6<Boolean> f7434a;

    /* renamed from: b */
    public static final C5953s6<Long> f7435b;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f7434a = p6Var.mo34265e("measurement.validation.internal_limits_internal_event_params", false);
        f7435b = p6Var.mo34263c("measurement.id.validation.internal_limits_internal_event_params", 0);
    }

    public final boolean zza() {
        return f7434a.mo34349b().booleanValue();
    }
}
