package androidx.compose.foundation.lazy;

/* compiled from: DataIndex.kt */
public final class DataIndex {
    private final int value;

    private /* synthetic */ DataIndex(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DataIndex m33389boximpl(int i) {
        return new DataIndex(i);
    }

    /* renamed from: compareTo-ZjPyQlc  reason: not valid java name */
    public static final int m33390compareToZjPyQlc(int i, int i2) {
        return i - i2;
    }

    /* renamed from: dec-jQJCoq8  reason: not valid java name */
    public static final int m33392decjQJCoq8(int i) {
        return m33391constructorimpl(i - 1);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33393equalsimpl(int i, Object obj) {
        if ((obj instanceof DataIndex) && i == ((DataIndex) obj).m33401unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33394equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m33395hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: inc-jQJCoq8  reason: not valid java name */
    public static final int m33396incjQJCoq8(int i) {
        return m33391constructorimpl(i + 1);
    }

    /* renamed from: minus-PBKCTt8  reason: not valid java name */
    public static final int m33397minusPBKCTt8(int i, int i2) {
        return m33391constructorimpl(i - i2);
    }

    /* renamed from: minus-yUvdeeg  reason: not valid java name */
    public static final int m33398minusyUvdeeg(int i, int i2) {
        return m33391constructorimpl(i - i2);
    }

    /* renamed from: plus-PBKCTt8  reason: not valid java name */
    public static final int m33399plusPBKCTt8(int i, int i2) {
        return m33391constructorimpl(i + i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m33400toStringimpl(int i) {
        return "DataIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m33393equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m33395hashCodeimpl(this.value);
    }

    public String toString() {
        return m33400toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m33401unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m33391constructorimpl(int i) {
        return i;
    }
}
