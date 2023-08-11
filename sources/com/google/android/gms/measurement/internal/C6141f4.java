package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final /* synthetic */ class C6141f4 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C6185j4 f7763b;

    /* renamed from: c */
    public final /* synthetic */ String f7764c;

    public /* synthetic */ C6141f4(C6185j4 j4Var, String str) {
        this.f7763b = j4Var;
        this.f7764c = str;
    }

    public final Object call() {
        C6185j4 j4Var = this.f7763b;
        String str = this.f7764c;
        C6306u4 T = j4Var.f8374b.mo34914V().mo35007T(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", SystemMediaRouteProvider.PACKAGE_NAME);
        hashMap.put("package_name", str);
        j4Var.f7899a.mo35211z().mo34886q();
        hashMap.put("gmp_version", 46000L);
        if (T != null) {
            String h0 = T.mo35355h0();
            if (h0 != null) {
                hashMap.put("app_version", h0);
            }
            hashMap.put("app_version_int", Long.valueOf(T.mo35326M()));
            hashMap.put("dynamite_version", Long.valueOf(T.mo35335V()));
        }
        return hashMap;
    }
}
