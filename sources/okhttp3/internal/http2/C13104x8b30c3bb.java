package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 */
/* compiled from: TaskQueue.kt */
public final class C13104x8b30c3bb extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ boolean $clearPrevious$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ Settings $settings$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13104x8b30c3bb(String str, boolean z, Http2Connection.ReaderRunnable readerRunnable, boolean z2, Settings settings) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = readerRunnable;
        this.$clearPrevious$inlined = z2;
        this.$settings$inlined = settings;
    }

    public long runOnce() {
        this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
        return -1;
    }
}
