package okhttp3.internal.p406ws;

import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.C12775o;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p406ws.RealWebSocket;

/* renamed from: okhttp3.internal.ws.RealWebSocket$connect$1 */
/* compiled from: RealWebSocket.kt */
public final class RealWebSocket$connect$1 implements Callback {
    final /* synthetic */ Request $request;
    final /* synthetic */ RealWebSocket this$0;

    RealWebSocket$connect$1(RealWebSocket realWebSocket, Request request) {
        this.this$0 = realWebSocket;
        this.$request = request;
    }

    public void onFailure(Call call, IOException iOException) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(iOException, "e");
        this.this$0.failWebSocket(iOException, (Response) null);
    }

    public void onResponse(Call call, Response response) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(response, "response");
        Exchange exchange = response.exchange();
        try {
            this.this$0.checkUpgradeSuccess$okhttp(response, exchange);
            C12775o.m28636f(exchange);
            RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
            WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
            this.this$0.extensions = parse;
            if (!this.this$0.isValid(parse)) {
                RealWebSocket realWebSocket = this.this$0;
                synchronized (realWebSocket) {
                    realWebSocket.messageAndCloseQueue.clear();
                    realWebSocket.close(PointerIconCompat.TYPE_ALIAS, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.this$0.initReaderAndWriter(Util.okHttpName + " WebSocket " + this.$request.url().redact(), newWebSocketStreams);
                this.this$0.getListener$okhttp().onOpen(this.this$0, response);
                this.this$0.loopReader();
            } catch (Exception e) {
                this.this$0.failWebSocket(e, (Response) null);
            }
        } catch (IOException e2) {
            if (exchange != null) {
                exchange.webSocketUpgradeFailed();
            }
            this.this$0.failWebSocket(e2, response);
            Util.closeQuietly((Closeable) response);
        }
    }
}
