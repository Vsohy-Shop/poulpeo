package p120i4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;
import p036b5.C2888a;

/* renamed from: i4.a0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8117a0 extends C4810a implements C8123c0 {
    C8117a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    /* renamed from: C */
    public final void mo41975C(int i) {
        Parcel E = mo32606E();
        E.writeInt(i);
        mo32608J(15, E);
    }

    /* renamed from: K */
    public final boolean mo41976K() {
        Parcel G = mo32607G(9, mo32606E());
        boolean g = C4917g0.m6989g(G);
        G.recycle();
        return g;
    }

    /* renamed from: d */
    public final C2888a mo41977d() {
        Parcel G = mo32607G(1, mo32606E());
        C2888a G2 = C2888a.C2889a.m2295G(G.readStrongBinder());
        G.recycle();
        return G2;
    }

    /* renamed from: e */
    public final int mo41978e() {
        Parcel G = mo32607G(17, mo32606E());
        int readInt = G.readInt();
        G.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final int mo41979f() {
        Parcel G = mo32607G(18, mo32606E());
        int readInt = G.readInt();
        G.recycle();
        return readInt;
    }

    /* renamed from: h */
    public final boolean mo41980h() {
        Parcel G = mo32607G(5, mo32606E());
        boolean g = C4917g0.m6989g(G);
        G.recycle();
        return g;
    }

    /* renamed from: q */
    public final void mo41981q(int i) {
        Parcel E = mo32606E();
        E.writeInt(i);
        mo32608J(12, E);
    }

    /* renamed from: u1 */
    public final void mo41982u1(int i) {
        Parcel E = mo32606E();
        E.writeInt(i);
        mo32608J(13, E);
    }
}
