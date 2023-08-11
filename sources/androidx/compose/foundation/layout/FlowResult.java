package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.C12775o;

/* compiled from: FlowLayout.kt */
public final class FlowResult {
    private final int crossAxisTotalSize;
    private final MutableVector<RowColumnMeasureHelperResult> items;
    private final int mainAxisTotalSize;

    public FlowResult(int i, int i2, MutableVector<RowColumnMeasureHelperResult> mutableVector) {
        C12775o.m28639i(mutableVector, "items");
        this.mainAxisTotalSize = i;
        this.crossAxisTotalSize = i2;
        this.items = mutableVector;
    }

    public final int getCrossAxisTotalSize() {
        return this.crossAxisTotalSize;
    }

    public final MutableVector<RowColumnMeasureHelperResult> getItems() {
        return this.items;
    }

    public final int getMainAxisTotalSize() {
        return this.mainAxisTotalSize;
    }
}
