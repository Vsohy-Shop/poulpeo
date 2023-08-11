package androidx.compose.p002ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.text.android.Paint29 */
/* compiled from: PaintExtensions.kt */
final class Paint29 {
    public static final Paint29 INSTANCE = new Paint29();

    private Paint29() {
    }

    @DoNotInline
    public static final void getTextBounds(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        C12775o.m28639i(paint, "paint");
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(rect, "rect");
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
