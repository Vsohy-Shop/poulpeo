package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5931r0 extends C5883o0 implements C5963t0 {
    C5931r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: r */
    public final Bundle mo34312r(Bundle bundle) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, bundle);
        Parcel G = mo34236G(1, E);
        Bundle bundle2 = (Bundle) C5915q0.m9775a(G, Bundle.CREATOR);
        G.recycle();
        return bundle2;
    }
}
