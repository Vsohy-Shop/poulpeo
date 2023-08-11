package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Crossfade.kt */
final class CrossfadeKt$Crossfade$6 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ C13089p<T, Composer, Integer, C11921v> $content;
    final /* synthetic */ Function1<T, Object> $contentKey;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$6(Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function1<? super T, ? extends Object> function1, C13089p<? super T, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$this_Crossfade = transition;
        this.$modifier = modifier;
        this.$animationSpec = finiteAnimationSpec;
        this.$contentKey = function1;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        CrossfadeKt.Crossfade(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
