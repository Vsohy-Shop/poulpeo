package p037b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b6.g0 */
public class C2905g0 implements IInterface {

    /* renamed from: a */
    private final IBinder f1306a;

    /* renamed from: b */
    private final String f1307b;

    protected C2905g0(IBinder iBinder, String str) {
        this.f1306a = iBinder;
        this.f1307b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo28430E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1307b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo28431G(int i, Parcel parcel) {
        try {
            this.f1306a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1306a;
    }
}
