package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$callWithFrameNanos$2 extends C12777p implements Function1<Long, R> {
    final /* synthetic */ Function1<Long, R> $onFrame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$callWithFrameNanos$2(Function1<? super Long, ? extends R> function1) {
        super(1);
        this.$onFrame = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final R invoke(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / 1));
    }
}
