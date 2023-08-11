package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;

@Stable
/* compiled from: Indication.kt */
public interface Indication {
    @Composable
    IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i);
}
