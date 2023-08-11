package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalFoundationApi
@Stable
/* compiled from: Pager.kt */
public interface PageSize {

    @StabilityInferred(parameters = 0)
    @ExperimentalFoundationApi
    /* compiled from: Pager.kt */
    public static final class Fill implements PageSize {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        public int calculateMainAxisPageSize(Density density, int i, int i2) {
            C12775o.m28639i(density, "<this>");
            return i;
        }
    }

    @StabilityInferred(parameters = 0)
    @ExperimentalFoundationApi
    /* compiled from: Pager.kt */
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        public /* synthetic */ Fixed(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        public int calculateMainAxisPageSize(Density density, int i, int i2) {
            C12775o.m28639i(density, "<this>");
            return density.m38443roundToPx0680j_4(this.pageSize);
        }

        /* renamed from: getPageSize-D9Ej5fM  reason: not valid java name */
        public final float m33583getPageSizeD9Ej5fM() {
            return this.pageSize;
        }

        private Fixed(float f) {
            this.pageSize = f;
        }
    }

    int calculateMainAxisPageSize(Density density, int i, int i2);
}
