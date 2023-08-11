package androidx.compose.material3;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: TouchTarget.kt */
public final class TouchTargetKt {
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumTouchTargetEnforcement = CompositionLocalKt.staticCompositionLocalOf(TouchTargetKt$LocalMinimumTouchTargetEnforcement$1.INSTANCE);

    @ExperimentalMaterial3Api
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }

    public static final Modifier minimumTouchTargetSize(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0931x122440a6();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, TouchTargetKt$minimumTouchTargetSize$2.INSTANCE);
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }
}
