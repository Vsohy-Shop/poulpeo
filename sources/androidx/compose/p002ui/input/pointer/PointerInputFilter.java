package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.PointerInputFilter */
/* compiled from: PointerEvent.kt */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;
    private LayoutCoordinates layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    @ExperimentalComposeUiApi
    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m37189getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates2 = this.layoutCoordinates;
        if (layoutCoordinates2 != null) {
            return layoutCoordinates2.m37341getSizeYbymL2g();
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public abstract void m37190onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    public final void setAttached$ui_release(boolean z) {
        this.isAttached = z;
    }

    public final void setLayoutCoordinates$ui_release(LayoutCoordinates layoutCoordinates2) {
        this.layoutCoordinates = layoutCoordinates2;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }
}
