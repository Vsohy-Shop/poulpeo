package p466yf;

import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11829h;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n38#1:111\n*E\n"})
/* renamed from: yf.j0 */
/* compiled from: CoroutineExceptionHandler.kt */
public final class C13986j0 {
    /* renamed from: a */
    public static final void m32424a(C12079g gVar, Throwable th) {
        try {
            C13977i0 i0Var = (C13977i0) gVar.get(C13977i0.f22907a0);
            if (i0Var != null) {
                i0Var.handleException(gVar, th);
            } else {
                C11829h.m25459a(gVar, th);
            }
        } catch (Throwable th2) {
            C11829h.m25459a(gVar, m32425b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m32425b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C11894b.m25683a(runtimeException, th);
        return runtimeException;
    }
}
