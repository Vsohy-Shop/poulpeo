package com.google.android.gms.internal.gtm;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: com.google.android.gms.internal.gtm.w0 */
public final class C5592w0 {

    /* renamed from: A */
    public static C5606x0<Integer> f6400A = C5606x0.m8639c("analytics.max_batch_post_length", 8192, 8192);

    /* renamed from: B */
    public static C5606x0<String> f6401B = C5606x0.m8641e("analytics.fallback_responses.k", "404,502", "404,502");

    /* renamed from: C */
    public static C5606x0<Integer> f6402C = C5606x0.m8639c("analytics.batch_retry_interval.seconds.k", 3600, 3600);

    /* renamed from: D */
    private static C5606x0<Long> f6403D = C5606x0.m8640d("analytics.service_monitor_interval", 86400000, 86400000);

    /* renamed from: E */
    public static C5606x0<Integer> f6404E = C5606x0.m8639c("analytics.http_connection.connect_timeout_millis", 60000, 60000);

    /* renamed from: F */
    public static C5606x0<Integer> f6405F = C5606x0.m8639c("analytics.http_connection.read_timeout_millis", 61000, 61000);

    /* renamed from: G */
    public static C5606x0<Long> f6406G = C5606x0.m8640d("analytics.campaigns.time_limit", 86400000, 86400000);

    /* renamed from: H */
    private static C5606x0<String> f6407H = C5606x0.m8641e("analytics.first_party_experiment_id", "", "");

    /* renamed from: I */
    private static C5606x0<Integer> f6408I = C5606x0.m8639c("analytics.first_party_experiment_variant", 0, 0);

    /* renamed from: J */
    public static C5606x0<Boolean> f6409J = C5606x0.m8642f("analytics.test.disable_receiver", false, false);

    /* renamed from: K */
    public static C5606x0<Long> f6410K = C5606x0.m8640d("analytics.service_client.idle_disconnect_millis", 10000, 10000);

    /* renamed from: L */
    public static C5606x0<Long> f6411L = C5606x0.m8640d("analytics.service_client.connect_timeout_millis", 5000, 5000);

    /* renamed from: M */
    private static C5606x0<Long> f6412M = C5606x0.m8640d("analytics.service_client.second_connect_delay_millis", 5000, 5000);

    /* renamed from: N */
    private static C5606x0<Long> f6413N = C5606x0.m8640d("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);

    /* renamed from: O */
    public static C5606x0<Long> f6414O = C5606x0.m8640d("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);

    /* renamed from: P */
    public static C5606x0<Long> f6415P = C5606x0.m8640d("analytics.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: Q */
    public static C5606x0<Long> f6416Q = C5606x0.m8640d("analytics.initialization_warning_threshold", 5000, 5000);

    /* renamed from: R */
    public static C5606x0<Boolean> f6417R = C5606x0.m8642f("analytics.gcm_task_service", false, false);

    /* renamed from: a */
    private static C5606x0<Boolean> f6418a = C5606x0.m8642f("analytics.service_enabled", false, false);

    /* renamed from: b */
    public static C5606x0<Boolean> f6419b = C5606x0.m8642f("analytics.service_client_enabled", true, true);

    /* renamed from: c */
    public static C5606x0<String> f6420c = C5606x0.m8641e("analytics.log_tag", "GAv4", "GAv4-SVC");

    /* renamed from: d */
    private static C5606x0<Long> f6421d = C5606x0.m8640d("analytics.max_tokens", 60, 60);

    /* renamed from: e */
    private static C5606x0<Float> f6422e = C5606x0.m8638b("analytics.tokens_per_sec", 0.5f, 0.5f);

    /* renamed from: f */
    public static C5606x0<Integer> f6423f = C5606x0.m8639c("analytics.max_stored_hits", 2000, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);

    /* renamed from: g */
    private static C5606x0<Integer> f6424g = C5606x0.m8639c("analytics.max_stored_hits_per_app", 2000, 2000);

    /* renamed from: h */
    public static C5606x0<Integer> f6425h = C5606x0.m8639c("analytics.max_stored_properties_per_app", 100, 100);

    /* renamed from: i */
    public static C5606x0<Long> f6426i = C5606x0.m8640d("analytics.local_dispatch_millis", 1800000, 120000);

    /* renamed from: j */
    public static C5606x0<Long> f6427j = C5606x0.m8640d("analytics.initial_local_dispatch_millis", 5000, 5000);

    /* renamed from: k */
    private static C5606x0<Long> f6428k = C5606x0.m8640d("analytics.min_local_dispatch_millis", 120000, 120000);

    /* renamed from: l */
    private static C5606x0<Long> f6429l = C5606x0.m8640d("analytics.max_local_dispatch_millis", 7200000, 7200000);

    /* renamed from: m */
    public static C5606x0<Long> f6430m = C5606x0.m8640d("analytics.dispatch_alarm_millis", 7200000, 7200000);

    /* renamed from: n */
    public static C5606x0<Long> f6431n = C5606x0.m8640d("analytics.max_dispatch_alarm_millis", 32400000, 32400000);

    /* renamed from: o */
    public static C5606x0<Integer> f6432o = C5606x0.m8639c("analytics.max_hits_per_dispatch", 20, 20);

    /* renamed from: p */
    public static C5606x0<Integer> f6433p = C5606x0.m8639c("analytics.max_hits_per_batch", 20, 20);

    /* renamed from: q */
    public static C5606x0<String> f6434q = C5606x0.m8641e("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");

    /* renamed from: r */
    public static C5606x0<String> f6435r = C5606x0.m8641e("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");

    /* renamed from: s */
    public static C5606x0<String> f6436s = C5606x0.m8641e("analytics.simple_endpoint", "/collect", "/collect");

    /* renamed from: t */
    public static C5606x0<String> f6437t = C5606x0.m8641e("analytics.batching_endpoint", "/batch", "/batch");

    /* renamed from: u */
    public static C5606x0<Integer> f6438u = C5606x0.m8639c("analytics.max_get_length", 2036, 2036);

    /* renamed from: v */
    public static C5606x0<String> f6439v;

    /* renamed from: w */
    public static C5606x0<String> f6440w;

    /* renamed from: x */
    private static C5606x0<Integer> f6441x = C5606x0.m8639c("analytics.max_hits_per_request.k", 20, 20);

    /* renamed from: y */
    public static C5606x0<Integer> f6442y = C5606x0.m8639c("analytics.max_hit_length.k", 8192, 8192);

    /* renamed from: z */
    public static C5606x0<Integer> f6443z = C5606x0.m8639c("analytics.max_post_length.k", 8192, 8192);

    static {
        C5317e0 e0Var = C5317e0.BATCH_BY_COUNT;
        f6439v = C5606x0.m8641e("analytics.batching_strategy.k", e0Var.name(), e0Var.name());
        String name = C5408k0.GZIP.name();
        f6440w = C5606x0.m8641e("analytics.compression_strategy.k", name, name);
    }
}
