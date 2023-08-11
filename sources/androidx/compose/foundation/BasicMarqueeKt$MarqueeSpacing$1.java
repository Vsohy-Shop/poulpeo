package androidx.compose.foundation;

import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: BasicMarquee.kt */
final class BasicMarqueeKt$MarqueeSpacing$1 implements MarqueeSpacing {
    final /* synthetic */ float $spacing;

    BasicMarqueeKt$MarqueeSpacing$1(float f) {
        this.$spacing = f;
    }

    public final int calculateSpacing(Density density, int i, int i2) {
        C12775o.m28639i(density, "$this$MarqueeSpacing");
        return density.m38443roundToPx0680j_4(this.$spacing);
    }
}
