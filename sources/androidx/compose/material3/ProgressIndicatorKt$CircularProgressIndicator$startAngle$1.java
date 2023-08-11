package androidx.compose.material3;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$CircularProgressIndicator$startAngle$1 extends C12777p implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, C11921v> {
    public static final ProgressIndicatorKt$CircularProgressIndicator$startAngle$1 INSTANCE = new ProgressIndicatorKt$CircularProgressIndicator$startAngle$1();

    ProgressIndicatorKt$CircularProgressIndicator$startAngle$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) (KeyframesSpec.KeyframesSpecConfig) obj);
        return C11921v.f18618a;
    }

    public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
        C12775o.m28639i(keyframesSpecConfig, "$this$keyframes");
        keyframesSpecConfig.setDurationMillis(1332);
        keyframesSpecConfig.with(keyframesSpecConfig.mo4121at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
        keyframesSpecConfig.mo4121at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
    }
}
