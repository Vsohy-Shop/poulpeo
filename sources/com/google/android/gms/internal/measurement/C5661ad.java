package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ad */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5661ad implements C6071zc {

    /* renamed from: a */
    public static final C5953s6<Boolean> f6771a;

    /* renamed from: b */
    public static final C5953s6<Boolean> f6772b;

    /* renamed from: c */
    public static final C5953s6<Boolean> f6773c;

    /* renamed from: d */
    public static final C5953s6<Boolean> f6774d;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f6771a = p6Var.mo34265e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f6772b = p6Var.mo34265e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f6773c = p6Var.mo34265e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f6774d = p6Var.mo34265e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: c */
    public final boolean mo33671c() {
        return f6774d.mo34349b().booleanValue();
    }

    /* renamed from: x */
    public final boolean mo33672x() {
        return f6773c.mo34349b().booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f6772b.mo34349b().booleanValue();
    }
}
