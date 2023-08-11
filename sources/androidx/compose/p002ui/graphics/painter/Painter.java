package androidx.compose.p002ui.graphics.painter;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RectKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,217:1\n66#2,2:218\n245#2:220\n68#2,2:228\n111#3,7:221\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:218,2\n206#1:220\n195#1:228,2\n207#1:221,7\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.painter.Painter */
/* compiled from: Painter.kt */
public abstract class Painter {
    private float alpha = 1.0f;
    private ColorFilter colorFilter;
    private final Function1<DrawScope, C11921v> drawLambda = new Painter$drawLambda$1(this);
    private Paint layerPaint;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private boolean useLayer;

    private final void configureAlpha(float f) {
        boolean z;
        boolean z2;
        if (this.alpha == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!applyAlpha(f)) {
                if (f == 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setAlpha(f);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setAlpha(f);
                    this.useLayer = true;
                }
            }
            this.alpha = f;
        }
    }

    private final void configureColorFilter(ColorFilter colorFilter2) {
        if (!C12775o.m28634d(this.colorFilter, colorFilter2)) {
            if (!applyColorFilter(colorFilter2)) {
                if (colorFilter2 == null) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setColorFilter((ColorFilter) null);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setColorFilter(colorFilter2);
                    this.useLayer = true;
                }
            }
            this.colorFilter = colorFilter2;
        }
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection2) {
        if (this.layoutDirection != layoutDirection2) {
            applyLayoutDirection(layoutDirection2);
            this.layoutDirection = layoutDirection2;
        }
    }

    /* renamed from: draw-x_KDEd0$default  reason: not valid java name */
    public static /* synthetic */ void m36367drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j, float f, ColorFilter colorFilter2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                colorFilter2 = null;
            }
            painter.m36368drawx_KDEd0(drawScope, j, f2, colorFilter2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean applyLayoutDirection(LayoutDirection layoutDirection2) {
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        return false;
    }

    /* renamed from: draw-x_KDEd0  reason: not valid java name */
    public final void m36368drawx_KDEd0(DrawScope drawScope, long j, float f, ColorFilter colorFilter2) {
        C12775o.m28639i(drawScope, "$this$draw");
        configureAlpha(f);
        configureColorFilter(colorFilter2);
        configureLayoutDirection(drawScope.getLayoutDirection());
        float r8 = Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()) - Size.m35491getWidthimpl(j);
        float r0 = Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc()) - Size.m35488getHeightimpl(j);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, r8, r0);
        if (f > 0.0f && Size.m35491getWidthimpl(j) > 0.0f && Size.m35488getHeightimpl(j) > 0.0f) {
            if (this.useLayer) {
                Rect r5 = RectKt.m35462Recttz77jQw(Offset.Companion.m35438getZeroF1C5BW0(), SizeKt.Size(Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j)));
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(r5, obtainPaint());
                    onDraw(drawScope);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(drawScope);
            }
        }
        drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -r8, -r0);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public abstract long m36369getIntrinsicSizeNHjbRc();

    /* access modifiers changed from: protected */
    public abstract void onDraw(DrawScope drawScope);
}
