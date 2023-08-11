package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: SpringEstimation.kt */
final class SpringEstimationKt$estimateCriticallyDamped$fn$1 extends C12777p implements Function1<Double, Double> {
    final /* synthetic */ double $c1;
    final /* synthetic */ double $c2;

    /* renamed from: $r */
    final /* synthetic */ double f227$r;
    final /* synthetic */ double $signedDelta;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpringEstimationKt$estimateCriticallyDamped$fn$1(double d, double d2, double d3, double d4) {
        super(1);
        this.$c1 = d;
        this.$c2 = d2;
        this.f227$r = d3;
        this.$signedDelta = d4;
    }

    public final Double invoke(double d) {
        return Double.valueOf(((this.$c1 + (this.$c2 * d)) * Math.exp(this.f227$r * d)) + this.$signedDelta);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
