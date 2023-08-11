package androidx.compose.p002ui.graphics;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.graphics.CanvasZHelper */
/* compiled from: CanvasUtils.android.kt */
final class CanvasZHelper {
    public static final CanvasZHelper INSTANCE = new CanvasZHelper();

    private CanvasZHelper() {
    }

    @DoNotInline
    public final void enableZ(Canvas canvas, boolean z) {
        C12775o.m28639i(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
