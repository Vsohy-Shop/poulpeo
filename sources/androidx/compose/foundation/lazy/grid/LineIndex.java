package androidx.compose.foundation.lazy.grid;

/* compiled from: ItemIndex.kt */
public final class LineIndex {
    private final int value;

    private /* synthetic */ LineIndex(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LineIndex m33494boximpl(int i) {
        return new LineIndex(i);
    }

    /* renamed from: compareTo-bKFJvoY  reason: not valid java name */
    public static final int m33495compareTobKFJvoY(int i, int i2) {
        return i - i2;
    }

    /* renamed from: dec-hA7yfN8  reason: not valid java name */
    public static final int m33497dechA7yfN8(int i) {
        return m33496constructorimpl(i - 1);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33498equalsimpl(int i, Object obj) {
        if ((obj instanceof LineIndex) && i == ((LineIndex) obj).m33506unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33499equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m33500hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: inc-hA7yfN8  reason: not valid java name */
    public static final int m33501inchA7yfN8(int i) {
        return m33496constructorimpl(i + 1);
    }

    /* renamed from: minus--_Ze7BM  reason: not valid java name */
    public static final int m33502minus_Ze7BM(int i, int i2) {
        return m33496constructorimpl(i - i2);
    }

    /* renamed from: minus-fVkYB0M  reason: not valid java name */
    public static final int m33503minusfVkYB0M(int i, int i2) {
        return m33496constructorimpl(i - i2);
    }

    /* renamed from: plus--_Ze7BM  reason: not valid java name */
    public static final int m33504plus_Ze7BM(int i, int i2) {
        return m33496constructorimpl(i + i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m33505toStringimpl(int i) {
        return "LineIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m33498equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m33500hashCodeimpl(this.value);
    }

    public String toString() {
        return m33505toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m33506unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m33496constructorimpl(int i) {
        return i;
    }
}
