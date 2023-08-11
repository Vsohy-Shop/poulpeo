package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,381:1\n262#1,11:404\n276#1,9:415\n78#1,17:424\n171#1,25:441\n206#1,2:466\n208#1,7:471\n215#1,15:479\n237#1,2:494\n239#1,20:499\n1182#2:382\n1161#2,2:383\n1182#2:397\n1161#2,2:398\n1182#2:401\n1161#2,2:402\n1182#2:468\n1161#2,2:469\n1182#2:496\n1161#2,2:497\n48#3:385\n492#3,11:386\n48#3:400\n48#3:478\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n290#1:404,11\n298#1:415,9\n314#1:424,17\n334#1:441,25\n340#1:466,2\n340#1:471,7\n340#1:479,15\n346#1:494,2\n346#1:499,20\n143#1:382\n143#1:383,2\n207#1:397\n207#1:398,2\n238#1:401\n238#1:402,2\n340#1:468\n340#1:469,2\n346#1:496\n346#1:497,2\n150#1:385\n199#1:386,11\n214#1:400\n340#1:478\n*E\n"})
/* renamed from: androidx.compose.ui.node.DelegatableNodeKt */
/* compiled from: DelegatableNode.kt */
public final class DelegatableNodeKt {
    /* access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector2.getContent();
            do {
                mutableVector.add(((LayoutNode) content[i]).getNodes$ui_release().getHead$ui_release());
                i--;
            } while (i >= 0);
        }
    }

    @ExperimentalComposeUiApi
    public static final List<Modifier.Node> ancestors(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui_release;
        C12775o.m28639i(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            ArrayList arrayList = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(parent$ui_release);
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
            return arrayList;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: ancestors-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m37461ancestors64DMado(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "$this$ancestors");
        List<Modifier.Node> ancestors = ancestors(delegatableNode, i);
        if (ancestors instanceof List) {
            return ancestors;
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node firstChild(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & i) != 0) {
                            return node;
                        }
                        node = node.getChild$ui_release();
                    }
                    continue;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: firstChild-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m37462firstChild64DMado(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "$this$firstChild");
        T firstChild = firstChild(delegatableNode, i);
        C12775o.m28644n(2, ExifInterface.GPS_DIRECTION_TRUE);
        return firstChild;
    }

    @ExperimentalComposeUiApi
    /* renamed from: has-64DMado  reason: not valid java name */
    public static final boolean m37463has64DMado(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "$this$has");
        if ((delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i) != 0) {
            return true;
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        C12775o.m28639i(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, (Object) null);
        }
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node localChild(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "<this>");
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* renamed from: localChild-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m37464localChild64DMado(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "$this$localChild");
        T localChild = localChild(delegatableNode, i);
        C12775o.m28644n(2, ExifInterface.GPS_DIRECTION_TRUE);
        return localChild;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node localParent(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "<this>");
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                return parent$ui_release;
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* renamed from: localParent-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m37465localParent64DMado(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "$this$localParent");
        T localParent = localParent(delegatableNode, i);
        C12775o.m28644n(2, ExifInterface.GPS_DIRECTION_TRUE);
        return localParent;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui_release;
        C12775o.m28639i(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            return parent$ui_release;
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
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: nearestAncestor-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m37466nearestAncestor64DMado(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "$this$nearestAncestor");
        T nearestAncestor = nearestAncestor(delegatableNode, i);
        C12775o.m28644n(2, ExifInterface.GPS_DIRECTION_TRUE);
        return nearestAncestor;
    }

    @ExperimentalComposeUiApi
    /* renamed from: requireCoordinator-64DMado  reason: not valid java name */
    public static final NodeCoordinator m37467requireCoordinator64DMado(DelegatableNode delegatableNode, int i) {
        C12775o.m28639i(delegatableNode, "$this$requireCoordinator");
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        C12775o.m28636f(coordinator$ui_release);
        if (coordinator$ui_release.getTail() != delegatableNode || !NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator$ui_release;
        }
        NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
        C12775o.m28636f(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @ExperimentalComposeUiApi
    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        C12775o.m28639i(delegatableNode, "<this>");
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @ExperimentalComposeUiApi
    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        C12775o.m28639i(delegatableNode, "<this>");
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void visitAncestors(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, C11921v> function1) {
        NodeChain nodes$ui_release;
        C12775o.m28639i(delegatableNode, "<this>");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            function1.invoke(parent$ui_release);
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

    @ExperimentalComposeUiApi
    /* renamed from: visitAncestors-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m37468visitAncestors6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, C11921v> function1) {
        NodeChain nodes$ui_release;
        C12775o.m28639i(delegatableNode, "$this$visitAncestors");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                            C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(parent$ui_release);
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

    @ExperimentalComposeUiApi
    public static final void visitChildren(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "<this>");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & i) != 0) {
                            function1.invoke(node);
                            break;
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitChildren-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m37469visitChildren6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "$this$visitChildren");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & i) != 0) {
                            C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(node);
                            break;
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalChildren(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "<this>");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                        function1.invoke(child$ui_release);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitLocalChildren-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m37470visitLocalChildren6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "$this$visitLocalChildren");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                        C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                        function1.invoke(child$ui_release);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalParents(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "<this>");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                    function1.invoke(parent$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitLocalParents-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m37471visitLocalParents6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "$this$visitLocalParents");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                    C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                    function1.invoke(parent$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtree(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "<this>");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                            function1.invoke(child$ui_release);
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                    child$ui_release = null;
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitSubtree-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m37472visitSubtree6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(delegatableNode, "$this$visitSubtree");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                            C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(child$ui_release);
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                    child$ui_release = null;
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, Boolean> function1) {
        C12775o.m28639i(delegatableNode, "<this>");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                    Modifier.Node node2 = node;
                    while (true) {
                        if (node2 != null) {
                            if ((node2.getKindSet$ui_release() & i) != 0 && !function1.invoke(node2).booleanValue()) {
                                break;
                            }
                            node2 = node2.getChild$ui_release();
                        } else {
                            break;
                        }
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitSubtreeIf-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m37473visitSubtreeIf6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(delegatableNode, "$this$visitSubtreeIf");
        C12775o.m28639i(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                    Modifier.Node node2 = node;
                    while (true) {
                        if (node2 == null) {
                            break;
                        }
                        if ((node2.getKindSet$ui_release() & i) != 0) {
                            C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!function1.invoke(node2).booleanValue()) {
                                break;
                            }
                        }
                        node2 = node2.getChild$ui_release();
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
