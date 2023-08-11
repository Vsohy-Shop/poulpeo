package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.gtm.i3 */
public abstract class C5381i3 extends C5512qb implements C5366h3 {
    public C5381i3() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    /* renamed from: G */
    public static C5366h3 m8034G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        if (queryLocalInterface instanceof C5366h3) {
            return (C5366h3) queryLocalInterface;
        }
        return new C5396j3(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33210E(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r11 = 1
            if (r8 == r11) goto L_0x0065
            r0 = 2
            if (r8 == r0) goto L_0x0039
            r0 = 3
            if (r8 == r0) goto L_0x0035
            r0 = 101(0x65, float:1.42E-43)
            if (r8 == r0) goto L_0x0017
            r9 = 102(0x66, float:1.43E-43)
            if (r8 == r9) goto L_0x0013
            r8 = 0
            return r8
        L_0x0013:
            r7.mo33131k()
            goto L_0x0074
        L_0x0017:
            java.lang.String r1 = r9.readString()
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.gtm.C5513qc.m8434b(r9, r8)
            r2 = r8
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = r9.readString()
            long r4 = r9.readLong()
            boolean r6 = com.google.android.gms.internal.gtm.C5513qc.m8437e(r9)
            r0 = r7
            r0.mo33127H2(r1, r2, r3, r4, r6)
            goto L_0x0074
        L_0x0035:
            r7.mo33128O()
            goto L_0x0074
        L_0x0039:
            java.lang.String r8 = r9.readString()
            java.lang.String r0 = r9.readString()
            java.lang.String r1 = r9.readString()
            android.os.IBinder r9 = r9.readStrongBinder()
            if (r9 != 0) goto L_0x004d
            r9 = 0
            goto L_0x0061
        L_0x004d:
            java.lang.String r2 = "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback"
            android.os.IInterface r2 = r9.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.gtm.C5320e3
            if (r3 == 0) goto L_0x005b
            r9 = r2
            com.google.android.gms.internal.gtm.e3 r9 = (com.google.android.gms.internal.gtm.C5320e3) r9
            goto L_0x0061
        L_0x005b:
            com.google.android.gms.internal.gtm.g3 r2 = new com.google.android.gms.internal.gtm.g3
            r2.<init>(r9)
            r9 = r2
        L_0x0061:
            r7.mo33129R2(r8, r0, r1, r9)
            goto L_0x0074
        L_0x0065:
            java.lang.String r8 = r9.readString()
            java.lang.String r0 = r9.readString()
            java.lang.String r9 = r9.readString()
            r7.mo33130Z1(r8, r0, r9)
        L_0x0074:
            r10.writeNoException()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5381i3.mo33210E(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
