package androidx.compose.p002ui.node;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.node.AlignmentLines */
/* compiled from: LayoutNodeAlignmentLines.kt */
public abstract class AlignmentLines {
    /* access modifiers changed from: private */
    public final Map<AlignmentLine, Integer> alignmentLineMap;
    private final AlignmentLinesOwner alignmentLinesOwner;
    private boolean dirty;
    private boolean previousUsedDuringParentLayout;
    private AlignmentLinesOwner queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLinesOwner2);
    }

    /* access modifiers changed from: private */
    public final void addAlignmentLine(AlignmentLine alignmentLine, int i, NodeCoordinator nodeCoordinator) {
        int i2;
        float f = (float) i;
        long Offset = OffsetKt.Offset(f, f);
        while (true) {
            Offset = m37444calculatePositionInParentR5De75A(nodeCoordinator, Offset);
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            C12775o.m28636f(nodeCoordinator);
            if (C12775o.m28634d(nodeCoordinator, this.alignmentLinesOwner.getInnerCoordinator())) {
                break;
            } else if (getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine)) {
                float positionFor = (float) getPositionFor(nodeCoordinator, alignmentLine);
                Offset = OffsetKt.Offset(positionFor, positionFor);
            }
        }
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            i2 = C13265c.m30134c(Offset.m35423getYimpl(Offset));
        } else {
            i2 = C13265c.m30134c(Offset.m35422getXimpl(Offset));
        }
        Map<AlignmentLine, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            i2 = AlignmentLineKt.merge(alignmentLine, ((Number) C12716r0.m28417h(this.alignmentLineMap, alignmentLine)).intValue(), i2);
        }
        map.put(alignmentLine, Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: calculatePositionInParent-R5De75A  reason: not valid java name */
    public abstract long m37444calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j);

    /* access modifiers changed from: protected */
    public abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator);

    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean getDirty$ui_release() {
        return this.dirty;
    }

    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLineMap;
    }

    /* access modifiers changed from: protected */
    public abstract int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui_release() {
        if (this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout) {
            return true;
        }
        return false;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        if (this.queryOwner != null) {
            return true;
        }
        return false;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.usedByModifierLayout;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.usedByModifierMeasurement;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.usedDuringParentLayout;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.usedDuringParentMeasurement;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner != null) {
            if (this.usedDuringParentMeasurement) {
                parentAlignmentLinesOwner.requestMeasure();
            } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
                parentAlignmentLinesOwner.requestLayout();
            }
            if (this.usedByModifierMeasurement) {
                this.alignmentLinesOwner.requestMeasure();
            }
            if (this.usedByModifierLayout) {
                parentAlignmentLinesOwner.requestLayout();
            }
            parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
        }
    }

    public final void recalculate() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.forEachChildAlignmentLinesOwner(new AlignmentLines$recalculate$1(this));
        this.alignmentLineMap.putAll(getAlignmentLinesMap(this.alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLinesOwner alignmentLinesOwner2;
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        if (getQueried$ui_release()) {
            alignmentLinesOwner2 = this.alignmentLinesOwner;
        } else {
            AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner != null) {
                alignmentLinesOwner2 = parentAlignmentLinesOwner.getAlignmentLines().queryOwner;
                if (alignmentLinesOwner2 == null || !alignmentLinesOwner2.getAlignmentLines().getQueried$ui_release()) {
                    AlignmentLinesOwner alignmentLinesOwner3 = this.queryOwner;
                    if (alignmentLinesOwner3 != null && !alignmentLinesOwner3.getAlignmentLines().getQueried$ui_release()) {
                        AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner3.getParentAlignmentLinesOwner();
                        if (!(parentAlignmentLinesOwner2 == null || (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) == null)) {
                            alignmentLines2.recalculateQueryOwner();
                        }
                        AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner3.getParentAlignmentLinesOwner();
                        if (parentAlignmentLinesOwner3 == null || (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) == null) {
                            alignmentLinesOwner2 = null;
                        } else {
                            alignmentLinesOwner2 = alignmentLines.queryOwner;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.queryOwner = alignmentLinesOwner2;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui_release(boolean z) {
        this.dirty = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z) {
        this.usedByModifierLayout = z;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z) {
        this.usedDuringParentMeasurement = z;
    }

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner2) {
        this.alignmentLinesOwner = alignmentLinesOwner2;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
