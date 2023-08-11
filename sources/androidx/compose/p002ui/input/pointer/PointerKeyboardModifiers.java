package androidx.compose.p002ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.PointerKeyboardModifiers */
/* compiled from: PointerEvent.kt */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m37231boximpl(int i) {
        return new PointerKeyboardModifiers(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37233equalsimpl(int i, Object obj) {
        if ((obj instanceof PointerKeyboardModifiers) && i == ((PointerKeyboardModifiers) obj).m37237unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37234equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37235hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37236toStringimpl(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m37233equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m37235hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m37236toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37237unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m37232constructorimpl(int i) {
        return i;
    }
}
