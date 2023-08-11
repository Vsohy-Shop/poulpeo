package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.d */
public final class C5301d extends C10810n<C5301d> {

    /* renamed from: a */
    public String f5914a;

    /* renamed from: b */
    public long f5915b;

    /* renamed from: c */
    public String f5916c;

    /* renamed from: d */
    public String f5917d;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5301d dVar = (C5301d) nVar;
        if (!TextUtils.isEmpty(this.f5914a)) {
            dVar.f5914a = this.f5914a;
        }
        long j = this.f5915b;
        if (j != 0) {
            dVar.f5915b = j;
        }
        if (!TextUtils.isEmpty(this.f5916c)) {
            dVar.f5916c = this.f5916c;
        }
        if (!TextUtils.isEmpty(this.f5917d)) {
            dVar.f5917d = this.f5917d;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.f5914a);
        hashMap.put("timeInMillis", Long.valueOf(this.f5915b));
        hashMap.put("category", this.f5916c);
        hashMap.put("label", this.f5917d);
        return C10810n.m23055a(hashMap);
    }
}
