package p130j4;

import android.os.Parcel;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;

/* renamed from: j4.j */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8404j extends C5205x implements C8405k {
    public C8404j() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            C4917g0.m6984b(parcel);
            mo42418E0(readLong, readLong2);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(C4785c.f5063a);
        }
        return true;
    }
}
