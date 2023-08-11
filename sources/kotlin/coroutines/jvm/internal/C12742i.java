package kotlin.coroutines.jvm.internal;

import androidx.autofill.HintConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.coroutines.jvm.internal.i */
/* compiled from: DebugMetadata.kt */
final class C12742i {

    /* renamed from: a */
    public static final C12742i f20394a = new C12742i();

    /* renamed from: b */
    private static final C12743a f20395b = new C12743a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    private static C12743a f20396c;

    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    /* compiled from: DebugMetadata.kt */
    private static final class C12743a {

        /* renamed from: a */
        public final Method f20397a;

        /* renamed from: b */
        public final Method f20398b;

        /* renamed from: c */
        public final Method f20399c;

        public C12743a(Method method, Method method2, Method method3) {
            this.f20397a = method;
            this.f20398b = method2;
            this.f20399c = method3;
        }
    }

    private C12742i() {
    }

    /* renamed from: a */
    private final C12743a m28574a(C12734a aVar) {
        try {
            C12743a aVar2 = new C12743a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(HintConstants.AUTOFILL_HINT_NAME, new Class[0]));
            f20396c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C12743a aVar3 = f20395b;
            f20396c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo50614b(C12734a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        C12775o.m28639i(aVar, "continuation");
        C12743a aVar2 = f20396c;
        if (aVar2 == null) {
            aVar2 = m28574a(aVar);
        }
        if (aVar2 == f20395b) {
            return null;
        }
        Method method = aVar2.f20397a;
        if (method != null) {
            obj = method.invoke(aVar.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar2.f20398b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar2.f20399c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        return null;
    }
}
