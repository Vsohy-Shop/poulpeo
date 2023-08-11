package p042bo.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.n4 */
public final class C3465n4 {

    /* renamed from: a */
    public static final C3465n4 f2238a = new C3465n4();

    private C3465n4() {
    }

    /* renamed from: a */
    public static final Method m3486a(Class<?> cls, String str, Class<?>... clsArr) {
        C12775o.m28639i(cls, "clazz");
        C12775o.m28639i(str, "methodName");
        C12775o.m28639i(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final Method m3488b(String str, String str2, Class<?>... clsArr) {
        C12775o.m28639i(str, "className");
        C12775o.m28639i(str2, "methodName");
        C12775o.m28639i(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            C12775o.m28638h(cls, "clazz");
            return m3486a(cls, str2, (Class<?>[]) (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final Object m3485a(Object obj, Method method, Object... objArr) {
        C12775o.m28639i(method, "method");
        C12775o.m28639i(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m3487a(String str, String str2, Class<?>... clsArr) {
        C12775o.m28639i(str, "className");
        C12775o.m28639i(str2, "methodName");
        C12775o.m28639i(clsArr, "parameterTypes");
        return m3488b(str, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)) != null;
    }
}
