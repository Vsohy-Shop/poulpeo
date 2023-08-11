package p254v5;

import com.google.android.gms.internal.gtm.C5512qb;

/* renamed from: v5.m */
public abstract class C9952m extends C5512qb implements C9951l {
    public C9952m() {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [v5.i] */
    /* JADX WARNING: type inference failed for: r0v6, types: [v5.f] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33210E(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r10 = 2
            if (r7 == r10) goto L_0x005f
            r10 = 11
            if (r7 == r10) goto L_0x0054
            r10 = 21
            r0 = 0
            if (r7 == r10) goto L_0x0033
            r10 = 22
            if (r7 == r10) goto L_0x0012
            r7 = 0
            return r7
        L_0x0012:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 != 0) goto L_0x0019
            goto L_0x002c
        L_0x0019:
            java.lang.String r8 = "com.google.android.gms.tagmanager.IMeasurementEventListener"
            android.os.IInterface r8 = r7.queryLocalInterface(r8)
            boolean r10 = r8 instanceof p254v5.C9945f
            if (r10 == 0) goto L_0x0027
            r0 = r8
            v5.f r0 = (p254v5.C9945f) r0
            goto L_0x002c
        L_0x0027:
            v5.h r0 = new v5.h
            r0.<init>(r7)
        L_0x002c:
            r6.mo35446t1(r0)
            r9.writeNoException()
            goto L_0x007b
        L_0x0033:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r8 = "com.google.android.gms.tagmanager.IMeasurementInterceptor"
            android.os.IInterface r8 = r7.queryLocalInterface(r8)
            boolean r10 = r8 instanceof p254v5.C9948i
            if (r10 == 0) goto L_0x0048
            r0 = r8
            v5.i r0 = (p254v5.C9948i) r0
            goto L_0x004d
        L_0x0048:
            v5.k r0 = new v5.k
            r0.<init>(r7)
        L_0x004d:
            r6.mo35444E2(r0)
            r9.writeNoException()
            goto L_0x007b
        L_0x0054:
            java.util.Map r7 = r6.mo35445S1()
            r9.writeNoException()
            r9.writeMap(r7)
            goto L_0x007b
        L_0x005f:
            java.lang.String r1 = r8.readString()
            java.lang.String r2 = r8.readString()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.gtm.C5513qc.m8434b(r8, r7)
            r3 = r7
            android.os.Bundle r3 = (android.os.Bundle) r3
            long r4 = r8.readLong()
            r0 = r6
            r0.mo35447z0(r1, r2, r3, r4)
            r9.writeNoException()
        L_0x007b:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p254v5.C9952m.mo33210E(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
