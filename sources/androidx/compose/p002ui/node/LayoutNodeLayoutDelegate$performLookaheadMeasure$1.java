package androidx.compose.p002ui.node;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class LayoutNodeLayoutDelegate$performLookaheadMeasure$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeLayoutDelegate$performLookaheadMeasure$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.$constraints = j;
    }

    public final void invoke() {
        LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        lookaheadDelegate$ui_release.m37365measureBRTryo0(this.$constraints);
    }
}
