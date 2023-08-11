package androidx.compose.p002ui.node;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.unit.IntOffset;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,246:1\n157#2:247\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n245#1:247\n*E\n"})
/* renamed from: androidx.compose.ui.node.LookaheadAlignmentLines */
/* compiled from: LayoutNodeAlignmentLines.kt */
public final class LookaheadAlignmentLines extends AlignmentLines {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, (DefaultConstructorMarker) null);
        C12775o.m28639i(alignmentLinesOwner, "alignmentLinesOwner");
    }

    /* access modifiers changed from: protected */
    /* renamed from: calculatePositionInParent-R5De75A  reason: not valid java name */
    public long m37558calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j) {
        C12775o.m28639i(nodeCoordinator, "$this$calculatePositionInParent");
        LookaheadDelegate lookaheadDelegate$ui_release = nodeCoordinator.getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        long r0 = lookaheadDelegate$ui_release.m37561getPositionnOccac();
        return Offset.m35427plusMKHz9U(OffsetKt.Offset((float) IntOffset.m38586getXimpl(r0), (float) IntOffset.m38587getYimpl(r0)), j);
    }

    /* access modifiers changed from: protected */
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        C12775o.m28639i(nodeCoordinator, "<this>");
        LookaheadDelegate lookaheadDelegate$ui_release = nodeCoordinator.getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        return lookaheadDelegate$ui_release.getMeasureResult$ui_release().getAlignmentLines();
    }

    /* access modifiers changed from: protected */
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        C12775o.m28639i(nodeCoordinator, "<this>");
        C12775o.m28639i(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate$ui_release = nodeCoordinator.getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        return lookaheadDelegate$ui_release.get(alignmentLine);
    }
}
