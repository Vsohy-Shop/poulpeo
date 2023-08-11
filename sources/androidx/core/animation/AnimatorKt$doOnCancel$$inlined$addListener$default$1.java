package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: Animator.kt */
public final class AnimatorKt$doOnCancel$$inlined$addListener$default$1 implements Animator.AnimatorListener {
    final /* synthetic */ Function1 $onCancel;

    public AnimatorKt$doOnCancel$$inlined$addListener$default$1(Function1 function1) {
        this.$onCancel = function1;
    }

    public void onAnimationCancel(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onCancel.invoke(animator);
    }

    public void onAnimationEnd(Animator animator) {
        C12775o.m28639i(animator, "animator");
    }

    public void onAnimationRepeat(Animator animator) {
        C12775o.m28639i(animator, "animator");
    }

    public void onAnimationStart(Animator animator) {
        C12775o.m28639i(animator, "animator");
    }
}
