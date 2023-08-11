package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$slideOutOfContainer$5 extends C12777p implements Function1<Integer, Integer> {
    final /* synthetic */ Function1<Integer, Integer> $targetOffset;
    final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$slideOutOfContainer$5(AnimatedContentScope<S> animatedContentScope, Function1<? super Integer, Integer> function1) {
        super(1);
        this.this$0 = animatedContentScope;
        this.$targetOffset = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        State state = this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
        long r0 = state != null ? ((IntSize) state.getValue()).m38632unboximpl() : IntSize.Companion.m38633getZeroYbymL2g();
        return this.$targetOffset.invoke(Integer.valueOf((-IntOffset.m38587getYimpl(this.this$0.m32799calculateOffsetemnUabE(IntSizeKt.IntSize(i, i), r0))) + IntSize.m38627getHeightimpl(r0)));
    }
}
