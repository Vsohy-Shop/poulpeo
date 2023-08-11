package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

/* compiled from: Effects.kt */
final class EffectsKt$LaunchedEffect$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<C13995l0, C12074d<? super C11921v>, Object> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EffectsKt$LaunchedEffect$1(C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, int i) {
        super(2);
        this.$block = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        EffectsKt.LaunchedEffect(this.$block, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
