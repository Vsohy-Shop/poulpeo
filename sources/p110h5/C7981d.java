package p110h5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h5.d */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C7981d implements IInterface {

    /* renamed from: a */
    private final IBinder f11218a;

    /* renamed from: b */
    private final String f11219b;

    protected C7981d(IBinder iBinder, String str) {
        this.f11218a = iBinder;
        this.f11219b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo41821E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11219b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo41822G(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11218a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f11218a;
    }
}
