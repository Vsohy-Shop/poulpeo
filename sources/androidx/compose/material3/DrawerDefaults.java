package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* compiled from: NavigationDrawer.kt */
public final class DrawerDefaults {
    public static final int $stable = 0;
    private static final float DismissibleDrawerElevation;
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();
    private static final float MaximumDrawerWidth;
    private static final float ModalDrawerElevation;
    private static final float PermanentDrawerElevation;

    static {
        NavigationDrawerTokens navigationDrawerTokens = NavigationDrawerTokens.INSTANCE;
        ModalDrawerElevation = navigationDrawerTokens.m35032getModalContainerElevationD9Ej5fM();
        PermanentDrawerElevation = navigationDrawerTokens.m35033getStandardContainerElevationD9Ej5fM();
        DismissibleDrawerElevation = navigationDrawerTokens.m35033getStandardContainerElevationD9Ej5fM();
        MaximumDrawerWidth = navigationDrawerTokens.m35030getContainerWidthD9Ej5fM();
    }

    private DrawerDefaults() {
    }

    @Composable
    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-1797317261);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1797317261, i, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:623)");
        }
        long color = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getDismissibleDrawerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34400getDismissibleDrawerElevationD9Ej5fM() {
        return DismissibleDrawerElevation;
    }

    /* renamed from: getMaximumDrawerWidth-D9Ej5fM  reason: not valid java name */
    public final float m34401getMaximumDrawerWidthD9Ej5fM() {
        return MaximumDrawerWidth;
    }

    /* renamed from: getModalDrawerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34402getModalDrawerElevationD9Ej5fM() {
        return ModalDrawerElevation;
    }

    /* renamed from: getPermanentDrawerElevation-D9Ej5fM  reason: not valid java name */
    public final float m34403getPermanentDrawerElevationD9Ej5fM() {
        return PermanentDrawerElevation;
    }

    @Composable
    public final long getScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(-1055074989);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055074989, i, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:620)");
        }
        long r0 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(928378975);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(928378975, i, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:616)");
        }
        Shape shape = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i) {
        composer.startReplaceableGroup(-909973510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-909973510, i, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:633)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets r5 = WindowInsetsKt.m33358onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m33372plusgK_yJZ4(companion.m33387getVerticalJoeWqyM(), companion.m33385getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r5;
    }
}
