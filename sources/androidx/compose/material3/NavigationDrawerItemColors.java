package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

@ExperimentalMaterial3Api
@Stable
/* compiled from: NavigationDrawer.kt */
public interface NavigationDrawerItemColors {
    @Composable
    State<Color> badgeColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> containerColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> iconColor(boolean z, Composer composer, int i);

    @Composable
    State<Color> textColor(boolean z, Composer composer, int i);
}
