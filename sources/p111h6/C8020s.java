package p111h6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h6.s */
/* compiled from: Throwables */
public final class C8020s {

    /* renamed from: a */
    private static final Object f11256a;

    /* renamed from: b */
    private static final Method f11257b;

    /* renamed from: c */
    private static final Method f11258c;

    static {
        Method method;
        Object b = m15781b();
        f11256a = b;
        Method method2 = null;
        if (b == null) {
            method = null;
        } else {
            method = m15780a();
        }
        f11257b = method;
        if (b != null) {
            method2 = m15783d();
        }
        f11258c = method2;
    }

    /* renamed from: a */
    private static Method m15780a() {
        return m15782c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    private static Object m15781b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m15782c(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m15783d() {
        try {
            Method c = m15782c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return null;
            }
            c.invoke(m15781b(), new Object[]{new Throwable()});
            return c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m15784e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static void m15785f(Throwable th) {
        C8012n.m15755n(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
