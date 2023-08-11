package p034b3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b3.a */
/* compiled from: IReceiverService */
public interface C2877a extends IInterface {

    /* renamed from: b3.a$a */
    /* compiled from: IReceiverService */
    public static abstract class C2878a extends Binder implements C2877a {

        /* renamed from: b3.a$a$a */
        /* compiled from: IReceiverService */
        private static class C2879a implements C2877a {

            /* renamed from: b */
            public static C2877a f1274b;

            /* renamed from: a */
            private IBinder f1275a;

            C2879a(IBinder iBinder) {
                this.f1275a = iBinder;
            }

            public IBinder asBinder() {
                return this.f1275a;
            }

            /* renamed from: g0 */
            public int mo28409g0(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f1275a.transact(1, obtain, obtain2, 0) && C2878a.m2284G() != null) {
                        return C2878a.m2284G().mo28409g0(bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: E */
        public static C2877a m2283E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C2877a)) {
                return new C2879a(iBinder);
            }
            return (C2877a) queryLocalInterface;
        }

        /* renamed from: G */
        public static C2877a m2284G() {
            return C2879a.f1274b;
        }
    }

    /* renamed from: g0 */
    int mo28409g0(Bundle bundle);
}
