package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.customtabs.trusted.a */
/* compiled from: ITrustedWebActivityCallback */
public interface C0012a extends IInterface {
    void onExtraCallback(String str, Bundle bundle);

    /* renamed from: android.support.customtabs.trusted.a$a */
    /* compiled from: ITrustedWebActivityCallback */
    public static abstract class C0013a extends Binder implements C0012a {
        private static final String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityCallback";
        static final int TRANSACTION_onExtraCallback = 2;

        /* renamed from: android.support.customtabs.trusted.a$a$a */
        /* compiled from: ITrustedWebActivityCallback */
        private static class C0014a implements C0012a {

            /* renamed from: b */
            public static C0012a f7b;

            /* renamed from: a */
            private IBinder f8a;

            C0014a(IBinder iBinder) {
                this.f8a = iBinder;
            }

            public IBinder asBinder() {
                return this.f8a;
            }

            public void onExtraCallback(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0013a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f8a.transact(2, obtain, obtain2, 0) || C0013a.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0013a.getDefaultImpl().onExtraCallback(str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0013a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C0012a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0012a)) {
                return new C0014a(iBinder);
            }
            return (C0012a) queryLocalInterface;
        }

        public static C0012a getDefaultImpl() {
            return C0014a.f7b;
        }

        public static boolean setDefaultImpl(C0012a aVar) {
            if (C0014a.f7b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0014a.f7b = aVar;
                return true;
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                onExtraCallback(readString, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
