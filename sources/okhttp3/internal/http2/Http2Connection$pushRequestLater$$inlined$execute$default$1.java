package okhttp3.internal.http2;

import java.util.List;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$pushRequestLater$$inlined$execute$default$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ List $requestHeaders$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushRequestLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, List list) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$requestHeaders$inlined = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long runOnce() {
        /*
            r3 = this;
            okhttp3.internal.http2.Http2Connection r0 = r3.this$0
            okhttp3.internal.http2.PushObserver r0 = r0.pushObserver
            int r1 = r3.$streamId$inlined
            java.util.List r2 = r3.$requestHeaders$inlined
            boolean r0 = r0.onRequest(r1, r2)
            if (r0 == 0) goto L_0x0034
            okhttp3.internal.http2.Http2Connection r0 = r3.this$0     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.Http2Writer r0 = r0.getWriter()     // Catch:{ IOException -> 0x0034 }
            int r1 = r3.$streamId$inlined     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0034 }
            r0.rstStream(r1, r2)     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.Http2Connection r0 = r3.this$0     // Catch:{ IOException -> 0x0034 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.Http2Connection r1 = r3.this$0     // Catch:{ all -> 0x0031 }
            java.util.Set r1 = r1.currentPushRequests     // Catch:{ all -> 0x0031 }
            int r2 = r3.$streamId$inlined     // Catch:{ all -> 0x0031 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
            r1.remove(r2)     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
            goto L_0x0034
        L_0x0031:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
            throw r1     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1.runOnce():long");
    }
}
