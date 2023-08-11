package p120i4;

import android.os.Parcel;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;
import p109h4.C7928f;

/* renamed from: i4.f1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8133f1 extends C5205x implements C8136g1 {
    public C8133f1() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            C4917g0.m6984b(parcel);
            mo42023F(readString, readString2);
            parcel2.writeNoException();
        } else if (i == 2) {
            C4917g0.m6984b(parcel);
            mo42025L2(parcel.readString(), (C7928f) C4917g0.m6983a(parcel, C7928f.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            String readString3 = parcel.readString();
            C4917g0.m6984b(parcel);
            mo42026W0(readString3);
            parcel2.writeNoException();
        } else if (i == 4) {
            int readInt = parcel.readInt();
            C4917g0.m6984b(parcel);
            mo42024I0(readInt);
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(C4785c.f5063a);
        }
        return true;
    }
}
