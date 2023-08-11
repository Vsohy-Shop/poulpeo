package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@Stable
/* compiled from: Button.kt */
public interface ButtonElevation {
    @Composable
    State<C1232Dp> elevation(boolean z, InteractionSource interactionSource, Composer composer, int i);
}
