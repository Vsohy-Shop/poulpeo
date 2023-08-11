package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;

@Immutable
/* compiled from: EnterExitTransition.kt */
public final class Fade {
    private final float alpha;
    private final FiniteAnimationSpec<Float> animationSpec;

    public Fade(float f, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        this.alpha = f;
        this.animationSpec = finiteAnimationSpec;
    }

    public static /* synthetic */ Fade copy$default(Fade fade, float f, FiniteAnimationSpec<Float> finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fade.alpha;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = fade.animationSpec;
        }
        return fade.copy(f, finiteAnimationSpec);
    }

    public final float component1() {
        return this.alpha;
    }

    public final FiniteAnimationSpec<Float> component2() {
        return this.animationSpec;
    }

    public final Fade copy(float f, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new Fade(f, finiteAnimationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        if (C12775o.m28634d(Float.valueOf(this.alpha), Float.valueOf(fade.alpha)) && C12775o.m28634d(this.animationSpec, fade.animationSpec)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.hashCode(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }
}
