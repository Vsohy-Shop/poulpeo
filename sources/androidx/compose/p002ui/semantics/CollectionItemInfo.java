package androidx.compose.p002ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.CollectionItemInfo */
/* compiled from: SemanticsProperties.kt */
public final class CollectionItemInfo {
    public static final int $stable = 0;
    private final int columnIndex;
    private final int columnSpan;
    private final int rowIndex;
    private final int rowSpan;

    public CollectionItemInfo(int i, int i2, int i3, int i4) {
        this.rowIndex = i;
        this.rowSpan = i2;
        this.columnIndex = i3;
        this.columnSpan = i4;
    }

    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public final int getColumnSpan() {
        return this.columnSpan;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }
}
