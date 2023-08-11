package androidx.compose.p002ui.graphics.colorspace;

import androidx.compose.p002ui.graphics.ColorKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1 */
/* compiled from: Connector.kt */
public final class Connector$Companion$identity$1 extends Connector {
    Connector$Companion$identity$1(ColorSpace colorSpace, int i) {
        super(colorSpace, colorSpace, i, (DefaultConstructorMarker) null);
    }

    public float[] transform(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        return fArr;
    }

    /* renamed from: transformToColor-wmQWz5c$ui_graphics_release  reason: not valid java name */
    public long m36126transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
        return ColorKt.Color(f, f2, f3, f4, getDestination());
    }
}
