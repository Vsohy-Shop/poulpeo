package p120i4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;
import p036b5.C2888a;

/* renamed from: i4.d0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8126d0 extends C4810a implements C8129e0 {
    C8126d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    /* renamed from: H1 */
    public final void mo42007H1(C8135g0 g0Var) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, g0Var);
        mo32608J(2, E);
    }

    /* renamed from: d */
    public final C2888a mo42008d() {
        Parcel G = mo32607G(7, mo32606E());
        C2888a G2 = C2888a.C2889a.m2295G(G.readStrongBinder());
        G.recycle();
        return G2;
    }

    /* renamed from: f */
    public final C2888a mo42009f() {
        Parcel G = mo32607G(1, mo32606E());
        C2888a G2 = C2888a.C2889a.m2295G(G.readStrongBinder());
        G.recycle();
        return G2;
    }

    /* renamed from: h0 */
    public final void mo42010h0(boolean z, boolean z2) {
        Parcel E = mo32606E();
        C4917g0.m6985c(E, true);
        C4917g0.m6985c(E, z2);
        mo32608J(6, E);
    }
}
