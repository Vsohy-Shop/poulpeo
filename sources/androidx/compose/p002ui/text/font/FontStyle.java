package androidx.compose.p002ui.text.font;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.FontStyle */
/* compiled from: FontStyle.kt */
public final class FontStyle {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Italic = m38061constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Normal = m38061constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.text.font.FontStyle$Companion */
    /* compiled from: FontStyle.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA  reason: not valid java name */
        public final int m38067getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA  reason: not valid java name */
        public final int m38068getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return C12726w.m28527n(FontStyle.m38060boximpl(m38068getNormal_LCdwA()), FontStyle.m38060boximpl(m38067getItalic_LCdwA()));
        }
    }

    private /* synthetic */ FontStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontStyle m38060boximpl(int i) {
        return new FontStyle(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38062equalsimpl(int i, Object obj) {
        if ((obj instanceof FontStyle) && i == ((FontStyle) obj).m38066unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38063equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38064hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38065toStringimpl(int i) {
        if (m38063equalsimpl0(i, Normal)) {
            return "Normal";
        }
        if (m38063equalsimpl0(i, Italic)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38062equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m38064hashCodeimpl(this.value);
    }

    public String toString() {
        return m38065toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38066unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38061constructorimpl(int i) {
        return i;
    }
}
