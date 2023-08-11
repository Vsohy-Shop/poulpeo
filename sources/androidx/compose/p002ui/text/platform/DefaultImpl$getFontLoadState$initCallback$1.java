package androidx.compose.p002ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1 */
/* compiled from: EmojiCompatStatus.kt */
public final class DefaultImpl$getFontLoadState$initCallback$1 extends EmojiCompat.InitCallback {
    final /* synthetic */ MutableState<Boolean> $mutableLoaded;
    final /* synthetic */ DefaultImpl this$0;

    DefaultImpl$getFontLoadState$initCallback$1(MutableState<Boolean> mutableState, DefaultImpl defaultImpl) {
        this.$mutableLoaded = mutableState;
        this.this$0 = defaultImpl;
    }

    public void onFailed(Throwable th) {
        this.this$0.loadState = EmojiCompatStatusKt.Falsey;
    }

    public void onInitialized() {
        this.$mutableLoaded.setValue(Boolean.TRUE);
        this.this$0.loadState = new ImmutableBool(true);
    }
}
