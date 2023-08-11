package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl$onPlaced$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n25#2:201\n1114#3,6:202\n*S KotlinDebug\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl$onPlaced$2\n*L\n178#1:201\n178#1:202,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2 */
/* compiled from: LookaheadLayout.kt */
final class LookaheadLayoutScopeImpl$onPlaced$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ C13088o<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, C11921v> $onPlaced;
    final /* synthetic */ LookaheadLayoutScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LookaheadLayoutScopeImpl$onPlaced$2(C13088o<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, C11921v> oVar, LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl) {
        super(3);
        this.$onPlaced = oVar;
        this.this$0 = lookaheadLayoutScopeImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-814093691);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-814093691, i, -1, "androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.<anonymous> (LookaheadLayout.kt:176)");
        }
        C13088o<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, C11921v> oVar = this.$onPlaced;
        LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = this.this$0;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LookaheadOnPlacedModifier(oVar, new LookaheadLayoutScopeImpl$onPlaced$2$1$1(lookaheadLayoutScopeImpl));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then((Modifier) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
