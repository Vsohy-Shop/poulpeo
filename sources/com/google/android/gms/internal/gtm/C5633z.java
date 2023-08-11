package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.appboy.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p023a5.C2207e;
import p231t4.C9713p;
import p296z3.C10796a;
import p296z3.C10803g;
import p296z3.C10808l;
import p296z3.C10812p;

/* renamed from: com.google.android.gms.internal.gtm.z */
final class C5633z extends C5407k {

    /* renamed from: d */
    private boolean f6743d;

    /* renamed from: e */
    private final C5576v f6744e;

    /* renamed from: f */
    private final C5379i1 f6745f;

    /* renamed from: g */
    private final C5364h1 f6746g;

    /* renamed from: h */
    private final C5500q f6747h;

    /* renamed from: i */
    private long f6748i = Long.MIN_VALUE;

    /* renamed from: j */
    private final C5501q0 f6749j;

    /* renamed from: k */
    private final C5501q0 f6750k;

    /* renamed from: l */
    private final C5487p1 f6751l;

    /* renamed from: m */
    private long f6752m;

    /* renamed from: n */
    private boolean f6753n;

    protected C5633z(C5437m mVar, C5467o oVar) {
        super(mVar);
        C9713p.m20275j(oVar);
        this.f6746g = new C5364h1(mVar);
        this.f6744e = new C5576v(mVar);
        this.f6745f = new C5379i1(mVar);
        this.f6747h = new C5500q(mVar);
        this.f6751l = new C5487p1(mo33279k0());
        this.f6749j = new C5257a0(this, mVar);
        this.f6750k = new C5272b0(this, mVar);
    }

    /* renamed from: U0 */
    private final void m8691U0(C5485p pVar, C5466nd ndVar) {
        C9713p.m20275j(pVar);
        C9713p.m20275j(ndVar);
        C10803g gVar = new C10803g(mo33278j0());
        gVar.mo45734f(pVar.mo33438d());
        gVar.mo45733e(pVar.mo33439e());
        C10808l b = gVar.mo45732b();
        C5590vd vdVar = (C5590vd) b.mo45752n(C5590vd.class);
        vdVar.mo33594q("data");
        vdVar.mo33585h(true);
        b.mo45741c(ndVar);
        C5514qd qdVar = (C5514qd) b.mo45752n(C5514qd.class);
        C5451md mdVar = (C5451md) b.mo45752n(C5451md.class);
        for (Map.Entry next : pVar.mo33441g().entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if ("an".equals(str)) {
                mdVar.mo33366g(str2);
            } else if ("av".equals(str)) {
                mdVar.mo33367h(str2);
            } else if ("aid".equals(str)) {
                mdVar.mo33364e(str2);
            } else if ("aiid".equals(str)) {
                mdVar.mo33365f(str2);
            } else if ("uid".equals(str)) {
                vdVar.mo33583f(str2);
            } else {
                qdVar.mo33487e(str, str2);
            }
        }
        mo33273V("Sending installation campaign to", pVar.mo33438d(), ndVar);
        b.mo45740b(mo33287z0().mo33311S0());
        b.mo45746h();
    }

    /* renamed from: b1 */
    private final long m8694b1() {
        C10812p.m23065i();
        mo33310Q0();
        try {
            return this.f6744e.mo33571h1();
        } catch (SQLiteException e) {
            mo33265H0("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d1 */
    public final void m8695d1() {
        mo33634Z0(new C5302d0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public final void m8696e1() {
        try {
            this.f6744e.mo33570g1();
            mo33637h1();
        } catch (SQLiteException e) {
            mo33262E0("Failed to delete stale hits", e);
        }
        this.f6750k.mo33472h(86400000);
    }

    /* renamed from: f1 */
    private final void m8697f1() {
        if (!this.f6753n && C5468o0.m8256b() && !this.f6747h.mo33467T0()) {
            if (this.f6751l.mo33444c(C5592w0.f6414O.mo33605a().longValue())) {
                this.f6751l.mo33443b();
                mo33266I0("Connecting to service");
                if (this.f6747h.mo33465R0()) {
                    mo33266I0("Connected to service");
                    this.f6751l.mo33442a();
                    mo33629R0();
                }
            }
        }
    }

    /* renamed from: g1 */
    private final boolean m8698g1() {
        C10812p.m23065i();
        mo33310Q0();
        mo33266I0("Dispatching a batch of local hits");
        boolean z = !this.f6747h.mo33467T0();
        boolean z2 = !this.f6745f.mo33252b1();
        if (!z || !z2) {
            long max = (long) Math.max(C5468o0.m8260f(), C5468o0.m8261g());
            ArrayList arrayList = new ArrayList();
            long j = 0;
            while (true) {
                this.f6744e.mo33560R0();
                arrayList.clear();
                try {
                    List<C5273b1> e1 = this.f6744e.mo33569e1(max);
                    if (e1.isEmpty()) {
                        mo33266I0("Store is empty, nothing to dispatch");
                        m8700j1();
                        try {
                            this.f6744e.mo33564V0();
                            this.f6744e.mo33561S0();
                            return false;
                        } catch (SQLiteException e) {
                            mo33265H0("Failed to commit local dispatch transaction", e);
                            m8700j1();
                            return false;
                        }
                    } else {
                        mo33257A("Hits loaded from store. count", Integer.valueOf(e1.size()));
                        for (C5273b1 g : e1) {
                            if (g.mo33111g() == j) {
                                mo33263F0("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(e1.size()));
                                m8700j1();
                                try {
                                    this.f6744e.mo33564V0();
                                    this.f6744e.mo33561S0();
                                    return false;
                                } catch (SQLiteException e2) {
                                    mo33265H0("Failed to commit local dispatch transaction", e2);
                                    m8700j1();
                                    return false;
                                }
                            }
                        }
                        if (this.f6747h.mo33467T0()) {
                            mo33266I0("Service connected, sending hits to the service");
                            while (!e1.isEmpty()) {
                                C5273b1 b1Var = e1.get(0);
                                if (this.f6747h.mo33468a1(b1Var)) {
                                    j = Math.max(j, b1Var.mo33111g());
                                    e1.remove(b1Var);
                                    mo33272R("Hit sent do device AnalyticsService for delivery", b1Var);
                                    try {
                                        this.f6744e.mo33572k1(b1Var.mo33111g());
                                        arrayList.add(Long.valueOf(b1Var.mo33111g()));
                                    } catch (SQLiteException e3) {
                                        mo33265H0("Failed to remove hit that was send for delivery", e3);
                                        m8700j1();
                                        try {
                                            this.f6744e.mo33564V0();
                                            this.f6744e.mo33561S0();
                                            return false;
                                        } catch (SQLiteException e4) {
                                            mo33265H0("Failed to commit local dispatch transaction", e4);
                                            m8700j1();
                                            return false;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            this.f6744e.mo33564V0();
                                            this.f6744e.mo33561S0();
                                            throw th;
                                        } catch (SQLiteException e5) {
                                            mo33265H0("Failed to commit local dispatch transaction", e5);
                                            m8700j1();
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        if (this.f6745f.mo33252b1()) {
                            List<Long> Z0 = this.f6745f.mo33251Z0(e1);
                            for (Long longValue : Z0) {
                                j = Math.max(j, longValue.longValue());
                            }
                            try {
                                this.f6744e.mo33566a1(Z0);
                                arrayList.addAll(Z0);
                            } catch (SQLiteException e6) {
                                mo33265H0("Failed to remove successfully uploaded hits", e6);
                                m8700j1();
                                try {
                                    this.f6744e.mo33564V0();
                                    this.f6744e.mo33561S0();
                                    return false;
                                } catch (SQLiteException e7) {
                                    mo33265H0("Failed to commit local dispatch transaction", e7);
                                    m8700j1();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.f6744e.mo33564V0();
                                this.f6744e.mo33561S0();
                                return false;
                            } catch (SQLiteException e8) {
                                mo33265H0("Failed to commit local dispatch transaction", e8);
                                m8700j1();
                                return false;
                            }
                        } else {
                            try {
                                this.f6744e.mo33564V0();
                                this.f6744e.mo33561S0();
                            } catch (SQLiteException e9) {
                                mo33265H0("Failed to commit local dispatch transaction", e9);
                                m8700j1();
                                return false;
                            }
                        }
                    }
                } catch (SQLiteException e10) {
                    mo33262E0("Failed to read hits from persisted store", e10);
                    m8700j1();
                    try {
                        this.f6744e.mo33564V0();
                        this.f6744e.mo33561S0();
                        return false;
                    } catch (SQLiteException e11) {
                        mo33265H0("Failed to commit local dispatch transaction", e11);
                        m8700j1();
                        return false;
                    }
                }
            }
        } else {
            mo33266I0("No network or service available. Will retry later");
            return false;
        }
    }

    /* renamed from: i1 */
    private final void m8699i1() {
        C5546t0 x0 = mo33285x0();
        if (x0.mo33528U0() && !x0.mo33527T0()) {
            long b1 = m8694b1();
            if (b1 != 0 && Math.abs(mo33279k0().mo33547a() - b1) <= C5592w0.f6431n.mo33605a().longValue()) {
                mo33257A("Dispatch alarm scheduled (ms)", Long.valueOf(C5468o0.m8259e()));
                x0.mo33529V0();
            }
        }
    }

    /* renamed from: j1 */
    private final void m8700j1() {
        if (this.f6749j.mo33471g()) {
            mo33266I0("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f6749j.mo33469a();
        C5546t0 x0 = mo33285x0();
        if (x0.mo33527T0()) {
            x0.mo33526R0();
        }
    }

    /* renamed from: k1 */
    private final long m8701k1() {
        long j = this.f6748i;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        long longValue = C5592w0.f6426i.mo33605a().longValue();
        C5517r1 y0 = mo33286y0();
        y0.mo33310Q0();
        if (!y0.f6268g) {
            return longValue;
        }
        C5517r1 y02 = mo33286y0();
        y02.mo33310Q0();
        return ((long) y02.f6269h) * 1000;
    }

    /* renamed from: l1 */
    private final void m8702l1() {
        mo33310Q0();
        C10812p.m23065i();
        this.f6753n = true;
        this.f6747h.mo33466S0();
        mo33637h1();
    }

    /* renamed from: m1 */
    private final boolean m8703m1(String str) {
        if (C2207e.m1805a(mo33276c()).mo23526a(str) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
        this.f6744e.mo33309O0();
        this.f6745f.mo33309O0();
        this.f6747h.mo33309O0();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[LOOP:1: B:15:0x0044->B:23:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0040 A[SYNTHETIC] */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33629R0() {
        /*
            r5 = this;
            p296z3.C10812p.m23065i()
            p296z3.C10812p.m23065i()
            r5.mo33310Q0()
            boolean r0 = com.google.android.gms.internal.gtm.C5468o0.m8256b()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.mo33269L0(r0)
        L_0x0014:
            com.google.android.gms.internal.gtm.q r0 = r5.f6747h
            boolean r0 = r0.mo33467T0()
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Service not connected"
            r5.mo33266I0(r0)
            return
        L_0x0022:
            com.google.android.gms.internal.gtm.v r0 = r5.f6744e
            boolean r0 = r0.mo33563U0()
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.mo33266I0(r0)
        L_0x002f:
            com.google.android.gms.internal.gtm.v r0 = r5.f6744e     // Catch:{ SQLiteException -> 0x0074 }
            int r1 = com.google.android.gms.internal.gtm.C5468o0.m8260f()     // Catch:{ SQLiteException -> 0x0074 }
            long r1 = (long) r1     // Catch:{ SQLiteException -> 0x0074 }
            java.util.List r0 = r0.mo33569e1(r1)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x0044
            r5.mo33637h1()     // Catch:{ SQLiteException -> 0x0074 }
            return
        L_0x0044:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x002f
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.gtm.b1 r1 = (com.google.android.gms.internal.gtm.C5273b1) r1
            com.google.android.gms.internal.gtm.q r2 = r5.f6747h
            boolean r2 = r2.mo33468a1(r1)
            if (r2 != 0) goto L_0x005d
            r5.mo33637h1()
            return
        L_0x005d:
            r0.remove(r1)
            com.google.android.gms.internal.gtm.v r2 = r5.f6744e     // Catch:{ SQLiteException -> 0x006a }
            long r3 = r1.mo33111g()     // Catch:{ SQLiteException -> 0x006a }
            r2.mo33572k1(r3)     // Catch:{ SQLiteException -> 0x006a }
            goto L_0x0044
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.mo33265H0(r1, r0)
            r5.m8700j1()
            return
        L_0x0074:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.mo33265H0(r1, r0)
            r5.m8700j1()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5633z.mo33629R0():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public final void mo33630S0() {
        mo33310Q0();
        C9713p.m20279n(!this.f6743d, "Analytics backend already started");
        this.f6743d = true;
        mo33282u0().mo45758d(new C5287c0(this));
    }

    /* renamed from: T0 */
    public final long mo33631T0(C5485p pVar, boolean z) {
        C9713p.m20275j(pVar);
        mo33310Q0();
        C10812p.m23065i();
        try {
            this.f6744e.mo33560R0();
            C5576v vVar = this.f6744e;
            long c = pVar.mo33437c();
            String b = pVar.mo33436b();
            C9713p.m20271f(b);
            vVar.mo33310Q0();
            C10812p.m23065i();
            int i = 0;
            int delete = vVar.mo33562T0().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(c), b});
            if (delete > 0) {
                vVar.mo33257A("Deleted property records", Integer.valueOf(delete));
            }
            long W0 = this.f6744e.mo33565W0(pVar.mo33437c(), pVar.mo33436b(), pVar.mo33438d());
            pVar.mo33435a(1 + W0);
            C5576v vVar2 = this.f6744e;
            C9713p.m20275j(pVar);
            vVar2.mo33310Q0();
            C10812p.m23065i();
            SQLiteDatabase T0 = vVar2.mo33562T0();
            Map<String, String> g = pVar.mo33441g();
            C9713p.m20275j(g);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry next : g.entrySet()) {
                builder.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", Long.valueOf(pVar.mo33437c()));
            contentValues.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, pVar.mo33436b());
            contentValues.put("tid", pVar.mo33438d());
            if (pVar.mo33439e()) {
                i = 1;
            }
            contentValues.put("adid", Integer.valueOf(i));
            contentValues.put("hits_count", Long.valueOf(pVar.mo33440f()));
            contentValues.put("params", encodedQuery);
            try {
                if (T0.insertWithOnConflict("properties", (String) null, contentValues, 5) == -1) {
                    vVar2.mo33270M0("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                vVar2.mo33265H0("Error storing a property", e);
            }
            this.f6744e.mo33564V0();
            try {
                this.f6744e.mo33561S0();
            } catch (SQLiteException e2) {
                mo33265H0("Failed to end transaction", e2);
            }
            return W0;
        } catch (SQLiteException e3) {
            mo33265H0("Failed to update Analytics property", e3);
            try {
                this.f6744e.mo33561S0();
            } catch (SQLiteException e4) {
                mo33265H0("Failed to end transaction", e4);
            }
            return -1;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                this.f6744e.mo33561S0();
            } catch (SQLiteException e5) {
                mo33265H0("Failed to end transaction", e5);
            }
            throw th2;
        }
    }

    /* renamed from: W0 */
    public final void mo33632W0(C5273b1 b1Var) {
        Pair<String, Long> c;
        C9713p.m20275j(b1Var);
        C10812p.m23065i();
        mo33310Q0();
        if (this.f6753n) {
            mo33267J0("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            mo33257A("Delivering hit", b1Var);
        }
        if (TextUtils.isEmpty(b1Var.mo33116l()) && (c = mo33287z0().mo33316X0().mo33347c()) != null) {
            String str = (String) c.first;
            String valueOf = String.valueOf((Long) c.second);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(":");
            sb.append(str);
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap(b1Var.mo33109e());
            hashMap.put("_m", sb2);
            b1Var = new C5273b1(this, hashMap, b1Var.mo33112h(), b1Var.mo33114j(), b1Var.mo33111g(), b1Var.mo33110f(), b1Var.mo33113i());
        }
        m8697f1();
        if (this.f6747h.mo33468a1(b1Var)) {
            mo33267J0("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.f6744e.mo33568d1(b1Var);
            mo33637h1();
        } catch (SQLiteException e) {
            mo33265H0("Delivery failed to save hit to a database", e);
            mo33280p0().mo33214R0(b1Var, "deliver: failed to insert hit to database");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public final void mo33633X0(C5485p pVar) {
        C10812p.m23065i();
        mo33272R("Sending first hit to property", pVar.mo33438d());
        if (!mo33287z0().mo33312T0().mo33444c(C5468o0.m8265l())) {
            String W0 = mo33287z0().mo33315W0();
            if (!TextUtils.isEmpty(W0)) {
                C5466nd b = C5502q1.m8395b(mo33280p0(), W0);
                mo33272R("Found relevant installation campaign", b);
                m8691U0(pVar, b);
            }
        }
    }

    /* renamed from: Z0 */
    public final void mo33634Z0(C5562u0 u0Var) {
        long j;
        long j2 = this.f6752m;
        C10812p.m23065i();
        mo33310Q0();
        long U0 = mo33287z0().mo33313U0();
        if (U0 != 0) {
            j = Math.abs(mo33279k0().mo33547a() - U0);
        } else {
            j = -1;
        }
        mo33272R("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j));
        m8697f1();
        try {
            m8698g1();
            mo33287z0().mo33314V0();
            mo33637h1();
            if (u0Var != null) {
                u0Var.mo33166a((Throwable) null);
            }
            if (this.f6752m != j2) {
                this.f6746g.mo33230e();
            }
        } catch (Exception e) {
            mo33265H0("Local dispatch failed", e);
            mo33287z0().mo33314V0();
            mo33637h1();
            if (u0Var != null) {
                u0Var.mo33166a(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public final void mo33635a1() {
        C10812p.m23065i();
        this.f6752m = mo33279k0().mo33547a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public final void mo33636c1() {
        mo33310Q0();
        C10812p.m23065i();
        Context a = mo33278j0().mo33328a();
        if (!C5454n1.m8216a(a)) {
            mo33269L0("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C5469o1.m8268a(a)) {
            mo33270M0("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C10796a.m22973a(a)) {
            mo33269L0("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        mo33287z0().mo33311S0();
        if (!m8703m1("android.permission.ACCESS_NETWORK_STATE")) {
            mo33270M0("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m8702l1();
        }
        if (!m8703m1("android.permission.INTERNET")) {
            mo33270M0("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m8702l1();
        }
        if (C5469o1.m8268a(mo33276c())) {
            mo33266I0("AnalyticsService registered in the app manifest and enabled");
        } else {
            mo33269L0("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.f6753n && !this.f6744e.mo33563U0()) {
            m8697f1();
        }
        mo33637h1();
    }

    /* renamed from: h1 */
    public final void mo33637h1() {
        boolean z;
        long j;
        C10812p.m23065i();
        mo33310Q0();
        boolean z2 = true;
        if (this.f6753n || m8701k1() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.f6746g.mo33228b();
            m8700j1();
        } else if (this.f6744e.mo33563U0()) {
            this.f6746g.mo33228b();
            m8700j1();
        } else {
            if (!C5592w0.f6409J.mo33605a().booleanValue()) {
                this.f6746g.mo33229c();
                z2 = this.f6746g.mo33227a();
            }
            if (z2) {
                m8699i1();
                long k1 = m8701k1();
                long U0 = mo33287z0().mo33313U0();
                if (U0 != 0) {
                    j = k1 - Math.abs(mo33279k0().mo33547a() - U0);
                    if (j <= 0) {
                        j = Math.min(C5468o0.m8258d(), k1);
                    }
                } else {
                    j = Math.min(C5468o0.m8258d(), k1);
                }
                mo33257A("Dispatch scheduled (ms)", Long.valueOf(j));
                if (this.f6749j.mo33471g()) {
                    this.f6749j.mo33473i(Math.max(1, j + this.f6749j.mo33470f()));
                    return;
                }
                this.f6749j.mo33472h(j);
                return;
            }
            m8700j1();
            m8699i1();
        }
    }
}
