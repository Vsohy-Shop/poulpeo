package androidx.compose.p002ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.AndroidCanvas;
import androidx.compose.p002ui.graphics.CanvasHolder;
import androidx.compose.p002ui.graphics.CompositingStrategy;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.RenderEffect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@RequiresApi(29)
@SourceDebugExtension({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeApi29 */
/* compiled from: RenderNodeApi29.android.kt */
public final class RenderNodeApi29 implements DeviceRenderNode {
    private int internalCompositingStrategy = CompositingStrategy.Companion.m35755getAutoNrFUSI();
    private RenderEffect internalRenderEffect;
    private final AndroidComposeView ownerView;
    private final RenderNode renderNode = new RenderNode("Compose");

    public RenderNodeApi29(AndroidComposeView androidComposeView) {
        C12775o.m28639i(androidComposeView, "ownerView");
        this.ownerView = androidComposeView;
    }

    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    public void drawInto(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        canvas.drawRenderNode(this.renderNode);
    }

    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(this.renderNode.getUniqueId(), this.renderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getRight(), this.renderNode.getBottom(), this.renderNode.getWidth(), this.renderNode.getHeight(), this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), this.renderNode.getAmbientShadowColor(), this.renderNode.getSpotShadowColor(), this.renderNode.getRotationZ(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.renderNode.getClipToBounds(), this.renderNode.getAlpha(), this.internalRenderEffect, this.internalCompositingStrategy, (DefaultConstructorMarker) null);
    }

    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    public int getAmbientShadowColor() {
        return this.renderNode.getAmbientShadowColor();
    }

    public int getBottom() {
        return this.renderNode.getBottom();
    }

    public float getCameraDistance() {
        return this.renderNode.getCameraDistance();
    }

    public boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    /* renamed from: getCompositingStrategy--NrFUSI  reason: not valid java name */
    public int m37772getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    public float getElevation() {
        return this.renderNode.getElevation();
    }

    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    public int getHeight() {
        return this.renderNode.getHeight();
    }

    public void getInverseMatrix(Matrix matrix) {
        C12775o.m28639i(matrix, "matrix");
        this.renderNode.getInverseMatrix(matrix);
    }

    public int getLeft() {
        return this.renderNode.getLeft();
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
        return this.internalRenderEffect;
    }

    public int getRight() {
        return this.renderNode.getRight();
    }

    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    public float getRotationZ() {
        return this.renderNode.getRotationZ();
    }

    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    public int getSpotShadowColor() {
        return this.renderNode.getSpotShadowColor();
    }

    public int getTop() {
        return this.renderNode.getTop();
    }

    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    public long getUniqueId() {
        return this.renderNode.getUniqueId();
    }

    public int getWidth() {
        return this.renderNode.getWidth();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        return this.renderNode.getUseCompositingLayer();
    }

    public void offsetLeftAndRight(int i) {
        boolean unused = this.renderNode.offsetLeftAndRight(i);
    }

    public void offsetTopAndBottom(int i) {
        boolean unused = this.renderNode.offsetTopAndBottom(i);
    }

    public void record(CanvasHolder canvasHolder, Path path, Function1<? super androidx.compose.p002ui.graphics.Canvas, C11921v> function1) {
        C12775o.m28639i(canvasHolder, "canvasHolder");
        C12775o.m28639i(function1, "drawBlock");
        RecordingCanvas a = this.renderNode.beginRecording();
        C12775o.m28638h(a, "renderNode.beginRecording()");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(a);
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
        this.renderNode.endRecording();
    }

    public void setAlpha(float f) {
        boolean unused = this.renderNode.setAlpha(f);
    }

    public void setAmbientShadowColor(int i) {
        boolean unused = this.renderNode.setAmbientShadowColor(i);
    }

    public void setCameraDistance(float f) {
        boolean unused = this.renderNode.setCameraDistance(f);
    }

    public void setClipToBounds(boolean z) {
        boolean unused = this.renderNode.setClipToBounds(z);
    }

    public void setClipToOutline(boolean z) {
        boolean unused = this.renderNode.setClipToOutline(z);
    }

    /* renamed from: setCompositingStrategy-aDBOjCE  reason: not valid java name */
    public void m37773setCompositingStrategyaDBOjCE(int i) {
        RenderNode renderNode2 = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m35751equalsimpl0(i, companion.m35757getOffscreenNrFUSI())) {
            boolean unused = renderNode2.setUseCompositingLayer(true, (Paint) null);
            boolean unused2 = renderNode2.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m35751equalsimpl0(i, companion.m35756getModulateAlphaNrFUSI())) {
            boolean unused3 = renderNode2.setUseCompositingLayer(false, (Paint) null);
            boolean unused4 = renderNode2.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode2.setUseCompositingLayer(false, (Paint) null);
            boolean unused6 = renderNode2.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i;
    }

    public void setElevation(float f) {
        boolean unused = this.renderNode.setElevation(f);
    }

    public boolean setHasOverlappingRendering(boolean z) {
        return this.renderNode.setHasOverlappingRendering(z);
    }

    public void setOutline(Outline outline) {
        boolean unused = this.renderNode.setOutline(outline);
    }

    public void setPivotX(float f) {
        boolean unused = this.renderNode.setPivotX(f);
    }

    public void setPivotY(float f) {
        boolean unused = this.renderNode.setPivotY(f);
    }

    public boolean setPosition(int i, int i2, int i3, int i4) {
        return this.renderNode.setPosition(i, i2, i3, i4);
    }

    public void setRenderEffect(RenderEffect renderEffect) {
        this.internalRenderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    public void setRotationX(float f) {
        boolean unused = this.renderNode.setRotationX(f);
    }

    public void setRotationY(float f) {
        boolean unused = this.renderNode.setRotationY(f);
    }

    public void setRotationZ(float f) {
        boolean unused = this.renderNode.setRotationZ(f);
    }

    public void setScaleX(float f) {
        boolean unused = this.renderNode.setScaleX(f);
    }

    public void setScaleY(float f) {
        boolean unused = this.renderNode.setScaleY(f);
    }

    public void setSpotShadowColor(int i) {
        boolean unused = this.renderNode.setSpotShadowColor(i);
    }

    public void setTranslationX(float f) {
        boolean unused = this.renderNode.setTranslationX(f);
    }

    public void setTranslationY(float f) {
        boolean unused = this.renderNode.setTranslationY(f);
    }
}
