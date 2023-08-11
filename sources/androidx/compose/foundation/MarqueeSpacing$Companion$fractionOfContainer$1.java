package androidx.compose.foundation;

import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: BasicMarquee.kt */
final class MarqueeSpacing$Companion$fractionOfContainer$1 implements MarqueeSpacing {
    final /* synthetic */ float $fraction;

    MarqueeSpacing$Companion$fractionOfContainer$1(float f) {
        this.$fraction = f;
    }

    public final int calculateSpacing(Density density, int i, int i2) {
        C12775o.m28639i(density, "$this$MarqueeSpacing");
        return C13265c.m30134c(this.$fraction * ((float) i2));
    }
}
