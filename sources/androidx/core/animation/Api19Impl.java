package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(19)
/* compiled from: Animator.kt */
final class Api19Impl {
    public static final Api19Impl INSTANCE = new Api19Impl();

    private Api19Impl() {
    }

    @DoNotInline
    public static final void addPauseListener(Animator animator, Animator.AnimatorPauseListener animatorPauseListener) {
        C12775o.m28639i(animator, "animator");
        C12775o.m28639i(animatorPauseListener, "listener");
        animator.addPauseListener(animatorPauseListener);
    }
}
