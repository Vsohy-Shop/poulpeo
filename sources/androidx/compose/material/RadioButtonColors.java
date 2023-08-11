package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@Stable
/* compiled from: RadioButton.kt */
public interface RadioButtonColors {
    @Composable
    State<Color> radioColor(boolean z, boolean z2, Composer composer, int i);
}
