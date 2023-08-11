package androidx.compose.p002ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.CenteredArray */
/* compiled from: MyersDiff.kt */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ CenteredArray m37451boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int[] m37452constructorimpl(int[] iArr) {
        C12775o.m28639i(iArr, "data");
        return iArr;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37453equalsimpl(int[] iArr, Object obj) {
        if ((obj instanceof CenteredArray) && C12775o.m28634d(iArr, ((CenteredArray) obj).m37460unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37454equalsimpl0(int[] iArr, int[] iArr2) {
        return C12775o.m28634d(iArr, iArr2);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final int m37455getimpl(int[] iArr, int i) {
        return iArr[i + m37456getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl  reason: not valid java name */
    private static final int m37456getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37457hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m37458setimpl(int[] iArr, int i, int i2) {
        iArr[i + m37456getMidimpl(iArr)] = i2;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37459toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m37453equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m37457hashCodeimpl(this.data);
    }

    public String toString() {
        return m37459toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int[] m37460unboximpl() {
        return this.data;
    }
}
