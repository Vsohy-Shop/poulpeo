package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.j */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C4967j extends C5205x implements C4984k {
    public C4967j() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32147E(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            switch(r3) {
                case 1: goto L_0x00b7;
                case 2: goto L_0x00a1;
                case 3: goto L_0x008f;
                case 4: goto L_0x0075;
                case 5: goto L_0x0066;
                case 6: goto L_0x005e;
                case 7: goto L_0x0052;
                case 8: goto L_0x003f;
                case 9: goto L_0x0033;
                case 10: goto L_0x0028;
                case 11: goto L_0x0020;
                case 12: goto L_0x0014;
                case 13: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r3 = 0
            return r3
        L_0x0005:
            int r3 = r4.readInt()
            com.google.android.gms.internal.cast.C4917g0.m6984b(r4)
            r2.mo32621C(r3)
            r5.writeNoException()
            goto L_0x00e4
        L_0x0014:
            boolean r3 = r2.mo32619A()
            r5.writeNoException()
            com.google.android.gms.internal.cast.C4917g0.m6985c(r5, r3)
            goto L_0x00e4
        L_0x0020:
            r2.mo32632f()
            r5.writeNoException()
            goto L_0x00e4
        L_0x0028:
            r5.writeNoException()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r5.writeInt(r3)
            goto L_0x00e4
        L_0x0033:
            java.lang.String r3 = r2.mo32633x()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x00e4
        L_0x003f:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.cast.C4917g0.m6984b(r4)
            android.os.Bundle r3 = r2.mo32620B(r3)
            r5.writeNoException()
            com.google.android.gms.internal.cast.C4917g0.m6987e(r5, r3)
            goto L_0x00e4
        L_0x0052:
            boolean r3 = r2.mo32636z()
            r5.writeNoException()
            com.google.android.gms.internal.cast.C4917g0.m6985c(r5, r3)
            goto L_0x00e4
        L_0x005e:
            r2.mo32635y()
            r5.writeNoException()
            goto L_0x00e4
        L_0x0066:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.cast.C4917g0.m6984b(r4)
            r2.mo32626S2(r3)
            r5.writeNoException()
            goto L_0x00e4
        L_0x0075:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.cast.C4917g0.m6983a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            int r6 = r4.readInt()
            com.google.android.gms.internal.cast.C4917g0.m6984b(r4)
            boolean r3 = r2.mo32625R0(r3, r6)
            r5.writeNoException()
            com.google.android.gms.internal.cast.C4917g0.m6985c(r5, r3)
            goto L_0x00e4
        L_0x008f:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.cast.C4917g0.m6983a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.cast.C4917g0.m6984b(r4)
            r2.mo32622D(r3)
            r5.writeNoException()
            goto L_0x00e4
        L_0x00a1:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.cast.C4917g0.m6983a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            int r6 = r4.readInt()
            com.google.android.gms.internal.cast.C4917g0.m6984b(r4)
            r2.mo32634x1(r3, r6)
            r5.writeNoException()
            goto L_0x00e4
        L_0x00b7:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.cast.C4917g0.m6983a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.os.IBinder r6 = r4.readStrongBinder()
            if (r6 != 0) goto L_0x00c7
            r6 = 0
            goto L_0x00db
        L_0x00c7:
            java.lang.String r0 = "com.google.android.gms.cast.framework.internal.IMediaRouterCallback"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.cast.C5018m
            if (r1 == 0) goto L_0x00d5
            r6 = r0
            com.google.android.gms.internal.cast.m r6 = (com.google.android.gms.internal.cast.C5018m) r6
            goto L_0x00db
        L_0x00d5:
            com.google.android.gms.internal.cast.l r0 = new com.google.android.gms.internal.cast.l
            r0.<init>(r6)
            r6 = r0
        L_0x00db:
            com.google.android.gms.internal.cast.C4917g0.m6984b(r4)
            r2.mo32627Z(r3, r6)
            r5.writeNoException()
        L_0x00e4:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C4967j.mo32147E(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
