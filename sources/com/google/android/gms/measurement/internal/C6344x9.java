package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5719e3;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6344x9 extends C6355y9 {

    /* renamed from: g */
    private final C5719e3 f8401g;

    /* renamed from: h */
    final /* synthetic */ C6091aa f8402h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6344x9(C6091aa aaVar, String str, int i, C5719e3 e3Var) {
        super(str, i);
        this.f8402h = aaVar;
        this.f8401g = e3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo35409a() {
        return this.f8401g.mo33890x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo35410b() {
        return this.f8401g.mo33886L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo35411c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fb  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35412k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C5822k4 r18, long r19, com.google.android.gms.measurement.internal.C6246p r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.C6055yc.m10320b()
            com.google.android.gms.measurement.internal.aa r1 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r1 = r1.f7899a
            com.google.android.gms.measurement.internal.g r1 = r1.mo35211z()
            java.lang.String r2 = r0.f8415a
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C6084a3.f7569a0
            boolean r1 = r1.mo34873B(r2, r3)
            com.google.android.gms.internal.measurement.e3 r2 = r0.f8401g
            boolean r2 = r2.mo33885K()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f8070e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.aa r4 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            java.lang.String r4 = r4.mo35072C()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.aa r4 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35079v()
            int r6 = r0.f8416b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.measurement.e3 r7 = r0.f8401g
            boolean r7 = r7.mo33887M()
            if (r7 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.e3 r7 = r0.f8401g
            int r7 = r7.mo33890x()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.aa r8 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r8 = r8.f7899a
            com.google.android.gms.measurement.internal.g3 r8 = r8.mo35182D()
            com.google.android.gms.internal.measurement.e3 r9 = r0.f8401g
            java.lang.String r9 = r9.mo33881D()
            java.lang.String r8 = r8.mo34899d(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo35040d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.aa r4 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35079v()
            com.google.android.gms.measurement.internal.aa r6 = r0.f8402h
            com.google.android.gms.measurement.internal.g9 r6 = r6.f8374b
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo34928f0()
            com.google.android.gms.internal.measurement.e3 r7 = r0.f8401g
            java.lang.String r6 = r6.mo34989F(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo35038b(r7, r6)
        L_0x0093:
            com.google.android.gms.internal.measurement.e3 r4 = r0.f8401g
            boolean r4 = r4.mo33887M()
            r6 = 0
            if (r4 == 0) goto L_0x043f
            com.google.android.gms.internal.measurement.e3 r4 = r0.f8401g
            int r4 = r4.mo33890x()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x043f
        L_0x00a8:
            com.google.android.gms.internal.measurement.e3 r4 = r0.f8401g
            boolean r4 = r4.mo33883I()
            com.google.android.gms.internal.measurement.e3 r7 = r0.f8401g
            boolean r7 = r7.mo33884J()
            com.google.android.gms.internal.measurement.e3 r8 = r0.f8401g
            boolean r8 = r8.mo33885K()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = r6
            goto L_0x00c5
        L_0x00c4:
            r4 = r9
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.aa r1 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r1 = r1.f7899a
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            int r2 = r0.f8416b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.e3 r3 = r0.f8401g
            boolean r3 = r3.mo33887M()
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.e3 r3 = r0.f8401g
            int r3 = r3.mo33890x()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo35039c(r3, r2, r5)
            return r9
        L_0x00f3:
            com.google.android.gms.internal.measurement.e3 r7 = r0.f8401g
            java.lang.String r8 = r18.mo34134E()
            boolean r10 = r7.mo33886L()
            if (r10 == 0) goto L_0x0115
            com.google.android.gms.internal.measurement.l3 r10 = r7.mo33880C()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C6355y9.m11229h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03e1
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo33882E()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            com.google.android.gms.internal.measurement.g3 r10 = (com.google.android.gms.internal.measurement.C5753g3) r10
            java.lang.String r11 = r10.mo34025B()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
            r2.mo35038b(r7, r3)
            goto L_0x03e1
        L_0x0157:
            java.lang.String r10 = r10.mo34025B()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.List r10 = r18.mo34135F()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.o4 r11 = (com.google.android.gms.internal.measurement.C5887o4) r11
            java.lang.String r12 = r11.mo34240D()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo34245U()
            if (r12 == 0) goto L_0x01a0
            java.lang.String r12 = r11.mo34240D()
            boolean r13 = r11.mo34245U()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo34251z()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x019c
        L_0x019b:
            r11 = r5
        L_0x019c:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01a0:
            boolean r12 = r11.mo34243S()
            if (r12 == 0) goto L_0x01be
            java.lang.String r12 = r11.mo34240D()
            boolean r13 = r11.mo34243S()
            if (r13 == 0) goto L_0x01b9
            double r13 = r11.mo34248w()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ba
        L_0x01b9:
            r11 = r5
        L_0x01ba:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01be:
            boolean r12 = r11.mo34247X()
            if (r12 == 0) goto L_0x01d0
            java.lang.String r12 = r11.mo34240D()
            java.lang.String r11 = r11.mo34241E()
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01d0:
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            com.google.android.gms.measurement.internal.aa r7 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r8 = r11.mo34240D()
            java.lang.String r7 = r7.mo34900e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            r2.mo35039c(r8, r3, r7)
            goto L_0x03e1
        L_0x01ff:
            java.util.List r2 = r7.mo33882E()
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03df
            java.lang.Object r7 = r2.next()
            com.google.android.gms.internal.measurement.g3 r7 = (com.google.android.gms.internal.measurement.C5753g3) r7
            boolean r10 = r7.mo34027E()
            if (r10 == 0) goto L_0x0221
            boolean r10 = r7.mo34026D()
            if (r10 == 0) goto L_0x0221
            r10 = r9
            goto L_0x0222
        L_0x0221:
            r10 = r6
        L_0x0222:
            java.lang.String r11 = r7.mo34025B()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x024b
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            java.lang.String r7 = "Event has empty param name. event"
            r2.mo35038b(r7, r3)
            goto L_0x03e1
        L_0x024b:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x02a0
            boolean r13 = r7.mo34028F()
            if (r13 != 0) goto L_0x0284
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            com.google.android.gms.measurement.internal.aa r7 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r7 = r7.mo34900e(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            r2.mo35039c(r8, r3, r7)
            goto L_0x03e1
        L_0x0284:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.l3 r7 = r7.mo34031y()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C6355y9.m11229h(r11, r7)
            if (r7 != 0) goto L_0x0296
            goto L_0x03e1
        L_0x0296:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02a0:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02f1
            boolean r13 = r7.mo34028F()
            if (r13 != 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            com.google.android.gms.measurement.internal.aa r7 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r7 = r7.mo34900e(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            r2.mo35039c(r8, r3, r7)
            goto L_0x03e1
        L_0x02d5:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.l3 r7 = r7.mo34031y()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C6355y9.m11228g(r11, r7)
            if (r7 != 0) goto L_0x02e7
            goto L_0x03e1
        L_0x02e7:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02f1:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0387
            boolean r13 = r7.mo34030I()
            if (r13 == 0) goto L_0x030e
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.s3 r7 = r7.mo34032z()
            com.google.android.gms.measurement.internal.aa r11 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r11 = r11.f7899a
            com.google.android.gms.measurement.internal.l3 r11 = r11.mo34920b()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C6355y9.m11227f(r12, r7, r11)
            goto L_0x0324
        L_0x030e:
            boolean r13 = r7.mo34028F()
            if (r13 == 0) goto L_0x035d
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C6179i9.m10733P(r12)
            if (r13 == 0) goto L_0x0332
            com.google.android.gms.internal.measurement.l3 r7 = r7.mo34031y()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C6355y9.m11230i(r12, r7)
        L_0x0324:
            if (r7 != 0) goto L_0x0328
            goto L_0x03e1
        L_0x0328:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0332:
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            com.google.android.gms.measurement.internal.aa r7 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r7 = r7.mo34900e(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            r2.mo35039c(r8, r3, r7)
            goto L_0x03e1
        L_0x035d:
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            com.google.android.gms.measurement.internal.aa r7 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r7 = r7.mo34900e(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            r2.mo35039c(r8, r3, r7)
            goto L_0x03e1
        L_0x0387:
            if (r12 != 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35079v()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            com.google.android.gms.measurement.internal.aa r5 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r5 = r5.f7899a
            com.google.android.gms.measurement.internal.g3 r5 = r5.mo35182D()
            java.lang.String r5 = r5.mo34900e(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo35039c(r7, r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x03b5:
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35080w()
            com.google.android.gms.measurement.internal.aa r3 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r3 = r3.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r8)
            com.google.android.gms.measurement.internal.aa r7 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r7 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r7 = r7.mo35182D()
            java.lang.String r7 = r7.mo34900e(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            r2.mo35039c(r8, r3, r7)
            goto L_0x03e1
        L_0x03df:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03e1:
            com.google.android.gms.measurement.internal.aa r2 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35079v()
            if (r5 != 0) goto L_0x03f2
            java.lang.String r3 = "null"
            goto L_0x03f3
        L_0x03f2:
            r3 = r5
        L_0x03f3:
            java.lang.String r7 = "Event filter result"
            r2.mo35038b(r7, r3)
            if (r5 != 0) goto L_0x03fb
            return r6
        L_0x03fb:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f8417c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x0406
            return r9
        L_0x0406:
            r0.f8418d = r2
            if (r4 == 0) goto L_0x043e
            boolean r2 = r18.mo34138S()
            if (r2 == 0) goto L_0x043e
            long r2 = r18.mo34142z()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.e3 r3 = r0.f8401g
            boolean r3 = r3.mo33884J()
            if (r3 == 0) goto L_0x0430
            if (r1 == 0) goto L_0x042d
            com.google.android.gms.internal.measurement.e3 r1 = r0.f8401g
            boolean r1 = r1.mo33886L()
            if (r1 != 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r2 = r16
        L_0x042d:
            r0.f8420f = r2
            goto L_0x043e
        L_0x0430:
            if (r1 == 0) goto L_0x043c
            com.google.android.gms.internal.measurement.e3 r1 = r0.f8401g
            boolean r1 = r1.mo33886L()
            if (r1 == 0) goto L_0x043c
            r2 = r17
        L_0x043c:
            r0.f8419e = r2
        L_0x043e:
            return r9
        L_0x043f:
            com.google.android.gms.measurement.internal.aa r1 = r0.f8402h
            com.google.android.gms.measurement.internal.p4 r1 = r1.f7899a
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35080w()
            java.lang.String r2 = r0.f8415a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r2)
            com.google.android.gms.internal.measurement.e3 r3 = r0.f8401g
            boolean r3 = r3.mo33887M()
            if (r3 == 0) goto L_0x0463
            com.google.android.gms.internal.measurement.e3 r3 = r0.f8401g
            int r3 = r3.mo33890x()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0463:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo35039c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6344x9.mo35412k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.k4, long, com.google.android.gms.measurement.internal.p, boolean):boolean");
    }
}
