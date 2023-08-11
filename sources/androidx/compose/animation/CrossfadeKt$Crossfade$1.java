package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Crossfade.kt */
final class CrossfadeKt$Crossfade$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ C13089p<T, Composer, Integer, C11921v> $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ T $targetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$1(T t, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, C13089p<? super T, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$targetState = t;
        this.$modifier = modifier;
        this.$animationSpec = finiteAnimationSpec;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        CrossfadeKt.Crossfade(this.$targetState, this.$modifier, this.$animationSpec, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
