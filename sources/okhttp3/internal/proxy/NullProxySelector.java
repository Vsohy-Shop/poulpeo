package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: NullProxySelector.kt */
public final class NullProxySelector extends ProxySelector {
    public static final NullProxySelector INSTANCE = new NullProxySelector();

    private NullProxySelector() {
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return C12723v.m28509d(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
