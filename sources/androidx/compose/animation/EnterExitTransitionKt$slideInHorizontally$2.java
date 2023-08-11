package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideInHorizontally$2 extends C12777p implements Function1<IntSize, IntOffset> {
    final /* synthetic */ Function1<Integer, Integer> $initialOffsetX;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$slideInHorizontally$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$initialOffsetX = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m38577boximpl(m32856invokemHKZG7I(((IntSize) obj).m38632unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I  reason: not valid java name */
    public final long m32856invokemHKZG7I(long j) {
        return IntOffsetKt.IntOffset(this.$initialOffsetX.invoke(Integer.valueOf(IntSize.m38628getWidthimpl(j))).intValue(), 0);
    }
}
