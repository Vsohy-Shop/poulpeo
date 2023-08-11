package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;

/* compiled from: Arrangement.kt */
public final class Arrangement$End$1 implements Arrangement.Horizontal {
    Arrangement$End$1() {
    }

    public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        C12775o.m28639i(density, "<this>");
        C12775o.m28639i(iArr, "sizes");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(iArr2, "outPositions");
        if (layoutDirection == LayoutDirection.Ltr) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i, iArr, iArr2, false);
        } else {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
        }
    }

    public String toString() {
        return "Arrangement#End";
    }
}
