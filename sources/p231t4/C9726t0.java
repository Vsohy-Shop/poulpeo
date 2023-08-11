package p231t4;

import android.os.IBinder;
import android.os.Parcel;
import androidx.annotation.Nullable;

/* renamed from: t4.t0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C9726t0 implements C9699l {

    /* renamed from: a */
    private final IBinder f14543a;

    C9726t0(IBinder iBinder) {
        this.f14543a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f14543a;
    }

    /* renamed from: m2 */
    public final void mo44207m2(C9696k kVar, @Nullable C9680f fVar) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (kVar != null) {
                iBinder = kVar.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (fVar != null) {
                obtain.writeInt(1);
                C9698k1.m20241a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f14543a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
