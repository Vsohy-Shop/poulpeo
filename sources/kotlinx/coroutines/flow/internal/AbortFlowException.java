package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10967g;

@SourceDebugExtension({"SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,30:1\n26#2:31\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n*L\n17#1:31\n*E\n"})
/* compiled from: FlowExceptions.kt */
public final class AbortFlowException extends CancellationException {

    /* renamed from: b */
    public final transient C10967g<?> f20429b;

    public AbortFlowException(C10967g<?> gVar) {
        super("Flow was aborted, no more elements needed");
        this.f20429b = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
