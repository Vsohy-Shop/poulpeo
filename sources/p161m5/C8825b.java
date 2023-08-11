package p161m5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: m5.b */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
public class C8825b extends Binder implements IInterface {
    protected C8825b(String str) {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo40831E(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo40831E(i, parcel, parcel2, i2);
    }

    public IBinder asBinder() {
        return this;
    }
}
