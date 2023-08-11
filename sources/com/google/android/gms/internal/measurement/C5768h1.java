package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public abstract class C5768h1 extends C5899p0 implements C5785i1 {
    public C5768h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo33878E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo33691r((Bundle) C5915q0.m9775a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
