package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;

/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt */
/* compiled from: CanvasDrawScope.kt */
public final class CanvasDrawScopeKt {
    /* access modifiers changed from: private */
    public static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    /* access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(DrawContext drawContext) {
        return new CanvasDrawScopeKt$asDrawTransform$1(drawContext);
    }
}
