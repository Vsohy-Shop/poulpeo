package androidx.compose.material;

import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2Kt$fixedPositionalThreshold$1 extends C12777p implements C13088o<Density, Float, Float> {
    final /* synthetic */ float $threshold;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2Kt$fixedPositionalThreshold$1(float f) {
        super(2);
        this.$threshold = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Density) obj, ((Number) obj2).floatValue());
    }

    public final Float invoke(Density density, float f) {
        C12775o.m28639i(density, "$this$null");
        return Float.valueOf(density.m38449toPx0680j_4(this.$threshold));
    }
}
