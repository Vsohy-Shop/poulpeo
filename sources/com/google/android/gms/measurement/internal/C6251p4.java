package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.C5884o1;
import com.google.android.gms.internal.measurement.C5943rc;
import com.google.android.gms.internal.measurement.C5953s6;
import com.google.android.gms.internal.measurement.C5991uc;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import p023a5.C2207e;
import p201q5.C9254a;
import p201q5.C9265l;
import p201q5.C9272s;
import p231t4.C9713p;
import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6251p4 implements C6208l5 {

    /* renamed from: H */
    private static volatile C6251p4 f8086H;

    /* renamed from: A */
    private volatile Boolean f8087A;

    /* renamed from: B */
    protected Boolean f8088B;

    /* renamed from: C */
    protected Boolean f8089C;

    /* renamed from: D */
    private volatile boolean f8090D;

    /* renamed from: E */
    private int f8091E;

    /* renamed from: F */
    private final AtomicInteger f8092F = new AtomicInteger(0);

    /* renamed from: G */
    final long f8093G;

    /* renamed from: a */
    private final Context f8094a;

    /* renamed from: b */
    private final String f8095b;

    /* renamed from: c */
    private final String f8096c;

    /* renamed from: d */
    private final String f8097d;

    /* renamed from: e */
    private final boolean f8098e;

    /* renamed from: f */
    private final C6092b f8099f;

    /* renamed from: g */
    private final C6147g f8100g;

    /* renamed from: h */
    private final C6360z3 f8101h;

    /* renamed from: i */
    private final C6206l3 f8102i;

    /* renamed from: j */
    private final C6229n4 f8103j;

    /* renamed from: k */
    private final C6288s8 f8104k;

    /* renamed from: l */
    private final C6234n9 f8105l;

    /* renamed from: m */
    private final C6151g3 f8106m;

    /* renamed from: n */
    private final C10671e f8107n;

    /* renamed from: o */
    private final C6111c7 f8108o;

    /* renamed from: p */
    private final C6264q6 f8109p;

    /* renamed from: q */
    private final C6106c2 f8110q;

    /* renamed from: r */
    private final C6297t6 f8111r;

    /* renamed from: s */
    private final String f8112s;

    /* renamed from: t */
    private C6140f3 f8113t;

    /* renamed from: u */
    private C6123d8 f8114u;

    /* renamed from: v */
    private C6224n f8115v;

    /* renamed from: w */
    private C6118d3 f8116w;

    /* renamed from: x */
    private boolean f8117x = false;

    /* renamed from: y */
    private Boolean f8118y;

    /* renamed from: z */
    private long f8119z;

    C6251p4(C6230n5 n5Var) {
        long j;
        Bundle bundle;
        boolean z = false;
        C9713p.m20275j(n5Var);
        C6092b bVar = new C6092b(n5Var.f8008a);
        this.f8099f = bVar;
        C6348y2.f8406a = bVar;
        Context context = n5Var.f8008a;
        this.f8094a = context;
        this.f8095b = n5Var.f8009b;
        this.f8096c = n5Var.f8010c;
        this.f8097d = n5Var.f8011d;
        this.f8098e = n5Var.f8015h;
        this.f8087A = n5Var.f8012e;
        this.f8112s = n5Var.f8017j;
        this.f8090D = true;
        C5884o1 o1Var = n5Var.f8014g;
        if (!(o1Var == null || (bundle = o1Var.f7186h) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f8088B = (Boolean) obj;
            }
            Object obj2 = o1Var.f7186h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f8089C = (Boolean) obj2;
            }
        }
        C5953s6.m9870d(context);
        C10671e c = C10674h.m22680c();
        this.f8107n = c;
        Long l = n5Var.f8016i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = c.mo33547a();
        }
        this.f8093G = j;
        this.f8100g = new C6147g(this);
        C6360z3 z3Var = new C6360z3(this);
        z3Var.mo35063l();
        this.f8101h = z3Var;
        C6206l3 l3Var = new C6206l3(this);
        l3Var.mo35063l();
        this.f8102i = l3Var;
        C6234n9 n9Var = new C6234n9(this);
        n9Var.mo35063l();
        this.f8105l = n9Var;
        this.f8106m = new C6151g3(new C6219m5(n5Var, this));
        this.f8110q = new C6106c2(this);
        C6111c7 c7Var = new C6111c7(this);
        c7Var.mo35414j();
        this.f8108o = c7Var;
        C6264q6 q6Var = new C6264q6(this);
        q6Var.mo35414j();
        this.f8109p = q6Var;
        C6288s8 s8Var = new C6288s8(this);
        s8Var.mo35414j();
        this.f8104k = s8Var;
        C6297t6 t6Var = new C6297t6(this);
        t6Var.mo35063l();
        this.f8111r = t6Var;
        C6229n4 n4Var = new C6229n4(this);
        n4Var.mo35063l();
        this.f8103j = n4Var;
        C5884o1 o1Var2 = n5Var.f8014g;
        z = (o1Var2 == null || o1Var2.f7181c == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C6264q6 I = mo35186I();
            if (I.f7899a.f8094a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f7899a.f8094a.getApplicationContext();
                if (I.f8140c == null) {
                    I.f8140c = new C6242o6(I, (C9272s) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f8140c);
                    application.registerActivityLifecycleCallbacks(I.f8140c);
                    I.f7899a.mo34920b().mo35079v().mo35037a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo34920b().mo35080w().mo35037a("Application context is not an Application");
        }
        n4Var.mo35110z(new C6240o4(this, n5Var));
    }

    /* renamed from: H */
    public static C6251p4 m10988H(Context context, C5884o1 o1Var, Long l) {
        Bundle bundle;
        if (o1Var != null && (o1Var.f7184f == null || o1Var.f7185g == null)) {
            o1Var = new C5884o1(o1Var.f7180b, o1Var.f7181c, o1Var.f7182d, o1Var.f7183e, (String) null, (String) null, o1Var.f7186h, (String) null);
        }
        C9713p.m20275j(context);
        C9713p.m20275j(context.getApplicationContext());
        if (f8086H == null) {
            synchronized (C6251p4.class) {
                if (f8086H == null) {
                    f8086H = new C6251p4(new C6230n5(context, o1Var, l));
                }
            }
        } else if (!(o1Var == null || (bundle = o1Var.f7186h) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C9713p.m20275j(f8086H);
            f8086H.f8087A = Boolean.valueOf(o1Var.f7186h.getBoolean("dataCollectionDefaultEnabled"));
        }
        C9713p.m20275j(f8086H);
        return f8086H;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m10989e(C6251p4 p4Var, C6230n5 n5Var) {
        String str;
        p4Var.mo34919a().mo34778h();
        p4Var.f8100g.mo34892w();
        C6224n nVar = new C6224n(p4Var);
        nVar.mo35063l();
        p4Var.f8115v = nVar;
        C6118d3 d3Var = new C6118d3(p4Var, n5Var.f8013f);
        d3Var.mo35414j();
        p4Var.f8116w = d3Var;
        C6140f3 f3Var = new C6140f3(p4Var);
        f3Var.mo35414j();
        p4Var.f8113t = f3Var;
        C6123d8 d8Var = new C6123d8(p4Var);
        d8Var.mo35414j();
        p4Var.f8114u = d8Var;
        p4Var.f8105l.mo35064m();
        p4Var.f8101h.mo35064m();
        p4Var.f8116w.mo35415k();
        C6184j3 u = p4Var.mo34920b().mo35078u();
        p4Var.f8100g.mo34886q();
        u.mo35038b("App measurement initialized, version", 46000L);
        p4Var.mo34920b().mo35078u().mo35037a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = d3Var.mo34810s();
        if (TextUtils.isEmpty(p4Var.f8095b)) {
            if (p4Var.mo35191N().mo35133S(s)) {
                p4Var.mo34920b().mo35078u().mo35037a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C6184j3 u2 = p4Var.mo34920b().mo35078u();
                String valueOf = String.valueOf(s);
                if (valueOf.length() != 0) {
                    str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf);
                } else {
                    str = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                }
                u2.mo35037a(str);
            }
        }
        p4Var.mo34920b().mo35074q().mo35037a("Debug-level message logging enabled");
        if (p4Var.f8091E != p4Var.f8092F.get()) {
            p4Var.mo34920b().mo35075r().mo35039c("Not all components initialized", Integer.valueOf(p4Var.f8091E), Integer.valueOf(p4Var.f8092F.get()));
        }
        p4Var.f8117x = true;
    }

    /* renamed from: t */
    static final void m10990t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m10991u(C6186j5 j5Var) {
        if (j5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m10992v(C6349y3 y3Var) {
        if (y3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!y3Var.mo35416m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(y3Var.getClass())));
        }
    }

    /* renamed from: w */
    private static final void m10993w(C6197k5 k5Var) {
        if (k5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!k5Var.mo35065n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(k5Var.getClass())));
        }
    }

    @Pure
    /* renamed from: A */
    public final C6224n mo35179A() {
        m10993w(this.f8115v);
        return this.f8115v;
    }

    @Pure
    /* renamed from: B */
    public final C6118d3 mo35180B() {
        m10992v(this.f8116w);
        return this.f8116w;
    }

    @Pure
    /* renamed from: C */
    public final C6140f3 mo35181C() {
        m10992v(this.f8113t);
        return this.f8113t;
    }

    @Pure
    /* renamed from: D */
    public final C6151g3 mo35182D() {
        return this.f8106m;
    }

    /* renamed from: E */
    public final C6206l3 mo35183E() {
        C6206l3 l3Var = this.f8102i;
        if (l3Var == null || !l3Var.mo35065n()) {
            return null;
        }
        return this.f8102i;
    }

    @Pure
    /* renamed from: F */
    public final C6360z3 mo35184F() {
        m10991u(this.f8101h);
        return this.f8101h;
    }

    /* access modifiers changed from: package-private */
    @SideEffectFree
    /* renamed from: G */
    public final C6229n4 mo35185G() {
        return this.f8103j;
    }

    @Pure
    /* renamed from: I */
    public final C6264q6 mo35186I() {
        m10992v(this.f8109p);
        return this.f8109p;
    }

    @Pure
    /* renamed from: J */
    public final C6297t6 mo35187J() {
        m10993w(this.f8111r);
        return this.f8111r;
    }

    @Pure
    /* renamed from: K */
    public final C6111c7 mo35188K() {
        m10992v(this.f8108o);
        return this.f8108o;
    }

    @Pure
    /* renamed from: L */
    public final C6123d8 mo35189L() {
        m10992v(this.f8114u);
        return this.f8114u;
    }

    @Pure
    /* renamed from: M */
    public final C6288s8 mo35190M() {
        m10992v(this.f8104k);
        return this.f8104k;
    }

    @Pure
    /* renamed from: N */
    public final C6234n9 mo35191N() {
        m10991u(this.f8105l);
        return this.f8105l;
    }

    @Pure
    /* renamed from: O */
    public final String mo35192O() {
        return this.f8095b;
    }

    @Pure
    /* renamed from: P */
    public final String mo35193P() {
        return this.f8096c;
    }

    @Pure
    /* renamed from: Q */
    public final String mo35194Q() {
        return this.f8097d;
    }

    @Pure
    /* renamed from: R */
    public final String mo35195R() {
        return this.f8112s;
    }

    @Pure
    /* renamed from: a */
    public final C6229n4 mo34919a() {
        m10993w(this.f8103j);
        return this.f8103j;
    }

    @Pure
    /* renamed from: b */
    public final C6206l3 mo34920b() {
        m10993w(this.f8102i);
        return this.f8102i;
    }

    @Pure
    /* renamed from: c */
    public final C10671e mo34922c() {
        return this.f8107n;
    }

    @Pure
    /* renamed from: d */
    public final C6092b mo34924d() {
        return this.f8099f;
    }

    @Pure
    /* renamed from: f */
    public final Context mo34927f() {
        return this.f8094a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo35196g() {
        this.f8092F.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo35197h(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo34920b().mo35080w().mo35039c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo35184F().f8448r.mo35300a(true);
            if (bArr == null || bArr.length == 0) {
                mo34920b().mo35074q().mo35037a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(Constants.DEEPLINK, "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo34920b().mo35074q().mo35037a("Deferred Deep Link is empty.");
                    return;
                }
                C6234n9 N = mo35191N();
                C6251p4 p4Var = N.f7899a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f7899a.f8094a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f8109p.mo35257u("auto", "_cmp", bundle);
                        C6234n9 N2 = mo35191N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f7899a.f8094a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString(Constants.DEEPLINK, optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f7899a.f8094a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f7899a.mo34920b().mo35075r().mo35038b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo34920b().mo35080w().mo35039c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo34920b().mo35075r().mo35038b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo34920b().mo35080w().mo35039c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo35198i() {
        this.f8091E++;
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo35199j() {
        mo34919a().mo34778h();
        m10993w(mo35187J());
        String s = mo35180B().mo34810s();
        Pair<String, Boolean> p = mo35184F().mo35424p(s);
        if (!this.f8100g.mo34872A() || ((Boolean) p.second).booleanValue() || TextUtils.isEmpty((CharSequence) p.first)) {
            mo34920b().mo35074q().mo35037a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C6297t6 J = mo35187J();
        J.mo35062k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f7899a.f8094a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo34920b().mo35080w().mo35037a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C6234n9 N = mo35191N();
        mo35180B().f7899a.f8100g.mo34886q();
        URL r = N.mo35148r(46000, s, (String) p.first, mo35184F().f8449s.mo35384a() - 1);
        if (r != null) {
            C6297t6 J2 = mo35187J();
            C9265l lVar = new C9265l(this);
            J2.mo34778h();
            J2.mo35062k();
            C9713p.m20275j(r);
            C9713p.m20275j(lVar);
            J2.f7899a.mo34919a().mo35109y(new C6286s6(J2, s, r, (byte[]) null, (Map) null, lVar, (byte[]) null));
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k */
    public final void mo35200k(boolean z) {
        this.f8087A = Boolean.valueOf(z);
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo35201l(boolean z) {
        mo34919a().mo34778h();
        this.f8090D = z;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: m */
    public final void mo35202m(C5884o1 o1Var) {
        C9254a aVar;
        mo34919a().mo34778h();
        C9254a q = mo35184F().mo35425q();
        C6360z3 F = mo35184F();
        C6251p4 p4Var = F.f7899a;
        F.mo34778h();
        int i = 100;
        int i2 = F.mo35423o().getInt("consent_source", 100);
        C6147g gVar = this.f8100g;
        C6251p4 p4Var2 = gVar.f7899a;
        Boolean t = gVar.mo34889t("google_analytics_default_allow_ad_storage");
        C6147g gVar2 = this.f8100g;
        C6251p4 p4Var3 = gVar2.f7899a;
        Boolean t2 = gVar2.mo34889t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo35184F().mo35431w(-10)) {
            aVar = new C9254a(t, t2);
            i = -10;
        } else {
            if (TextUtils.isEmpty(mo35180B().mo34812u()) || !(i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                C5991uc.m10137b();
                if ((!this.f8100g.mo34873B((String) null, C6084a3.f7607t0) || TextUtils.isEmpty(mo35180B().mo34812u())) && o1Var != null && o1Var.f7186h != null && mo35184F().mo35431w(30)) {
                    aVar = C9254a.m18987a(o1Var.f7186h);
                    if (!aVar.equals(C9254a.f13600c)) {
                        i = 30;
                    }
                }
            } else {
                mo35186I().mo35228G(C9254a.f13600c, -10, this.f8093G);
            }
            aVar = null;
        }
        if (aVar != null) {
            mo35186I().mo35228G(aVar, i, this.f8093G);
            q = aVar;
        }
        mo35186I().mo35232K(q);
        if (mo35184F().f8435e.mo35384a() == 0) {
            mo34920b().mo35079v().mo35038b("Persisting first open", Long.valueOf(this.f8093G));
            mo35184F().f8435e.mo35385b(this.f8093G);
        }
        mo35186I().f8151n.mo35381c();
        if (mo35207r()) {
            if (!TextUtils.isEmpty(mo35180B().mo34812u()) || !TextUtils.isEmpty(mo35180B().mo34809r())) {
                C6234n9 N = mo35191N();
                String u = mo35180B().mo34812u();
                C6360z3 F2 = mo35184F();
                F2.mo34778h();
                String string = F2.mo35423o().getString("gmp_app_id", (String) null);
                String r = mo35180B().mo34809r();
                C6360z3 F3 = mo35184F();
                F3.mo34778h();
                if (N.mo35136b0(u, string, r, F3.mo35423o().getString("admob_app_id", (String) null))) {
                    mo34920b().mo35078u().mo35037a("Rechecking which service to use due to a GMP App Id change");
                    C6360z3 F4 = mo35184F();
                    F4.mo34778h();
                    Boolean r2 = F4.mo35426r();
                    SharedPreferences.Editor edit = F4.mo35423o().edit();
                    edit.clear();
                    edit.apply();
                    if (r2 != null) {
                        F4.mo35427s(r2);
                    }
                    mo35181C().mo34859q();
                    this.f8114u.mo34823Q();
                    this.f8114u.mo34822P();
                    mo35184F().f8435e.mo35385b(this.f8093G);
                    mo35184F().f8437g.mo35401b((String) null);
                }
                C6360z3 F5 = mo35184F();
                String u2 = mo35180B().mo34812u();
                F5.mo34778h();
                SharedPreferences.Editor edit2 = F5.mo35423o().edit();
                edit2.putString("gmp_app_id", u2);
                edit2.apply();
                C6360z3 F6 = mo35184F();
                String r3 = mo35180B().mo34809r();
                F6.mo34778h();
                SharedPreferences.Editor edit3 = F6.mo35423o().edit();
                edit3.putString("admob_app_id", r3);
                edit3.apply();
            }
            if (!mo35184F().mo35425q().mo43554k()) {
                mo35184F().f8437g.mo35401b((String) null);
            }
            mo35186I().mo35224C(mo35184F().f8437g.mo35400a());
            C5943rc.m9843b();
            if (this.f8100g.mo34873B((String) null, C6084a3.f7587j0)) {
                try {
                    mo35191N().f7899a.f8094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo35184F().f8450t.mo35400a())) {
                        mo34920b().mo35080w().mo35037a("Remote config removed with active feature rollouts");
                        mo35184F().f8450t.mo35401b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo35180B().mo34812u()) || !TextUtils.isEmpty(mo35180B().mo34809r())) {
                boolean o = mo35204o();
                if (!mo35184F().mo35429u() && !this.f8100g.mo34876E()) {
                    mo35184F().mo35428t(!o);
                }
                if (o) {
                    mo35186I().mo35249h0();
                }
                mo35190M().f8204d.mo35283a();
                mo35189L().mo34825S(new AtomicReference());
                mo35189L().mo34838v(mo35184F().f8453w.mo35312a());
            }
        } else if (mo35204o()) {
            if (!mo35191N().mo35132R("android.permission.INTERNET")) {
                mo34920b().mo35075r().mo35037a("App is missing INTERNET permission");
            }
            if (!mo35191N().mo35132R("android.permission.ACCESS_NETWORK_STATE")) {
                mo34920b().mo35075r().mo35037a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C2207e.m1805a(this.f8094a).mo23531f() && !this.f8100g.mo34878G()) {
                if (!C6234n9.m10923X(this.f8094a)) {
                    mo34920b().mo35075r().mo35037a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C6234n9.m10924Y(this.f8094a, false)) {
                    mo34920b().mo35075r().mo35037a("AppMeasurementService not registered/enabled");
                }
            }
            mo34920b().mo35075r().mo35037a("Uploading is not possible. App measurement disabled");
        }
        mo35184F().f8444n.mo35300a(true);
    }

    @WorkerThread
    /* renamed from: n */
    public final boolean mo35203n() {
        if (this.f8087A == null || !this.f8087A.booleanValue()) {
            return false;
        }
        return true;
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo35204o() {
        if (mo35209x() == 0) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: p */
    public final boolean mo35205p() {
        mo34919a().mo34778h();
        return this.f8090D;
    }

    @Pure
    /* renamed from: q */
    public final boolean mo35206q() {
        return TextUtils.isEmpty(this.f8095b);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: r */
    public final boolean mo35207r() {
        boolean z;
        if (this.f8117x) {
            mo34919a().mo34778h();
            Boolean bool = this.f8118y;
            if (bool == null || this.f8119z == 0 || (!bool.booleanValue() && Math.abs(this.f8107n.mo33548b() - this.f8119z) > 1000)) {
                this.f8119z = this.f8107n.mo33548b();
                boolean z2 = true;
                if (!mo35191N().mo35132R("android.permission.INTERNET") || !mo35191N().mo35132R("android.permission.ACCESS_NETWORK_STATE") || (!C2207e.m1805a(this.f8094a).mo23531f() && !this.f8100g.mo34878G() && (!C6234n9.m10923X(this.f8094a) || !C6234n9.m10924Y(this.f8094a, false)))) {
                    z = false;
                } else {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f8118y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo35191N().mo35125K(mo35180B().mo34812u(), mo35180B().mo34809r(), mo35180B().mo34811t()) && TextUtils.isEmpty(mo35180B().mo34809r())) {
                        z2 = false;
                    }
                    this.f8118y = Boolean.valueOf(z2);
                }
            }
            return this.f8118y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    /* renamed from: s */
    public final boolean mo35208s() {
        return this.f8098e;
    }

    @WorkerThread
    /* renamed from: x */
    public final int mo35209x() {
        mo34919a().mo34778h();
        if (this.f8100g.mo34876E()) {
            return 1;
        }
        Boolean bool = this.f8089C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo34919a().mo34778h();
        if (!this.f8090D) {
            return 8;
        }
        Boolean r = mo35184F().mo35426r();
        if (r == null) {
            C6147g gVar = this.f8100g;
            C6092b bVar = gVar.f7899a.f8099f;
            Boolean t = gVar.mo34889t("firebase_analytics_collection_enabled");
            if (t == null) {
                Boolean bool2 = this.f8088B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (!this.f8100g.mo34873B((String) null, C6084a3.f7562U) || this.f8087A == null || this.f8087A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (t.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (r.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    @Pure
    /* renamed from: y */
    public final C6106c2 mo35210y() {
        C6106c2 c2Var = this.f8110q;
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final C6147g mo35211z() {
        return this.f8100g;
    }
}
