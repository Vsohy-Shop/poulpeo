package p150l4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;

/* renamed from: l4.l */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8695l extends C4810a {
    C8695l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    /* renamed from: c3 */
    public final void mo42801c3(C8687h hVar, String[] strArr) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, hVar);
        E.writeStringArray(strArr);
        mo32610b3(5, E);
    }

    /* renamed from: d3 */
    public final void mo42802d3(C8687h hVar, String[] strArr) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, hVar);
        E.writeStringArray(strArr);
        mo32610b3(7, E);
    }

    /* renamed from: e3 */
    public final void mo42803e3(C8687h hVar, String[] strArr) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, hVar);
        E.writeStringArray(strArr);
        mo32610b3(6, E);
    }
}
