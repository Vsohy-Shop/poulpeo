package p120i4;

import android.os.Parcel;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;
import p036b5.C2888a;

/* renamed from: i4.h0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8138h0 extends C5205x implements C8141i0 {
    public C8138h0() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            C4917g0.m6984b(parcel);
            C2888a B = mo42030B(readString);
            parcel2.writeNoException();
            C4917g0.m6988f(parcel2, B);
        } else if (i == 2) {
            boolean c = mo42031c();
            parcel2.writeNoException();
            C4917g0.m6985c(parcel2, c);
        } else if (i == 3) {
            String x = mo42032x();
            parcel2.writeNoException();
            parcel2.writeString(x);
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(C4785c.f5063a);
        }
        return true;
    }
}
