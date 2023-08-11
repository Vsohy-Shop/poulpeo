package androidx.compose.material;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;

@ExperimentalMaterialApi
@Stable
/* compiled from: Swipeable.kt */
public interface ThresholdConfig {
    float computeThreshold(Density density, float f, float f2);
}
