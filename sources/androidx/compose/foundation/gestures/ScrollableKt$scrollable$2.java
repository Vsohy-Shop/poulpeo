package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12085h;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,579:1\n474#2,4:580\n478#2,2:588\n482#2:594\n25#3:584\n83#3,3:595\n1114#4,3:585\n1117#4,3:591\n1114#4,6:598\n474#5:590\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n*L\n157#1:580,4\n157#1:588,2\n157#1:594\n157#1:584\n159#1:595,3\n157#1:585,3\n157#1:591,3\n159#1:598,6\n157#1:590\n*E\n"})
/* compiled from: Scrollable.kt */
final class ScrollableKt$scrollable$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ OverscrollEffect $overscrollEffect;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ ScrollableState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$scrollable$2(Orientation orientation, ScrollableState scrollableState, boolean z, MutableInteractionSource mutableInteractionSource, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z2) {
        super(3);
        this.$orientation = orientation;
        this.$state = scrollableState;
        this.$reverseDirection = z;
        this.$interactionSource = mutableInteractionSource;
        this.$flingBehavior = flingBehavior;
        this.$overscrollEffect = overscrollEffect;
        this.$enabled = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-629830927);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-629830927, i, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {coroutineScope, this.$orientation, this.$state, Boolean.valueOf(this.$reverseDirection)};
        Orientation orientation = this.$orientation;
        ScrollableState scrollableState = this.$state;
        boolean z = this.$reverseDirection;
        composer.startReplaceableGroup(-568225417);
        boolean z2 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z2 |= composer.changed(objArr[i2]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ContentInViewModifier(coroutineScope, orientation, scrollableState, z);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier modifier2 = Modifier.Companion;
        Modifier access$pointerScrollable = ScrollableKt.pointerScrollable(FocusableKt.focusGroup(modifier2).then(((ContentInViewModifier) rememberedValue2).getModifier()), this.$interactionSource, this.$orientation, this.$reverseDirection, this.$state, this.$flingBehavior, this.$overscrollEffect, this.$enabled, composer, 0);
        if (this.$enabled) {
            modifier2 = ModifierLocalScrollableContainerProvider.INSTANCE;
        }
        Modifier then = access$pointerScrollable.then(modifier2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
