package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,557:1\n390#1,8:565\n399#1,5:584\n390#1,14:589\n390#1,14:614\n1182#2:558\n1161#2,2:559\n1182#2:561\n1161#2,2:562\n100#3:564\n100#3:573\n91#3,10:574\n460#4,11:603\n728#4,2:628\n460#4,11:630\n460#4,11:641\n460#4,11:653\n163#5:652\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n327#1:565,8\n327#1:584,5\n347#1:589,14\n370#1:614,14\n63#1:558\n63#1:559,2\n84#1:561\n84#1:562,2\n48#1:564\n328#1:573\n329#1:574,10\n359#1:603,11\n406#1:628,2\n410#1:630,11\n452#1:641,11\n499#1:653,11\n499#1:652\n*E\n"})
/* renamed from: androidx.compose.ui.node.MeasureAndLayoutDelegate */
/* compiled from: MeasureAndLayoutDelegate.kt */
public final class MeasureAndLayoutDelegate {
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration = 1;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
    private final OnPositionedDispatcher onPositionedDispatcher = new OnPositionedDispatcher();
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSet relayoutNodes;
    /* access modifiers changed from: private */
    public final LayoutNode root;
    private Constraints rootConstraints;

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest */
    /* compiled from: MeasureAndLayoutDelegate.kt */
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public PostponedRequest(LayoutNode layoutNode, boolean z, boolean z2) {
            C12775o.m28639i(layoutNode, "node");
            this.node = layoutNode;
            this.isLookahead = z;
            this.isForced = z2;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    /* renamed from: androidx.compose.ui.node.MeasureAndLayoutDelegate$WhenMappings */
    /* compiled from: MeasureAndLayoutDelegate.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.p002ui.node.LayoutNode.LayoutState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.MeasureAndLayoutDelegate.WhenMappings.<clinit>():void");
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        C12775o.m28639i(layoutNode, "root");
        this.root = layoutNode;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSet depthSortedSet = new DepthSortedSet(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSet;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        if (companion.getEnableExtraAssertions()) {
            layoutTreeConsistencyChecker = new LayoutTreeConsistencyChecker(layoutNode, depthSortedSet, mutableVector.asMutableList());
        } else {
            layoutTreeConsistencyChecker = null;
        }
        this.consistencyChecker = layoutTreeConsistencyChecker;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((Owner.OnLayoutCompletedListener) content[i]).onLayoutComplete();
                i++;
            } while (i < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA  reason: not valid java name */
    private final boolean m37566doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean z;
        if (layoutNode.getMLookaheadScope$ui_release() == null) {
            return false;
        }
        if (constraints != null) {
            z = layoutNode.m37503lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            z = LayoutNode.m37499lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, (Constraints) null, 1, (Object) null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (z && parent$ui_release != null) {
            if (parent$ui_release.getMLookaheadScope$ui_release() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, (Object) null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, (Object) null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, (Object) null);
            }
        }
        return z;
    }

    /* renamed from: doRemeasure-sdFAvZA  reason: not valid java name */
    private final boolean m37567doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean z;
        if (constraints != null) {
            z = layoutNode.m37504remeasure_Sx5XlM$ui_release(constraints);
        } else {
            z = LayoutNode.m37500remeasure_Sx5XlM$ui_release$default(layoutNode, (Constraints) null, 1, (Object) null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (z && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, (Object) null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, (Object) null);
            }
        }
        return z;
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        if (!layoutNode.getMeasurePending$ui_release() || !getMeasureAffectsParent(layoutNode)) {
            return false;
        }
        return true;
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        boolean z;
        AlignmentLines alignmentLines;
        if (!layoutNode.getLookaheadLayoutPending$ui_release()) {
            return false;
        }
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) {
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
            if (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, C13074a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(aVar);
    }

    /* JADX INFO: finally extract failed */
    private final void performMeasureAndLayout(C13074a<C11921v> aVar) {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                aVar.invoke();
                C12773m.m28629b(1);
                this.duringMeasureLayout = false;
                C12773m.m28628a(1);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                C12773m.m28629b(1);
                this.duringMeasureLayout = false;
                C12773m.m28628a(1);
                throw th;
            }
        }
    }

    private final void recurseRemeasure(LayoutNode layoutNode) {
        remeasureOnly(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) content[i];
                if (getMeasureAffectsParent(layoutNode2)) {
                    recurseRemeasure(layoutNode2);
                }
                i++;
            } while (i < size);
        }
        remeasureOnly(layoutNode);
    }

    /* access modifiers changed from: private */
    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode) {
        boolean z;
        boolean z2;
        Constraints constraints;
        int i = 0;
        if (!layoutNode.isPlaced() && !getCanAffectParent(layoutNode) && !C12775o.m28634d(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                C12775o.m28636f(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                z = m37566doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
            } else {
                z = false;
            }
            z2 = m37567doRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            z2 = false;
            z = false;
        }
        if ((z || layoutNode.getLookaheadLayoutPending$ui_release()) && C12775o.m28634d(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            layoutNode.lookaheadReplace$ui_release();
        }
        if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
            if (layoutNode == this.root) {
                layoutNode.place$ui_release(0, 0);
            } else {
                layoutNode.replace$ui_release();
            }
            this.onPositionedDispatcher.onNodePositioned(layoutNode);
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        if (this.postponedMeasureRequests.isNotEmpty()) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    PostponedRequest postponedRequest = (PostponedRequest) content[i];
                    if (postponedRequest.getNode().isAttached()) {
                        if (!postponedRequest.isLookahead()) {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        } else {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.isForced());
                        }
                    }
                    i++;
                } while (i < size);
            }
            this.postponedMeasureRequests.clear();
        }
        return z2;
    }

    private final void remeasureOnly(LayoutNode layoutNode) {
        Constraints constraints;
        if (layoutNode.getMeasurePending$ui_release() || layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                C12775o.m28636f(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                m37566doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
            }
            m37567doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if (z) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        if (!this.relayoutNodes.isEmpty()) {
            if (!this.duringMeasureLayout) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!layoutNode.getMeasurePending$ui_release()) {
                MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = (LayoutNode) content[i];
                        if (layoutNode2.getMeasurePending$ui_release() && this.relayoutNodes.remove(layoutNode2)) {
                            remeasureAndRelayoutIfNeeded(layoutNode2);
                        }
                        if (!layoutNode2.getMeasurePending$ui_release()) {
                            forceMeasureTheSubtree(layoutNode2);
                        }
                        i++;
                    } while (i < size);
                }
                if (layoutNode.getMeasurePending$ui_release() && this.relayoutNodes.remove(layoutNode)) {
                    remeasureAndRelayoutIfNeeded(layoutNode);
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return !this.relayoutNodes.isEmpty();
    }

    public final long getMeasureIteration() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    /* JADX INFO: finally extract failed */
    public final boolean measureAndLayout(C13074a<C11921v> aVar) {
        boolean z;
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.duringMeasureLayout) {
            boolean z2 = false;
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                try {
                    if (!this.relayoutNodes.isEmpty()) {
                        DepthSortedSet depthSortedSet = this.relayoutNodes;
                        z = false;
                        while (!depthSortedSet.isEmpty()) {
                            LayoutNode pop = depthSortedSet.pop();
                            boolean access$remeasureAndRelayoutIfNeeded = remeasureAndRelayoutIfNeeded(pop);
                            if (pop == this.root && access$remeasureAndRelayoutIfNeeded) {
                                z = true;
                            }
                        }
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    } else {
                        z = false;
                    }
                    this.duringMeasureLayout = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                    z2 = z;
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    throw th;
                }
            }
            callOnLayoutCompletedListeners();
            return z2;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: measureAndLayout-0kLqBqw  reason: not valid java name */
    public final void m37568measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        C12775o.m28639i(layoutNode, "layoutNode");
        if (!(!C12775o.m28634d(layoutNode, this.root))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.duringMeasureLayout) {
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                try {
                    this.relayoutNodes.remove(layoutNode);
                    boolean r1 = m37566doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m38400boximpl(j));
                    m37567doRemeasuresdFAvZA(layoutNode, Constraints.m38400boximpl(j));
                    if ((r1 || layoutNode.getLookaheadLayoutPending$ui_release()) && C12775o.m28634d(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                        layoutNode.lookaheadReplace$ui_release();
                    }
                    if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                        layoutNode.replace$ui_release();
                        this.onPositionedDispatcher.onNodePositioned(layoutNode);
                    }
                    this.duringMeasureLayout = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    throw th;
                }
            }
            callOnLayoutCompletedListeners();
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public final void measureOnly() {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                recurseRemeasure(this.root);
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
    }

    public final void onNodeDetached(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "node");
        this.relayoutNodes.remove(layoutNode);
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        C12775o.m28639i(onLayoutCompletedListener, "listener");
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        C12775o.m28639i(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (!(i == 4 || i == 5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (C12775o.m28634d(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        this.relayoutNodes.add(layoutNode);
                    }
                }
            }
            if (!this.duringMeasureLayout) {
                return true;
            }
            return false;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
        }
        return false;
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        C12775o.m28639i(layoutNode, "layoutNode");
        if (layoutNode.getMLookaheadScope$ui_release() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z));
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                } else if (!layoutNode.getLookaheadMeasurePending$ui_release() || z) {
                    layoutNode.markLookaheadMeasurePending$ui_release();
                    layoutNode.markMeasurePending$ui_release();
                    if (C12775o.m28634d(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode)) {
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        if (parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            this.relayoutNodes.add(layoutNode);
                        }
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        C12775o.m28639i(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        } else if (z || (!layoutNode.getMeasurePending$ui_release() && !layoutNode.getLayoutPending$ui_release())) {
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.isPlaced()) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        this.relayoutNodes.add(layoutNode);
                    }
                }
            }
            if (!this.duringMeasureLayout) {
                return true;
            }
        } else {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
        }
        return false;
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z) {
        boolean z2;
        C12775o.m28639i(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (!(i == 1 || i == 2)) {
            if (i == 3 || i == 4) {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            } else if (!layoutNode.getMeasurePending$ui_release() || z) {
                layoutNode.markMeasurePending$ui_release();
                if (layoutNode.isPlaced() || getCanAffectParent(layoutNode)) {
                    LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                    if (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        this.relayoutNodes.add(layoutNode);
                    }
                }
                if (!this.duringMeasureLayout) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: updateRootConstraints-BRTryo0  reason: not valid java name */
    public final void m37569updateRootConstraintsBRTryo0(long j) {
        boolean z;
        Constraints constraints = this.rootConstraints;
        if (constraints == null) {
            z = false;
        } else {
            z = Constraints.m38405equalsimpl0(constraints.m38418unboximpl(), j);
        }
        if (z) {
            return;
        }
        if (!this.duringMeasureLayout) {
            this.rootConstraints = Constraints.m38400boximpl(j);
            this.root.markMeasurePending$ui_release();
            this.relayoutNodes.add(this.root);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
