package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.Canvas */
/* compiled from: Canvas.kt */
public interface Canvas {

    /* renamed from: androidx.compose.ui.graphics.Canvas$DefaultImpls */
    /* compiled from: Canvas.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
        public static void m35649clipRectmtrdDE(Canvas canvas, Rect rect, int i) {
            C12775o.m28639i(rect, "rect");
            Canvas.super.m35638clipRectmtrdDE(rect, i);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            C12775o.m28639i(rect, "rect");
            C12775o.m28639i(paint, "paint");
            Canvas.super.drawArc(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            C12775o.m28639i(rect, "rect");
            C12775o.m28639i(paint, "paint");
            Canvas.super.drawArcRad(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            C12775o.m28639i(rect, "rect");
            C12775o.m28639i(paint, "paint");
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            C12775o.m28639i(rect, "rect");
            C12775o.m28639i(paint, "paint");
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(Canvas canvas, float f, float f2) {
            Canvas.super.skewRad(f, f2);
        }
    }

    /* renamed from: clipPath-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m35632clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m35660getIntersectrtfAjoo();
            }
            canvas.m35636clipPathmtrdDE(path, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: clipRect-N_I0leg$default  reason: not valid java name */
    static /* synthetic */ void m35633clipRectN_I0leg$default(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m35660getIntersectrtfAjoo();
            }
            canvas.m35637clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: clipRect-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m35634clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m35660getIntersectrtfAjoo();
            }
            canvas.m35638clipRectmtrdDE(rect, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    /* renamed from: drawImageRect-HPBpro0$default  reason: not valid java name */
    static /* synthetic */ void m35635drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (obj == null) {
            if ((i & 2) != 0) {
                j5 = IntOffset.Companion.m38596getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i & 8) != 0) {
                j7 = IntOffset.Companion.m38596getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            canvas.m35642drawImageRectHPBpro0(imageBitmap, j5, j6, j7, j8, paint);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f2 = f;
            }
            canvas.scale(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
    }

    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    void m35636clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    void m35637clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
    void m35638clipRectmtrdDE(Rect rect, int i) {
        C12775o.m28639i(rect, "rect");
        m35637clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
    }

    /* renamed from: concat-58bKbWc  reason: not valid java name */
    void m35639concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint);

    void drawArc(Rect rect, float f, float f2, boolean z, Paint paint) {
        C12775o.m28639i(rect, "rect");
        C12775o.m28639i(paint, "paint");
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
    }

    void drawArcRad(Rect rect, float f, float f2, boolean z, Paint paint) {
        C12775o.m28639i(rect, "rect");
        C12775o.m28639i(paint, "paint");
        drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
    }

    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    void m35640drawCircle9KIMszo(long j, float f, Paint paint);

    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    void m35641drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint);

    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    void m35642drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    void m35643drawLineWko1d7g(long j, long j2, Paint paint);

    void drawOval(float f, float f2, float f3, float f4, Paint paint);

    void drawOval(Rect rect, Paint paint) {
        C12775o.m28639i(rect, "rect");
        C12775o.m28639i(paint, "paint");
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(Path path, Paint paint);

    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    void m35644drawPointsO7TthRY(int i, List<Offset> list, Paint paint);

    /* renamed from: drawRawPoints-O7TthRY  reason: not valid java name */
    void m35645drawRawPointsO7TthRY(int i, float[] fArr, Paint paint);

    void drawRect(float f, float f2, float f3, float f4, Paint paint);

    void drawRect(Rect rect, Paint paint) {
        C12775o.m28639i(rect, "rect");
        C12775o.m28639i(paint, "paint");
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    /* renamed from: drawVertices-TPEHhCM  reason: not valid java name */
    void m35646drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f, float f2);

    void skew(float f, float f2);

    void skewRad(float f, float f2) {
        skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    void translate(float f, float f2);
}
