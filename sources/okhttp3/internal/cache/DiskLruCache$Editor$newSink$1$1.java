package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import okhttp3.internal.cache.DiskLruCache;
import p336ef.C11921v;

/* compiled from: DiskLruCache.kt */
final class DiskLruCache$Editor$newSink$1$1 extends C12777p implements Function1<IOException, C11921v> {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C11921v.f18618a;
    }

    public final void invoke(IOException iOException) {
        C12775o.m28639i(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            C11921v vVar = C11921v.f18618a;
        }
    }
}
