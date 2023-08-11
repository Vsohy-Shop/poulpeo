package p331dg;

import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import p355hf.C12079g;
import p466yf.C13977i0;
import p466yf.C13986j0;

/* renamed from: dg.h */
/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
public final class C11829h {
    /* renamed from: a */
    public static final void m25459a(C12079g gVar, Throwable th) {
        for (C13977i0 handleException : C11827g.m25457a()) {
            try {
                handleException.handleException(gVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                C11827g.m25458b(C13986j0.m32425b(th, th2));
            }
        }
        try {
            C11894b.m25683a(th, new DiagnosticCoroutineContextException(gVar));
        } catch (Throwable unused2) {
        }
        C11827g.m25458b(th);
    }
}
