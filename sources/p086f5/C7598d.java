package p086f5;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: f5.d */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C7598d extends C7595a implements C7600f {
    C7598d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: n */
    public final boolean mo41352n(boolean z) {
        Parcel E = mo41349E();
        C7597c.m14955a(E, true);
        Parcel G = mo41350G(2, E);
        boolean b = C7597c.m14956b(G);
        G.recycle();
        return b;
    }

    /* renamed from: x */
    public final String mo41353x() {
        Parcel G = mo41350G(1, mo41349E());
        String readString = G.readString();
        G.recycle();
        return readString;
    }
}
