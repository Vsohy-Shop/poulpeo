package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* compiled from: RouteSelector.kt */
public final class RouteSelector {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses = C12726w.m28524k();
    private int nextProxyIndex;
    private final List<Route> postponedRoutes = new ArrayList();
    private List<? extends Proxy> proxies = C12726w.m28524k();
    private final RouteDatabase routeDatabase;

    /* compiled from: RouteSelector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            C12775o.m28639i(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                C12775o.m28638h(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            C12775o.m28638h(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* compiled from: RouteSelector.kt */
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            C12775o.m28639i(list, "routes");
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            if (this.nextRouteIndex < this.routes.size()) {
                return true;
            }
            return false;
        }

        public final Route next() {
            if (hasNext()) {
                List<Route> list = this.routes;
                int i = this.nextRouteIndex;
                this.nextRouteIndex = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address address2, RouteDatabase routeDatabase2, Call call2, EventListener eventListener2) {
        C12775o.m28639i(address2, "address");
        C12775o.m28639i(routeDatabase2, "routeDatabase");
        C12775o.m28639i(call2, NotificationCompat.CATEGORY_CALL);
        C12775o.m28639i(eventListener2, "eventListener");
        this.address = address2;
        this.routeDatabase = routeDatabase2;
        this.call = call2;
        this.eventListener = eventListener2;
        resetNextProxy(address2.url(), address2.proxy());
    }

    private final boolean hasNextProxy() {
        if (this.nextProxyIndex < this.proxies.size()) {
            return true;
        }
        return false;
    }

    private final Proxy nextProxy() {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i = this.nextProxyIndex;
            this.nextProxyIndex = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) {
        String str;
        int i;
        List<InetAddress> list;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.address.url().host();
            i = this.address.url().port();
        } else {
            SocketAddress address2 = proxy.address();
            if (address2 instanceof InetSocketAddress) {
                Companion companion = Companion;
                C12775o.m28638h(address2, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                str = companion.getSocketHost(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(C12775o.m28647q("Proxy.address() is not an InetSocketAddress: ", address2.getClass()).toString());
            }
        }
        boolean z = false;
        if (1 <= i && i < 65536) {
            z = true;
        }
        if (!z) {
            throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            if (Util.canParseAsIpAddress(str)) {
                list = C12723v.m28509d(InetAddress.getByName(str));
            } else {
                this.eventListener.dnsStart(this.call, str);
                list = this.address.dns().lookup(str);
                if (!list.isEmpty()) {
                    this.eventListener.dnsEnd(this.call, str, list);
                } else {
                    throw new UnknownHostException(this.address.dns() + " returned no addresses for " + str);
                }
            }
            for (InetAddress inetSocketAddress2 : list) {
                arrayList.add(new InetSocketAddress(inetSocketAddress2, i));
            }
        }
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        List<Proxy> resetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.proxies = resetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, resetNextProxy$selectProxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        boolean z;
        if (proxy != null) {
            return C12723v.m28509d(proxy);
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> select = routeSelector.address.proxySelector().select(uri);
        Collection collection = select;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        C12775o.m28638h(select, "proxiesOrNull");
        return Util.toImmutableList(select);
    }

    public final boolean hasNext() {
        if (hasNextProxy() || (!this.postponedRoutes.isEmpty())) {
            return true;
        }
        return false;
    }

    public final Selection next() {
        if (hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (hasNextProxy()) {
                Proxy nextProxy = nextProxy();
                for (InetSocketAddress route : this.inetSocketAddresses) {
                    Route route2 = new Route(this.address, nextProxy, route);
                    if (this.routeDatabase.shouldPostpone(route2)) {
                        this.postponedRoutes.add(route2);
                    } else {
                        arrayList.add(route2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                boolean unused = C12669b0.m28178B(arrayList, this.postponedRoutes);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }
}
