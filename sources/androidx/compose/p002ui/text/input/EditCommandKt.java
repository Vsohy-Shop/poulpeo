package androidx.compose.p002ui.text.input;

/* renamed from: androidx.compose.ui.text.input.EditCommandKt */
/* compiled from: EditCommand.kt */
public final class EditCommandKt {
    /* access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c, char c2) {
        if (!Character.isHighSurrogate(c) || !Character.isLowSurrogate(c2)) {
            return false;
        }
        return true;
    }
}
