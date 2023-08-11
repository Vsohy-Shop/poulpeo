package androidx.compose.foundation.shape;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: CornerBasedShape.kt */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        C12775o.m28639i(cornerSize, "topStart");
        C12775o.m28639i(cornerSize2, "topEnd");
        C12775o.m28639i(cornerSize3, "bottomEnd");
        C12775o.m28639i(cornerSize4, "bottomStart");
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                cornerSize = cornerBasedShape.topStart;
            }
            if ((i & 2) != 0) {
                cornerSize2 = cornerBasedShape.topEnd;
            }
            if ((i & 4) != 0) {
                cornerSize3 = cornerBasedShape.bottomEnd;
            }
            if ((i & 8) != 0) {
                cornerSize4 = cornerBasedShape.bottomStart;
            }
            return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final CornerBasedShape copy(CornerSize cornerSize) {
        C12775o.m28639i(cornerSize, "all");
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0  reason: not valid java name */
    public abstract Outline m33608createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public final Outline m33609createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        boolean z;
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        float r3 = this.topStart.m33610toPxTmRCtEA(j, density);
        float r4 = this.topEnd.m33610toPxTmRCtEA(j, density);
        float r5 = this.bottomEnd.m33610toPxTmRCtEA(j, density);
        float r0 = this.bottomStart.m33610toPxTmRCtEA(j, density);
        float r6 = Size.m35490getMinDimensionimpl(j);
        float f = r3 + r0;
        if (f > r6) {
            float f2 = r6 / f;
            r3 *= f2;
            r0 *= f2;
        }
        float f3 = r0;
        float f4 = r4 + r5;
        if (f4 > r6) {
            float f5 = r6 / f4;
            r4 *= f5;
            r5 *= f5;
        }
        if (r3 < 0.0f || r4 < 0.0f || r5 < 0.0f || f3 < 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return m33608createOutlineLjSzlW0(j, r3, r4, r5, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + r3 + ", topEnd = " + r4 + ", bottomEnd = " + r5 + ", bottomStart = " + f3 + ")!").toString());
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
