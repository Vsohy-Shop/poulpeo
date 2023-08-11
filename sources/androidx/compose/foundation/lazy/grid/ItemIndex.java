package androidx.compose.foundation.lazy.grid;

/* compiled from: ItemIndex.kt */
public final class ItemIndex {
    private final int value;

    private /* synthetic */ ItemIndex(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ItemIndex m33440boximpl(int i) {
        return new ItemIndex(i);
    }

    /* renamed from: compareTo-YGsSkvE  reason: not valid java name */
    public static final int m33441compareToYGsSkvE(int i, int i2) {
        return i - i2;
    }

    /* renamed from: dec-VZbfaAc  reason: not valid java name */
    public static final int m33443decVZbfaAc(int i) {
        return m33442constructorimpl(i - 1);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33444equalsimpl(int i, Object obj) {
        if ((obj instanceof ItemIndex) && i == ((ItemIndex) obj).m33452unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33445equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m33446hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: inc-VZbfaAc  reason: not valid java name */
    public static final int m33447incVZbfaAc(int i) {
        return m33442constructorimpl(i + 1);
    }

    /* renamed from: minus-41DfMLM  reason: not valid java name */
    public static final int m33448minus41DfMLM(int i, int i2) {
        return m33442constructorimpl(i - i2);
    }

    /* renamed from: minus-AoD1bsw  reason: not valid java name */
    public static final int m33449minusAoD1bsw(int i, int i2) {
        return m33442constructorimpl(i - i2);
    }

    /* renamed from: plus-AoD1bsw  reason: not valid java name */
    public static final int m33450plusAoD1bsw(int i, int i2) {
        return m33442constructorimpl(i + i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m33451toStringimpl(int i) {
        return "ItemIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m33444equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m33446hashCodeimpl(this.value);
    }

    public String toString() {
        return m33451toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m33452unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m33442constructorimpl(int i) {
        return i;
    }
}
