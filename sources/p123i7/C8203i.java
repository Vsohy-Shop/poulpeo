package p123i7;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i7.i */
/* compiled from: IDynamicLinksService */
public interface C8203i extends IInterface {

    /* renamed from: i7.i$a */
    /* compiled from: IDynamicLinksService */
    public static abstract class C8204a extends Binder implements C8203i {

        /* renamed from: i7.i$a$a */
        /* compiled from: IDynamicLinksService */
        private static class C8205a implements C8203i {

            /* renamed from: a */
            private IBinder f11529a;

            C8205a(IBinder iBinder) {
                this.f11529a = iBinder;
            }

            /* renamed from: C0 */
            public void mo42107C0(C8201h hVar, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    if (hVar != null) {
                        iBinder = hVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f11529a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O2 */
            public void mo42108O2(C8201h hVar, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    if (hVar != null) {
                        iBinder = hVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f11529a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f11529a;
            }
        }

        /* renamed from: E */
        public static C8203i m16244E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C8203i)) {
                return new C8205a(iBinder);
            }
            return (C8203i) queryLocalInterface;
        }
    }

    /* renamed from: C0 */
    void mo42107C0(C8201h hVar, String str);

    /* renamed from: O2 */
    void mo42108O2(C8201h hVar, Bundle bundle);
}
