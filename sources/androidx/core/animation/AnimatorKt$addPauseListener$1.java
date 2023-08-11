package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Animator.kt */
final class AnimatorKt$addPauseListener$1 extends C12777p implements Function1<Animator, C11921v> {
    public static final AnimatorKt$addPauseListener$1 INSTANCE = new AnimatorKt$addPauseListener$1();

    AnimatorKt$addPauseListener$1() {
        super(1);
    }

    public final void invoke(Animator animator) {
        C12775o.m28639i(animator, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Animator) obj);
        return C11921v.f18618a;
    }
}
