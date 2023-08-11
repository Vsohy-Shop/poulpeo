package androidx.compose.p002ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.AndroidCanvas;
import androidx.compose.p002ui.graphics.CanvasHolder;
import androidx.compose.p002ui.graphics.CompositingStrategy;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.core.view.ViewCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@RequiresApi(23)
@SourceDebugExtension({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeApi23 */
/* compiled from: RenderNodeApi23.android.kt */
public final class RenderNodeApi23 implements DeviceRenderNode {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static boolean needToValidateAccess = true;
    /* access modifiers changed from: private */
    public static boolean testFailCreateRenderNode;
    private int bottom;
    private boolean clipToBounds;
    private int internalCompositingStrategy = CompositingStrategy.Companion.m35755getAutoNrFUSI();
    private int left;
    private final AndroidComposeView ownerView;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private int right;
    private int top;

    /* renamed from: androidx.compose.ui.platform.RenderNodeApi23$Companion */
    /* compiled from: RenderNodeApi23.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return RenderNodeApi23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z) {
            RenderNodeApi23.testFailCreateRenderNode = z;
        }
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView) {
        C12775o.m28639i(androidComposeView, "ownerView");
        this.ownerView = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        C12775o.m28638h(create, "create(\"Compose\", ownerView)");
        this.renderNode = create;
        if (needToValidateAccess) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            verifyShadowColorProperties(create);
            discardDisplayListInternal();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            needToValidateAccess = false;
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
    }

    private final void discardDisplayListInternal() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    private final void verifyShadowColorProperties(RenderNode renderNode2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
            renderNodeVerificationHelper28.setAmbientShadowColor(renderNode2, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode2));
            renderNodeVerificationHelper28.setSpotShadowColor(renderNode2, renderNodeVerificationHelper28.getSpotShadowColor(renderNode2));
        }
    }

    public void discardDisplayList() {
        discardDisplayListInternal();
    }

    public void drawInto(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), getClipToBounds(), this.renderNode.getAlpha(), getRenderEffect(), this.internalCompositingStrategy, (DefaultConstructorMarker) null);
    }

    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    public int getAmbientShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(this.renderNode);
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public int getBottom() {
        return this.bottom;
    }

    public float getCameraDistance() {
        return -this.renderNode.getCameraDistance();
    }

    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    /* renamed from: getCompositingStrategy--NrFUSI  reason: not valid java name */
    public int m37770getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    public float getElevation() {
        return this.renderNode.getElevation();
    }

    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    public int getHeight() {
        return getBottom() - getTop();
    }

    public void getInverseMatrix(Matrix matrix) {
        C12775o.m28639i(matrix, "matrix");
        this.renderNode.getInverseMatrix(matrix);
    }

    public final int getLayerType$ui_release() {
        if (CompositingStrategy.m35751equalsimpl0(this.internalCompositingStrategy, CompositingStrategy.Companion.m35757getOffscreenNrFUSI())) {
            return 2;
        }
        return 0;
    }

    public int getLeft() {
        return this.left;
    }

    public void getMatrix(Matrix matrix) {
        C12775o.m28639i(matrix, "matrix");
        this.renderNode.getMatrix(matrix);
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public float getPivotX() {
        return this.renderNode.getPivotX();
    }

    public float getPivotY() {
        return this.renderNode.getPivotY();
    }

    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public int getRight() {
        return this.right;
    }

    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    public float getRotationZ() {
        return this.renderNode.getRotation();
    }

    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    public int getSpotShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(this.renderNode);
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public int getTop() {
        return this.top;
    }

    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    public long getUniqueId() {
        return 0;
    }

    public int getWidth() {
        return getRight() - getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    public void offsetLeftAndRight(int i) {
        setLeft(getLeft() + i);
        setRight(getRight() + i);
        this.renderNode.offsetLeftAndRight(i);
    }

    public void offsetTopAndBottom(int i) {
        setTop(getTop() + i);
        setBottom(getBottom() + i);
        this.renderNode.offsetTopAndBottom(i);
    }

    public void record(CanvasHolder canvasHolder, Path path, Function1<? super androidx.compose.p002ui.graphics.Canvas, C11921v> function1) {
        C12775o.m28639i(canvasHolder, "canvasHolder");
        C12775o.m28639i(function1, "drawBlock");
        Canvas start = this.renderNode.start(getWidth(), getHeight());
        C12775o.m28638h(start, "renderNode.start(width, height)");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(start);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            androidx.compose.p002ui.graphics.Canvas.m35632clipPathmtrdDE$default(androidCanvas, path, 0, 2, (Object) null);
        }
        function1.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.end(start);
    }

    public void setAlpha(float f) {
        this.renderNode.setAlpha(f);
    }

    public void setAmbientShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, i);
        }
    }

    public void setBottom(int i) {
        this.bottom = i;
    }

    public void setCameraDistance(float f) {
        this.renderNode.setCameraDistance(-f);
    }

    public void setClipToBounds(boolean z) {
        this.clipToBounds = z;
        this.renderNode.setClipToBounds(z);
    }

    public void setClipToOutline(boolean z) {
        this.renderNode.setClipToOutline(z);
    }

    /* renamed from: setCompositingStrategy-aDBOjCE  reason: not valid java name */
    public void m37771setCompositingStrategyaDBOjCE(int i) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m35751equalsimpl0(i, companion.m35757getOffscreenNrFUSI())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m35751equalsimpl0(i, companion.m35756getModulateAlphaNrFUSI())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i;
    }

    public void setElevation(float f) {
        this.renderNode.setElevation(f);
    }

    public boolean setHasOverlappingRendering(boolean z) {
        return this.renderNode.setHasOverlappingRendering(z);
    }

    public void setLeft(int i) {
        this.left = i;
    }

    public void setOutline(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    public void setPivotX(float f) {
        this.renderNode.setPivotX(f);
    }

    public void setPivotY(float f) {
        this.renderNode.setPivotY(f);
    }

    public boolean setPosition(int i, int i2, int i3, int i4) {
        setLeft(i);
        setTop(i2);
        setRight(i3);
        setBottom(i4);
        return this.renderNode.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public void setRenderEffect(RenderEffect renderEffect2) {
        this.renderEffect = renderEffect2;
    }

    public void setRight(int i) {
        this.right = i;
    }

    public void setRotationX(float f) {
        this.renderNode.setRotationX(f);
    }

    public void setRotationY(float f) {
        this.renderNode.setRotationY(f);
    }

    public void setRotationZ(float f) {
        this.renderNode.setRotation(f);
    }

    public void setScaleX(float f) {
        this.renderNode.setScaleX(f);
    }

    public void setScaleY(float f) {
        this.renderNode.setScaleY(f);
    }

    public void setSpotShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, i);
        }
    }

    public void setTop(int i) {
        this.top = i;
    }

    public void setTranslationX(float f) {
        this.renderNode.setTranslationX(f);
    }

    public void setTranslationY(float f) {
        this.renderNode.setTranslationY(f);
    }
}
