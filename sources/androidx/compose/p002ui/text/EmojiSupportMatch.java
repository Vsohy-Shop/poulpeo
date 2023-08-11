package androidx.compose.p002ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.EmojiSupportMatch */
/* compiled from: EmojiSupportMatch.kt */
public final class EmojiSupportMatch {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Default = m37849constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int None = m37849constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.text.EmojiSupportMatch$Companion */
    /* compiled from: EmojiSupportMatch.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefault-_3YsG6Y  reason: not valid java name */
        public final int m37855getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y  reason: not valid java name */
        public final int m37856getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }
    }

    private /* synthetic */ EmojiSupportMatch(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m37848boximpl(int i) {
        return new EmojiSupportMatch(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37850equalsimpl(int i, Object obj) {
        if ((obj instanceof EmojiSupportMatch) && i == ((EmojiSupportMatch) obj).m37854unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37851equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37852hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37853toStringimpl(int i) {
        if (i == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i == None) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m37850equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37852hashCodeimpl(this.value);
    }

    public String toString() {
        return m37853toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37854unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m37849constructorimpl(int i) {
        return i;
    }
}
