package p231t4;

import android.os.IBinder;
import android.os.Parcel;
import p036b5.C2888a;
import p141k5.C8563a;
import p141k5.C8565c;
import p180o4.C8990s;
import p180o4.C8993v;
import p180o4.C8995x;

/* renamed from: t4.u0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9729u0 extends C8563a implements C9736w0 {
    C9729u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: N0 */
    public final boolean mo44258N0(C8995x xVar, C2888a aVar) {
        Parcel G = mo42626G();
        C8565c.m17201c(G, xVar);
        C8565c.m17202d(G, aVar);
        Parcel E = mo42625E(5, G);
        boolean e = C8565c.m17203e(E);
        E.recycle();
        return e;
    }

    /* renamed from: d */
    public final boolean mo44259d() {
        Parcel E = mo42625E(7, mo42626G());
        boolean e = C8565c.m17203e(E);
        E.recycle();
        return e;
    }

    /* renamed from: d2 */
    public final C8993v mo44260d2(C8990s sVar) {
        Parcel G = mo42626G();
        C8565c.m17201c(G, sVar);
        Parcel E = mo42625E(6, G);
        C8993v vVar = (C8993v) C8565c.m17199a(E, C8993v.CREATOR);
        E.recycle();
        return vVar;
    }
}
