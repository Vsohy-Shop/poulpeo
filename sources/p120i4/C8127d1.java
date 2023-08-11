package p120i4;

import android.os.Parcel;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;
import p036b5.C2888a;

/* renamed from: i4.d1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8127d1 extends C5205x implements C8130e1 {
    public C8127d1() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C2888a zzb = zzb();
            parcel2.writeNoException();
            C4917g0.m6988f(parcel2, zzb);
        } else if (i == 2) {
            mo32717c();
            parcel2.writeNoException();
        } else if (i == 3) {
            mo32718x();
            parcel2.writeNoException();
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(C4785c.f5063a);
        }
        return true;
    }
}
