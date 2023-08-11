package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5912pd implements C5896od {

    /* renamed from: a */
    public static final C5953s6<Boolean> f7283a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f7284b;

    /* renamed from: c */
    public static final C5953s6<Boolean> f7285c;

    /* renamed from: d */
    public static final C5953s6<Long> f7286d;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f7283a = p6Var.mo34265e("measurement.sdk.collection.enable_extend_user_property_size", true);
        f7284b = p6Var.mo34265e("measurement.sdk.collection.last_deep_link_referrer2", true);
        f7285c = p6Var.mo34265e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f7286d = p6Var.mo34263c("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return f7283a.mo34349b().booleanValue();
    }

    public final boolean zzb() {
        return f7285c.mo34349b().booleanValue();
    }
}
