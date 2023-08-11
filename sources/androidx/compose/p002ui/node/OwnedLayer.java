package androidx.compose.p002ui.node;

import androidx.compose.p002ui.geometry.MutableRect;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.OwnedLayer */
/* compiled from: OwnedLayer.kt */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas);

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc  reason: not valid java name */
    void m37668inverseTransform58bKbWc(float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    boolean m37669isInLayerk4lQ0M(long j);

    void mapBounds(MutableRect mutableRect, boolean z);

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    long m37670mapOffset8S9VItk(long j, boolean z);

    /* renamed from: move--gyyYBs  reason: not valid java name */
    void m37671movegyyYBs(long j);

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    void m37672resizeozmzZPI(long j);

    void reuseLayer(Function1<? super Canvas, C11921v> function1, C13074a<C11921v> aVar);

    /* renamed from: transform-58bKbWc  reason: not valid java name */
    void m37673transform58bKbWc(float[] fArr);

    void updateDisplayList();

    /* renamed from: updateLayerProperties-dDxr-wY  reason: not valid java name */
    void m37674updateLayerPropertiesdDxrwY(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, LayoutDirection layoutDirection, Density density);
}
