package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.util.MathHelpersKt;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.font.FontWeightKt */
/* compiled from: FontWeight.kt */
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f) {
        C12775o.m28639i(fontWeight, "start");
        C12775o.m28639i(fontWeight2, "stop");
        return new FontWeight(C13537l.m30886m(MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f), 1, 1000));
    }
}
