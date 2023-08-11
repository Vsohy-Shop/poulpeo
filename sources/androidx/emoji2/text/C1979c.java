package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1979c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ EmojiCompatInitializer.BackgroundDefaultLoader f550b;

    /* renamed from: c */
    public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f551c;

    /* renamed from: d */
    public final /* synthetic */ ThreadPoolExecutor f552d;

    public /* synthetic */ C1979c(EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader, EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
        this.f550b = backgroundDefaultLoader;
        this.f551c = metadataRepoLoaderCallback;
        this.f552d = threadPoolExecutor;
    }

    public final void run() {
        this.f550b.lambda$load$0(this.f551c, this.f552d);
    }
}
