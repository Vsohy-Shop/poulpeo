package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.ReusableGraphicsLayerScope */
/* compiled from: GraphicsLayerScope.kt */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private boolean clip;
    private int compositingStrategy = CompositingStrategy.Companion.m35755getAutoNrFUSI();
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, (Object) null);
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float shadowElevation;
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private long size = Size.Companion.m35499getUnspecifiedNHjbRc();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long transformOrigin = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
    private float translationX;
    private float translationY;

    public float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU  reason: not valid java name */
    public long m35999getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public float getCameraDistance() {
        return this.cameraDistance;
    }

    public boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI  reason: not valid java name */
    public int m36000getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public float getRotationX() {
        return this.rotationX;
    }

    public float getRotationY() {
        return this.rotationY;
    }

    public float getRotationZ() {
        return this.rotationZ;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public float getShadowElevation() {
        return this.shadowElevation;
    }

    public Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public long m36001getSizeNHjbRc() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU  reason: not valid java name */
    public long m36002getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    public long m36003getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public float getTranslationX() {
        return this.translationX;
    }

    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        m36004setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        m36007setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        m36008setTransformOrigin__ExYCQ(TransformOrigin.Companion.m36093getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect((RenderEffect) null);
        m36005setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m35755getAutoNrFUSI());
        m36006setSizeuvyYCjk(Size.Companion.m35499getUnspecifiedNHjbRc());
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    /* renamed from: setAmbientShadowColor-8_81llA  reason: not valid java name */
    public void m36004setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
    }

    public void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public void setClip(boolean z) {
        this.clip = z;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE  reason: not valid java name */
    public void m36005setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public final void setGraphicsDensity$ui_release(Density density) {
        C12775o.m28639i(density, "<set-?>");
        this.graphicsDensity = density;
    }

    public void setRenderEffect(RenderEffect renderEffect2) {
        this.renderEffect = renderEffect2;
    }

    public void setRotationX(float f) {
        this.rotationX = f;
    }

    public void setRotationY(float f) {
        this.rotationY = f;
    }

    public void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public void setScaleX(float f) {
        this.scaleX = f;
    }

    public void setScaleY(float f) {
        this.scaleY = f;
    }

    public void setShadowElevation(float f) {
        this.shadowElevation = f;
    }

    public void setShape(Shape shape2) {
        C12775o.m28639i(shape2, "<set-?>");
        this.shape = shape2;
    }

    /* renamed from: setSize-uvyYCjk  reason: not valid java name */
    public void m36006setSizeuvyYCjk(long j) {
        this.size = j;
    }

    /* renamed from: setSpotShadowColor-8_81llA  reason: not valid java name */
    public void m36007setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
    }

    /* renamed from: setTransformOrigin-__ExYCQ  reason: not valid java name */
    public void m36008setTransformOrigin__ExYCQ(long j) {
        this.transformOrigin = j;
    }

    public void setTranslationX(float f) {
        this.translationX = f;
    }

    public void setTranslationY(float f) {
        this.translationY = f;
    }
}
