package p120i4;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;
import p036b5.C2888a;

/* renamed from: i4.j0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8144j0 extends C5205x implements C8147k0 {
    public C8144j0() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C2888a x = mo42039x();
                parcel2.writeNoException();
                C4917g0.m6988f(parcel2, x);
                return true;
            case 2:
                C4917g0.m6984b(parcel);
                mo42034H((Bundle) C4917g0.m6983a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                C4917g0.m6984b(parcel);
                mo42033D((Bundle) C4917g0.m6983a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean g = C4917g0.m6989g(parcel);
                C4917g0.m6984b(parcel);
                mo42037c0(g);
                parcel2.writeNoException();
                return true;
            case 5:
                long zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeLong(zzb);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(C4785c.f5063a);
                return true;
            case 7:
                C4917g0.m6984b(parcel);
                mo42038u0((Bundle) C4917g0.m6983a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                C4917g0.m6984b(parcel);
                mo42036Y0((Bundle) C4917g0.m6983a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                C4917g0.m6984b(parcel);
                mo42035U2((Bundle) C4917g0.m6983a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
