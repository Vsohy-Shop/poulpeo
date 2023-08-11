package p470zd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: zd.e */
/* compiled from: OptionalMethod */
public class C14092e<T> {

    /* renamed from: a */
    private final Class<?> f23131a;

    /* renamed from: b */
    private final String f23132b;

    /* renamed from: c */
    private final Class[] f23133c;

    public C14092e(Class<?> cls, String str, Class... clsArr) {
        this.f23131a = cls;
        this.f23132b = str;
        this.f23133c = clsArr;
    }

    /* renamed from: a */
    private Method m32706a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f23132b;
        if (str == null) {
            return null;
        }
        Method b = m32707b(cls, str, this.f23133c);
        if (b == null || (cls2 = this.f23131a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m32707b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m32707b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo53861c(T t, Object... objArr) {
        Method a = m32706a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f23132b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo53862d(T t, Object... objArr) {
        Method a = m32706a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object mo53863e(T t, Object... objArr) {
        try {
            return mo53862d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object mo53864f(T t, Object... objArr) {
        try {
            return mo53861c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean mo53865g(T t) {
        if (m32706a(t.getClass()) != null) {
            return true;
        }
        return false;
    }
}
