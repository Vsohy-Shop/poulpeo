package com.google.android.gms.internal.gtm;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.b3 */
final class C5275b3 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5636z2 f5863b;

    /* renamed from: c */
    private final /* synthetic */ long f5864c;

    /* renamed from: d */
    private final /* synthetic */ String f5865d;

    /* renamed from: e */
    private final /* synthetic */ String f5866e;

    /* renamed from: f */
    private final /* synthetic */ String f5867f;

    /* renamed from: g */
    private final /* synthetic */ Map f5868g;

    /* renamed from: h */
    private final /* synthetic */ String f5869h;

    /* renamed from: i */
    private final /* synthetic */ C5260a3 f5870i;

    C5275b3(C5260a3 a3Var, C5636z2 z2Var, long j, String str, String str2, String str3, Map map, String str4) {
        this.f5870i = a3Var;
        this.f5863b = z2Var;
        this.f5864c = j;
        this.f5865d = str;
        this.f5866e = str2;
        this.f5867f = str3;
        this.f5868g = map;
        this.f5869h = str4;
    }

    public final void run() {
        if (this.f5870i.f5806e == null) {
            C5321e4 n = C5321e4.m7887n();
            n.mo33187f(this.f5870i.f5807f, this.f5863b);
            C5290c3 unused = this.f5870i.f5806e = n.mo33189o();
        }
        this.f5870i.f5806e.mo33155a(this.f5864c, this.f5865d, this.f5866e, this.f5867f, this.f5868g, this.f5869h);
    }
}
