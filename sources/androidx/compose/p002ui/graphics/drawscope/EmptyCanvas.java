package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.Vertices;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.drawscope.EmptyCanvas */
/* compiled from: EmptyCanvas.kt */
public final class EmptyCanvas implements Canvas {
    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void m36344clipPathmtrdDE(Path path, int i) {
        C12775o.m28639i(path, "path");
        throw new UnsupportedOperationException();
    }

    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void m36345clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: concat-58bKbWc  reason: not valid java name */
    public void m36346concat58bKbWc(float[] fArr) {
        C12775o.m28639i(fArr, "matrix");
        throw new UnsupportedOperationException();
    }

    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    public void m36347drawCircle9KIMszo(long j, float f, Paint paint) {
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    public void m36348drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    public void m36349drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    public void m36350drawLineWko1d7g(long j, long j2, Paint paint) {
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    public void drawPath(Path path, Paint paint) {
        C12775o.m28639i(path, "path");
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    public void m36351drawPointsO7TthRY(int i, List<Offset> list, Paint paint) {
        C12775o.m28639i(list, "points");
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    /* renamed from: drawRawPoints-O7TthRY  reason: not valid java name */
    public void m36352drawRawPointsO7TthRY(int i, float[] fArr, Paint paint) {
        C12775o.m28639i(fArr, "points");
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    /* renamed from: drawVertices-TPEHhCM  reason: not valid java name */
    public void m36353drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint) {
        C12775o.m28639i(vertices, "vertices");
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    public void restore() {
        throw new UnsupportedOperationException();
    }

    public void rotate(float f) {
        throw new UnsupportedOperationException();
    }

    public void save() {
        throw new UnsupportedOperationException();
    }

    public void saveLayer(Rect rect, Paint paint) {
        C12775o.m28639i(rect, "bounds");
        C12775o.m28639i(paint, "paint");
        throw new UnsupportedOperationException();
    }

    public void scale(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    public void skew(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    public void translate(float f, float f2) {
        throw new UnsupportedOperationException();
    }
}
