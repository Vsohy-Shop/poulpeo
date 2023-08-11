package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.vf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5187vf {

    /* renamed from: a */
    private static final Unsafe f5564a;

    /* renamed from: b */
    private static final Class f5565b = C5234yb.m7699a();

    /* renamed from: c */
    private static final boolean f5566c;

    /* renamed from: d */
    private static final C5170uf f5567d;

    /* renamed from: e */
    private static final boolean f5568e;

    /* renamed from: f */
    private static final boolean f5569f;

    /* renamed from: g */
    static final long f5570g = ((long) m7574E(byte[].class));

    /* renamed from: h */
    static final boolean f5571h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012e  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = m7586l()
            f5564a = r1
            java.lang.Class r2 = com.google.android.gms.internal.cast.C5234yb.m7699a()
            f5565b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = m7570A(r2)
            f5566c = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = m7570A(r4)
            r5 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.cast.tf r5 = new com.google.android.gms.internal.cast.tf
            r5.<init>(r1)
            goto L_0x002f
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            com.google.android.gms.internal.cast.sf r5 = new com.google.android.gms.internal.cast.sf
            r5.<init>(r1)
        L_0x002f:
            f5567d = r5
            java.lang.String r1 = "getLong"
            java.lang.String r3 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r4 = java.lang.reflect.Field.class
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r2 = r9
            goto L_0x0064
        L_0x0040:
            sun.misc.Unsafe r5 = r5.f5556a
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x005f }
            r10[r9] = r4     // Catch:{ all -> 0x005f }
            r5.getMethod(r3, r10)     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x005f }
            r10[r9] = r7     // Catch:{ all -> 0x005f }
            r10[r8] = r2     // Catch:{ all -> 0x005f }
            r5.getMethod(r1, r10)     // Catch:{ all -> 0x005f }
            java.lang.reflect.Field r2 = m7576b()     // Catch:{ all -> 0x005f }
            if (r2 != 0) goto L_0x005d
            goto L_0x003e
        L_0x005d:
            r2 = r8
            goto L_0x0064
        L_0x005f:
            r2 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.cast.C5187vf.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
            goto L_0x003e
        L_0x0064:
            f5568e = r2
            com.google.android.gms.internal.cast.uf r2 = f5567d
            if (r2 != 0) goto L_0x006c
        L_0x006a:
            r0 = r9
            goto L_0x00dd
        L_0x006c:
            sun.misc.Unsafe r2 = r2.f5556a
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r5[r9] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r3, r5)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r3[r9] = r0     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "arrayBaseOffset"
            r2.getMethod(r4, r3)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r3[r9] = r0     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "arrayIndexScale"
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r0[r9] = r7     // Catch:{ all -> 0x00d8 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00d8 }
            r0[r8] = r3     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "getInt"
            r2.getMethod(r4, r0)     // Catch:{ all -> 0x00d8 }
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r7     // Catch:{ all -> 0x00d8 }
            r4[r8] = r3     // Catch:{ all -> 0x00d8 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d8 }
            r4[r6] = r5     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "putInt"
            r2.getMethod(r5, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r7     // Catch:{ all -> 0x00d8 }
            r4[r8] = r3     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r1, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r3     // Catch:{ all -> 0x00d8 }
            r1[r6] = r3     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "putLong"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r3     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "getObject"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x00d8 }
            r0[r9] = r7     // Catch:{ all -> 0x00d8 }
            r0[r8] = r3     // Catch:{ all -> 0x00d8 }
            r0[r6] = r7     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "putObject"
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00d8 }
            r0 = r8
            goto L_0x00dd
        L_0x00d8:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.cast.C5187vf.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x006a
        L_0x00dd:
            f5569f = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m7574E(r0)
            long r0 = (long) r0
            f5570g = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            m7574E(r0)
            m7575a(r0)
            java.lang.Class<int[]> r0 = int[].class
            m7574E(r0)
            m7575a(r0)
            java.lang.Class<long[]> r0 = long[].class
            m7574E(r0)
            m7575a(r0)
            java.lang.Class<float[]> r0 = float[].class
            m7574E(r0)
            m7575a(r0)
            java.lang.Class<double[]> r0 = double[].class
            m7574E(r0)
            m7575a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m7574E(r0)
            m7575a(r0)
            java.lang.reflect.Field r0 = m7576b()
            if (r0 == 0) goto L_0x0125
            com.google.android.gms.internal.cast.uf r1 = f5567d
            if (r1 == 0) goto L_0x0125
            r1.mo33026l(r0)
        L_0x0125:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r8 = r9
        L_0x012f:
            f5571h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5187vf.<clinit>():void");
    }

    private C5187vf() {
    }

    /* renamed from: A */
    static boolean m7570A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C5234yb.f5604a;
        try {
            Class cls3 = f5565b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: B */
    static boolean m7571B(Object obj, long j) {
        return f5567d.mo33006g(obj, j);
    }

    /* renamed from: C */
    static boolean m7572C() {
        return f5569f;
    }

    /* renamed from: D */
    static boolean m7573D() {
        return f5568e;
    }

    /* renamed from: E */
    private static int m7574E(Class cls) {
        if (f5569f) {
            return f5567d.mo33022h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m7575a(Class cls) {
        if (f5569f) {
            return f5567d.mo33023i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m7576b() {
        int i = C5234yb.f5604a;
        Class<Buffer> cls = Buffer.class;
        Field c = m7577c(cls, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m7577c(cls, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m7577c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m7578d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C5170uf ufVar = f5567d;
        int j3 = ufVar.mo33024j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        ufVar.mo33028n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m7579e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C5170uf ufVar = f5567d;
        int i = (((int) j) & 3) << 3;
        ufVar.mo33028n(obj, j2, ((255 & b) << i) | (ufVar.mo33024j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m7580f(Object obj, long j) {
        return f5567d.mo33000a(obj, j);
    }

    /* renamed from: g */
    static float m7581g(Object obj, long j) {
        return f5567d.mo33001b(obj, j);
    }

    /* renamed from: h */
    static int m7582h(Object obj, long j) {
        return f5567d.mo33024j(obj, j);
    }

    /* renamed from: i */
    static long m7583i(Object obj, long j) {
        return f5567d.mo33025k(obj, j);
    }

    /* renamed from: j */
    static Object m7584j(Class cls) {
        try {
            return f5564a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m7585k(Object obj, long j) {
        return f5567d.mo33027m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m7586l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5119rf());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m7592r(Object obj, long j, boolean z) {
        f5567d.mo33002c(obj, j, z);
    }

    /* renamed from: s */
    static void m7593s(byte[] bArr, long j, byte b) {
        f5567d.mo33003d(bArr, f5570g + j, b);
    }

    /* renamed from: t */
    static void m7594t(Object obj, long j, double d) {
        f5567d.mo33004e(obj, j, d);
    }

    /* renamed from: u */
    static void m7595u(Object obj, long j, float f) {
        f5567d.mo33005f(obj, j, f);
    }

    /* renamed from: v */
    static void m7596v(Object obj, long j, int i) {
        f5567d.mo33028n(obj, j, i);
    }

    /* renamed from: w */
    static void m7597w(Object obj, long j, long j2) {
        f5567d.mo33029o(obj, j, j2);
    }

    /* renamed from: x */
    static void m7598x(Object obj, long j, Object obj2) {
        f5567d.mo33030p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m7599y(Object obj, long j) {
        if (((byte) ((f5567d.mo33024j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m7600z(Object obj, long j) {
        if (((byte) ((f5567d.mo33024j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
