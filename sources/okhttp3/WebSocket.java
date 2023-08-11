package okhttp3;

import okio.C13133f;

/* compiled from: WebSocket.kt */
public interface WebSocket {

    /* compiled from: WebSocket.kt */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(C13133f fVar);
}
