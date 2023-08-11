package androidx.compose.foundation;

import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalFoundationApi
/* compiled from: BasicMarquee.kt */
public final class MarqueeAnimationMode {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Immediately = m33010constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int WhileFocused = m33010constructorimpl(1);
    private final int value;

    private /* synthetic */ MarqueeAnimationMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m33009boximpl(int i) {
        return new MarqueeAnimationMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33011equalsimpl(int i, Object obj) {
        if ((obj instanceof MarqueeAnimationMode) && i == ((MarqueeAnimationMode) obj).m33015unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m33012equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m33013hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m33014toStringimpl(int i) {
        if (m33012equalsimpl0(i, Immediately)) {
            return "Immediately";
        }
        if (m33012equalsimpl0(i, WhileFocused)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i).toString());
    }

    public boolean equals(Object obj) {
        return m33011equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33013hashCodeimpl(this.value);
    }

    public String toString() {
        return m33014toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m33015unboximpl() {
        return this.value;
    }

    /* compiled from: BasicMarquee.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalFoundationApi
        /* renamed from: getImmediately-ZbEOnfQ  reason: not valid java name */
        public final int m33018getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.Immediately;
        }

        @ExperimentalFoundationApi
        /* renamed from: getWhileFocused-ZbEOnfQ  reason: not valid java name */
        public final int m33019getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.WhileFocused;
        }

        @ExperimentalFoundationApi
        /* renamed from: getImmediately-ZbEOnfQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m33016getImmediatelyZbEOnfQ$annotations() {
        }

        @ExperimentalFoundationApi
        /* renamed from: getWhileFocused-ZbEOnfQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m33017getWhileFocusedZbEOnfQ$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m33010constructorimpl(int i) {
        return i;
    }
}
