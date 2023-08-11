package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;

/* compiled from: Arrangement.kt */
public final class Arrangement$Absolute$Center$1 implements Arrangement.Horizontal {
    Arrangement$Absolute$Center$1() {
    }

    public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        C12775o.m28639i(density, "<this>");
        C12775o.m28639i(iArr, "sizes");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(iArr2, "outPositions");
        Arrangement.INSTANCE.placeCenter$foundation_layout_release(i, iArr, iArr2, false);
    }

    public String toString() {
        return "AbsoluteArrangement#Center";
    }
}
