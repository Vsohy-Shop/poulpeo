package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: SpringEstimation.kt */
final class SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 extends C12777p implements Function1<Double, Double> {
    final /* synthetic */ double $c1;
    final /* synthetic */ double $c2;

    /* renamed from: $r */
    final /* synthetic */ double f228$r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(double d, double d2, double d3) {
        super(1);
        this.$c2 = d;
        this.f228$r = d2;
        this.$c1 = d3;
    }

    public final Double invoke(double d) {
        double d2 = this.$c2;
        double d3 = this.f228$r;
        return Double.valueOf(((d2 * ((d3 * d) + ((double) 1))) + (this.$c1 * d3)) * Math.exp(d3 * d));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
