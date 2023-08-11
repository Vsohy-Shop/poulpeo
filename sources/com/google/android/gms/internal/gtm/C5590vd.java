package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p231t4.C9713p;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.vd */
public final class C5590vd extends C10810n<C5590vd> {

    /* renamed from: a */
    private String f6391a;

    /* renamed from: b */
    private String f6392b;

    /* renamed from: c */
    private String f6393c;

    /* renamed from: d */
    private String f6394d;

    /* renamed from: e */
    private boolean f6395e;

    /* renamed from: f */
    private String f6396f;

    /* renamed from: g */
    private boolean f6397g;

    /* renamed from: h */
    private double f6398h;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5590vd vdVar = (C5590vd) nVar;
        if (!TextUtils.isEmpty(this.f6391a)) {
            vdVar.f6391a = this.f6391a;
        }
        if (!TextUtils.isEmpty(this.f6392b)) {
            vdVar.f6392b = this.f6392b;
        }
        if (!TextUtils.isEmpty(this.f6393c)) {
            vdVar.f6393c = this.f6393c;
        }
        if (!TextUtils.isEmpty(this.f6394d)) {
            vdVar.f6394d = this.f6394d;
        }
        boolean z = true;
        if (this.f6395e) {
            vdVar.f6395e = true;
        }
        if (!TextUtils.isEmpty(this.f6396f)) {
            vdVar.f6396f = this.f6396f;
        }
        boolean z2 = this.f6397g;
        if (z2) {
            vdVar.f6397g = z2;
        }
        double d = this.f6398h;
        if (d != 0.0d) {
            if (d < 0.0d || d > 100.0d) {
                z = false;
            }
            C9713p.m20267b(z, "Sample rate must be between 0% and 100%");
            vdVar.f6398h = d;
        }
    }

    /* renamed from: e */
    public final void mo33582e(String str) {
        this.f6392b = str;
    }

    /* renamed from: f */
    public final void mo33583f(String str) {
        this.f6393c = str;
    }

    /* renamed from: g */
    public final void mo33584g(boolean z) {
        this.f6395e = z;
    }

    /* renamed from: h */
    public final void mo33585h(boolean z) {
        this.f6397g = true;
    }

    /* renamed from: i */
    public final String mo33586i() {
        return this.f6391a;
    }

    /* renamed from: j */
    public final String mo33587j() {
        return this.f6392b;
    }

    /* renamed from: k */
    public final String mo33588k() {
        return this.f6393c;
    }

    /* renamed from: l */
    public final String mo33589l() {
        return this.f6394d;
    }

    /* renamed from: m */
    public final boolean mo33590m() {
        return this.f6395e;
    }

    /* renamed from: n */
    public final String mo33591n() {
        return this.f6396f;
    }

    /* renamed from: o */
    public final boolean mo33592o() {
        return this.f6397g;
    }

    /* renamed from: p */
    public final double mo33593p() {
        return this.f6398h;
    }

    /* renamed from: q */
    public final void mo33594q(String str) {
        this.f6391a = str;
    }

    /* renamed from: r */
    public final void mo33595r(String str) {
        this.f6394d = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f6391a);
        hashMap.put("clientId", this.f6392b);
        hashMap.put("userId", this.f6393c);
        hashMap.put("androidAdId", this.f6394d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f6395e));
        hashMap.put("sessionControl", this.f6396f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f6397g));
        hashMap.put("sampleRate", Double.valueOf(this.f6398h));
        return C10810n.m23055a(hashMap);
    }
}
