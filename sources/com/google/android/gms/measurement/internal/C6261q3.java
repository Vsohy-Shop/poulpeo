package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6261q3 extends C6343x8 {
    public C6261q3(C6157g9 g9Var) {
        super(g9Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo34749l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo35219m() {
        mo35406i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f7899a.mo34927f().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
