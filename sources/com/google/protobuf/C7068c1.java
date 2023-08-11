package com.google.protobuf;

/* renamed from: com.google.protobuf.c1 */
/* compiled from: RawMessageInfo */
final class C7068c1 implements C7135n0 {

    /* renamed from: a */
    private final C7149p0 f9534a;

    /* renamed from: b */
    private final String f9535b;

    /* renamed from: c */
    private final Object[] f9536c;

    /* renamed from: d */
    private final int f9537d;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|(3:10|11|12)) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7 = r2.charAt(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r2 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("Failed parsing '%s' with charArray.length of %d", new java.lang.Object[]{r2, java.lang.Integer.valueOf(r6.length)}), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = new char[r0.length()];
        r0.getChars(0, r0.length(), r1, 0);
        r2 = new java.lang.String(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C7068c1(com.google.protobuf.C7149p0 r5, java.lang.String r6, java.lang.Object[] r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.f9534a = r5
            r4.f9535b = r6
            r4.f9536c = r7
            r5 = 1
            r7 = 0
            char r7 = r6.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x0010 }
            goto L_0x0036
        L_0x0010:
            char[] r6 = r6.toCharArray()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
            char r7 = r0.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x001f }
            r6 = r0
            goto L_0x0036
        L_0x001f:
            int r1 = r0.length()     // Catch:{ StringIndexOutOfBoundsException -> 0x005d, ArrayIndexOutOfBoundsException -> 0x005b }
            char[] r1 = new char[r1]     // Catch:{ StringIndexOutOfBoundsException -> 0x005d, ArrayIndexOutOfBoundsException -> 0x005b }
            int r2 = r0.length()     // Catch:{ StringIndexOutOfBoundsException -> 0x005d, ArrayIndexOutOfBoundsException -> 0x005b }
            r0.getChars(r7, r2, r1, r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x005d, ArrayIndexOutOfBoundsException -> 0x005b }
            java.lang.String r2 = new java.lang.String     // Catch:{ StringIndexOutOfBoundsException -> 0x005d, ArrayIndexOutOfBoundsException -> 0x005b }
            r2.<init>(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x005d, ArrayIndexOutOfBoundsException -> 0x005b }
            char r7 = r2.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x0059, ArrayIndexOutOfBoundsException -> 0x0057 }
            r6 = r2
        L_0x0036:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r7 >= r0) goto L_0x003e
            r4.f9537d = r7
            goto L_0x0056
        L_0x003e:
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x0042:
            int r2 = r5 + 1
            char r5 = r6.charAt(r5)
            if (r5 < r0) goto L_0x0052
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r1
            r7 = r7 | r5
            int r1 = r1 + 13
            r5 = r2
            goto L_0x0042
        L_0x0052:
            int r5 = r5 << r1
            r5 = r5 | r7
            r4.f9537d = r5
        L_0x0056:
            return
        L_0x0057:
            r0 = move-exception
            goto L_0x0060
        L_0x0059:
            r0 = move-exception
            goto L_0x0060
        L_0x005b:
            r1 = move-exception
            goto L_0x005e
        L_0x005d:
            r1 = move-exception
        L_0x005e:
            r2 = r0
            r0 = r1
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r2
            int r6 = r6.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r5] = r6
            java.lang.String r5 = "Failed parsing '%s' with charArray.length of %d"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7068c1.<init>(com.google.protobuf.p0, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: a */
    public boolean mo40209a() {
        if ((this.f9537d & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C7149p0 mo40210b() {
        return this.f9534a;
    }

    /* renamed from: c */
    public C7206z0 mo40211c() {
        if ((this.f9537d & 1) == 1) {
            return C7206z0.PROTO2;
        }
        return C7206z0.PROTO3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo40212d() {
        return this.f9536c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo40213e() {
        return this.f9535b;
    }
}
