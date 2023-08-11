package p120i4;

import android.os.Parcel;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;
import p036b5.C2888a;

/* renamed from: i4.f0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8132f0 extends C5205x implements C8135g0 {
    public C8132f0() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C2888a zzb = zzb();
                parcel2.writeNoException();
                C4917g0.m6988f(parcel2, zzb);
                return true;
            case 2:
                C2888a G = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                C4917g0.m6984b(parcel);
                mo42019m1(G);
                parcel2.writeNoException();
                return true;
            case 3:
                C2888a G2 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                String readString = parcel.readString();
                C4917g0.m6984b(parcel);
                mo42015M2(G2, readString);
                parcel2.writeNoException();
                return true;
            case 4:
                C2888a G3 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo42013G2(G3, readInt);
                parcel2.writeNoException();
                return true;
            case 5:
                C2888a G4 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                C4917g0.m6984b(parcel);
                mo42018i2(G4);
                parcel2.writeNoException();
                return true;
            case 6:
                C2888a G5 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo42016P0(G5, readInt2);
                parcel2.writeNoException();
                return true;
            case 7:
                C2888a G6 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                C4917g0.m6984b(parcel);
                mo42017b2(G6, readString2);
                parcel2.writeNoException();
                return true;
            case 8:
                C2888a G7 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                boolean g = C4917g0.m6989g(parcel);
                C4917g0.m6984b(parcel);
                mo42021x0(G7, g);
                parcel2.writeNoException();
                return true;
            case 9:
                C2888a G8 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo42014M(G8, readInt3);
                parcel2.writeNoException();
                return true;
            case 10:
                C2888a G9 = C2888a.C2889a.m2295G(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo42020q2(G9, readInt4);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(C4785c.f5063a);
                return true;
            default:
                return false;
        }
    }
}
