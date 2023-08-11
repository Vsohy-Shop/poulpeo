package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: TextFieldDefaults.kt */
public final class TextFieldDefaultsKt {
    /* access modifiers changed from: private */
    @Composable
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q  reason: not valid java name */
    public static final State<BorderStroke> m34666animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        float f3;
        State<C1232Dp> state;
        Composer composer2 = composer;
        int i2 = i;
        composer.startReplaceableGroup(-1633063017);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1633063017, i2, -1, "androidx.compose.material3.animateBorderStrokeAsState (TextFieldDefaults.kt:943)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i2 >> 6) & 14);
        TextFieldColors textFieldColors2 = textFieldColors;
        boolean z3 = z;
        boolean z4 = z2;
        State<Color> indicatorColor$material3_release = textFieldColors2.indicatorColor$material3_release(z3, z4, interactionSource, composer, (i2 & 14) | (i2 & 112) | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i2 & 7168));
        if (m34667animateBorderStrokeAsState_NuRrP5Q$lambda0(collectIsFocusedAsState)) {
            f3 = f;
        } else {
            f3 = f2;
        }
        if (z) {
            composer.startReplaceableGroup(-1927801001);
            state = AnimateAsStateKt.m32888animateDpAsStateKz89ssw(f3, AnimationSpecKt.tween$default(150, 0, (Easing) null, 6, (Object) null), (Function1<? super C1232Dp, C11921v>) null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1927800903);
            state = SnapshotStateKt.rememberUpdatedState(C1232Dp.m38466boximpl(f2), composer, (i2 >> 15) & 14);
            composer.endReplaceableGroup();
        }
        State<BorderStroke> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new BorderStroke(state.getValue().m38482unboximpl(), new SolidColor(indicatorColor$material3_release.getValue().m35681unboximpl(), (DefaultConstructorMarker) null), (DefaultConstructorMarker) null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    /* renamed from: animateBorderStrokeAsState_NuRrP5Q$lambda-0  reason: not valid java name */
    private static final boolean m34667animateBorderStrokeAsState_NuRrP5Q$lambda0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
