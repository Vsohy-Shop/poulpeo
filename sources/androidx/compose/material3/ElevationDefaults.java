package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.C12775o;

/* compiled from: Elevation.kt */
final class ElevationDefaults {
    public static final ElevationDefaults INSTANCE = new ElevationDefaults();

    private ElevationDefaults() {
    }

    public final AnimationSpec<C1232Dp> incomingAnimationSpecForInteraction(Interaction interaction) {
        C12775o.m28639i(interaction, "interaction");
        if (interaction instanceof PressInteraction.Press) {
            return ElevationKt.DefaultIncomingSpec;
        }
        if (interaction instanceof DragInteraction.Start) {
            return ElevationKt.DefaultIncomingSpec;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return ElevationKt.DefaultIncomingSpec;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return ElevationKt.DefaultIncomingSpec;
        }
        return null;
    }

    public final AnimationSpec<C1232Dp> outgoingAnimationSpecForInteraction(Interaction interaction) {
        C12775o.m28639i(interaction, "interaction");
        if (interaction instanceof PressInteraction.Press) {
            return ElevationKt.DefaultOutgoingSpec;
        }
        if (interaction instanceof DragInteraction.Start) {
            return ElevationKt.DefaultOutgoingSpec;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return ElevationKt.HoveredOutgoingSpec;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return ElevationKt.DefaultOutgoingSpec;
        }
        return null;
    }
}
