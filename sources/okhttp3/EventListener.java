package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EventListener.kt */
public abstract class EventListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    /* compiled from: EventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(response, "response");
    }

    public void cacheMiss(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void callEnd(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void callFailed(Call call, IOException iOException) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(iOException, "ioe");
    }

    public void callStart(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void canceled(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(inetSocketAddress, "inetSocketAddress");
        C12775o.m28639i(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(inetSocketAddress, "inetSocketAddress");
        C12775o.m28639i(proxy, "proxy");
        C12775o.m28639i(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(inetSocketAddress, "inetSocketAddress");
        C12775o.m28639i(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(str, "domainName");
        C12775o.m28639i(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(httpUrl, "url");
        C12775o.m28639i(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void requestBodyStart(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void requestFailed(Call call, IOException iOException) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(request, "request");
    }

    public void requestHeadersStart(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyEnd(Call call, long j) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseBodyStart(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void responseFailed(Call call, IOException iOException) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(response, "response");
    }

    public void responseHeadersStart(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void satisfactionFailure(Call call, Response response) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }

    public void secureConnectStart(Call call) {
        C12775o.m28639i(call, NotificationCompat.CATEGORY_CALL);
    }
}
