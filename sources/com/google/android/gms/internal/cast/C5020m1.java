package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.m1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5020m1 extends C4848c1 {

    /* renamed from: h */
    static final C4848c1 f5355h = new C5020m1((Object) null, new Object[0], 0);

    /* renamed from: e */
    private final transient Object f5356e;

    /* renamed from: f */
    final transient Object[] f5357f;

    /* renamed from: g */
    private final transient int f5358g;

    private C5020m1(Object obj, Object[] objArr, int i) {
        this.f5356e = obj;
        this.f5357f = objArr;
        this.f5358g = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r5v5 ?, r5v12 ?, r5v8 ?, r5v13 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: i */
    static com.google.android.gms.internal.cast.C5020m1 m7181i(int r17, java.lang.Object[] r18, com.google.android.gms.internal.cast.C4830b1 r19) {
        /*
            r0 = r17
            r1 = r18
            if (r0 != 0) goto L_0x000b
            com.google.android.gms.internal.cast.c1 r0 = f5355h
            com.google.android.gms.internal.cast.m1 r0 = (com.google.android.gms.internal.cast.C5020m1) r0
            return r0
        L_0x000b:
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0023
            r0 = r1[r3]
            r0.getClass()
            r3 = r1[r4]
            r3.getClass()
            com.google.android.gms.internal.cast.C5104r0.m7429a(r0, r3)
            com.google.android.gms.internal.cast.m1 r0 = new com.google.android.gms.internal.cast.m1
            r0.<init>(r2, r1, r4)
            return r0
        L_0x0023:
            int r5 = r1.length
            int r5 = r5 >> r4
            java.lang.String r6 = "index"
            com.google.android.gms.internal.cast.C5053o0.m7295b(r0, r5, r6)
            int r5 = com.google.android.gms.internal.cast.C4866d1.m6888s(r17)
            if (r0 != r4) goto L_0x0040
            r5 = r1[r3]
            r5.getClass()
            r7 = r1[r4]
            r7.getClass()
            com.google.android.gms.internal.cast.C5104r0.m7429a(r5, r7)
        L_0x003d:
            r5 = 2
            goto L_0x0186
        L_0x0040:
            int r7 = r5 + -1
            r8 = 128(0x80, float:1.794E-43)
            r9 = 3
            r10 = -1
            if (r5 > r8) goto L_0x00b2
            byte[] r5 = new byte[r5]
            java.util.Arrays.fill(r5, r10)
            r8 = r3
            r10 = r8
        L_0x004f:
            if (r8 >= r0) goto L_0x009e
            int r11 = r8 + r8
            int r12 = r10 + r10
            r13 = r1[r11]
            r13.getClass()
            r11 = r11 ^ r4
            r11 = r1[r11]
            r11.getClass()
            com.google.android.gms.internal.cast.C5104r0.m7429a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.android.gms.internal.cast.C5121s0.m7441a(r14)
        L_0x006b:
            r14 = r14 & r7
            byte r15 = r5[r14]
            r6 = 255(0xff, float:3.57E-43)
            r15 = r15 & r6
            if (r15 != r6) goto L_0x0081
            byte r6 = (byte) r12
            r5[r14] = r6
            if (r10 >= r8) goto L_0x007e
            r1[r12] = r13
            r6 = r12 ^ 1
            r1[r6] = r11
        L_0x007e:
            int r10 = r10 + 1
            goto L_0x0098
        L_0x0081:
            r6 = r1[r15]
            boolean r6 = r13.equals(r6)
            if (r6 == 0) goto L_0x009b
            r2 = r15 ^ 1
            com.google.android.gms.internal.cast.a1 r6 = new com.google.android.gms.internal.cast.a1
            r12 = r1[r2]
            r12.getClass()
            r6.<init>(r13, r11, r12)
            r1[r2] = r11
            r2 = r6
        L_0x0098:
            int r8 = r8 + 1
            goto L_0x004f
        L_0x009b:
            int r14 = r14 + 1
            goto L_0x006b
        L_0x009e:
            if (r10 != r0) goto L_0x00a2
        L_0x00a0:
            r2 = r5
            goto L_0x003d
        L_0x00a2:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r6[r4] = r5
            r5 = 2
            r6[r5] = r2
        L_0x00af:
            r2 = r6
            goto L_0x0186
        L_0x00b2:
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r5 > r6) goto L_0x011f
            short[] r5 = new short[r5]
            java.util.Arrays.fill(r5, r10)
            r6 = r3
            r8 = r6
        L_0x00be:
            if (r6 >= r0) goto L_0x010e
            int r10 = r6 + r6
            int r11 = r8 + r8
            r12 = r1[r10]
            r12.getClass()
            r10 = r10 ^ r4
            r10 = r1[r10]
            r10.getClass()
            com.google.android.gms.internal.cast.C5104r0.m7429a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.cast.C5121s0.m7441a(r13)
        L_0x00da:
            r13 = r13 & r7
            short r14 = r5[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x00f1
            short r14 = (short) r11
            r5[r13] = r14
            if (r8 >= r6) goto L_0x00ee
            r1[r11] = r12
            r11 = r11 ^ 1
            r1[r11] = r10
        L_0x00ee:
            int r8 = r8 + 1
            goto L_0x0108
        L_0x00f1:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x010b
            r2 = r14 ^ 1
            com.google.android.gms.internal.cast.a1 r11 = new com.google.android.gms.internal.cast.a1
            r13 = r1[r2]
            r13.getClass()
            r11.<init>(r12, r10, r13)
            r1[r2] = r10
            r2 = r11
        L_0x0108:
            int r6 = r6 + 1
            goto L_0x00be
        L_0x010b:
            int r13 = r13 + 1
            goto L_0x00da
        L_0x010e:
            if (r8 != r0) goto L_0x0111
            goto L_0x00a0
        L_0x0111:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r6[r4] = r5
            r5 = 2
            r6[r5] = r2
            goto L_0x00af
        L_0x011f:
            int[] r5 = new int[r5]
            java.util.Arrays.fill(r5, r10)
            r6 = r3
            r8 = r6
        L_0x0126:
            if (r6 >= r0) goto L_0x0173
            int r11 = r6 + r6
            int r12 = r8 + r8
            r13 = r1[r11]
            r13.getClass()
            r11 = r11 ^ r4
            r11 = r1[r11]
            r11.getClass()
            com.google.android.gms.internal.cast.C5104r0.m7429a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.android.gms.internal.cast.C5121s0.m7441a(r14)
        L_0x0142:
            r14 = r14 & r7
            r15 = r5[r14]
            if (r15 != r10) goto L_0x0154
            r5[r14] = r12
            if (r8 >= r6) goto L_0x0151
            r1[r12] = r13
            r12 = r12 ^ 1
            r1[r12] = r11
        L_0x0151:
            int r8 = r8 + 1
            goto L_0x016b
        L_0x0154:
            r10 = r1[r15]
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x016f
            r2 = r15 ^ 1
            com.google.android.gms.internal.cast.a1 r10 = new com.google.android.gms.internal.cast.a1
            r12 = r1[r2]
            r12.getClass()
            r10.<init>(r13, r11, r12)
            r1[r2] = r11
            r2 = r10
        L_0x016b:
            int r6 = r6 + 1
            r10 = -1
            goto L_0x0126
        L_0x016f:
            int r14 = r14 + 1
            r10 = -1
            goto L_0x0142
        L_0x0173:
            if (r8 != r0) goto L_0x0177
            goto L_0x00a0
        L_0x0177:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r6[r4] = r5
            r5 = 2
            r6[r5] = r2
            goto L_0x00af
        L_0x0186:
            boolean r6 = r2 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01a9
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0 = r2[r5]
            com.google.android.gms.internal.cast.a1 r0 = (com.google.android.gms.internal.cast.C4812a1) r0
            r5 = r19
            r5.f5153c = r0
            r0 = r2[r3]
            r2 = r2[r4]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r16 = r2
            r2 = r0
            r0 = r16
        L_0x01a9:
            com.google.android.gms.internal.cast.m1 r3 = new com.google.android.gms.internal.cast.m1
            r3.<init>(r2, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5020m1.m7181i(int, java.lang.Object[], com.google.android.gms.internal.cast.b1):com.google.android.gms.internal.cast.m1");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5172v0 mo32660a() {
        return new C5003l1(this.f5357f, 1, this.f5358g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C4866d1 mo32667f() {
        return new C4969j1(this, this.f5357f, 0, this.f5358g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4866d1 mo32668g() {
        return new C4986k1(this, new C5003l1(this.f5357f, 0, this.f5358g));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f5356e
            java.lang.Object[] r1 = r9.f5357f
            int r2 = r9.f5358g
            r3 = 0
            if (r10 != 0) goto L_0x000c
        L_0x0009:
            r10 = r3
            goto L_0x009c
        L_0x000c:
            r4 = 1
            if (r2 != r4) goto L_0x0022
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0009
            r10 = r1[r4]
            r10.getClass()
            goto L_0x009c
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0009
        L_0x0025:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L_0x0051
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.cast.C5121s0.m7441a(r0)
        L_0x0038:
            r0 = r0 & r6
            byte r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0041
            goto L_0x0009
        L_0x0041:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x004e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x004e:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0051:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L_0x007d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.cast.C5121s0.m7441a(r0)
        L_0x0063:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L_0x006d
            goto L_0x0009
        L_0x006d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.cast.C5121s0.m7441a(r6)
        L_0x0089:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L_0x0090
            goto L_0x0009
        L_0x0090:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L_0x009c:
            if (r10 != 0) goto L_0x009f
            return r3
        L_0x009f:
            return r10
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5020m1.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f5358g;
    }
}
