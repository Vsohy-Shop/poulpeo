package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt$drawWithCache$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,276:1\n25#2:277\n1114#3,6:278\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt$drawWithCache$2\n*L\n142#1:277\n142#1:278,6\n*E\n"})
/* renamed from: androidx.compose.ui.draw.DrawModifierKt$drawWithCache$2 */
/* compiled from: DrawModifier.kt */
final class DrawModifierKt$drawWithCache$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1<CacheDrawScope, DrawResult> $onBuildDrawCache;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawModifierKt$drawWithCache$2(Function1<? super CacheDrawScope, DrawResult> function1) {
        super(3);
        this.$onBuildDrawCache = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-1689569019);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1689569019, i, -1, "androidx.compose.ui.draw.drawWithCache.<anonymous> (DrawModifier.kt:140)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CacheDrawScope();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then(new DrawContentCacheModifier((CacheDrawScope) rememberedValue, this.$onBuildDrawCache));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
