package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.PaintingStyle;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LookaheadScope;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 5 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,277:1\n85#2:278\n85#2:299\n196#3:279\n196#3:300\n306#4,4:280\n360#5,15:284\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n51#1:278\n210#1:299\n51#1:279\n210#1:300\n153#1:280,4\n197#1:284,15\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator */
/* compiled from: LayoutModifierNodeCoordinator.kt */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Paint modifierBoundsPaint;
    private LayoutModifierNode layoutModifierNode;
    private IntermediateLayoutModifierNode lookAheadTransientMeasureNode;

    /* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator$Companion */
    /* compiled from: LayoutModifierNodeCoordinator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }
    }

    @SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier\n*L\n130#1:278,3\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier */
    /* compiled from: LayoutModifierNodeCoordinator.kt */
    private final class LookaheadDelegateForIntermediateLayoutModifier extends LookaheadDelegate {
        private final IntermediateLayoutModifierNode intermediateMeasureNode;
        private final PassThroughMeasureResult passThroughMeasureResult = new PassThroughMeasureResult();
        final /* synthetic */ LayoutModifierNodeCoordinator this$0;

        /* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier$PassThroughMeasureResult */
        /* compiled from: LayoutModifierNodeCoordinator.kt */
        private final class PassThroughMeasureResult implements MeasureResult {
            private final Map<AlignmentLine, Integer> alignmentLines = C12716r0.m28416g();

            public PassThroughMeasureResult() {
            }

            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            public int getHeight() {
                LookaheadDelegate lookaheadDelegate$ui_release = LookaheadDelegateForIntermediateLayoutModifier.this.this$0.getWrappedNonNull().getLookaheadDelegate$ui_release();
                C12775o.m28636f(lookaheadDelegate$ui_release);
                return lookaheadDelegate$ui_release.getMeasureResult$ui_release().getHeight();
            }

            public int getWidth() {
                LookaheadDelegate lookaheadDelegate$ui_release = LookaheadDelegateForIntermediateLayoutModifier.this.this$0.getWrappedNonNull().getLookaheadDelegate$ui_release();
                C12775o.m28636f(lookaheadDelegate$ui_release);
                return lookaheadDelegate$ui_release.getMeasureResult$ui_release().getWidth();
            }

            public void placeChildren() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                LookaheadDelegate lookaheadDelegate$ui_release = LookaheadDelegateForIntermediateLayoutModifier.this.this$0.getWrappedNonNull().getLookaheadDelegate$ui_release();
                C12775o.m28636f(lookaheadDelegate$ui_release);
                Placeable.PlacementScope.place$default(companion, lookaheadDelegate$ui_release, 0, 0, 0.0f, 4, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateForIntermediateLayoutModifier(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, LookaheadScope lookaheadScope, IntermediateLayoutModifierNode intermediateLayoutModifierNode) {
            super(layoutModifierNodeCoordinator, lookaheadScope);
            C12775o.m28639i(lookaheadScope, "scope");
            C12775o.m28639i(intermediateLayoutModifierNode, "intermediateMeasureNode");
            this.this$0 = layoutModifierNodeCoordinator;
            this.intermediateMeasureNode = intermediateLayoutModifierNode;
        }

        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            C12775o.m28639i(alignmentLine, "alignmentLine");
            int access$calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(access$calculateAlignmentAndPlaceChildAsNeeded));
            return access$calculateAlignmentAndPlaceChildAsNeeded;
        }

        public final IntermediateLayoutModifierNode getIntermediateMeasureNode() {
            return this.intermediateMeasureNode;
        }

        /* renamed from: measure-BRTryo0  reason: not valid java name */
        public Placeable m37495measureBRTryo0(long j) {
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = this.intermediateMeasureNode;
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = this.this$0;
            m37404setMeasurementConstraintsBRTryo0(j);
            LookaheadDelegate lookaheadDelegate$ui_release = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            lookaheadDelegate$ui_release.m37365measureBRTryo0(j);
            intermediateLayoutModifierNode.m37490setTargetSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate$ui_release.getMeasureResult$ui_release().getWidth(), lookaheadDelegate$ui_release.getMeasureResult$ui_release().getHeight()));
            set_measureResult(this.passThroughMeasureResult);
            return this;
        }
    }

    @SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,277:1\n173#2,3:278\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n65#1:278,3\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode */
    /* compiled from: LayoutModifierNodeCoordinator.kt */
    private final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        final /* synthetic */ LayoutModifierNodeCoordinator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateForLayoutModifierNode(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, LookaheadScope lookaheadScope) {
            super(layoutModifierNodeCoordinator, lookaheadScope);
            C12775o.m28639i(lookaheadScope, "scope");
            this.this$0 = layoutModifierNodeCoordinator;
        }

        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            C12775o.m28639i(alignmentLine, "alignmentLine");
            int access$calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(access$calculateAlignmentAndPlaceChildAsNeeded));
            return access$calculateAlignmentAndPlaceChildAsNeeded;
        }

        public int maxIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getWrappedNonNull().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate$ui_release, i);
        }

        public int maxIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getWrappedNonNull().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate$ui_release, i);
        }

        /* renamed from: measure-BRTryo0  reason: not valid java name */
        public Placeable m37496measureBRTryo0(long j) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = this.this$0;
            m37404setMeasurementConstraintsBRTryo0(j);
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate$ui_release = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            set_measureResult(layoutModifierNode.m37492measure3p2s80s(this, lookaheadDelegate$ui_release, j));
            return this;
        }

        public int minIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getWrappedNonNull().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate$ui_release, i);
        }

        public int minIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate$ui_release = this.this$0.getWrappedNonNull().getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate$ui_release, i);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.m35934setColor8_81llA(Color.Companion.m35698getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.m35938setStylek9PVt8s(PaintingStyle.Companion.m35947getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode2) {
        super(layoutNode);
        boolean z;
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        C12775o.m28639i(layoutNode, "layoutNode");
        C12775o.m28639i(layoutModifierNode2, "measureNode");
        this.layoutModifierNode = layoutModifierNode2;
        Modifier.Node node = layoutModifierNode2.getNode();
        if ((node.getKindSet$ui_release() & NodeKind.m37625constructorimpl(512)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(layoutModifierNode2 instanceof IntermediateLayoutModifierNode)) {
            intermediateLayoutModifierNode = null;
        } else {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode2;
        }
        this.lookAheadTransientMeasureNode = intermediateLayoutModifierNode;
    }

    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        C12775o.m28639i(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate$ui_release = getLookaheadDelegate$ui_release();
        if (lookaheadDelegate$ui_release != null) {
            return lookaheadDelegate$ui_release.getCachedAlignmentLine$ui_release(alignmentLine);
        }
        return LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    public LookaheadDelegate createLookaheadDelegate(LookaheadScope lookaheadScope) {
        C12775o.m28639i(lookaheadScope, "scope");
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = this.lookAheadTransientMeasureNode;
        if (intermediateLayoutModifierNode != null) {
            return new LookaheadDelegateForIntermediateLayoutModifier(this, lookaheadScope, intermediateLayoutModifierNode);
        }
        return new LookaheadDelegateForLayoutModifierNode(this, lookaheadScope);
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui_release = getWrapped$ui_release();
        C12775o.m28636f(wrapped$ui_release);
        return wrapped$ui_release;
    }

    public int maxIntrinsicHeight(int i) {
        return this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    public int maxIntrinsicWidth(int i) {
        return this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    /* renamed from: measure-BRTryo0  reason: not valid java name */
    public Placeable m37493measureBRTryo0(long j) {
        m37404setMeasurementConstraintsBRTryo0(j);
        setMeasureResult$ui_release(this.layoutModifierNode.m37492measure3p2s80s(this, getWrappedNonNull(), j));
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.m37672resizeozmzZPI(m37400getMeasuredSizeYbymL2g());
        }
        onMeasured();
        return this;
    }

    public int minIntrinsicHeight(int i) {
        return this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    public int minIntrinsicWidth(int i) {
        return this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    public void onLayoutModifierNodeChanged() {
        boolean z;
        super.onLayoutModifierNodeChanged();
        LayoutModifierNode layoutModifierNode2 = this.layoutModifierNode;
        Modifier.Node node = layoutModifierNode2.getNode();
        if ((node.getKindSet$ui_release() & NodeKind.m37625constructorimpl(512)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(layoutModifierNode2 instanceof IntermediateLayoutModifierNode)) {
            this.lookAheadTransientMeasureNode = null;
            LookaheadDelegate lookaheadDelegate$ui_release = getLookaheadDelegate$ui_release();
            if (lookaheadDelegate$ui_release != null) {
                updateLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode(this, lookaheadDelegate$ui_release.getLookaheadScope()));
                return;
            }
            return;
        }
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode2;
        this.lookAheadTransientMeasureNode = intermediateLayoutModifierNode;
        LookaheadDelegate lookaheadDelegate$ui_release2 = getLookaheadDelegate$ui_release();
        if (lookaheadDelegate$ui_release2 != null) {
            updateLookaheadDelegate(new LookaheadDelegateForIntermediateLayoutModifier(this, lookaheadDelegate$ui_release2.getLookaheadScope(), intermediateLayoutModifierNode));
        }
    }

    public void performDraw(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        getWrappedNonNull().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void m37494placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
        super.m37609placeAtf8xVGno(j, f, function1);
        if (!isShallowPlacing$ui_release()) {
            onPlaced();
            Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
            int r5 = IntSize.m38628getWidthimpl(m37400getMeasuredSizeYbymL2g());
            LayoutDirection layoutDirection = getLayoutDirection();
            LayoutCoordinates access$get_coordinates$cp = Placeable.PlacementScope._coordinates;
            int access$getParentWidth = companion.getParentWidth();
            LayoutDirection access$getParentLayoutDirection = companion.getParentLayoutDirection();
            LayoutNodeLayoutDelegate access$getLayoutDelegate$cp = Placeable.PlacementScope.layoutDelegate;
            Placeable.PlacementScope.parentWidth = r5;
            Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
            boolean access$configureForPlacingForAlignment = companion.configureForPlacingForAlignment(this);
            getMeasureResult$ui_release().placeChildren();
            setPlacingForAlignment$ui_release(access$configureForPlacingForAlignment);
            Placeable.PlacementScope.parentWidth = access$getParentWidth;
            Placeable.PlacementScope.parentLayoutDirection = access$getParentLayoutDirection;
            Placeable.PlacementScope._coordinates = access$get_coordinates$cp;
            Placeable.PlacementScope.layoutDelegate = access$getLayoutDelegate$cp;
        }
    }

    public final void setLayoutModifierNode$ui_release(LayoutModifierNode layoutModifierNode2) {
        C12775o.m28639i(layoutModifierNode2, "<set-?>");
        this.layoutModifierNode = layoutModifierNode2;
    }
}
