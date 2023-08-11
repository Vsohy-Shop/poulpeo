package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5712dd implements C5695cd {

    /* renamed from: a */
    public static final C5953s6<Boolean> f6857a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f6858b;

    /* renamed from: c */
    public static final C5953s6<Boolean> f6859c;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f6857a = p6Var.mo34265e("measurement.client.sessions.check_on_reset_and_enable2", true);
        f6858b = p6Var.mo34265e("measurement.client.sessions.check_on_startup", true);
        f6859c = p6Var.mo34265e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f6857a.mo34349b().booleanValue();
    }
}
