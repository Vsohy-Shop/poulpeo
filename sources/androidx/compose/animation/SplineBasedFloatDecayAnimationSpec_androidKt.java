package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;

/* compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
public final class SplineBasedFloatDecayAnimationSpec_androidKt {
    private static final float platformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    public static final float getPlatformFlingScrollFriction() {
        return platformFlingScrollFriction;
    }

    @Composable
    public static final <T> DecayAnimationSpec<T> rememberSplineBasedDecay(Composer composer, int i) {
        composer.startReplaceableGroup(904445851);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Float valueOf = Float.valueOf(density.getDensity());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DecayAnimationSpec<T> decayAnimationSpec = (DecayAnimationSpec) rememberedValue;
        composer.endReplaceableGroup();
        return decayAnimationSpec;
    }
}
