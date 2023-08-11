package androidx.compose.animation.core;

import androidx.compose.p002ui.platform.InfiniteAnimationPolicy;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import p355hf.C12074d;

/* compiled from: InfiniteAnimationPolicy.kt */
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object withInfiniteAnimationFrameMillis(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        return withInfiniteAnimationFrameNanos(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(function1), dVar);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 = new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(function1);
        C12773m.m28630c(0);
        Object withInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, dVar);
        C12773m.m28630c(1);
        return withInfiniteAnimationFrameNanos;
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) dVar.getContext().get(InfiniteAnimationPolicy.Key);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.withFrameNanos(function1, dVar);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, (C12074d<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2>) null), dVar);
    }
}
