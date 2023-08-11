package androidx.compose.p002ui.graphics.drawscope;

import android.graphics.Shader;
import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.FilterQuality;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.PaintingStyle;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,804:1\n1#2:805\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScope */
/* compiled from: CanvasDrawScope.kt */
public final class CanvasDrawScope implements DrawScope {
    private final DrawContext drawContext = new CanvasDrawScope$drawContext$1(this);
    private final DrawParams drawParams = new DrawParams((Density) null, (LayoutDirection) null, (Canvas) null, 0, 15, (DefaultConstructorMarker) null);
    private Paint fillPaint;
    private Paint strokePaint;

    /* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams */
    /* compiled from: CanvasDrawScope.kt */
    public static final class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density2, LayoutDirection layoutDirection2, Canvas canvas2, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(density2, layoutDirection2, canvas2, j);
        }

        /* renamed from: copy-Ug5Nnss$default  reason: not valid java name */
        public static /* synthetic */ DrawParams m36173copyUg5Nnss$default(DrawParams drawParams, Density density2, LayoutDirection layoutDirection2, Canvas canvas2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                density2 = drawParams.density;
            }
            if ((i & 2) != 0) {
                layoutDirection2 = drawParams.layoutDirection;
            }
            LayoutDirection layoutDirection3 = layoutDirection2;
            if ((i & 4) != 0) {
                canvas2 = drawParams.canvas;
            }
            Canvas canvas3 = canvas2;
            if ((i & 8) != 0) {
                j = drawParams.size;
            }
            return drawParams.m36175copyUg5Nnss(density2, layoutDirection3, canvas3, j);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc  reason: not valid java name */
        public final long m36174component4NHjbRc() {
            return this.size;
        }

        /* renamed from: copy-Ug5Nnss  reason: not valid java name */
        public final DrawParams m36175copyUg5Nnss(Density density2, LayoutDirection layoutDirection2, Canvas canvas2, long j) {
            C12775o.m28639i(density2, "density");
            C12775o.m28639i(layoutDirection2, "layoutDirection");
            C12775o.m28639i(canvas2, "canvas");
            return new DrawParams(density2, layoutDirection2, canvas2, j, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            if (C12775o.m28634d(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && C12775o.m28634d(this.canvas, drawParams.canvas) && Size.m35487equalsimpl0(this.size, drawParams.size)) {
                return true;
            }
            return false;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public final long m36176getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m35492hashCodeimpl(this.size);
        }

        public final void setCanvas(Canvas canvas2) {
            C12775o.m28639i(canvas2, "<set-?>");
            this.canvas = canvas2;
        }

        public final void setDensity(Density density2) {
            C12775o.m28639i(density2, "<set-?>");
            this.density = density2;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection2) {
            C12775o.m28639i(layoutDirection2, "<set-?>");
            this.layoutDirection = layoutDirection2;
        }

        /* renamed from: setSize-uvyYCjk  reason: not valid java name */
        public final void m36177setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + Size.m35495toStringimpl(this.size) + ')';
        }

        private DrawParams(Density density2, LayoutDirection layoutDirection2, Canvas canvas2, long j) {
            this.density = density2;
            this.layoutDirection = layoutDirection2;
            this.canvas = canvas2;
            this.size = j;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DrawParams(Density density2, LayoutDirection layoutDirection2, Canvas canvas2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CanvasDrawScopeKt.access$getDefaultDensity$p() : density2, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection2, (i & 4) != 0 ? new EmptyCanvas() : canvas2, (i & 8) != 0 ? Size.Companion.m35500getZeroNHjbRc() : j, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: configurePaint-2qPWKa0  reason: not valid java name */
    private final Paint m36144configurePaint2qPWKa0(long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint selectPaint = selectPaint(drawStyle);
        long r3 = m36152modulate5vOe2sY(j, f);
        if (!Color.m35672equalsimpl0(selectPaint.m35928getColor0d7_KjU(), r3)) {
            selectPaint.m35934setColor8_81llA(r3);
        }
        if (selectPaint.getShader() != null) {
            selectPaint.setShader((Shader) null);
        }
        if (!C12775o.m28634d(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m35573equalsimpl0(selectPaint.m35927getBlendMode0nO6VwU(), i)) {
            selectPaint.m35933setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m35761equalsimpl0(selectPaint.m35929getFilterQualityfv9h1I(), i2)) {
            selectPaint.m35935setFilterQualityvDHp3xo(i2);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default  reason: not valid java name */
    static /* synthetic */ Paint m36145configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        int i4;
        if ((i3 & 32) != 0) {
            i4 = DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I();
        } else {
            i4 = i2;
        }
        return canvasDrawScope.m36144configurePaint2qPWKa0(j, drawStyle, f, colorFilter, i, i4);
    }

    /* renamed from: configurePaint-swdJneE  reason: not valid java name */
    private final Paint m36146configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        boolean z;
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.m35608applyToPq9zytI(m36274getSizeNHjbRc(), selectPaint, f);
        } else {
            if (selectPaint.getAlpha() == f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                selectPaint.setAlpha(f);
            }
        }
        if (!C12775o.m28634d(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m35573equalsimpl0(selectPaint.m35927getBlendMode0nO6VwU(), i)) {
            selectPaint.m35933setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m35761equalsimpl0(selectPaint.m35929getFilterQualityfv9h1I(), i2)) {
            selectPaint.m35935setFilterQualityvDHp3xo(i2);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default  reason: not valid java name */
    static /* synthetic */ Paint m36147configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m36146configurePaintswdJneE(brush, drawStyle, f, colorFilter, i, i2);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI  reason: not valid java name */
    private final Paint m36148configureStrokePaintQ_0CZUI(long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        boolean z;
        Paint obtainStrokePaint = obtainStrokePaint();
        long r4 = m36152modulate5vOe2sY(j, f3);
        if (!Color.m35672equalsimpl0(obtainStrokePaint.m35928getColor0d7_KjU(), r4)) {
            obtainStrokePaint.m35934setColor8_81llA(r4);
        }
        if (obtainStrokePaint.getShader() != null) {
            obtainStrokePaint.setShader((Shader) null);
        }
        if (!C12775o.m28634d(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m35573equalsimpl0(obtainStrokePaint.m35927getBlendMode0nO6VwU(), i3)) {
            obtainStrokePaint.m35933setBlendModes9anfk8(i3);
        }
        boolean z2 = true;
        if (obtainStrokePaint.getStrokeWidth() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            obtainStrokePaint.setStrokeWidth(f);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f2) {
            z2 = false;
        }
        if (!z2) {
            obtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m36050equalsimpl0(obtainStrokePaint.m35930getStrokeCapKaPHkGw(), i)) {
            obtainStrokePaint.m35936setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m36060equalsimpl0(obtainStrokePaint.m35931getStrokeJoinLxFBmk8(), i2)) {
            obtainStrokePaint.m35937setStrokeJoinWw9F2mQ(i2);
        }
        if (!C12775o.m28634d(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m35761equalsimpl0(obtainStrokePaint.m35929getFilterQualityfv9h1I(), i4)) {
            obtainStrokePaint.m35935setFilterQualityvDHp3xo(i4);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default  reason: not valid java name */
    static /* synthetic */ Paint m36149configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 512) != 0) {
            i6 = DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I();
        } else {
            i6 = i4;
        }
        return canvasDrawScope.m36148configureStrokePaintQ_0CZUI(j, f, f2, i, i2, pathEffect, f3, colorFilter, i3, i6);
    }

    /* renamed from: configureStrokePaint-ho4zsrM  reason: not valid java name */
    private final Paint m36150configureStrokePaintho4zsrM(Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        boolean z;
        boolean z2;
        Paint obtainStrokePaint = obtainStrokePaint();
        boolean z3 = true;
        if (brush != null) {
            brush.m35608applyToPq9zytI(m36274getSizeNHjbRc(), obtainStrokePaint, f3);
        } else {
            if (obtainStrokePaint.getAlpha() == f3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                obtainStrokePaint.setAlpha(f3);
            }
        }
        if (!C12775o.m28634d(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m35573equalsimpl0(obtainStrokePaint.m35927getBlendMode0nO6VwU(), i3)) {
            obtainStrokePaint.m35933setBlendModes9anfk8(i3);
        }
        if (obtainStrokePaint.getStrokeWidth() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            obtainStrokePaint.setStrokeWidth(f);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f2) {
            z3 = false;
        }
        if (!z3) {
            obtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m36050equalsimpl0(obtainStrokePaint.m35930getStrokeCapKaPHkGw(), i)) {
            obtainStrokePaint.m35936setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m36060equalsimpl0(obtainStrokePaint.m35931getStrokeJoinLxFBmk8(), i2)) {
            obtainStrokePaint.m35937setStrokeJoinWw9F2mQ(i2);
        }
        if (!C12775o.m28634d(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m35761equalsimpl0(obtainStrokePaint.m35929getFilterQualityfv9h1I(), i4)) {
            obtainStrokePaint.m35935setFilterQualityvDHp3xo(i4);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default  reason: not valid java name */
    static /* synthetic */ Paint m36151configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 512) != 0) {
            i6 = DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I();
        } else {
            i6 = i4;
        }
        return canvasDrawScope.m36150configureStrokePaintho4zsrM(brush, f, f2, i, i2, pathEffect, f3, colorFilter, i3, i6);
    }

    /* renamed from: modulate-5vOe2sY  reason: not valid java name */
    private final long m36152modulate5vOe2sY(long j, float f) {
        boolean z;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return Color.m35670copywmQWz5c$default(j, Color.m35673getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.m35938setStylek9PVt8s(PaintingStyle.Companion.m35946getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.m35938setStylek9PVt8s(PaintingStyle.Companion.m35947getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        boolean z;
        if (C12775o.m28634d(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (drawStyle instanceof Stroke) {
            Paint obtainStrokePaint = obtainStrokePaint();
            Stroke stroke = (Stroke) drawStyle;
            boolean z2 = true;
            if (obtainStrokePaint.getStrokeWidth() == stroke.getWidth()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                obtainStrokePaint.setStrokeWidth(stroke.getWidth());
            }
            if (!StrokeCap.m36050equalsimpl0(obtainStrokePaint.m35930getStrokeCapKaPHkGw(), stroke.m36354getCapKaPHkGw())) {
                obtainStrokePaint.m35936setStrokeCapBeK7IIE(stroke.m36354getCapKaPHkGw());
            }
            if (obtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
                z2 = false;
            }
            if (!z2) {
                obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!StrokeJoin.m36060equalsimpl0(obtainStrokePaint.m35931getStrokeJoinLxFBmk8(), stroke.m36355getJoinLxFBmk8())) {
                obtainStrokePaint.m35937setStrokeJoinWw9F2mQ(stroke.m36355getJoinLxFBmk8());
            }
            if (!C12775o.m28634d(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
                obtainStrokePaint.setPathEffect(stroke.getPathEffect());
            }
            return obtainStrokePaint;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: draw-yzxVdVo  reason: not valid java name */
    public final void m36153drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(function1, "block");
        DrawParams drawParams2 = getDrawParams();
        Density component1 = drawParams2.component1();
        LayoutDirection component2 = drawParams2.component2();
        Canvas component3 = drawParams2.component3();
        long r4 = drawParams2.m36174component4NHjbRc();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection);
        drawParams3.setCanvas(canvas);
        drawParams3.m36177setSizeuvyYCjk(j);
        canvas.save();
        function1.invoke(this);
        canvas.restore();
        DrawParams drawParams4 = getDrawParams();
        drawParams4.setDensity(component1);
        drawParams4.setLayoutDirection(component2);
        drawParams4.setCanvas(component3);
        drawParams4.m36177setSizeuvyYCjk(r4);
    }

    /* renamed from: drawArc-illE91I  reason: not valid java name */
    public void m36154drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Brush brush2 = brush;
        C12775o.m28639i(brush2, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawArc(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j) + Size.m35491getWidthimpl(j2), Offset.m35423getYimpl(j) + Size.m35488getHeightimpl(j2), f, f2, z, m36147configurePaintswdJneE$default(this, brush2, drawStyle2, f3, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawArc-yD3GUKo  reason: not valid java name */
    public void m36155drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawArc(Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2), Offset.m35422getXimpl(j2) + Size.m35491getWidthimpl(j3), Offset.m35423getYimpl(j2) + Size.m35488getHeightimpl(j3), f, f2, z, m36145configurePaint2qPWKa0$default(this, j, drawStyle2, f3, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawCircle-V9BoPsw  reason: not valid java name */
    public void m36156drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(brush, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        Canvas canvas = this.drawParams.getCanvas();
        Paint r1 = m36147configurePaintswdJneE$default(this, brush, drawStyle2, f2, colorFilter, i, 0, 32, (Object) null);
        float f3 = f;
        long j2 = j;
        canvas.m35640drawCircle9KIMszo(j, f, r1);
    }

    /* renamed from: drawCircle-VaOC9Bg  reason: not valid java name */
    public void m36157drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        float f3 = f;
        this.drawParams.getCanvas().m35640drawCircle9KIMszo(j2, f, m36145configurePaint2qPWKa0$default(this, j, drawStyle2, f2, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawImage-9jGpkUE  reason: not valid java name */
    public /* synthetic */ void m36158drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(drawStyle, "style");
        Canvas canvas = this.drawParams.getCanvas();
        Canvas canvas2 = canvas;
        canvas2.m35642drawImageRectHPBpro0(imageBitmap, j, j2, j3, j4, m36147configurePaintswdJneE$default(this, (Brush) null, drawStyle, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
    public void m36159drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(drawStyle, "style");
        Canvas canvas = this.drawParams.getCanvas();
        Canvas canvas2 = canvas;
        canvas2.m35642drawImageRectHPBpro0(imageBitmap, j, j2, j3, j4, m36146configurePaintswdJneE((Brush) null, drawStyle, f, colorFilter, i, i2));
    }

    /* renamed from: drawImage-gbVJVH8  reason: not valid java name */
    public void m36160drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        ImageBitmap imageBitmap2 = imageBitmap;
        C12775o.m28639i(imageBitmap, "image");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        long j2 = j;
        this.drawParams.getCanvas().m35641drawImaged4ec7I(imageBitmap, j, m36147configurePaintswdJneE$default(this, (Brush) null, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawLine-1RTmtNc  reason: not valid java name */
    public void m36161drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        Brush brush2 = brush;
        C12775o.m28639i(brush2, "brush");
        this.drawParams.getCanvas().m35643drawLineWko1d7g(j, j2, m36151configureStrokePaintho4zsrM$default(this, brush2, f, 4.0f, i, StrokeJoin.Companion.m36065getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, 512, (Object) null));
    }

    /* renamed from: drawLine-NGM6Ib0  reason: not valid java name */
    public void m36162drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().m35643drawLineWko1d7g(j2, j3, m36149configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i, StrokeJoin.Companion.m36065getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, 512, (Object) null));
    }

    /* renamed from: drawOval-AsUm42w  reason: not valid java name */
    public void m36163drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Brush brush2 = brush;
        C12775o.m28639i(brush2, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawOval(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j) + Size.m35491getWidthimpl(j2), Offset.m35423getYimpl(j) + Size.m35488getHeightimpl(j2), m36147configurePaintswdJneE$default(this, brush2, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawOval-n-J9OG0  reason: not valid java name */
    public void m36164drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawOval(Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2), Offset.m35422getXimpl(j2) + Size.m35491getWidthimpl(j3), Offset.m35423getYimpl(j2) + Size.m35488getHeightimpl(j3), m36145configurePaint2qPWKa0$default(this, j, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawPath-GBMwjPU  reason: not valid java name */
    public void m36165drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Path path2 = path;
        C12775o.m28639i(path, "path");
        C12775o.m28639i(brush, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawPath(path, m36147configurePaintswdJneE$default(this, brush, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawPath-LG529CI  reason: not valid java name */
    public void m36166drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Path path2 = path;
        C12775o.m28639i(path, "path");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawPath(path, m36145configurePaint2qPWKa0$default(this, j, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawPoints-F8ZwMP8  reason: not valid java name */
    public void m36167drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        List<Offset> list2 = list;
        C12775o.m28639i(list2, "points");
        this.drawParams.getCanvas().m35644drawPointsO7TthRY(i, list2, m36149configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i2, StrokeJoin.Companion.m36065getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, 512, (Object) null));
    }

    /* renamed from: drawPoints-Gsft0Ws  reason: not valid java name */
    public void m36168drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        List<Offset> list2 = list;
        C12775o.m28639i(list2, "points");
        Brush brush2 = brush;
        C12775o.m28639i(brush2, "brush");
        this.drawParams.getCanvas().m35644drawPointsO7TthRY(i, list2, m36151configureStrokePaintho4zsrM$default(this, brush2, f, 4.0f, i2, StrokeJoin.Companion.m36065getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, 512, (Object) null));
    }

    /* renamed from: drawRect-AsUm42w  reason: not valid java name */
    public void m36169drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Brush brush2 = brush;
        C12775o.m28639i(brush2, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawRect(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j) + Size.m35491getWidthimpl(j2), Offset.m35423getYimpl(j) + Size.m35488getHeightimpl(j2), m36147configurePaintswdJneE$default(this, brush2, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawRect-n-J9OG0  reason: not valid java name */
    public void m36170drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawRect(Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2), Offset.m35422getXimpl(j2) + Size.m35491getWidthimpl(j3), Offset.m35423getYimpl(j2) + Size.m35488getHeightimpl(j3), m36145configurePaint2qPWKa0$default(this, j, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawRoundRect-ZuiqVtQ  reason: not valid java name */
    public void m36171drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Brush brush2 = brush;
        C12775o.m28639i(brush2, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j) + Size.m35491getWidthimpl(j2), Offset.m35423getYimpl(j) + Size.m35488getHeightimpl(j2), CornerRadius.m35397getXimpl(j3), CornerRadius.m35398getYimpl(j3), m36147configurePaintswdJneE$default(this, brush2, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    /* renamed from: drawRoundRect-u-Aw5IA  reason: not valid java name */
    public void m36172drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2), Offset.m35422getXimpl(j2) + Size.m35491getWidthimpl(j3), Offset.m35423getYimpl(j2) + Size.m35488getHeightimpl(j3), CornerRadius.m35397getXimpl(j4), CornerRadius.m35398getYimpl(j4), m36145configurePaint2qPWKa0$default(this, j, drawStyle2, f, colorFilter, i, 0, 32, (Object) null));
    }

    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }
}
