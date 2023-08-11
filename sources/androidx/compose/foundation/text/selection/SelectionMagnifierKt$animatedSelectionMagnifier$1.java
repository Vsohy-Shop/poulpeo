package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n36#2:112\n1114#3,6:113\n76#4:119\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n69#1:112\n69#1:113,6\n68#1:119\n*E\n"})
/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ C13074a<Offset> $magnifierCenter;
    final /* synthetic */ Function1<C13074a<Offset>, Modifier> $platformMagnifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$animatedSelectionMagnifier$1(C13074a<Offset> aVar, Function1<? super C13074a<Offset>, ? extends Modifier> function1) {
        super(3);
        this.$magnifierCenter = aVar;
        this.$platformMagnifier = function1;
    }

    /* access modifiers changed from: private */
    public static final long invoke$lambda$0(State<Offset> state) {
        return state.getValue().m35432unboximpl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(759876635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:66)");
        }
        State access$rememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
        Function1<C13074a<Offset>, Modifier> function1 = this.$platformMagnifier;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) access$rememberAnimatedMagnifierPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(access$rememberAnimatedMagnifierPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier invoke = function1.invoke(rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return invoke;
    }
}
