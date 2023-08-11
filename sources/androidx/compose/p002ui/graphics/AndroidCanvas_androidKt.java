package androidx.compose.p002ui.graphics;

import android.graphics.Canvas;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidCanvas_androidKt */
/* compiled from: AndroidCanvas.android.kt */
public final class AndroidCanvas_androidKt {
    /* access modifiers changed from: private */
    public static final Canvas EmptyCanvas = new Canvas();

    public static final Canvas ActualCanvas(ImageBitmap imageBitmap) {
        C12775o.m28639i(imageBitmap, "image");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap)));
        return androidCanvas;
    }

    public static final Canvas Canvas(Canvas canvas) {
        C12775o.m28639i(canvas, "c");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(canvas);
        return androidCanvas;
    }

    public static final Canvas getNativeCanvas(Canvas canvas) {
        C12775o.m28639i(canvas, "<this>");
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
