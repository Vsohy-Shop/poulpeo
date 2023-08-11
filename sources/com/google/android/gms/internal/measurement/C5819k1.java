package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.k1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public abstract class C5819k1 extends C5899p0 implements C5836l1 {
    public C5819k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo33878E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo34102P(parcel.readString(), parcel.readString(), (Bundle) C5915q0.m9775a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int c = mo34103c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
