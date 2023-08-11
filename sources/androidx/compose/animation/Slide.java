package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

@Immutable
/* compiled from: EnterExitTransition.kt */
public final class Slide {
    private final FiniteAnimationSpec<IntOffset> animationSpec;
    private final Function1<IntSize, IntOffset> slideOffset;

    public Slide(Function1<? super IntSize, IntOffset> function1, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        C12775o.m28639i(function1, "slideOffset");
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        this.slideOffset = function1;
        this.animationSpec = finiteAnimationSpec;
    }

    public static /* synthetic */ Slide copy$default(Slide slide, Function1<IntSize, IntOffset> function1, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = slide.slideOffset;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(function1, finiteAnimationSpec);
    }

    public final Function1<IntSize, IntOffset> component1() {
        return this.slideOffset;
    }

    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    public final Slide copy(Function1<? super IntSize, IntOffset> function1, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        C12775o.m28639i(function1, "slideOffset");
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new Slide(function1, finiteAnimationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        if (C12775o.m28634d(this.slideOffset, slide.slideOffset) && C12775o.m28634d(this.animationSpec, slide.animationSpec)) {
            return true;
        }
        return false;
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Function1<IntSize, IntOffset> getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
