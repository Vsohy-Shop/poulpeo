package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Transition.kt */
final class Transition$animateTo$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transition$animateTo$2(Transition<S> transition, S s, int i) {
        super(2);
        this.$tmp0_rcvr = transition;
        this.$targetState = s;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.animateTo$animation_core_release(this.$targetState, composer, this.$$changed | 1);
    }
}
