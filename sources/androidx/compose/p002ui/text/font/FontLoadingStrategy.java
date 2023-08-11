package androidx.compose.p002ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.FontLoadingStrategy */
/* compiled from: FontLoadingStrategy.kt */
public final class FontLoadingStrategy {
    /* access modifiers changed from: private */
    public static final int Async = m38048constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Blocking = m38048constructorimpl(0);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int OptionalLocal = m38048constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.text.font.FontLoadingStrategy$Companion */
    /* compiled from: FontLoadingStrategy.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ  reason: not valid java name */
        public final int m38054getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ  reason: not valid java name */
        public final int m38055getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ  reason: not valid java name */
        public final int m38056getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m38047boximpl(int i) {
        return new FontLoadingStrategy(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38049equalsimpl(int i, Object obj) {
        if ((obj instanceof FontLoadingStrategy) && i == ((FontLoadingStrategy) obj).m38053unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38050equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38051hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38052toStringimpl(int i) {
        if (m38050equalsimpl0(i, Blocking)) {
            return "Blocking";
        }
        if (m38050equalsimpl0(i, OptionalLocal)) {
            return "Optional";
        }
        if (m38050equalsimpl0(i, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m38049equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m38051hashCodeimpl(this.value);
    }

    public String toString() {
        return m38052toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38053unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m38048constructorimpl(int i) {
        return i;
    }
}
