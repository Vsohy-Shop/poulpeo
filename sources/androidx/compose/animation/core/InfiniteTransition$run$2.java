package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: InfiniteTransition.kt */
final class InfiniteTransition$run$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InfiniteTransition $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$2(InfiniteTransition infiniteTransition, int i) {
        super(2);
        this.$tmp0_rcvr = infiniteTransition;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.run$animation_core_release(composer, this.$$changed | 1);
    }
}
