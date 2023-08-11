package p037b6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b6.h0 */
public class C2907h0 extends Binder implements IInterface {
    protected C2907h0(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo28419E(int i, Parcel parcel) {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo28419E(i, parcel);
    }

    public final IBinder asBinder() {
        return this;
    }
}
