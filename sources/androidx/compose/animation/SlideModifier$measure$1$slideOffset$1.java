package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier$measure$1$slideOffset$1 extends C12777p implements Function1<EnterExitState, IntOffset> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlideModifier$measure$1$slideOffset$1(SlideModifier slideModifier, long j) {
        super(1);
        this.this$0 = slideModifier;
        this.$measuredSize = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m38577boximpl(m32884invokeBjo55l4((EnterExitState) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m32884invokeBjo55l4(EnterExitState enterExitState) {
        C12775o.m28639i(enterExitState, "it");
        return this.this$0.m32883targetValueByStateoFUgxo0(enterExitState, this.$measuredSize);
    }
}
