package androidx.compose.foundation.layout;

import kotlin.jvm.internal.C12775o;

/* compiled from: RowColumnMeasurementHelper.kt */
public final class RowColumnMeasureHelperResult {
    private final int beforeCrossAxisAlignmentLine;
    private final int crossAxisSize;
    private final int endIndex;
    private final int[] mainAxisPositions;
    private final int mainAxisSize;
    private final int startIndex;

    public RowColumnMeasureHelperResult(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C12775o.m28639i(iArr, "mainAxisPositions");
        this.crossAxisSize = i;
        this.mainAxisSize = i2;
        this.startIndex = i3;
        this.endIndex = i4;
        this.beforeCrossAxisAlignmentLine = i5;
        this.mainAxisPositions = iArr;
    }

    public final int getBeforeCrossAxisAlignmentLine() {
        return this.beforeCrossAxisAlignmentLine;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int[] getMainAxisPositions() {
        return this.mainAxisPositions;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}
