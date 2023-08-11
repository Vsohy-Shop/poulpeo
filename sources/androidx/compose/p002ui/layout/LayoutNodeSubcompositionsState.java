package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.SubcomposeLayoutState;
import androidx.compose.p002ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.platform.Wrapper_androidKt;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,774:1\n707#1:796\n707#1:810\n707#1:826\n707#1:831\n361#2,7:775\n361#2,7:782\n361#2,7:817\n480#3,4:789\n485#3:802\n480#3,4:803\n485#3:816\n122#4,3:793\n126#4:801\n122#4,3:807\n126#4:815\n1114#5,4:797\n1114#5,4:811\n1114#5,4:827\n1114#5,4:832\n1114#5,4:836\n1114#5,2:840\n1116#5,2:844\n215#6,2:824\n1855#7,2:842\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n437#1:796\n502#1:810\n695#1:826\n701#1:831\n398#1:775,7\n424#1:782,7\n630#1:817,7\n436#1:789,4\n436#1:802\n489#1:803,4\n489#1:816\n436#1:793,3\n436#1:801\n489#1:807,3\n489#1:815\n437#1:797,4\n502#1:811,4\n695#1:827,4\n701#1:832,4\n707#1:836,4\n710#1:840,2\n710#1:844,2\n686#1:824,2\n711#1:842,2\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState */
/* compiled from: SubcomposeLayout.kt */
public final class LayoutNodeSubcompositionsState {
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    private CompositionContext compositionContext;
    /* access modifiers changed from: private */
    public int currentIndex;
    private final Map<LayoutNode, NodeState> nodeToNodeState = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<Object, LayoutNode> precomposeMap = new LinkedHashMap();
    /* access modifiers changed from: private */
    public int precomposedCount;
    /* access modifiers changed from: private */
    public int reusableCount;
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet((Set) null, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final LayoutNode root;
    /* access modifiers changed from: private */
    public final Scope scope = new Scope();
    private final Map<Object, LayoutNode> slotIdToNode = new LinkedHashMap();
    private SubcomposeSlotReusePolicy slotReusePolicy;

    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope */
    /* compiled from: SubcomposeLayout.kt */
    private final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        public float getDensity() {
            return this.density;
        }

        public float getFontScale() {
            return this.fontScale;
        }

        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void setDensity(float f) {
            this.density = f;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection2) {
            C12775o.m28639i(layoutDirection2, "<set-?>");
            this.layoutDirection = layoutDirection2;
        }

        public List<Measurable> subcompose(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
            C12775o.m28639i(oVar, "content");
            return LayoutNodeSubcompositionsState.this.subcompose(obj, oVar);
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        C12775o.m28639i(layoutNode, "root");
        C12775o.m28639i(subcomposeSlotReusePolicy, "slotReusePolicy");
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    private final LayoutNode createNodeAt(int i) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, (DefaultConstructorMarker) null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(i, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    private final Object getSlotIdAtIndex(int i) {
        NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i));
        C12775o.m28636f(nodeState);
        return nodeState.getSlotId();
    }

    private final void ignoreRemeasureRequests(C13074a<C11921v> aVar) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        aVar.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    /* access modifiers changed from: private */
    public final void move(int i, int i2, int i3) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(i, i2, i3);
        layoutNode.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.move(i, i2, i3);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final Composition subcomposeInto(Composition composition, LayoutNode layoutNode, CompositionContext compositionContext2, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        if (composition == null || composition.isDisposed()) {
            composition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext2);
        }
        composition.setContent(oVar);
        return composition;
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i2 = size - this.reusableCount;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            } else if (C12775o.m28634d(getSlotIdAtIndex(i4), obj)) {
                i = i4;
                break;
            } else {
                i4--;
            }
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i3));
                C12775o.m28636f(nodeState);
                NodeState nodeState2 = nodeState;
                if (this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            move(i4, i2, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i2);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        C12775o.m28636f(nodeState3);
        NodeState nodeState4 = nodeState3;
        nodeState4.setActive(true);
        nodeState4.setForceRecompose(true);
        Snapshot.Companion.sendApplyNotifications();
        return layoutNode;
    }

    public final MeasurePolicy createMeasurePolicy(C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> oVar) {
        C12775o.m28639i(oVar, "block");
        return new LayoutNodeSubcompositionsState$createMeasurePolicy$1(this, oVar, this.NoIntrinsicsMessage);
    }

    public final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        for (NodeState composition : this.nodeToNodeState.values()) {
            Composition composition2 = composition.getComposition();
            if (composition2 != null) {
                composition2.dispose();
            }
        }
        this.root.removeAll$ui_release();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    public final void disposeOrReuseStartingFromIndex(int i) {
        Snapshot makeCurrent;
        boolean z = false;
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (i <= size) {
            this.reusableSlotIdsSet.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                makeCurrent = createNonObservableSnapshot.makeCurrent();
                boolean z2 = false;
                while (size >= i) {
                    LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(size);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    C12775o.m28636f(nodeState);
                    NodeState nodeState2 = nodeState;
                    Object slotId = nodeState2.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                        this.reusableCount++;
                        if (nodeState2.getActive()) {
                            nodeState2.setActive(false);
                            z2 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        Composition composition = nodeState2.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui_release(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                }
                C11921v vVar = C11921v.f18618a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                z = z2;
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        if (z) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        for (Map.Entry<LayoutNode, NodeState> value : this.nodeToNodeState.entrySet()) {
            ((NodeState) value.getValue()).setForceRecompose(true);
        }
        if (!this.root.getMeasurePending$ui_release()) {
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, 1, (Object) null);
        }
    }

    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.nodeToNodeState.size() == this.root.getFoldedChildren$ui_release().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((this.root.getFoldedChildren$ui_release().size() - this.reusableCount) - this.precomposedCount >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.precomposeMap.size() != this.precomposedCount) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.root.getFoldedChildren$ui_release().size() + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + this.root.getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "content");
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            Map<Object, LayoutNode> map = this.precomposeMap;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNode), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNode = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                map.put(obj, layoutNode);
            }
            subcompose(layoutNode, obj, oVar);
        }
        return new LayoutNodeSubcompositionsState$precompose$1(this, obj);
    }

    public final void setCompositionContext(CompositionContext compositionContext2) {
        this.compositionContext = compositionContext2;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        C12775o.m28639i(subcomposeSlotReusePolicy, "value");
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            disposeOrReuseStartingFromIndex(0);
        }
    }

    public final List<Measurable> subcompose(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "content");
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        boolean z = false;
        if (layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut) {
            Map<Object, LayoutNode> map = this.slotIdToNode;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                layoutNode = this.precomposeMap.remove(obj);
                if (layoutNode != null) {
                    int i = this.precomposedCount;
                    if (i > 0) {
                        this.precomposedCount = i - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    layoutNode = takeNodeFromReusables(obj);
                    if (layoutNode == null) {
                        layoutNode = createNodeAt(this.currentIndex);
                    }
                }
                map.put(obj, layoutNode);
            }
            LayoutNode layoutNode2 = layoutNode;
            int indexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
            int i2 = this.currentIndex;
            if (indexOf >= i2) {
                z = true;
            }
            if (z) {
                if (i2 != indexOf) {
                    move$default(this, indexOf, i2, 0, 4, (Object) null);
                }
                this.currentIndex++;
                subcompose(layoutNode2, obj, oVar);
                return layoutNode2.getChildMeasurables$ui_release();
            }
            throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,774:1\n76#2:775\n102#2,2:776\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n*L\n730#1:775\n730#1:776,2\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState */
    /* compiled from: SubcomposeLayout.kt */
    private static final class NodeState {
        private final MutableState active$delegate;
        private Composition composition;
        private C13088o<? super Composer, ? super Integer, C11921v> content;
        private boolean forceRecompose;
        private Object slotId;

        public NodeState(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composition composition2) {
            C12775o.m28639i(oVar, "content");
            this.slotId = obj;
            this.content = oVar;
            this.composition = composition2;
            this.active$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        }

        public final boolean getActive() {
            return ((Boolean) this.active$delegate.getValue()).booleanValue();
        }

        public final Composition getComposition() {
            return this.composition;
        }

        public final C13088o<Composer, Integer, C11921v> getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActive(boolean z) {
            this.active$delegate.setValue(Boolean.valueOf(z));
        }

        public final void setComposition(Composition composition2) {
            this.composition = composition2;
        }

        public final void setContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
            C12775o.m28639i(oVar, "<set-?>");
            this.content = oVar;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NodeState(Object obj, C13088o oVar, Composition composition2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, oVar, (i & 4) != 0 ? null : composition2);
        }
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        Map<LayoutNode, NodeState> map = this.nodeToNodeState;
        NodeState nodeState = map.get(layoutNode);
        if (nodeState == null) {
            nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m37307getLambda1$ui_release(), (Composition) null, 4, (DefaultConstructorMarker) null);
            map.put(layoutNode, nodeState);
        }
        NodeState nodeState2 = nodeState;
        Composition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState2.getContent() != oVar || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(oVar);
            subcompose(layoutNode, nodeState2);
            nodeState2.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode layoutNode, NodeState nodeState) {
        Snapshot makeCurrent;
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            C13088o<Composer, Integer, C11921v> content = nodeState.getContent();
            Composition composition = nodeState.getComposition();
            CompositionContext compositionContext2 = this.compositionContext;
            if (compositionContext2 != null) {
                nodeState.setComposition(subcomposeInto(composition, layoutNode, compositionContext2, ComposableLambdaKt.composableLambdaInstance(-34810602, true, new LayoutNodeSubcompositionsState$subcompose$3$1$1(nodeState, content))));
                layoutNode2.ignoreRemeasureRequests = false;
                C11921v vVar = C11921v.f18618a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
