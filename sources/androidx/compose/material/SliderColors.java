package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@Stable
/* compiled from: Slider.kt */
public interface SliderColors {
    @Composable
    State<Color> thumbColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> tickColor(boolean z, boolean z2, Composer composer, int i);

    @Composable
    State<Color> trackColor(boolean z, boolean z2, Composer composer, int i);
}
