package p472zf;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p355hf.C12067a;
import p355hf.C12079g;
import p466yf.C13977i0;

/* renamed from: zf.b */
/* compiled from: AndroidExceptionPreHandler.kt */
public final class C14120b extends C12067a implements C13977i0 {
    private volatile Object _preHandler = this;

    public C14120b() {
        super(C13977i0.f22907a0);
    }

    /* renamed from: t0 */
    private final Method m32780t0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(C12079g gVar, Throwable th) {
        boolean z;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Method t0 = m32780t0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (t0 != null) {
                obj = t0.invoke((Object) null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
