package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,708:1\n135#2:709\n76#3:710\n76#3:711\n76#3:712\n83#4,3:713\n1057#5,6:716\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n76#1:709\n112#1:710\n114#1:711\n115#1:712\n116#1:713,3\n116#1:716,6\n*E\n"})
/* compiled from: WindowInsetsConnection.android.kt */
public final class WindowInsetsConnection_androidKt {
    /* access modifiers changed from: private */
    public static final double DecelMinusOne;
    /* access modifiers changed from: private */
    public static final double DecelerationRate;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1 */
    private static final float f233P1 = 0.175f;

    /* renamed from: P2 */
    private static final float f234P2 = 0.35000002f;
    /* access modifiers changed from: private */
    public static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
    private static final float StartTension = 0.5f;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = log;
        DecelMinusOne = log - 1.0d;
    }

    @ExperimentalLayoutApi
    public static final Modifier imeNestedScroll(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0469x91d9d996();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, WindowInsetsConnection_androidKt$imeNestedScroll$2.INSTANCE);
    }

    @ExperimentalLayoutApi
    @Composable
    /* renamed from: rememberWindowInsetsConnection-VRgvIgI  reason: not valid java name */
    public static final NestedScrollConnection m33355rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets androidWindowInsets, int i, Composer composer, int i2) {
        C12775o.m28639i(androidWindowInsets, "windowInsets");
        composer.startReplaceableGroup(-1011341039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, i2, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:104)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return doNothingNestedScrollConnection;
        }
        SideCalculator r7 = SideCalculator.Companion.m33313chooseCalculatorni1skBw(i, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {androidWindowInsets, view, r7, density};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, r7, density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) rememberedValue;
        EffectsKt.DisposableEffect((Object) windowInsetsNestedScrollConnection, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new C0471x76e50d25(windowInsetsNestedScrollConnection), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsNestedScrollConnection;
    }
}
