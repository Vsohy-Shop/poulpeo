package androidx.compose.p002ui.text.platform;

import androidx.compose.runtime.State;

/* renamed from: androidx.compose.ui.text.platform.ImmutableBool */
/* compiled from: EmojiCompatStatus.kt */
final class ImmutableBool implements State<Boolean> {
    private final boolean value;

    public ImmutableBool(boolean z) {
        this.value = z;
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
