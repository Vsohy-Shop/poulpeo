package androidx.compose.p002ui.unit;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.unit.IntRectKt */
/* compiled from: IntRect.kt */
public final class IntRectKt {
    @Stable
    /* renamed from: IntRect-E1MhUcY  reason: not valid java name */
    public static final IntRect m38617IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m38586getXimpl(j), IntOffset.m38587getYimpl(j), IntOffset.m38586getXimpl(j2), IntOffset.m38587getYimpl(j2));
    }

    @Stable
    /* renamed from: IntRect-VbeCjmY  reason: not valid java name */
    public static final IntRect m38618IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m38586getXimpl(j), IntOffset.m38587getYimpl(j), IntOffset.m38586getXimpl(j) + IntSize.m38628getWidthimpl(j2), IntOffset.m38587getYimpl(j) + IntSize.m38627getHeightimpl(j2));
    }

    @Stable
    /* renamed from: IntRect-ar5cAso  reason: not valid java name */
    public static final IntRect m38619IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m38586getXimpl(j) - i, IntOffset.m38587getYimpl(j) - i, IntOffset.m38586getXimpl(j) + i, IntOffset.m38587getYimpl(j) + i);
    }

    @Stable
    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f) {
        C12775o.m28639i(intRect, "start");
        C12775o.m28639i(intRect2, "stop");
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    @Stable
    public static final IntRect roundToIntRect(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return new IntRect(C13265c.m30134c(rect.getLeft()), C13265c.m30134c(rect.getTop()), C13265c.m30134c(rect.getRight()), C13265c.m30134c(rect.getBottom()));
    }

    @Stable
    public static final Rect toRect(IntRect intRect) {
        C12775o.m28639i(intRect, "<this>");
        return new Rect((float) intRect.getLeft(), (float) intRect.getTop(), (float) intRect.getRight(), (float) intRect.getBottom());
    }
}
