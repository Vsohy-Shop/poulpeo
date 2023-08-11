package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p406ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okio.C13127d;
import okio.C13130e;
import okio.C13145j0;

/* compiled from: RealConnection.kt */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit = 1;
    private final List<Reference<RealCall>> calls = new ArrayList();
    private final RealConnectionPool connectionPool;
    /* access modifiers changed from: private */
    public Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs = LocationRequestCompat.PASSIVE_INTERVAL;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private C13127d sink;
    /* access modifiers changed from: private */
    public Socket socket;
    private C13130e source;
    private int successCount;

    /* compiled from: RealConnection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
            C12775o.m28639i(realConnectionPool, "connectionPool");
            C12775o.m28639i(route, "route");
            C12775o.m28639i(socket, "socket");
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j);
            return realConnection;
        }
    }

    /* compiled from: RealConnection.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route2) {
        C12775o.m28639i(realConnectionPool, "connectionPool");
        C12775o.m28639i(route2, "route");
        this.connectionPool = realConnectionPool;
        this.route = route2;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake2) {
        List<Certificate> peerCertificates = handshake2.peerCertificates();
        if (!(!peerCertificates.isEmpty()) || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) peerCertificates.get(0))) {
            return false;
        }
        return true;
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) {
        int i3;
        Socket socket2;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i3 == 1 || i3 == 2) {
            socket2 = address.socketFactory().createSocket();
            C12775o.m28636f(socket2);
        } else {
            socket2 = new Socket(proxy);
        }
        this.rawSocket = socket2;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socket2.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(socket2, this.route.socketAddress(), i);
            try {
                this.source = C13145j0.m29739d(C13145j0.m29748m(socket2));
                this.sink = C13145j0.m29738c(C13145j0.m29744i(socket2));
            } catch (NullPointerException e) {
                if (C12775o.m28634d(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(C12775o.m28647q("Failed to connect to ", this.route.socketAddress()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r11) {
        /*
            r10 = this;
            okhttp3.Route r0 = r10.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r1 = r0.sslSocketFactory()
            r2 = 0
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ all -> 0x0173 }
            java.net.Socket r3 = r10.rawSocket     // Catch:{ all -> 0x0173 }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x0173 }
            okhttp3.HttpUrl r5 = r0.url()     // Catch:{ all -> 0x0173 }
            int r5 = r5.port()     // Catch:{ all -> 0x0173 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0173 }
            if (r1 == 0) goto L_0x016b
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0173 }
            okhttp3.ConnectionSpec r11 = r11.configureSecureSocket(r1)     // Catch:{ all -> 0x0168 }
            boolean r3 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0168 }
            if (r3 == 0) goto L_0x0048
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0168 }
            okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x0168 }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x0168 }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x0168 }
            java.util.List r5 = r0.protocols()     // Catch:{ all -> 0x0168 }
            r3.configureTlsExtensions(r1, r4, r5)     // Catch:{ all -> 0x0168 }
        L_0x0048:
            r1.startHandshake()     // Catch:{ all -> 0x0168 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0168 }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.Companion     // Catch:{ all -> 0x0168 }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.C12775o.m28638h(r3, r5)     // Catch:{ all -> 0x0168 }
            okhttp3.Handshake r4 = r4.get(r3)     // Catch:{ all -> 0x0168 }
            javax.net.ssl.HostnameVerifier r5 = r0.hostnameVerifier()     // Catch:{ all -> 0x0168 }
            kotlin.jvm.internal.C12775o.m28636f(r5)     // Catch:{ all -> 0x0168 }
            okhttp3.HttpUrl r7 = r0.url()     // Catch:{ all -> 0x0168 }
            java.lang.String r7 = r7.host()     // Catch:{ all -> 0x0168 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0168 }
            if (r3 != 0) goto L_0x00fc
            java.util.List r11 = r4.peerCertificates()     // Catch:{ all -> 0x0168 }
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0168 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0168 }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00d8
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0168 }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0168 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0168 }
            r4.<init>()     // Catch:{ all -> 0x0168 }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x0168 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0168 }
            r4.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x0168 }
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r0.pin(r11)     // Catch:{ all -> 0x0168 }
            r4.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x0168 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0168 }
            r4.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x0168 }
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE     // Catch:{ all -> 0x0168 }
            java.util.List r11 = r0.allSubjectAltNames(r11)     // Catch:{ all -> 0x0168 }
            r4.append(r11)     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = p454wf.C13745o.m31513h(r11, r2, r6, r2)     // Catch:{ all -> 0x0168 }
            r3.<init>(r11)     // Catch:{ all -> 0x0168 }
            throw r3     // Catch:{ all -> 0x0168 }
        L_0x00d8:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0168 }
            r2.<init>()     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0168 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0168 }
            r2.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0168 }
            r11.<init>(r0)     // Catch:{ all -> 0x0168 }
            throw r11     // Catch:{ all -> 0x0168 }
        L_0x00fc:
            okhttp3.CertificatePinner r3 = r0.certificatePinner()     // Catch:{ all -> 0x0168 }
            kotlin.jvm.internal.C12775o.m28636f(r3)     // Catch:{ all -> 0x0168 }
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x0168 }
            okhttp3.TlsVersion r6 = r4.tlsVersion()     // Catch:{ all -> 0x0168 }
            okhttp3.CipherSuite r7 = r4.cipherSuite()     // Catch:{ all -> 0x0168 }
            java.util.List r8 = r4.localCertificates()     // Catch:{ all -> 0x0168 }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x0168 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0168 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0168 }
            r10.handshake = r5     // Catch:{ all -> 0x0168 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0168 }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x0168 }
            r4.<init>(r10)     // Catch:{ all -> 0x0168 }
            r3.check$okhttp(r0, r4)     // Catch:{ all -> 0x0168 }
            boolean r11 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0168 }
            if (r11 == 0) goto L_0x013b
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0168 }
            okhttp3.internal.platform.Platform r11 = r11.get()     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = r11.getSelectedProtocol(r1)     // Catch:{ all -> 0x0168 }
        L_0x013b:
            r10.socket = r1     // Catch:{ all -> 0x0168 }
            okio.y0 r11 = okio.C13145j0.m29748m(r1)     // Catch:{ all -> 0x0168 }
            okio.e r11 = okio.C13145j0.m29739d(r11)     // Catch:{ all -> 0x0168 }
            r10.source = r11     // Catch:{ all -> 0x0168 }
            okio.w0 r11 = okio.C13145j0.m29744i(r1)     // Catch:{ all -> 0x0168 }
            okio.d r11 = okio.C13145j0.m29738c(r11)     // Catch:{ all -> 0x0168 }
            r10.sink = r11     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x015a
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x0168 }
            okhttp3.Protocol r11 = r11.get(r2)     // Catch:{ all -> 0x0168 }
            goto L_0x015c
        L_0x015a:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x0168 }
        L_0x015c:
            r10.protocol = r11     // Catch:{ all -> 0x0168 }
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r11 = r11.get()
            r11.afterHandshake(r1)
            return
        L_0x0168:
            r11 = move-exception
            r2 = r1
            goto L_0x0174
        L_0x016b:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x0173 }
            throw r11     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r11 = move-exception
        L_0x0174:
            if (r2 == 0) goto L_0x017f
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            r0.afterHandshake(r2)
        L_0x017f:
            if (r2 != 0) goto L_0x0182
            goto L_0x0185
        L_0x0182:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r2)
        L_0x0185:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Socket socket2 = this.rawSocket;
                if (socket2 != null) {
                    Util.closeQuietly(socket2);
                }
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), (Protocol) null);
            } else {
                return;
            }
        }
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            C13130e eVar = this.source;
            C12775o.m28636f(eVar);
            C13127d dVar = this.sink;
            C12775o.m28636f(dVar);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec((OkHttpClient) null, this, eVar, dVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eVar.timeout().timeout((long) i, timeUnit);
            dVar.timeout().timeout((long) i2, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            C12775o.m28636f(readResponseHeaders);
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (C13754v.m31530r("close", Response.header$default(build, "Connection", (String) null, 2, (Object) null), true)) {
                        return authenticate;
                    } else {
                        request = authenticate;
                    }
                } else {
                    throw new IOException(C12775o.m28647q("Unexpected response code for CONNECT: ", Integer.valueOf(build.code())));
                }
            } else if (eVar.mo52524f().mo52552t() && dVar.mo52524f().mo52552t()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final Request createTunnelRequest() {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", (RequestBody) null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate == null) {
            return build;
        }
        return authenticate;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol2)) {
                this.socket = this.rawSocket;
                this.protocol = protocol2;
                startHttp2(i);
                return;
            }
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            return;
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z;
        Iterable<Route> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Route route2 : iterable) {
            if (route2.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && C12775o.m28634d(this.route.socketAddress(), route2.socketAddress())) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i) {
        Socket socket2 = this.socket;
        C12775o.m28636f(socket2);
        C13130e eVar = this.source;
        C12775o.m28636f(eVar);
        C13127d dVar = this.sink;
        C12775o.m28636f(dVar);
        socket2.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket2, this.route.address().url().host(), eVar, dVar).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, (TaskRunner) null, 3, (Object) null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake2;
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            HttpUrl url = this.route.address().url();
            if (httpUrl.port() != url.port()) {
                return false;
            }
            if (C12775o.m28634d(httpUrl.host(), url.host())) {
                return true;
            }
            if (this.noCoalescedConnections || (handshake2 = this.handshake) == null) {
                return false;
            }
            C12775o.m28636f(handshake2);
            if (certificateSupportHost(httpUrl, handshake2)) {
                return true;
            }
            return false;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void cancel() {
        Socket socket2 = this.rawSocket;
        if (socket2 != null) {
            Util.closeQuietly(socket2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            okhttp3.Protocol r0 = r7.protocol
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = r10
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015c
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r11 = new okhttp3.internal.connection.ConnectionSpecSelector
            r11.<init>(r0)
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L_0x0086
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r1.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014f
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.requiresTunnel()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00bb
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00fd }
            java.net.Socket r0 = r7.rawSocket     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            r14 = r17
            r15 = r18
            goto L_0x00c2
        L_0x00bb:
            r14 = r17
            r15 = r18
            r7.connectSocket(r14, r15, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00c2:
            r6 = r20
            r7.establishProtocol(r11, r6, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Route r1 = r7.route     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r1 = r1.proxy()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Protocol r2 = r7.protocol     // Catch:{ IOException -> 0x00f9 }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f9 }
        L_0x00d8:
            okhttp3.Route r0 = r7.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.rawSocket
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.idleAtNs = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x0102:
            r6 = r20
        L_0x0104:
            java.net.Socket r1 = r7.socket
            if (r1 != 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x010c:
            java.net.Socket r1 = r7.rawSocket
            if (r1 != 0) goto L_0x0111
            goto L_0x0114
        L_0x0111:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x0114:
            r7.socket = r12
            r7.rawSocket = r12
            r7.source = r12
            r7.sink = r12
            r7.handshake = r12
            r7.protocol = r12
            r7.http2Connection = r12
            r7.allocationLimit = r10
            okhttp3.Route r1 = r7.route
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.route
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x0141
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            r13.<init>(r0)
            goto L_0x0144
        L_0x0141:
            r13.addConnectException(r0)
        L_0x0144:
            if (r21 == 0) goto L_0x014e
            boolean r0 = r11.connectionFailed(r0)
            if (r0 == 0) goto L_0x014e
            goto L_0x009a
        L_0x014e:
            throw r13
        L_0x014f:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route2, IOException iOException) {
        C12775o.m28639i(okHttpClient, "client");
        C12775o.m28639i(route2, "failedRoute");
        C12775o.m28639i(iOException, "failure");
        if (route2.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route2.address();
            address.proxySelector().connectFailed(address.url().uri(), route2.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route2);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        C12775o.m28639i(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        } else {
            if (C12775o.m28634d(address.url().host(), route().address().url().host())) {
                return true;
            }
            if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
                return false;
            }
            try {
                CertificatePinner certificatePinner = address.certificatePinner();
                C12775o.m28636f(certificatePinner);
                String host = address.url().host();
                Handshake handshake2 = handshake();
                C12775o.m28636f(handshake2);
                certificatePinner.check(host, (List<? extends Certificate>) handshake2.peerCertificates());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean isHealthy(boolean z) {
        long idleAtNs$okhttp;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket2 = this.rawSocket;
            C12775o.m28636f(socket2);
            Socket socket3 = this.socket;
            C12775o.m28636f(socket3);
            C13130e eVar = this.source;
            C12775o.m28636f(eVar);
            if (socket2.isClosed() || socket3.isClosed() || socket3.isInputShutdown() || socket3.isOutputShutdown()) {
                return false;
            }
            Http2Connection http2Connection2 = this.http2Connection;
            if (http2Connection2 != null) {
                return http2Connection2.isHealthy(nanoTime);
            }
            synchronized (this) {
                idleAtNs$okhttp = nanoTime - getIdleAtNs$okhttp();
            }
            if (idleAtNs$okhttp < IDLE_CONNECTION_HEALTHY_NS || !z) {
                return true;
            }
            return Util.isHealthy(socket3, eVar);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean isMultiplexed$okhttp() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        C12775o.m28639i(okHttpClient, "client");
        C12775o.m28639i(realInterceptorChain, "chain");
        Socket socket2 = this.socket;
        C12775o.m28636f(socket2);
        C13130e eVar = this.source;
        C12775o.m28636f(eVar);
        C13127d dVar = this.sink;
        C12775o.m28636f(dVar);
        Http2Connection http2Connection2 = this.http2Connection;
        if (http2Connection2 != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection2);
        }
        socket2.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        eVar.timeout().timeout((long) realInterceptorChain.getReadTimeoutMillis$okhttp(), timeUnit);
        dVar.timeout().timeout((long) realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, eVar, dVar);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(Exchange exchange) {
        C12775o.m28639i(exchange, "exchange");
        Socket socket2 = this.socket;
        C12775o.m28636f(socket2);
        C13130e eVar = this.source;
        C12775o.m28636f(eVar);
        C13127d dVar = this.sink;
        C12775o.m28636f(dVar);
        socket2.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealConnection$newWebSocketStreams$1(eVar, dVar, exchange);
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    public synchronized void onSettings(Http2Connection http2Connection2, Settings settings) {
        C12775o.m28639i(http2Connection2, "connection");
        C12775o.m28639i(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    public void onStream(Http2Stream http2Stream) {
        C12775o.m28639i(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    public Protocol protocol() {
        Protocol protocol2 = this.protocol;
        C12775o.m28636f(protocol2);
        return protocol2;
    }

    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    public Socket socket() {
        Socket socket2 = this.socket;
        C12775o.m28636f(socket2);
        return socket2;
    }

    public String toString() {
        Object cipherSuite;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake2 = this.handshake;
        Object obj = "none";
        if (!(handshake2 == null || (cipherSuite = handshake2.cipherSuite()) == null)) {
            obj = cipherSuite;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        C12775o.m28639i(realCall, NotificationCompat.CATEGORY_CALL);
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i = this.refusedStreamCount + 1;
                this.refusedStreamCount = i;
                if (i > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (iOException != null) {
                    connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                }
                this.routeFailureCount++;
            }
        }
    }
}
