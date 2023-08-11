package okhttp3.internal.p406ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.Task;

/* renamed from: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1  reason: invalid class name */
/* compiled from: TaskQueue.kt */
public final class RealWebSocket$initReaderAndWriter$lambda3$$inlined$schedule$1 extends Task {
    final /* synthetic */ String $name;
    final /* synthetic */ long $pingIntervalNanos$inlined;
    final /* synthetic */ RealWebSocket this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealWebSocket$initReaderAndWriter$lambda3$$inlined$schedule$1(String str, RealWebSocket realWebSocket, long j) {
        super(str, false, 2, (DefaultConstructorMarker) null);
        this.$name = str;
        this.this$0 = realWebSocket;
        this.$pingIntervalNanos$inlined = j;
    }

    public long runOnce() {
        this.this$0.writePingFrame$okhttp();
        return this.$pingIntervalNanos$inlined;
    }
}
