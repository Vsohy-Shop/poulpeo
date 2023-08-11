package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.hb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5778hb {

    /* renamed from: a */
    private static final Unsafe f6982a;

    /* renamed from: b */
    private static final Class<?> f6983b = C5791i7.m9399a();

    /* renamed from: c */
    private static final boolean f6984c;

    /* renamed from: d */
    private static final boolean f6985d;

    /* renamed from: e */
    private static final C5761gb f6986e;

    /* renamed from: f */
    private static final boolean f6987f;

    /* renamed from: g */
    private static final boolean f6988g;

    /* renamed from: h */
    static final long f6989h = ((long) m9350E(byte[].class));

    /* renamed from: i */
    static final boolean f6990i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0137  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = m9362l()
            f6982a = r1
            java.lang.Class r2 = com.google.android.gms.internal.measurement.C5791i7.m9399a()
            f6983b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = m9346A(r2)
            f6984c = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = m9346A(r4)
            f6985d = r4
            r5 = 0
            if (r1 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.measurement.fb r5 = new com.google.android.gms.internal.measurement.fb
            r5.<init>(r1)
            goto L_0x0031
        L_0x002a:
            if (r4 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.eb r5 = new com.google.android.gms.internal.measurement.eb
            r5.<init>(r1)
        L_0x0031:
            f6986e = r5
            java.lang.String r1 = "getLong"
            java.lang.String r3 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r4 = java.lang.reflect.Field.class
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x0042
        L_0x0040:
            r2 = r9
            goto L_0x0069
        L_0x0042:
            sun.misc.Unsafe r5 = r5.f6962a
            if (r5 != 0) goto L_0x0047
            goto L_0x0040
        L_0x0047:
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0064 }
            r10[r9] = r4     // Catch:{ all -> 0x0064 }
            r5.getMethod(r3, r10)     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x0064 }
            r10[r9] = r7     // Catch:{ all -> 0x0064 }
            r10[r8] = r2     // Catch:{ all -> 0x0064 }
            r5.getMethod(r1, r10)     // Catch:{ all -> 0x0064 }
            java.lang.reflect.Field r2 = m9352b()     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0062
            goto L_0x0040
        L_0x0062:
            r2 = r8
            goto L_0x0069
        L_0x0064:
            r2 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C5778hb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
            goto L_0x0040
        L_0x0069:
            f6987f = r2
            com.google.android.gms.internal.measurement.gb r2 = f6986e
            if (r2 != 0) goto L_0x0072
        L_0x006f:
            r0 = r9
            goto L_0x00e6
        L_0x0072:
            sun.misc.Unsafe r2 = r2.f6962a
            if (r2 != 0) goto L_0x0077
            goto L_0x006f
        L_0x0077:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e1 }
            r5[r9] = r4     // Catch:{ all -> 0x00e1 }
            r2.getMethod(r3, r5)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e1 }
            r3[r9] = r0     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "arrayBaseOffset"
            r2.getMethod(r4, r3)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e1 }
            r3[r9] = r0     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "arrayIndexScale"
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e1 }
            r0[r9] = r7     // Catch:{ all -> 0x00e1 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e1 }
            r0[r8] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "getInt"
            r2.getMethod(r4, r0)     // Catch:{ all -> 0x00e1 }
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x00e1 }
            r4[r9] = r7     // Catch:{ all -> 0x00e1 }
            r4[r8] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e1 }
            r4[r6] = r5     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = "putInt"
            r2.getMethod(r5, r4)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e1 }
            r4[r9] = r7     // Catch:{ all -> 0x00e1 }
            r4[r8] = r3     // Catch:{ all -> 0x00e1 }
            r2.getMethod(r1, r4)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x00e1 }
            r1[r9] = r7     // Catch:{ all -> 0x00e1 }
            r1[r8] = r3     // Catch:{ all -> 0x00e1 }
            r1[r6] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "putLong"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e1 }
            r1[r9] = r7     // Catch:{ all -> 0x00e1 }
            r1[r8] = r3     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "getObject"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00e1 }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x00e1 }
            r0[r9] = r7     // Catch:{ all -> 0x00e1 }
            r0[r8] = r3     // Catch:{ all -> 0x00e1 }
            r0[r6] = r7     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "putObject"
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e1 }
            r0 = r8
            goto L_0x00e6
        L_0x00e1:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C5778hb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x006f
        L_0x00e6:
            f6988g = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m9350E(r0)
            long r0 = (long) r0
            f6989h = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            m9350E(r0)
            m9351a(r0)
            java.lang.Class<int[]> r0 = int[].class
            m9350E(r0)
            m9351a(r0)
            java.lang.Class<long[]> r0 = long[].class
            m9350E(r0)
            m9351a(r0)
            java.lang.Class<float[]> r0 = float[].class
            m9350E(r0)
            m9351a(r0)
            java.lang.Class<double[]> r0 = double[].class
            m9350E(r0)
            m9351a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m9350E(r0)
            m9351a(r0)
            java.lang.reflect.Field r0 = m9352b()
            if (r0 == 0) goto L_0x012e
            com.google.android.gms.internal.measurement.gb r1 = f6986e
            if (r1 == 0) goto L_0x012e
            r1.mo34057l(r0)
        L_0x012e:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r8 = r9
        L_0x0138:
            f6990i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5778hb.<clinit>():void");
    }

    private C5778hb() {
    }

    /* renamed from: A */
    static boolean m9346A(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C5791i7.f7005a;
        try {
            Class<?> cls3 = f6983b;
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
    static boolean m9347B(Object obj, long j) {
        return f6986e.mo33944g(obj, j);
    }

    /* renamed from: C */
    static boolean m9348C() {
        return f6988g;
    }

    /* renamed from: D */
    static boolean m9349D() {
        return f6987f;
    }

    /* renamed from: E */
    private static int m9350E(Class<?> cls) {
        if (f6988g) {
            return f6986e.mo34053h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m9351a(Class<?> cls) {
        if (f6988g) {
            return f6986e.mo34054i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m9352b() {
        int i = C5791i7.f7005a;
        Class<Buffer> cls = Buffer.class;
        Field c = m9353c(cls, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m9353c(cls, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m9353c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m9354d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C5761gb gbVar = f6986e;
        int j3 = gbVar.mo34055j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        gbVar.mo34059n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m9355e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C5761gb gbVar = f6986e;
        int i = (((int) j) & 3) << 3;
        gbVar.mo34059n(obj, j2, ((255 & b) << i) | (gbVar.mo34055j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m9356f(Object obj, long j) {
        return f6986e.mo33938a(obj, j);
    }

    /* renamed from: g */
    static float m9357g(Object obj, long j) {
        return f6986e.mo33939b(obj, j);
    }

    /* renamed from: h */
    static int m9358h(Object obj, long j) {
        return f6986e.mo34055j(obj, j);
    }

    /* renamed from: i */
    static long m9359i(Object obj, long j) {
        return f6986e.mo34056k(obj, j);
    }

    /* renamed from: j */
    static <T> T m9360j(Class<T> cls) {
        try {
            return f6982a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m9361k(Object obj, long j) {
        return f6986e.mo34058m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m9362l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5710db());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m9368r(Object obj, long j, boolean z) {
        f6986e.mo33940c(obj, j, z);
    }

    /* renamed from: s */
    static void m9369s(byte[] bArr, long j, byte b) {
        f6986e.mo33941d(bArr, f6989h + j, b);
    }

    /* renamed from: t */
    static void m9370t(Object obj, long j, double d) {
        f6986e.mo33942e(obj, j, d);
    }

    /* renamed from: u */
    static void m9371u(Object obj, long j, float f) {
        f6986e.mo33943f(obj, j, f);
    }

    /* renamed from: v */
    static void m9372v(Object obj, long j, int i) {
        f6986e.mo34059n(obj, j, i);
    }

    /* renamed from: w */
    static void m9373w(Object obj, long j, long j2) {
        f6986e.mo34060o(obj, j, j2);
    }

    /* renamed from: x */
    static void m9374x(Object obj, long j, Object obj2) {
        f6986e.mo34061p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* synthetic */ boolean m9375y(Object obj, long j) {
        if (((byte) ((f6986e.mo34055j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    static /* synthetic */ boolean m9376z(Object obj, long j) {
        if (((byte) ((f6986e.mo34055j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
