package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.graphics.TileMode;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n154#2:154\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:154\n*E\n"})
/* renamed from: androidx.compose.ui.draw.BlurKt */
/* compiled from: Blur.kt */
public final class BlurKt {
    @Stable
    /* renamed from: blur-1fqS-gw  reason: not valid java name */
    public static final Modifier m35315blur1fqSgw(Modifier modifier, float f, float f2, Shape shape) {
        boolean z;
        int i;
        C12775o.m28639i(modifier, "$this$blur");
        if (shape != null) {
            i = TileMode.Companion.m36075getClamp3opZhB0();
            z = true;
        } else {
            z = false;
            i = TileMode.Companion.m36076getDecal3opZhB0();
        }
        float f3 = (float) 0;
        if ((C1232Dp.m38467compareTo0680j_4(f, C1232Dp.m38468constructorimpl(f3)) <= 0 || C1232Dp.m38467compareTo0680j_4(f2, C1232Dp.m38468constructorimpl(f3)) <= 0) && !z) {
            return modifier;
        }
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new BlurKt$blur$1(f, f2, i, shape, z));
    }

    /* renamed from: blur-1fqS-gw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35316blur1fqSgw$default(Modifier modifier, float f, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m35319boximpl(BlurredEdgeTreatment.Companion.m35326getRectangleGoahg());
        }
        return m35315blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m35325unboximpl());
    }

    @Stable
    /* renamed from: blur-F8QBwvs  reason: not valid java name */
    public static final Modifier m35317blurF8QBwvs(Modifier modifier, float f, Shape shape) {
        C12775o.m28639i(modifier, "$this$blur");
        return m35315blur1fqSgw(modifier, f, f, shape);
    }

    /* renamed from: blur-F8QBwvs$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35318blurF8QBwvs$default(Modifier modifier, float f, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m35319boximpl(BlurredEdgeTreatment.Companion.m35326getRectangleGoahg());
        }
        return m35317blurF8QBwvs(modifier, f, blurredEdgeTreatment.m35325unboximpl());
    }
}
