package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Transition.kt */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ Function1<Transition, C11921v> $onCancel;
    final /* synthetic */ Function1<Transition, C11921v> $onEnd;
    final /* synthetic */ Function1<Transition, C11921v> $onPause;
    final /* synthetic */ Function1<Transition, C11921v> $onResume;
    final /* synthetic */ Function1<Transition, C11921v> $onStart;

    public TransitionKt$addListener$listener$1(Function1<? super Transition, C11921v> function1, Function1<? super Transition, C11921v> function12, Function1<? super Transition, C11921v> function13, Function1<? super Transition, C11921v> function14, Function1<? super Transition, C11921v> function15) {
        this.$onEnd = function1;
        this.$onResume = function12;
        this.$onPause = function13;
        this.$onCancel = function14;
        this.$onStart = function15;
    }

    public void onTransitionCancel(Transition transition) {
        C12775o.m28639i(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    public void onTransitionEnd(Transition transition) {
        C12775o.m28639i(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    public void onTransitionPause(Transition transition) {
        C12775o.m28639i(transition, "transition");
        this.$onPause.invoke(transition);
    }

    public void onTransitionResume(Transition transition) {
        C12775o.m28639i(transition, "transition");
        this.$onResume.invoke(transition);
    }

    public void onTransitionStart(Transition transition) {
        C12775o.m28639i(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
