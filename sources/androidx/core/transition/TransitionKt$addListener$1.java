package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Transition.kt */
public final class TransitionKt$addListener$1 extends C12777p implements Function1<Transition, C11921v> {
    public static final TransitionKt$addListener$1 INSTANCE = new TransitionKt$addListener$1();

    public TransitionKt$addListener$1() {
        super(1);
    }

    public final void invoke(Transition transition) {
        C12775o.m28639i(transition, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Transition) obj);
        return C11921v.f18618a;
    }
}
