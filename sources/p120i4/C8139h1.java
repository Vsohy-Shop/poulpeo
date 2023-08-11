package p120i4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;

/* renamed from: i4.h1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8139h1 extends C4810a implements C8145j1 {
    C8139h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p120i4.C8129e0 mo42027d() {
        /*
            r4 = this;
            r0 = 5
            android.os.Parcel r1 = r4.mo32606E()
            android.os.Parcel r0 = r4.mo32607G(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.ISessionManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p120i4.C8129e0
            if (r3 == 0) goto L_0x001f
            r1 = r2
            i4.e0 r1 = (p120i4.C8129e0) r1
            goto L_0x0025
        L_0x001f:
            i4.d0 r2 = new i4.d0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120i4.C8139h1.mo42027d():i4.e0");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p120i4.C8172w mo42028f() {
        /*
            r4 = this;
            r0 = 6
            android.os.Parcel r1 = r4.mo32606E()
            android.os.Parcel r0 = r4.mo32607G(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.IDiscoveryManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p120i4.C8172w
            if (r3 == 0) goto L_0x001f
            r1 = r2
            i4.w r1 = (p120i4.C8172w) r1
            goto L_0x0025
        L_0x001f:
            i4.v r2 = new i4.v
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120i4.C8139h1.mo42028f():i4.w");
    }

    /* renamed from: o2 */
    public final void mo42029o2(C8130e1 e1Var) {
        Parcel E = mo32606E();
        C4917g0.m6988f(E, e1Var);
        mo32608J(3, E);
    }
}
