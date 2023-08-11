package androidx.compose.p002ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.FontSynthesis */
/* compiled from: FontSynthesis.kt */
public final class FontSynthesis {
    /* access modifiers changed from: private */
    public static final int All = m38070constructorimpl(1);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int None = m38070constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Style = m38070constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Weight = m38070constructorimpl(2);
    private final int value;

    /* renamed from: androidx.compose.ui.text.font.FontSynthesis$Companion */
    /* compiled from: FontSynthesis.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAll-GVVA2EU  reason: not valid java name */
        public final int m38078getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU  reason: not valid java name */
        public final int m38079getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU  reason: not valid java name */
        public final int m38080getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU  reason: not valid java name */
        public final int m38081getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }
    }

    private /* synthetic */ FontSynthesis(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m38069boximpl(int i) {
        return new FontSynthesis(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38071equalsimpl(int i, Object obj) {
        if ((obj instanceof FontSynthesis) && i == ((FontSynthesis) obj).m38077unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38072equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38073hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isStyleOn-impl$ui_text_release  reason: not valid java name */
    public static final boolean m38074isStyleOnimpl$ui_text_release(int i) {
        if (m38072equalsimpl0(i, All) || m38072equalsimpl0(i, Style)) {
            return true;
        }
        return false;
    }

    /* renamed from: isWeightOn-impl$ui_text_release  reason: not valid java name */
    public static final boolean m38075isWeightOnimpl$ui_text_release(int i) {
        if (m38072equalsimpl0(i, All) || m38072equalsimpl0(i, Weight)) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38076toStringimpl(int i) {
        if (m38072equalsimpl0(i, None)) {
            return "None";
        }
        if (m38072equalsimpl0(i, All)) {
            return "All";
        }
        if (m38072equalsimpl0(i, Weight)) {
            return "Weight";
        }
        if (m38072equalsimpl0(i, Style)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38071equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38073hashCodeimpl(this.value);
    }

    public String toString() {
        return m38076toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38077unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38070constructorimpl(int i) {
        return i;
    }
}
