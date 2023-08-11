package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ub */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5990ub implements C5974tb {

    /* renamed from: a */
    public static final C5953s6<Boolean> f7414a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f7415b;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f7414a = p6Var.mo34265e("measurement.androidId.delete_feature", true);
        f7415b = p6Var.mo34265e("measurement.log_androidId_enabled", false);
    }

    public final boolean zza() {
        return f7414a.mo34349b().booleanValue();
    }
}
