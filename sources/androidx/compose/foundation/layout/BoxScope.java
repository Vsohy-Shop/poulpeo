package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
@LayoutScopeMarker
/* compiled from: Box.kt */
public interface BoxScope {
    @Stable
    Modifier align(Modifier modifier, Alignment alignment);

    @Stable
    Modifier matchParentSize(Modifier modifier);
}
