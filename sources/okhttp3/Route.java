package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.C12775o;

/* compiled from: Route.kt */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address2, Proxy proxy2, InetSocketAddress inetSocketAddress) {
        C12775o.m28639i(address2, "address");
        C12775o.m28639i(proxy2, "proxy");
        C12775o.m28639i(inetSocketAddress, "socketAddress");
        this.address = address2;
        this.proxy = proxy2;
        this.socketAddress = inetSocketAddress;
    }

    /* renamed from: -deprecated_address  reason: not valid java name */
    public final Address m38871deprecated_address() {
        return this.address;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m38872deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_socketAddress  reason: not valid java name */
    public final InetSocketAddress m38873deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (!C12775o.m28634d(route.address, this.address) || !C12775o.m28634d(route.proxy, this.proxy) || !C12775o.m28634d(route.socketAddress, this.socketAddress)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        if (this.address.sslSocketFactory() == null || this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
