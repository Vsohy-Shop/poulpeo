package androidx.compose.p002ui.input.key;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.input.key.KeyEventType */
/* compiled from: KeyEvent.kt */
public final class KeyEventType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int KeyDown = m37017constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int KeyUp = m37017constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Unknown = m37017constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.input.key.KeyEventType$Companion */
    /* compiled from: KeyEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getKeyDown-CS__XNY  reason: not valid java name */
        public final int m37023getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY  reason: not valid java name */
        public final int m37024getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY  reason: not valid java name */
        public final int m37025getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }
    }

    private /* synthetic */ KeyEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyEventType m37016boximpl(int i) {
        return new KeyEventType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37018equalsimpl(int i, Object obj) {
        if ((obj instanceof KeyEventType) && i == ((KeyEventType) obj).m37022unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37019equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37020hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37021toStringimpl(int i) {
        if (m37019equalsimpl0(i, KeyUp)) {
            return "KeyUp";
        }
        if (m37019equalsimpl0(i, KeyDown)) {
            return "KeyDown";
        }
        if (m37019equalsimpl0(i, Unknown)) {
            return "Unknown";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m37018equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37020hashCodeimpl(this.value);
    }

    public String toString() {
        return m37021toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37022unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m37017constructorimpl(int i) {
        return i;
    }
}
