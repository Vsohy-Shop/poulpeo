package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.c */
public final class C5286c extends C10810n<C5286c> {

    /* renamed from: a */
    public String f5890a;

    /* renamed from: b */
    public String f5891b;

    /* renamed from: c */
    public String f5892c;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5286c cVar = (C5286c) nVar;
        if (!TextUtils.isEmpty(this.f5890a)) {
            cVar.f5890a = this.f5890a;
        }
        if (!TextUtils.isEmpty(this.f5891b)) {
            cVar.f5891b = this.f5891b;
        }
        if (!TextUtils.isEmpty(this.f5892c)) {
            cVar.f5892c = this.f5892c;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", this.f5890a);
        hashMap.put("action", this.f5891b);
        hashMap.put(TypedValues.AttributesType.S_TARGET, this.f5892c);
        return C10810n.m23055a(hashMap);
    }
}
