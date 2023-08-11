package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: Arrangement.kt */
public final class Arrangement$Top$1 implements Arrangement.Vertical {
    Arrangement$Top$1() {
    }

    public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
        C12775o.m28639i(density, "<this>");
        C12775o.m28639i(iArr, "sizes");
        C12775o.m28639i(iArr2, "outPositions");
        Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
    }

    public String toString() {
        return "Arrangement#Top";
    }
}
