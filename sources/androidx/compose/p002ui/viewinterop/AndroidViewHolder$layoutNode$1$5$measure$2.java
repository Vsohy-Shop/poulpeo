package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$5$measure$2 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$5$measure$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, this.$layoutNode);
    }
}
