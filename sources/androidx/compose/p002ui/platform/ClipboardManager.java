package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.text.AnnotatedString;

/* renamed from: androidx.compose.ui.platform.ClipboardManager */
/* compiled from: ClipboardManager.kt */
public interface ClipboardManager {
    AnnotatedString getText();

    boolean hasText() {
        boolean z;
        AnnotatedString text = getText();
        if (text == null) {
            return false;
        }
        if (text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    void setText(AnnotatedString annotatedString);
}
