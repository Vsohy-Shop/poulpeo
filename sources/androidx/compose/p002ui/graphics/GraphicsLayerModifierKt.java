package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt */
/* compiled from: GraphicsLayerModifier.kt */
public final class GraphicsLayerModifierKt {
    @Stable
    public static final Modifier graphicsLayer(Modifier modifier, Function1<? super GraphicsLayerScope, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "block");
        return modifier.then(new BlockGraphicsLayerElement(function1));
    }

    @Stable
    /* renamed from: graphicsLayer-2Xn7asI  reason: not valid java name */
    public static final /* synthetic */ Modifier m35814graphicsLayer2Xn7asI(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect) {
        float f11 = f;
        C12775o.m28639i(modifier, "$this$graphicsLayer");
        C12775o.m28639i(shape, "shape");
        return m35816graphicsLayerAp8cVGQ(modifier, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m35755getAutoNrFUSI());
    }

    /* renamed from: graphicsLayer-2Xn7asI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35815graphicsLayer2Xn7asI$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, int i, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j2;
        Shape shape2;
        boolean z2;
        RenderEffect renderEffect2;
        int i2 = i;
        float f19 = 1.0f;
        if ((i2 & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f;
        }
        if ((i2 & 2) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f2;
        }
        if ((i2 & 4) == 0) {
            f19 = f3;
        }
        float f20 = 0.0f;
        if ((i2 & 8) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f4;
        }
        if ((i2 & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        if ((i2 & 32) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f6;
        }
        if ((i2 & 64) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f7;
        }
        if ((i2 & 128) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i2 & 256) == 0) {
            f20 = f9;
        }
        if ((i2 & 512) != 0) {
            f18 = 8.0f;
        } else {
            f18 = f10;
        }
        if ((i2 & 1024) != 0) {
            j2 = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        } else {
            j2 = j;
        }
        if ((i2 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i2 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 8192) != 0) {
            renderEffect2 = null;
        } else {
            renderEffect2 = renderEffect;
        }
        return m35814graphicsLayer2Xn7asI(modifier, f11, f12, f19, f13, f14, f15, f16, f17, f20, f18, j2, shape2, z2, renderEffect2);
    }

    @Stable
    /* renamed from: graphicsLayer-Ap8cVGQ  reason: not valid java name */
    public static final Modifier m35816graphicsLayerAp8cVGQ(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i) {
        C12775o.m28639i(modifier, "$this$graphicsLayer");
        C12775o.m28639i(shape, "shape");
        return modifier.then(new GraphicsLayerModifierNodeElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, (DefaultConstructorMarker) null));
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35817graphicsLayerAp8cVGQ$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j4;
        Shape shape2;
        boolean z2;
        RenderEffect renderEffect2;
        long j5;
        long j6;
        int i3;
        int i4 = i2;
        float f19 = 1.0f;
        if ((i4 & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f;
        }
        if ((i4 & 2) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f2;
        }
        if ((i4 & 4) == 0) {
            f19 = f3;
        }
        float f20 = 0.0f;
        if ((i4 & 8) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f4;
        }
        if ((i4 & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        if ((i4 & 32) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f6;
        }
        if ((i4 & 64) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f7;
        }
        if ((i4 & 128) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i4 & 256) == 0) {
            f20 = f9;
        }
        if ((i4 & 512) != 0) {
            f18 = 8.0f;
        } else {
            f18 = f10;
        }
        if ((i4 & 1024) != 0) {
            j4 = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        } else {
            j4 = j;
        }
        if ((i4 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i4 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i4 & 8192) != 0) {
            renderEffect2 = null;
        } else {
            renderEffect2 = renderEffect;
        }
        RenderEffect renderEffect3 = renderEffect2;
        if ((i4 & 16384) != 0) {
            j5 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j5 = j2;
        }
        if ((i4 & 32768) != 0) {
            j6 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j6 = j3;
        }
        if ((i4 & 65536) != 0) {
            i3 = CompositingStrategy.Companion.m35755getAutoNrFUSI();
        } else {
            i3 = i;
        }
        return m35816graphicsLayerAp8cVGQ(modifier, f11, f12, f19, f13, f14, f15, f16, f17, f20, f18, j4, shape2, z2, renderEffect3, j5, j6, i3);
    }

    @Stable
    /* renamed from: graphicsLayer-pANQ8Wg  reason: not valid java name */
    public static final /* synthetic */ Modifier m35818graphicsLayerpANQ8Wg(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3) {
        float f11 = f;
        C12775o.m28639i(modifier, "$this$graphicsLayer");
        C12775o.m28639i(shape, "shape");
        return m35816graphicsLayerAp8cVGQ(modifier, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, CompositingStrategy.Companion.m35755getAutoNrFUSI());
    }

    /* renamed from: graphicsLayer-pANQ8Wg$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35819graphicsLayerpANQ8Wg$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j4;
        Shape shape2;
        boolean z2;
        RenderEffect renderEffect2;
        long j5;
        long j6;
        int i2 = i;
        float f19 = 1.0f;
        if ((i2 & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f;
        }
        if ((i2 & 2) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f2;
        }
        if ((i2 & 4) == 0) {
            f19 = f3;
        }
        float f20 = 0.0f;
        if ((i2 & 8) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f4;
        }
        if ((i2 & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        if ((i2 & 32) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f6;
        }
        if ((i2 & 64) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f7;
        }
        if ((i2 & 128) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i2 & 256) == 0) {
            f20 = f9;
        }
        if ((i2 & 512) != 0) {
            f18 = 8.0f;
        } else {
            f18 = f10;
        }
        if ((i2 & 1024) != 0) {
            j4 = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        } else {
            j4 = j;
        }
        if ((i2 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i2 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 8192) != 0) {
            renderEffect2 = null;
        } else {
            renderEffect2 = renderEffect;
        }
        RenderEffect renderEffect3 = renderEffect2;
        if ((i2 & 16384) != 0) {
            j5 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j5 = j2;
        }
        if ((i2 & 32768) != 0) {
            j6 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j6 = j3;
        }
        return m35818graphicsLayerpANQ8Wg(modifier, f11, f12, f19, f13, f14, f15, f16, f17, f20, f18, j4, shape2, z2, renderEffect3, j5, j6);
    }

    @Stable
    /* renamed from: graphicsLayer-sKFY_QE  reason: not valid java name */
    public static final /* synthetic */ Modifier m35820graphicsLayersKFY_QE(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z) {
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier2, "$this$graphicsLayer");
        C12775o.m28639i(shape, "shape");
        return m35817graphicsLayerAp8cVGQ$default(modifier2, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, (RenderEffect) null, 0, 0, 0, 114688, (Object) null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35821graphicsLayersKFY_QE$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, int i, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j2;
        Shape shape2;
        boolean z2;
        int i2 = i;
        float f19 = 1.0f;
        if ((i2 & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f;
        }
        if ((i2 & 2) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f2;
        }
        if ((i2 & 4) == 0) {
            f19 = f3;
        }
        float f20 = 0.0f;
        if ((i2 & 8) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f4;
        }
        if ((i2 & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        if ((i2 & 32) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f6;
        }
        if ((i2 & 64) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f7;
        }
        if ((i2 & 128) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i2 & 256) == 0) {
            f20 = f9;
        }
        if ((i2 & 512) != 0) {
            f18 = 8.0f;
        } else {
            f18 = f10;
        }
        if ((i2 & 1024) != 0) {
            j2 = TransformOrigin.Companion.m36093getCenterSzJe1aQ();
        } else {
            j2 = j;
        }
        if ((i2 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i2 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m35820graphicsLayersKFY_QE(modifier, f11, f12, f19, f13, f14, f15, f16, f17, f20, f18, j2, shape2, z2);
    }

    @Stable
    public static final Modifier toolingGraphicsLayer(Modifier modifier) {
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier2, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            return modifier2.then(m35817graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131071, (Object) null));
        }
        return modifier2;
    }
}
