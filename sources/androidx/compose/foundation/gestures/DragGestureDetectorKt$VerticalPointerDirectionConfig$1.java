package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;

/* compiled from: DragGestureDetector.kt */
public final class DragGestureDetectorKt$VerticalPointerDirectionConfig$1 implements PointerDirectionConfig {
    DragGestureDetectorKt$VerticalPointerDirectionConfig$1() {
    }

    /* renamed from: crossAxisDelta-k-4lQ0M  reason: not valid java name */
    public float m33070crossAxisDeltak4lQ0M(long j) {
        return Offset.m35422getXimpl(j);
    }

    /* renamed from: mainAxisDelta-k-4lQ0M  reason: not valid java name */
    public float m33071mainAxisDeltak4lQ0M(long j) {
        return Offset.m35423getYimpl(j);
    }

    /* renamed from: offsetFromChanges-dBAh8RU  reason: not valid java name */
    public long m33072offsetFromChangesdBAh8RU(float f, float f2) {
        return OffsetKt.Offset(f2, f);
    }
}
