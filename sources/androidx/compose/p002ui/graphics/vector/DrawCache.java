package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.CanvasKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.ImageBitmapKt;
import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import androidx.compose.p002ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,106:1\n558#2,17:107\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n76#1:107,17\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.DrawCache */
/* compiled from: DrawCache.kt */
public final class DrawCache {
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();
    private Canvas cachedCanvas;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private long size = IntSize.Companion.m38633getZeroYbymL2g();

    private final void clear(DrawScope drawScope) {
        DrawScope.m36250drawRectnJ9OG0$default(drawScope, Color.Companion.m35697getBlack0d7_KjU(), 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, BlendMode.Companion.m35577getClear0nO6VwU(), 62, (Object) null);
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f, colorFilter);
    }

    /* renamed from: drawCachedImage-CJJAR-o  reason: not valid java name */
    public final void m36370drawCachedImageCJJARo(long j, Density density, LayoutDirection layoutDirection2, Function1<? super DrawScope, C11921v> function1) {
        Density density2 = density;
        LayoutDirection layoutDirection3 = layoutDirection2;
        Function1<? super DrawScope, C11921v> function12 = function1;
        C12775o.m28639i(density2, "density");
        C12775o.m28639i(layoutDirection3, "layoutDirection");
        C12775o.m28639i(function12, "block");
        this.scopeDensity = density2;
        this.layoutDirection = layoutDirection3;
        ImageBitmap imageBitmap = this.mCachedImage;
        Canvas canvas = this.cachedCanvas;
        if (imageBitmap == null || canvas == null || IntSize.m38628getWidthimpl(j) > imageBitmap.getWidth() || IntSize.m38627getHeightimpl(j) > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m35893ImageBitmapx__hDU$default(IntSize.m38628getWidthimpl(j), IntSize.m38627getHeightimpl(j), 0, false, (ColorSpace) null, 28, (Object) null);
            canvas = CanvasKt.Canvas(imageBitmap);
            this.mCachedImage = imageBitmap;
            this.cachedCanvas = canvas;
        }
        this.size = j;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long r6 = IntSizeKt.m38638toSizeozmzZPI(j);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long r13 = drawParams.m36174component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density2);
        drawParams2.setLayoutDirection(layoutDirection3);
        drawParams2.setCanvas(canvas);
        drawParams2.m36177setSizeuvyYCjk(r6);
        canvas.save();
        clear(canvasDrawScope);
        function12.invoke(canvasDrawScope);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m36177setSizeuvyYCjk(r13);
        imageBitmap.prepareToDraw();
    }

    public final void drawInto(DrawScope drawScope, float f, ColorFilter colorFilter) {
        boolean z;
        C12775o.m28639i(drawScope, TypedValues.AttributesType.S_TARGET);
        ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DrawScope.m36239drawImageAZ2fEMs$default(drawScope, imageBitmap, 0, this.size, 0, 0, f, (DrawStyle) null, colorFilter, 0, 0, 858, (Object) null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    public static /* synthetic */ void getMCachedImage$annotations() {
    }
}
