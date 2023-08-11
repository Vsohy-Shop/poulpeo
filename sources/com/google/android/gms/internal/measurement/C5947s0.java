package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public abstract class C5947s0 extends C5899p0 implements C5963t0 {
    /* renamed from: G */
    public static C5963t0 m9846G(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C5963t0) {
            return (C5963t0) queryLocalInterface;
        }
        return new C5931r0(iBinder);
    }
}
