package p121i5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i5.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C8181b extends Binder implements IInterface {
    protected C8181b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public boolean mo42075b3(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo42075b3(i, parcel, parcel2, i2);
    }

    public final IBinder asBinder() {
        return this;
    }
}
