package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.TransformOrigin;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.LayerPositionalProperties */
/* compiled from: NodeCoordinator.kt */
final class LayerPositionalProperties {
    private float cameraDistance = 8.0f;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private long transformOrigin = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
    private float translationX;
    private float translationY;

    public final void copyFrom(LayerPositionalProperties layerPositionalProperties) {
        C12775o.m28639i(layerPositionalProperties, "other");
        this.scaleX = layerPositionalProperties.scaleX;
        this.scaleY = layerPositionalProperties.scaleY;
        this.translationX = layerPositionalProperties.translationX;
        this.translationY = layerPositionalProperties.translationY;
        this.rotationX = layerPositionalProperties.rotationX;
        this.rotationY = layerPositionalProperties.rotationY;
        this.rotationZ = layerPositionalProperties.rotationZ;
        this.cameraDistance = layerPositionalProperties.cameraDistance;
        this.transformOrigin = layerPositionalProperties.transformOrigin;
    }

    public final boolean hasSameValuesAs(LayerPositionalProperties layerPositionalProperties) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        C12775o.m28639i(layerPositionalProperties, "other");
        if (this.scaleX == layerPositionalProperties.scaleX) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.scaleY == layerPositionalProperties.scaleY) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.translationX == layerPositionalProperties.translationX) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.translationY == layerPositionalProperties.translationY) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (this.rotationX == layerPositionalProperties.rotationX) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (this.rotationY == layerPositionalProperties.rotationY) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (this.rotationZ == layerPositionalProperties.rotationZ) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    if (this.cameraDistance == layerPositionalProperties.cameraDistance) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8 && TransformOrigin.m36087equalsimpl0(this.transformOrigin, layerPositionalProperties.transformOrigin)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void copyFrom(GraphicsLayerScope graphicsLayerScope) {
        C12775o.m28639i(graphicsLayerScope, "scope");
        this.scaleX = graphicsLayerScope.getScaleX();
        this.scaleY = graphicsLayerScope.getScaleY();
        this.translationX = graphicsLayerScope.getTranslationX();
        this.translationY = graphicsLayerScope.getTranslationY();
        this.rotationX = graphicsLayerScope.getRotationX();
        this.rotationY = graphicsLayerScope.getRotationY();
        this.rotationZ = graphicsLayerScope.getRotationZ();
        this.cameraDistance = graphicsLayerScope.getCameraDistance();
        this.transformOrigin = graphicsLayerScope.m35855getTransformOriginSzJe1aQ();
    }
}
