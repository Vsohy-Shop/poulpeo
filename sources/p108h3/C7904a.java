package p108h3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h3.a */
/* compiled from: BaseProxy */
public class C7904a implements IInterface {

    /* renamed from: a */
    private final IBinder f11057a;

    /* renamed from: b */
    private final String f11058b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C7904a(IBinder iBinder) {
        this.f11057a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo41638E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11058b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final Parcel mo41639G(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f11057a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f11057a;
    }
}
