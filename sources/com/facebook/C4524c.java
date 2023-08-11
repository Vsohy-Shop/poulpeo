package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.c */
/* compiled from: AccessTokenCache.kt */
public final class C4524c {

    /* renamed from: d */
    public static final C4525a f4134d = new C4525a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C4577q f4135a;

    /* renamed from: b */
    private final SharedPreferences f4136b;

    /* renamed from: c */
    private final C4526b f4137c;

    /* renamed from: com.facebook.c$a */
    /* compiled from: AccessTokenCache.kt */
    public static final class C4525a {
        private C4525a() {
        }

        public /* synthetic */ C4525a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.facebook.c$b */
    /* compiled from: AccessTokenCache.kt */
    public static final class C4526b {
        /* renamed from: a */
        public final C4577q mo31536a() {
            return new C4577q(FacebookSdk.getApplicationContext(), (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    public C4524c(SharedPreferences sharedPreferences, C4526b bVar) {
        C12775o.m28639i(sharedPreferences, "sharedPreferences");
        C12775o.m28639i(bVar, "tokenCachingStrategyFactory");
        this.f4136b = sharedPreferences;
        this.f4137c = bVar;
    }

    /* renamed from: b */
    private final C4509a m5543b() {
        String string = this.f4136b.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string == null) {
            return null;
        }
        try {
            return C4509a.f4119q.mo31512b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final C4509a m5544c() {
        Bundle c = m5545d().mo31718c();
        if (c == null || !C4577q.f4297d.mo31724g(c)) {
            return null;
        }
        return C4509a.f4119q.mo31513c(c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        p251v2.C9925a.m20732b(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.C4577q m5545d() {
        /*
            r3 = this;
            boolean r0 = p251v2.C9925a.m20734d(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.facebook.q r0 = r3.f4135a     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0020
            monitor-enter(r3)     // Catch:{ all -> 0x0031 }
            com.facebook.q r0 = r3.f4135a     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0019
            com.facebook.c$b r0 = r3.f4137c     // Catch:{ all -> 0x001d }
            com.facebook.q r0 = r0.mo31536a()     // Catch:{ all -> 0x001d }
            r3.f4135a = r0     // Catch:{ all -> 0x001d }
        L_0x0019:
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            goto L_0x0020
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0020:
            com.facebook.q r0 = r3.f4135a     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0025
            return r0
        L_0x0025:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            p251v2.C9925a.m20732b(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4524c.m5545d():com.facebook.q");
    }

    /* renamed from: e */
    private final boolean m5546e() {
        return this.f4136b.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: h */
    private final boolean m5547h() {
        return FacebookSdk.isLegacyTokenUpgradeSupported();
    }

    /* renamed from: a */
    public final void mo31533a() {
        this.f4136b.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m5547h()) {
            m5545d().mo31717a();
        }
    }

    /* renamed from: f */
    public final C4509a mo31534f() {
        if (m5546e()) {
            return m5543b();
        }
        if (!m5547h()) {
            return null;
        }
        C4509a c = m5544c();
        if (c == null) {
            return c;
        }
        mo31535g(c);
        m5545d().mo31717a();
        return c;
    }

    /* renamed from: g */
    public final void mo31535g(C4509a aVar) {
        C12775o.m28639i(aVar, "accessToken");
        try {
            this.f4136b.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.mo31504v().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4524c() {
        /*
            r3 = this;
            android.content.Context r0 = com.facebook.FacebookSdk.getApplicationContext()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            com.facebook.c$b r1 = new com.facebook.c$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4524c.<init>():void");
    }
}
