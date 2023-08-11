package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Stable;

/* renamed from: androidx.compose.ui.unit.DensityKt */
/* compiled from: Density.kt */
public final class DensityKt {
    @Stable
    public static final Density Density(float f, float f2) {
        return new DensityImpl(f, f2);
    }

    public static /* synthetic */ Density Density$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return Density(f, f2);
    }
}
