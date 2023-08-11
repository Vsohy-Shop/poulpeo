package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
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

@SourceDebugExtension({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$systemGestureExclusion$2\n+ 2 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,162:1\n80#2:163\n81#2:165\n82#2:174\n76#3:164\n50#4:166\n49#4:167\n1114#5,6:168\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$systemGestureExclusion$2\n*L\n48#1:163\n48#1:165\n48#1:174\n48#1:164\n48#1:166\n48#1:167\n48#1:168,6\n*E\n"})
/* compiled from: SystemGestureExclusion.kt */
final class SystemGestureExclusionKt$systemGestureExclusion$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    public static final SystemGestureExclusionKt$systemGestureExclusion$2 INSTANCE = new SystemGestureExclusionKt$systemGestureExclusion$2();

    SystemGestureExclusionKt$systemGestureExclusion$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(1120057036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1120057036, i, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:46)");
        }
        composer.startReplaceableGroup(1687674107);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed((Object) view) | composer.changed((Object) null);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ExcludeFromSystemGestureModifier(view, (Function1<? super LayoutCoordinates, Rect>) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier = (ExcludeFromSystemGestureModifier) rememberedValue;
        EffectsKt.DisposableEffect((Object) excludeFromSystemGestureModifier, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new SystemGestureExclusionKt$excludeFromSystemGestureQ$1(excludeFromSystemGestureModifier), composer, 0);
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return excludeFromSystemGestureModifier;
    }
}
