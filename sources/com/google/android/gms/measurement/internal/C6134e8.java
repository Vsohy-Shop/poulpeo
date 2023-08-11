package com.google.android.gms.measurement.internal;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p201q5.C9254a;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6134e8 extends C6343x8 {

    /* renamed from: d */
    private String f7749d;

    /* renamed from: e */
    private boolean f7750e;

    /* renamed from: f */
    private long f7751f;

    /* renamed from: g */
    public final C6316v3 f7752g;

    /* renamed from: h */
    public final C6316v3 f7753h;

    /* renamed from: i */
    public final C6316v3 f7754i;

    /* renamed from: j */
    public final C6316v3 f7755j;

    /* renamed from: k */
    public final C6316v3 f7756k;

    C6134e8(C6157g9 g9Var) {
        super(g9Var);
        C6360z3 F = this.f7899a.mo35184F();
        F.getClass();
        this.f7752g = new C6316v3(F, "last_delete_stale", 0);
        C6360z3 F2 = this.f7899a.mo35184F();
        F2.getClass();
        this.f7753h = new C6316v3(F2, "backoff", 0);
        C6360z3 F3 = this.f7899a.mo35184F();
        F3.getClass();
        this.f7754i = new C6316v3(F3, "last_upload", 0);
        C6360z3 F4 = this.f7899a.mo35184F();
        F4.getClass();
        this.f7755j = new C6316v3(F4, "last_upload_attempt", 0);
        C6360z3 F5 = this.f7899a.mo35184F();
        F5.getClass();
        this.f7756k = new C6316v3(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo34749l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    /* renamed from: m */
    public final Pair<String, Boolean> mo34854m(String str) {
        mo34778h();
        long b = this.f7899a.mo34922c().mo33548b();
        String str2 = this.f7749d;
        if (str2 != null && b < this.f7751f) {
            return new Pair<>(str2, Boolean.valueOf(this.f7750e));
        }
        this.f7751f = b + this.f7899a.mo35211z().mo34887r(str, C6084a3.f7572c);
        AdvertisingIdClient.m5896a(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f7899a.mo34927f());
            this.f7749d = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f7749d = id;
            }
            this.f7750e = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.f7899a.mo34920b().mo35074q().mo35038b("Unable to get advertising id", e);
            this.f7749d = "";
        }
        AdvertisingIdClient.m5896a(false);
        return new Pair<>(this.f7749d, Boolean.valueOf(this.f7750e));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: n */
    public final Pair<String, Boolean> mo34855n(String str, C9254a aVar) {
        if (aVar.mo43553j()) {
            return mo34854m(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    /* renamed from: o */
    public final String mo34856o(String str) {
        mo34778h();
        String str2 = (String) mo34854m(str).first;
        MessageDigest s = C6234n9.m10934s();
        if (s == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, s.digest(str2.getBytes()))});
    }
}
