package androidx.compose.p002ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.DefaultImpl */
/* compiled from: EmojiCompatStatus.kt */
final class DefaultImpl implements EmojiCompatStatusDelegate {
    /* access modifiers changed from: private */
    public State<Boolean> loadState;

    public DefaultImpl() {
        State<Boolean> state;
        if (EmojiCompat.isConfigured()) {
            state = getFontLoadState();
        } else {
            state = null;
        }
        this.loadState = state;
    }

    private final State<Boolean> getFontLoadState() {
        EmojiCompat emojiCompat = EmojiCompat.get();
        C12775o.m28638h(emojiCompat, "get()");
        if (emojiCompat.getLoadState() == 1) {
            return new ImmutableBool(true);
        }
        MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        emojiCompat.registerInitCallback(new DefaultImpl$getFontLoadState$initCallback$1(mutableStateOf$default, this));
        return mutableStateOf$default;
    }

    public State<Boolean> getFontLoaded() {
        State<Boolean> state = this.loadState;
        if (state != null) {
            C12775o.m28636f(state);
            return state;
        } else if (!EmojiCompat.isConfigured()) {
            return EmojiCompatStatusKt.Falsey;
        } else {
            State<Boolean> fontLoadState = getFontLoadState();
            this.loadState = fontLoadState;
            C12775o.m28636f(fontLoadState);
            return fontLoadState;
        }
    }
}
