package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.p0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public class C5899p0 extends Binder implements IInterface {
    protected C5899p0(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo33878E(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo33878E(i, parcel, parcel2, i2);
    }

    public IBinder asBinder() {
        return this;
    }
}
