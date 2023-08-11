package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.cast.l */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5001l extends C4810a implements C5018m {
    C5001l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    /* renamed from: L */
    public final void mo32859L(String str, Bundle bundle) {
        Parcel E = mo32606E();
        E.writeString(str);
        C4917g0.m6986d(E, bundle);
        mo32608J(4, E);
    }

    /* renamed from: L0 */
    public final void mo32860L0(String str, String str2, Bundle bundle) {
        Parcel E = mo32606E();
        E.writeString(str);
        E.writeString(str2);
        C4917g0.m6986d(E, bundle);
        mo32608J(8, E);
    }

    /* renamed from: X0 */
    public final void mo32861X0(String str, Bundle bundle) {
        Parcel E = mo32606E();
        E.writeString(str);
        C4917g0.m6986d(E, bundle);
        mo32608J(2, E);
    }

    /* renamed from: Z2 */
    public final void mo32862Z2(String str, Bundle bundle, int i) {
        Parcel E = mo32606E();
        E.writeString(str);
        C4917g0.m6986d(E, bundle);
        E.writeInt(i);
        mo32608J(6, E);
    }

    /* renamed from: e */
    public final int mo32863e() {
        Parcel G = mo32607G(7, mo32606E());
        int readInt = G.readInt();
        G.recycle();
        return readInt;
    }

    /* renamed from: o1 */
    public final void mo32864o1(String str, Bundle bundle) {
        Parcel E = mo32606E();
        E.writeString(str);
        C4917g0.m6986d(E, bundle);
        mo32608J(1, E);
    }

    /* renamed from: t0 */
    public final void mo32865t0(String str, Bundle bundle) {
        Parcel E = mo32606E();
        E.writeString(str);
        C4917g0.m6986d(E, bundle);
        mo32608J(3, E);
    }
}
