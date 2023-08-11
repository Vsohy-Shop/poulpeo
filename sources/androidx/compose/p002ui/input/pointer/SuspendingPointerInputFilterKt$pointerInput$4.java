package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt$pointerInput$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,643:1\n76#2:644\n76#2:645\n36#3:646\n1114#4,6:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt$pointerInput$4\n*L\n287#1:644\n288#1:645\n289#1:646\n289#1:647,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4 */
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilterKt$pointerInput$4 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ C13088o<PointerInputScope, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ Object $key1;
    final /* synthetic */ Object $key2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilterKt$pointerInput$4(Object obj, Object obj2, C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        super(3);
        this.$key1 = obj;
        this.$key2 = obj2;
        this.$block = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(1175567217);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175567217, i, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:285)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SuspendingPointerInputFilter(viewConfiguration, density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) rememberedValue;
        EffectsKt.LaunchedEffect(suspendingPointerInputFilter, this.$key1, this.$key2, new SuspendingPointerInputFilterKt$pointerInput$4$2$1(suspendingPointerInputFilter, this.$block, (C12074d<? super SuspendingPointerInputFilterKt$pointerInput$4$2$1>) null), composer, 4672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return suspendingPointerInputFilter;
    }
}
