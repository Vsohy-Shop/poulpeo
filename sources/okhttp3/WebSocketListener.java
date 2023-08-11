package okhttp3;

import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import okio.C13133f;

/* compiled from: WebSocketListener.kt */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        C12775o.m28639i(webSocket, "webSocket");
        C12775o.m28639i(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        C12775o.m28639i(webSocket, "webSocket");
        C12775o.m28639i(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        C12775o.m28639i(webSocket, "webSocket");
        C12775o.m28639i(th, Constants.APPBOY_PUSH_TITLE_KEY);
    }

    public void onMessage(WebSocket webSocket, String str) {
        C12775o.m28639i(webSocket, "webSocket");
        C12775o.m28639i(str, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        C12775o.m28639i(webSocket, "webSocket");
        C12775o.m28639i(response, "response");
    }

    public void onMessage(WebSocket webSocket, C13133f fVar) {
        C12775o.m28639i(webSocket, "webSocket");
        C12775o.m28639i(fVar, "bytes");
    }
}
