package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt$onFocusedBoundsChanged$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,123:1\n36#2:124\n1114#3,6:125\n*S KotlinDebug\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt$onFocusedBoundsChanged$2\n*L\n55#1:124\n55#1:125,6\n*E\n"})
/* compiled from: FocusedBounds.kt */
final class FocusedBoundsKt$onFocusedBoundsChanged$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1<LayoutCoordinates, C11921v> $onPositioned;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusedBoundsKt$onFocusedBoundsChanged$2(Function1<? super LayoutCoordinates, C11921v> function1) {
        super(3);
        this.$onPositioned = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(1176407768);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1176407768, i, -1, "androidx.compose.foundation.onFocusedBoundsChanged.<anonymous> (FocusedBounds.kt:53)");
        }
        Function1<LayoutCoordinates, C11921v> function1 = this.$onPositioned;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FocusedBoundsObserverModifier(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        FocusedBoundsObserverModifier focusedBoundsObserverModifier = (FocusedBoundsObserverModifier) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return focusedBoundsObserverModifier;
    }
}
