package okhttp3.internal.p406ws;

import okhttp3.internal.concurrent.Task;

/* renamed from: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1  reason: invalid class name */
/* compiled from: TaskQueue.kt */
public final class RealWebSocket$writeOneFrame$lambda8$$inlined$execute$default$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ RealWebSocket this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealWebSocket$writeOneFrame$lambda8$$inlined$execute$default$1(String str, boolean z, RealWebSocket realWebSocket) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = realWebSocket;
    }

    public long runOnce() {
        this.this$0.cancel();
        return -1;
    }
}
