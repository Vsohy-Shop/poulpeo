package androidx.compose.p002ui.graphics.colorspace;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 */
/* compiled from: Rgb.kt */
final class Rgb$eotf$1 extends C12777p implements Function1<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final Double invoke(double d) {
        return Double.valueOf(this.this$0.getEotfOrig$ui_graphics_release().invoke(C13537l.m30884k(d, (double) this.this$0.min, (double) this.this$0.max)));
    }
}
