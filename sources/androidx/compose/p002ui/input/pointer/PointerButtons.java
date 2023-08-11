package androidx.compose.p002ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.PointerButtons */
/* compiled from: PointerEvent.kt */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerButtons m37104boximpl(int i) {
        return new PointerButtons(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37106equalsimpl(int i, Object obj) {
        if ((obj instanceof PointerButtons) && i == ((PointerButtons) obj).m37110unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37107equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37108hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37109toStringimpl(int i) {
        return "PointerButtons(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m37106equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m37108hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m37109toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37110unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m37105constructorimpl(int i) {
        return i;
    }
}
