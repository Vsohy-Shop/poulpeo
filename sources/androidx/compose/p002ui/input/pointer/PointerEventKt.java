package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.pointer.PointerEventKt */
/* compiled from: PointerEvent.kt */
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        if (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
            return false;
        }
        return true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        if (pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
            return false;
        }
        return true;
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        if (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) {
            return false;
        }
        return true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        if (!pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) {
            return false;
        }
        return true;
    }

    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        pointerInputChange.consume();
    }

    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        if (!Offset.m35419equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m35438getZeroF1C5BW0())) {
            pointerInputChange.consume();
        }
    }

    /* renamed from: isOutOfBounds-O0kMr_c  reason: not valid java name */
    public static final boolean m37116isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j) {
        C12775o.m28639i(pointerInputChange, "$this$isOutOfBounds");
        long r0 = pointerInputChange.m37169getPositionF1C5BW0();
        float r3 = Offset.m35422getXimpl(r0);
        float r02 = Offset.m35423getYimpl(r0);
        int r1 = IntSize.m38628getWidthimpl(j);
        int r4 = IntSize.m38627getHeightimpl(j);
        if (r3 < 0.0f || r3 > ((float) r1) || r02 < 0.0f || r02 > ((float) r4)) {
            return true;
        }
        return false;
    }

    /* renamed from: isOutOfBounds-jwHxaWs  reason: not valid java name */
    public static final boolean m37117isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j, long j2) {
        C12775o.m28639i(pointerInputChange, "$this$isOutOfBounds");
        if (!PointerType.m37241equalsimpl0(pointerInputChange.m37172getTypeT8wyACA(), PointerType.Companion.m37248getTouchT8wyACA())) {
            return m37116isOutOfBoundsO0kMr_c(pointerInputChange, j);
        }
        long r0 = pointerInputChange.m37169getPositionF1C5BW0();
        float r4 = Offset.m35422getXimpl(r0);
        float r02 = Offset.m35423getYimpl(r0);
        float r2 = ((float) IntSize.m38628getWidthimpl(j)) + Size.m35491getWidthimpl(j2);
        float f = -Size.m35488getHeightimpl(j2);
        float r5 = ((float) IntSize.m38627getHeightimpl(j)) + Size.m35488getHeightimpl(j2);
        if (r4 < (-Size.m35491getWidthimpl(j2)) || r4 > r2 || r02 < f || r02 > r5) {
            return true;
        }
        return false;
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long r0 = Offset.m35426minusMKHz9U(pointerInputChange.m37169getPositionF1C5BW0(), pointerInputChange.m37170getPreviousPositionF1C5BW0());
        if (z || !pointerInputChange.isConsumed()) {
            return r0;
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        return !Offset.m35419equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m35438getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "<this>");
        return !Offset.m35419equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m35438getZeroF1C5BW0());
    }
}
