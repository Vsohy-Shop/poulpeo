package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Animator.kt */
public final class AnimatorKt$addPauseListener$listener$1 implements Animator.AnimatorPauseListener {
    final /* synthetic */ Function1<Animator, C11921v> $onPause;
    final /* synthetic */ Function1<Animator, C11921v> $onResume;

    AnimatorKt$addPauseListener$listener$1(Function1<? super Animator, C11921v> function1, Function1<? super Animator, C11921v> function12) {
        this.$onPause = function1;
        this.$onResume = function12;
    }

    public void onAnimationPause(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onPause.invoke(animator);
    }

    public void onAnimationResume(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onResume.invoke(animator);
    }
}
