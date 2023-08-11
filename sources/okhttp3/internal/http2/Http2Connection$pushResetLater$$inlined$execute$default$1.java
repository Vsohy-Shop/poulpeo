package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;
import p336ef.C11921v;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$pushResetLater$$inlined$execute$default$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ ErrorCode $errorCode$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushResetLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, ErrorCode errorCode) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$errorCode$inlined = errorCode;
    }

    public long runOnce() {
        this.this$0.pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
        synchronized (this.this$0) {
            this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
            C11921v vVar = C11921v.f18618a;
        }
        return -1;
    }
}
