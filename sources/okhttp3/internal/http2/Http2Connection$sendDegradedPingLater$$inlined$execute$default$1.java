package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$sendDegradedPingLater$$inlined$execute$default$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = http2Connection;
    }

    public long runOnce() {
        this.this$0.writePing(false, 2, 0);
        return -1;
    }
}
