package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.graphics.CanvasKt */
/* compiled from: Canvas.kt */
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap imageBitmap) {
        C12775o.m28639i(imageBitmap, "image");
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(Canvas canvas, float f, float f2, float f3) {
        boolean z;
        C12775o.m28639i(canvas, "<this>");
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            canvas.translate(f2, f3);
            canvas.rotate(f);
            canvas.translate(-f2, -f3);
        }
    }

    public static final void rotateRad(Canvas canvas, float f, float f2, float f3) {
        C12775o.m28639i(canvas, "<this>");
        rotate(canvas, DegreesKt.degrees(f), f2, f3);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        rotateRad(canvas, f, f2, f3);
    }

    public static final void scale(Canvas canvas, float f, float f2, float f3, float f4) {
        boolean z;
        C12775o.m28639i(canvas, "<this>");
        boolean z2 = true;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f2 != 1.0f) {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        canvas.translate(f3, f4);
        canvas.scale(f, f2);
        canvas.translate(-f3, -f4);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        scale(canvas, f, f2, f3, f4);
    }

    public static final void withSave(Canvas canvas, C13074a<C11921v> aVar) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(aVar, "block");
        try {
            canvas.save();
            aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            canvas.restore();
            C12773m.m28628a(1);
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, C13074a<C11921v> aVar) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(rect, "bounds");
        C12775o.m28639i(paint, "paint");
        C12775o.m28639i(aVar, "block");
        try {
            canvas.saveLayer(rect, paint);
            aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            canvas.restore();
            C12773m.m28628a(1);
        }
    }
}
