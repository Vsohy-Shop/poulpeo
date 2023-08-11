package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5960sd implements C5944rd {

    /* renamed from: a */
    public static final C5953s6<Long> f7377a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f7378b;

    /* renamed from: c */
    public static final C5953s6<Boolean> f7379c;

    /* renamed from: d */
    public static final C5953s6<Boolean> f7380d;

    /* renamed from: e */
    public static final C5953s6<Long> f7381e;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f7377a = p6Var.mo34263c("measurement.id.lifecycle.app_in_background_parameter", 0);
        f7378b = p6Var.mo34265e("measurement.lifecycle.app_backgrounded_engagement", false);
        f7379c = p6Var.mo34265e("measurement.lifecycle.app_backgrounded_tracking", true);
        f7380d = p6Var.mo34265e("measurement.lifecycle.app_in_background_parameter", false);
        f7381e = p6Var.mo34263c("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return f7378b.mo34349b().booleanValue();
    }

    public final boolean zzb() {
        return f7380d.mo34349b().booleanValue();
    }
}
