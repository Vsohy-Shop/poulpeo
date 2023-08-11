package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.focus.FocusDirection */
/* compiled from: FocusDirection.kt */
public final class FocusDirection {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Down = m35342constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int Enter;
    /* access modifiers changed from: private */
    public static final int Exit;
    /* access modifiers changed from: private */

    /* renamed from: In */
    public static final int f260In;
    /* access modifiers changed from: private */
    public static final int Left = m35342constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Next = m35342constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Out;
    /* access modifiers changed from: private */
    public static final int Previous = m35342constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Right = m35342constructorimpl(4);
    /* access modifiers changed from: private */

    /* renamed from: Up */
    public static final int f261Up = m35342constructorimpl(5);
    private final int value;

    static {
        int r0 = m35342constructorimpl(7);
        Enter = r0;
        int r1 = m35342constructorimpl(8);
        Exit = r1;
        f260In = r0;
        Out = r1;
    }

    private /* synthetic */ FocusDirection(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FocusDirection m35341boximpl(int i) {
        return new FocusDirection(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35343equalsimpl(int i, Object obj) {
        if ((obj instanceof FocusDirection) && i == ((FocusDirection) obj).m35347unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35344equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35345hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35346toStringimpl(int i) {
        if (m35344equalsimpl0(i, Next)) {
            return "Next";
        }
        if (m35344equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m35344equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m35344equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m35344equalsimpl0(i, f261Up)) {
            return "Up";
        }
        if (m35344equalsimpl0(i, Down)) {
            return "Down";
        }
        if (m35344equalsimpl0(i, Enter)) {
            return "Enter";
        }
        if (m35344equalsimpl0(i, Exit)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m35343equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35345hashCodeimpl(this.value);
    }

    public String toString() {
        return m35346toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35347unboximpl() {
        return this.value;
    }

    /* renamed from: androidx.compose.ui.focus.FocusDirection$Companion */
    /* compiled from: FocusDirection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDown-dhqQ-8s  reason: not valid java name */
        public final int m35352getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s  reason: not valid java name */
        public final int m35353getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s  reason: not valid java name */
        public final int m35354getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getIn-dhqQ-8s  reason: not valid java name */
        public final int m35355getIndhqQ8s() {
            return FocusDirection.f260In;
        }

        /* renamed from: getLeft-dhqQ-8s  reason: not valid java name */
        public final int m35356getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s  reason: not valid java name */
        public final int m35357getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getOut-dhqQ-8s  reason: not valid java name */
        public final int m35358getOutdhqQ8s() {
            return FocusDirection.Out;
        }

        /* renamed from: getPrevious-dhqQ-8s  reason: not valid java name */
        public final int m35359getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s  reason: not valid java name */
        public final int m35360getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s  reason: not valid java name */
        public final int m35361getUpdhqQ8s() {
            return FocusDirection.f261Up;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m35348getEnterdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m35349getExitdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getIn-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m35350getIndhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getOut-dhqQ-8s$annotations  reason: not valid java name */
        public static /* synthetic */ void m35351getOutdhqQ8s$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35342constructorimpl(int i) {
        return i;
    }
}
