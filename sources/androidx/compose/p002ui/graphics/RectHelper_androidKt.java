package androidx.compose.p002ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.p002ui.unit.IntRect;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.RectHelper_androidKt */
/* compiled from: RectHelper.android.kt */
public final class RectHelper_androidKt {
    public static final Rect toAndroidRect(androidx.compose.p002ui.geometry.Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    public static final RectF toAndroidRectF(androidx.compose.p002ui.geometry.Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    public static final IntRect toComposeIntRect(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.p002ui.geometry.Rect toComposeRect(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return new androidx.compose.p002ui.geometry.Rect((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    public static final Rect toAndroidRect(IntRect intRect) {
        C12775o.m28639i(intRect, "<this>");
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
