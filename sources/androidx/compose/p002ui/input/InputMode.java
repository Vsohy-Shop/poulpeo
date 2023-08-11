package androidx.compose.p002ui.input;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.input.InputMode */
/* compiled from: InputModeManager.kt */
public final class InputMode {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Keyboard = m36415constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Touch = m36415constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.input.InputMode$Companion */
    /* compiled from: InputModeManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getKeyboard-aOaMEAU  reason: not valid java name */
        public final int m36421getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU  reason: not valid java name */
        public final int m36422getTouchaOaMEAU() {
            return InputMode.Touch;
        }
    }

    private /* synthetic */ InputMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ InputMode m36414boximpl(int i) {
        return new InputMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36416equalsimpl(int i, Object obj) {
        if ((obj instanceof InputMode) && i == ((InputMode) obj).m36420unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36417equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36418hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36419toStringimpl(int i) {
        if (m36417equalsimpl0(i, Touch)) {
            return "Touch";
        }
        if (m36417equalsimpl0(i, Keyboard)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return m36416equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36418hashCodeimpl(this.value);
    }

    public String toString() {
        return m36419toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36420unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36415constructorimpl(int i) {
        return i;
    }
}
