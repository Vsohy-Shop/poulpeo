package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;

/* compiled from: TextLayoutResultProxy.kt */
public final class TextLayoutResultProxyKt {
    /* access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k  reason: not valid java name */
    public static final long m33743coerceIn3MmeM6k(long j, Rect rect) {
        float f;
        float f2;
        if (Offset.m35422getXimpl(j) < rect.getLeft()) {
            f = rect.getLeft();
        } else if (Offset.m35422getXimpl(j) > rect.getRight()) {
            f = rect.getRight();
        } else {
            f = Offset.m35422getXimpl(j);
        }
        if (Offset.m35423getYimpl(j) < rect.getTop()) {
            f2 = rect.getTop();
        } else if (Offset.m35423getYimpl(j) > rect.getBottom()) {
            f2 = rect.getBottom();
        } else {
            f2 = Offset.m35423getYimpl(j);
        }
        return OffsetKt.Offset(f, f2);
    }
}
