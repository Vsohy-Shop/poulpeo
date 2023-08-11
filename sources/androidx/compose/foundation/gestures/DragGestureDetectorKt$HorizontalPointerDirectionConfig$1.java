package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;

/* compiled from: DragGestureDetector.kt */
public final class DragGestureDetectorKt$HorizontalPointerDirectionConfig$1 implements PointerDirectionConfig {
    DragGestureDetectorKt$HorizontalPointerDirectionConfig$1() {
    }

    /* renamed from: crossAxisDelta-k-4lQ0M  reason: not valid java name */
    public float m33067crossAxisDeltak4lQ0M(long j) {
        return Offset.m35423getYimpl(j);
    }

    /* renamed from: mainAxisDelta-k-4lQ0M  reason: not valid java name */
    public float m33068mainAxisDeltak4lQ0M(long j) {
        return Offset.m35422getXimpl(j);
    }

    /* renamed from: offsetFromChanges-dBAh8RU  reason: not valid java name */
    public long m33069offsetFromChangesdBAh8RU(float f, float f2) {
        return OffsetKt.Offset(f, f2);
    }
}
