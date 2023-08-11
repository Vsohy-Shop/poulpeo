package p120i4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;
import p109h4.C7910b;

/* renamed from: i4.k1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8148k1 extends C4810a implements C8168u {
    C8148k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    /* renamed from: C */
    public final void mo42041C(int i) {
        Parcel E = mo32606E();
        E.writeInt(i);
        mo32608J(2, E);
    }

    /* renamed from: H */
    public final void mo42042H(Bundle bundle) {
        Parcel E = mo32606E();
        C4917g0.m6986d(E, (Parcelable) null);
        mo32608J(1, E);
    }

    /* renamed from: K1 */
    public final void mo42043K1(ConnectionResult connectionResult) {
        Parcel E = mo32606E();
        C4917g0.m6986d(E, connectionResult);
        mo32608J(3, E);
    }

    /* renamed from: Q2 */
    public final void mo42044Q2(boolean z, int i) {
        Parcel E = mo32606E();
        C4917g0.m6985c(E, z);
        E.writeInt(0);
        mo32608J(6, E);
    }

    /* renamed from: T */
    public final void mo42045T(C7910b bVar, String str, String str2, boolean z) {
        Parcel E = mo32606E();
        C4917g0.m6986d(E, bVar);
        E.writeString(str);
        E.writeString(str2);
        C4917g0.m6985c(E, z);
        mo32608J(4, E);
    }

    /* renamed from: a */
    public final void mo42046a(int i) {
        Parcel E = mo32606E();
        E.writeInt(i);
        mo32608J(5, E);
    }
}
