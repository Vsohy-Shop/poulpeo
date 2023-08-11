package androidx.compose.p002ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.MutableRect;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p002ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.CanvasHolder;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.p002ui.layout.GraphicLayerInfo;
import androidx.compose.p002ui.node.OwnedLayer;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@RequiresApi(23)
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer */
/* compiled from: RenderNodeLayer.android.kt */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final C13088o<DeviceRenderNode, Matrix, C11921v> getMatrix = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private Function1<? super Canvas, C11921v> drawBlock;
    private boolean drawnWithZ;
    private C13074a<C11921v> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    private long transformOrigin = TransformOrigin.Companion.m36093getCenterSzJe1aQ();

    /* renamed from: androidx.compose.ui.platform.RenderNodeLayer$Companion */
    /* compiled from: RenderNodeLayer.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.compose.ui.platform.RenderNodeLayer$UniqueDrawingIdApi29 */
    /* compiled from: RenderNodeLayer.android.kt */
    private static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @DoNotInline
        public static final long getUniqueDrawingId(View view) {
            C12775o.m28639i(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function1<? super Canvas, C11921v> function1, C13074a<C11921v> aVar) {
        DeviceRenderNode deviceRenderNode;
        C12775o.m28639i(androidComposeView, "ownerView");
        C12775o.m28639i(function1, "drawBlock");
        C12775o.m28639i(aVar, "invalidateParentLayer");
        this.ownerView = androidComposeView;
        this.drawBlock = function1;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            deviceRenderNode = new RenderNodeApi29(androidComposeView);
        } else {
            deviceRenderNode = new RenderNodeApi23(androidComposeView);
        }
        deviceRenderNode.setHasOverlappingRendering(true);
        this.renderNode = deviceRenderNode;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    public void drawLayer(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z = false;
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            if (this.renderNode.getElevation() > 0.0f) {
                z = true;
            }
            this.drawnWithZ = z;
            if (z) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = (float) this.renderNode.getLeft();
        float top = (float) this.renderNode.getTop();
        float right = (float) this.renderNode.getRight();
        float bottom = (float) this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.m35639concat58bKbWc(this.matrixCache.m37742calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        Function1<? super Canvas, C11921v> function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1;
    }

    public void invalidate() {
        if (!this.isDirty && !this.isDestroyed) {
            this.ownerView.invalidate();
            setDirty(true);
        }
    }

    /* renamed from: inverseTransform-58bKbWc  reason: not valid java name */
    public void m37774inverseTransform58bKbWc(float[] fArr) {
        C12775o.m28639i(fArr, "matrix");
        float[] r0 = this.matrixCache.m37741calculateInverseMatrixbWbORWo(this.renderNode);
        if (r0 != null) {
            androidx.compose.p002ui.graphics.Matrix.m35915timesAssign58bKbWc(fArr, r0);
        }
    }

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    public boolean m37775isInLayerk4lQ0M(long j) {
        float r0 = Offset.m35422getXimpl(j);
        float r1 = Offset.m35423getYimpl(j);
        if (this.renderNode.getClipToBounds()) {
            if (0.0f > r0 || r0 >= ((float) this.renderNode.getWidth()) || 0.0f > r1 || r1 >= ((float) this.renderNode.getHeight())) {
                return false;
            }
            return true;
        } else if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m37768isInOutlinek4lQ0M(j);
        } else {
            return true;
        }
    }

    public void mapBounds(MutableRect mutableRect, boolean z) {
        C12775o.m28639i(mutableRect, "rect");
        if (z) {
            float[] r3 = this.matrixCache.m37741calculateInverseMatrixbWbORWo(this.renderNode);
            if (r3 == null) {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                androidx.compose.p002ui.graphics.Matrix.m35906mapimpl(r3, mutableRect);
            }
        } else {
            androidx.compose.p002ui.graphics.Matrix.m35906mapimpl(this.matrixCache.m37742calculateMatrixGrdbGEg(this.renderNode), mutableRect);
        }
    }

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    public long m37776mapOffset8S9VItk(long j, boolean z) {
        if (!z) {
            return androidx.compose.p002ui.graphics.Matrix.m35904mapMKHz9U(this.matrixCache.m37742calculateMatrixGrdbGEg(this.renderNode), j);
        }
        float[] r4 = this.matrixCache.m37741calculateInverseMatrixbWbORWo(this.renderNode);
        if (r4 != null) {
            return androidx.compose.p002ui.graphics.Matrix.m35904mapMKHz9U(r4, j);
        }
        return Offset.Companion.m35436getInfiniteF1C5BW0();
    }

    /* renamed from: move--gyyYBs  reason: not valid java name */
    public void m37777movegyyYBs(long j) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int r2 = IntOffset.m38586getXimpl(j);
        int r4 = IntOffset.m38587getYimpl(j);
        if (left != r2 || top != r4) {
            this.renderNode.offsetLeftAndRight(r2 - left);
            this.renderNode.offsetTopAndBottom(r4 - top);
            triggerRepaint();
            this.matrixCache.invalidate();
        }
    }

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    public void m37778resizeozmzZPI(long j) {
        int r0 = IntSize.m38628getWidthimpl(j);
        int r7 = IntSize.m38627getHeightimpl(j);
        float f = (float) r0;
        this.renderNode.setPivotX(TransformOrigin.m36088getPivotFractionXimpl(this.transformOrigin) * f);
        float f2 = (float) r7;
        this.renderNode.setPivotY(TransformOrigin.m36089getPivotFractionYimpl(this.transformOrigin) * f2);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + r0, this.renderNode.getTop() + r7)) {
            this.outlineResolver.m37769updateuvyYCjk(SizeKt.Size(f, f2));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    public void reuseLayer(Function1<? super Canvas, C11921v> function1, C13074a<C11921v> aVar) {
        C12775o.m28639i(function1, "drawBlock");
        C12775o.m28639i(aVar, "invalidateParentLayer");
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        this.drawBlock = function1;
        this.invalidateParentLayer = aVar;
    }

    /* renamed from: transform-58bKbWc  reason: not valid java name */
    public void m37779transform58bKbWc(float[] fArr) {
        C12775o.m28639i(fArr, "matrix");
        androidx.compose.p002ui.graphics.Matrix.m35915timesAssign58bKbWc(fArr, this.matrixCache.m37742calculateMatrixGrdbGEg(this.renderNode));
    }

    public void updateDisplayList() {
        Path path;
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            setDirty(false);
            if (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
                path = null;
            } else {
                path = this.outlineResolver.getClipPath();
            }
            Function1<? super Canvas, C11921v> function1 = this.drawBlock;
            if (function1 != null) {
                this.renderNode.record(this.canvasHolder, path, function1);
            }
        }
    }

    /* renamed from: updateLayerProperties-dDxr-wY  reason: not valid java name */
    public void m37780updateLayerPropertiesdDxrwY(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, LayoutDirection layoutDirection, Density density) {
        boolean z2;
        boolean z3;
        boolean z4;
        C13074a<C11921v> aVar;
        Shape shape2 = shape;
        C12775o.m28639i(shape2, "shape");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        this.transformOrigin = j;
        boolean z5 = true;
        if (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            z2 = false;
        } else {
            z2 = true;
        }
        float f11 = f;
        this.renderNode.setScaleX(f);
        float f12 = f2;
        this.renderNode.setScaleY(f2);
        float f13 = f3;
        this.renderNode.setAlpha(f3);
        this.renderNode.setTranslationX(f4);
        this.renderNode.setTranslationY(f5);
        this.renderNode.setElevation(f6);
        this.renderNode.setAmbientShadowColor(ColorKt.m35725toArgb8_81llA(j2));
        this.renderNode.setSpotShadowColor(ColorKt.m35725toArgb8_81llA(j3));
        this.renderNode.setRotationZ(f9);
        this.renderNode.setRotationX(f7);
        this.renderNode.setRotationY(f8);
        this.renderNode.setCameraDistance(f10);
        this.renderNode.setPivotX(TransformOrigin.m36088getPivotFractionXimpl(j) * ((float) this.renderNode.getWidth()));
        this.renderNode.setPivotY(TransformOrigin.m36089getPivotFractionYimpl(j) * ((float) this.renderNode.getHeight()));
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (!z || shape2 == RectangleShapeKt.getRectangleShape()) {
            z3 = false;
        } else {
            z3 = true;
        }
        deviceRenderNode.setClipToOutline(z3);
        DeviceRenderNode deviceRenderNode2 = this.renderNode;
        if (!z || shape2 != RectangleShapeKt.getRectangleShape()) {
            z4 = false;
        } else {
            z4 = true;
        }
        deviceRenderNode2.setClipToBounds(z4);
        this.renderNode.setRenderEffect(renderEffect);
        this.renderNode.m37727setCompositingStrategyaDBOjCE(i);
        boolean update = this.outlineResolver.update(shape, this.renderNode.getAlpha(), this.renderNode.getClipToOutline(), this.renderNode.getElevation(), layoutDirection, density);
        this.renderNode.setOutline(this.outlineResolver.getOutline());
        if (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            z5 = false;
        }
        if (z2 != z5 || (z5 && update)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        this.matrixCache.invalidate();
    }
}
