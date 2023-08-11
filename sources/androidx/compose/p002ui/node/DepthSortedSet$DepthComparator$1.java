package androidx.compose.p002ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1 */
/* compiled from: DepthSortedSet.kt */
public final class DepthSortedSet$DepthComparator$1 implements Comparator<LayoutNode> {
    DepthSortedSet$DepthComparator$1() {
    }

    public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        C12775o.m28639i(layoutNode, "l1");
        C12775o.m28639i(layoutNode2, "l2");
        int k = C12775o.m28641k(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
        if (k != 0) {
            return k;
        }
        return C12775o.m28641k(layoutNode.hashCode(), layoutNode2.hashCode());
    }
}
