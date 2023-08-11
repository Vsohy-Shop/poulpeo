package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.VerticalAlignmentLine;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.LookaheadCapablePlaceable */
/* compiled from: LookaheadDelegate.kt */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode {
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    public final int get(AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        int i;
        C12775o.m28639i(alignmentLine, "alignmentLine");
        if (!getHasMeasureResult() || (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (alignmentLine instanceof VerticalAlignmentLine) {
            i = IntOffset.m38586getXimpl(m37399getApparentToRealOffsetnOccac());
        } else {
            i = IntOffset.m38587getYimpl(m37399getApparentToRealOffsetnOccac());
        }
        return calculateAlignmentLine + i;
    }

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadCapablePlaceable getParent();

    /* renamed from: getPosition-nOcc-ac  reason: not valid java name */
    public abstract long m37559getPositionnOccac();

    /* access modifiers changed from: protected */
    public final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        AlignmentLines alignmentLines;
        C12775o.m28639i(nodeCoordinator, "<this>");
        NodeCoordinator wrapped$ui_release = nodeCoordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            layoutNode = wrapped$ui_release.getLayoutNode();
        } else {
            layoutNode = null;
        }
        if (!C12775o.m28634d(layoutNode, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner != null && (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) != null) {
            alignmentLines.onAlignmentsChanged();
        }
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.isShallowPlacing;
    }

    public abstract void replace$ui_release();

    public final void setPlacingForAlignment$ui_release(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final void setShallowPlacing$ui_release(boolean z) {
        this.isShallowPlacing = z;
    }
}
