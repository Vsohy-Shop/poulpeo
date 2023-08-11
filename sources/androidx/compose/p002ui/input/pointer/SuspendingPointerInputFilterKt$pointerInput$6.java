package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.internal.C12768j0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt$pointerInput$6\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,643:1\n76#2:644\n76#2:645\n36#3:646\n1114#4,6:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt$pointerInput$6\n*L\n332#1:644\n333#1:645\n334#1:646\n334#1:647,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6 */
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilterKt$pointerInput$6 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ C13088o<PointerInputScope, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ Object[] $keys;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilterKt$pointerInput$6(Object[] objArr, C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        super(3);
        this.$keys = objArr;
        this.$block = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(664422852);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(664422852, i, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:330)");
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
        Object[] objArr = this.$keys;
        C13088o<PointerInputScope, C12074d<? super C11921v>, Object> oVar = this.$block;
        SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) rememberedValue;
        C12768j0 j0Var = new C12768j0(2);
        j0Var.mo50668a(suspendingPointerInputFilter);
        j0Var.mo50669b(objArr);
        EffectsKt.LaunchedEffect(j0Var.mo50671d(new Object[j0Var.mo50670c()]), (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SuspendingPointerInputFilterKt$pointerInput$6$2$1(suspendingPointerInputFilter, oVar, (C12074d<? super SuspendingPointerInputFilterKt$pointerInput$6$2$1>) null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return suspendingPointerInputFilter;
    }
}
