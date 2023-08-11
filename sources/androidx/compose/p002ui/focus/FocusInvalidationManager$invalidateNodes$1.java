package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,141:1\n1855#2:142\n1856#2:173\n1855#2:174\n1856#2:205\n1855#2,2:206\n87#3:143\n87#3:175\n340#4:144\n206#4,2:145\n208#4,7:150\n215#4,15:158\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n1182#5:147\n1161#5,2:148\n1182#5:179\n1161#5,2:180\n48#6:157\n48#6:189\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n64#1:142\n64#1:173\n73#1:174\n73#1:205\n121#1:206,2\n65#1:143\n87#1:175\n65#1:144\n65#1:145,2\n65#1:150,7\n65#1:158,15\n87#1:176\n87#1:177,2\n87#1:182,7\n87#1:190,15\n65#1:147\n65#1:148,2\n87#1:179\n87#1:180,2\n65#1:157\n87#1:189\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1 */
/* compiled from: FocusInvalidationManager.kt */
final class FocusInvalidationManager$invalidateNodes$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ FocusInvalidationManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusInvalidationManager$invalidateNodes$1(FocusInvalidationManager focusInvalidationManager) {
        super(0);
        this.this$0 = focusInvalidationManager;
    }

    public final void invoke() {
        FocusState focusState;
        Set access$getFocusPropertiesNodes$p = this.this$0.focusPropertiesNodes;
        FocusInvalidationManager focusInvalidationManager = this.this$0;
        Iterator it = access$getFocusPropertiesNodes$p.iterator();
        while (true) {
            int i = 16;
            if (it.hasNext()) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it.next();
                int r5 = NodeKind.m37625constructorimpl(1024);
                if (focusPropertiesModifierNode.getNode().isAttached()) {
                    MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
                    if (child$ui_release == null) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
                    } else {
                        mutableVector.add(child$ui_release);
                    }
                    while (mutableVector.isNotEmpty()) {
                        Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                        if ((node.getAggregateChildKindSet$ui_release() & r5) == 0) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                        } else {
                            while (true) {
                                if (node == null) {
                                    break;
                                } else if ((node.getKindSet$ui_release() & r5) == 0) {
                                    node = node.getChild$ui_release();
                                } else if (node instanceof FocusTargetModifierNode) {
                                    focusInvalidationManager.focusTargetNodes.add((FocusTargetModifierNode) node);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.this$0.focusPropertiesNodes.clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Set<FocusEventModifierNode> access$getFocusEventNodes$p = this.this$0.focusEventNodes;
                FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                for (FocusEventModifierNode focusEventModifierNode : access$getFocusEventNodes$p) {
                    if (!focusEventModifierNode.getNode().isAttached()) {
                        focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                    } else {
                        int r10 = NodeKind.m37625constructorimpl(1024);
                        if (focusEventModifierNode.getNode().isAttached()) {
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[i], 0);
                            Modifier.Node child$ui_release2 = focusEventModifierNode.getNode().getChild$ui_release();
                            if (child$ui_release2 == null) {
                                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusEventModifierNode.getNode());
                            } else {
                                mutableVector2.add(child$ui_release2);
                            }
                            FocusTargetModifierNode focusTargetModifierNode = null;
                            boolean z = true;
                            boolean z2 = false;
                            while (mutableVector2.isNotEmpty()) {
                                Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node2.getAggregateChildKindSet$ui_release() & r10) == 0) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
                                } else {
                                    while (true) {
                                        if (node2 == null) {
                                            break;
                                        } else if ((node2.getKindSet$ui_release() & r10) == 0) {
                                            node2 = node2.getChild$ui_release();
                                        } else if (node2 instanceof FocusTargetModifierNode) {
                                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) node2;
                                            if (focusTargetModifierNode != null) {
                                                z2 = true;
                                            }
                                            if (focusInvalidationManager2.focusTargetNodes.contains(focusTargetModifierNode2)) {
                                                linkedHashSet.add(focusTargetModifierNode2);
                                                z = false;
                                            }
                                            focusTargetModifierNode = focusTargetModifierNode2;
                                        }
                                    }
                                }
                            }
                            if (z) {
                                if (z2) {
                                    focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else if (focusTargetModifierNode == null || (focusState = focusTargetModifierNode.getFocusState()) == null) {
                                    focusState = FocusStateImpl.Inactive;
                                }
                                focusEventModifierNode.onFocusEvent(focusState);
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    i = 16;
                }
                this.this$0.focusEventNodes.clear();
                for (FocusTargetModifierNode focusTargetModifierNode3 : this.this$0.focusTargetNodes) {
                    if (focusTargetModifierNode3.isAttached()) {
                        FocusState focusState2 = focusTargetModifierNode3.getFocusState();
                        focusTargetModifierNode3.invalidateFocus$ui_release();
                        if (!C12775o.m28634d(focusState2, focusTargetModifierNode3.getFocusState()) || linkedHashSet.contains(focusTargetModifierNode3)) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode3);
                        }
                    }
                }
                this.this$0.focusTargetNodes.clear();
                linkedHashSet.clear();
                if (!this.this$0.focusPropertiesNodes.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!this.this$0.focusEventNodes.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!this.this$0.focusTargetNodes.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else {
                    return;
                }
            }
        }
    }
}
