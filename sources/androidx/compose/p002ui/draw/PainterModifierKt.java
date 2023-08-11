package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.layout.ContentScale;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.draw.PainterModifierKt */
/* compiled from: PainterModifier.kt */
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(painter, "painter");
        C12775o.m28639i(alignment, "alignment");
        C12775o.m28639i(contentScale, "contentScale");
        return modifier.then(new PainterModifierNodeElement(painter, z, alignment, contentScale, f, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i & 8) != 0) {
            contentScale = ContentScale.Companion.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z2, alignment2, contentScale2, f2, colorFilter);
    }
}
