package p378kg;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: kg.a */
/* compiled from: BoundaryInterfaceReflectionUtil */
public class C12660a {

    @RequiresApi(19)
    /* renamed from: kg.a$a */
    /* compiled from: BoundaryInterfaceReflectionUtil */
    private static class C12661a implements InvocationHandler {

        /* renamed from: a */
        private final Object f20333a;

        public C12661a(@NonNull Object obj) {
            this.f20333a = obj;
        }

        @NonNull
        /* renamed from: a */
        public Object mo50404a() {
            return this.f20333a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return C12660a.m28165d(method, this.f20333a.getClass().getClassLoader()).invoke(this.f20333a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static <T> T m28162a(@NonNull Class<T> cls, @Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C12660a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m28163b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m28167f()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @RequiresApi(19)
    @Nullable
    /* renamed from: c */
    public static InvocationHandler m28164c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return new C12661a(obj);
    }

    /* renamed from: d */
    public static Method m28165d(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @Nullable
    /* renamed from: e */
    public static Object m28166e(@Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C12661a) invocationHandler).mo50404a();
    }

    /* renamed from: f */
    private static boolean m28167f() {
        String str = Build.TYPE;
        if ("eng".equals(str) || "userdebug".equals(str)) {
            return true;
        }
        return false;
    }
}
