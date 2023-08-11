package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fe */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5747fe implements C5730ee {

    /* renamed from: a */
    public static final C5953s6<Boolean> f6948a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f6949b;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f6948a = p6Var.mo34265e("measurement.module.pixie.ees", true);
        f6949b = p6Var.mo34265e("measurement.module.pixie.fix_array", true);
    }

    /* renamed from: x */
    public final boolean mo33946x() {
        return f6949b.mo34349b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f6948a.mo34349b().booleanValue();
    }
}
