package androidx.compose.p002ui.text.style;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.style.TextAlign */
/* compiled from: TextAlign.kt */
public final class TextAlign {
    /* access modifiers changed from: private */
    public static final int Center = m38342constructorimpl(3);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int End = m38342constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int Justify = m38342constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Left = m38342constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Right = m38342constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Start = m38342constructorimpl(5);
    private final int value;

    /* renamed from: androidx.compose.ui.text.style.TextAlign$Companion */
    /* compiled from: TextAlign.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk  reason: not valid java name */
        public final int m38348getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk  reason: not valid java name */
        public final int m38349getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk  reason: not valid java name */
        public final int m38350getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk  reason: not valid java name */
        public final int m38351getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk  reason: not valid java name */
        public final int m38352getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk  reason: not valid java name */
        public final int m38353getStarte0LSkKk() {
            return TextAlign.Start;
        }

        public final List<TextAlign> values() {
            return C12726w.m28527n(TextAlign.m38341boximpl(m38351getLefte0LSkKk()), TextAlign.m38341boximpl(m38352getRighte0LSkKk()), TextAlign.m38341boximpl(m38348getCentere0LSkKk()), TextAlign.m38341boximpl(m38350getJustifye0LSkKk()), TextAlign.m38341boximpl(m38353getStarte0LSkKk()), TextAlign.m38341boximpl(m38349getEnde0LSkKk()));
        }
    }

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextAlign m38341boximpl(int i) {
        return new TextAlign(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38343equalsimpl(int i, Object obj) {
        if ((obj instanceof TextAlign) && i == ((TextAlign) obj).m38347unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38344equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38345hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38346toStringimpl(int i) {
        if (m38344equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m38344equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m38344equalsimpl0(i, Center)) {
            return "Center";
        }
        if (m38344equalsimpl0(i, Justify)) {
            return "Justify";
        }
        if (m38344equalsimpl0(i, Start)) {
            return "Start";
        }
        if (m38344equalsimpl0(i, End)) {
            return "End";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38343equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38345hashCodeimpl(this.value);
    }

    public String toString() {
        return m38346toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38347unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38342constructorimpl(int i) {
        return i;
    }
}
