package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p355hf.C12085h;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

/* compiled from: AnimationModifier.kt */
final class AnimationModifierKt$animateContentSize$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ FiniteAnimationSpec<IntSize> $animationSpec;
    final /* synthetic */ C13088o<IntSize, IntSize, C11921v> $finishedListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimationModifierKt$animateContentSize$2(C13088o<? super IntSize, ? super IntSize, C11921v> oVar, FiniteAnimationSpec<IntSize> finiteAnimationSpec) {
        super(3);
        this.$finishedListener = oVar;
        this.$animationSpec = finiteAnimationSpec;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-843180607);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        FiniteAnimationSpec<IntSize> finiteAnimationSpec = this.$animationSpec;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SizeAnimationModifier(finiteAnimationSpec, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) rememberedValue2;
        sizeAnimationModifier.setListener(this.$finishedListener);
        Modifier then = ClipKt.clipToBounds(modifier).then(sizeAnimationModifier);
        composer.endReplaceableGroup();
        return then;
    }
}
