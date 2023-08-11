package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Animator.kt */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ Function1<Animator, C11921v> $onCancel;
    final /* synthetic */ Function1<Animator, C11921v> $onEnd;
    final /* synthetic */ Function1<Animator, C11921v> $onRepeat;
    final /* synthetic */ Function1<Animator, C11921v> $onStart;

    public AnimatorKt$addListener$listener$1(Function1<? super Animator, C11921v> function1, Function1<? super Animator, C11921v> function12, Function1<? super Animator, C11921v> function13, Function1<? super Animator, C11921v> function14) {
        this.$onRepeat = function1;
        this.$onEnd = function12;
        this.$onCancel = function13;
        this.$onStart = function14;
    }

    public void onAnimationCancel(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onCancel.invoke(animator);
    }

    public void onAnimationEnd(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onEnd.invoke(animator);
    }

    public void onAnimationRepeat(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onRepeat.invoke(animator);
    }

    public void onAnimationStart(Animator animator) {
        C12775o.m28639i(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
