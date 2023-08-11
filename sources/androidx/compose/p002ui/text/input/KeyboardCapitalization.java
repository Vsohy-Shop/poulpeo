package androidx.compose.p002ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.input.KeyboardCapitalization */
/* compiled from: KeyboardCapitalization.kt */
public final class KeyboardCapitalization {
    /* access modifiers changed from: private */
    public static final int Characters = m38150constructorimpl(1);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int None = m38150constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Sentences = m38150constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Words = m38150constructorimpl(2);
    private final int value;

    private /* synthetic */ KeyboardCapitalization(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m38149boximpl(int i) {
        return new KeyboardCapitalization(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38151equalsimpl(int i, Object obj) {
        if ((obj instanceof KeyboardCapitalization) && i == ((KeyboardCapitalization) obj).m38155unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38152equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38153hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38154toStringimpl(int i) {
        if (m38152equalsimpl0(i, None)) {
            return "None";
        }
        if (m38152equalsimpl0(i, Characters)) {
            return "Characters";
        }
        if (m38152equalsimpl0(i, Words)) {
            return "Words";
        }
        if (m38152equalsimpl0(i, Sentences)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38151equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38153hashCodeimpl(this.value);
    }

    public String toString() {
        return m38154toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38155unboximpl() {
        return this.value;
    }

    /* renamed from: androidx.compose.ui.text.input.KeyboardCapitalization$Companion */
    /* compiled from: KeyboardCapitalization.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCharacters-IUNYP9k  reason: not valid java name */
        public final int m38160getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k  reason: not valid java name */
        public final int m38161getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k  reason: not valid java name */
        public final int m38162getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getWords-IUNYP9k  reason: not valid java name */
        public final int m38163getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        @Stable
        /* renamed from: getCharacters-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m38156getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getNone-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m38157getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getSentences-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m38158getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getWords-IUNYP9k$annotations  reason: not valid java name */
        public static /* synthetic */ void m38159getWordsIUNYP9k$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38150constructorimpl(int i) {
        return i;
    }
}
