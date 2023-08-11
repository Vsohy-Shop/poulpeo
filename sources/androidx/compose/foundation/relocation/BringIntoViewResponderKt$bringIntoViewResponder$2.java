package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt$bringIntoViewResponder$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,199:1\n36#2:200\n1114#3,6:201\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt$bringIntoViewResponder$2\n*L\n107#1:200\n107#1:201,6\n*E\n"})
/* compiled from: BringIntoViewResponder.kt */
final class BringIntoViewResponderKt$bringIntoViewResponder$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ BringIntoViewResponder $responder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderKt$bringIntoViewResponder$2(BringIntoViewResponder bringIntoViewResponder) {
        super(3);
        this.$responder = bringIntoViewResponder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-852052847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-852052847, i, -1, "androidx.compose.foundation.relocation.bringIntoViewResponder.<anonymous> (BringIntoViewResponder.kt:104)");
        }
        BringIntoViewParent rememberDefaultBringIntoViewParent = BringIntoViewResponder_androidKt.rememberDefaultBringIntoViewParent(composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) rememberDefaultBringIntoViewParent);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BringIntoViewResponderModifier(rememberDefaultBringIntoViewParent);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BringIntoViewResponderModifier bringIntoViewResponderModifier = (BringIntoViewResponderModifier) rememberedValue;
        bringIntoViewResponderModifier.setResponder(this.$responder);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bringIntoViewResponderModifier;
    }
}
