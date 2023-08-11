package p141k5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C8564b extends Binder implements IInterface {
    protected C8564b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo42628E(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo42628E(i, parcel, parcel2, i2);
    }

    public final IBinder asBinder() {
        return this;
    }
}
