package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.internal.measurement.C5790i6;
import com.google.android.gms.internal.measurement.C6048y5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p201q5.C9255b;

/* renamed from: com.google.android.gms.measurement.internal.a3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6084a3 {

    /* renamed from: A */
    public static final C6359z2<Long> f7537A = m10454a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C6126e0.f7735a);

    /* renamed from: A0 */
    public static final C6359z2<Boolean> f7538A0;

    /* renamed from: B */
    public static final C6359z2<Long> f7539B = m10454a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C6137f0.f7758a);

    /* renamed from: B0 */
    public static final C6359z2<Boolean> f7540B0;

    /* renamed from: C */
    public static final C6359z2<Long> f7541C = m10454a("measurement.upload.retry_time", 1800000L, 1800000L, C6148g0.f7785a);

    /* renamed from: C0 */
    public static final C6359z2<Boolean> f7542C0;

    /* renamed from: D */
    public static final C6359z2<Integer> f7543D = m10454a("measurement.upload.retry_count", 6, 6, C6170i0.f7854a);

    /* renamed from: D0 */
    public static final C6359z2<Boolean> f7544D0;

    /* renamed from: E */
    public static final C6359z2<Long> f7545E = m10454a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C6181j0.f7884a);

    /* renamed from: E0 */
    public static final C6359z2<Boolean> f7546E0;

    /* renamed from: F */
    public static final C6359z2<Integer> f7547F = m10454a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C6192k0.f7913a);

    /* renamed from: G */
    public static final C6359z2<Integer> f7548G = m10454a("measurement.audience.filter_result_max_count", 200, 200, C6214m0.f7969a);

    /* renamed from: H */
    public static final C6359z2<Integer> f7549H = m10454a("measurement.upload.max_public_user_properties", 25, 25, (C6337x2) null);

    /* renamed from: I */
    public static final C6359z2<Integer> f7550I = m10454a("measurement.upload.max_event_name_cardinality", 500, 500, (C6337x2) null);

    /* renamed from: J */
    public static final C6359z2<Integer> f7551J = m10454a("measurement.upload.max_public_event_params", 25, 25, (C6337x2) null);

    /* renamed from: K */
    public static final C6359z2<Long> f7552K = m10454a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C6225n0.f7995a);

    /* renamed from: L */
    public static final C6359z2<Boolean> f7553L;

    /* renamed from: M */
    public static final C6359z2<String> f7554M = m10454a("measurement.test.string_flag", "---", "---", C6247p0.f8077a);

    /* renamed from: N */
    public static final C6359z2<Long> f7555N = m10454a("measurement.test.long_flag", -1L, -1L, C6258q0.f8132a);

    /* renamed from: O */
    public static final C6359z2<Integer> f7556O = m10454a("measurement.test.int_flag", -2, -2, C6269r0.f8163a);

    /* renamed from: P */
    public static final C6359z2<Double> f7557P;

    /* renamed from: Q */
    public static final C6359z2<Integer> f7558Q = m10454a("measurement.experiment.max_ids", 50, 50, C6302u0.f8253a);

    /* renamed from: R */
    public static final C6359z2<Integer> f7559R = m10454a("measurement.max_bundles_per_iteration", 100, 100, C6313v0.f8302a);

    /* renamed from: S */
    public static final C6359z2<Long> f7560S = m10454a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C6324w0.f8346a);

    /* renamed from: T */
    public static final C6359z2<Boolean> f7561T;

    /* renamed from: U */
    public static final C6359z2<Boolean> f7562U;

    /* renamed from: V */
    public static final C6359z2<Boolean> f7563V;

    /* renamed from: W */
    public static final C6359z2<Boolean> f7564W;

    /* renamed from: X */
    public static final C6359z2<Boolean> f7565X;

    /* renamed from: Y */
    public static final C6359z2<Boolean> f7566Y;

    /* renamed from: Z */
    public static final C6359z2<Boolean> f7567Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List<C6359z2<?>> f7568a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C6359z2<Boolean> f7569a0;

    /* renamed from: b */
    private static final Set<C6359z2<?>> f7570b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final C6359z2<Boolean> f7571b0;

    /* renamed from: c */
    public static final C6359z2<Long> f7572c = m10454a("measurement.ad_id_cache_time", 10000L, 10000L, C6312v.f8301a);

    /* renamed from: c0 */
    public static final C6359z2<Boolean> f7573c0;

    /* renamed from: d */
    public static final C6359z2<Long> f7574d = m10454a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C6159h0.f7836a);

    /* renamed from: d0 */
    public static final C6359z2<Boolean> f7575d0;

    /* renamed from: e */
    public static final C6359z2<Long> f7576e = m10454a("measurement.config.cache_time", 86400000L, 3600000L, C6345y.f8403a);

    /* renamed from: e0 */
    public static final C6359z2<Boolean> f7577e0;

    /* renamed from: f */
    public static final C6359z2<String> f7578f = m10454a("measurement.config.url_scheme", "https", "https", C6203l0.f7932a);

    /* renamed from: f0 */
    public static final C6359z2<Boolean> f7579f0;

    /* renamed from: g */
    public static final C6359z2<String> f7580g = m10454a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C6335x0.f8380a);

    /* renamed from: g0 */
    public static final C6359z2<Boolean> f7581g0;

    /* renamed from: h */
    public static final C6359z2<Integer> f7582h = m10454a("measurement.upload.max_bundles", 100, 100, C6193k1.f7914a);

    /* renamed from: h0 */
    public static final C6359z2<Boolean> f7583h0;

    /* renamed from: i */
    public static final C6359z2<Integer> f7584i = m10454a("measurement.upload.max_batch_size", 65536, 65536, C6325w1.f8347a);

    /* renamed from: i0 */
    public static final C6359z2<Boolean> f7585i0;

    /* renamed from: j */
    public static final C6359z2<Integer> f7586j = m10454a("measurement.upload.max_bundle_size", 65536, 65536, C6183j2.f7886a);

    /* renamed from: j0 */
    public static final C6359z2<Boolean> f7587j0;

    /* renamed from: k */
    public static final C6359z2<Integer> f7588k = m10454a("measurement.upload.max_events_per_bundle", 1000, 1000, C6282s2.f8186a);

    /* renamed from: k0 */
    public static final C6359z2<Boolean> f7589k0;

    /* renamed from: l */
    public static final C6359z2<Integer> f7590l;

    /* renamed from: l0 */
    public static final C6359z2<Boolean> f7591l0;

    /* renamed from: m */
    public static final C6359z2<Integer> f7592m = m10454a("measurement.upload.max_error_events_per_day", 1000, 1000, C6280s0.f8184a);

    /* renamed from: m0 */
    public static final C6359z2<Boolean> f7593m0;

    /* renamed from: n */
    public static final C6359z2<Integer> f7594n = m10454a("measurement.upload.max_public_events_per_day", 50000, 50000, C6127e1.f7736a);

    /* renamed from: n0 */
    public static final C6359z2<Boolean> f7595n0;

    /* renamed from: o */
    public static final C6359z2<Integer> f7596o = m10454a("measurement.upload.max_conversions_per_day", 10000, 10000, C6248p1.f8078a);

    /* renamed from: o0 */
    public static final C6359z2<Boolean> f7597o0;

    /* renamed from: p */
    public static final C6359z2<Integer> f7598p = m10454a("measurement.upload.max_realtime_events_per_day", 10, 10, C6083a2.f7536a);

    /* renamed from: p0 */
    public static final C6359z2<Integer> f7599p0 = m10454a("measurement.service.storage_consent_support_version", 203600, 203600, C6347y1.f8405a);

    /* renamed from: q */
    public static final C6359z2<Integer> f7600q;

    /* renamed from: q0 */
    public static final C6359z2<Boolean> f7601q0;

    /* renamed from: r */
    public static final C6359z2<String> f7602r = m10454a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C6304u2.f8255a);

    /* renamed from: r0 */
    public static final C6359z2<Boolean> f7603r0;

    /* renamed from: s */
    public static final C6359z2<Long> f7604s = m10454a("measurement.upload.backoff_period", 43200000L, 43200000L, C6315v2.f8304a);

    /* renamed from: s0 */
    public static final C6359z2<Boolean> f7605s0;

    /* renamed from: t */
    public static final C6359z2<Long> f7606t = m10454a("measurement.upload.window_interval", 3600000L, 3600000L, C6326w2.f8348a);

    /* renamed from: t0 */
    public static final C6359z2<Boolean> f7607t0;

    /* renamed from: u */
    public static final C6359z2<Long> f7608u = m10454a("measurement.upload.interval", 3600000L, 3600000L, C6323w.f8345a);

    /* renamed from: u0 */
    public static final C6359z2<Boolean> f7609u0;

    /* renamed from: v */
    public static final C6359z2<Long> f7610v = m10454a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C6334x.f8379a);

    /* renamed from: v0 */
    public static final C6359z2<Boolean> f7611v0;

    /* renamed from: w */
    public static final C6359z2<Long> f7612w = m10454a("measurement.upload.debug_upload_interval", 1000L, 1000L, C6356z.f8421a);

    /* renamed from: w0 */
    public static final C6359z2<Boolean> f7613w0;

    /* renamed from: x */
    public static final C6359z2<Long> f7614x = m10454a("measurement.upload.minimum_delay", 500L, 500L, C6093b0.f7638a);

    /* renamed from: x0 */
    public static final C6359z2<Boolean> f7615x0;

    /* renamed from: y */
    public static final C6359z2<Long> f7616y = m10454a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C6104c0.f7663a);

    /* renamed from: y0 */
    public static final C6359z2<Boolean> f7617y0;

    /* renamed from: z */
    public static final C6359z2<Long> f7618z = m10454a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C6115d0.f7693a);

    /* renamed from: z0 */
    public static final C6359z2<Boolean> f7619z0;

    static {
        Integer valueOf = Integer.valueOf(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        f7590l = m10454a("measurement.upload.max_events_per_day", valueOf, valueOf, C6293t2.f8235a);
        f7600q = m10454a("measurement.store.max_stored_events_per_app", valueOf, valueOf, C6216m2.f7971a);
        Boolean bool = Boolean.FALSE;
        f7553L = m10454a("measurement.test.boolean_flag", bool, bool, C6236o0.f8042a);
        Double valueOf2 = Double.valueOf(-3.0d);
        f7557P = m10454a("measurement.test.double_flag", valueOf2, valueOf2, C6291t0.f8233a);
        f7561T = m10454a("measurement.validation.internal_limits_internal_event_params", bool, bool, C6346y0.f8404a);
        Boolean bool2 = Boolean.TRUE;
        f7562U = m10454a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, C6357z0.f8422a);
        f7563V = m10454a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, C6082a1.f7535a);
        f7564W = m10454a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C6105c1.f7664a);
        f7565X = m10454a("measurement.quality.checksum", bool, bool, (C6337x2) null);
        f7566Y = m10454a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C6116d1.f7694a);
        f7567Z = m10454a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C6138f1.f7759a);
        f7569a0 = m10454a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C6149g1.f7786a);
        f7571b0 = m10454a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C6160h1.f7837a);
        f7573c0 = m10454a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C6171i1.f7855a);
        f7575d0 = m10454a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, C6182j1.f7885a);
        f7577e0 = m10454a("measurement.ga.ga_app_id", bool, bool, C6204l1.f7933a);
        f7579f0 = m10454a("measurement.lifecycle.app_in_background_parameter", bool, bool, C6215m1.f7970a);
        f7581g0 = m10454a("measurement.integration.disable_firebase_instance_id", bool, bool, C6226n1.f7996a);
        f7583h0 = m10454a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, C6237o1.f8043a);
        f7585i0 = m10454a("measurement.collection.service.update_with_analytics_fix", bool, bool, C6259q1.f8133a);
        f7587j0 = m10454a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C6270r1.f8164a);
        f7589k0 = m10454a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C6281s1.f8185a);
        f7591l0 = m10454a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C6292t1.f8234a);
        f7593m0 = m10454a("measurement.upload.file_truncate_fix", bool, bool, C6303u1.f8254a);
        f7595n0 = m10454a("measurement.collection.synthetic_data_mitigation", bool, bool, C6314v1.f8303a);
        f7597o0 = m10454a("measurement.androidId.delete_feature", bool2, bool2, C6336x1.f8381a);
        f7601q0 = m10454a("measurement.client.click_identifier_control.dev", bool, bool, C6358z1.f8423a);
        f7603r0 = m10454a("measurement.service.click_identifier_control", bool, bool, C6095b2.f7641a);
        f7605s0 = m10454a("measurement.config.persist_last_modified", bool2, bool2, C6117d2.f7695a);
        f7607t0 = m10454a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, C6128e2.f7737a);
        f7609u0 = m10454a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, C6139f2.f7760a);
        f7611v0 = m10454a("measurement.module.pixie.ees", bool2, bool2, C6150g2.f7787a);
        f7613w0 = m10454a("measurement.module.pixie.fix_array", bool2, bool2, C6161h2.f7838a);
        f7615x0 = m10454a("measurement.adid_zero.service", bool, bool, C6172i2.f7856a);
        f7617y0 = m10454a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, C6194k2.f7915a);
        f7619z0 = m10454a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, C6205l2.f7934a);
        f7538A0 = m10454a("measurement.adid_zero.adid_uid", bool, bool, C6227n2.f7997a);
        f7540B0 = m10454a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, C6238o2.f8044a);
        f7542C0 = m10454a("measurement.service.refactor.package_side_screen", bool2, bool2, C6249p2.f8079a);
        f7544D0 = m10454a("measurement.config.fix_feature_flags_from_config", bool2, bool2, C6260q2.f8134a);
        f7546E0 = m10454a("measurement.service.event_config_fix", bool2, bool2, C6271r2.f8165a);
    }

    /* renamed from: a */
    static <V> C6359z2<V> m10454a(String str, V v, V v2, C6337x2<V> x2Var) {
        C6359z2 z2Var = new C6359z2(str, v, v2, x2Var, (C9255b) null);
        f7568a.add(z2Var);
        return z2Var;
    }

    /* renamed from: c */
    public static Map<String, String> m10456c(Context context) {
        C6048y5 a = C6048y5.m10297a(context.getContentResolver(), C5790i6.m9398a("com.google.android.gms.measurement"));
        if (a == null) {
            return Collections.emptyMap();
        }
        return a.mo34636b();
    }
}
