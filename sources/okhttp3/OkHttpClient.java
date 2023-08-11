package okhttp3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.p406ws.RealWebSocket;
import okhttp3.internal.p406ws.WebSocketExtensions;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* compiled from: OkHttpClient.kt */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    /* access modifiers changed from: private */
    public static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    /* access modifiers changed from: private */
    public final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    /* compiled from: OkHttpClient.kt */
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator2 = Authenticator.NONE;
            this.authenticator = authenticator2;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator2;
            SocketFactory socketFactory2 = SocketFactory.getDefault();
            C12775o.m28638h(socketFactory2, "getDefault()");
            this.socketFactory = socketFactory2;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m38851addInterceptor(Function1<? super Interceptor.Chain, Response> function1) {
            C12775o.m28639i(function1, "block");
            return addInterceptor(new OkHttpClient$Builder$addInterceptor$2(function1));
        }

        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m38852addNetworkInterceptor(Function1<? super Interceptor.Chain, Response> function1) {
            C12775o.m28639i(function1, "block");
            return addNetworkInterceptor(new OkHttpClient$Builder$addNetworkInterceptor$2(function1));
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            C12775o.m28639i(interceptor, "interceptor");
            getInterceptors$okhttp().add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            C12775o.m28639i(interceptor, "interceptor");
            getNetworkInterceptors$okhttp().add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator2) {
            C12775o.m28639i(authenticator2, "authenticator");
            setAuthenticator$okhttp(authenticator2);
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache2) {
            setCache$okhttp(cache2);
            return this;
        }

        public final Builder callTimeout(long j, TimeUnit timeUnit) {
            C12775o.m28639i(timeUnit, "unit");
            setCallTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner2) {
            C12775o.m28639i(certificatePinner2, "certificatePinner");
            if (!C12775o.m28634d(certificatePinner2, getCertificatePinner$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setCertificatePinner$okhttp(certificatePinner2);
            return this;
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
            C12775o.m28639i(timeUnit, "unit");
            setConnectTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool2) {
            C12775o.m28639i(connectionPool2, "connectionPool");
            setConnectionPool$okhttp(connectionPool2);
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            C12775o.m28639i(list, "connectionSpecs");
            if (!C12775o.m28634d(list, getConnectionSpecs$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setConnectionSpecs$okhttp(Util.toImmutableList(list));
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar2) {
            C12775o.m28639i(cookieJar2, "cookieJar");
            setCookieJar$okhttp(cookieJar2);
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher2) {
            C12775o.m28639i(dispatcher2, "dispatcher");
            setDispatcher$okhttp(dispatcher2);
            return this;
        }

        public final Builder dns(Dns dns2) {
            C12775o.m28639i(dns2, "dns");
            if (!C12775o.m28634d(dns2, getDns$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setDns$okhttp(dns2);
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            C12775o.m28639i(eventListener, "eventListener");
            setEventListenerFactory$okhttp(Util.asFactory(eventListener));
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            C12775o.m28639i(factory, "eventListenerFactory");
            setEventListenerFactory$okhttp(factory);
            return this;
        }

        public final Builder followRedirects(boolean z) {
            setFollowRedirects$okhttp(z);
            return this;
        }

        public final Builder followSslRedirects(boolean z) {
            setFollowSslRedirects$okhttp(z);
            return this;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier2) {
            C12775o.m28639i(hostnameVerifier2, "hostnameVerifier");
            if (!C12775o.m28634d(hostnameVerifier2, getHostnameVerifier$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setHostnameVerifier$okhttp(hostnameVerifier2);
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setMinWebSocketMessageToCompress$okhttp(j);
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("minWebSocketMessageToCompress must be positive: ", Long.valueOf(j)).toString());
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(long j, TimeUnit timeUnit) {
            C12775o.m28639i(timeUnit, "unit");
            setPingInterval$okhttp(Util.checkDuration("interval", j, timeUnit));
            return this;
        }

        public final Builder protocols(List<? extends Protocol> list) {
            boolean z;
            C12775o.m28639i(list, "protocols");
            List D0 = C12686e0.m28207D0(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean z2 = false;
            if (D0.contains(protocol) || D0.contains(Protocol.HTTP_1_1)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!D0.contains(protocol) || D0.size() <= 1) {
                    z2 = true;
                }
                if (!z2) {
                    throw new IllegalArgumentException(C12775o.m28647q("protocols containing h2_prior_knowledge cannot use other protocols: ", D0).toString());
                } else if (!(!D0.contains(Protocol.HTTP_1_0))) {
                    throw new IllegalArgumentException(C12775o.m28647q("protocols must not contain http/1.0: ", D0).toString());
                } else if (!D0.contains((Object) null)) {
                    D0.remove(Protocol.SPDY_3);
                    if (!C12775o.m28634d(D0, getProtocols$okhttp())) {
                        setRouteDatabase$okhttp((RouteDatabase) null);
                    }
                    List unmodifiableList = Collections.unmodifiableList(D0);
                    C12775o.m28638h(unmodifiableList, "unmodifiableList(protocolsCopy)");
                    setProtocols$okhttp(unmodifiableList);
                    return this;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                throw new IllegalArgumentException(C12775o.m28647q("protocols must contain h2_prior_knowledge or http/1.1: ", D0).toString());
            }
        }

        public final Builder proxy(Proxy proxy2) {
            if (!C12775o.m28634d(proxy2, getProxy$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setProxy$okhttp(proxy2);
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator2) {
            C12775o.m28639i(authenticator2, "proxyAuthenticator");
            if (!C12775o.m28634d(authenticator2, getProxyAuthenticator$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setProxyAuthenticator$okhttp(authenticator2);
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector2) {
            C12775o.m28639i(proxySelector2, "proxySelector");
            if (!C12775o.m28634d(proxySelector2, getProxySelector$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setProxySelector$okhttp(proxySelector2);
            return this;
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
            C12775o.m28639i(timeUnit, "unit");
            setReadTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            setRetryOnConnectionFailure$okhttp(z);
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator2) {
            C12775o.m28639i(authenticator2, "<set-?>");
            this.authenticator = authenticator2;
        }

        public final void setCache$okhttp(Cache cache2) {
            this.cache = cache2;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
            this.certificateChainCleaner = certificateChainCleaner2;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner2) {
            C12775o.m28639i(certificatePinner2, "<set-?>");
            this.certificatePinner = certificatePinner2;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool2) {
            C12775o.m28639i(connectionPool2, "<set-?>");
            this.connectionPool = connectionPool2;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            C12775o.m28639i(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar2) {
            C12775o.m28639i(cookieJar2, "<set-?>");
            this.cookieJar = cookieJar2;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher2) {
            C12775o.m28639i(dispatcher2, "<set-?>");
            this.dispatcher = dispatcher2;
        }

        public final void setDns$okhttp(Dns dns2) {
            C12775o.m28639i(dns2, "<set-?>");
            this.dns = dns2;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            C12775o.m28639i(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier2) {
            C12775o.m28639i(hostnameVerifier2, "<set-?>");
            this.hostnameVerifier = hostnameVerifier2;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            C12775o.m28639i(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy2) {
            this.proxy = proxy2;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator2) {
            C12775o.m28639i(authenticator2, "<set-?>");
            this.proxyAuthenticator = authenticator2;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector2) {
            this.proxySelector = proxySelector2;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase2) {
            this.routeDatabase = routeDatabase2;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory2) {
            C12775o.m28639i(socketFactory2, "<set-?>");
            this.socketFactory = socketFactory2;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory2) {
            C12775o.m28639i(socketFactory2, "socketFactory");
            if (!(socketFactory2 instanceof SSLSocketFactory)) {
                if (!C12775o.m28634d(socketFactory2, getSocketFactory$okhttp())) {
                    setRouteDatabase$okhttp((RouteDatabase) null);
                }
                setSocketFactory$okhttp(socketFactory2);
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            C12775o.m28639i(sSLSocketFactory, "sslSocketFactory");
            if (!C12775o.m28634d(sSLSocketFactory, getSslSocketFactoryOrNull$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setSslSocketFactoryOrNull$okhttp(sSLSocketFactory);
            Platform.Companion companion = Platform.Companion;
            X509TrustManager trustManager = companion.get().trustManager(sSLSocketFactory);
            if (trustManager != null) {
                setX509TrustManagerOrNull$okhttp(trustManager);
                Platform platform = companion.get();
                X509TrustManager x509TrustManagerOrNull$okhttp = getX509TrustManagerOrNull$okhttp();
                C12775o.m28636f(x509TrustManagerOrNull$okhttp);
                setCertificateChainCleaner$okhttp(platform.buildCertificateChainCleaner(x509TrustManagerOrNull$okhttp));
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
            C12775o.m28639i(timeUnit, "unit");
            setWriteTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        public final Builder callTimeout(Duration duration) {
            C12775o.m28639i(duration, TypedValues.TransitionType.S_DURATION);
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder connectTimeout(Duration duration) {
            C12775o.m28639i(duration, TypedValues.TransitionType.S_DURATION);
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder pingInterval(Duration duration) {
            C12775o.m28639i(duration, TypedValues.TransitionType.S_DURATION);
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder readTimeout(Duration duration) {
            C12775o.m28639i(duration, TypedValues.TransitionType.S_DURATION);
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder writeTimeout(Duration duration) {
            C12775o.m28639i(duration, TypedValues.TransitionType.S_DURATION);
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            C12775o.m28639i(sSLSocketFactory, "sslSocketFactory");
            C12775o.m28639i(x509TrustManager, "trustManager");
            if (!C12775o.m28634d(sSLSocketFactory, getSslSocketFactoryOrNull$okhttp()) || !C12775o.m28634d(x509TrustManager, getX509TrustManagerOrNull$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setSslSocketFactoryOrNull$okhttp(sSLSocketFactory);
            setCertificateChainCleaner$okhttp(CertificateChainCleaner.Companion.get(x509TrustManager));
            setX509TrustManagerOrNull$okhttp(x509TrustManager);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            C12775o.m28639i(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            boolean unused = C12669b0.m28178B(this.interceptors, okHttpClient.interceptors());
            boolean unused2 = C12669b0.m28178B(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    /* compiled from: OkHttpClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector2;
        C12775o.m28639i(builder, "builder");
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector2 = NullProxySelector.INSTANCE;
        } else {
            proxySelector2 = builder.getProxySelector$okhttp();
            proxySelector2 = proxySelector2 == null ? ProxySelector.getDefault() : proxySelector2;
            if (proxySelector2 == null) {
                proxySelector2 = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector2;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        Iterable iterable = connectionSpecs$okhttp;
        boolean z = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ConnectionSpec) it.next()).isTls()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
            this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
            CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
            C12775o.m28636f(certificateChainCleaner$okhttp);
            this.certificateChainCleaner = certificateChainCleaner$okhttp;
            X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
            C12775o.m28636f(x509TrustManagerOrNull$okhttp);
            this.x509TrustManager = x509TrustManagerOrNull$okhttp;
            CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
            C12775o.m28636f(certificateChainCleaner$okhttp);
            this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
        } else {
            Platform.Companion companion = Platform.Companion;
            X509TrustManager platformTrustManager = companion.get().platformTrustManager();
            this.x509TrustManager = platformTrustManager;
            Platform platform = companion.get();
            C12775o.m28636f(platformTrustManager);
            this.sslSocketFactoryOrNull = platform.newSslSocketFactory(platformTrustManager);
            CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.Companion;
            C12775o.m28636f(platformTrustManager);
            CertificateChainCleaner certificateChainCleaner2 = companion2.get(platformTrustManager);
            this.certificateChainCleaner = certificateChainCleaner2;
            CertificatePinner certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
            C12775o.m28636f(certificateChainCleaner2);
            this.certificatePinner = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(certificateChainCleaner2);
        }
        verifyClientState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void verifyClientState() {
        /*
            r4 = this;
            java.util.List<okhttp3.Interceptor> r0 = r4.interceptors
            r1 = 0
            boolean r0 = r0.contains(r1)
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00d5
            java.util.List<okhttp3.Interceptor> r0 = r4.networkInterceptors
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00c1
            java.util.List<okhttp3.ConnectionSpec> r0 = r4.connectionSpecs
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r3 = 0
            if (r1 == 0) goto L_0x0028
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0028
        L_0x0026:
            r0 = r2
            goto L_0x003f
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto L_0x002c
            r0 = r3
        L_0x003f:
            if (r0 == 0) goto L_0x0090
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
            if (r0 != 0) goto L_0x0047
            r0 = r2
            goto L_0x0048
        L_0x0047:
            r0 = r3
        L_0x0048:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0086
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.certificateChainCleaner
            if (r0 != 0) goto L_0x0052
            r0 = r2
            goto L_0x0053
        L_0x0052:
            r0 = r3
        L_0x0053:
            if (r0 == 0) goto L_0x007c
            javax.net.ssl.X509TrustManager r0 = r4.x509TrustManager
            if (r0 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = r3
        L_0x005b:
            if (r2 == 0) goto L_0x0072
            okhttp3.CertificatePinner r0 = r4.certificatePinner
            okhttp3.CertificatePinner r2 = okhttp3.CertificatePinner.DEFAULT
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r2)
            if (r0 == 0) goto L_0x0068
            goto L_0x009c
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0072:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0086:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0090:
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
            if (r0 == 0) goto L_0x00b5
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.certificateChainCleaner
            if (r0 == 0) goto L_0x00a9
            javax.net.ssl.X509TrustManager r0 = r4.x509TrustManager
            if (r0 == 0) goto L_0x009d
        L_0x009c:
            return
        L_0x009d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "x509TrustManager == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "certificateChainCleaner == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sslSocketFactory == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c1:
            java.lang.String r0 = "Null network interceptor: "
            java.util.List r1 = r4.networkInterceptors()
            java.lang.String r0 = kotlin.jvm.internal.C12775o.m28647q(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00d5:
            java.lang.String r0 = "Null interceptor: "
            java.util.List r1 = r4.interceptors()
            java.lang.String r0 = kotlin.jvm.internal.C12775o.m28647q(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.verifyClientState():void");
    }

    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m38825deprecated_authenticator() {
        return this.authenticator;
    }

    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m38826deprecated_cache() {
        return this.cache;
    }

    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m38827deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m38828deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m38829deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m38830deprecated_connectionPool() {
        return this.connectionPool;
    }

    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m38831deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m38832deprecated_cookieJar() {
        return this.cookieJar;
    }

    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m38833deprecated_dispatcher() {
        return this.dispatcher;
    }

    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m38834deprecated_dns() {
        return this.dns;
    }

    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m38835deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m38836deprecated_followRedirects() {
        return this.followRedirects;
    }

    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m38837deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m38838deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m38839deprecated_interceptors() {
        return this.interceptors;
    }

    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m38840deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m38841deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m38842deprecated_protocols() {
        return this.protocols;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m38843deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m38844deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m38845deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m38846deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m38847deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m38848deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m38849deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m38850deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Call newCall(Request request) {
        C12775o.m28639i(request, "request");
        return new RealCall(this, request, false);
    }

    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        C12775o.m28639i(request, "request");
        C12775o.m28639i(webSocketListener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, webSocketListener, new Random(), (long) this.pingIntervalMillis, (WebSocketExtensions) null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
