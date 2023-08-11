package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.SubcomposeLayoutState;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.LayoutNodeKt;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,774:1\n1114#2,4:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n*L\n677#1:775,4\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1 */
/* compiled from: SubcomposeLayout.kt */
public final class LayoutNodeSubcompositionsState$precompose$1 implements SubcomposeLayoutState.PrecomposedSlotHandle {
    final /* synthetic */ Object $slotId;
    final /* synthetic */ LayoutNodeSubcompositionsState this$0;

    LayoutNodeSubcompositionsState$precompose$1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Object obj) {
        this.this$0 = layoutNodeSubcompositionsState;
        this.$slotId = obj;
    }

    public void dispose() {
        boolean z;
        this.this$0.makeSureStateIsConsistent();
        LayoutNode layoutNode = (LayoutNode) this.this$0.precomposeMap.remove(this.$slotId);
        if (layoutNode != null) {
            boolean z2 = false;
            if (this.this$0.precomposedCount > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int indexOf = this.this$0.root.getFoldedChildren$ui_release().indexOf(layoutNode);
                if (indexOf >= this.this$0.root.getFoldedChildren$ui_release().size() - this.this$0.precomposedCount) {
                    z2 = true;
                }
                if (z2) {
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.this$0;
                    layoutNodeSubcompositionsState.reusableCount = layoutNodeSubcompositionsState.reusableCount + 1;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.this$0;
                    layoutNodeSubcompositionsState2.precomposedCount = layoutNodeSubcompositionsState2.precomposedCount - 1;
                    int size = (this.this$0.root.getFoldedChildren$ui_release().size() - this.this$0.precomposedCount) - this.this$0.reusableCount;
                    this.this$0.move(indexOf, size, 1);
                    this.this$0.disposeOrReuseStartingFromIndex(size);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public int getPlaceablesCount() {
        List<LayoutNode> children$ui_release;
        LayoutNode layoutNode = (LayoutNode) this.this$0.precomposeMap.get(this.$slotId);
        if (layoutNode == null || (children$ui_release = layoutNode.getChildren$ui_release()) == null) {
            return 0;
        }
        return children$ui_release.size();
    }

    /* renamed from: premeasure-0kLqBqw  reason: not valid java name */
    public void m37352premeasure0kLqBqw(int i, long j) {
        LayoutNode layoutNode = (LayoutNode) this.this$0.precomposeMap.get(this.$slotId);
        if (layoutNode != null && layoutNode.isAttached()) {
            int size = layoutNode.getChildren$ui_release().size();
            if (i < 0 || i >= size) {
                throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
            } else if (!layoutNode.isPlaced()) {
                LayoutNode access$getRoot$p = this.this$0.root;
                access$getRoot$p.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode).m37678measureAndLayout0kLqBqw(layoutNode.getChildren$ui_release().get(i), j);
                access$getRoot$p.ignoreRemeasureRequests = false;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }
}
