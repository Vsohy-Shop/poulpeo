package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.rb */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5942rb implements C5926qb {

    /* renamed from: a */
    public static final C5953s6<Boolean> f7329a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f7330b;

    /* renamed from: c */
    public static final C5953s6<Boolean> f7331c;

    /* renamed from: d */
    public static final C5953s6<Long> f7332d;

    /* renamed from: e */
    public static final C5953s6<Boolean> f7333e;

    /* renamed from: f */
    public static final C5953s6<Boolean> f7334f;

    static {
        C5905p6 a = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement")).mo34261a();
        f7329a = a.mo34265e("measurement.adid_zero.app_instance_id_fix", true);
        f7330b = a.mo34265e("measurement.adid_zero.service", false);
        f7331c = a.mo34265e("measurement.adid_zero.adid_uid", false);
        f7332d = a.mo34263c("measurement.id.adid_zero.service", 0);
        f7333e = a.mo34265e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f7334f = a.mo34265e("measurement.adid_zero.remove_lair_if_userid_cleared", true);
    }

    /* renamed from: c */
    public final boolean mo34300c() {
        return f7331c.mo34349b().booleanValue();
    }

    /* renamed from: e */
    public final boolean mo34301e() {
        return f7333e.mo34349b().booleanValue();
    }

    /* renamed from: f */
    public final boolean mo34302f() {
        return f7334f.mo34349b().booleanValue();
    }

    /* renamed from: x */
    public final boolean mo34303x() {
        return f7330b.mo34349b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f7329a.mo34349b().booleanValue();
    }
}
