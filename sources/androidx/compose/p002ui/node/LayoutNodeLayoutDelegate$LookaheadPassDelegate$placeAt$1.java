package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ long $position;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.$position = j;
    }

    public final void invoke() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j = this.$position;
        LookaheadDelegate lookaheadDelegate$ui_release = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        Placeable.PlacementScope.m37405place70tqf50$default(companion, lookaheadDelegate$ui_release, j, 0.0f, 2, (Object) null);
    }
}
