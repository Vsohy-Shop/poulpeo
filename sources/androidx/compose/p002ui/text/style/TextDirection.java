package androidx.compose.p002ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.style.TextDirection */
/* compiled from: TextDirection.kt */
public final class TextDirection {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Content = m38355constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int ContentOrLtr = m38355constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int ContentOrRtl = m38355constructorimpl(5);
    /* access modifiers changed from: private */
    public static final int Ltr = m38355constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Rtl = m38355constructorimpl(2);
    private final int value;

    /* renamed from: androidx.compose.ui.text.style.TextDirection$Companion */
    /* compiled from: TextDirection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getContent-s_7X-co  reason: not valid java name */
        public final int m38361getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co  reason: not valid java name */
        public final int m38362getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co  reason: not valid java name */
        public final int m38363getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co  reason: not valid java name */
        public final int m38364getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co  reason: not valid java name */
        public final int m38365getRtls_7Xco() {
            return TextDirection.Rtl;
        }
    }

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextDirection m38354boximpl(int i) {
        return new TextDirection(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38356equalsimpl(int i, Object obj) {
        if ((obj instanceof TextDirection) && i == ((TextDirection) obj).m38360unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38357equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38358hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38359toStringimpl(int i) {
        if (m38357equalsimpl0(i, Ltr)) {
            return "Ltr";
        }
        if (m38357equalsimpl0(i, Rtl)) {
            return "Rtl";
        }
        if (m38357equalsimpl0(i, Content)) {
            return "Content";
        }
        if (m38357equalsimpl0(i, ContentOrLtr)) {
            return "ContentOrLtr";
        }
        if (m38357equalsimpl0(i, ContentOrRtl)) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38356equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38358hashCodeimpl(this.value);
    }

    public String toString() {
        return m38359toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38360unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38355constructorimpl(int i) {
        return i;
    }
}
