package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.runtime.Stable;

@LazyGridScopeMarker
@Stable
/* compiled from: LazyGridItemScope.kt */
public interface LazyGridItemScope {
    static /* synthetic */ Modifier animateItemPlacement$default(LazyGridItemScope lazyGridItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
            }
            return lazyGridItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    @ExperimentalFoundationApi
    Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> finiteAnimationSpec);
}
