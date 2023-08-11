package p231t4;

import android.os.IBinder;
import android.os.Parcel;
import p036b5.C2888a;
import p141k5.C8563a;

/* renamed from: t4.u1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9730u1 extends C8563a implements C9737w1 {
    C9730u1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: c */
    public final C2888a mo43159c() {
        Parcel E = mo42625E(1, mo42626G());
        C2888a G = C2888a.C2889a.m2295G(E.readStrongBinder());
        E.recycle();
        return G;
    }

    /* renamed from: x */
    public final int mo43162x() {
        Parcel E = mo42625E(2, mo42626G());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }
}
