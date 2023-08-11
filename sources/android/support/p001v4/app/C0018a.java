package android.support.p001v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.a */
/* compiled from: INotificationSideChannel */
public interface C0018a extends IInterface {

    /* renamed from: android.support.v4.app.a$b */
    /* compiled from: INotificationSideChannel */
    public static class C0021b {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m5c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m6d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);

    /* renamed from: android.support.v4.app.a$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0019a extends Binder implements C0018a {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        /* renamed from: android.support.v4.app.a$a$a */
        /* compiled from: INotificationSideChannel */
        private static class C0020a implements C0018a {

            /* renamed from: a */
            private IBinder f11a;

            C0020a(IBinder iBinder) {
                this.f11a = iBinder;
            }

            public IBinder asBinder() {
                return this.f11a;
            }

            public void cancel(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f11a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f11a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void notify(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C0021b.m6d(obtain, notification, 0);
                    this.f11a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0019a() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        public static C0018a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0018a)) {
                return new C0020a(iBinder);
            }
            return (C0018a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            }
            if (i != 1598968902) {
                if (i == 1) {
                    notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) C0021b.m5c(parcel, Notification.CREATOR));
                } else if (i == 2) {
                    cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                } else if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    cancelAll(parcel.readString());
                }
                return true;
            }
            parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
