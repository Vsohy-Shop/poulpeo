package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;

/* compiled from: AndroidActualDefaultDecayAnimationSpec.android.kt */
public final class AndroidActualDefaultDecayAnimationSpec_androidKt {
    @Composable
    public static final DecayAnimationSpec<Float> defaultDecayAnimationSpec(Composer composer, int i) {
        composer.startReplaceableGroup(-1468328074);
        DecayAnimationSpec<Float> rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.endReplaceableGroup();
        return rememberSplineBasedDecay;
    }
}
