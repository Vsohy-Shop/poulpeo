package androidx.compose.p002ui.platform;

import java.util.Arrays;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.JvmActuals_jvmKt */
/* compiled from: JvmActuals.jvm.kt */
public final class JvmActuals_jvmKt {
    public static final Object nativeClass(Object obj) {
        C12775o.m28639i(obj, "<this>");
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        C12775o.m28639i(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        C12775o.m28638h(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static final <R> R m37740synchronized(Object obj, C13074a<? extends R> aVar) {
        R invoke;
        C12775o.m28639i(obj, "lock");
        C12775o.m28639i(aVar, "block");
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                C12773m.m28629b(1);
            } catch (Throwable th) {
                C12773m.m28629b(1);
                C12773m.m28628a(1);
                throw th;
            }
        }
        C12773m.m28628a(1);
        return invoke;
    }
}
