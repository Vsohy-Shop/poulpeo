package p005b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a */
/* compiled from: IResultReceiver */
public interface C1991a extends IInterface {

    /* renamed from: b.a$b */
    /* compiled from: IResultReceiver */
    public static class C1994b {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m1299c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m1300d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: Y2 */
    void mo23212Y2(int i, Bundle bundle);

    /* renamed from: b.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C1992a extends Binder implements C1991a {

        /* renamed from: b.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C1993a implements C1991a {

            /* renamed from: a */
            private IBinder f563a;

            C1993a(IBinder iBinder) {
                this.f563a = iBinder;
            }

            /* renamed from: Y2 */
            public void mo23212Y2(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    C1994b.m1300d(obtain, bundle, 0);
                    this.f563a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f563a;
            }
        }

        public C1992a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: E */
        public static C1991a m1295E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1991a)) {
                return new C1993a(iBinder);
            }
            return (C1991a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo23212Y2(parcel.readInt(), (Bundle) C1994b.m1299c(parcel, Bundle.CREATOR));
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
