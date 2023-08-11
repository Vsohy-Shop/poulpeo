package androidx.compose.p002ui.geometry;

import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.geometry.RectKt */
/* compiled from: Rect.kt */
public final class RectKt {
    @Stable
    /* renamed from: Rect-0a9Yr6o  reason: not valid java name */
    public static final Rect m35460Rect0a9Yr6o(long j, long j2) {
        return new Rect(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2));
    }

    @Stable
    /* renamed from: Rect-3MmeM6k  reason: not valid java name */
    public static final Rect m35461Rect3MmeM6k(long j, float f) {
        return new Rect(Offset.m35422getXimpl(j) - f, Offset.m35423getYimpl(j) - f, Offset.m35422getXimpl(j) + f, Offset.m35423getYimpl(j) + f);
    }

    @Stable
    /* renamed from: Rect-tz77jQw  reason: not valid java name */
    public static final Rect m35462Recttz77jQw(long j, long j2) {
        return new Rect(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j) + Size.m35491getWidthimpl(j2), Offset.m35423getYimpl(j) + Size.m35488getHeightimpl(j2));
    }

    @Stable
    public static final Rect lerp(Rect rect, Rect rect2, float f) {
        C12775o.m28639i(rect, "start");
        C12775o.m28639i(rect2, "stop");
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f));
    }
}
