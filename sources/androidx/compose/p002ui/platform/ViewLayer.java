package androidx.compose.p002ui.platform;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.MutableRect;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidCanvas;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.CanvasHolder;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.CompositingStrategy;
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
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,476:1\n47#2,5:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n290#1:477,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.ViewLayer */
/* compiled from: ViewLayer.android.kt */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ViewOutlineProvider OutlineProvider = new ViewLayer$Companion$OutlineProvider$1();
    private static final C13088o<View, Matrix, C11921v> getMatrix = ViewLayer$Companion$getMatrix$1.INSTANCE;
    /* access modifiers changed from: private */
    public static boolean hasRetrievedMethod;
    /* access modifiers changed from: private */
    public static Field recreateDisplayList;
    /* access modifiers changed from: private */
    public static boolean shouldUseDispatchDraw;
    /* access modifiers changed from: private */
    public static Method updateDisplayListIfDirtyMethod;
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private Function1<? super Canvas, C11921v> drawBlock;
    private boolean drawnWithZ;
    private C13074a<C11921v> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering = true;
    private long mTransformOrigin = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
    private final LayerMatrixCache<View> matrixCache = new LayerMatrixCache<>(getMatrix);
    /* access modifiers changed from: private */
    public final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;

    @SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,476:1\n26#2:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n431#1:477\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$Companion */
    /* compiled from: ViewLayer.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            ViewLayer.shouldUseDispatchDraw = z;
        }

        public final void updateDisplayList(View view) {
            Class<String> cls = String.class;
            Class<Class> cls2 = Class.class;
            C12775o.m28639i(view, "view");
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    Class<View> cls3 = View.class;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = cls3.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = cls3.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(cls3, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                        ViewLayer.recreateDisplayList = (Field) cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(cls3, new Object[]{"mRecreateDisplayList"});
                    }
                    Method access$getUpdateDisplayListIfDirtyMethod$cp = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (access$getUpdateDisplayListIfDirtyMethod$cp != null) {
                        access$getUpdateDisplayListIfDirtyMethod$cp.setAccessible(true);
                    }
                    Field access$getRecreateDisplayList$cp = ViewLayer.recreateDisplayList;
                    if (access$getRecreateDisplayList$cp != null) {
                        access$getRecreateDisplayList$cp.setAccessible(true);
                    }
                }
                Field access$getRecreateDisplayList$cp2 = ViewLayer.recreateDisplayList;
                if (access$getRecreateDisplayList$cp2 != null) {
                    access$getRecreateDisplayList$cp2.setBoolean(view, true);
                }
                Method access$getUpdateDisplayListIfDirtyMethod$cp2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (access$getUpdateDisplayListIfDirtyMethod$cp2 != null) {
                    access$getUpdateDisplayListIfDirtyMethod$cp2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.compose.ui.platform.ViewLayer$UniqueDrawingIdApi29 */
    /* compiled from: ViewLayer.android.kt */
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function1<? super Canvas, C11921v> function1, C13074a<C11921v> aVar) {
        super(androidComposeView.getContext());
        C12775o.m28639i(androidComposeView, "ownerView");
        C12775o.m28639i(drawChildContainer, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(function1, "drawBlock");
        C12775o.m28639i(aVar, "invalidateParentLayer");
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = function1;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = (long) View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C12775o.m28636f(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void updateOutlineResolver() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.outlineResolver.getOutline() != null) {
            viewOutlineProvider = OutlineProvider;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(android.graphics.Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        CanvasHolder canvasHolder2 = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
        canvasHolder2.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z = true;
        }
        Function1<? super Canvas, C11921v> function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(androidCanvas);
        }
        if (z) {
            androidCanvas.restore();
        }
        canvasHolder2.getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public void drawLayer(Canvas canvas) {
        boolean z;
        C12775o.m28639i(canvas, "canvas");
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.drawnWithZ = z;
        if (z) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
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

    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    public void invalidate() {
        if (!this.isInvalidated) {
            setInvalidated(true);
            super.invalidate();
            this.ownerView.invalidate();
        }
    }

    /* renamed from: inverseTransform-58bKbWc  reason: not valid java name */
    public void m37785inverseTransform58bKbWc(float[] fArr) {
        C12775o.m28639i(fArr, "matrix");
        float[] r0 = this.matrixCache.m37741calculateInverseMatrixbWbORWo(this);
        if (r0 != null) {
            androidx.compose.p002ui.graphics.Matrix.m35915timesAssign58bKbWc(fArr, r0);
        }
    }

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    public boolean m37786isInLayerk4lQ0M(long j) {
        float r0 = Offset.m35422getXimpl(j);
        float r1 = Offset.m35423getYimpl(j);
        if (this.clipToBounds) {
            if (0.0f > r0 || r0 >= ((float) getWidth()) || 0.0f > r1 || r1 >= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (getClipToOutline()) {
            return this.outlineResolver.m37768isInOutlinek4lQ0M(j);
        } else {
            return true;
        }
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    public void mapBounds(MutableRect mutableRect, boolean z) {
        C12775o.m28639i(mutableRect, "rect");
        if (z) {
            float[] r3 = this.matrixCache.m37741calculateInverseMatrixbWbORWo(this);
            if (r3 != null) {
                androidx.compose.p002ui.graphics.Matrix.m35906mapimpl(r3, mutableRect);
            } else {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        } else {
            androidx.compose.p002ui.graphics.Matrix.m35906mapimpl(this.matrixCache.m37742calculateMatrixGrdbGEg(this), mutableRect);
        }
    }

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    public long m37787mapOffset8S9VItk(long j, boolean z) {
        if (!z) {
            return androidx.compose.p002ui.graphics.Matrix.m35904mapMKHz9U(this.matrixCache.m37742calculateMatrixGrdbGEg(this), j);
        }
        float[] r3 = this.matrixCache.m37741calculateInverseMatrixbWbORWo(this);
        if (r3 != null) {
            return androidx.compose.p002ui.graphics.Matrix.m35904mapMKHz9U(r3, j);
        }
        return Offset.Companion.m35436getInfiniteF1C5BW0();
    }

    /* renamed from: move--gyyYBs  reason: not valid java name */
    public void m37788movegyyYBs(long j) {
        int r0 = IntOffset.m38586getXimpl(j);
        if (r0 != getLeft()) {
            offsetLeftAndRight(r0 - getLeft());
            this.matrixCache.invalidate();
        }
        int r3 = IntOffset.m38587getYimpl(j);
        if (r3 != getTop()) {
            offsetTopAndBottom(r3 - getTop());
            this.matrixCache.invalidate();
        }
    }

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    public void m37789resizeozmzZPI(long j) {
        int r0 = IntSize.m38628getWidthimpl(j);
        int r5 = IntSize.m38627getHeightimpl(j);
        if (r0 != getWidth() || r5 != getHeight()) {
            float f = (float) r0;
            setPivotX(TransformOrigin.m36088getPivotFractionXimpl(this.mTransformOrigin) * f);
            float f2 = (float) r5;
            setPivotY(TransformOrigin.m36089getPivotFractionYimpl(this.mTransformOrigin) * f2);
            this.outlineResolver.m37769updateuvyYCjk(SizeKt.Size(f, f2));
            updateOutlineResolver();
            layout(getLeft(), getTop(), getLeft() + r0, getTop() + r5);
            resetClipBounds();
            this.matrixCache.invalidate();
        }
    }

    public void reuseLayer(Function1<? super Canvas, C11921v> function1, C13074a<C11921v> aVar) {
        C12775o.m28639i(function1, "drawBlock");
        C12775o.m28639i(aVar, "invalidateParentLayer");
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        this.drawBlock = function1;
        this.invalidateParentLayer = aVar;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    /* renamed from: transform-58bKbWc  reason: not valid java name */
    public void m37790transform58bKbWc(float[] fArr) {
        C12775o.m28639i(fArr, "matrix");
        androidx.compose.p002ui.graphics.Matrix.m35915timesAssign58bKbWc(fArr, this.matrixCache.m37742calculateMatrixGrdbGEg(this));
    }

    public void updateDisplayList() {
        if (this.isInvalidated && !shouldUseDispatchDraw) {
            setInvalidated(false);
            Companion.updateDisplayList(this);
        }
    }

    /* renamed from: updateLayerProperties-dDxr-wY  reason: not valid java name */
    public void m37791updateLayerPropertiesdDxrwY(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, LayoutDirection layoutDirection, Density density) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C13074a<C11921v> aVar;
        Shape shape2 = shape;
        int i2 = i;
        C12775o.m28639i(shape2, "shape");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        this.mTransformOrigin = j;
        setScaleX(f);
        float f11 = f2;
        setScaleY(f2);
        float f12 = f3;
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(TransformOrigin.m36088getPivotFractionXimpl(this.mTransformOrigin) * ((float) getWidth()));
        setPivotY(TransformOrigin.m36089getPivotFractionYimpl(this.mTransformOrigin) * ((float) getHeight()));
        setCameraDistancePx(f10);
        boolean z6 = true;
        if (!z || shape2 != RectangleShapeKt.getRectangleShape()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.clipToBounds = z2;
        resetClipBounds();
        if (getManualClipPath() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || shape2 == RectangleShapeKt.getRectangleShape()) {
            z4 = false;
        } else {
            z4 = true;
        }
        setClipToOutline(z4);
        boolean update = this.outlineResolver.update(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        updateOutlineResolver();
        if (getManualClipPath() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z3 != z5 || (z5 && update)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        this.matrixCache.invalidate();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = ViewLayerVerificationHelper28.INSTANCE;
            viewLayerVerificationHelper28.setOutlineAmbientShadowColor(this, ColorKt.m35725toArgb8_81llA(j2));
            viewLayerVerificationHelper28.setOutlineSpotShadowColor(this, ColorKt.m35725toArgb8_81llA(j3));
        }
        if (i3 >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, renderEffect);
        }
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m35751equalsimpl0(i2, companion.m35757getOffscreenNrFUSI())) {
            setLayerType(2, (Paint) null);
        } else if (CompositingStrategy.m35751equalsimpl0(i2, companion.m35756getModulateAlphaNrFUSI())) {
            setLayerType(0, (Paint) null);
            z6 = false;
        } else {
            setLayerType(0, (Paint) null);
        }
        this.mHasOverlappingRendering = z6;
    }

    public void forceLayout() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
