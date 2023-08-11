package p150l4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;
import p109h4.C7928f;
import p109h4.C7949l0;

/* renamed from: l4.i */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8689i extends C4810a {
    C8689i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    /* renamed from: c3 */
    public final void mo42785c3() {
        mo32610b3(17, mo32606E());
    }

    /* renamed from: d3 */
    public final void mo42786d3(String str, String str2, C7949l0 l0Var) {
        Parcel E = mo32606E();
        E.writeString(str);
        E.writeString(str2);
        C4917g0.m6986d(E, l0Var);
        mo32610b3(14, E);
    }

    /* renamed from: e3 */
    public final void mo42787e3(String str, C7928f fVar) {
        Parcel E = mo32606E();
        E.writeString(str);
        C4917g0.m6986d(E, fVar);
        mo32610b3(13, E);
    }

    /* renamed from: f */
    public final void mo42788f() {
        mo32610b3(1, mo32606E());
    }

    /* renamed from: f3 */
    public final void mo42789f3(C8693k kVar) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, kVar);
        mo32610b3(18, E);
    }

    /* renamed from: g3 */
    public final void mo42790g3(String str) {
        Parcel E = mo32606E();
        E.writeString(str);
        mo32610b3(11, E);
    }

    /* renamed from: h3 */
    public final void mo42791h3(String str, String str2, long j) {
        Parcel E = mo32606E();
        E.writeString(str);
        E.writeString(str2);
        E.writeLong(j);
        mo32610b3(9, E);
    }

    /* renamed from: i3 */
    public final void mo42792i3(String str) {
        Parcel E = mo32606E();
        E.writeString(str);
        mo32610b3(5, E);
    }

    /* renamed from: j */
    public final void mo42793j() {
        mo32610b3(19, mo32606E());
    }

    /* renamed from: j3 */
    public final void mo42794j3(String str) {
        Parcel E = mo32606E();
        E.writeString(str);
        mo32610b3(12, E);
    }
}
