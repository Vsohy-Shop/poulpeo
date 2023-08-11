package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ec */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5728ec implements C5711dc {

    /* renamed from: A */
    public static final C5953s6<Long> f6889A;

    /* renamed from: B */
    public static final C5953s6<Long> f6890B;

    /* renamed from: C */
    public static final C5953s6<Long> f6891C;

    /* renamed from: D */
    public static final C5953s6<Long> f6892D;

    /* renamed from: E */
    public static final C5953s6<Long> f6893E;

    /* renamed from: F */
    public static final C5953s6<Long> f6894F;

    /* renamed from: G */
    public static final C5953s6<Long> f6895G;

    /* renamed from: H */
    public static final C5953s6<Long> f6896H;

    /* renamed from: I */
    public static final C5953s6<Long> f6897I;

    /* renamed from: J */
    public static final C5953s6<Long> f6898J;

    /* renamed from: K */
    public static final C5953s6<String> f6899K;

    /* renamed from: L */
    public static final C5953s6<Long> f6900L;

    /* renamed from: a */
    public static final C5953s6<Long> f6901a;

    /* renamed from: b */
    public static final C5953s6<Long> f6902b;

    /* renamed from: c */
    public static final C5953s6<Long> f6903c;

    /* renamed from: d */
    public static final C5953s6<String> f6904d;

    /* renamed from: e */
    public static final C5953s6<String> f6905e;

    /* renamed from: f */
    public static final C5953s6<String> f6906f;

    /* renamed from: g */
    public static final C5953s6<Long> f6907g;

    /* renamed from: h */
    public static final C5953s6<Long> f6908h;

    /* renamed from: i */
    public static final C5953s6<Long> f6909i;

    /* renamed from: j */
    public static final C5953s6<Long> f6910j;

    /* renamed from: k */
    public static final C5953s6<Long> f6911k;

    /* renamed from: l */
    public static final C5953s6<Long> f6912l;

    /* renamed from: m */
    public static final C5953s6<Long> f6913m;

    /* renamed from: n */
    public static final C5953s6<Long> f6914n;

    /* renamed from: o */
    public static final C5953s6<Long> f6915o;

    /* renamed from: p */
    public static final C5953s6<Long> f6916p;

    /* renamed from: q */
    public static final C5953s6<Long> f6917q;

    /* renamed from: r */
    public static final C5953s6<Long> f6918r;

    /* renamed from: s */
    public static final C5953s6<String> f6919s;

    /* renamed from: t */
    public static final C5953s6<Long> f6920t;

    /* renamed from: u */
    public static final C5953s6<Long> f6921u;

    /* renamed from: v */
    public static final C5953s6<Long> f6922v;

    /* renamed from: w */
    public static final C5953s6<Long> f6923w;

    /* renamed from: x */
    public static final C5953s6<Long> f6924x;

    /* renamed from: y */
    public static final C5953s6<Long> f6925y;

    /* renamed from: z */
    public static final C5953s6<Long> f6926z;

    static {
        C5905p6 p6Var = new C5905p6(C5790i6.m9398a("com.google.android.gms.measurement"));
        f6901a = p6Var.mo34263c("measurement.ad_id_cache_time", 10000);
        f6902b = p6Var.mo34263c("measurement.max_bundles_per_iteration", 100);
        f6903c = p6Var.mo34263c("measurement.config.cache_time", 86400000);
        f6904d = p6Var.mo34264d("measurement.log_tag", "FA");
        f6905e = p6Var.mo34264d("measurement.config.url_authority", "app-measurement.com");
        f6906f = p6Var.mo34264d("measurement.config.url_scheme", "https");
        f6907g = p6Var.mo34263c("measurement.upload.debug_upload_interval", 1000);
        f6908h = p6Var.mo34263c("measurement.lifetimevalue.max_currency_tracked", 4);
        f6909i = p6Var.mo34263c("measurement.store.max_stored_events_per_app", 100000);
        f6910j = p6Var.mo34263c("measurement.experiment.max_ids", 50);
        f6911k = p6Var.mo34263c("measurement.audience.filter_result_max_count", 200);
        f6912l = p6Var.mo34263c("measurement.alarm_manager.minimum_interval", 60000);
        f6913m = p6Var.mo34263c("measurement.upload.minimum_delay", 500);
        f6914n = p6Var.mo34263c("measurement.monitoring.sample_period_millis", 86400000);
        f6915o = p6Var.mo34263c("measurement.upload.realtime_upload_interval", 10000);
        f6916p = p6Var.mo34263c("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f6917q = p6Var.mo34263c("measurement.config.cache_time.service", 3600000);
        f6918r = p6Var.mo34263c("measurement.service_client.idle_disconnect_millis", 5000);
        f6919s = p6Var.mo34264d("measurement.log_tag.service", "FA-SVC");
        f6920t = p6Var.mo34263c("measurement.upload.stale_data_deletion_interval", 86400000);
        f6921u = p6Var.mo34263c("measurement.sdk.attribution.cache.ttl", 604800000);
        f6922v = p6Var.mo34263c("measurement.upload.backoff_period", 43200000);
        f6923w = p6Var.mo34263c("measurement.upload.initial_upload_delay_time", 15000);
        f6924x = p6Var.mo34263c("measurement.upload.interval", 3600000);
        f6925y = p6Var.mo34263c("measurement.upload.max_bundle_size", 65536);
        f6926z = p6Var.mo34263c("measurement.upload.max_bundles", 100);
        f6889A = p6Var.mo34263c("measurement.upload.max_conversions_per_day", 500);
        f6890B = p6Var.mo34263c("measurement.upload.max_error_events_per_day", 1000);
        f6891C = p6Var.mo34263c("measurement.upload.max_events_per_bundle", 1000);
        f6892D = p6Var.mo34263c("measurement.upload.max_events_per_day", 100000);
        f6893E = p6Var.mo34263c("measurement.upload.max_public_events_per_day", 50000);
        f6894F = p6Var.mo34263c("measurement.upload.max_queue_time", 2419200000L);
        f6895G = p6Var.mo34263c("measurement.upload.max_realtime_events_per_day", 10);
        f6896H = p6Var.mo34263c("measurement.upload.max_batch_size", 65536);
        f6897I = p6Var.mo34263c("measurement.upload.retry_count", 6);
        f6898J = p6Var.mo34263c("measurement.upload.retry_time", 1800000);
        f6899K = p6Var.mo34264d("measurement.upload.url", "https://app-measurement.com/a");
        f6900L = p6Var.mo34263c("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: A */
    public final long mo33839A() {
        return f6914n.mo34349b().longValue();
    }

    /* renamed from: K */
    public final long mo33840K() {
        return f6925y.mo34349b().longValue();
    }

    /* renamed from: L */
    public final long mo33841L() {
        return f6900L.mo34349b().longValue();
    }

    /* renamed from: M */
    public final long mo33842M() {
        return f6892D.mo34349b().longValue();
    }

    /* renamed from: N */
    public final long mo33843N() {
        return f6893E.mo34349b().longValue();
    }

    /* renamed from: O */
    public final String mo33844O() {
        return f6905e.mo34349b();
    }

    /* renamed from: P */
    public final long mo33845P() {
        return f6918r.mo34349b().longValue();
    }

    /* renamed from: Q */
    public final long mo33846Q() {
        return f6890B.mo34349b().longValue();
    }

    /* renamed from: R */
    public final long mo33847R() {
        return f6897I.mo34349b().longValue();
    }

    /* renamed from: S */
    public final long mo33848S() {
        return f6920t.mo34349b().longValue();
    }

    /* renamed from: T */
    public final long mo33849T() {
        return f6898J.mo34349b().longValue();
    }

    /* renamed from: U */
    public final long mo33850U() {
        return f6891C.mo34349b().longValue();
    }

    /* renamed from: V */
    public final long mo33851V() {
        return f6895G.mo34349b().longValue();
    }

    /* renamed from: W */
    public final long mo33852W() {
        return f6889A.mo34349b().longValue();
    }

    /* renamed from: X */
    public final String mo33853X() {
        return f6906f.mo34349b();
    }

    /* renamed from: Y */
    public final String mo33854Y() {
        return f6899K.mo34349b();
    }

    /* renamed from: Z */
    public final long mo33855Z() {
        return f6894F.mo34349b().longValue();
    }

    /* renamed from: a */
    public final long mo33856a() {
        return f6924x.mo34349b().longValue();
    }

    /* renamed from: b */
    public final long mo33857b() {
        return f6912l.mo34349b().longValue();
    }

    /* renamed from: c */
    public final long mo33858c() {
        return f6907g.mo34349b().longValue();
    }

    /* renamed from: d */
    public final long mo33859d() {
        return f6910j.mo34349b().longValue();
    }

    /* renamed from: e */
    public final long mo33860e() {
        return f6908h.mo34349b().longValue();
    }

    /* renamed from: f */
    public final long mo33861f() {
        return f6909i.mo34349b().longValue();
    }

    /* renamed from: h */
    public final long mo33862h() {
        return f6921u.mo34349b().longValue();
    }

    /* renamed from: i */
    public final long mo33863i() {
        return f6916p.mo34349b().longValue();
    }

    /* renamed from: j */
    public final long mo33864j() {
        return f6922v.mo34349b().longValue();
    }

    /* renamed from: k */
    public final long mo33865k() {
        return f6923w.mo34349b().longValue();
    }

    /* renamed from: l */
    public final long mo33866l() {
        return f6926z.mo34349b().longValue();
    }

    /* renamed from: m */
    public final long mo33867m() {
        return f6896H.mo34349b().longValue();
    }

    /* renamed from: n */
    public final long mo33868n() {
        return f6913m.mo34349b().longValue();
    }

    /* renamed from: x */
    public final long mo33869x() {
        return f6903c.mo34349b().longValue();
    }

    /* renamed from: y */
    public final long mo33870y() {
        return f6911k.mo34349b().longValue();
    }

    /* renamed from: z */
    public final long mo33871z() {
        return f6915o.mo34349b().longValue();
    }

    public final long zza() {
        return f6901a.mo34349b().longValue();
    }

    public final long zzb() {
        return f6902b.mo34349b().longValue();
    }
}
