package androidx.compose.p002ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.Snake */
/* compiled from: MyersDiff.kt */
final class Snake {
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl  reason: not valid java name */
    public static final void m37681addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        C12775o.m28639i(intStack, "diagonals");
        if (!m37689getHasAdditionOrRemovalimpl(iArr)) {
            intStack.pushDiagonal(m37691getStartXimpl(iArr), m37692getStartYimpl(iArr), m37687getEndXimpl(iArr) - m37691getStartXimpl(iArr));
        } else if (m37690getReverseimpl(iArr)) {
            intStack.pushDiagonal(m37691getStartXimpl(iArr), m37692getStartYimpl(iArr), m37686getDiagonalSizeimpl(iArr));
        } else if (m37694isAdditionimpl(iArr)) {
            intStack.pushDiagonal(m37691getStartXimpl(iArr), m37692getStartYimpl(iArr) + 1, m37686getDiagonalSizeimpl(iArr));
        } else {
            intStack.pushDiagonal(m37691getStartXimpl(iArr) + 1, m37692getStartYimpl(iArr), m37686getDiagonalSizeimpl(iArr));
        }
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Snake m37682boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int[] m37683constructorimpl(int[] iArr) {
        C12775o.m28639i(iArr, "data");
        return iArr;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37684equalsimpl(int[] iArr, Object obj) {
        if ((obj instanceof Snake) && C12775o.m28634d(iArr, ((Snake) obj).m37696unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37685equalsimpl0(int[] iArr, int[] iArr2) {
        return C12775o.m28634d(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl  reason: not valid java name */
    public static final int m37686getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m37687getEndXimpl(iArr) - m37691getStartXimpl(iArr), m37688getEndYimpl(iArr) - m37692getStartYimpl(iArr));
    }

    /* renamed from: getEndX-impl  reason: not valid java name */
    public static final int m37687getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl  reason: not valid java name */
    public static final int m37688getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl  reason: not valid java name */
    private static final boolean m37689getHasAdditionOrRemovalimpl(int[] iArr) {
        if (m37688getEndYimpl(iArr) - m37692getStartYimpl(iArr) != m37687getEndXimpl(iArr) - m37691getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: getReverse-impl  reason: not valid java name */
    public static final boolean m37690getReverseimpl(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getStartX-impl  reason: not valid java name */
    public static final int m37691getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl  reason: not valid java name */
    public static final int m37692getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37693hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl  reason: not valid java name */
    private static final boolean m37694isAdditionimpl(int[] iArr) {
        if (m37688getEndYimpl(iArr) - m37692getStartYimpl(iArr) > m37687getEndXimpl(iArr) - m37691getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37695toStringimpl(int[] iArr) {
        return "Snake(" + m37691getStartXimpl(iArr) + ',' + m37692getStartYimpl(iArr) + ',' + m37687getEndXimpl(iArr) + ',' + m37688getEndYimpl(iArr) + ',' + m37690getReverseimpl(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m37684equalsimpl(this.data, obj);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m37693hashCodeimpl(this.data);
    }

    public String toString() {
        return m37695toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int[] m37696unboximpl() {
        return this.data;
    }
}
