package androidx.compose.runtime;

import androidx.compose.animation.core.AnimationKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2\n*L\n1#1,120:1\n*E\n"})
/* compiled from: MonotonicFrameClock.kt */
public final class MonotonicFrameClockKt$withFrameMillis$2 extends C12777p implements Function1<Long, R> {
    final /* synthetic */ Function1<Long, R> $onFrame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonotonicFrameClockKt$withFrameMillis$2(Function1<? super Long, ? extends R> function1) {
        super(1);
        this.$onFrame = function1;
    }

    public final R invoke(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / AnimationKt.MillisToNanos));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
