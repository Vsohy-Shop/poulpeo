package androidx.compose.material3;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;

@ExperimentalMaterial3Api
@Stable
/* compiled from: Swipeable.kt */
public interface ThresholdConfig {
    float computeThreshold(Density density, float f, float f2);
}
