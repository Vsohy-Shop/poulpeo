package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p036b5.C2888a;
import p141k5.C8563a;
import p141k5.C8565c;

/* renamed from: com.google.android.gms.dynamite.n */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C4805n extends C8563a {
    C4805n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: J */
    public final C2888a mo32595J(C2888a aVar, String str, int i, C2888a aVar2) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        G.writeInt(i);
        C8565c.m17202d(G, aVar2);
        Parcel E = mo42625E(2, G);
        C2888a G2 = C2888a.C2889a.m2295G(E.readStrongBinder());
        E.recycle();
        return G2;
    }

    /* renamed from: b3 */
    public final C2888a mo32596b3(C2888a aVar, String str, int i, C2888a aVar2) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        G.writeInt(i);
        C8565c.m17202d(G, aVar2);
        Parcel E = mo42625E(3, G);
        C2888a G2 = C2888a.C2889a.m2295G(E.readStrongBinder());
        E.recycle();
        return G2;
    }
}
