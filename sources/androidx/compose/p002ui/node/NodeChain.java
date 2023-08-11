package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.ModifierInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,751:1\n633#1,6:763\n641#1,3:770\n644#1,3:776\n664#1,6:779\n610#1,8:785\n633#1,3:793\n618#1,2:796\n611#1,12:798\n636#1,3:810\n623#1:813\n613#1:814\n616#1,2:815\n633#1,3:817\n618#1,5:820\n636#1,3:825\n623#1:828\n633#1,6:829\n655#1,15:835\n664#1,6:850\n649#1,21:856\n610#1,8:877\n633#1,3:885\n618#1,2:888\n611#1,12:890\n636#1,3:902\n623#1:905\n613#1:906\n641#1,6:907\n1162#2:752\n1182#2:753\n1161#2,2:754\n1162#2:769\n523#3:756\n523#3:757\n523#3:758\n523#3:759\n523#3:773\n728#3,2:774\n1#4:760\n69#5:761\n196#6:762\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n268#1:763,6\n295#1:770,3\n295#1:776,3\n306#1:779,6\n603#1:785,8\n603#1:793,3\n603#1:796,2\n603#1:798,12\n603#1:810,3\n603#1:813\n603#1:814\n610#1:815,2\n610#1:817,3\n610#1:820,5\n610#1:825,3\n610#1:828\n617#1:829,6\n649#1:835,15\n656#1:850,6\n672#1:856,21\n679#1:877,8\n679#1:885,3\n679#1:888,2\n679#1:890,12\n679#1:902,3\n679#1:905\n679#1:906\n695#1:907,6\n100#1:752\n101#1:753\n101#1:754,2\n293#1:769\n112#1:756\n113#1:757\n175#1:758\n190#1:759\n297#1:773\n297#1:774,2\n243#1:761\n243#1:762\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeChain */
/* compiled from: NodeChain.kt */
public final class NodeChain {
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    /* access modifiers changed from: private */
    public Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    @SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,751:1\n523#2:752\n523#2:753\n523#2:754\n523#2:755\n523#2:756\n523#2:757\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n348#1:752\n353#1:753\n356#1:754\n363#1:755\n369#1:756\n370#1:757\n*E\n"})
    /* renamed from: androidx.compose.ui.node.NodeChain$Differ */
    /* compiled from: NodeChain.kt */
    private final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private int aggregateChildKindSet;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        final /* synthetic */ NodeChain this$0;

        public Differ(NodeChain nodeChain, Modifier.Node node2, int i, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2) {
            C12775o.m28639i(node2, "node");
            C12775o.m28639i(mutableVector, "before");
            C12775o.m28639i(mutableVector2, "after");
            this.this$0 = nodeChain;
            this.node = node2;
            this.aggregateChildKindSet = i;
            this.before = mutableVector;
            this.after = mutableVector2;
        }

        public boolean areItemsTheSame(int i, int i2) {
            if (NodeChainKt.actionForModifiers((Modifier.Element) this.before.getContent()[i], (Modifier.Element) this.after.getContent()[i2]) != 0) {
                return true;
            }
            return false;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        public void insert(int i, int i2) {
            Modifier.Node node2 = this.node;
            Modifier.Node access$createAndInsertNodeAsParent = this.this$0.createAndInsertNodeAsParent((Modifier.Element) this.after.getContent()[i2], node2);
            this.node = access$createAndInsertNodeAsParent;
            if (!access$createAndInsertNodeAsParent.isAttached()) {
                this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                Logger access$getLogger$p = this.this$0.logger;
                if (access$getLogger$p != null) {
                    access$getLogger$p.nodeInserted(i, i2, (Modifier.Element) this.after.getContent()[i2], node2, this.node);
                }
                int kindSet$ui_release = this.aggregateChildKindSet | this.node.getKindSet$ui_release();
                this.aggregateChildKindSet = kindSet$ui_release;
                this.node.setAggregateChildKindSet$ui_release(kindSet$ui_release);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void remove(int i) {
            Modifier.Node parent$ui_release = this.node.getParent$ui_release();
            C12775o.m28636f(parent$ui_release);
            this.node = parent$ui_release;
            Logger access$getLogger$p = this.this$0.logger;
            if (access$getLogger$p != null) {
                access$getLogger$p.nodeRemoved(i, (Modifier.Element) this.before.getContent()[i], this.node);
            }
            this.node = this.this$0.detachAndRemoveNode(this.node);
        }

        public void same(int i, int i2) {
            Modifier.Node parent$ui_release = this.node.getParent$ui_release();
            C12775o.m28636f(parent$ui_release);
            this.node = parent$ui_release;
            Modifier.Element element = (Modifier.Element) this.before.getContent()[i];
            Modifier.Element element2 = (Modifier.Element) this.after.getContent()[i2];
            if (!C12775o.m28634d(element, element2)) {
                Modifier.Node node2 = this.node;
                this.node = this.this$0.updateNodeAndReplaceIfNeeded(element, element2, node2);
                Logger access$getLogger$p = this.this$0.logger;
                if (access$getLogger$p != null) {
                    access$getLogger$p.nodeUpdated(i, i2, element, element2, node2, this.node);
                }
            } else {
                Logger access$getLogger$p2 = this.this$0.logger;
                if (access$getLogger$p2 != null) {
                    access$getLogger$p2.nodeReused(i, i2, element, element2, this.node);
                }
            }
            int kindSet$ui_release = this.aggregateChildKindSet | this.node.getKindSet$ui_release();
            this.aggregateChildKindSet = kindSet$ui_release;
            this.node.setAggregateChildKindSet$ui_release(kindSet$ui_release);
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            C12775o.m28639i(mutableVector, "<set-?>");
            this.after = mutableVector;
        }

        public final void setAggregateChildKindSet(int i) {
            this.aggregateChildKindSet = i;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            C12775o.m28639i(mutableVector, "<set-?>");
            this.before = mutableVector;
        }

        public final void setNode(Modifier.Node node2) {
            C12775o.m28639i(node2, "<set-?>");
            this.node = node2;
        }
    }

    /* renamed from: androidx.compose.ui.node.NodeChain$Logger */
    /* compiled from: NodeChain.kt */
    public interface Logger {
        void linearDiffAborted(int i, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i, int i2, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i, int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i, int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node, Modifier.Node node2);
    }

    public NodeChain(LayoutNode layoutNode2) {
        C12775o.m28639i(layoutNode2, "layoutNode");
        this.layoutNode = layoutNode2;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode2);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        Modifier.Node tail2 = innerNodeCoordinator.getTail();
        this.tail = tail2;
        this.head = tail2;
    }

    /* access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsParent(Modifier.Element element, Modifier.Node node) {
        Modifier.Node node2;
        if (element instanceof ModifierNodeElement) {
            node2 = ((ModifierNodeElement) element).create();
            node2.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(node2));
        } else {
            node2 = new BackwardsCompatNode(element);
        }
        if (!node2.isAttached()) {
            node2.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            return insertParent(node2, node);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.detach$ui_release();
        }
        return removeNode(node);
    }

    /* access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    private final Differ getDiffer(Modifier.Node node, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(this, node, node.getAggregateChildKindSet$ui_release(), mutableVector, mutableVector2);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setAggregateChildKindSet(node.getAggregateChildKindSet$ui_release());
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        return differ;
    }

    private final Modifier.Node insertParent(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node parent$ui_release = node2.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(node);
            node.setParent$ui_release(parent$ui_release);
        }
        node2.setParent$ui_release(node);
        node.setChild$ui_release(node2);
        return node;
    }

    private final boolean isUpdating() {
        if (this.head == NodeChainKt.SentinelHead) {
            return true;
        }
        return false;
    }

    private final void padChain() {
        boolean z;
        if (this.head != NodeChainKt.SentinelHead) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Modifier.Node node = this.head;
            node.setParent$ui_release(NodeChainKt.SentinelHead);
            NodeChainKt.SentinelHead.setChild$ui_release(node);
            this.head = NodeChainKt.SentinelHead;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release((Modifier.Node) null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release((Modifier.Node) null);
        }
        C12775o.m28636f(child$ui_release);
        return child$ui_release;
    }

    private final Modifier.Node replaceNode(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (parent$ui_release != null) {
            node2.setParent$ui_release(parent$ui_release);
            parent$ui_release.setChild$ui_release(node2);
            node.setParent$ui_release((Modifier.Node) null);
        }
        Modifier.Node child$ui_release = node.getChild$ui_release();
        if (child$ui_release != null) {
            node2.setChild$ui_release(child$ui_release);
            child$ui_release.setParent$ui_release(node2);
            node.setChild$ui_release((Modifier.Node) null);
        }
        node2.updateCoordinator$ui_release(node.getCoordinator$ui_release());
        return node2;
    }

    private final void structuralUpdate(MutableVector<Modifier.Element> mutableVector, int i, MutableVector<Modifier.Element> mutableVector2, int i2, Modifier.Node node) {
        MyersDiffKt.executeDiff(i, i2, getDiffer(node, mutableVector, mutableVector2));
    }

    private final void syncCoordinators() {
        NodeCoordinator nodeCoordinator;
        boolean z;
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator2 = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((NodeKind.m37625constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(parent$ui_release instanceof LayoutModifierNode)) {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator2);
            } else {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    C12775o.m28637g(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator2.getLayoutModifierNode();
                    layoutModifierNodeCoordinator2.setLayoutModifierNode$ui_release((LayoutModifierNode) parent$ui_release);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator2.onLayoutModifierNodeChanged();
                        layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator3 = new LayoutModifierNodeCoordinator(this.layoutNode, (LayoutModifierNode) parent$ui_release);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator3);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator3;
                }
                nodeCoordinator2.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator2);
                nodeCoordinator2 = layoutModifierNodeCoordinator;
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release2 != null) {
            nodeCoordinator = parent$ui_release2.getInnerCoordinator$ui_release();
        } else {
            nodeCoordinator = null;
        }
        nodeCoordinator2.setWrappedBy$ui_release(nodeCoordinator);
        this.outerCoordinator = nodeCoordinator2;
    }

    private final void trimChain() {
        boolean z;
        boolean z2 = true;
        if (this.head == NodeChainKt.SentinelHead) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Modifier.Node child$ui_release = NodeChainKt.SentinelHead.getChild$ui_release();
            if (child$ui_release == null) {
                child$ui_release = this.tail;
            }
            this.head = child$ui_release;
            child$ui_release.setParent$ui_release((Modifier.Node) null);
            NodeChainKt.SentinelHead.setChild$ui_release((Modifier.Node) null);
            if (this.head == NodeChainKt.SentinelHead) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* access modifiers changed from: private */
    public final Modifier.Node updateNodeAndReplaceIfNeeded(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            ModifierNodeElement modifierNodeElement = (ModifierNodeElement) element2;
            Modifier.Node access$updateUnsafe = NodeChainKt.updateUnsafe(modifierNodeElement, node);
            if (access$updateUnsafe == node) {
                if (modifierNodeElement.getAutoInvalidate()) {
                    if (access$updateUnsafe.isAttached()) {
                        NodeKindKt.autoInvalidateUpdatedNode(access$updateUnsafe);
                    } else {
                        access$updateUnsafe.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                    }
                }
                return access$updateUnsafe;
            } else if (!access$updateUnsafe.isAttached()) {
                access$updateUnsafe.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                if (node.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(node);
                    node.detach$ui_release();
                }
                return replaceNode(node, access$updateUnsafe);
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } else if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).setElement(element2);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            }
            return node;
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    public final void attach() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if (!head$ui_release.isAttached()) {
                head$ui_release.attach$ui_release();
                if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                    NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
                }
                if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                    NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
                }
                head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
                head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
            }
        }
    }

    public final void detach$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.detach$ui_release();
            }
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release  reason: not valid java name */
    public final /* synthetic */ <T> T m37574firstFromHeadaLcG6gQ$ui_release(int i, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "block");
        if ((getAggregateChildKindSet() & i) == 0) {
            return null;
        }
        for (T head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                if (function1.invoke(head$ui_release).booleanValue()) {
                    return head$ui_release;
                }
            }
            if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                return null;
            }
        }
        return null;
    }

    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return C12726w.m28524k();
        }
        int i = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            NodeCoordinator coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release != null) {
                mutableVector2.add(new ModifierInfo((Modifier) mutableVector.getContent()[i], coordinator$ui_release, coordinator$ui_release.getLayer()));
                head$ui_release = head$ui_release.getChild$ui_release();
                i++;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return mutableVector2.asMutableList();
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public final boolean has$ui_release(int i) {
        if ((i & getAggregateChildKindSet()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: has-H91voCI$ui_release  reason: not valid java name */
    public final boolean m37575hasH91voCI$ui_release(int i) {
        if ((i & getAggregateChildKindSet()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: head-H91voCI$ui_release  reason: not valid java name */
    public final /* synthetic */ <T> T m37576headH91voCI$ui_release(int i) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return null;
        }
        T head$ui_release = getHead$ui_release();
        while (head$ui_release != null) {
            if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                return head$ui_release;
            } else if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
                return null;
            } else {
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int i, Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        if ((getAggregateChildKindSet() & i) != 0) {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (head$ui_release != null) {
                if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                    function1.invoke(head$ui_release);
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    head$ui_release = head$ui_release.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release  reason: not valid java name */
    public final /* synthetic */ <T> void m37577headToTailaLcG6gQ$ui_release(int i, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        if ((getAggregateChildKindSet() & i) != 0) {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (head$ui_release != null) {
                if ((head$ui_release.getKindSet$ui_release() & i) != 0) {
                    C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                    function1.invoke(head$ui_release);
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    head$ui_release = head$ui_release.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        Modifier.Node head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            function1.invoke(head$ui_release);
            head$ui_release = head$ui_release.getChild$ui_release();
        }
    }

    public final void resetState$ui_release() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector != null) {
            int size = mutableVector.getSize();
            Modifier.Node parent$ui_release = this.tail.getParent$ui_release();
            int i = size - 1;
            while (parent$ui_release != null && i >= 0) {
                if (parent$ui_release.isAttached()) {
                    parent$ui_release.reset$ui_release();
                    parent$ui_release.detach$ui_release();
                }
                parent$ui_release = parent$ui_release.getParent$ui_release();
                i--;
            }
        }
    }

    /* renamed from: tail-H91voCI$ui_release  reason: not valid java name */
    public final /* synthetic */ <T> T m37578tailH91voCI$ui_release(int i) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return null;
        }
        for (T tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((tail$ui_release.getKindSet$ui_release() & i) != 0) {
                C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                return tail$ui_release;
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int i, Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        if ((getAggregateChildKindSet() & i) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i) != 0) {
                    function1.invoke(tail$ui_release);
                }
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release  reason: not valid java name */
    public final /* synthetic */ <T> void m37579tailToHeadaLcG6gQ$ui_release(int i, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        if ((getAggregateChildKindSet() & i) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i) != 0) {
                    C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                    function1.invoke(tail$ui_release);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head != this.tail) {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateFrom$ui_release(androidx.compose.p002ui.Modifier r19) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            java.lang.String r1 = "m"
            kotlin.jvm.internal.C12775o.m28639i(r0, r1)
            r18.padChain()
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier$Element> r1 = r6.current
            r2 = 0
            if (r1 != 0) goto L_0x0018
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Element[] r3 = new androidx.compose.p002ui.Modifier.Element[r2]
            r1.<init>(r3, r2)
        L_0x0018:
            r7 = r1
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier$Element> r1 = r6.buffer
            if (r1 != 0) goto L_0x0026
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Element[] r3 = new androidx.compose.p002ui.Modifier.Element[r3]
            r1.<init>(r3, r2)
        L_0x0026:
            androidx.compose.runtime.collection.MutableVector r8 = androidx.compose.p002ui.node.NodeChainKt.fillVector(r0, r1)
            int r0 = r8.getSize()
            int r1 = r7.getSize()
            r9 = 1
            if (r0 != r1) goto L_0x00c7
            int r0 = r7.getSize()
            androidx.compose.ui.Modifier$Node r1 = r6.tail
            androidx.compose.ui.Modifier$Node r1 = r1.getParent$ui_release()
            int r0 = r0 - r9
            r3 = r2
            r4 = r3
        L_0x0042:
            if (r1 == 0) goto L_0x00a3
            if (r0 < 0) goto L_0x00a3
            java.lang.Object[] r5 = r7.getContent()
            r5 = r5[r0]
            r13 = r5
            androidx.compose.ui.Modifier$Element r13 = (androidx.compose.p002ui.Modifier.Element) r13
            java.lang.Object[] r5 = r8.getContent()
            r5 = r5[r0]
            r14 = r5
            androidx.compose.ui.Modifier$Element r14 = (androidx.compose.p002ui.Modifier.Element) r14
            int r5 = androidx.compose.p002ui.node.NodeChainKt.actionForModifiers(r13, r14)
            if (r5 == 0) goto L_0x0096
            if (r5 == r9) goto L_0x006f
            r10 = 2
            if (r5 == r10) goto L_0x0064
            goto L_0x0080
        L_0x0064:
            androidx.compose.ui.node.NodeChain$Logger r10 = r6.logger
            if (r10 == 0) goto L_0x0080
            r11 = r0
            r12 = r0
            r15 = r1
            r10.nodeReused(r11, r12, r13, r14, r15)
            goto L_0x0080
        L_0x006f:
            androidx.compose.ui.Modifier$Node r5 = r6.updateNodeAndReplaceIfNeeded(r13, r14, r1)
            androidx.compose.ui.node.NodeChain$Logger r10 = r6.logger
            if (r10 == 0) goto L_0x007f
            r11 = r0
            r12 = r0
            r15 = r1
            r16 = r5
            r10.nodeUpdated(r11, r12, r13, r14, r15, r16)
        L_0x007f:
            r1 = r5
        L_0x0080:
            boolean r5 = r1.isAttached()
            if (r5 != 0) goto L_0x0087
            r4 = r9
        L_0x0087:
            int r5 = r1.getKindSet$ui_release()
            r3 = r3 | r5
            r1.setAggregateChildKindSet$ui_release(r3)
            androidx.compose.ui.Modifier$Node r1 = r1.getParent$ui_release()
            int r0 = r0 + -1
            goto L_0x0042
        L_0x0096:
            androidx.compose.ui.node.NodeChain$Logger r3 = r6.logger
            if (r3 == 0) goto L_0x009d
            r3.linearDiffAborted(r0, r13, r14, r1)
        L_0x009d:
            int r0 = r0 + 1
            androidx.compose.ui.Modifier$Node r1 = r1.getChild$ui_release()
        L_0x00a3:
            r5 = r0
            r10 = r1
            if (r5 <= 0) goto L_0x00c4
            if (r10 == 0) goto L_0x00aa
            r2 = r9
        L_0x00aa:
            if (r2 == 0) goto L_0x00b8
            r0 = r18
            r1 = r7
            r2 = r5
            r3 = r8
            r4 = r5
            r5 = r10
            r0.structuralUpdate(r1, r2, r3, r4, r5)
            goto L_0x013f
        L_0x00b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            r9 = r4
            goto L_0x0140
        L_0x00c7:
            int r0 = r7.getSize()
            if (r0 != 0) goto L_0x00f9
            int r0 = r8.getSize()
            int r0 = r0 - r9
            androidx.compose.ui.Modifier$Node r1 = r6.tail
        L_0x00d4:
            r14 = r1
            if (r0 < 0) goto L_0x013f
            java.lang.Object[] r1 = r8.getContent()
            r1 = r1[r0]
            r13 = r1
            androidx.compose.ui.Modifier$Element r13 = (androidx.compose.p002ui.Modifier.Element) r13
            androidx.compose.ui.Modifier$Node r1 = r6.createAndInsertNodeAsParent(r13, r14)
            androidx.compose.ui.node.NodeChain$Logger r10 = r6.logger
            if (r10 == 0) goto L_0x00ee
            r11 = 0
            r12 = r0
            r15 = r1
            r10.nodeInserted(r11, r12, r13, r14, r15)
        L_0x00ee:
            int r3 = r1.getKindSet$ui_release()
            r2 = r2 | r3
            r1.setAggregateChildKindSet$ui_release(r2)
            int r0 = r0 + -1
            goto L_0x00d4
        L_0x00f9:
            int r0 = r8.getSize()
            if (r0 != 0) goto L_0x012e
            int r0 = r7.getSize()
            int r0 = r0 - r9
            androidx.compose.ui.Modifier$Node r1 = r6.tail
            androidx.compose.ui.Modifier$Node r1 = r1.getParent$ui_release()
        L_0x010a:
            if (r1 == 0) goto L_0x0128
            if (r0 < 0) goto L_0x0128
            androidx.compose.ui.node.NodeChain$Logger r3 = r6.logger
            if (r3 == 0) goto L_0x011d
            java.lang.Object[] r4 = r7.getContent()
            r4 = r4[r0]
            androidx.compose.ui.Modifier$Element r4 = (androidx.compose.p002ui.Modifier.Element) r4
            r3.nodeRemoved(r0, r4, r1)
        L_0x011d:
            androidx.compose.ui.Modifier$Node r3 = r1.getParent$ui_release()
            r6.detachAndRemoveNode(r1)
            int r0 = r0 + -1
            r1 = r3
            goto L_0x010a
        L_0x0128:
            r17 = r9
            r9 = r2
            r2 = r17
            goto L_0x0140
        L_0x012e:
            int r2 = r7.getSize()
            int r4 = r8.getSize()
            androidx.compose.ui.Modifier$Node r5 = r6.tail
            r0 = r18
            r1 = r7
            r3 = r8
            r0.structuralUpdate(r1, r2, r3, r4, r5)
        L_0x013f:
            r2 = r9
        L_0x0140:
            r6.current = r8
            r7.clear()
            r6.buffer = r7
            r18.trimChain()
            if (r2 == 0) goto L_0x014f
            r18.syncCoordinators()
        L_0x014f:
            if (r9 == 0) goto L_0x015c
            androidx.compose.ui.node.LayoutNode r0 = r6.layoutNode
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L_0x015c
            r18.attach()
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui_release(Logger logger2) {
        this.logger = logger2;
    }

    public final void tailToHead$ui_release(Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            function1.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            function1.invoke(head$ui_release);
        }
    }
}
