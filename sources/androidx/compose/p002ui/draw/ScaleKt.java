package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.draw.ScaleKt */
/* compiled from: Scale.kt */
public final class ScaleKt {
    @Stable
    public static final Modifier scale(Modifier modifier, float f, float f2) {
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier2, "<this>");
        boolean z = true;
        if (f == 1.0f) {
            if (f2 != 1.0f) {
                z = false;
            }
            if (z) {
                return modifier2;
            }
        }
        return GraphicsLayerModifierKt.m35817graphicsLayerAp8cVGQ$default(modifier, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131068, (Object) null);
    }

    @Stable
    public static final Modifier scale(Modifier modifier, float f) {
        C12775o.m28639i(modifier, "<this>");
        return scale(modifier, f, f);
    }
}
