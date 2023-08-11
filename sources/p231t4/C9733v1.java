package p231t4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p036b5.C2888a;
import p141k5.C8564b;
import p141k5.C8565c;

/* renamed from: t4.v1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C9733v1 extends C8564b implements C9737w1 {
    public C9733v1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: G */
    public static C9737w1 m20323G(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C9737w1) {
            return (C9737w1) queryLocalInterface;
        }
        return new C9730u1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo42628E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C2888a c = mo43159c();
            parcel2.writeNoException();
            C8565c.m17202d(parcel2, c);
        } else if (i != 2) {
            return false;
        } else {
            int x = mo43162x();
            parcel2.writeNoException();
            parcel2.writeInt(x);
        }
        return true;
    }
}
