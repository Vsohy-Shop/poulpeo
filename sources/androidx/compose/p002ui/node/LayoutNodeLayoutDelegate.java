package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LookaheadScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1237:1\n1#2:1238\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class LayoutNodeLayoutDelegate {
    private int childrenAccessingCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    /* access modifiers changed from: private */
    public final LayoutNode layoutNode;
    /* access modifiers changed from: private */
    public boolean layoutPending;
    /* access modifiers changed from: private */
    public boolean layoutPendingForAlignment;
    /* access modifiers changed from: private */
    public LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
    /* access modifiers changed from: private */
    public boolean lookaheadLayoutPending;
    /* access modifiers changed from: private */
    public boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private LookaheadPassDelegate lookaheadPassDelegate;
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate();
    private boolean measurePending;

    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1237:1\n685#1:1252\n686#1,2:1261\n1161#2,2:1238\n163#3:1240\n163#3:1253\n163#3:1279\n163#3:1291\n460#4,11:1241\n460#4,7:1254\n467#4,4:1263\n460#4,11:1280\n460#4,11:1292\n33#5,6:1267\n33#5,6:1273\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n750#1:1252\n750#1:1261,2\n668#1:1238,2\n685#1:1240\n750#1:1253\n1020#1:1279\n1049#1:1291\n685#1:1241,11\n750#1:1254,7\n750#1:1263,4\n1020#1:1280,11\n1049#1:1292,11\n776#1:1267,6\n802#1:1273,6\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private final MutableVector<Measurable> _childMeasurables = new MutableVector<>(new Measurable[16], 0);
        private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);
        private boolean childMeasurablesDirty = true;
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced = true;
        /* access modifiers changed from: private */
        public boolean isPreviouslyPlaced;
        private long lastPosition = IntOffset.Companion.m38596getZeronOccac();
        private Constraints lookaheadConstraints;
        private final LookaheadScope lookaheadScope;
        private boolean measuredOnce;
        private Object parentData;
        private boolean parentDataDirty = true;
        private boolean placedOnce;
        final /* synthetic */ LayoutNodeLayoutDelegate this$0;

        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$WhenMappings */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|19) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
            static {
                /*
                    androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.p002ui.node.LayoutNode.LayoutState.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p002ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r4 = 3
                    r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r4 = 4
                    r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    $EnumSwitchMapping$0 = r0
                    androidx.compose.ui.node.LayoutNode$UsageByParent[] r0 = androidx.compose.p002ui.node.LayoutNode.UsageByParent.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.ui.node.LayoutNode$UsageByParent r3 = androidx.compose.p002ui.node.LayoutNode.UsageByParent.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x003c }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                    r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
                L_0x003c:
                    androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.p002ui.node.LayoutNode.UsageByParent.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0044 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
                L_0x0044:
                    $EnumSwitchMapping$1 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.WhenMappings.<clinit>():void");
            }
        }

        public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LookaheadScope lookaheadScope2) {
            C12775o.m28639i(lookaheadScope2, "lookaheadScope");
            this.this$0 = layoutNodeLayoutDelegate;
            this.lookaheadScope = lookaheadScope2;
            this.parentData = layoutNodeLayoutDelegate.getMeasurePassDelegate$ui_release().getParentData();
        }

        private final void forEachChildDelegate(Function1<? super LookaheadPassDelegate, C11921v> function1) {
            MutableVector<LayoutNode> mutableVector = this.this$0.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = ((LayoutNode) content[i]).getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    C12775o.m28636f(lookaheadPassDelegate$ui_release);
                    function1.invoke(lookaheadPassDelegate$ui_release);
                    i++;
                } while (i < size);
            }
        }

        /* access modifiers changed from: private */
        public final void markSubtreeNotPlaced() {
            int i = 0;
            setPlaced(false);
            MutableVector<LayoutNode> mutableVector = this.this$0.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = ((LayoutNode) content[i]).getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    C12775o.m28636f(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.markSubtreeNotPlaced();
                    i++;
                } while (i < size);
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode access$getLayoutNode$p = this.this$0.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
            MutableVector<LayoutNode> mutableVector = access$getLayoutNode$p.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i];
                    if (layoutNode.getLookaheadMeasurePending$ui_release() && layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        C12775o.m28636f(lookaheadPassDelegate$ui_release);
                        Constraints r6 = m37549getLastConstraintsDWUhwKw();
                        C12775o.m28636f(r6);
                        if (lookaheadPassDelegate$ui_release.m37552remeasureBRTryo0(r6.m38418unboximpl())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, 1, (Object) null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(this.this$0.layoutNode, false, 1, (Object) null);
            LayoutNode parent$ui_release = this.this$0.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && this.this$0.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode access$getLayoutNode$p = this.this$0.layoutNode;
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i != 3) {
                    usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                } else {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
                access$getLayoutNode$p.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        private final void requestSubtreeForLookahead() {
            MutableVector<LayoutNode> mutableVector = this.this$0.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i];
                    layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    C12775o.m28636f(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.requestSubtreeForLookahead();
                    i++;
                } while (i < size);
            }
        }

        private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
            boolean z;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                    if (i == 1 || i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    } else if (i == 3 || i == 4) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                    layoutNode.setMeasuredByParentInLookahead$ui_release(usageByParent);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.getMeasuredByParentInLookahead$ui_release() + ". Parent state " + parent$ui_release.getLayoutState$ui_release() + '.').toString());
            }
            layoutNode.setMeasuredByParentInLookahead$ui_release(LayoutNode.UsageByParent.NotUsed);
        }

        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (this.this$0.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        this.this$0.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate$ui_release = getInnerCoordinator().getLookaheadDelegate$ui_release();
            if (lookaheadDelegate$ui_release != null) {
                lookaheadDelegate$ui_release.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate$ui_release2 = getInnerCoordinator().getLookaheadDelegate$ui_release();
            if (lookaheadDelegate$ui_release2 != null) {
                lookaheadDelegate$ui_release2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        public void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, C11921v> function1) {
            C12775o.m28639i(function1, "block");
            List<LayoutNode> children$ui_release = this.this$0.layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i = 0; i < size; i++) {
                AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = children$ui_release.get(i).getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                C12775o.m28636f(lookaheadAlignmentLinesOwner$ui_release);
                function1.invoke(lookaheadAlignmentLinesOwner$ui_release);
            }
        }

        public int get(AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            C12775o.m28639i(alignmentLine, "alignmentLine");
            LayoutNode parent$ui_release = this.this$0.layoutNode.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = this.this$0.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            int i = lookaheadDelegate$ui_release.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final List<Measurable> getChildMeasurables$ui_release() {
            this.this$0.layoutNode.getChildren$ui_release();
            if (!this.childMeasurablesDirty) {
                return this._childMeasurables.asMutableList();
            }
            LayoutNodeLayoutDelegateKt.updateChildMeasurables(this.this$0.layoutNode, this._childMeasurables, C1055xc4ae5339.INSTANCE);
            this.childMeasurablesDirty = false;
            return this._childMeasurables.asMutableList();
        }

        public final boolean getChildMeasurablesDirty$ui_release() {
            return this.childMeasurablesDirty;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        public NodeCoordinator getInnerCoordinator() {
            return this.this$0.layoutNode.getInnerCoordinator$ui_release();
        }

        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m37549getLastConstraintsDWUhwKw() {
            return this.lookaheadConstraints;
        }

        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return lookaheadDelegate$ui_release.getMeasuredHeight();
        }

        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return lookaheadDelegate$ui_release.getMeasuredWidth();
        }

        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = this.this$0.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
        }

        public Object getParentData() {
            return this.parentData;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = this.this$0.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = this.this$0.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i == 1) {
                    parent$ui_release2.requestLookaheadRemeasure$ui_release(z);
                } else if (i == 2) {
                    parent$ui_release2.requestLookaheadRelayout$ui_release(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public boolean isPlaced() {
            return this.isPlaced;
        }

        public void layoutChildren() {
            getAlignmentLines().recalculateQueryOwner();
            if (this.this$0.getLookaheadLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            LookaheadDelegate lookaheadDelegate$ui_release = getInnerCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            if (this.this$0.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate$ui_release.isPlacingForAlignment$ui_release() && this.this$0.getLookaheadLayoutPending$ui_release())) {
                this.this$0.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = this.this$0.getLayoutState$ui_release();
                this.this$0.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.this$0.layoutNode).getSnapshotObserver(), this.this$0.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, this.this$0, lookaheadDelegate$ui_release), 2, (Object) null);
                this.this$0.layoutState = layoutState$ui_release;
                if (this.this$0.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate$ui_release.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                this.this$0.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
        }

        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return lookaheadDelegate$ui_release.maxIntrinsicHeight(i);
        }

        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return lookaheadDelegate$ui_release.maxIntrinsicWidth(i);
        }

        /* renamed from: measure-BRTryo0  reason: not valid java name */
        public Placeable m37550measureBRTryo0(long j) {
            trackLookaheadMeasurementByParent(this.this$0.layoutNode);
            if (this.this$0.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                this.this$0.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            m37552remeasureBRTryo0(j);
            return this;
        }

        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return lookaheadDelegate$ui_release.minIntrinsicHeight(i);
        }

        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return lookaheadDelegate$ui_release.minIntrinsicWidth(i);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            if (this.this$0.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                List<LayoutNode> children$ui_release = this.this$0.layoutNode.getChildren$ui_release();
                int size = children$ui_release.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = children$ui_release.get(i);
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, (Object) null);
                    }
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                    if (lookaheadPassDelegate$ui_release != null) {
                        lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
                    }
                }
            }
        }

        public final void onPlaced() {
            if (!isPlaced()) {
                setPlaced(true);
                if (!this.isPreviouslyPlaced) {
                    requestSubtreeForLookahead();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: placeAt-f8xVGno  reason: not valid java name */
        public void m37551placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            this.this$0.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            this.placedOnce = true;
            if (!IntOffset.m38585equalsimpl0(j, this.lastPosition)) {
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            getAlignmentLines().setUsedByModifierLayout$ui_release(false);
            Owner requireOwner = LayoutNodeKt.requireOwner(this.this$0.layoutNode);
            this.this$0.setCoordinatesAccessedDuringPlacement(false);
            OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), this.this$0.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(this.this$0, j), 2, (Object) null);
            this.lastPosition = j;
            this.this$0.layoutState = LayoutNode.LayoutState.Idle;
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m37552remeasureBRTryo0(long j) {
            boolean z;
            boolean z2;
            boolean z3;
            LayoutNode parent$ui_release = this.this$0.layoutNode.getParent$ui_release();
            LayoutNode access$getLayoutNode$p = this.this$0.layoutNode;
            if (this.this$0.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release())) {
                z = true;
            } else {
                z = false;
            }
            access$getLayoutNode$p.setCanMultiMeasure$ui_release(z);
            if (!this.this$0.layoutNode.getLookaheadMeasurePending$ui_release()) {
                Constraints constraints = this.lookaheadConstraints;
                if (constraints == null) {
                    z3 = false;
                } else {
                    z3 = Constraints.m38405equalsimpl0(constraints.m38418unboximpl(), j);
                }
                if (z3) {
                    return false;
                }
            }
            this.lookaheadConstraints = Constraints.m38400boximpl(j);
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1.INSTANCE);
            this.measuredOnce = true;
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            if (lookaheadDelegate$ui_release != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long IntSize = IntSizeKt.IntSize(lookaheadDelegate$ui_release.getWidth(), lookaheadDelegate$ui_release.getHeight());
                this.this$0.m37545performLookaheadMeasureBRTryo0(j);
                m37403setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate$ui_release.getWidth(), lookaheadDelegate$ui_release.getHeight()));
                if (IntSize.m38628getWidthimpl(IntSize) == lookaheadDelegate$ui_release.getWidth() && IntSize.m38627getHeightimpl(IntSize) == lookaheadDelegate$ui_release.getHeight()) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        public final void replace() {
            if (this.placedOnce) {
                m37551placeAtf8xVGno(this.lastPosition, 0.0f, (Function1<? super GraphicsLayerScope, C11921v>) null);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(this.this$0.layoutNode, false, 1, (Object) null);
        }

        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(this.this$0.layoutNode, false, 1, (Object) null);
        }

        public final void setChildMeasurablesDirty$ui_release(boolean z) {
            this.childMeasurablesDirty = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        public void setPlaced(boolean z) {
            this.isPlaced = z;
        }

        public final boolean updateParentData() {
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            Object parentData2 = getParentData();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            boolean z = !C12775o.m28634d(parentData2, lookaheadDelegate$ui_release.getParentData());
            LookaheadDelegate lookaheadDelegate$ui_release2 = this.this$0.getOuterCoordinator().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release2);
            this.parentData = lookaheadDelegate$ui_release2.getParentData();
            return z;
        }
    }

    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n1161#2,2:1238\n33#3,6:1240\n33#3,6:1246\n163#4:1252\n460#5,11:1253\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n235#1:1238,2\n548#1:1240,6\n574#1:1246,6\n609#1:1252\n609#1:1253,11\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private final MutableVector<Measurable> _childMeasurables = new MutableVector<>(new Measurable[16], 0);
        private final AlignmentLines alignmentLines = new LayoutNodeAlignmentLines(this);
        private boolean childMeasurablesDirty = true;
        private boolean duringAlignmentLinesQuery;
        private Function1<? super GraphicsLayerScope, C11921v> lastLayerBlock;
        private long lastPosition = IntOffset.Companion.m38596getZeronOccac();
        private float lastZIndex;
        private boolean measuredOnce;
        private Object parentData;
        private boolean parentDataDirty = true;
        private boolean placedOnce;

        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$WhenMappings */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
            static {
                /*
                    androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.p002ui.node.LayoutNode.LayoutState.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.p002ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    $EnumSwitchMapping$0 = r0
                    androidx.compose.ui.node.LayoutNode$UsageByParent[] r0 = androidx.compose.p002ui.node.LayoutNode.UsageByParent.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.ui.node.LayoutNode$UsageByParent r3 = androidx.compose.p002ui.node.LayoutNode.UsageByParent.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x002a }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                    r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
                L_0x002a:
                    androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.p002ui.node.LayoutNode.UsageByParent.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0032 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
                L_0x0032:
                    $EnumSwitchMapping$1 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.<clinit>():void");
            }
        }

        public MeasurePassDelegate() {
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode access$getLayoutNode$p = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = access$getLayoutNode$p.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i];
                    if (layoutNode.getMeasurePending$ui_release() && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m37500remeasure_Sx5XlM$ui_release$default(layoutNode, (Constraints) null, 1, (Object) null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, 1, (Object) null);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, (Object) null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode access$getLayoutNode$p = LayoutNodeLayoutDelegate.this.layoutNode;
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i != 2) {
                    usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                } else {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
                access$getLayoutNode$p.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        /* renamed from: placeOuterCoordinator-f8xVGno  reason: not valid java name */
        private final void m37553placeOuterCoordinatorf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            this.lastPosition = j;
            this.lastZIndex = f;
            this.lastLayerBlock = function1;
            this.placedOnce = true;
            getAlignmentLines().setUsedByModifierLayout$ui_release(false);
            LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
            LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode).getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.layoutNode, false, new C1060x14fd4410(function1, LayoutNodeLayoutDelegate.this, j, f));
        }

        private final void trackMeasurementByParent(LayoutNode layoutNode) {
            boolean z;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                    if (i == 1) {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    } else if (i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                    layoutNode.setMeasuredByParent$ui_release(usageByParent);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.getMeasuredByParent$ui_release() + ". Parent state " + parent$ui_release.getLayoutState$ui_release() + '.').toString());
            }
            layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }

        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        public void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, C11921v> function1) {
            C12775o.m28639i(function1, "block");
            List<LayoutNode> children$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i = 0; i < size; i++) {
                function1.invoke(children$ui_release.get(i).getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
            }
        }

        public int get(AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            C12775o.m28639i(alignmentLine, "alignmentLine");
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int i = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final List<Measurable> getChildMeasurables$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (!this.childMeasurablesDirty) {
                return this._childMeasurables.asMutableList();
            }
            LayoutNodeLayoutDelegateKt.updateChildMeasurables(LayoutNodeLayoutDelegate.this.layoutNode, this._childMeasurables, LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1.INSTANCE);
            this.childMeasurablesDirty = false;
            return this._childMeasurables.asMutableList();
        }

        public final boolean getChildMeasurablesDirty$ui_release() {
            return this.childMeasurablesDirty;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m37554getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return Constraints.m38400boximpl(m37401getMeasurementConstraintsmsEJaDk());
            }
            return null;
        }

        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
        }

        public Object getParentData() {
            return this.parentData;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i == 1) {
                    parent$ui_release2.requestRemeasure$ui_release(z);
                } else if (i == 2) {
                    parent$ui_release2.requestRelayout$ui_release(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public boolean isPlaced() {
            return LayoutNodeLayoutDelegate.this.layoutNode.isPlaced();
        }

        public void layoutChildren() {
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNode access$getLayoutNode$p = LayoutNodeLayoutDelegate.this.layoutNode;
                LayoutNodeKt.requireOwner(access$getLayoutNode$p).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(access$getLayoutNode$p, false, new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(LayoutNodeLayoutDelegate.this, this, access$getLayoutNode$p));
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
        }

        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(i);
        }

        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(i);
        }

        /* renamed from: measure-BRTryo0  reason: not valid java name */
        public Placeable m37555measureBRTryo0(long j) {
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent$ui_release == usageByParent) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
                this.measuredOnce = true;
                m37404setMeasurementConstraintsBRTryo0(j);
                LayoutNodeLayoutDelegate.this.layoutNode.setMeasuredByParentInLookahead$ui_release(usageByParent);
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                C12775o.m28636f(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.m37550measureBRTryo0(j);
            }
            trackMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            m37557remeasureBRTryo0(j);
            return this;
        }

        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(i);
        }

        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(i);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                List<LayoutNode> children$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
                int size = children$ui_release.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = children$ui_release.get(i);
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, (Object) null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: placeAt-f8xVGno  reason: not valid java name */
        public void m37556placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            if (!IntOffset.m38585equalsimpl0(j, this.lastPosition)) {
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                C12775o.m28636f(lookaheadPassDelegate$ui_release);
                Placeable.PlacementScope.place$default(companion, lookaheadPassDelegate$ui_release, IntOffset.m38586getXimpl(j), IntOffset.m38587getYimpl(j), 0.0f, 4, (Object) null);
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
            m37553placeOuterCoordinatorf8xVGno(j, f, function1);
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m37557remeasureBRTryo0(long j) {
            boolean z;
            Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode access$getLayoutNode$p = LayoutNodeLayoutDelegate.this.layoutNode;
            boolean z2 = true;
            if (LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release())) {
                z = true;
            } else {
                z = false;
            }
            access$getLayoutNode$p.setCanMultiMeasure$ui_release(z);
            if (LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() || !Constraints.m38405equalsimpl0(m37401getMeasurementConstraintsmsEJaDk(), j)) {
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1.INSTANCE);
                this.measuredOnce = true;
                long r0 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().m37598getSizeYbymL2g();
                m37404setMeasurementConstraintsBRTryo0(j);
                LayoutNodeLayoutDelegate.this.m37546performMeasureBRTryo0(j);
                if (IntSize.m38626equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().m37598getSizeYbymL2g(), r0) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                    z2 = false;
                }
                m37403setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
                return z2;
            }
            requireOwner.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.layoutNode);
            LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
            return false;
        }

        public final void replace() {
            if (this.placedOnce) {
                m37553placeOuterCoordinatorf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, (Object) null);
        }

        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, (Object) null);
        }

        public final void setChildMeasurablesDirty$ui_release(boolean z) {
            this.childMeasurablesDirty = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        public final boolean updateParentData() {
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            boolean z = !C12775o.m28634d(getParentData(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData());
            this.parentData = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
            return z;
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode2) {
        C12775o.m28639i(layoutNode2, "layoutNode");
        this.layoutNode = layoutNode2;
    }

    /* access modifiers changed from: private */
    public final boolean isOutMostLookaheadRoot(LayoutNode layoutNode2) {
        LayoutNode layoutNode3;
        LookaheadScope mLookaheadScope$ui_release = layoutNode2.getMLookaheadScope$ui_release();
        if (mLookaheadScope$ui_release != null) {
            layoutNode3 = mLookaheadScope$ui_release.getRoot();
        } else {
            layoutNode3 = null;
        }
        return C12775o.m28634d(layoutNode3, layoutNode2);
    }

    /* access modifiers changed from: private */
    /* renamed from: performLookaheadMeasure-BRTryo0  reason: not valid java name */
    public final void m37545performLookaheadMeasureBRTryo0(long j) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(this, j), 2, (Object) null);
        markLookaheadLayoutPending$ui_release();
        if (isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    /* access modifiers changed from: private */
    /* renamed from: performMeasure-BRTryo0  reason: not valid java name */
    public final void m37546performMeasureBRTryo0(long j) {
        boolean z;
        LayoutNode.LayoutState layoutState2 = this.layoutState;
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Idle;
        if (layoutState2 == layoutState3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LayoutNode.LayoutState layoutState4 = LayoutNode.LayoutState.Measuring;
            this.layoutState = layoutState4;
            this.measurePending = false;
            LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, new LayoutNodeLayoutDelegate$performMeasure$2(this, j));
            if (this.layoutState == layoutState4) {
                markLayoutPending$ui_release();
                this.layoutState = layoutState3;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m37547getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m37554getLastConstraintsDWUhwKw();
    }

    /* renamed from: getLastLookaheadConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m37548getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate2 = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate2 != null) {
            return lookaheadPassDelegate2.m37549getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate2 = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate2 != null) {
            lookaheadPassDelegate2.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildMeasurablesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate2 = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate2 != null) {
            lookaheadPassDelegate2.setChildMeasurablesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void onLookaheadScopeChanged$ui_release(LookaheadScope lookaheadScope) {
        LookaheadPassDelegate lookaheadPassDelegate2;
        if (lookaheadScope != null) {
            lookaheadPassDelegate2 = new LookaheadPassDelegate(this, lookaheadScope);
        } else {
            lookaheadPassDelegate2 = null;
        }
        this.lookaheadPassDelegate = lookaheadPassDelegate2;
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate2 = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate2 != null && (alignmentLines = lookaheadPassDelegate2.getAlignmentLines()) != null) {
            alignmentLines.reset$ui_release();
        }
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        boolean z;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                layoutNodeLayoutDelegate = parent$ui_release.getLayoutDelegate$ui_release();
            } else {
                layoutNodeLayoutDelegate = null;
            }
            if (layoutNodeLayoutDelegate == null) {
                return;
            }
            if (i == 0) {
                layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
            } else {
                layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void updateParentData() {
        boolean z;
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, 1, (Object) null);
        }
        LookaheadPassDelegate lookaheadPassDelegate2 = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate2 == null || !lookaheadPassDelegate2.updateParentData()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        if (isOutMostLookaheadRoot(this.layoutNode)) {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, 1, (Object) null);
                return;
            }
            return;
        }
        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release3 != null) {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, 1, (Object) null);
        }
    }
}
