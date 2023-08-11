package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.s6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public abstract class C5953s6<T> {

    /* renamed from: g */
    private static final Object f7359g = new Object();

    /* renamed from: h */
    private static volatile C5921q6 f7360h;

    /* renamed from: i */
    private static final AtomicReference<Collection<C5953s6<?>>> f7361i = new AtomicReference<>();

    /* renamed from: j */
    private static final C5985u6 f7362j = new C5985u6(C5807j6.f7022a, (byte[]) null);

    /* renamed from: k */
    private static final AtomicInteger f7363k = new AtomicInteger();

    /* renamed from: l */
    public static final /* synthetic */ int f7364l = 0;

    /* renamed from: a */
    final C5905p6 f7365a;

    /* renamed from: b */
    final String f7366b;

    /* renamed from: c */
    private final T f7367c;

    /* renamed from: d */
    private volatile int f7368d = -1;

    /* renamed from: e */
    private volatile T f7369e;

    /* renamed from: f */
    private final boolean f7370f;

    /* synthetic */ C5953s6(C5905p6 p6Var, String str, Object obj, boolean z, C5937r6 r6Var) {
        if (p6Var.f7267b != null) {
            this.f7365a = p6Var;
            this.f7366b = str;
            this.f7367c = obj;
            this.f7370f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    @Deprecated
    /* renamed from: d */
    public static void m9870d(Context context) {
        synchronized (f7359g) {
            C5921q6 q6Var = f7360h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (q6Var == null || q6Var.mo34287a() != context) {
                C6048y5.m10298d();
                C5969t6.m9967b();
                C5739f6.m9220d();
                f7360h = new C5984u5(context, C5723e7.m9105a(new C5824k6(context)));
                f7363k.incrementAndGet();
            }
        }
    }

    /* renamed from: e */
    static void m9871e() {
        f7363k.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo34164a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo34349b() {
        /*
            r7 = this;
            boolean r0 = r7.f7370f
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r7.f7366b
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f7363k
            int r0 = r0.get()
            int r1 = r7.f7368d
            if (r1 >= r0) goto L_0x011f
            monitor-enter(r7)
            int r1 = r7.f7368d     // Catch:{ all -> 0x011c }
            if (r1 >= r0) goto L_0x011a
            com.google.android.gms.internal.measurement.q6 r1 = f7360h     // Catch:{ all -> 0x011c }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0114
            com.google.android.gms.internal.measurement.p6 r2 = r7.f7365a     // Catch:{ all -> 0x011c }
            boolean r2 = r2.f7271f     // Catch:{ all -> 0x011c }
            android.content.Context r2 = r1.mo34287a()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.f6 r2 = com.google.android.gms.internal.measurement.C5739f6.m9219a(r2)     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.mo33752B(r3)     // Catch:{ all -> 0x011c }
            r3 = 0
            if (r2 == 0) goto L_0x0072
            java.util.regex.Pattern r4 = com.google.android.gms.internal.measurement.C5952s5.f7348c     // Catch:{ all -> 0x011c }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x011c }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.mo34350c()     // Catch:{ all -> 0x011c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x011c }
            int r6 = r5.length()     // Catch:{ all -> 0x011c }
            if (r6 == 0) goto L_0x0067
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x011c }
            goto L_0x006d
        L_0x0067:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x011c }
            r5.<init>(r4)     // Catch:{ all -> 0x011c }
            r4 = r5
        L_0x006d:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x011c }
        L_0x0070:
            r2 = r3
            goto L_0x00b9
        L_0x0072:
            com.google.android.gms.internal.measurement.p6 r2 = r7.f7365a     // Catch:{ all -> 0x011c }
            android.net.Uri r2 = r2.f7267b     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x009d
            android.content.Context r2 = r1.mo34287a()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.p6 r4 = r7.f7365a     // Catch:{ all -> 0x011c }
            android.net.Uri r4 = r4.f7267b     // Catch:{ all -> 0x011c }
            boolean r2 = com.google.android.gms.internal.measurement.C5773h6.m9335a(r2, r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x009b
            com.google.android.gms.internal.measurement.p6 r2 = r7.f7365a     // Catch:{ all -> 0x011c }
            boolean r2 = r2.f7273h     // Catch:{ all -> 0x011c }
            android.content.Context r2 = r1.mo34287a()     // Catch:{ all -> 0x011c }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.p6 r4 = r7.f7365a     // Catch:{ all -> 0x011c }
            android.net.Uri r4 = r4.f7267b     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.y5 r2 = com.google.android.gms.internal.measurement.C6048y5.m10297a(r2, r4)     // Catch:{ all -> 0x011c }
            goto L_0x00a9
        L_0x009b:
            r2 = r3
            goto L_0x00a9
        L_0x009d:
            android.content.Context r2 = r1.mo34287a()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.p6 r4 = r7.f7365a     // Catch:{ all -> 0x011c }
            java.lang.String r4 = r4.f7266a     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.t6 r2 = com.google.android.gms.internal.measurement.C5969t6.m9966a(r2, r3)     // Catch:{ all -> 0x011c }
        L_0x00a9:
            if (r2 == 0) goto L_0x0070
            java.lang.String r4 = r7.mo34350c()     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = r2.mo33752B(r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r7.mo34164a(r2)     // Catch:{ all -> 0x011c }
        L_0x00b9:
            if (r2 == 0) goto L_0x00bc
            goto L_0x00e4
        L_0x00bc:
            com.google.android.gms.internal.measurement.p6 r2 = r7.f7365a     // Catch:{ all -> 0x011c }
            boolean r2 = r2.f7270e     // Catch:{ all -> 0x011c }
            if (r2 != 0) goto L_0x00df
            android.content.Context r2 = r1.mo34287a()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.f6 r2 = com.google.android.gms.internal.measurement.C5739f6.m9219a(r2)     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.p6 r4 = r7.f7365a     // Catch:{ all -> 0x011c }
            boolean r4 = r4.f7270e     // Catch:{ all -> 0x011c }
            if (r4 == 0) goto L_0x00d2
            r4 = r3
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r4 = r7.f7366b     // Catch:{ all -> 0x011c }
        L_0x00d4:
            java.lang.String r2 = r2.mo33752B(r4)     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r7.mo34164a(r2)     // Catch:{ all -> 0x011c }
            goto L_0x00e0
        L_0x00df:
            r2 = r3
        L_0x00e0:
            if (r2 != 0) goto L_0x00e4
            T r2 = r7.f7367c     // Catch:{ all -> 0x011c }
        L_0x00e4:
            com.google.android.gms.internal.measurement.a7 r1 = r1.mo34288b()     // Catch:{ all -> 0x011c }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.x6 r1 = (com.google.android.gms.internal.measurement.C6033x6) r1     // Catch:{ all -> 0x011c }
            boolean r4 = r1.mo34546b()     // Catch:{ all -> 0x011c }
            if (r4 == 0) goto L_0x010f
            java.lang.Object r1 = r1.mo34545a()     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.g6 r1 = (com.google.android.gms.internal.measurement.C5756g6) r1     // Catch:{ all -> 0x011c }
            com.google.android.gms.internal.measurement.p6 r2 = r7.f7365a     // Catch:{ all -> 0x011c }
            android.net.Uri r4 = r2.f7267b     // Catch:{ all -> 0x011c }
            java.lang.String r2 = r2.f7269d     // Catch:{ all -> 0x011c }
            java.lang.String r5 = r7.f7366b     // Catch:{ all -> 0x011c }
            java.lang.String r1 = r1.mo34040a(r4, r3, r2, r5)     // Catch:{ all -> 0x011c }
            if (r1 != 0) goto L_0x010b
            T r2 = r7.f7367c     // Catch:{ all -> 0x011c }
            goto L_0x010f
        L_0x010b:
            java.lang.Object r2 = r7.mo34164a(r1)     // Catch:{ all -> 0x011c }
        L_0x010f:
            r7.f7369e = r2     // Catch:{ all -> 0x011c }
            r7.f7368d = r0     // Catch:{ all -> 0x011c }
            goto L_0x011a
        L_0x0114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011c }
            r0.<init>(r2)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011a:
            monitor-exit(r7)     // Catch:{ all -> 0x011c }
            goto L_0x011f
        L_0x011c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x011c }
            throw r0
        L_0x011f:
            T r0 = r7.f7369e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5953s6.mo34349b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo34350c() {
        String str = this.f7365a.f7269d;
        return this.f7366b;
    }
}
