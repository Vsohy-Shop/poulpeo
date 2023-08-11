package androidx.compose.p002ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.TextAndroidCanvas */
/* compiled from: TextAndroidCanvas.kt */
public final class TextAndroidCanvas extends Canvas {
    private Canvas nativeCanvas;

    @RequiresApi(26)
    public boolean clipOutPath(Path path) {
        C12775o.m28639i(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutPath(path);
    }

    @RequiresApi(26)
    public boolean clipOutRect(RectF rectF) {
        C12775o.m28639i(rectF, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rectF);
    }

    public boolean clipPath(Path path, Region.Op op) {
        C12775o.m28639i(path, "path");
        C12775o.m28639i(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    public boolean clipRect(RectF rectF, Region.Op op) {
        C12775o.m28639i(rectF, "rect");
        C12775o.m28639i(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    public void concat(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @RequiresApi(29)
    public void disableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    public void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i, i2, i3, i4);
    }

    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        C12775o.m28639i(rectF, "oval");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        C12775o.m28639i(bitmap, "bitmap");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f, f2, paint);
    }

    public void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Bitmap bitmap2 = bitmap;
        C12775o.m28639i(bitmap, "bitmap");
        float[] fArr2 = fArr;
        C12775o.m28639i(fArr, "verts");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    public void drawCircle(float f, float f2, float f3, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    public void drawColor(int i) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i);
    }

    @RequiresApi(29)
    public void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        RectF rectF3 = rectF;
        C12775o.m28639i(rectF, "outer");
        RectF rectF4 = rectF2;
        C12775o.m28639i(rectF2, "inner");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    @RequiresApi(31)
    public void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        int[] iArr2 = iArr;
        C12775o.m28639i(iArr, "glyphIds");
        float[] fArr2 = fArr;
        C12775o.m28639i(fArr, "positions");
        Font font2 = font;
        C12775o.m28639i(font, "font");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f, f2, f3, f4, paint);
    }

    public void drawLines(float[] fArr, int i, int i2, Paint paint) {
        C12775o.m28639i(fArr, "pts");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i, i2, paint);
    }

    public void drawOval(RectF rectF, Paint paint) {
        C12775o.m28639i(rectF, "oval");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    public void drawPaint(Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        C12775o.m28639i(ninePatch, "patch");
        C12775o.m28639i(rect, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public void drawPath(Path path, Paint paint) {
        C12775o.m28639i(path, "path");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    public void drawPicture(Picture picture) {
        C12775o.m28639i(picture, "picture");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    public void drawPoint(float f, float f2, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f, f2, paint);
    }

    public void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i, i2, paint);
    }

    public void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        C12775o.m28639i(cArr, "text");
        C12775o.m28639i(fArr, "pos");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i, i2, fArr, paint);
    }

    public void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i, i2, i3);
    }

    public void drawRect(RectF rectF, Paint paint) {
        C12775o.m28639i(rectF, "rect");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @RequiresApi(29)
    public void drawRenderNode(RenderNode renderNode) {
        C12775o.m28639i(renderNode, "renderNode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        C12775o.m28639i(rectF, "rect");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f, f2, paint);
    }

    public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        C12775o.m28639i(cArr, "text");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i, i2, f, f2, paint);
    }

    public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        char[] cArr2 = cArr;
        C12775o.m28639i(cArr, "text");
        Path path2 = path;
        C12775o.m28639i(path, "path");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @RequiresApi(23)
    public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        char[] cArr2 = cArr;
        C12775o.m28639i(cArr, "text");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    public void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        Canvas.VertexMode vertexMode2 = vertexMode;
        C12775o.m28639i(vertexMode, "mode");
        C12775o.m28639i(fArr, "verts");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @RequiresApi(29)
    public void enableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    public boolean getClipBounds(Rect rect) {
        C12775o.m28639i(rect, "bounds");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    public void getMatrix(Matrix matrix) {
        C12775o.m28639i(matrix, "ctm");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        C12775o.m28639i(rectF, "rect");
        C12775o.m28639i(edgeType, JSONAPIResourceIdSerializer.FIELD_TYPE);
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    public void restoreToCount(int i) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i);
    }

    public void rotate(float f) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f);
    }

    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    public int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i);
    }

    public int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i, i2);
    }

    public void scale(float f, float f2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f, f2);
    }

    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setCanvas(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        this.nativeCanvas = canvas;
    }

    public void setDensity(int i) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i);
    }

    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    public void skew(float f, float f2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f, f2);
    }

    public void translate(float f, float f2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f, f2);
    }

    @RequiresApi(26)
    public boolean clipOutRect(Rect rect) {
        C12775o.m28639i(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rect);
    }

    public boolean clipPath(Path path) {
        C12775o.m28639i(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    public boolean clipRect(Rect rect, Region.Op op) {
        C12775o.m28639i(rect, "rect");
        C12775o.m28639i(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        C12775o.m28639i(bitmap, "bitmap");
        C12775o.m28639i(rectF, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @RequiresApi(29)
    public void drawColor(long j) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j);
    }

    @RequiresApi(29)
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        C12775o.m28639i(rectF, "outer");
        C12775o.m28639i(fArr, "outerRadii");
        C12775o.m28639i(rectF2, "inner");
        C12775o.m28639i(fArr2, "innerRadii");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public void drawLines(float[] fArr, Paint paint) {
        C12775o.m28639i(fArr, "pts");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f, f2, f3, f4, paint);
    }

    @RequiresApi(31)
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        C12775o.m28639i(ninePatch, "patch");
        C12775o.m28639i(rectF, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public void drawPicture(Picture picture, RectF rectF) {
        C12775o.m28639i(picture, "picture");
        C12775o.m28639i(rectF, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    public void drawPoints(float[] fArr, Paint paint) {
        C12775o.m28639i(fArr, "pts");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    public void drawPosText(String str, float[] fArr, Paint paint) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(fArr, "pos");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    public void drawRect(Rect rect, Paint paint) {
        C12775o.m28639i(rect, "r");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    public void drawText(String str, float f, float f2, Paint paint) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f, f2, paint);
    }

    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(path, "path");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f, f2, paint);
    }

    @RequiresApi(23)
    public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        CharSequence charSequence2 = charSequence;
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @RequiresApi(30)
    public boolean quickReject(RectF rectF) {
        C12775o.m28639i(rectF, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF);
    }

    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    public int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i);
    }

    @RequiresApi(26)
    public boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public boolean clipRect(RectF rectF) {
        C12775o.m28639i(rectF, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        C12775o.m28639i(bitmap, "bitmap");
        C12775o.m28639i(rect2, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    public void drawColor(int i, PorterDuff.Mode mode) {
        C12775o.m28639i(mode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, mode);
    }

    public void drawPicture(Picture picture, Rect rect) {
        C12775o.m28639i(picture, "picture");
        C12775o.m28639i(rect, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    @RequiresApi(29)
    public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        MeasuredText measuredText2 = measuredText;
        C12775o.m28639i(measuredText, "text");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        C12775o.m28639i(path, "path");
        C12775o.m28639i(edgeType, JSONAPIResourceIdSerializer.FIELD_TYPE);
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint, i);
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @RequiresApi(26)
    public boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public boolean clipRect(Rect rect) {
        C12775o.m28639i(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    public void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        int[] iArr2 = iArr;
        C12775o.m28639i(iArr, "colors");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @RequiresApi(29)
    public void drawColor(int i, BlendMode blendMode) {
        C12775o.m28639i(blendMode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, blendMode);
    }

    public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        C12775o.m28639i(charSequence, "text");
        C12775o.m28639i(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    @RequiresApi(30)
    public boolean quickReject(Path path) {
        C12775o.m28639i(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path);
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint);
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    public boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        C12775o.m28639i(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4, op);
    }

    public void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        int[] iArr2 = iArr;
        C12775o.m28639i(iArr, "colors");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @RequiresApi(29)
    public void drawColor(long j, BlendMode blendMode) {
        C12775o.m28639i(blendMode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j, blendMode);
    }

    public boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        C12775o.m28639i(edgeType, JSONAPIResourceIdSerializer.FIELD_TYPE);
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f, f2, f3, f4, edgeType);
    }

    public boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4);
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        C12775o.m28639i(bitmap, "bitmap");
        C12775o.m28639i(matrix, "matrix");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @RequiresApi(30)
    public boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f, f2, f3, f4);
    }

    public boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            C12775o.m28656z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i, i2, i3, i4);
    }
}
