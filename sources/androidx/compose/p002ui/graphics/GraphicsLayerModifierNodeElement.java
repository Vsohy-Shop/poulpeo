package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement */
/* compiled from: GraphicsLayerModifier.kt */
final class GraphicsLayerModifierNodeElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape2, boolean z, RenderEffect renderEffect2, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape2, z, renderEffect2, j2, j3, i);
    }

    /* renamed from: copy-JVvOYNQ$default  reason: not valid java name */
    public static /* synthetic */ GraphicsLayerModifierNodeElement m35822copyJVvOYNQ$default(GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape2, boolean z, RenderEffect renderEffect2, long j2, long j3, int i, int i2, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        long j4;
        Shape shape3;
        boolean z2;
        RenderEffect renderEffect3;
        long j5;
        long j6;
        int i3;
        GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement2 = graphicsLayerModifierNodeElement;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            f11 = graphicsLayerModifierNodeElement2.scaleX;
        } else {
            f11 = f;
        }
        if ((i4 & 2) != 0) {
            f12 = graphicsLayerModifierNodeElement2.scaleY;
        } else {
            f12 = f2;
        }
        if ((i4 & 4) != 0) {
            f13 = graphicsLayerModifierNodeElement2.alpha;
        } else {
            f13 = f3;
        }
        if ((i4 & 8) != 0) {
            f14 = graphicsLayerModifierNodeElement2.translationX;
        } else {
            f14 = f4;
        }
        if ((i4 & 16) != 0) {
            f15 = graphicsLayerModifierNodeElement2.translationY;
        } else {
            f15 = f5;
        }
        if ((i4 & 32) != 0) {
            f16 = graphicsLayerModifierNodeElement2.shadowElevation;
        } else {
            f16 = f6;
        }
        if ((i4 & 64) != 0) {
            f17 = graphicsLayerModifierNodeElement2.rotationX;
        } else {
            f17 = f7;
        }
        if ((i4 & 128) != 0) {
            f18 = graphicsLayerModifierNodeElement2.rotationY;
        } else {
            f18 = f8;
        }
        if ((i4 & 256) != 0) {
            f19 = graphicsLayerModifierNodeElement2.rotationZ;
        } else {
            f19 = f9;
        }
        if ((i4 & 512) != 0) {
            f20 = graphicsLayerModifierNodeElement2.cameraDistance;
        } else {
            f20 = f10;
        }
        if ((i4 & 1024) != 0) {
            j4 = graphicsLayerModifierNodeElement2.transformOrigin;
        } else {
            j4 = j;
        }
        if ((i4 & 2048) != 0) {
            shape3 = graphicsLayerModifierNodeElement2.shape;
        } else {
            shape3 = shape2;
        }
        if ((i4 & 4096) != 0) {
            z2 = graphicsLayerModifierNodeElement2.clip;
        } else {
            z2 = z;
        }
        boolean z3 = z2;
        if ((i4 & 8192) != 0) {
            renderEffect3 = graphicsLayerModifierNodeElement2.renderEffect;
        } else {
            renderEffect3 = renderEffect2;
        }
        RenderEffect renderEffect4 = renderEffect3;
        Shape shape4 = shape3;
        if ((i4 & 16384) != 0) {
            j5 = graphicsLayerModifierNodeElement2.ambientShadowColor;
        } else {
            j5 = j2;
        }
        long j7 = j5;
        if ((i4 & 32768) != 0) {
            j6 = graphicsLayerModifierNodeElement2.spotShadowColor;
        } else {
            j6 = j3;
        }
        if ((i4 & 65536) != 0) {
            i3 = graphicsLayerModifierNodeElement2.compositingStrategy;
        } else {
            i3 = i;
        }
        return graphicsLayerModifierNodeElement.m35827copyJVvOYNQ(f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, j4, shape4, z3, renderEffect4, j7, j6, i3);
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* renamed from: component11-SzJe1aQ  reason: not valid java name */
    public final long m35823component11SzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* renamed from: component15-0d7_KjU  reason: not valid java name */
    public final long m35824component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: component16-0d7_KjU  reason: not valid java name */
    public final long m35825component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: component17--NrFUSI  reason: not valid java name */
    public final int m35826component17NrFUSI() {
        return this.compositingStrategy;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    /* renamed from: copy-JVvOYNQ  reason: not valid java name */
    public final GraphicsLayerModifierNodeElement m35827copyJVvOYNQ(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape2, boolean z, RenderEffect renderEffect2, long j2, long j3, int i) {
        float f11 = f;
        C12775o.m28639i(shape2, "shape");
        return new GraphicsLayerModifierNodeElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape2, z, renderEffect2, j2, j3, i, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerModifierNodeElement)) {
            return false;
        }
        GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) obj;
        if (Float.compare(this.scaleX, graphicsLayerModifierNodeElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerModifierNodeElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerModifierNodeElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerModifierNodeElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerModifierNodeElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerModifierNodeElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerModifierNodeElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerModifierNodeElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerModifierNodeElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerModifierNodeElement.cameraDistance) == 0 && TransformOrigin.m36087equalsimpl0(this.transformOrigin, graphicsLayerModifierNodeElement.transformOrigin) && C12775o.m28634d(this.shape, graphicsLayerModifierNodeElement.shape) && this.clip == graphicsLayerModifierNodeElement.clip && C12775o.m28634d(this.renderEffect, graphicsLayerModifierNodeElement.renderEffect) && Color.m35672equalsimpl0(this.ambientShadowColor, graphicsLayerModifierNodeElement.ambientShadowColor) && Color.m35672equalsimpl0(this.spotShadowColor, graphicsLayerModifierNodeElement.spotShadowColor) && CompositingStrategy.m35751equalsimpl0(this.compositingStrategy, graphicsLayerModifierNodeElement.compositingStrategy)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU  reason: not valid java name */
    public final long m35828getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI  reason: not valid java name */
    public final int m35829getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU  reason: not valid java name */
    public final long m35830getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    public final long m35831getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + TransformOrigin.m36090hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31;
        boolean z = this.clip;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        RenderEffect renderEffect2 = this.renderEffect;
        if (renderEffect2 == null) {
            i = 0;
        } else {
            i = renderEffect2.hashCode();
        }
        return ((((((i2 + i) * 31) + Color.m35678hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m35678hashCodeimpl(this.spotShadowColor)) * 31) + CompositingStrategy.m35752hashCodeimpl(this.compositingStrategy);
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m36080boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m35661boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m35661boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m35748boximpl(this.compositingStrategy));
    }

    public String toString() {
        return "GraphicsLayerModifierNodeElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + TransformOrigin.m36091toStringimpl(this.transformOrigin) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + Color.m35679toStringimpl(this.ambientShadowColor) + ", spotShadowColor=" + Color.m35679toStringimpl(this.spotShadowColor) + ", compositingStrategy=" + CompositingStrategy.m35753toStringimpl(this.compositingStrategy) + ')';
    }

    private GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape2, boolean z, RenderEffect renderEffect2, long j2, long j3, int i) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape2;
        this.clip = z;
        this.renderEffect = renderEffect2;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i;
    }

    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, (DefaultConstructorMarker) null);
    }

    public SimpleGraphicsLayerModifier update(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        C12775o.m28639i(simpleGraphicsLayerModifier, "node");
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m36034setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m36031setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m36033setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m36032setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
        return simpleGraphicsLayerModifier;
    }
}
