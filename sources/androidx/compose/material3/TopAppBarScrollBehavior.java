package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.runtime.Stable;

@ExperimentalMaterial3Api
@Stable
/* compiled from: AppBar.kt */
public interface TopAppBarScrollBehavior {
    DecayAnimationSpec<Float> getFlingAnimationSpec();

    NestedScrollConnection getNestedScrollConnection();

    AnimationSpec<Float> getSnapAnimationSpec();

    TopAppBarState getState();

    boolean isPinned();
}
