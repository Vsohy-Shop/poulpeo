package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$shrinkHorizontally$2 extends C12777p implements Function1<IntSize, IntSize> {
    final /* synthetic */ Function1<Integer, Integer> $targetWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$shrinkHorizontally$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$targetWidth = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m38620boximpl(m32853invokemzRDjE0(((IntSize) obj).m38632unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0  reason: not valid java name */
    public final long m32853invokemzRDjE0(long j) {
        return IntSizeKt.IntSize(this.$targetWidth.invoke(Integer.valueOf(IntSize.m38628getWidthimpl(j))).intValue(), IntSize.m38627getHeightimpl(j));
    }
}
