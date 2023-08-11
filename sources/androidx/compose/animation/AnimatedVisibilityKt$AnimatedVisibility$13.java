package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedVisibilityKt$AnimatedVisibility$13 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<AnimatedVisibilityScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<T> $this_AnimatedVisibility;
    final /* synthetic */ Function1<T, Boolean> $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedVisibility$13(Transition<T> transition, Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, C13089p<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = transition;
        this.$visible = function1;
        this.$modifier = modifier;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, (C13089p<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, C11921v>) this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
