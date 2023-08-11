package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@ExperimentalMaterialApi
@Stable
/* compiled from: Chip.kt */
public interface ChipColors {
    @Composable
    State<Color> backgroundColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> contentColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> leadingIconContentColor(boolean z, Composer composer, int i);
}
