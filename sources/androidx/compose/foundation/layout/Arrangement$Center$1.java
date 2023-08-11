package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n190#1:710\n*E\n"})
/* compiled from: Arrangement.kt */
public final class Arrangement$Center$1 implements Arrangement.HorizontalOrVertical {
    private final float spacing = C1232Dp.m38468constructorimpl((float) 0);

    Arrangement$Center$1() {
    }

    public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        C12775o.m28639i(density, "<this>");
        C12775o.m28639i(iArr, "sizes");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(iArr2, "outPositions");
        if (layoutDirection == LayoutDirection.Ltr) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
        } else {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, true);
        }
    }

    /* renamed from: getSpacing-D9Ej5fM  reason: not valid java name */
    public float m33191getSpacingD9Ej5fM() {
        return this.spacing;
    }

    public String toString() {
        return "Arrangement#Center";
    }

    public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
        C12775o.m28639i(density, "<this>");
        C12775o.m28639i(iArr, "sizes");
        C12775o.m28639i(iArr2, "outPositions");
        Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
    }
}
