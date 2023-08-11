package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.HorizontalAlignmentLine;
import androidx.compose.p002ui.unit.IntOffset;

/* renamed from: androidx.compose.ui.node.LayoutModifierNodeCoordinatorKt */
/* compiled from: LayoutModifierNodeCoordinator.kt */
public final class LayoutModifierNodeCoordinatorKt {
    /* access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        boolean z;
        int i;
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line").toString());
        } else if (lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        } else {
            int i2 = child.get(alignmentLine);
            if (i2 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            child.setShallowPlacing$ui_release(true);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
            lookaheadCapablePlaceable.replace$ui_release();
            child.setShallowPlacing$ui_release(false);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(false);
            if (alignmentLine instanceof HorizontalAlignmentLine) {
                i = IntOffset.m38587getYimpl(child.m37559getPositionnOccac());
            } else {
                i = IntOffset.m38586getXimpl(child.m37559getPositionnOccac());
            }
            return i2 + i;
        }
    }
}
