package p086f5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: f5.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class C7595a implements IInterface {

    /* renamed from: a */
    private final IBinder f10569a;

    /* renamed from: b */
    private final String f10570b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected C7595a(IBinder iBinder, String str) {
        this.f10569a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel mo41349E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10570b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final Parcel mo41350G(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f10569a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f10569a;
    }
}
