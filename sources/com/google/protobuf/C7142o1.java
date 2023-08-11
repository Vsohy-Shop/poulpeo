package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.o1 */
/* compiled from: UnsafeUtil */
final class C7142o1 {

    /* renamed from: a */
    private static final Unsafe f9669a = m13509D();

    /* renamed from: b */
    private static final Class<?> f9670b = C7069d.m12821b();

    /* renamed from: c */
    private static final boolean f9671c = m13540o(Long.TYPE);

    /* renamed from: d */
    private static final boolean f9672d = m13540o(Integer.TYPE);

    /* renamed from: e */
    private static final C7147e f9673e = m13507B();

    /* renamed from: f */
    private static final boolean f9674f = m13525T();

    /* renamed from: g */
    private static final boolean f9675g = m13524S();

    /* renamed from: h */
    static final long f9676h;

    /* renamed from: i */
    private static final long f9677i;

    /* renamed from: j */
    private static final long f9678j;

    /* renamed from: k */
    private static final long f9679k;

    /* renamed from: l */
    private static final long f9680l;

    /* renamed from: m */
    private static final long f9681m;

    /* renamed from: n */
    private static final long f9682n;

    /* renamed from: o */
    private static final long f9683o;

    /* renamed from: p */
    private static final long f9684p;

    /* renamed from: q */
    private static final long f9685q;

    /* renamed from: r */
    private static final long f9686r;

    /* renamed from: s */
    private static final long f9687s;

    /* renamed from: t */
    private static final long f9688t;

    /* renamed from: u */
    private static final long f9689u = m13542q(m13539n());

    /* renamed from: v */
    private static final int f9690v;

    /* renamed from: w */
    static final boolean f9691w;

    /* renamed from: com.google.protobuf.o1$a */
    /* compiled from: UnsafeUtil */
    static class C7143a implements PrivilegedExceptionAction<Unsafe> {
        C7143a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.protobuf.o1$b */
    /* compiled from: UnsafeUtil */
    private static final class C7144b extends C7147e {
        C7144b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo40596c(Object obj, long j) {
            if (C7142o1.f9691w) {
                return C7142o1.m13544s(obj, j);
            }
            return C7142o1.m13545t(obj, j);
        }

        /* renamed from: d */
        public byte mo40597d(Object obj, long j) {
            if (C7142o1.f9691w) {
                return C7142o1.m13547v(obj, j);
            }
            return C7142o1.m13548w(obj, j);
        }

        /* renamed from: e */
        public double mo40598e(Object obj, long j) {
            return Double.longBitsToDouble(mo40609h(obj, j));
        }

        /* renamed from: f */
        public float mo40599f(Object obj, long j) {
            return Float.intBitsToFloat(mo40608g(obj, j));
        }

        /* renamed from: k */
        public void mo40600k(Object obj, long j, boolean z) {
            if (C7142o1.f9691w) {
                C7142o1.m13514I(obj, j, z);
            } else {
                C7142o1.m13515J(obj, j, z);
            }
        }

        /* renamed from: l */
        public void mo40601l(Object obj, long j, byte b) {
            if (C7142o1.f9691w) {
                C7142o1.m13517L(obj, j, b);
            } else {
                C7142o1.m13518M(obj, j, b);
            }
        }

        /* renamed from: m */
        public void mo40602m(Object obj, long j, double d) {
            mo40613p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public void mo40603n(Object obj, long j, float f) {
            mo40612o(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: s */
        public boolean mo40604s() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.o1$c */
    /* compiled from: UnsafeUtil */
    private static final class C7145c extends C7147e {
        C7145c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo40596c(Object obj, long j) {
            if (C7142o1.f9691w) {
                return C7142o1.m13544s(obj, j);
            }
            return C7142o1.m13545t(obj, j);
        }

        /* renamed from: d */
        public byte mo40597d(Object obj, long j) {
            if (C7142o1.f9691w) {
                return C7142o1.m13547v(obj, j);
            }
            return C7142o1.m13548w(obj, j);
        }

        /* renamed from: e */
        public double mo40598e(Object obj, long j) {
            return Double.longBitsToDouble(mo40609h(obj, j));
        }

        /* renamed from: f */
        public float mo40599f(Object obj, long j) {
            return Float.intBitsToFloat(mo40608g(obj, j));
        }

        /* renamed from: k */
        public void mo40600k(Object obj, long j, boolean z) {
            if (C7142o1.f9691w) {
                C7142o1.m13514I(obj, j, z);
            } else {
                C7142o1.m13515J(obj, j, z);
            }
        }

        /* renamed from: l */
        public void mo40601l(Object obj, long j, byte b) {
            if (C7142o1.f9691w) {
                C7142o1.m13517L(obj, j, b);
            } else {
                C7142o1.m13518M(obj, j, b);
            }
        }

        /* renamed from: m */
        public void mo40602m(Object obj, long j, double d) {
            mo40613p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public void mo40603n(Object obj, long j, float f) {
            mo40612o(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: s */
        public boolean mo40604s() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.o1$d */
    /* compiled from: UnsafeUtil */
    private static final class C7146d extends C7147e {
        C7146d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo40596c(Object obj, long j) {
            return this.f9692a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public byte mo40597d(Object obj, long j) {
            return this.f9692a.getByte(obj, j);
        }

        /* renamed from: e */
        public double mo40598e(Object obj, long j) {
            return this.f9692a.getDouble(obj, j);
        }

        /* renamed from: f */
        public float mo40599f(Object obj, long j) {
            return this.f9692a.getFloat(obj, j);
        }

        /* renamed from: k */
        public void mo40600k(Object obj, long j, boolean z) {
            this.f9692a.putBoolean(obj, j, z);
        }

        /* renamed from: l */
        public void mo40601l(Object obj, long j, byte b) {
            this.f9692a.putByte(obj, j, b);
        }

        /* renamed from: m */
        public void mo40602m(Object obj, long j, double d) {
            this.f9692a.putDouble(obj, j, d);
        }

        /* renamed from: n */
        public void mo40603n(Object obj, long j, float f) {
            this.f9692a.putFloat(obj, j, f);
        }

        /* renamed from: r */
        public boolean mo40605r() {
            Class<Object> cls = Object.class;
            if (!super.mo40605r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f9692a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                C7142o1.m13512G(th);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo40604s() {
            Class<Object> cls = Object.class;
            if (!super.mo40604s()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f9692a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls3});
                cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                cls2.getMethod("getInt", new Class[]{cls3});
                cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls3});
                cls2.getMethod("putLong", new Class[]{cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                return true;
            } catch (Throwable th) {
                C7142o1.m13512G(th);
                return false;
            }
        }
    }

    /* renamed from: com.google.protobuf.o1$e */
    /* compiled from: UnsafeUtil */
    private static abstract class C7147e {

        /* renamed from: a */
        Unsafe f9692a;

        C7147e(Unsafe unsafe) {
            this.f9692a = unsafe;
        }

        /* renamed from: a */
        public final int mo40606a(Class<?> cls) {
            return this.f9692a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo40607b(Class<?> cls) {
            return this.f9692a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo40596c(Object obj, long j);

        /* renamed from: d */
        public abstract byte mo40597d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo40598e(Object obj, long j);

        /* renamed from: f */
        public abstract float mo40599f(Object obj, long j);

        /* renamed from: g */
        public final int mo40608g(Object obj, long j) {
            return this.f9692a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long mo40609h(Object obj, long j) {
            return this.f9692a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object mo40610i(Object obj, long j) {
            return this.f9692a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long mo40611j(Field field) {
            return this.f9692a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo40600k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo40601l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo40602m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo40603n(Object obj, long j, float f);

        /* renamed from: o */
        public final void mo40612o(Object obj, long j, int i) {
            this.f9692a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void mo40613p(Object obj, long j, long j2) {
            this.f9692a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void mo40614q(Object obj, long j, Object obj2) {
            this.f9692a.putObject(obj, j, obj2);
        }

        /* renamed from: r */
        public boolean mo40605r() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f9692a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls3.getMethod("arrayBaseOffset", new Class[]{cls});
                cls3.getMethod("arrayIndexScale", new Class[]{cls});
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", new Class[]{cls2, cls4});
                cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
                cls3.getMethod("getLong", new Class[]{cls2, cls4});
                cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
                cls3.getMethod("getObject", new Class[]{cls2, cls4});
                cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
                return true;
            } catch (Throwable th) {
                C7142o1.m13512G(th);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo40604s() {
            Unsafe unsafe = this.f9692a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (C7142o1.m13539n() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C7142o1.m13512G(th);
                return false;
            }
        }
    }

    static {
        boolean z;
        long l = (long) m13537l(byte[].class);
        f9676h = l;
        Class<boolean[]> cls = boolean[].class;
        f9677i = (long) m13537l(cls);
        f9678j = (long) m13538m(cls);
        Class<int[]> cls2 = int[].class;
        f9679k = (long) m13537l(cls2);
        f9680l = (long) m13538m(cls2);
        Class<long[]> cls3 = long[].class;
        f9681m = (long) m13537l(cls3);
        f9682n = (long) m13538m(cls3);
        Class<float[]> cls4 = float[].class;
        f9683o = (long) m13537l(cls4);
        f9684p = (long) m13538m(cls4);
        Class<double[]> cls5 = double[].class;
        f9685q = (long) m13537l(cls5);
        f9686r = (long) m13538m(cls5);
        Class<Object[]> cls6 = Object[].class;
        f9687s = (long) m13537l(cls6);
        f9688t = (long) m13538m(cls6);
        f9690v = (int) (l & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f9691w = z;
    }

    private C7142o1() {
    }

    /* renamed from: A */
    static long m13506A(Object obj, long j) {
        return f9673e.mo40609h(obj, j);
    }

    /* renamed from: B */
    private static C7147e m13507B() {
        Unsafe unsafe = f9669a;
        if (unsafe == null) {
            return null;
        }
        if (!C7069d.m12822c()) {
            return new C7146d(unsafe);
        }
        if (f9671c) {
            return new C7145c(unsafe);
        }
        if (f9672d) {
            return new C7144b(unsafe);
        }
        return null;
    }

    /* renamed from: C */
    static Object m13508C(Object obj, long j) {
        return f9673e.mo40610i(obj, j);
    }

    /* renamed from: D */
    static Unsafe m13509D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7143a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static boolean m13510E() {
        return f9675g;
    }

    /* renamed from: F */
    static boolean m13511F() {
        return f9674f;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static void m13512G(Throwable th) {
        Logger logger = Logger.getLogger(C7142o1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: H */
    static void m13513H(Object obj, long j, boolean z) {
        f9673e.mo40600k(obj, j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static void m13514I(Object obj, long j, boolean z) {
        m13517L(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static void m13515J(Object obj, long j, boolean z) {
        m13518M(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: K */
    static void m13516K(byte[] bArr, long j, byte b) {
        f9673e.mo40601l(bArr, f9676h + j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static void m13517L(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int z = m13551z(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m13521P(obj, j2, ((255 & b) << i) | (z & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static void m13518M(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m13521P(obj, j2, ((255 & b) << i) | (m13551z(obj, j2) & (~(255 << i))));
    }

    /* renamed from: N */
    static void m13519N(Object obj, long j, double d) {
        f9673e.mo40602m(obj, j, d);
    }

    /* renamed from: O */
    static void m13520O(Object obj, long j, float f) {
        f9673e.mo40603n(obj, j, f);
    }

    /* renamed from: P */
    static void m13521P(Object obj, long j, int i) {
        f9673e.mo40612o(obj, j, i);
    }

    /* renamed from: Q */
    static void m13522Q(Object obj, long j, long j2) {
        f9673e.mo40613p(obj, j, j2);
    }

    /* renamed from: R */
    static void m13523R(Object obj, long j, Object obj2) {
        f9673e.mo40614q(obj, j, obj2);
    }

    /* renamed from: S */
    private static boolean m13524S() {
        C7147e eVar = f9673e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo40605r();
    }

    /* renamed from: T */
    private static boolean m13525T() {
        C7147e eVar = f9673e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo40604s();
    }

    /* renamed from: k */
    static <T> T m13536k(Class<T> cls) {
        try {
            return f9669a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l */
    private static int m13537l(Class<?> cls) {
        if (f9675g) {
            return f9673e.mo40606a(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static int m13538m(Class<?> cls) {
        if (f9675g) {
            return f9673e.mo40607b(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static Field m13539n() {
        Field p;
        Class<Buffer> cls = Buffer.class;
        if (C7069d.m12822c() && (p = m13541p(cls, "effectiveDirectAddress")) != null) {
            return p;
        }
        Field p2 = m13541p(cls, "address");
        if (p2 == null || p2.getType() != Long.TYPE) {
            return null;
        }
        return p2;
    }

    /* renamed from: o */
    static boolean m13540o(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C7069d.m12822c()) {
            return false;
        }
        try {
            Class<?> cls3 = f9670b;
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

    /* renamed from: p */
    private static Field m13541p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    private static long m13542q(Field field) {
        C7147e eVar;
        if (field == null || (eVar = f9673e) == null) {
            return -1;
        }
        return eVar.mo40611j(field);
    }

    /* renamed from: r */
    static boolean m13543r(Object obj, long j) {
        return f9673e.mo40596c(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static boolean m13544s(Object obj, long j) {
        if (m13547v(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m13545t(Object obj, long j) {
        if (m13548w(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    static byte m13546u(byte[] bArr, long j) {
        return f9673e.mo40597d(bArr, f9676h + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static byte m13547v(Object obj, long j) {
        return (byte) ((m13551z(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static byte m13548w(Object obj, long j) {
        return (byte) ((m13551z(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: x */
    static double m13549x(Object obj, long j) {
        return f9673e.mo40598e(obj, j);
    }

    /* renamed from: y */
    static float m13550y(Object obj, long j) {
        return f9673e.mo40599f(obj, j);
    }

    /* renamed from: z */
    static int m13551z(Object obj, long j) {
        return f9673e.mo40608g(obj, j);
    }
}
