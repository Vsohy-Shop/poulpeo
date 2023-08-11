package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", mo50610f = "InfiniteAnimationPolicy.kt", mo50611l = {31}, mo50612m = "invokeSuspend")
/* compiled from: InfiniteAnimationPolicy.kt */
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends C12746l implements Function1<C12074d<? super R>, Object> {
    final /* synthetic */ Function1<Long, R> $onFrame;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(Function1<? super Long, ? extends R> function1, C12074d<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> dVar) {
        super(1, dVar);
        this.$onFrame = function1;
    }

    public final C12074d<C11921v> create(C12074d<?> dVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, dVar);
    }

    public final Object invoke(C12074d<? super R> dVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Function1<Long, R> function1 = this.$onFrame;
            this.label = 1;
            obj = MonotonicFrameClockKt.withFrameNanos(function1, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
