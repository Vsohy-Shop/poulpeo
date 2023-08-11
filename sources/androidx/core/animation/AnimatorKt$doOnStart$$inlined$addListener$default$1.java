package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: Animator.kt */
public final class AnimatorKt$doOnStart$$inlined$addListener$default$1 implements Animator.AnimatorListener {
    final /* synthetic */ Function1 $onStart;

    public AnimatorKt$doOnStart$$inlined$addListener$default$1(Function1 function1) {
        this.$onStart = function1;
    }

    public void onAnimationCancel(Animator animator) {
        C12775o.m28639i(animator, "animator");
    }

    public void onAnimationEnd(Animator animator) {
        C12775o.m28639i(animator, "animator");
    }

    public void onAnimationRepeat(Animator animator) {
        C12775o.m28639i(animator, "animator");
    }

    public void onAnimationStart(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
