package androidx.compose.p002ui.graphics;

import android.graphics.Canvas;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.CanvasHolder */
/* compiled from: AndroidCanvas.android.kt */
public final class CanvasHolder {
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public final void drawInto(Canvas canvas, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "targetCanvas");
        C12775o.m28639i(function1, "block");
        Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        function1.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }
}
