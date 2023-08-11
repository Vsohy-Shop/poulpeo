package androidx.compose.p002ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.IntStack */
/* compiled from: MyersDiff.kt */
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i) {
        this.stack = new int[i];
    }

    private final boolean compareDiagonal(int i, int i2) {
        int[] iArr = this.stack;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 < i4) {
            return true;
        }
        if (i3 != i4 || iArr[i + 1] > iArr[i2 + 1]) {
            return false;
        }
        return true;
    }

    private final int partition(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (compareDiagonal(i, i2)) {
                i4 += i3;
                swapDiagonal(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        swapDiagonal(i5, i2);
        return i5;
    }

    private final void quickSort(int i, int i2, int i3) {
        if (i < i2) {
            int partition = partition(i, i2, i3);
            quickSort(i, partition - i3, i3);
            quickSort(partition + i3, i2, i3);
        }
    }

    private final void swapDiagonal(int i, int i2) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i, i2);
        MyersDiffKt.swap(iArr, i + 1, i2 + 1);
        MyersDiffKt.swap(iArr, i + 2, i2 + 2);
    }

    public final boolean isNotEmpty() {
        if (this.lastIndex != 0) {
            return true;
        }
        return false;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i = this.lastIndex - 1;
        this.lastIndex = i;
        return iArr[i];
    }

    public final void pushDiagonal(int i, int i2, int i3) {
        int i4 = this.lastIndex;
        int i5 = i4 + 3;
        int[] iArr = this.stack;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i4 + 0] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.lastIndex = i5;
    }

    public final void pushRange(int i, int i2, int i3, int i4) {
        int i5 = this.lastIndex;
        int i6 = i5 + 4;
        int[] iArr = this.stack;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i5 + 0] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.lastIndex = i6;
    }

    public final void sortDiagonals() {
        boolean z;
        int i = this.lastIndex;
        if (i % 3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i > 3) {
            quickSort(0, i - 3, 3);
        }
    }
}
