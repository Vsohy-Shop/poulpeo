package p121i5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i5.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C8180a implements IInterface {

    /* renamed from: a */
    private final IBinder f11502a;

    /* renamed from: b */
    private final String f11503b;

    protected C8180a(IBinder iBinder, String str) {
        this.f11502a = iBinder;
        this.f11503b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo42070E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11503b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo42071G(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11502a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo42072J(int i, Parcel parcel) {
        try {
            this.f11502a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f11502a;
    }
}
