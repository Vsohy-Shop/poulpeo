package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.node.LookaheadDelegate;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,120:1\n179#2:121\n157#2:124\n179#2:126\n157#2:129\n86#3:122\n79#3:123\n86#3:125\n86#3:127\n79#3:128\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n*L\n63#1:121\n64#1:124\n69#1:126\n75#1:129\n63#1:122\n63#1:123\n68#1:125\n71#1:127\n68#1:128\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl */
/* compiled from: LookaheadLayoutCoordinates.kt */
public final class LookaheadLayoutCoordinatesImpl implements LookaheadLayoutCoordinates {
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinatesImpl(LookaheadDelegate lookaheadDelegate2) {
        C12775o.m28639i(lookaheadDelegate2, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate2;
    }

    public int get(AlignmentLine alignmentLine) {
        C12775o.m28639i(alignmentLine, "alignmentLine");
        return getCoordinator().get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public LayoutCoordinates getParentCoordinates() {
        return getCoordinator().getParentCoordinates();
    }

    public LayoutCoordinates getParentLayoutCoordinates() {
        return getCoordinator().getParentLayoutCoordinates();
    }

    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public long m37358getSizeYbymL2g() {
        return getCoordinator().m37598getSizeYbymL2g();
    }

    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        C12775o.m28639i(layoutCoordinates, "sourceCoordinates");
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z);
    }

    /* renamed from: localLookaheadPositionOf-R5De75A  reason: not valid java name */
    public long m37359localLookaheadPositionOfR5De75A(LookaheadLayoutCoordinates lookaheadLayoutCoordinates, long j) {
        C12775o.m28639i(lookaheadLayoutCoordinates, "sourceCoordinates");
        LookaheadDelegate lookaheadDelegate2 = ((LookaheadLayoutCoordinatesImpl) lookaheadLayoutCoordinates).lookaheadDelegate;
        LookaheadDelegate lookaheadDelegate$ui_release = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate2.getCoordinator()).getLookaheadDelegate$ui_release();
        if (lookaheadDelegate$ui_release != null) {
            long r1 = lookaheadDelegate2.m37564positionInBjo55l4$ui_release(lookaheadDelegate$ui_release);
            long IntOffset = IntOffsetKt.IntOffset(C13265c.m30134c(Offset.m35422getXimpl(j)), C13265c.m30134c(Offset.m35423getYimpl(j)));
            long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r1) + IntOffset.m38586getXimpl(IntOffset), IntOffset.m38587getYimpl(r1) + IntOffset.m38587getYimpl(IntOffset));
            long r0 = this.lookaheadDelegate.m37564positionInBjo55l4$ui_release(lookaheadDelegate$ui_release);
            long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset2) - IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(IntOffset2) - IntOffset.m38587getYimpl(r0));
            return OffsetKt.Offset((float) IntOffset.m38586getXimpl(IntOffset3), (float) IntOffset.m38587getYimpl(IntOffset3));
        }
        LookaheadDelegate access$getRootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate2);
        long r12 = lookaheadDelegate2.m37564positionInBjo55l4$ui_release(access$getRootLookaheadDelegate);
        long r3 = access$getRootLookaheadDelegate.m37561getPositionnOccac();
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r12) + IntOffset.m38586getXimpl(r3), IntOffset.m38587getYimpl(r12) + IntOffset.m38587getYimpl(r3));
        long IntOffset5 = IntOffsetKt.IntOffset(C13265c.m30134c(Offset.m35422getXimpl(j)), C13265c.m30134c(Offset.m35423getYimpl(j)));
        long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset4) + IntOffset.m38586getXimpl(IntOffset5), IntOffset.m38587getYimpl(IntOffset4) + IntOffset.m38587getYimpl(IntOffset5));
        LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
        long r13 = lookaheadDelegate3.m37564positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
        long r32 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).m37561getPositionnOccac();
        long IntOffset7 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r13) + IntOffset.m38586getXimpl(r32), IntOffset.m38587getYimpl(r13) + IntOffset.m38587getYimpl(r32));
        long IntOffset8 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset6) - IntOffset.m38586getXimpl(IntOffset7), IntOffset.m38587getYimpl(IntOffset6) - IntOffset.m38587getYimpl(IntOffset7));
        NodeCoordinator wrappedBy$ui_release = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy$ui_release();
        C12775o.m28636f(wrappedBy$ui_release);
        NodeCoordinator wrappedBy$ui_release2 = access$getRootLookaheadDelegate.getCoordinator().getWrappedBy$ui_release();
        C12775o.m28636f(wrappedBy$ui_release2);
        return wrappedBy$ui_release.m37605localPositionOfR5De75A(wrappedBy$ui_release2, OffsetKt.Offset((float) IntOffset.m38586getXimpl(IntOffset8), (float) IntOffset.m38587getYimpl(IntOffset8)));
    }

    /* renamed from: localPositionOf-R5De75A  reason: not valid java name */
    public long m37360localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        C12775o.m28639i(layoutCoordinates, "sourceCoordinates");
        return getCoordinator().m37605localPositionOfR5De75A(layoutCoordinates, j);
    }

    /* renamed from: localToRoot-MK-Hz9U  reason: not valid java name */
    public long m37361localToRootMKHz9U(long j) {
        return getCoordinator().m37606localToRootMKHz9U(j);
    }

    /* renamed from: localToWindow-MK-Hz9U  reason: not valid java name */
    public long m37362localToWindowMKHz9U(long j) {
        return getCoordinator().m37607localToWindowMKHz9U(j);
    }

    /* renamed from: transformFrom-EL8BTi8  reason: not valid java name */
    public void m37363transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        C12775o.m28639i(layoutCoordinates, "sourceCoordinates");
        C12775o.m28639i(fArr, "matrix");
        getCoordinator().m37612transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    /* renamed from: windowToLocal-MK-Hz9U  reason: not valid java name */
    public long m37364windowToLocalMKHz9U(long j) {
        return getCoordinator().m37614windowToLocalMKHz9U(j);
    }
}
