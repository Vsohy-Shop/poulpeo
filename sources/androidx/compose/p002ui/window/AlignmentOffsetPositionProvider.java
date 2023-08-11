package androidx.compose.p002ui.window;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntRect;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,102:1\n86#2:103\n86#2:104\n79#2:105\n86#2:106\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n84#1:103\n87#1:104\n90#1:105\n97#1:106\n*E\n"})
/* renamed from: androidx.compose.ui.window.AlignmentOffsetPositionProvider */
/* compiled from: Popup.kt */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment2, j);
    }

    /* renamed from: calculatePosition-llwVHH4  reason: not valid java name */
    public long m38707calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i;
        LayoutDirection layoutDirection2 = layoutDirection;
        IntRect intRect2 = intRect;
        C12775o.m28639i(intRect, "anchorBounds");
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        long IntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment2 = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        LayoutDirection layoutDirection3 = layoutDirection;
        long r12 = alignment2.m35310alignKFBX0sM(companion.m38633getZeroYbymL2g(), IntSizeKt.IntSize(intRect.getWidth(), intRect.getHeight()), layoutDirection3);
        long r1 = this.alignment.m35310alignKFBX0sM(companion.m38633getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m38628getWidthimpl(j2), IntSize.m38627getHeightimpl(j2)), layoutDirection3);
        long IntOffset2 = IntOffsetKt.IntOffset(intRect.getLeft(), intRect.getTop());
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(IntOffset2), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(IntOffset2));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset3) + IntOffset.m38586getXimpl(r12), IntOffset.m38587getYimpl(IntOffset3) + IntOffset.m38587getYimpl(r12));
        long IntOffset5 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r1), IntOffset.m38587getYimpl(r1));
        long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset4) - IntOffset.m38586getXimpl(IntOffset5), IntOffset.m38587getYimpl(IntOffset4) - IntOffset.m38587getYimpl(IntOffset5));
        int r3 = IntOffset.m38586getXimpl(this.offset);
        if (layoutDirection2 == LayoutDirection.Ltr) {
            i = 1;
        } else {
            i = -1;
        }
        long IntOffset7 = IntOffsetKt.IntOffset(r3 * i, IntOffset.m38587getYimpl(this.offset));
        return IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset6) + IntOffset.m38586getXimpl(IntOffset7), IntOffset.m38587getYimpl(IntOffset6) + IntOffset.m38587getYimpl(IntOffset7));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public final long m38708getOffsetnOccac() {
        return this.offset;
    }

    private AlignmentOffsetPositionProvider(Alignment alignment2, long j) {
        this.alignment = alignment2;
        this.offset = j;
    }
}
