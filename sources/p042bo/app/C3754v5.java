package p042bo.app;

import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.v5 */
public final class C3754v5 extends SSLSocketFactory {

    /* renamed from: b */
    public static final C3755a f2713b = new C3755a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private SSLSocketFactory f2714a;

    /* renamed from: bo.app.v5$a */
    public static final class C3755a {
        public /* synthetic */ C3755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3755a() {
        }
    }

    /* renamed from: bo.app.v5$b */
    static final class C3756b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ List<String> f2715b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3756b(List<String> list) {
            super(0);
            this.f2715b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Enabling SSL protocols: ", this.f2715b);
        }
    }

    public C3754v5() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        C12775o.m28638h(socketFactory, "sslContext.socketFactory");
        this.f2714a = socketFactory;
    }

    /* renamed from: a */
    private final Socket m4024a(Socket socket) {
        Socket socket2 = socket;
        if (socket2 instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket2;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            C12775o.m28638h(supportedProtocols, "socket.supportedProtocols");
            int length = supportedProtocols.length;
            int i = 0;
            while (i < length) {
                String str = supportedProtocols[i];
                i++;
                if (!C12775o.m28634d(str, "SSLv3")) {
                    C12775o.m28638h(str, "protocol");
                    arrayList.add(str);
                }
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3756b(arrayList), 6, (Object) null);
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                sSLSocket.setEnabledProtocols((String[]) array);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return socket2;
    }

    public Socket createSocket() {
        Socket createSocket = this.f2714a.createSocket();
        C12775o.m28638h(createSocket, "internalSSLSocketFactory.createSocket()");
        return m4024a(createSocket);
    }

    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f2714a.getDefaultCipherSuites();
        C12775o.m28638h(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f2714a.getSupportedCipherSuites();
        C12775o.m28638h(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        C12775o.m28639i(socket, "socket");
        C12775o.m28639i(str, "host");
        Socket createSocket = this.f2714a.createSocket(socket, str, i, z);
        C12775o.m28638h(createSocket, "internalSSLSocketFactory…t, host, port, autoClose)");
        return m4024a(createSocket);
    }

    public Socket createSocket(String str, int i) {
        C12775o.m28639i(str, "host");
        Socket createSocket = this.f2714a.createSocket(str, i);
        C12775o.m28638h(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return m4024a(createSocket);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        C12775o.m28639i(str, "host");
        C12775o.m28639i(inetAddress, "localHost");
        Socket createSocket = this.f2714a.createSocket(str, i, inetAddress, i2);
        C12775o.m28638h(createSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return m4024a(createSocket);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        C12775o.m28639i(inetAddress, "host");
        Socket createSocket = this.f2714a.createSocket(inetAddress, i);
        C12775o.m28638h(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return m4024a(createSocket);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        C12775o.m28639i(inetAddress, "address");
        C12775o.m28639i(inetAddress2, "localAddress");
        Socket createSocket = this.f2714a.createSocket(inetAddress, i, inetAddress2, i2);
        C12775o.m28638h(createSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return m4024a(createSocket);
    }
}
