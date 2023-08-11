package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.draw.AlphaKt */
/* compiled from: Alpha.kt */
public final class AlphaKt {
    @Stable
    public static final Modifier alpha(Modifier modifier, float f) {
        boolean z;
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier2, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return GraphicsLayerModifierKt.m35817graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, true, (RenderEffect) null, 0, 0, 0, 126971, (Object) null);
        }
        return modifier2;
    }
}
