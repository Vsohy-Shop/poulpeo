package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ce */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5696ce implements C5679be {

    /* renamed from: a */
    public static final C5953s6<Boolean> f6836a;

    /* renamed from: b */
    public static final C5953s6<Double> f6837b;

    /* renamed from: c */
    public static final C5953s6<Long> f6838c;

    /* renamed from: d */
    public static final C5953s6<Long> f6839d;

    /* renamed from: e */
    public static final C5953s6<String> f6840e;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f6836a = p6Var.mo34265e("measurement.test.boolean_flag", false);
        f6837b = p6Var.mo34262b("measurement.test.double_flag", -3.0d);
        f6838c = p6Var.mo34263c("measurement.test.int_flag", -2);
        f6839d = p6Var.mo34263c("measurement.test.long_flag", -1);
        f6840e = p6Var.mo34264d("measurement.test.string_flag", "---");
    }

    /* renamed from: c */
    public final String mo33718c() {
        return f6840e.mo34349b();
    }

    /* renamed from: e */
    public final boolean mo33719e() {
        return f6836a.mo34349b().booleanValue();
    }

    /* renamed from: x */
    public final long mo33720x() {
        return f6839d.mo34349b().longValue();
    }

    public final double zza() {
        return f6837b.mo34349b().doubleValue();
    }

    public final long zzb() {
        return f6838c.mo34349b().longValue();
    }
}
