package androidx.compose.foundation.lazy.grid;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
/* compiled from: LazyGridDsl.kt */
public interface GridCells {

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,493:1\n154#2:494\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n272#1:494\n*E\n"})
    /* compiled from: LazyGridDsl.kt */
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        public List<Integer> calculateCrossAxisCellSizes(Density density, int i, int i2) {
            C12775o.m28639i(density, "<this>");
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i, Math.max((i + i2) / (density.m38443roundToPx0680j_4(this.minSize) + i2), 1), i2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Adaptive) || !C1232Dp.m38473equalsimpl0(this.minSize, ((Adaptive) obj).minSize)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C1232Dp.m38474hashCodeimpl(this.minSize);
        }

        private Adaptive(float f) {
            this.minSize = f;
            if (!(C1232Dp.m38467compareTo0680j_4(f, C1232Dp.m38468constructorimpl((float) 0)) > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: LazyGridDsl.kt */
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i) {
            boolean z;
            this.count = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public List<Integer> calculateCrossAxisCellSizes(Density density, int i, int i2) {
            C12775o.m28639i(density, "<this>");
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i, this.count, i2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Fixed) || this.count != ((Fixed) obj).count) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    List<Integer> calculateCrossAxisCellSizes(Density density, int i, int i2);
}
