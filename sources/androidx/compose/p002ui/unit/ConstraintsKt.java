package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Stable;

/* renamed from: androidx.compose.ui.unit.ConstraintsKt */
/* compiled from: Constraints.kt */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i4 >= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i < 0 || i3 < 0) {
                    z3 = false;
                }
                if (z3) {
                    return Constraints.Companion.m38419createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        return C13537l.m30877d(i + i2, 0);
    }

    @Stable
    /* renamed from: constrain-4WqzIAM  reason: not valid java name */
    public static final long m38423constrain4WqzIAM(long j, long j2) {
        return IntSizeKt.IntSize(C13537l.m30886m(IntSize.m38628getWidthimpl(j2), Constraints.m38414getMinWidthimpl(j), Constraints.m38412getMaxWidthimpl(j)), C13537l.m30886m(IntSize.m38627getHeightimpl(j2), Constraints.m38413getMinHeightimpl(j), Constraints.m38411getMaxHeightimpl(j)));
    }

    /* renamed from: constrain-N9IONVI  reason: not valid java name */
    public static final long m38424constrainN9IONVI(long j, long j2) {
        return Constraints(C13537l.m30886m(Constraints.m38414getMinWidthimpl(j2), Constraints.m38414getMinWidthimpl(j), Constraints.m38412getMaxWidthimpl(j)), C13537l.m30886m(Constraints.m38412getMaxWidthimpl(j2), Constraints.m38414getMinWidthimpl(j), Constraints.m38412getMaxWidthimpl(j)), C13537l.m30886m(Constraints.m38413getMinHeightimpl(j2), Constraints.m38413getMinHeightimpl(j), Constraints.m38411getMaxHeightimpl(j)), C13537l.m30886m(Constraints.m38411getMaxHeightimpl(j2), Constraints.m38413getMinHeightimpl(j), Constraints.m38411getMaxHeightimpl(j)));
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final int m38425constrainHeightK40F9xA(long j, int i) {
        return C13537l.m30886m(i, Constraints.m38413getMinHeightimpl(j), Constraints.m38411getMaxHeightimpl(j));
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final int m38426constrainWidthK40F9xA(long j, int i) {
        return C13537l.m30886m(i, Constraints.m38414getMinWidthimpl(j), Constraints.m38412getMaxWidthimpl(j));
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM  reason: not valid java name */
    public static final boolean m38427isSatisfiedBy4WqzIAM(long j, long j2) {
        boolean z;
        boolean z2;
        int r0 = Constraints.m38414getMinWidthimpl(j);
        int r1 = Constraints.m38412getMaxWidthimpl(j);
        int r2 = IntSize.m38628getWidthimpl(j2);
        if (r0 > r2 || r2 > r1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int r02 = Constraints.m38413getMinHeightimpl(j);
            int r5 = Constraints.m38411getMaxHeightimpl(j);
            int r6 = IntSize.m38627getHeightimpl(j2);
            if (r02 > r6 || r6 > r5) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U  reason: not valid java name */
    public static final long m38428offsetNN6EwU(long j, int i, int i2) {
        return Constraints(C13537l.m30877d(Constraints.m38414getMinWidthimpl(j) + i, 0), addMaxWithMinimum(Constraints.m38412getMaxWidthimpl(j), i), C13537l.m30877d(Constraints.m38413getMinHeightimpl(j) + i2, 0), addMaxWithMinimum(Constraints.m38411getMaxHeightimpl(j), i2));
    }

    /* renamed from: offset-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ long m38429offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m38428offsetNN6EwU(j, i, i2);
    }
}
