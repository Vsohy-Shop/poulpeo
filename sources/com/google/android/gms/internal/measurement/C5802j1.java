package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5802j1 extends C5883o0 implements C5836l1 {
    C5802j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: P */
    public final void mo34102P(String str, String str2, Bundle bundle, long j) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9778d(E, bundle);
        E.writeLong(j);
        mo34237J(1, E);
    }

    /* renamed from: c */
    public final int mo34103c() {
        Parcel G = mo34236G(2, mo34235E());
        int readInt = G.readInt();
        G.recycle();
        return readInt;
    }
}
