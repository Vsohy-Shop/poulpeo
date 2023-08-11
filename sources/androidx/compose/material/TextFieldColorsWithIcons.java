package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;

@ExperimentalMaterialApi
/* compiled from: TextFieldDefaults.kt */
public interface TextFieldColorsWithIcons extends TextFieldColors {

    /* compiled from: TextFieldDefaults.kt */
    public static final class DefaultImpls {
        @Deprecated
        @Composable
        public static State<Color> leadingIconColor(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
            C12775o.m28639i(interactionSource, "interactionSource");
            return TextFieldColorsWithIcons.super.leadingIconColor(z, z2, interactionSource, composer, i);
        }

        @Deprecated
        @Composable
        public static State<Color> trailingIconColor(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
            C12775o.m28639i(interactionSource, "interactionSource");
            return TextFieldColorsWithIcons.super.trailingIconColor(z, z2, interactionSource, composer, i);
        }
    }

    @Composable
    State<Color> leadingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1279189910);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1279189910, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)");
        }
        State<Color> leadingIconColor = leadingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return leadingIconColor;
    }

    @Composable
    State<Color> trailingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        C12775o.m28639i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-712140408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-712140408, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)");
        }
        State<Color> trailingIconColor = trailingIconColor(z, z2, composer, (i & 14) | (i & 112) | ((i >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trailingIconColor;
    }
}
