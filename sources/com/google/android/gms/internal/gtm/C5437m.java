package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;
import p286y4.C10671e;
import p286y4.C10674h;
import p296z3.C10797b;
import p296z3.C10812p;

/* renamed from: com.google.android.gms.internal.gtm.m */
public class C5437m {

    /* renamed from: p */
    private static volatile C5437m f6106p;

    /* renamed from: a */
    private final Context f6107a;

    /* renamed from: b */
    private final Context f6108b;

    /* renamed from: c */
    private final C10671e f6109c = C10674h.m22680c();

    /* renamed from: d */
    private final C5468o0 f6110d = new C5468o0(this);

    /* renamed from: e */
    private final C5348g1 f6111e;

    /* renamed from: f */
    private final C10812p f6112f;

    /* renamed from: g */
    private final C5331f f6113g;

    /* renamed from: h */
    private final C5546t0 f6114h;

    /* renamed from: i */
    private final C5517r1 f6115i;

    /* renamed from: j */
    private final C5409k1 f6116j;

    /* renamed from: k */
    private final C10797b f6117k;

    /* renamed from: l */
    private final C5332f0 f6118l;

    /* renamed from: m */
    private final C5316e f6119m;

    /* renamed from: n */
    private final C5619y f6120n;

    /* renamed from: o */
    private final C5531s0 f6121o;

    private C5437m(C5467o oVar) {
        Context a = oVar.mo33415a();
        C9713p.m20276k(a, "Application context can't be null");
        Context b = oVar.mo33416b();
        C9713p.m20275j(b);
        this.f6107a = a;
        this.f6108b = b;
        C5348g1 g1Var = new C5348g1(this);
        g1Var.mo33309O0();
        this.f6111e = g1Var;
        C5348g1 e = mo33330e();
        String str = C5422l.f6100a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        e.mo33268K0(sb.toString());
        C5409k1 k1Var = new C5409k1(this);
        k1Var.mo33309O0();
        this.f6116j = k1Var;
        C5517r1 r1Var = new C5517r1(this);
        r1Var.mo33309O0();
        this.f6115i = r1Var;
        C5331f fVar = new C5331f(this, oVar);
        C5332f0 f0Var = new C5332f0(this);
        C5316e eVar = new C5316e(this);
        C5619y yVar = new C5619y(this);
        C5531s0 s0Var = new C5531s0(this);
        C10812p k = C10812p.m23067k(a);
        k.mo45759e(new C5452n(this));
        this.f6112f = k;
        C10797b bVar = new C10797b(this);
        f0Var.mo33309O0();
        this.f6118l = f0Var;
        eVar.mo33309O0();
        this.f6119m = eVar;
        yVar.mo33309O0();
        this.f6120n = yVar;
        s0Var.mo33309O0();
        this.f6121o = s0Var;
        C5546t0 t0Var = new C5546t0(this);
        t0Var.mo33309O0();
        this.f6114h = t0Var;
        fVar.mo33309O0();
        this.f6113g = fVar;
        bVar.mo45719o();
        this.f6117k = bVar;
        fVar.mo33200S0();
    }

    /* renamed from: b */
    private static void m8149b(C5407k kVar) {
        C9713p.m20276k(kVar, "Analytics service not created/initialized");
        C9713p.m20267b(kVar.mo33308N0(), "Analytics service not initialized");
    }

    /* renamed from: c */
    public static C5437m m8150c(Context context) {
        C9713p.m20275j(context);
        if (f6106p == null) {
            synchronized (C5437m.class) {
                if (f6106p == null) {
                    C10671e c = C10674h.m22680c();
                    long b = c.mo33548b();
                    C5437m mVar = new C5437m(new C5467o(context));
                    f6106p = mVar;
                    C10797b.m22975p();
                    long b2 = c.mo33548b() - b;
                    long longValue = C5592w0.f6416Q.mo33605a().longValue();
                    if (b2 > longValue) {
                        mVar.mo33330e().mo33277c0("Slow initialization (ms)", Long.valueOf(b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f6106p;
    }

    /* renamed from: a */
    public final Context mo33328a() {
        return this.f6107a;
    }

    /* renamed from: d */
    public final C10671e mo33329d() {
        return this.f6109c;
    }

    /* renamed from: e */
    public final C5348g1 mo33330e() {
        m8149b(this.f6111e);
        return this.f6111e;
    }

    /* renamed from: f */
    public final C5468o0 mo33331f() {
        return this.f6110d;
    }

    /* renamed from: g */
    public final C10812p mo33332g() {
        C9713p.m20275j(this.f6112f);
        return this.f6112f;
    }

    /* renamed from: h */
    public final C5331f mo33333h() {
        m8149b(this.f6113g);
        return this.f6113g;
    }

    /* renamed from: i */
    public final C5546t0 mo33334i() {
        m8149b(this.f6114h);
        return this.f6114h;
    }

    /* renamed from: j */
    public final C5517r1 mo33335j() {
        m8149b(this.f6115i);
        return this.f6115i;
    }

    /* renamed from: k */
    public final C5409k1 mo33336k() {
        m8149b(this.f6116j);
        return this.f6116j;
    }

    /* renamed from: l */
    public final C5619y mo33337l() {
        m8149b(this.f6120n);
        return this.f6120n;
    }

    /* renamed from: m */
    public final C5531s0 mo33338m() {
        return this.f6121o;
    }

    /* renamed from: n */
    public final Context mo33339n() {
        return this.f6108b;
    }

    /* renamed from: o */
    public final C5348g1 mo33340o() {
        return this.f6111e;
    }

    /* renamed from: p */
    public final C10797b mo33341p() {
        C9713p.m20275j(this.f6117k);
        C9713p.m20267b(this.f6117k.mo45715k(), "Analytics instance not initialized");
        return this.f6117k;
    }

    /* renamed from: q */
    public final C5409k1 mo33342q() {
        C5409k1 k1Var = this.f6116j;
        if (k1Var == null || !k1Var.mo33308N0()) {
            return null;
        }
        return this.f6116j;
    }

    /* renamed from: r */
    public final C5316e mo33343r() {
        m8149b(this.f6119m);
        return this.f6119m;
    }

    /* renamed from: s */
    public final C5332f0 mo33344s() {
        m8149b(this.f6118l);
        return this.f6118l;
    }
}
