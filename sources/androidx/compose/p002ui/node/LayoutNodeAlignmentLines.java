package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.node.LayoutNodeAlignmentLines */
/* compiled from: LayoutNodeAlignmentLines.kt */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, (DefaultConstructorMarker) null);
        C12775o.m28639i(alignmentLinesOwner, "alignmentLinesOwner");
    }

    /* access modifiers changed from: protected */
    /* renamed from: calculatePositionInParent-R5De75A  reason: not valid java name */
    public long m37508calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j) {
        C12775o.m28639i(nodeCoordinator, "$this$calculatePositionInParent");
        return nodeCoordinator.m37611toParentPositionMKHz9U(j);
    }

    /* access modifiers changed from: protected */
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        C12775o.m28639i(nodeCoordinator, "<this>");
        return nodeCoordinator.getMeasureResult$ui_release().getAlignmentLines();
    }

    /* access modifiers changed from: protected */
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        C12775o.m28639i(nodeCoordinator, "<this>");
        C12775o.m28639i(alignmentLine, "alignmentLine");
        return nodeCoordinator.get(alignmentLine);
    }
}
