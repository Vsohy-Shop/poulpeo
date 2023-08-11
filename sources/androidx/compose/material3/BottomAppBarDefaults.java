package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.FabSecondaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* compiled from: AppBar.kt */
public final class BottomAppBarDefaults {
    public static final int $stable = 0;
    private static final float ContainerElevation = BottomAppBarTokens.INSTANCE.m34778getContainerElevationD9Ej5fM();
    private static final PaddingValues ContentPadding = PaddingKt.m33265PaddingValuesa9UjIt4$default(AppBarKt.BottomAppBarHorizontalPadding, AppBarKt.getBottomAppBarVerticalPadding(), AppBarKt.BottomAppBarHorizontalPadding, 0.0f, 8, (Object) null);
    public static final BottomAppBarDefaults INSTANCE = new BottomAppBarDefaults();

    private BottomAppBarDefaults() {
    }

    @Composable
    public final long getBottomAppBarFabColor(Composer composer, int i) {
        composer.startReplaceableGroup(-1464561486);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464561486, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:959)");
        }
        long color = ColorSchemeKt.toColor(FabSecondaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-368340078);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-368340078, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:932)");
        }
        long color = ColorSchemeKt.toColor(BottomAppBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34266getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i) {
        composer.startReplaceableGroup(688896409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688896409, i, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:952)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets r5 = WindowInsetsKt.m33358onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m33372plusgK_yJZ4(companion.m33382getHorizontalJoeWqyM(), companion.m33380getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r5;
    }
}
