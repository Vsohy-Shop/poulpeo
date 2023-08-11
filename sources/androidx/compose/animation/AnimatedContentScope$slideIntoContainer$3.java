package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$slideIntoContainer$3 extends C12777p implements Function1<Integer, Integer> {
    final /* synthetic */ Function1<Integer, Integer> $initialOffset;
    final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$slideIntoContainer$3(Function1<? super Integer, Integer> function1, AnimatedContentScope<S> animatedContentScope) {
        super(1);
        this.$initialOffset = function1;
        this.this$0 = animatedContentScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        return this.$initialOffset.invoke(Integer.valueOf((-IntOffset.m38586getXimpl(this.this$0.m32799calculateOffsetemnUabE(IntSizeKt.IntSize(i, i), this.this$0.m32802getCurrentSizeYbymL2g()))) - i));
    }
}
