package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeChain;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,75:1\n87#2:76\n91#2:106\n87#2:107\n87#2:118\n340#3:77\n206#3,2:78\n208#3,7:83\n215#3,15:91\n78#3,9:109\n88#3,7:120\n1182#4:80\n1161#4,2:81\n48#5:90\n47#6:108\n196#7:119\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n45#1:76\n65#1:106\n65#1:107\n68#1:118\n45#1:77\n45#1:78,2\n45#1:83,7\n45#1:91,15\n65#1:109,9\n65#1:120,7\n45#1:80\n45#1:81,2\n45#1:90\n65#1:108\n68#1:119\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusEventModifierNodeKt */
/* compiled from: FocusEventModifierNode.kt */
public final class FocusEventModifierNodeKt {

    /* renamed from: androidx.compose.ui.focus.FocusEventModifierNodeKt$WhenMappings */
    /* compiled from: FocusEventModifierNode.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p002ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.FocusEventModifierNodeKt.WhenMappings.<clinit>():void");
        }
    }

    public static final FocusState getFocusState(FocusEventModifierNode focusEventModifierNode) {
        C12775o.m28639i(focusEventModifierNode, "<this>");
        int r0 = NodeKind.m37625constructorimpl(1024);
        if (focusEventModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusEventModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusEventModifierNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r0) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            continue;
                            break;
                        } else if ((node.getKindSet$ui_release() & r0) == 0) {
                            node = node.getChild$ui_release();
                        } else if (node instanceof FocusTargetModifierNode) {
                            FocusStateImpl focusStateImpl$ui_release = ((FocusTargetModifierNode) node).getFocusStateImpl$ui_release();
                            int i = WhenMappings.$EnumSwitchMapping$0[focusStateImpl$ui_release.ordinal()];
                            if (i == 1 || i == 2 || i == 3) {
                                return focusStateImpl$ui_release;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return FocusStateImpl.Inactive;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void refreshFocusEventNodes(FocusTargetModifierNode focusTargetModifierNode) {
        NodeChain nodes$ui_release;
        boolean z;
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        int r0 = NodeKind.m37625constructorimpl(4096) | NodeKind.m37625constructorimpl(1024);
        if (focusTargetModifierNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetModifierNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r0) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & r0) != 0) {
                            if ((NodeKind.m37625constructorimpl(1024) & parent$ui_release.getKindSet$ui_release()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                if (parent$ui_release instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) parent$ui_release;
                                    focusEventModifierNode.onFocusEvent(getFocusState(focusEventModifierNode));
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            } else {
                                return;
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) {
                    parent$ui_release = null;
                } else {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
