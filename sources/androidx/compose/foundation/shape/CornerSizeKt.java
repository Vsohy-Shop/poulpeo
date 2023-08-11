package androidx.compose.foundation.shape;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CornerSize.kt */
public final class CornerSizeKt {
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    @Stable
    public static final CornerSize CornerSize(float f) {
        return new PxCornerSize(f);
    }

    @Stable
    /* renamed from: CornerSize-0680j_4  reason: not valid java name */
    public static final CornerSize m33611CornerSize0680j_4(float f) {
        return new DpCornerSize(f, (DefaultConstructorMarker) null);
    }

    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }

    @Stable
    public static final CornerSize CornerSize(int i) {
        return new PercentCornerSize((float) i);
    }

    @Stable
    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }
}
