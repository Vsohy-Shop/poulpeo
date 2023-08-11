package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideInVertically$2 extends C12777p implements Function1<IntSize, IntOffset> {
    final /* synthetic */ Function1<Integer, Integer> $initialOffsetY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$slideInVertically$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$initialOffsetY = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m38577boximpl(m32859invokemHKZG7I(((IntSize) obj).m38632unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I  reason: not valid java name */
    public final long m32859invokemHKZG7I(long j) {
        return IntOffsetKt.IntOffset(0, this.$initialOffsetY.invoke(Integer.valueOf(IntSize.m38627getHeightimpl(j))).intValue());
    }
}
