package p141k5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C8563a implements IInterface {

    /* renamed from: a */
    private final IBinder f12234a;

    /* renamed from: b */
    private final String f12235b;

    protected C8563a(IBinder iBinder, String str) {
        this.f12234a = iBinder;
        this.f12235b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo42625E(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f12234a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final Parcel mo42626G() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12235b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f12234a;
    }
}
