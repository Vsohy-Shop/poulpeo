package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.customtabs.trusted.b */
/* compiled from: ITrustedWebActivityService */
public interface C0015b extends IInterface {
    Bundle areNotificationsEnabled(Bundle bundle);

    void cancelNotification(Bundle bundle);

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder);

    Bundle getActiveNotifications();

    Bundle getSmallIconBitmap();

    int getSmallIconId();

    Bundle notifyNotificationWithChannel(Bundle bundle);

    /* renamed from: android.support.customtabs.trusted.b$a */
    /* compiled from: ITrustedWebActivityService */
    public static abstract class C0016a extends Binder implements C0015b {
        private static final String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityService";
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

        /* renamed from: android.support.customtabs.trusted.b$a$a */
        /* compiled from: ITrustedWebActivityService */
        private static class C0017a implements C0015b {

            /* renamed from: b */
            public static C0015b f9b;

            /* renamed from: a */
            private IBinder f10a;

            C0017a(IBinder iBinder) {
                this.f10a = iBinder;
            }

            public Bundle areNotificationsEnabled(Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0016a.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10a.transact(6, obtain, obtain2, 0) && C0016a.getDefaultImpl() != null) {
                        return C0016a.getDefaultImpl().areNotificationsEnabled(bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f10a;
            }

            public void cancelNotification(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0016a.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f10a.transact(3, obtain, obtain2, 0) || C0016a.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0016a.getDefaultImpl().cancelNotification(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0016a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f10a.transact(9, obtain, obtain2, 0) && C0016a.getDefaultImpl() != null) {
                        return C0016a.getDefaultImpl().extraCommand(str, bundle, iBinder);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getActiveNotifications() {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0016a.DESCRIPTOR);
                    if (!this.f10a.transact(5, obtain, obtain2, 0) && C0016a.getDefaultImpl() != null) {
                        return C0016a.getDefaultImpl().getActiveNotifications();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getSmallIconBitmap() {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0016a.DESCRIPTOR);
                    if (!this.f10a.transact(7, obtain, obtain2, 0) && C0016a.getDefaultImpl() != null) {
                        return C0016a.getDefaultImpl().getSmallIconBitmap();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getSmallIconId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0016a.DESCRIPTOR);
                    if (!this.f10a.transact(4, obtain, obtain2, 0) && C0016a.getDefaultImpl() != null) {
                        return C0016a.getDefaultImpl().getSmallIconId();
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

            public Bundle notifyNotificationWithChannel(Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0016a.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f10a.transact(2, obtain, obtain2, 0) && C0016a.getDefaultImpl() != null) {
                        return C0016a.getDefaultImpl().notifyNotificationWithChannel(bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0016a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C0015b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0015b)) {
                return new C0017a(iBinder);
            }
            return (C0015b) queryLocalInterface;
        }

        public static C0015b getDefaultImpl() {
            return C0017a.f9b;
        }

        public static boolean setDefaultImpl(C0015b bVar) {
            if (C0017a.f9b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                C0017a.f9b = bVar;
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            /*
                r5 = this;
                r0 = 9
                r1 = 0
                r2 = 0
                r3 = 1
                java.lang.String r4 = "android.support.customtabs.trusted.ITrustedWebActivityService"
                if (r6 == r0) goto L_0x00bb
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r6 == r0) goto L_0x00b7
                switch(r6) {
                    case 2: goto L_0x0091;
                    case 3: goto L_0x0078;
                    case 4: goto L_0x006a;
                    case 5: goto L_0x0053;
                    case 6: goto L_0x002d;
                    case 7: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r6 = super.onTransact(r6, r7, r8, r9)
                return r6
            L_0x0016:
                r7.enforceInterface(r4)
                android.os.Bundle r6 = r5.getSmallIconBitmap()
                r8.writeNoException()
                if (r6 == 0) goto L_0x0029
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x002c
            L_0x0029:
                r8.writeInt(r2)
            L_0x002c:
                return r3
            L_0x002d:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x003f
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x003f:
                android.os.Bundle r6 = r5.areNotificationsEnabled(r1)
                r8.writeNoException()
                if (r6 == 0) goto L_0x004f
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x0052
            L_0x004f:
                r8.writeInt(r2)
            L_0x0052:
                return r3
            L_0x0053:
                r7.enforceInterface(r4)
                android.os.Bundle r6 = r5.getActiveNotifications()
                r8.writeNoException()
                if (r6 == 0) goto L_0x0066
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x0069
            L_0x0066:
                r8.writeInt(r2)
            L_0x0069:
                return r3
            L_0x006a:
                r7.enforceInterface(r4)
                int r6 = r5.getSmallIconId()
                r8.writeNoException()
                r8.writeInt(r6)
                return r3
            L_0x0078:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x008a
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x008a:
                r5.cancelNotification(r1)
                r8.writeNoException()
                return r3
            L_0x0091:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x00a3
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00a3:
                android.os.Bundle r6 = r5.notifyNotificationWithChannel(r1)
                r8.writeNoException()
                if (r6 == 0) goto L_0x00b3
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x00b6
            L_0x00b3:
                r8.writeInt(r2)
            L_0x00b6:
                return r3
            L_0x00b7:
                r8.writeString(r4)
                return r3
            L_0x00bb:
                r7.enforceInterface(r4)
                java.lang.String r6 = r7.readString()
                int r9 = r7.readInt()
                if (r9 == 0) goto L_0x00d1
                android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r7)
                r1 = r9
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00d1:
                android.os.IBinder r7 = r7.readStrongBinder()
                android.os.Bundle r6 = r5.extraCommand(r6, r1, r7)
                r8.writeNoException()
                if (r6 == 0) goto L_0x00e5
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x00e8
            L_0x00e5:
                r8.writeInt(r2)
            L_0x00e8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.trusted.C0015b.C0016a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
