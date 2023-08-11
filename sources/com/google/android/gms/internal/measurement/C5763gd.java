package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5763gd implements C5746fd {

    /* renamed from: a */
    public static final C5953s6<Boolean> f6963a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f6964b;

    /* renamed from: c */
    public static final C5953s6<Long> f6965c;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f6963a = p6Var.mo34265e("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f6964b = p6Var.mo34265e("measurement.collection.redundant_engagement_removal_enabled", false);
        f6965c = p6Var.mo34263c("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean zza() {
        return f6964b.mo34349b().booleanValue();
    }
}
