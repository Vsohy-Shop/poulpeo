package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: Switch.kt */
final class SwitchKt$Switch$valueToOffset$1$1 extends C12777p implements Function1<Boolean, Float> {
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwitchKt$Switch$valueToOffset$1$1(float f, float f2) {
        super(1);
        this.$maxBound = f;
        this.$minBound = f2;
    }

    public final Float invoke(boolean z) {
        return Float.valueOf(z ? this.$maxBound : this.$minBound);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
