package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;

@ExperimentalMaterialApi
/* compiled from: Chip.kt */
public interface SelectableChipColors {
    @Composable
    State<Color> backgroundColor(boolean z, boolean z2, Composer composer, int i);

    @Composable
    State<Color> contentColor(boolean z, boolean z2, Composer composer, int i);

    @Composable
    State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i);
}
