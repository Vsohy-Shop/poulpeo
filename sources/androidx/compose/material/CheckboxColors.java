package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@Stable
/* compiled from: Checkbox.kt */
public interface CheckboxColors {
    @Composable
    State<Color> borderColor(boolean z, ToggleableState toggleableState, Composer composer, int i);

    @Composable
    State<Color> boxColor(boolean z, ToggleableState toggleableState, Composer composer, int i);

    @Composable
    State<Color> checkmarkColor(ToggleableState toggleableState, Composer composer, int i);
}
