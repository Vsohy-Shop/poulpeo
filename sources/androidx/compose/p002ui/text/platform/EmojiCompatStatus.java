package androidx.compose.p002ui.text.platform;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;

/* renamed from: androidx.compose.ui.text.platform.EmojiCompatStatus */
/* compiled from: EmojiCompatStatus.kt */
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {
    public static final EmojiCompatStatus INSTANCE = new EmojiCompatStatus();
    private static EmojiCompatStatusDelegate delegate = new DefaultImpl();

    private EmojiCompatStatus() {
    }

    public State<Boolean> getFontLoaded() {
        return delegate.getFontLoaded();
    }

    @VisibleForTesting
    public final void setDelegateForTesting$ui_text_release(EmojiCompatStatusDelegate emojiCompatStatusDelegate) {
        if (emojiCompatStatusDelegate == null) {
            emojiCompatStatusDelegate = new DefaultImpl();
        }
        delegate = emojiCompatStatusDelegate;
    }
}
