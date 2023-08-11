package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Animator.kt */
public final class AnimatorKt$addListener$4 extends C12777p implements Function1<Animator, C11921v> {
    public static final AnimatorKt$addListener$4 INSTANCE = new AnimatorKt$addListener$4();

    public AnimatorKt$addListener$4() {
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
