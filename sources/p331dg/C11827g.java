package p331dg;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C13977i0;

@SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* renamed from: dg.g */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class C11827g {

    /* renamed from: a */
    private static final Collection<C13977i0> f18474a;

    static {
        Class<C13977i0> cls = C13977i0.class;
        f18474a = C13662o.m31293z(C13657m.m31269c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final Collection<C13977i0> m25457a() {
        return f18474a;
    }

    /* renamed from: b */
    public static final void m25458b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
