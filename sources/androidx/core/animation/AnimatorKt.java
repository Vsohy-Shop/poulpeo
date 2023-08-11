package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.RequiresApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Animator.kt */
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, Function1<? super Animator, C11921v> function1, Function1<? super Animator, C11921v> function12, Function1<? super Animator, C11921v> function13, Function1<? super Animator, C11921v> function14) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "onEnd");
        C12775o.m28639i(function12, "onStart");
        C12775o.m28639i(function13, "onCancel");
        C12775o.m28639i(function14, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(function14, function1, function13, function12);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AnimatorKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function12 = AnimatorKt$addListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            function13 = AnimatorKt$addListener$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            function14 = AnimatorKt$addListener$4.INSTANCE;
        }
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "onEnd");
        C12775o.m28639i(function12, "onStart");
        C12775o.m28639i(function13, "onCancel");
        C12775o.m28639i(function14, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(function14, function1, function13, function12);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, Function1<? super Animator, C11921v> function1, Function1<? super Animator, C11921v> function12) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "onResume");
        C12775o.m28639i(function12, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(function12, function1);
        Api19Impl.addPauseListener(animator, animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AnimatorKt$addPauseListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function12 = AnimatorKt$addPauseListener$2.INSTANCE;
        }
        return addPauseListener(animator, function1, function12);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, Function1<? super Animator, C11921v> function1) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "action");
        AnimatorKt$doOnCancel$$inlined$addListener$default$1 animatorKt$doOnCancel$$inlined$addListener$default$1 = new AnimatorKt$doOnCancel$$inlined$addListener$default$1(function1);
        animator.addListener(animatorKt$doOnCancel$$inlined$addListener$default$1);
        return animatorKt$doOnCancel$$inlined$addListener$default$1;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, Function1<? super Animator, C11921v> function1) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "action");
        AnimatorKt$doOnEnd$$inlined$addListener$default$1 animatorKt$doOnEnd$$inlined$addListener$default$1 = new AnimatorKt$doOnEnd$$inlined$addListener$default$1(function1);
        animator.addListener(animatorKt$doOnEnd$$inlined$addListener$default$1);
        return animatorKt$doOnEnd$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, Function1<? super Animator, C11921v> function1) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "action");
        return addPauseListener$default(animator, (Function1) null, function1, 1, (Object) null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, Function1<? super Animator, C11921v> function1) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "action");
        AnimatorKt$doOnRepeat$$inlined$addListener$default$1 animatorKt$doOnRepeat$$inlined$addListener$default$1 = new AnimatorKt$doOnRepeat$$inlined$addListener$default$1(function1);
        animator.addListener(animatorKt$doOnRepeat$$inlined$addListener$default$1);
        return animatorKt$doOnRepeat$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, Function1<? super Animator, C11921v> function1) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "action");
        return addPauseListener$default(animator, function1, (Function1) null, 2, (Object) null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, Function1<? super Animator, C11921v> function1) {
        C12775o.m28639i(animator, "<this>");
        C12775o.m28639i(function1, "action");
        AnimatorKt$doOnStart$$inlined$addListener$default$1 animatorKt$doOnStart$$inlined$addListener$default$1 = new AnimatorKt$doOnStart$$inlined$addListener$default$1(function1);
        animator.addListener(animatorKt$doOnStart$$inlined$addListener$default$1);
        return animatorKt$doOnStart$$inlined$addListener$default$1;
    }
}
