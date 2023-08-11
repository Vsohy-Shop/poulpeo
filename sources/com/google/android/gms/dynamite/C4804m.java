package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p036b5.C2888a;
import p141k5.C8563a;
import p141k5.C8565c;

/* renamed from: com.google.android.gms.dynamite.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C4804m extends C8563a {
    C4804m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: J */
    public final int mo32588J(C2888a aVar, String str, boolean z) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        C8565c.m17200b(G, z);
        Parcel E = mo42625E(3, G);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    /* renamed from: b3 */
    public final int mo32589b3(C2888a aVar, String str, boolean z) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        C8565c.m17200b(G, z);
        Parcel E = mo42625E(5, G);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    /* renamed from: c3 */
    public final C2888a mo32590c3(C2888a aVar, String str, int i) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        G.writeInt(i);
        Parcel E = mo42625E(2, G);
        C2888a G2 = C2888a.C2889a.m2295G(E.readStrongBinder());
        E.recycle();
        return G2;
    }

    /* renamed from: d3 */
    public final C2888a mo32591d3(C2888a aVar, String str, int i, C2888a aVar2) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        G.writeInt(i);
        C8565c.m17202d(G, aVar2);
        Parcel E = mo42625E(8, G);
        C2888a G2 = C2888a.C2889a.m2295G(E.readStrongBinder());
        E.recycle();
        return G2;
    }

    /* renamed from: e */
    public final int mo32592e() {
        Parcel E = mo42625E(6, mo42626G());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    /* renamed from: e3 */
    public final C2888a mo32593e3(C2888a aVar, String str, int i) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        G.writeInt(i);
        Parcel E = mo42625E(4, G);
        C2888a G2 = C2888a.C2889a.m2295G(E.readStrongBinder());
        E.recycle();
        return G2;
    }

    /* renamed from: f3 */
    public final C2888a mo32594f3(C2888a aVar, String str, boolean z, long j) {
        Parcel G = mo42626G();
        C8565c.m17202d(G, aVar);
        G.writeString(str);
        C8565c.m17200b(G, z);
        G.writeLong(j);
        Parcel E = mo42625E(7, G);
        C2888a G2 = C2888a.C2889a.m2295G(E.readStrongBinder());
        E.recycle();
        return G2;
    }
}
