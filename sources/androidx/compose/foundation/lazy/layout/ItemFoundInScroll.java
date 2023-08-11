package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyAnimateScroll.kt */
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;
    private final AnimationState<Float, AnimationVector1D> previousAnimation;

    public ItemFoundInScroll(int i, AnimationState<Float, AnimationVector1D> animationState) {
        C12775o.m28639i(animationState, "previousAnimation");
        this.itemOffset = i;
        this.previousAnimation = animationState;
    }

    public final int getItemOffset() {
        return this.itemOffset;
    }

    public final AnimationState<Float, AnimationVector1D> getPreviousAnimation() {
        return this.previousAnimation;
    }
}
