package androidx.compose.p002ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.input.pointer.PointerEventType */
/* compiled from: PointerEvent.kt */
public final class PointerEventType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Enter = m37119constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Exit = m37119constructorimpl(5);
    /* access modifiers changed from: private */
    public static final int Move = m37119constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Press = m37119constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Release = m37119constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Scroll = m37119constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int Unknown = m37119constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.input.pointer.PointerEventType$Companion */
    /* compiled from: PointerEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEnter-7fucELk  reason: not valid java name */
        public final int m37125getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk  reason: not valid java name */
        public final int m37126getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk  reason: not valid java name */
        public final int m37127getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk  reason: not valid java name */
        public final int m37128getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk  reason: not valid java name */
        public final int m37129getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk  reason: not valid java name */
        public final int m37130getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk  reason: not valid java name */
        public final int m37131getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }
    }

    private /* synthetic */ PointerEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerEventType m37118boximpl(int i) {
        return new PointerEventType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37120equalsimpl(int i, Object obj) {
        if ((obj instanceof PointerEventType) && i == ((PointerEventType) obj).m37124unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37121equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37122hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37123toStringimpl(int i) {
        if (m37121equalsimpl0(i, Press)) {
            return "Press";
        }
        if (m37121equalsimpl0(i, Release)) {
            return "Release";
        }
        if (m37121equalsimpl0(i, Move)) {
            return "Move";
        }
        if (m37121equalsimpl0(i, Enter)) {
            return "Enter";
        }
        if (m37121equalsimpl0(i, Exit)) {
            return "Exit";
        }
        if (m37121equalsimpl0(i, Scroll)) {
            return "Scroll";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m37120equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37122hashCodeimpl(this.value);
    }

    public String toString() {
        return m37123toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37124unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m37119constructorimpl(int i) {
        return i;
    }
}
