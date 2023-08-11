package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.ud */
public final class C5575ud extends C10810n<C5575ud> {

    /* renamed from: a */
    public String f6366a;

    /* renamed from: b */
    public boolean f6367b;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5575ud udVar = (C5575ud) nVar;
        if (!TextUtils.isEmpty(this.f6366a)) {
            udVar.f6366a = this.f6366a;
        }
        boolean z = this.f6367b;
        if (z) {
            udVar.f6367b = z;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.f6366a);
        hashMap.put("fatal", Boolean.valueOf(this.f6367b));
        return C10810n.m23055a(hashMap);
    }
}
