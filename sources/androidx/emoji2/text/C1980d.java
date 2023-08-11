package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: androidx.emoji2.text.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1980d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f553b;

    public /* synthetic */ C1980d(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader) {
        this.f553b = fontRequestMetadataLoader;
    }

    public final void run() {
        this.f553b.createMetadata();
    }
}
