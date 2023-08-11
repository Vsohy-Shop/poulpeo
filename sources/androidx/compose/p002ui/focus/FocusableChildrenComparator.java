package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,273:1\n48#2:274\n523#2:275\n523#2:276\n1182#3:277\n1161#3,2:278\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n252#1:274\n256#1:275\n257#1:276\n264#1:277\n264#1:278,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusableChildrenComparator */
/* compiled from: OneDimensionalFocusSearch.kt */
final class FocusableChildrenComparator implements Comparator<FocusTargetModifierNode> {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }

    public int compare(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        if (focusTargetModifierNode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (focusTargetModifierNode2 != null) {
            int i = 0;
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode) && FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2)) {
                NodeCoordinator coordinator$ui_release = focusTargetModifierNode.getCoordinator$ui_release();
                LayoutNode layoutNode = null;
                LayoutNode layoutNode2 = coordinator$ui_release != null ? coordinator$ui_release.getLayoutNode() : null;
                if (layoutNode2 != null) {
                    NodeCoordinator coordinator$ui_release2 = focusTargetModifierNode2.getCoordinator$ui_release();
                    if (coordinator$ui_release2 != null) {
                        layoutNode = coordinator$ui_release2.getLayoutNode();
                    }
                    if (layoutNode == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (C12775o.m28634d(layoutNode2, layoutNode)) {
                        return 0;
                    } else {
                        MutableVector<LayoutNode> pathFromRoot = pathFromRoot(layoutNode2);
                        MutableVector<LayoutNode> pathFromRoot2 = pathFromRoot(layoutNode);
                        int min = Math.min(pathFromRoot.getSize() - 1, pathFromRoot2.getSize() - 1);
                        if (min >= 0) {
                            while (C12775o.m28634d(pathFromRoot.getContent()[i], pathFromRoot2.getContent()[i])) {
                                if (i != min) {
                                    i++;
                                }
                            }
                            return C12775o.m28641k(((LayoutNode) pathFromRoot.getContent()[i]).getPlaceOrder$ui_release(), ((LayoutNode) pathFromRoot2.getContent()[i]).getPlaceOrder$ui_release());
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode)) {
                return -1;
            } else {
                return FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) ? 1 : 0;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
