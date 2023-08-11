package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.o */
/* compiled from: Intrinsics */
public class C12775o {

    /* renamed from: kotlin.jvm.internal.o$a */
    /* compiled from: Intrinsics */
    public static class C12776a {
        private C12776a() {
        }
    }

    private C12775o() {
    }

    /* renamed from: a */
    public static boolean m28631a(float f, Float f2) {
        if (f2 == null || f != f2.floatValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m28632b(Float f, float f2) {
        if (f == null || f.floatValue() != f2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m28633c(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m28634d(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m28635e(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m28645o(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: f */
    public static void m28636f(Object obj) {
        if (obj == null) {
            m28648r();
        }
    }

    /* renamed from: g */
    public static void m28637g(Object obj, String str) {
        if (obj == null) {
            m28649s(str);
        }
    }

    /* renamed from: h */
    public static void m28638h(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m28645o(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: i */
    public static void m28639i(Object obj, String str) {
        if (obj == null) {
            m28652v(str);
        }
    }

    /* renamed from: j */
    public static void m28640j(Object obj, String str) {
        if (obj == null) {
            m28651u(str);
        }
    }

    /* renamed from: k */
    public static int m28641k(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    /* renamed from: l */
    public static int m28642l(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: m */
    private static String m28643m(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: n */
    public static void m28644n(int i, String str) {
        m28653w();
    }

    /* renamed from: o */
    private static <T extends Throwable> T m28645o(T t) {
        return m28646p(t, C12775o.class.getName());
    }

    /* renamed from: p */
    static <T extends Throwable> T m28646p(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: q */
    public static String m28647q(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: r */
    public static void m28648r() {
        throw ((NullPointerException) m28645o(new NullPointerException()));
    }

    /* renamed from: s */
    public static void m28649s(String str) {
        throw ((NullPointerException) m28645o(new NullPointerException(str)));
    }

    /* renamed from: t */
    public static void m28650t() {
        throw ((KotlinNullPointerException) m28645o(new KotlinNullPointerException()));
    }

    /* renamed from: u */
    private static void m28651u(String str) {
        throw ((IllegalArgumentException) m28645o(new IllegalArgumentException(m28643m(str))));
    }

    /* renamed from: v */
    private static void m28652v(String str) {
        throw ((NullPointerException) m28645o(new NullPointerException(m28643m(str))));
    }

    /* renamed from: w */
    public static void m28653w() {
        m28654x("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: x */
    public static void m28654x(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: y */
    public static void m28655y(String str) {
        throw ((UninitializedPropertyAccessException) m28645o(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: z */
    public static void m28656z(String str) {
        m28655y("lateinit property " + str + " has not been initialized");
    }
}
