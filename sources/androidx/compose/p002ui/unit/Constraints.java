package androidx.compose.p002ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.unit.Constraints */
/* compiled from: Constraints.kt */
public final class Constraints {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long FocusMask = 3;
    private static final int[] HeightMask = {MinNonFocusMask, MaxNonFocusMask, 65535, MaxFocusMask};
    public static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxFocusBits = 18;
    private static final long MaxFocusHeight = 3;
    private static final int MaxFocusMask = 262143;
    private static final long MaxFocusWidth = 1;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final long MinFocusHeight = 2;
    private static final int MinFocusMask = 65535;
    private static final long MinFocusWidth = 0;
    /* access modifiers changed from: private */
    public static final int[] MinHeightOffsets = {18, 20, 17, 15};
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;
    private static final int[] WidthMask = {65535, MaxFocusMask, MinNonFocusMask, MaxNonFocusMask};
    private final long value;

    /* renamed from: androidx.compose.ui.unit.Constraints$Companion */
    /* compiled from: Constraints.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int bitsNeedForSize(int i) {
            if (i < Constraints.MaxNonFocusMask) {
                return 13;
            }
            if (i < Constraints.MinNonFocusMask) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < Constraints.MaxFocusMask) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release  reason: not valid java name */
        public final long m38419createConstraintsZbe2FdA$ui_unit_release(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            long j;
            int i7;
            if (i4 == Integer.MAX_VALUE) {
                i5 = i3;
            } else {
                i5 = i4;
            }
            int bitsNeedForSize = bitsNeedForSize(i5);
            if (i2 == Integer.MAX_VALUE) {
                i6 = i;
            } else {
                i6 = i2;
            }
            int bitsNeedForSize2 = bitsNeedForSize(i6);
            if (bitsNeedForSize + bitsNeedForSize2 <= 31) {
                if (bitsNeedForSize2 == 13) {
                    j = 3;
                } else if (bitsNeedForSize2 == 18) {
                    j = 1;
                } else if (bitsNeedForSize2 == 15) {
                    j = Constraints.MinFocusHeight;
                } else if (bitsNeedForSize2 == 16) {
                    j = 0;
                } else {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                int i8 = 0;
                if (i2 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i2 + 1;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i8 = i4 + 1;
                }
                int i9 = Constraints.MinHeightOffsets[(int) j];
                return Constraints.m38401constructorimpl((((long) i7) << 33) | j | (((long) i) << Constraints.MinFocusHeight) | (((long) i3) << i9) | (((long) i8) << (i9 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }

        @Stable
        /* renamed from: fixed-JhjzzOo  reason: not valid java name */
        public final long m38420fixedJhjzzOo(int i, int i2) {
            boolean z;
            if (i < 0 || i2 < 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return m38419createConstraintsZbe2FdA$ui_unit_release(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s  reason: not valid java name */
        public final long m38421fixedHeightOenEA2s(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return m38419createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, i, i);
            }
            throw new IllegalArgumentException(("height(" + i + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s  reason: not valid java name */
        public final long m38422fixedWidthOenEA2s(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return m38419createConstraintsZbe2FdA$ui_unit_release(i, i, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Constraints m38400boximpl(long j) {
        return new Constraints(j);
    }

    /* renamed from: copy-Zbe2FdA  reason: not valid java name */
    public static final long m38402copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i3 < 0 || i < 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i4 < i3 && i4 != Integer.MAX_VALUE) {
                    z3 = false;
                }
                if (z3) {
                    return Companion.m38419createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }

    /* renamed from: copy-Zbe2FdA$default  reason: not valid java name */
    public static /* synthetic */ long m38403copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m38414getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m38412getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m38413getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m38411getMaxHeightimpl(j);
        }
        return m38402copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38404equalsimpl(long j, Object obj) {
        if ((obj instanceof Constraints) && j == ((Constraints) obj).m38418unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38405equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getFocusIndex-impl  reason: not valid java name */
    private static final int m38406getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* renamed from: getHasBoundedHeight-impl  reason: not valid java name */
    public static final boolean m38407getHasBoundedHeightimpl(long j) {
        int r0 = m38406getFocusIndeximpl(j);
        if ((((int) (j >> (MinHeightOffsets[r0] + 31))) & HeightMask[r0]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getHasBoundedWidth-impl  reason: not valid java name */
    public static final boolean m38408getHasBoundedWidthimpl(long j) {
        if ((((int) (j >> 33)) & WidthMask[m38406getFocusIndeximpl(j)]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getHasFixedHeight-impl  reason: not valid java name */
    public static final boolean m38409getHasFixedHeightimpl(long j) {
        if (m38411getMaxHeightimpl(j) == m38413getMinHeightimpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getHasFixedWidth-impl  reason: not valid java name */
    public static final boolean m38410getHasFixedWidthimpl(long j) {
        if (m38412getMaxWidthimpl(j) == m38414getMinWidthimpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getMaxHeight-impl  reason: not valid java name */
    public static final int m38411getMaxHeightimpl(long j) {
        int r0 = m38406getFocusIndeximpl(j);
        int i = ((int) (j >> (MinHeightOffsets[r0] + 31))) & HeightMask[r0];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getMaxWidth-impl  reason: not valid java name */
    public static final int m38412getMaxWidthimpl(long j) {
        int i = ((int) (j >> 33)) & WidthMask[m38406getFocusIndeximpl(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: getMinHeight-impl  reason: not valid java name */
    public static final int m38413getMinHeightimpl(long j) {
        int r0 = m38406getFocusIndeximpl(j);
        return ((int) (j >> MinHeightOffsets[r0])) & HeightMask[r0];
    }

    /* renamed from: getMinWidth-impl  reason: not valid java name */
    public static final int m38414getMinWidthimpl(long j) {
        return ((int) (j >> MinFocusHeight)) & WidthMask[m38406getFocusIndeximpl(j)];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38415hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isZero-impl  reason: not valid java name */
    public static final boolean m38416isZeroimpl(long j) {
        if (m38412getMaxWidthimpl(j) == 0 || m38411getMaxHeightimpl(j) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38417toStringimpl(long j) {
        String str;
        int r0 = m38412getMaxWidthimpl(j);
        String str2 = "Infinity";
        if (r0 == Integer.MAX_VALUE) {
            str = str2;
        } else {
            str = String.valueOf(r0);
        }
        int r3 = m38411getMaxHeightimpl(j);
        if (r3 != Integer.MAX_VALUE) {
            str2 = String.valueOf(r3);
        }
        return "Constraints(minWidth = " + m38414getMinWidthimpl(j) + ", maxWidth = " + str + ", minHeight = " + m38413getMinHeightimpl(j) + ", maxHeight = " + str2 + ')';
    }

    public boolean equals(Object obj) {
        return m38404equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38415hashCodeimpl(this.value);
    }

    public String toString() {
        return m38417toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m38418unboximpl() {
        return this.value;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m38401constructorimpl(long j) {
        return j;
    }
}
