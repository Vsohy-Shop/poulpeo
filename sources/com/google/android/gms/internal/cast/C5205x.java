package com.google.android.gms.internal.cast;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.cast.x */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C5205x extends Binder implements IInterface {
    protected C5205x(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo32147E(i, parcel, parcel2, i2);
    }

    public final IBinder asBinder() {
        return this;
    }
}
