package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@Stable
/* compiled from: TextFieldDefaults.kt */
public interface TextFieldColors {
    @Composable
    State<Color> backgroundColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> cursorColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    @Composable
    State<Color> labelColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    @Composable
    State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i);

    @Composable
    State<Color> placeholderColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> textColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> trailingIconColor(boolean z, boolean z2, Composer composer, int i);
}
