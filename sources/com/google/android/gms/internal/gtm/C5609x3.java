package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.x3 */
final class C5609x3 implements C5281b9 {

    /* renamed from: a */
    private final /* synthetic */ C5580v3 f6723a;

    private C5609x3(C5580v3 v3Var) {
        this.f6723a = v3Var;
    }

    /* renamed from: a */
    public final Object mo33132a(String str, Map<String, Object> map) {
        String str2;
        try {
            this.f6723a.f6378e.mo35448O0(str, map);
            return null;
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

    /* synthetic */ C5609x3(C5580v3 v3Var, C5595w3 w3Var) {
        this(v3Var);
    }
}
