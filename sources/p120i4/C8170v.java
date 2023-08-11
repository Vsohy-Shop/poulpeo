package p120i4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import p036b5.C2888a;

/* renamed from: i4.v */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8170v extends C4810a implements C8172w {
    C8170v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    /* renamed from: e */
    public final C2888a mo42065e() {
        Parcel G = mo32607G(5, mo32606E());
        C2888a G2 = C2888a.C2889a.m2295G(G.readStrongBinder());
        G.recycle();
        return G2;
    }
}
