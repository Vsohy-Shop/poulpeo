package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p201q5.C9254a;
import p201q5.C9260g;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6360z3 extends C6197k5 {

    /* renamed from: x */
    static final Pair<String, Long> f8432x = new Pair<>("", 0L);

    /* renamed from: c */
    private SharedPreferences f8433c;

    /* renamed from: d */
    public C6327w3 f8434d;

    /* renamed from: e */
    public final C6316v3 f8435e = new C6316v3(this, "first_open_time", 0);

    /* renamed from: f */
    public final C6316v3 f8436f = new C6316v3(this, "app_install_time", 0);

    /* renamed from: g */
    public final C6338x3 f8437g = new C6338x3(this, "app_instance_id", (String) null);

    /* renamed from: h */
    private String f8438h;

    /* renamed from: i */
    private boolean f8439i;

    /* renamed from: j */
    private long f8440j;

    /* renamed from: k */
    public final C6316v3 f8441k = new C6316v3(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C6294t3 f8442l = new C6294t3(this, "start_new_session", true);

    /* renamed from: m */
    public final C6338x3 f8443m = new C6338x3(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final C6294t3 f8444n = new C6294t3(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C6316v3 f8445o = new C6316v3(this, "last_pause_time", 0);

    /* renamed from: p */
    public boolean f8446p;

    /* renamed from: q */
    public final C6294t3 f8447q = new C6294t3(this, "app_backgrounded", false);

    /* renamed from: r */
    public final C6294t3 f8448r = new C6294t3(this, "deep_link_retrieval_complete", false);

    /* renamed from: s */
    public final C6316v3 f8449s = new C6316v3(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: t */
    public final C6338x3 f8450t = new C6338x3(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: u */
    public final C6338x3 f8451u = new C6338x3(this, "deferred_attribution_cache", (String) null);

    /* renamed from: v */
    public final C6316v3 f8452v = new C6316v3(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: w */
    public final C6305u3 f8453w = new C6305u3(this, "default_event_parameters", (Bundle) null);

    C6360z3(C6251p4 p4Var) {
        super(p4Var);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: i */
    public final void mo35060i() {
        SharedPreferences sharedPreferences = this.f7899a.mo34927f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f8433c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f8446p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f8433c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f7899a.mo35211z();
        this.f8434d = new C6327w3(this, "health_monitor", Math.max(0, C6084a3.f7574d.mo35421a(null).longValue()), (C9260g) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo35061j() {
        return true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: o */
    public final SharedPreferences mo35423o() {
        mo34778h();
        mo35062k();
        C9713p.m20275j(this.f8433c);
        return this.f8433c;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final Pair<String, Boolean> mo35424p(String str) {
        mo34778h();
        long b = this.f7899a.mo34922c().mo33548b();
        String str2 = this.f8438h;
        if (str2 != null && b < this.f8440j) {
            return new Pair<>(str2, Boolean.valueOf(this.f8439i));
        }
        this.f8440j = b + this.f7899a.mo35211z().mo34887r(str, C6084a3.f7572c);
        AdvertisingIdClient.m5896a(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f7899a.mo34927f());
            this.f8438h = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f8438h = id;
            }
            this.f8439i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.f7899a.mo34920b().mo35074q().mo35038b("Unable to get advertising id", e);
            this.f8438h = "";
        }
        AdvertisingIdClient.m5896a(false);
        return new Pair<>(this.f8438h, Boolean.valueOf(this.f8439i));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: q */
    public final C9254a mo35425q() {
        mo34778h();
        return C9254a.m18988b(mo35423o().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final Boolean mo35426r() {
        mo34778h();
        if (mo35423o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo35423o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final void mo35427s(Boolean bool) {
        mo34778h();
        SharedPreferences.Editor edit = mo35423o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final void mo35428t(boolean z) {
        mo34778h();
        this.f7899a.mo34920b().mo35079v().mo35038b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo35423o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final boolean mo35429u() {
        SharedPreferences sharedPreferences = this.f8433c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo35430v(long j) {
        if (j - this.f8441k.mo35384a() > this.f8445o.mo35384a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final boolean mo35431w(int i) {
        return C9254a.m18991l(i, mo35423o().getInt("consent_source", 100));
    }
}
