package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.md */
public final class C5451md extends C10810n<C5451md> {

    /* renamed from: a */
    private String f6132a;

    /* renamed from: b */
    private String f6133b;

    /* renamed from: c */
    private String f6134c;

    /* renamed from: d */
    private String f6135d;

    /* renamed from: e */
    public final void mo33364e(String str) {
        this.f6134c = str;
    }

    /* renamed from: f */
    public final void mo33365f(String str) {
        this.f6135d = str;
    }

    /* renamed from: g */
    public final void mo33366g(String str) {
        this.f6132a = str;
    }

    /* renamed from: h */
    public final void mo33367h(String str) {
        this.f6133b = str;
    }

    /* renamed from: i */
    public final void mo33104d(C5451md mdVar) {
        if (!TextUtils.isEmpty(this.f6132a)) {
            mdVar.f6132a = this.f6132a;
        }
        if (!TextUtils.isEmpty(this.f6133b)) {
            mdVar.f6133b = this.f6133b;
        }
        if (!TextUtils.isEmpty(this.f6134c)) {
            mdVar.f6134c = this.f6134c;
        }
        if (!TextUtils.isEmpty(this.f6135d)) {
            mdVar.f6135d = this.f6135d;
        }
    }

    /* renamed from: j */
    public final String mo33369j() {
        return this.f6132a;
    }

    /* renamed from: k */
    public final String mo33370k() {
        return this.f6133b;
    }

    /* renamed from: l */
    public final String mo33371l() {
        return this.f6134c;
    }

    /* renamed from: m */
    public final String mo33372m() {
        return this.f6135d;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f6132a);
        hashMap.put("appVersion", this.f6133b);
        hashMap.put("appId", this.f6134c);
        hashMap.put("appInstallerId", this.f6135d);
        return C10810n.m23055a(hashMap);
    }
}
