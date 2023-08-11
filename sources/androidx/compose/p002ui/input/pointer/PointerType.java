package androidx.compose.p002ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.input.pointer.PointerType */
/* compiled from: PointerEvent.kt */
public final class PointerType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Eraser = m37239constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Mouse = m37239constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Stylus = m37239constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Touch = m37239constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Unknown = m37239constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.input.pointer.PointerType$Companion */
    /* compiled from: PointerEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEraser-T8wyACA  reason: not valid java name */
        public final int m37245getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA  reason: not valid java name */
        public final int m37246getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA  reason: not valid java name */
        public final int m37247getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA  reason: not valid java name */
        public final int m37248getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA  reason: not valid java name */
        public final int m37249getUnknownT8wyACA() {
            return PointerType.Unknown;
        }
    }

    private /* synthetic */ PointerType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerType m37238boximpl(int i) {
        return new PointerType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37240equalsimpl(int i, Object obj) {
        if ((obj instanceof PointerType) && i == ((PointerType) obj).m37244unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37241equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37242hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37243toStringimpl(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i == 3) {
            return "Stylus";
        }
        if (i != 4) {
            return "Unknown";
        }
        return "Eraser";
    }

    public boolean equals(Object obj) {
        return m37240equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37242hashCodeimpl(this.value);
    }

    public String toString() {
        return m37243toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37244unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m37239constructorimpl(int i) {
        return i;
    }
}
