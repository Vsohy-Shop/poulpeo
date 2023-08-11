package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* compiled from: Snackbar.kt */
public final class SnackbarDefaults {
    public static final int $stable = 0;
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();
    private static final float SnackbarOverlayAlpha = 0.8f;

    private SnackbarDefaults() {
    }

    @Composable
    public final long getBackgroundColor(Composer composer, int i) {
        composer.startReplaceableGroup(1630911716);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630911716, i, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:200)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        long r0 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(materialTheme.getColors(composer, 6).m33951getOnSurface0d7_KjU(), SnackbarOverlayAlpha, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.getColors(composer, 6).m33956getSurface0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    public final long getPrimaryActionColor(Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-810329402);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810329402, i, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (colors.isLight()) {
            j = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(colors.m33956getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), colors.m33952getPrimary0d7_KjU());
        } else {
            j = colors.m33953getPrimaryVariant0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
