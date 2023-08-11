package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* compiled from: Scaffold.kt */
public final class ScaffoldDefaults {
    public static final int $stable = 0;
    public static final ScaffoldDefaults INSTANCE = new ScaffoldDefaults();

    private ScaffoldDefaults() {
    }

    @Composable
    public final WindowInsets getContentWindowInsets(Composer composer, int i) {
        composer.startReplaceableGroup(757124140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(757124140, i, -1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:282)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBarsForVisualComponents;
    }
}
