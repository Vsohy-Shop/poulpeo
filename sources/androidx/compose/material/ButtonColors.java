package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@Stable
/* compiled from: Button.kt */
public interface ButtonColors {
    @Composable
    State<Color> backgroundColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> contentColor(boolean z, Composer composer, int i);
}
