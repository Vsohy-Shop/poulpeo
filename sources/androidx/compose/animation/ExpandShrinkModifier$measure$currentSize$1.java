package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$measure$currentSize$1 extends C12777p implements Function1<EnterExitState, IntSize> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandShrinkModifier$measure$currentSize$1(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m38620boximpl(m32865invokeYEO4UFw((EnterExitState) obj));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m32865invokeYEO4UFw(EnterExitState enterExitState) {
        C12775o.m28639i(enterExitState, "it");
        return this.this$0.m32863sizeByStateUzc_VyU(enterExitState, this.$measuredSize);
    }
}
