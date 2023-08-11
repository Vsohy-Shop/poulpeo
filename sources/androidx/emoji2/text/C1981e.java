package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: androidx.emoji2.text.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1981e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f554b;

    public /* synthetic */ C1981e(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader) {
        this.f554b = fontRequestMetadataLoader;
    }

    public final void run() {
        this.f554b.loadInternal();
    }
}
