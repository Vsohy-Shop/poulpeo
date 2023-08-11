package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n+ 2 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n685#2:1238\n686#2,2:1247\n685#2:1265\n686#2,2:1274\n163#3:1239\n163#3:1253\n163#3:1266\n460#4,7:1240\n467#4,4:1249\n460#4,11:1254\n460#4,7:1267\n467#4,4:1276\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n*L\n707#1:1238\n707#1:1247,2\n729#1:1265\n729#1:1274,2\n707#1:1239\n711#1:1253\n729#1:1266\n707#1:1240,7\n707#1:1249,4\n711#1:1254,11\n729#1:1267,7\n729#1:1276,4\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ LookaheadDelegate $lookaheadDelegate;
    final /* synthetic */ LayoutNodeLayoutDelegate.LookaheadPassDelegate this$0;
    final /* synthetic */ LayoutNodeLayoutDelegate this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LookaheadDelegate lookaheadDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
        this.this$1 = layoutNodeLayoutDelegate;
        this.$lookaheadDelegate = lookaheadDelegate;
    }

    public final void invoke() {
        MutableVector<LayoutNode> mutableVector = this.this$0.this$0.layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        int i = 0;
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = ((LayoutNode) content[i2]).getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                C12775o.m28636f(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.isPreviouslyPlaced = lookaheadPassDelegate$ui_release.isPlaced();
                lookaheadPassDelegate$ui_release.setPlaced(false);
                i2++;
            } while (i2 < size);
        }
        MutableVector<LayoutNode> mutableVector2 = this.this$1.layoutNode.get_children$ui_release();
        int size2 = mutableVector2.getSize();
        if (size2 > 0) {
            Object[] content2 = mutableVector2.getContent();
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content2[i3];
                if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                    layoutNode.setMeasuredByParentInLookahead$ui_release(LayoutNode.UsageByParent.NotUsed);
                }
                i3++;
            } while (i3 < size2);
        }
        this.this$0.forEachChildAlignmentLinesOwner(C10563.INSTANCE);
        this.$lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
        this.this$0.forEachChildAlignmentLinesOwner(C10574.INSTANCE);
        MutableVector<LayoutNode> mutableVector3 = this.this$0.this$0.layoutNode.get_children$ui_release();
        int size3 = mutableVector3.getSize();
        if (size3 > 0) {
            Object[] content3 = mutableVector3.getContent();
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = ((LayoutNode) content3[i]).getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                C12775o.m28636f(lookaheadPassDelegate$ui_release2);
                if (!lookaheadPassDelegate$ui_release2.isPlaced()) {
                    lookaheadPassDelegate$ui_release2.markSubtreeNotPlaced();
                }
                i++;
            } while (i < size3);
        }
    }
}
