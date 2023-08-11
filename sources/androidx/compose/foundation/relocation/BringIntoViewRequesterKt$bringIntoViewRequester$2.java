package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,154:1\n36#2:155\n1114#3,6:156\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2\n*L\n108#1:155\n108#1:156,6\n*E\n"})
/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterKt$bringIntoViewRequester$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterKt$bringIntoViewRequester$2(BringIntoViewRequester bringIntoViewRequester) {
        super(3);
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-992853993);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-992853993, i, -1, "androidx.compose.foundation.relocation.bringIntoViewRequester.<anonymous> (BringIntoViewRequester.kt:105)");
        }
        BringIntoViewParent rememberDefaultBringIntoViewParent = BringIntoViewResponder_androidKt.rememberDefaultBringIntoViewParent(composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) rememberDefaultBringIntoViewParent);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BringIntoViewRequesterModifier(rememberDefaultBringIntoViewParent);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final BringIntoViewRequesterModifier bringIntoViewRequesterModifier = (BringIntoViewRequesterModifier) rememberedValue;
        final BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            EffectsKt.DisposableEffect((Object) bringIntoViewRequester, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1<DisposableEffectScope, DisposableEffectResult>() {
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
                    ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().add(bringIntoViewRequesterModifier);
                    return new C0592x63edd90e(bringIntoViewRequester, bringIntoViewRequesterModifier);
                }
            }, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bringIntoViewRequesterModifier;
    }
}
