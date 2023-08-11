package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,162:1\n135#2:163\n135#2:164\n76#3:165\n50#4:166\n49#4:167\n1114#5,6:168\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n45#1:163\n66#1:164\n80#1:165\n81#1:166\n81#1:167\n81#1:168,6\n*E\n"})
/* compiled from: SystemGestureExclusion.kt */
public final class SystemGestureExclusionKt {
    @RequiresApi(29)
    @Composable
    private static final Modifier excludeFromSystemGestureQ(Function1<? super LayoutCoordinates, Rect> function1, Composer composer, int i) {
        composer.startReplaceableGroup(1687674107);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed((Object) view) | composer.changed((Object) function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ExcludeFromSystemGestureModifier(view, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier = (ExcludeFromSystemGestureModifier) rememberedValue;
        EffectsKt.DisposableEffect((Object) excludeFromSystemGestureModifier, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new SystemGestureExclusionKt$excludeFromSystemGestureQ$1(excludeFromSystemGestureModifier), composer, 0);
        composer.endReplaceableGroup();
        return excludeFromSystemGestureModifier;
    }

    public static final Modifier systemGestureExclusion(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C0389x96d1b9f3() : InspectableValueKt.getNoInspectorInfo(), SystemGestureExclusionKt$systemGestureExclusion$2.INSTANCE);
    }

    public static final Modifier systemGestureExclusion(Modifier modifier, Function1<? super LayoutCoordinates, Rect> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "exclusion");
        if (Build.VERSION.SDK_INT < 29) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C0390x96d1b9f4(function1) : InspectableValueKt.getNoInspectorInfo(), new SystemGestureExclusionKt$systemGestureExclusion$4(function1));
    }
}
