package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: EnterExitTransition.kt */
public abstract class EnterTransition {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final EnterTransition None = new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, 15, (DefaultConstructorMarker) null));

    /* compiled from: EnterExitTransition.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnterTransition getNone() {
            return EnterTransition.None;
        }
    }

    public /* synthetic */ EnterTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EnterTransition) || !C12775o.m28634d(((EnterTransition) obj).getData$animation_release(), getData$animation_release())) {
            return false;
        }
        return true;
    }

    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    public final EnterTransition plus(EnterTransition enterTransition) {
        C12775o.m28639i(enterTransition, "enter");
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = enterTransition.getData$animation_release().getFade();
        }
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = enterTransition.getData$animation_release().getSlide();
        }
        ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = enterTransition.getData$animation_release().getChangeSize();
        }
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = enterTransition.getData$animation_release().getScale();
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale));
    }

    private EnterTransition() {
    }
}
