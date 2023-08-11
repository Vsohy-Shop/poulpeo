package androidx.compose.p002ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.jvm.functions.Function1;
import p355hf.C12074d;

/* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt */
/* compiled from: InfiniteAnimationPolicy.kt */
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object withInfiniteAnimationFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) dVar.getContext().get(InfiniteAnimationPolicy.Key);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.withFrameNanos(function1, dVar);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, (C12074d<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2>) null), dVar);
    }
}
