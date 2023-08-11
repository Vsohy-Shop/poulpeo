package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.rd */
public final class C5529rd extends C10810n<C5529rd> {

    /* renamed from: a */
    private String f6288a;

    /* renamed from: b */
    public int f6289b;

    /* renamed from: c */
    public int f6290c;

    /* renamed from: d */
    public int f6291d;

    /* renamed from: e */
    public int f6292e;

    /* renamed from: f */
    public int f6293f;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5529rd rdVar = (C5529rd) nVar;
        int i = this.f6289b;
        if (i != 0) {
            rdVar.f6289b = i;
        }
        int i2 = this.f6290c;
        if (i2 != 0) {
            rdVar.f6290c = i2;
        }
        int i3 = this.f6291d;
        if (i3 != 0) {
            rdVar.f6291d = i3;
        }
        int i4 = this.f6292e;
        if (i4 != 0) {
            rdVar.f6292e = i4;
        }
        int i5 = this.f6293f;
        if (i5 != 0) {
            rdVar.f6293f = i5;
        }
        if (!TextUtils.isEmpty(this.f6288a)) {
            rdVar.f6288a = this.f6288a;
        }
    }

    /* renamed from: e */
    public final String mo33502e() {
        return this.f6288a;
    }

    /* renamed from: f */
    public final void mo33503f(String str) {
        this.f6288a = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f6288a);
        hashMap.put("screenColors", Integer.valueOf(this.f6289b));
        hashMap.put("screenWidth", Integer.valueOf(this.f6290c));
        hashMap.put("screenHeight", Integer.valueOf(this.f6291d));
        hashMap.put("viewportWidth", Integer.valueOf(this.f6292e));
        hashMap.put("viewportHeight", Integer.valueOf(this.f6293f));
        return C10810n.m23055a(hashMap);
    }
}
