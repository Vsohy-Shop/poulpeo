package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.td */
public final class C5560td extends C10810n<C5560td> {

    /* renamed from: a */
    private String f6344a;

    /* renamed from: b */
    private String f6345b;

    /* renamed from: c */
    private String f6346c;

    /* renamed from: d */
    private long f6347d;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5560td tdVar = (C5560td) nVar;
        if (!TextUtils.isEmpty(this.f6344a)) {
            tdVar.f6344a = this.f6344a;
        }
        if (!TextUtils.isEmpty(this.f6345b)) {
            tdVar.f6345b = this.f6345b;
        }
        if (!TextUtils.isEmpty(this.f6346c)) {
            tdVar.f6346c = this.f6346c;
        }
        long j = this.f6347d;
        if (j != 0) {
            tdVar.f6347d = j;
        }
    }

    /* renamed from: e */
    public final String mo33541e() {
        return this.f6345b;
    }

    /* renamed from: f */
    public final String mo33542f() {
        return this.f6346c;
    }

    /* renamed from: g */
    public final long mo33543g() {
        return this.f6347d;
    }

    /* renamed from: h */
    public final String mo33544h() {
        return this.f6344a;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", this.f6344a);
        hashMap.put("action", this.f6345b);
        hashMap.put("label", this.f6346c);
        hashMap.put("value", Long.valueOf(this.f6347d));
        return C10810n.m23055a(hashMap);
    }
}
