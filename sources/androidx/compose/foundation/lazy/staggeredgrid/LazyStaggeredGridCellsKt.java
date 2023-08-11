package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyStaggeredGridCells.kt */
public final class LazyStaggeredGridCellsKt {
    /* access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4;
        int i5 = i - (i3 * (i2 - 1));
        int i6 = i5 / i2;
        int i7 = i5 % i2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i8 = 0; i8 < i2; i8++) {
            if (i8 < i7) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            arrayList.add(Integer.valueOf(i4 + i6));
        }
        return arrayList;
    }
}
