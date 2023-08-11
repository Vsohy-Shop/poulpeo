package p335ee;

/* renamed from: ee.c */
/* compiled from: PerfMark */
public final class C11891c {

    /* renamed from: a */
    private static final C11889a f18582a;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x000e, all -> 0x000b }
            r3 = r1
            goto L_0x0014
        L_0x000b:
            r2 = move-exception
            r3 = r2
            goto L_0x0013
        L_0x000e:
            r0 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            r3 = r0
            r0 = r2
        L_0x0013:
            r2 = r1
        L_0x0014:
            if (r2 == 0) goto L_0x0038
            java.lang.Class<ee.a> r4 = p335ee.C11889a.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch:{ all -> 0x0036 }
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0036 }
            java.lang.Class<ee.d> r6 = p335ee.C11892d.class
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x0036 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch:{ all -> 0x0036 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0036 }
            ee.d r5 = p335ee.C11889a.f18579a     // Catch:{ all -> 0x0036 }
            r4[r7] = r5     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ all -> 0x0036 }
            ee.a r2 = (p335ee.C11889a) r2     // Catch:{ all -> 0x0036 }
            r1 = r2
            goto L_0x0038
        L_0x0036:
            r2 = move-exception
            r3 = r2
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            f18582a = r1
            goto L_0x0046
        L_0x003d:
            ee.a r1 = new ee.a
            ee.d r2 = p335ee.C11889a.f18579a
            r1.<init>(r2)
            f18582a = r1
        L_0x0046:
            if (r3 == 0) goto L_0x0057
            java.lang.Class<ee.c> r1 = p335ee.C11891c.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.lang.String r2 = "Error during PerfMark.<clinit>"
            r1.log(r0, r2, r3)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p335ee.C11891c.<clinit>():void");
    }

    private C11891c() {
    }

    /* renamed from: a */
    public static C11892d m25673a(String str) {
        return f18582a.mo49095a(str, Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static C11892d m25674b(String str, long j) {
        return f18582a.mo49095a(str, j);
    }

    /* renamed from: c */
    public static void m25675c(String str, C11892d dVar) {
        f18582a.mo49096b(str, dVar);
    }

    /* renamed from: d */
    public static void m25676d(C11890b bVar) {
        f18582a.mo49097c(bVar);
    }

    /* renamed from: e */
    public static C11890b m25677e() {
        return f18582a.mo49098d();
    }

    /* renamed from: f */
    public static void m25678f(String str) {
        f18582a.mo49099e(str);
    }

    /* renamed from: g */
    public static void m25679g(String str, C11892d dVar) {
        f18582a.mo49100f(str, dVar);
    }

    /* renamed from: h */
    public static void m25680h(String str) {
        f18582a.mo49101g(str);
    }

    /* renamed from: i */
    public static void m25681i(String str, C11892d dVar) {
        f18582a.mo49102h(str, dVar);
    }
}
