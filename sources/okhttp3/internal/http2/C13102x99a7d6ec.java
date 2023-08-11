package okhttp3.internal.http2;

import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal.concurrent.Task;

/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1 */
/* compiled from: TaskQueue.kt */
public final class C13102x99a7d6ec extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ Ref$ObjectRef $newPeerSettings$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13102x99a7d6ec(String str, boolean z, Http2Connection http2Connection, Ref$ObjectRef ref$ObjectRef) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = http2Connection;
        this.$newPeerSettings$inlined = ref$ObjectRef;
    }

    public long runOnce() {
        this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.f20403b);
        return -1;
    }
}
