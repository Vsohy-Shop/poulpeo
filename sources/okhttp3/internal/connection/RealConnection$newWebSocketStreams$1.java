package okhttp3.internal.connection;

import okhttp3.internal.p406ws.RealWebSocket;
import okio.C13127d;
import okio.C13130e;

/* compiled from: RealConnection.kt */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    final /* synthetic */ Exchange $exchange;
    final /* synthetic */ C13127d $sink;
    final /* synthetic */ C13130e $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$newWebSocketStreams$1(C13130e eVar, C13127d dVar, Exchange exchange) {
        super(true, eVar, dVar);
        this.$source = eVar;
        this.$sink = dVar;
        this.$exchange = exchange;
    }

    public void close() {
        this.$exchange.bodyComplete(-1, true, true, null);
    }
}
