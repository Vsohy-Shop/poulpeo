package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5870n3;

/* renamed from: com.google.android.gms.measurement.internal.z9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6366z9 extends C6355y9 {

    /* renamed from: g */
    private final C5870n3 f8464g;

    /* renamed from: h */
    final /* synthetic */ C6091aa f8465h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6366z9(C6091aa aaVar, String str, int i, C5870n3 n3Var) {
        super(str, i);
        this.f8465h = aaVar;
        this.f8464g = n3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo35409a() {
        return this.f8464g.mo34204w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo35410b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo35411c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35437k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.C5721e5 r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.C6055yc.m10320b()
            com.google.android.gms.measurement.internal.aa r0 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            java.lang.String r1 = r10.f8415a
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C6084a3.f7566Y
            boolean r0 = r0.mo34873B(r1, r2)
            com.google.android.gms.internal.measurement.n3 r1 = r10.f8464g
            boolean r1 = r1.mo34199D()
            com.google.android.gms.internal.measurement.n3 r2 = r10.f8464g
            boolean r2 = r2.mo34200E()
            com.google.android.gms.internal.measurement.n3 r3 = r10.f8464g
            boolean r3 = r3.mo34201F()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = r4
            goto L_0x0031
        L_0x0030:
            r1 = r5
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.aa r11 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r11 = r11.f7899a
            com.google.android.gms.measurement.internal.l3 r11 = r11.mo34920b()
            com.google.android.gms.measurement.internal.j3 r11 = r11.mo35079v()
            int r12 = r10.f8416b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.n3 r13 = r10.f8464g
            boolean r13 = r13.mo34202H()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.n3 r13 = r10.f8464g
            int r13 = r13.mo34204w()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo35039c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.n3 r6 = r10.f8464g
            com.google.android.gms.internal.measurement.g3 r6 = r6.mo34205x()
            boolean r7 = r6.mo34026D()
            boolean r8 = r13.mo33894O()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo34028F()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.aa r6 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35080w()
            com.google.android.gms.measurement.internal.aa r7 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r8 = r13.mo33891C()
            java.lang.String r7 = r7.mo34901f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.mo35038b(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.mo33898x()
            com.google.android.gms.internal.measurement.l3 r2 = r6.mo34031y()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11229h(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11231j(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.mo33893N()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.mo34028F()
            if (r8 != 0) goto L_0x00da
            com.google.android.gms.measurement.internal.aa r6 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35080w()
            com.google.android.gms.measurement.internal.aa r7 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r8 = r13.mo33891C()
            java.lang.String r7 = r7.mo34901f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.mo35038b(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.mo33897w()
            com.google.android.gms.internal.measurement.l3 r2 = r6.mo34031y()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11228g(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11231j(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.mo33896Q()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.mo34030I()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.mo34028F()
            if (r8 != 0) goto L_0x0121
            com.google.android.gms.measurement.internal.aa r6 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35080w()
            com.google.android.gms.measurement.internal.aa r7 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r8 = r13.mo33891C()
            java.lang.String r7 = r7.mo34901f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.mo35038b(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.mo33892D()
            boolean r8 = com.google.android.gms.measurement.internal.C6179i9.m10733P(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.mo33892D()
            com.google.android.gms.internal.measurement.l3 r6 = r6.mo34031y()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11230i(r2, r6)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11231j(r2, r7)
            goto L_0x019c
        L_0x013c:
            com.google.android.gms.measurement.internal.aa r6 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35080w()
            com.google.android.gms.measurement.internal.aa r7 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r8 = r13.mo33891C()
            java.lang.String r7 = r7.mo34901f(r8)
            java.lang.String r8 = r13.mo33892D()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo35039c(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.mo33892D()
            com.google.android.gms.internal.measurement.s3 r6 = r6.mo34032z()
            com.google.android.gms.measurement.internal.aa r8 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r8 = r8.f7899a
            com.google.android.gms.measurement.internal.l3 r8 = r8.mo34920b()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11227f(r2, r6, r8)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11231j(r2, r7)
            goto L_0x019c
        L_0x017b:
            com.google.android.gms.measurement.internal.aa r6 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35080w()
            com.google.android.gms.measurement.internal.aa r7 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r8 = r13.mo33891C()
            java.lang.String r7 = r7.mo34901f(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.mo35038b(r8, r7)
        L_0x019c:
            com.google.android.gms.measurement.internal.aa r6 = r10.f8465h
            com.google.android.gms.measurement.internal.p4 r6 = r6.f7899a
            com.google.android.gms.measurement.internal.l3 r6 = r6.mo34920b()
            com.google.android.gms.measurement.internal.j3 r6 = r6.mo35079v()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.mo35038b(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f8417c = r4
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            return r5
        L_0x01c4:
            if (r14 == 0) goto L_0x01ce
            com.google.android.gms.internal.measurement.n3 r14 = r10.f8464g
            boolean r14 = r14.mo34199D()
            if (r14 == 0) goto L_0x01d0
        L_0x01ce:
            r10.f8418d = r2
        L_0x01d0:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0215
            if (r1 == 0) goto L_0x0215
            boolean r14 = r13.mo33895P()
            if (r14 == 0) goto L_0x0215
            long r13 = r13.mo33899y()
            if (r11 == 0) goto L_0x01e8
            long r13 = r11.longValue()
        L_0x01e8:
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.n3 r11 = r10.f8464g
            boolean r11 = r11.mo34199D()
            if (r11 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.n3 r11 = r10.f8464g
            boolean r11 = r11.mo34200E()
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0200
            long r13 = r12.longValue()
        L_0x0200:
            com.google.android.gms.internal.measurement.n3 r11 = r10.f8464g
            boolean r11 = r11.mo34200E()
            if (r11 == 0) goto L_0x020f
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f8420f = r11
            goto L_0x0215
        L_0x020f:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f8419e = r11
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6366z9.mo35437k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.e5, boolean):boolean");
    }
}
