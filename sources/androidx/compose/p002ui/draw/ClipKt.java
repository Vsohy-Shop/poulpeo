package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.graphics.RenderEffect;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.draw.ClipKt */
/* compiled from: Clip.kt */
public final class ClipKt {
    @Stable
    public static final Modifier clip(Modifier modifier, Shape shape) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(shape, "shape");
        return GraphicsLayerModifierKt.m35817graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, shape, true, (RenderEffect) null, 0, 0, 0, 124927, (Object) null);
    }

    @Stable
    public static final Modifier clipToBounds(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return GraphicsLayerModifierKt.m35817graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, true, (RenderEffect) null, 0, 0, 0, 126975, (Object) null);
    }
}
