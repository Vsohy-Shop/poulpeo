package p095g2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import p251v2.C9925a;

/* renamed from: g2.h */
/* compiled from: InAppPurchaseUtils.kt */
public final class C7765h {

    /* renamed from: a */
    public static final C7765h f10785a = new C7765h();

    private C7765h() {
    }

    /* renamed from: a */
    public static final Class<?> m15140a(String str) {
        Class<C7765h> cls = C7765h.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final Method m15141b(Class<?> cls, String str, Class<?>... clsArr) {
        Class<C7765h> cls2 = C7765h.class;
        if (C9925a.m20734d(cls2)) {
            return null;
        }
        try {
            C12775o.m28639i(cls, "clazz");
            C12775o.m28639i(str, "methodName");
            C12775o.m28639i(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, cls2);
            return null;
        }
    }

    /* renamed from: c */
    public static final Object m15142c(Class<?> cls, Method method, Object obj, Object... objArr) {
        Class<C7765h> cls2 = C7765h.class;
        if (C9925a.m20734d(cls2)) {
            return null;
        }
        try {
            C12775o.m28639i(cls, "clazz");
            C12775o.m28639i(method, "method");
            C12775o.m28639i(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, cls2);
            return null;
        }
    }
}
