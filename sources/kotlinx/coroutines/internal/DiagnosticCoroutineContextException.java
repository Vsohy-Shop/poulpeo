package kotlinx.coroutines.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,50:1\n26#2:51\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n*L\n46#1:51\n*E\n"})
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: b */
    private final transient C12079g f20430b;

    public DiagnosticCoroutineContextException(C12079g gVar) {
        this.f20430b = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f20430b.toString();
    }
}
