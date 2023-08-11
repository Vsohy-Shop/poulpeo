package p110h5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h5.c */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C7980c extends Binder implements IInterface {
    protected C7980c(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo41344E(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo41344E(i, parcel, parcel2, i2);
    }

    public IBinder asBinder() {
        return this;
    }
}
