package androidx.compose.p002ui.node;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.MyersDiffKt */
/* compiled from: MyersDiff.kt */
public final class MyersDiffKt {
    private static final void applyDiff(int i, int i2, IntStack intStack, DiffCallback diffCallback) {
        while (intStack.isNotEmpty()) {
            int pop = intStack.pop();
            int pop2 = intStack.pop();
            int pop3 = intStack.pop();
            while (i > pop3) {
                i--;
                diffCallback.remove(i);
            }
            while (i2 > pop2) {
                i2--;
                diffCallback.insert(i, i2);
            }
            while (true) {
                int i3 = pop - 1;
                if (pop > 0) {
                    i--;
                    i2--;
                    diffCallback.same(i, i2);
                    pop = i3;
                }
            }
        }
        while (i > 0) {
            i--;
            diffCallback.remove(i);
        }
        while (i2 > 0) {
            i2--;
            diffCallback.insert(i, i2);
        }
    }

    /* renamed from: backward-4l5_RBY  reason: not valid java name */
    private static final boolean m37571backward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        int[] iArr4 = iArr2;
        int i12 = i5;
        int i13 = (i2 - i10) - (i4 - i11);
        if (i13 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && CenteredArray.m37455getimpl(iArr4, i15 + 1) < CenteredArray.m37455getimpl(iArr4, i15 - 1))) {
                i7 = CenteredArray.m37455getimpl(iArr4, i15 + 1);
                i6 = i7;
            } else {
                i7 = CenteredArray.m37455getimpl(iArr4, i15 - 1);
                i6 = i7 - 1;
            }
            int i16 = i4 - ((i2 - i6) - i15);
            if (i12 == 0 || i6 != i7) {
                i8 = i16;
            } else {
                i8 = i16 + 1;
            }
            while (true) {
                if (i6 > i10 && i16 > i11) {
                    if (!diffCallback.areItemsTheSame(i6 - 1, i16 - 1)) {
                        break;
                    }
                    i6--;
                    i16--;
                } else {
                    DiffCallback diffCallback2 = diffCallback;
                }
            }
            DiffCallback diffCallback22 = diffCallback;
            CenteredArray.m37458setimpl(iArr4, i15, i6);
            if (!z || (i9 = i13 - i15) < i14 || i9 > i12) {
                int[] iArr5 = iArr;
            } else if (CenteredArray.m37455getimpl(iArr, i9) >= i6) {
                fillSnake(i6, i16, i7, i8, true, iArr3);
                return true;
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        int i3 = i;
        int i4 = i2;
        int i5 = ((i3 + i4) + 1) / 2;
        IntStack intStack = new IntStack(i5 * 3);
        IntStack intStack2 = new IntStack(i5 * 4);
        intStack2.pushRange(0, i3, 0, i4);
        int i6 = (i5 * 2) + 1;
        int[] r6 = CenteredArray.m37452constructorimpl(new int[i6]);
        int[] r2 = CenteredArray.m37452constructorimpl(new int[i6]);
        int[] r15 = Snake.m37683constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int i7 = pop4;
            int i8 = pop3;
            int[] iArr = r6;
            int[] iArr2 = r6;
            int i9 = pop2;
            int[] iArr3 = r2;
            int[] iArr4 = r2;
            int i10 = pop;
            if (m37573midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, iArr, iArr3, r15)) {
                if (Snake.m37686getDiagonalSizeimpl(r15) > 0) {
                    Snake.m37681addDiagonalToStackimpl(r15, intStack);
                }
                intStack2.pushRange(i7, Snake.m37691getStartXimpl(r15), i9, Snake.m37692getStartYimpl(r15));
                intStack2.pushRange(Snake.m37687getEndXimpl(r15), i8, Snake.m37688getEndYimpl(r15), i10);
            }
            int i11 = i;
            r6 = iArr2;
            r2 = iArr4;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i4, 0);
        return intStack;
    }

    public static final void executeDiff(int i, int i2, DiffCallback diffCallback) {
        C12775o.m28639i(diffCallback, "callback");
        applyDiff(i, i2, calculateDiff(i, i2, diffCallback), diffCallback);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v0, types: [int[], java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void fillSnake(int r1, int r2, int r3, int r4, boolean r5, int[] r6) {
        /*
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            r0 = 0
            r6[r0] = r1
            r1 = 1
            r6[r1] = r2
            r1 = 2
            r6[r1] = r3
            r1 = 3
            r6[r1] = r4
            r1 = 4
            r6[r1] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.MyersDiffKt.fillSnake(int, int, int, int, boolean, int[]):void");
    }

    /* renamed from: forward-4l5_RBY  reason: not valid java name */
    private static final boolean m37572forward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i4;
        int[] iArr4 = iArr;
        int i12 = i5;
        int i13 = (i10 - i) - (i11 - i3);
        if (Math.abs(i13) % 2 == 1) {
            z = true;
        } else {
            z = false;
        }
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && CenteredArray.m37455getimpl(iArr4, i15 + 1) > CenteredArray.m37455getimpl(iArr4, i15 - 1))) {
                i7 = CenteredArray.m37455getimpl(iArr4, i15 + 1);
                i6 = i7;
            } else {
                i7 = CenteredArray.m37455getimpl(iArr4, i15 - 1);
                i6 = i7 + 1;
            }
            int i16 = (i3 + (i6 - i)) - i15;
            if (i12 == 0 || i6 != i7) {
                i8 = i16;
            } else {
                i8 = i16 - 1;
            }
            while (true) {
                if (i6 < i10 && i16 < i11) {
                    if (!diffCallback.areItemsTheSame(i6, i16)) {
                        break;
                    }
                    i6++;
                    i16++;
                } else {
                    DiffCallback diffCallback2 = diffCallback;
                }
            }
            DiffCallback diffCallback22 = diffCallback;
            CenteredArray.m37458setimpl(iArr4, i15, i6);
            if (!z || (i9 = i13 - i15) < i14 + 1 || i9 > i12 - 1) {
                int[] iArr5 = iArr2;
            } else if (CenteredArray.m37455getimpl(iArr2, i9) <= i6) {
                fillSnake(i7, i8, i6, i16, false, iArr3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI  reason: not valid java name */
    private static final boolean m37573midPointq5eDKzI(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i;
        int i6 = i2;
        int i7 = i6 - i5;
        int i8 = i4 - i3;
        if (i7 >= 1 && i8 >= 1) {
            int i9 = ((i7 + i8) + 1) / 2;
            CenteredArray.m37458setimpl(iArr, 1, i5);
            CenteredArray.m37458setimpl(iArr2, 1, i6);
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10;
                if (m37572forward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i10, iArr3) || m37571backward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i11, iArr3)) {
                    return true;
                }
                i10 = i11 + 1;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
