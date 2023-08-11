package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.y3 */
final class C5623y3 implements C5281b9 {

    /* renamed from: a */
    private final /* synthetic */ C5580v3 f6737a;

    private C5623y3(C5580v3 v3Var) {
        this.f6737a = v3Var;
    }

    /* renamed from: a */
    public final Object mo33132a(String str, Map<String, Object> map) {
        String str2;
        try {
            return this.f6737a.f6378e.mo35449i1(str, map);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Error calling customEvaluator proxy:".concat(valueOf);
            } else {
                str2 = new String("Error calling customEvaluator proxy:");
            }
            C5426l3.m8135e(str2);
            return null;
        }
    }

    /* synthetic */ C5623y3(C5580v3 v3Var, C5595w3 w3Var) {
        this(v3Var);
    }
}
