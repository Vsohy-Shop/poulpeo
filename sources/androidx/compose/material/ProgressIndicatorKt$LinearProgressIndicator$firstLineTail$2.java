package androidx.compose.material;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 extends C12777p implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, C11921v> {
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2();

    ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) (KeyframesSpec.KeyframesSpecConfig) obj);
        return C11921v.f18618a;
    }

    public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
        C12775o.m28639i(keyframesSpecConfig, "$this$keyframes");
        keyframesSpecConfig.setDurationMillis(1800);
        keyframesSpecConfig.with(keyframesSpecConfig.mo4121at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
        keyframesSpecConfig.mo4121at(Float.valueOf(1.0f), 1183);
    }
}
