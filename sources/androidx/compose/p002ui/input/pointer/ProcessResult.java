package androidx.compose.p002ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.ProcessResult */
/* compiled from: PointerInputEventProcessor.kt */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ProcessResult m37252boximpl(int i) {
        return new ProcessResult(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37254equalsimpl(int i, Object obj) {
        if ((obj instanceof ProcessResult) && i == ((ProcessResult) obj).m37260unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37255equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: getAnyMovementConsumed-impl  reason: not valid java name */
    public static final boolean m37256getAnyMovementConsumedimpl(int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl  reason: not valid java name */
    public static final boolean m37257getDispatchedToAPointerInputModifierimpl(int i) {
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37258hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37259toStringimpl(int i) {
        return "ProcessResult(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m37254equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37258hashCodeimpl(this.value);
    }

    public String toString() {
        return m37259toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37260unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m37253constructorimpl(int i) {
        return i;
    }
}
