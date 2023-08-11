package androidx.compose.material;

import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2Kt$fractionalPositionalThreshold$1 extends C12777p implements C13088o<Density, Float, Float> {
    final /* synthetic */ float $fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2Kt$fractionalPositionalThreshold$1(float f) {
        super(2);
        this.$fraction = f;
    }

    public final Float invoke(Density density, float f) {
        C12775o.m28639i(density, "$this$null");
        return Float.valueOf(f * this.$fraction);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Density) obj, ((Number) obj2).floatValue());
    }
}
