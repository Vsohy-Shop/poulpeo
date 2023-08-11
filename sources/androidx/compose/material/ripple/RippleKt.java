package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,355:1\n50#2:356\n49#2:357\n1057#3,6:358\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n83#1:356\n83#1:357\n83#1:358,6\n*E\n"})
/* compiled from: Ripple.kt */
public final class RippleKt {
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec(15, 0, EasingKt.getLinearEasing(), 2, (DefaultConstructorMarker) null);

    /* access modifiers changed from: private */
    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        if (interaction instanceof HoverInteraction.Enter) {
            return DefaultTweenSpec;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, (DefaultConstructorMarker) null);
        }
        if (interaction instanceof DragInteraction.Start) {
            return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, (DefaultConstructorMarker) null);
        }
        return DefaultTweenSpec;
    }

    /* access modifiers changed from: private */
    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        if (interaction instanceof HoverInteraction.Enter) {
            return DefaultTweenSpec;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return DefaultTweenSpec;
        }
        if (interaction instanceof DragInteraction.Start) {
            return new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, (DefaultConstructorMarker) null);
        }
        return DefaultTweenSpec;
    }

    @Composable
    /* renamed from: rememberRipple-9IZ8Weo  reason: not valid java name */
    public static final Indication m34235rememberRipple9IZ8Weo(boolean z, float f, long j, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j = Color.Companion.m35707getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:76)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, (i >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z);
        C1232Dp r7 = C1232Dp.m38466boximpl(f);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed((Object) valueOf) | composer.changed((Object) r7);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PlatformRipple(z, f, rememberUpdatedState, (DefaultConstructorMarker) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PlatformRipple platformRipple = (PlatformRipple) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return platformRipple;
    }
}
