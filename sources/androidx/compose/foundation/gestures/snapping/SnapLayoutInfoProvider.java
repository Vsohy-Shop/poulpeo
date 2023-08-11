package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.unit.Density;
import p436tf.C13522b;

@ExperimentalFoundationApi
/* compiled from: SnapLayoutInfoProvider.kt */
public interface SnapLayoutInfoProvider {
    float calculateApproachOffset(Density density, float f);

    float calculateSnapStepSize(Density density);

    C13522b<Float> calculateSnappingOffsetBounds(Density density);
}
