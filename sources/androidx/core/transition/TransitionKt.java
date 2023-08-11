package androidx.core.transition;

import android.transition.Transition;
import androidx.annotation.RequiresApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Transition.kt */
public final class TransitionKt {
    @RequiresApi(19)
    public static final Transition.TransitionListener addListener(Transition transition, Function1<? super Transition, C11921v> function1, Function1<? super Transition, C11921v> function12, Function1<? super Transition, C11921v> function13, Function1<? super Transition, C11921v> function14, Function1<? super Transition, C11921v> function15) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(function1, "onEnd");
        C12775o.m28639i(function12, "onStart");
        C12775o.m28639i(function13, "onCancel");
        C12775o.m28639i(function14, "onResume");
        C12775o.m28639i(function15, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(function1, function14, function15, function13, function12);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = TransitionKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function12 = TransitionKt$addListener$2.INSTANCE;
        }
        Function1 function16 = function12;
        if ((i & 4) != 0) {
            function13 = TransitionKt$addListener$3.INSTANCE;
        }
        Function1 function17 = function13;
        if ((i & 8) != 0) {
            function14 = TransitionKt$addListener$4.INSTANCE;
        }
        if ((i & 16) != 0) {
            function15 = TransitionKt$addListener$5.INSTANCE;
        }
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(function1, "onEnd");
        C12775o.m28639i(function16, "onStart");
        C12775o.m28639i(function17, "onCancel");
        C12775o.m28639i(function14, "onResume");
        C12775o.m28639i(function15, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(function1, function14, function15, function17, function16);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnCancel(Transition transition, Function1<? super Transition, C11921v> function1) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(function1, "action");
        TransitionKt$doOnCancel$$inlined$addListener$default$1 transitionKt$doOnCancel$$inlined$addListener$default$1 = new TransitionKt$doOnCancel$$inlined$addListener$default$1(function1);
        transition.addListener(transitionKt$doOnCancel$$inlined$addListener$default$1);
        return transitionKt$doOnCancel$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnEnd(Transition transition, Function1<? super Transition, C11921v> function1) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(function1, "action");
        TransitionKt$doOnEnd$$inlined$addListener$default$1 transitionKt$doOnEnd$$inlined$addListener$default$1 = new TransitionKt$doOnEnd$$inlined$addListener$default$1(function1);
        transition.addListener(transitionKt$doOnEnd$$inlined$addListener$default$1);
        return transitionKt$doOnEnd$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnPause(Transition transition, Function1<? super Transition, C11921v> function1) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(function1, "action");
        TransitionKt$doOnPause$$inlined$addListener$default$1 transitionKt$doOnPause$$inlined$addListener$default$1 = new TransitionKt$doOnPause$$inlined$addListener$default$1(function1);
        transition.addListener(transitionKt$doOnPause$$inlined$addListener$default$1);
        return transitionKt$doOnPause$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnResume(Transition transition, Function1<? super Transition, C11921v> function1) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(function1, "action");
        TransitionKt$doOnResume$$inlined$addListener$default$1 transitionKt$doOnResume$$inlined$addListener$default$1 = new TransitionKt$doOnResume$$inlined$addListener$default$1(function1);
        transition.addListener(transitionKt$doOnResume$$inlined$addListener$default$1);
        return transitionKt$doOnResume$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnStart(Transition transition, Function1<? super Transition, C11921v> function1) {
        C12775o.m28639i(transition, "<this>");
        C12775o.m28639i(function1, "action");
        TransitionKt$doOnStart$$inlined$addListener$default$1 transitionKt$doOnStart$$inlined$addListener$default$1 = new TransitionKt$doOnStart$$inlined$addListener$default$1(function1);
        transition.addListener(transitionKt$doOnStart$$inlined$addListener$default$1);
        return transitionKt$doOnStart$$inlined$addListener$default$1;
    }
}
