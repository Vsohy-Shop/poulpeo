package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
/* compiled from: Timeout.kt */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: b */
    public final transient C14054y1 f20428b;

    public TimeoutCancellationException(String str, C14054y1 y1Var) {
        super(str);
        this.f20428b = y1Var;
    }

    public TimeoutCancellationException(String str) {
        this(str, (C14054y1) null);
    }
}
