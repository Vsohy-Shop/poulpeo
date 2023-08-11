package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeChain;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http2.Http2Connection;

@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,436:1\n73#2:437\n73#2:471\n679#3:438\n610#3,8:439\n633#3,3:447\n618#3,2:450\n611#3:452\n680#3:453\n612#3,11:454\n636#3,3:465\n623#3:468\n613#3:469\n682#3:470\n603#3,15:472\n633#3,3:487\n618#3,2:490\n611#3:492\n604#3,19:493\n636#3,3:512\n623#3:515\n613#3:516\n606#3:517\n460#4,11:518\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n391#1:437\n395#1:471\n391#1:438\n391#1:439,8\n391#1:447,3\n391#1:450,2\n391#1:452\n391#1:453\n391#1:454,11\n391#1:465,3\n391#1:468\n391#1:469\n391#1:470\n395#1:472,15\n395#1:487,3\n395#1:490,2\n395#1:492\n395#1:493,19\n395#1:512,3\n395#1:515\n395#1:516\n395#1:517\n405#1:518,11\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsNodeKt */
/* compiled from: SemanticsNode.kt */
public final class SemanticsNodeKt {
    /* access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        C12775o.m28639i(layoutNode, "<this>");
        C12775o.m28639i(function1, "selector");
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    private static final List<SemanticsModifierNode> findOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsModifierNode> list) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            Object[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) content[i];
                SemanticsModifierNode outerSemantics = getOuterSemantics(layoutNode2);
                if (outerSemantics != null) {
                    list.add(outerSemantics);
                } else {
                    findOneLayerOfSemanticsWrappers(layoutNode2, list);
                }
                i++;
            } while (i < size);
        }
        return list;
    }

    static /* synthetic */ List findOneLayerOfSemanticsWrappers$default(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return findOneLayerOfSemanticsWrappers(layoutNode, list);
    }

    public static final SemanticsModifierNode getOuterMergingSemantics(LayoutNode layoutNode) {
        Modifier.Node node;
        C12775o.m28639i(layoutNode, "<this>");
        NodeChain nodes$ui_release = layoutNode.getNodes$ui_release();
        int r0 = NodeKind.m37625constructorimpl(8);
        if ((nodes$ui_release.getAggregateChildKindSet() & r0) != 0) {
            node = nodes$ui_release.getHead$ui_release();
            while (true) {
                if (node != null) {
                    if ((node.getKindSet$ui_release() & r0) == 0 || !(node instanceof SemanticsModifierNode) || !((SemanticsModifierNode) node).getSemanticsConfiguration().isMergingSemanticsOfDescendants()) {
                        if ((node.getAggregateChildKindSet$ui_release() & r0) == 0) {
                            break;
                        }
                        node = node.getChild$ui_release();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        node = null;
        return (SemanticsModifierNode) node;
    }

    public static final SemanticsModifierNode getOuterSemantics(LayoutNode layoutNode) {
        Modifier.Node node;
        C12775o.m28639i(layoutNode, "<this>");
        NodeChain nodes$ui_release = layoutNode.getNodes$ui_release();
        int r0 = NodeKind.m37625constructorimpl(8);
        if ((nodes$ui_release.getAggregateChildKindSet() & r0) != 0) {
            node = nodes$ui_release.getHead$ui_release();
            while (true) {
                if (node != null) {
                    if ((node.getKindSet$ui_release() & r0) == 0 || !(node instanceof SemanticsModifierNode)) {
                        if ((node.getAggregateChildKindSet$ui_release() & r0) == 0) {
                            break;
                        }
                        node = node.getChild$ui_release();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        node = null;
        return (SemanticsModifierNode) node;
    }

    /* access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    /* access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }

    public static /* synthetic */ void getOuterMergingSemantics$annotations(LayoutNode layoutNode) {
    }

    public static /* synthetic */ void getOuterSemantics$annotations(LayoutNode layoutNode) {
    }
}
