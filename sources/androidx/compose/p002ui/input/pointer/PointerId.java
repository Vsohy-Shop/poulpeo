package androidx.compose.p002ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.PointerId */
/* compiled from: PointerEvent.kt */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j) {
        this.value = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerId m37151boximpl(long j) {
        return new PointerId(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37153equalsimpl(long j, Object obj) {
        if ((obj instanceof PointerId) && j == ((PointerId) obj).m37157unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37154equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37155hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37156toStringimpl(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m37153equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m37155hashCodeimpl(this.value);
    }

    public String toString() {
        return m37156toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m37157unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m37152constructorimpl(long j) {
        return j;
    }
}
