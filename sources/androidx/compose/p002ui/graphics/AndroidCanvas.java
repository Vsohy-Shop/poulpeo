package androidx.compose.p002ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.PointMode;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p436tf.C13525d;

@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,428:1\n35#2,5:429\n35#2,5:434\n33#3,6:439\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:429,5\n242#1:434,5\n315#1:439,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidCanvas */
/* compiled from: AndroidCanvas.android.kt */
public final class AndroidCanvas implements Canvas {
    private final Rect dstRect = new Rect();
    private Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    private final Rect srcRect = new Rect();

    private final void drawLines(List<Offset> list, Paint paint, int i) {
        if (list.size() >= 2) {
            C13525d s = C13537l.m30892s(C13537l.m30893t(0, list.size() - 1), i);
            int j = s.mo53147j();
            int k = s.mo53148k();
            int q = s.mo53149q();
            if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
                while (true) {
                    long r2 = list.get(j).m35432unboximpl();
                    long r4 = list.get(j + 1).m35432unboximpl();
                    this.internalCanvas.drawLine(Offset.m35422getXimpl(r2), Offset.m35423getYimpl(r2), Offset.m35422getXimpl(r4), Offset.m35423getYimpl(r4), paint.asFrameworkPaint());
                    if (j != k) {
                        j += q;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long r2 = list.get(i).m35432unboximpl();
            this.internalCanvas.drawPoint(Offset.m35422getXimpl(r2), Offset.m35423getYimpl(r2), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i) {
        if (fArr.length >= 4 && fArr.length % 2 == 0) {
            C13525d s = C13537l.m30892s(C13537l.m30893t(0, fArr.length - 3), i * 2);
            int j = s.mo53147j();
            int k = s.mo53148k();
            int q = s.mo53149q();
            if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
                while (true) {
                    this.internalCanvas.drawLine(fArr[j], fArr[j + 1], fArr[j + 2], fArr[j + 3], paint.asFrameworkPaint());
                    if (j != k) {
                        j += q;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i) {
        if (fArr.length % 2 == 0) {
            C13525d s = C13537l.m30892s(C13537l.m30893t(0, fArr.length - 1), i);
            int j = s.mo53147j();
            int k = s.mo53148k();
            int q = s.mo53149q();
            if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
                while (true) {
                    this.internalCanvas.drawPoint(fArr[j], fArr[j + 1], paint.asFrameworkPaint());
                    if (j != k) {
                        j += q;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void m35516clipPathmtrdDE(Path path, int i) {
        C12775o.m28639i(path, "path");
        Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m35526toRegionOp7u2Bmg(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void m35517clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.internalCanvas.clipRect(f, f2, f3, f4, m35526toRegionOp7u2Bmg(i));
    }

    /* renamed from: concat-58bKbWc  reason: not valid java name */
    public void m35518concat58bKbWc(float[] fArr) {
        C12775o.m28639i(fArr, "matrix");
        if (!MatrixKt.m35922isIdentity58bKbWc(fArr)) {
            Matrix matrix = new Matrix();
            AndroidMatrixConversions_androidKt.m35533setFromEL8BTi8(matrix, fArr);
            this.internalCanvas.concat(matrix);
        }
    }

    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawArc(f, f2, f3, f4, f5, f6, z, paint.asFrameworkPaint());
    }

    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    public void m35519drawCircle9KIMszo(long j, float f, Paint paint) {
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), f, paint.asFrameworkPaint());
    }

    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    public void m35520drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), paint.asFrameworkPaint());
    }

    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    public void m35521drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        rect.left = IntOffset.m38586getXimpl(j);
        rect.top = IntOffset.m38587getYimpl(j);
        rect.right = IntOffset.m38586getXimpl(j) + IntSize.m38628getWidthimpl(j2);
        rect.bottom = IntOffset.m38587getYimpl(j) + IntSize.m38627getHeightimpl(j2);
        C11921v vVar = C11921v.f18618a;
        Rect rect2 = this.dstRect;
        rect2.left = IntOffset.m38586getXimpl(j3);
        rect2.top = IntOffset.m38587getYimpl(j3);
        rect2.right = IntOffset.m38586getXimpl(j3) + IntSize.m38628getWidthimpl(j4);
        rect2.bottom = IntOffset.m38587getYimpl(j3) + IntSize.m38627getHeightimpl(j4);
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    public void m35522drawLineWko1d7g(long j, long j2, Paint paint) {
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawLine(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2), paint.asFrameworkPaint());
    }

    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawOval(f, f2, f3, f4, paint.asFrameworkPaint());
    }

    public void drawPath(Path path, Paint paint) {
        C12775o.m28639i(path, "path");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    public void m35523drawPointsO7TthRY(int i, List<Offset> list, Paint paint) {
        C12775o.m28639i(list, "points");
        C12775o.m28639i(paint, "paint");
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m35984equalsimpl0(i, companion.m35988getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m35984equalsimpl0(i, companion.m35990getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m35984equalsimpl0(i, companion.m35989getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    /* renamed from: drawRawPoints-O7TthRY  reason: not valid java name */
    public void m35524drawRawPointsO7TthRY(int i, float[] fArr, Paint paint) {
        C12775o.m28639i(fArr, "points");
        C12775o.m28639i(paint, "paint");
        if (fArr.length % 2 == 0) {
            PointMode.Companion companion = PointMode.Companion;
            if (PointMode.m35984equalsimpl0(i, companion.m35988getLinesr_lszbg())) {
                drawRawLines(fArr, paint, 2);
            } else if (PointMode.m35984equalsimpl0(i, companion.m35990getPolygonr_lszbg())) {
                drawRawLines(fArr, paint, 1);
            } else if (PointMode.m35984equalsimpl0(i, companion.m35989getPointsr_lszbg())) {
                drawRawPoints(fArr, paint, 2);
            }
        } else {
            throw new IllegalArgumentException("points must have an even number of values");
        }
    }

    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawRect(f, f2, f3, f4, paint.asFrameworkPaint());
    }

    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint.asFrameworkPaint());
    }

    /* renamed from: drawVertices-TPEHhCM  reason: not valid java name */
    public void m35525drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint) {
        C12775o.m28639i(vertices, "vertices");
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m35568toAndroidVertexModeJOOmi9M(vertices.m36104getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public void restore() {
        this.internalCanvas.restore();
    }

    public void rotate(float f) {
        this.internalCanvas.rotate(f);
    }

    public void save() {
        this.internalCanvas.save();
    }

    public void saveLayer(androidx.compose.p002ui.geometry.Rect rect, Paint paint) {
        C12775o.m28639i(rect, "bounds");
        C12775o.m28639i(paint, "paint");
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.asFrameworkPaint(), 31);
    }

    public void scale(float f, float f2) {
        this.internalCanvas.scale(f, f2);
    }

    public final void setInternalCanvas(Canvas canvas) {
        C12775o.m28639i(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    public void skew(float f, float f2) {
        this.internalCanvas.skew(f, f2);
    }

    /* renamed from: toRegionOp--7u2Bmg  reason: not valid java name */
    public final Region.Op m35526toRegionOp7u2Bmg(int i) {
        if (ClipOp.m35655equalsimpl0(i, ClipOp.Companion.m35659getDifferencertfAjoo())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    public void translate(float f, float f2) {
        this.internalCanvas.translate(f, f2);
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }
}
