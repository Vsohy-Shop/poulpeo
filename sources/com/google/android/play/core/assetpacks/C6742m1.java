package com.google.android.play.core.assetpacks;

import p037b6.C2900e;

/* renamed from: com.google.android.play.core.assetpacks.m1 */
final class C6742m1 {

    /* renamed from: d */
    private static final C2900e f8707d = new C2900e("ExtractorTaskFinder");

    /* renamed from: a */
    private final C6730j1 f8708a;

    /* renamed from: b */
    private final C6792z f8709b;

    /* renamed from: c */
    private final C6717g0 f8710c;

    C6742m1(C6730j1 j1Var, C6792z zVar, C6717g0 g0Var) {
        this.f8708a = j1Var;
        this.f8709b = zVar;
        this.f8710c = g0Var;
    }

    /* renamed from: b */
    private final boolean m11455b(C6718g1 g1Var, C6722h1 h1Var) {
        C6792z zVar = this.f8709b;
        C6714f1 f1Var = g1Var.f8644c;
        String str = f1Var.f8629a;
        return zVar.mo39399w(str, g1Var.f8643b, f1Var.f8630b, h1Var.f8655a).exists();
    }

    /* renamed from: c */
    private static boolean m11456c(C6722h1 h1Var) {
        int i = h1Var.f8660f;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.play.core.assetpacks.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.l2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.l2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.google.android.play.core.assetpacks.e2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.google.android.play.core.assetpacks.e2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: com.google.android.play.core.assetpacks.e2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: com.google.android.play.core.assetpacks.l2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.google.android.play.core.assetpacks.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.google.android.play.core.assetpacks.y1} */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.play.core.assetpacks.l1] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x040d, code lost:
        if (r0 != null) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        f8707d.mo28421c("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r4.f8642a), r4.f8644c.f8629a);
        r11 = r4.f8642a;
        r8 = r4.f8644c;
        r10 = new com.google.android.play.core.assetpacks.C6790y1(r11, r8.f8629a, r4.f8643b, r8.f8630b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0216, code lost:
        r0 = f8707d;
        r4 = new java.lang.Object[r8];
        r4[r7] = java.lang.Integer.valueOf(r6.f8642a);
        r4[1] = r6.f8644c.f8629a;
        r4[2] = r10.f8655a;
        r0.mo28421c("Found extraction task for patch for session %s, pack %s, slice %s.", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r11 = r1.f8709b;
        r4 = r6.f8644c;
        r0 = new java.io.FileInputStream(r11.mo39399w(r4.f8629a, r6.f8643b, r4.f8630b, r10.f8655a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r9 = r6.f8642a;
        r11 = r6.f8644c;
        r19 = new com.google.android.play.core.assetpacks.C6749o0(r9, r11.f8629a, r6.f8643b, r11.f8630b, r10.f8655a, 0, 0, 1, r11.f8632d, r11.f8631c, r0);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C6738l1 mo39333a() {
        /*
            r34 = this;
            r1 = r34
            com.google.android.play.core.assetpacks.j1 r0 = r1.f8708a     // Catch:{ all -> 0x0422 }
            r0.mo39316b()     // Catch:{ all -> 0x0422 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0422 }
            r2.<init>()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.j1 r0 = r1.f8708a     // Catch:{ all -> 0x0422 }
            java.util.Map r0 = r0.mo39325k()     // Catch:{ all -> 0x0422 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0422 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0422 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0422 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.g1 r3 = (com.google.android.play.core.assetpacks.C6718g1) r3     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r4 = r3.f8644c     // Catch:{ all -> 0x0422 }
            int r4 = r4.f8631c     // Catch:{ all -> 0x0422 }
            boolean r4 = com.google.android.play.core.assetpacks.C6770t1.m11538h(r4)     // Catch:{ all -> 0x0422 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0422 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0422 }
            if (r0 != 0) goto L_0x0415
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0422 }
        L_0x003e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0422 }
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.g1 r4 = (com.google.android.play.core.assetpacks.C6718g1) r4     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.z r8 = r1.f8709b     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ IOException -> 0x008d }
            java.lang.String r10 = r9.f8629a     // Catch:{ IOException -> 0x008d }
            int r11 = r4.f8643b     // Catch:{ IOException -> 0x008d }
            long r12 = r9.f8630b     // Catch:{ IOException -> 0x008d }
            int r8 = r8.mo39394r(r10, r11, r12)     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ IOException -> 0x008d }
            java.util.List<com.google.android.play.core.assetpacks.h1> r9 = r9.f8633e     // Catch:{ IOException -> 0x008d }
            int r9 = r9.size()     // Catch:{ IOException -> 0x008d }
            if (r8 != r9) goto L_0x003e
            b6.e r0 = f8707d     // Catch:{ all -> 0x0422 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0422 }
            int r9 = r4.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0422 }
            r8[r7] = r9     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r9.f8629a     // Catch:{ all -> 0x0422 }
            r8[r6] = r9     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo28421c(r9, r8)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.y1 r0 = new com.google.android.play.core.assetpacks.y1     // Catch:{ all -> 0x0422 }
            int r11 = r4.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r8 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r12 = r8.f8629a     // Catch:{ all -> 0x0422 }
            int r13 = r4.f8643b     // Catch:{ all -> 0x0422 }
            long r14 = r8.f8630b     // Catch:{ all -> 0x0422 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x0422 }
            goto L_0x00ad
        L_0x008d:
            r0 = move-exception
            com.google.android.play.core.assetpacks.r0 r2 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x0422 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0422 }
            int r5 = r4.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0422 }
            r3[r7] = r5     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r5 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r5 = r5.f8629a     // Catch:{ all -> 0x0422 }
            r3[r6] = r5     // Catch:{ all -> 0x0422 }
            java.lang.String r5 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x0422 }
            int r4 = r4.f8642a     // Catch:{ all -> 0x0422 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0422 }
            throw r2     // Catch:{ all -> 0x0422 }
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 != 0) goto L_0x040f
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0422 }
        L_0x00b3:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0422 }
            r8 = 3
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.g1 r4 = (com.google.android.play.core.assetpacks.C6718g1) r4     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ all -> 0x0422 }
            int r9 = r9.f8631c     // Catch:{ all -> 0x0422 }
            boolean r9 = com.google.android.play.core.assetpacks.C6770t1.m11538h(r9)     // Catch:{ all -> 0x0422 }
            if (r9 == 0) goto L_0x00b3
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.util.List<com.google.android.play.core.assetpacks.h1> r9 = r9.f8633e     // Catch:{ all -> 0x0422 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0422 }
        L_0x00d2:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0422 }
            if (r10 == 0) goto L_0x00b3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.h1 r10 = (com.google.android.play.core.assetpacks.C6722h1) r10     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.z r11 = r1.f8709b     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r12 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r13 = r12.f8629a     // Catch:{ all -> 0x0422 }
            int r14 = r4.f8643b     // Catch:{ all -> 0x0422 }
            long r5 = r12.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r15 = r10.f8655a     // Catch:{ all -> 0x0422 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.mo39388k(r12, r13, r14, r16)     // Catch:{ all -> 0x0422 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0422 }
            if (r5 == 0) goto L_0x0134
            b6.e r0 = f8707d     // Catch:{ all -> 0x0422 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0422 }
            int r6 = r4.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0422 }
            r5[r7] = r6     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r6 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r6 = r6.f8629a     // Catch:{ all -> 0x0422 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0422 }
            java.lang.String r6 = r10.f8655a     // Catch:{ all -> 0x0422 }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x0422 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo28421c(r6, r5)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.v1 r0 = new com.google.android.play.core.assetpacks.v1     // Catch:{ all -> 0x0422 }
            int r5 = r4.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r6 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r6.f8629a     // Catch:{ all -> 0x0422 }
            int r4 = r4.f8643b     // Catch:{ all -> 0x0422 }
            long r11 = r6.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r6 = r10.f8655a     // Catch:{ all -> 0x0422 }
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r4
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0422 }
            goto L_0x0138
        L_0x0134:
            r5 = 2
            r6 = 1
            goto L_0x00d2
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 != 0) goto L_0x040f
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0422 }
        L_0x013e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0422 }
            if (r4 == 0) goto L_0x01d6
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.g1 r4 = (com.google.android.play.core.assetpacks.C6718g1) r4     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r5 = r4.f8644c     // Catch:{ all -> 0x0422 }
            int r5 = r5.f8631c     // Catch:{ all -> 0x0422 }
            boolean r5 = com.google.android.play.core.assetpacks.C6770t1.m11538h(r5)     // Catch:{ all -> 0x0422 }
            if (r5 == 0) goto L_0x013e
            com.google.android.play.core.assetpacks.f1 r5 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.util.List<com.google.android.play.core.assetpacks.h1> r5 = r5.f8633e     // Catch:{ all -> 0x0422 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0422 }
        L_0x015c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0422 }
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.h1 r6 = (com.google.android.play.core.assetpacks.C6722h1) r6     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.i2 r16 = new com.google.android.play.core.assetpacks.i2     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.z r10 = r1.f8709b     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r11 = r9.f8629a     // Catch:{ all -> 0x0422 }
            int r12 = r4.f8643b     // Catch:{ all -> 0x0422 }
            long r13 = r9.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r15 = r6.f8655a     // Catch:{ all -> 0x0422 }
            r9 = r16
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0422 }
            boolean r9 = r16.mo39314m()     // Catch:{ all -> 0x0422 }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.assetpacks.z r10 = r1.f8709b     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r11 = r9.f8629a     // Catch:{ all -> 0x0422 }
            int r12 = r4.f8643b     // Catch:{ all -> 0x0422 }
            long r13 = r9.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r15 = r6.f8655a     // Catch:{ all -> 0x0422 }
            java.io.File r9 = r10.mo39382c(r11, r12, r13, r15)     // Catch:{ all -> 0x0422 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0422 }
            if (r9 == 0) goto L_0x015c
            b6.e r0 = f8707d     // Catch:{ all -> 0x0422 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0422 }
            int r9 = r4.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0422 }
            r5[r7] = r9     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r9.f8629a     // Catch:{ all -> 0x0422 }
            r10 = 1
            r5[r10] = r9     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r6.f8655a     // Catch:{ all -> 0x0422 }
            r10 = 2
            r5[r10] = r9     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo28421c(r9, r5)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.l2 r0 = new com.google.android.play.core.assetpacks.l2     // Catch:{ all -> 0x0422 }
            int r5 = r4.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r9 = r4.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r10 = r9.f8629a     // Catch:{ all -> 0x0422 }
            int r4 = r4.f8643b     // Catch:{ all -> 0x0422 }
            long r11 = r9.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r6.f8655a     // Catch:{ all -> 0x0422 }
            java.lang.String r6 = r6.f8656b     // Catch:{ all -> 0x0422 }
            r19 = r0
            r20 = r5
            r21 = r10
            r22 = r4
            r23 = r11
            r25 = r9
            r26 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x0422 }
            goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            if (r0 != 0) goto L_0x040f
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0422 }
        L_0x01dd:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0422 }
            r5 = 4
            if (r0 == 0) goto L_0x0359
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0422 }
            r6 = r0
            com.google.android.play.core.assetpacks.g1 r6 = (com.google.android.play.core.assetpacks.C6718g1) r6     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r0 = r6.f8644c     // Catch:{ all -> 0x0422 }
            int r0 = r0.f8631c     // Catch:{ all -> 0x0422 }
            boolean r0 = com.google.android.play.core.assetpacks.C6770t1.m11538h(r0)     // Catch:{ all -> 0x0422 }
            if (r0 == 0) goto L_0x01dd
            com.google.android.play.core.assetpacks.f1 r0 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.util.List<com.google.android.play.core.assetpacks.h1> r0 = r0.f8633e     // Catch:{ all -> 0x0422 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0422 }
        L_0x01fd:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0422 }
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0422 }
            r10 = r0
            com.google.android.play.core.assetpacks.h1 r10 = (com.google.android.play.core.assetpacks.C6722h1) r10     // Catch:{ all -> 0x0422 }
            boolean r0 = m11456c(r10)     // Catch:{ all -> 0x0422 }
            if (r0 == 0) goto L_0x02a0
            boolean r0 = r1.m11455b(r6, r10)     // Catch:{ all -> 0x0422 }
            if (r0 == 0) goto L_0x01fd
            b6.e r0 = f8707d     // Catch:{ all -> 0x0422 }
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x0422 }
            int r9 = r6.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0422 }
            r4[r7] = r9     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r9 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r9.f8629a     // Catch:{ all -> 0x0422 }
            r11 = 1
            r4[r11] = r9     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r10.f8655a     // Catch:{ all -> 0x0422 }
            r11 = 2
            r4[r11] = r9     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = "Found extraction task for patch for session %s, pack %s, slice %s."
            r0.mo28421c(r9, r4)     // Catch:{ all -> 0x0422 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0279 }
            com.google.android.play.core.assetpacks.z r11 = r1.f8709b     // Catch:{ FileNotFoundException -> 0x0279 }
            com.google.android.play.core.assetpacks.f1 r4 = r6.f8644c     // Catch:{ FileNotFoundException -> 0x0279 }
            java.lang.String r12 = r4.f8629a     // Catch:{ FileNotFoundException -> 0x0279 }
            int r13 = r6.f8643b     // Catch:{ FileNotFoundException -> 0x0279 }
            long r14 = r4.f8630b     // Catch:{ FileNotFoundException -> 0x0279 }
            java.lang.String r4 = r10.f8655a     // Catch:{ FileNotFoundException -> 0x0279 }
            r16 = r4
            java.io.File r4 = r11.mo39399w(r12, r13, r14, r16)     // Catch:{ FileNotFoundException -> 0x0279 }
            r0.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0279 }
            com.google.android.play.core.assetpacks.o0 r4 = new com.google.android.play.core.assetpacks.o0     // Catch:{ all -> 0x0422 }
            int r9 = r6.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r11 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r12 = r11.f8629a     // Catch:{ all -> 0x0422 }
            int r6 = r6.f8643b     // Catch:{ all -> 0x0422 }
            long r13 = r11.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r10 = r10.f8655a     // Catch:{ all -> 0x0422 }
            long r7 = r11.f8632d     // Catch:{ all -> 0x0422 }
            r26 = 0
            r27 = 0
            r28 = 1
            int r11 = r11.f8631c     // Catch:{ all -> 0x0422 }
            r19 = r4
            r20 = r9
            r21 = r12
            r22 = r6
            r23 = r13
            r25 = r10
            r29 = r7
            r31 = r11
            r32 = r0
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0422 }
            goto L_0x035a
        L_0x0279:
            r0 = move-exception
            com.google.android.play.core.assetpacks.r0 r2 = new com.google.android.play.core.assetpacks.r0     // Catch:{ all -> 0x0422 }
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0422 }
            int r4 = r6.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0422 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r4 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r4 = r4.f8629a     // Catch:{ all -> 0x0422 }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x0422 }
            java.lang.String r4 = r10.f8655a     // Catch:{ all -> 0x0422 }
            r5 = 2
            r3[r5] = r4     // Catch:{ all -> 0x0422 }
            java.lang.String r4 = "Error finding patch, session %s packName %s sliceId %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0422 }
            int r4 = r6.f8642a     // Catch:{ all -> 0x0422 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0422 }
            throw r2     // Catch:{ all -> 0x0422 }
        L_0x02a0:
            com.google.android.play.core.assetpacks.i2 r0 = new com.google.android.play.core.assetpacks.i2     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.z r7 = r1.f8709b     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r8 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r11 = r8.f8629a     // Catch:{ all -> 0x0422 }
            int r12 = r6.f8643b     // Catch:{ all -> 0x0422 }
            long r13 = r8.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r8 = r10.f8655a     // Catch:{ all -> 0x0422 }
            r19 = r0
            r20 = r7
            r21 = r11
            r22 = r12
            r23 = r13
            r25 = r8
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0422 }
            int r0 = r0.mo39313l()     // Catch:{ IOException -> 0x02c2 }
            goto L_0x02d2
        L_0x02c2:
            r0 = move-exception
            r7 = r0
            b6.e r0 = f8707d     // Catch:{ all -> 0x0422 }
            r8 = 1
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x0422 }
            r8 = 0
            r11[r8] = r7     // Catch:{ all -> 0x0422 }
            java.lang.String r7 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo28423e(r7, r11)     // Catch:{ all -> 0x0422 }
            r0 = 0
        L_0x02d2:
            r7 = -1
            if (r0 == r7) goto L_0x0355
            java.util.List<com.google.android.play.core.assetpacks.e1> r7 = r10.f8658d     // Catch:{ all -> 0x0422 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.e1 r7 = (com.google.android.play.core.assetpacks.C6710e1) r7     // Catch:{ all -> 0x0422 }
            boolean r7 = r7.f8613a     // Catch:{ all -> 0x0422 }
            if (r7 == 0) goto L_0x0355
            b6.e r4 = f8707d     // Catch:{ all -> 0x0422 }
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0422 }
            int r8 = r10.f8659e     // Catch:{ all -> 0x0422 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0422 }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x0422 }
            int r8 = r6.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0422 }
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r8 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r8 = r8.f8629a     // Catch:{ all -> 0x0422 }
            r9 = 2
            r7[r9] = r8     // Catch:{ all -> 0x0422 }
            java.lang.String r8 = r10.f8655a     // Catch:{ all -> 0x0422 }
            r9 = 3
            r7[r9] = r8     // Catch:{ all -> 0x0422 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0422 }
            r7[r5] = r8     // Catch:{ all -> 0x0422 }
            java.lang.String r8 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r4.mo28421c(r8, r7)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.g0 r4 = r1.f8710c     // Catch:{ all -> 0x0422 }
            int r7 = r6.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r8 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r8 = r8.f8629a     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r10.f8655a     // Catch:{ all -> 0x0422 }
            java.io.InputStream r32 = r4.mo39287a(r7, r8, r9, r0)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.o0 r4 = new com.google.android.play.core.assetpacks.o0     // Catch:{ all -> 0x0422 }
            int r7 = r6.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r8 = r6.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r9 = r8.f8629a     // Catch:{ all -> 0x0422 }
            int r11 = r6.f8643b     // Catch:{ all -> 0x0422 }
            long r12 = r8.f8630b     // Catch:{ all -> 0x0422 }
            java.lang.String r8 = r10.f8655a     // Catch:{ all -> 0x0422 }
            int r14 = r10.f8659e     // Catch:{ all -> 0x0422 }
            java.util.List<com.google.android.play.core.assetpacks.e1> r10 = r10.f8658d     // Catch:{ all -> 0x0422 }
            int r28 = r10.size()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r6 = r6.f8644c     // Catch:{ all -> 0x0422 }
            r33 = r4
            long r3 = r6.f8632d     // Catch:{ all -> 0x0422 }
            int r6 = r6.f8631c     // Catch:{ all -> 0x0422 }
            r19 = r33
            r20 = r7
            r21 = r9
            r22 = r11
            r23 = r12
            r25 = r8
            r26 = r14
            r27 = r0
            r29 = r3
            r31 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0422 }
            r4 = r33
            goto L_0x035a
        L_0x0355:
            r7 = 0
            r8 = 3
            goto L_0x01fd
        L_0x0359:
            r4 = 0
        L_0x035a:
            if (r4 != 0) goto L_0x041c
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0422 }
        L_0x0360:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0422 }
            if (r2 == 0) goto L_0x040c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.g1 r2 = (com.google.android.play.core.assetpacks.C6718g1) r2     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r3 = r2.f8644c     // Catch:{ all -> 0x0422 }
            int r3 = r3.f8631c     // Catch:{ all -> 0x0422 }
            boolean r3 = com.google.android.play.core.assetpacks.C6770t1.m11538h(r3)     // Catch:{ all -> 0x0422 }
            if (r3 == 0) goto L_0x0360
            com.google.android.play.core.assetpacks.f1 r3 = r2.f8644c     // Catch:{ all -> 0x0422 }
            java.util.List<com.google.android.play.core.assetpacks.h1> r3 = r3.f8633e     // Catch:{ all -> 0x0422 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0422 }
        L_0x037e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0422 }
            if (r4 == 0) goto L_0x0360
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.h1 r4 = (com.google.android.play.core.assetpacks.C6722h1) r4     // Catch:{ all -> 0x0422 }
            boolean r6 = m11456c(r4)     // Catch:{ all -> 0x0422 }
            if (r6 == 0) goto L_0x037e
            java.util.List<com.google.android.play.core.assetpacks.e1> r6 = r4.f8658d     // Catch:{ all -> 0x0422 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.e1 r6 = (com.google.android.play.core.assetpacks.C6710e1) r6     // Catch:{ all -> 0x0422 }
            boolean r6 = r6.f8613a     // Catch:{ all -> 0x0422 }
            if (r6 == 0) goto L_0x037e
            boolean r6 = r1.m11455b(r2, r4)     // Catch:{ all -> 0x0422 }
            if (r6 != 0) goto L_0x037e
            b6.e r0 = f8707d     // Catch:{ all -> 0x0422 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0422 }
            int r5 = r4.f8660f     // Catch:{ all -> 0x0422 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0422 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0422 }
            int r5 = r2.f8642a     // Catch:{ all -> 0x0422 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0422 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r5 = r2.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r5 = r5.f8629a     // Catch:{ all -> 0x0422 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0422 }
            java.lang.String r5 = r4.f8655a     // Catch:{ all -> 0x0422 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0422 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo28421c(r5, r3)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.g0 r0 = r1.f8710c     // Catch:{ all -> 0x0422 }
            int r3 = r2.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r5 = r2.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r5 = r5.f8629a     // Catch:{ all -> 0x0422 }
            java.lang.String r6 = r4.f8655a     // Catch:{ all -> 0x0422 }
            r9 = 0
            java.io.InputStream r24 = r0.mo39287a(r3, r5, r6, r9)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.e2 r0 = new com.google.android.play.core.assetpacks.e2     // Catch:{ all -> 0x0422 }
            int r12 = r2.f8642a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r3 = r2.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r13 = r3.f8629a     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.z r3 = r1.f8709b     // Catch:{ all -> 0x0422 }
            int r14 = r3.mo39397u(r13)     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.z r3 = r1.f8709b     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r5 = r2.f8644c     // Catch:{ all -> 0x0422 }
            java.lang.String r5 = r5.f8629a     // Catch:{ all -> 0x0422 }
            long r15 = r3.mo39400x(r5)     // Catch:{ all -> 0x0422 }
            int r3 = r2.f8643b     // Catch:{ all -> 0x0422 }
            com.google.android.play.core.assetpacks.f1 r2 = r2.f8644c     // Catch:{ all -> 0x0422 }
            long r5 = r2.f8630b     // Catch:{ all -> 0x0422 }
            int r2 = r4.f8660f     // Catch:{ all -> 0x0422 }
            java.lang.String r7 = r4.f8655a     // Catch:{ all -> 0x0422 }
            long r8 = r4.f8657c     // Catch:{ all -> 0x0422 }
            r11 = r0
            r17 = r3
            r18 = r5
            r20 = r2
            r21 = r7
            r22 = r8
            r11.<init>(r12, r13, r14, r15, r17, r18, r20, r21, r22, r24)     // Catch:{ all -> 0x0422 }
            goto L_0x040d
        L_0x040c:
            r0 = 0
        L_0x040d:
            if (r0 == 0) goto L_0x0415
        L_0x040f:
            com.google.android.play.core.assetpacks.j1 r2 = r1.f8708a
            r2.mo39320f()
            return r0
        L_0x0415:
            com.google.android.play.core.assetpacks.j1 r0 = r1.f8708a
            r0.mo39320f()
            r2 = 0
            return r2
        L_0x041c:
            com.google.android.play.core.assetpacks.j1 r0 = r1.f8708a
            r0.mo39320f()
            return r4
        L_0x0422:
            r0 = move-exception
            com.google.android.play.core.assetpacks.j1 r2 = r1.f8708a
            r2.mo39320f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6742m1.mo39333a():com.google.android.play.core.assetpacks.l1");
    }
}
