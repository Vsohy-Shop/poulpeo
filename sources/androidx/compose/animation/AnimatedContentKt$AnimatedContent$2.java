package androidx.compose.animation;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentKt$AnimatedContent$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13090q<AnimatedVisibilityScope, S, Composer, Integer, C11921v> $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Function1<AnimatedContentScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContent$2(S s, Modifier modifier, Function1<? super AnimatedContentScope<S>, ContentTransform> function1, Alignment alignment, C13090q<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, C11921v> qVar, int i, int i2) {
        super(2);
        this.$targetState = s;
        this.$modifier = modifier;
        this.$transitionSpec = function1;
        this.$contentAlignment = alignment;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedContentKt.AnimatedContent(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
