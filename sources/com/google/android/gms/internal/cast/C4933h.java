package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import p036b5.C2888a;
import p120i4.C8119b;
import p120i4.C8120b0;
import p120i4.C8123c0;
import p120i4.C8136g1;
import p120i4.C8142i1;
import p120i4.C8145j1;
import p120i4.C8147k0;
import p120i4.C8151l1;
import p120i4.C8168u;
import p120i4.C8176y;
import p120i4.C8178z;
import p130j4.C8402h;
import p130j4.C8403i;
import p130j4.C8405k;

/* renamed from: com.google.android.gms.internal.cast.h */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4933h extends C4810a implements C4950i {
    C4933h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    /* renamed from: J0 */
    public final C8168u mo32817J0(C8119b bVar, C2888a aVar, C8136g1 g1Var) {
        Parcel E = mo32606E();
        C4917g0.m6986d(E, bVar);
        C4917g0.m6988f(E, aVar);
        C4917g0.m6988f(E, g1Var);
        Parcel G = mo32607G(3, E);
        C8168u G2 = C8151l1.m16103G(G.readStrongBinder());
        G.recycle();
        return G2;
    }

    /* renamed from: V2 */
    public final C8123c0 mo32818V2(String str, String str2, C8147k0 k0Var) {
        Parcel E = mo32606E();
        E.writeString(str);
        E.writeString(str2);
        C4917g0.m6988f(E, k0Var);
        Parcel G = mo32607G(2, E);
        C8123c0 G2 = C8120b0.m16015G(G.readStrongBinder());
        G.recycle();
        return G2;
    }

    /* renamed from: h2 */
    public final C8403i mo32819h2(C2888a aVar, C8405k kVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, aVar);
        C4917g0.m6988f(E, kVar);
        E.writeInt(i);
        E.writeInt(i2);
        C4917g0.m6985c(E, false);
        E.writeLong(2097152);
        E.writeInt(5);
        E.writeInt(333);
        E.writeInt(10000);
        Parcel G = mo32607G(6, E);
        C8403i G2 = C8402h.m16786G(G.readStrongBinder());
        G.recycle();
        return G2;
    }

    /* renamed from: p1 */
    public final C8178z mo32820p1(C2888a aVar, C2888a aVar2, C2888a aVar3) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, aVar);
        C4917g0.m6988f(E, aVar2);
        C4917g0.m6988f(E, aVar3);
        Parcel G = mo32607G(5, E);
        C8178z G2 = C8176y.m16179G(G.readStrongBinder());
        G.recycle();
        return G2;
    }

    /* renamed from: v1 */
    public final C8145j1 mo32821v1(C2888a aVar, C8119b bVar, C4984k kVar, Map map) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, aVar);
        C4917g0.m6986d(E, bVar);
        C4917g0.m6988f(E, kVar);
        E.writeMap(map);
        Parcel G = mo32607G(1, E);
        C8145j1 G2 = C8142i1.m16084G(G.readStrongBinder());
        G.recycle();
        return G2;
    }
}
