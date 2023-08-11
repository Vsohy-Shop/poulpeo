package p364io.grpc.internal;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8019r;
import p458xd.C13792f0;
import p458xd.C13794g0;
import p458xd.C13829u;

/* renamed from: io.grpc.internal.u1 */
/* compiled from: ProxyDetectorImpl */
class C12443u1 implements C13794g0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Logger f19853d = Logger.getLogger(C12443u1.class.getName());

    /* renamed from: e */
    private static final C12446c f19854e = new C12444a();

    /* renamed from: f */
    private static final C8019r<ProxySelector> f19855f = new C12445b();

    /* renamed from: a */
    private final C8019r<ProxySelector> f19856a;

    /* renamed from: b */
    private final C12446c f19857b;

    /* renamed from: c */
    private final InetSocketAddress f19858c;

    /* renamed from: io.grpc.internal.u1$a */
    /* compiled from: ProxyDetectorImpl */
    class C12444a implements C12446c {
        C12444a() {
        }

        /* renamed from: a */
        public PasswordAuthentication mo50104a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i, "");
            } catch (MalformedURLException unused) {
                C12443u1.f19853d.log(Level.WARNING, String.format("failed to create URL for Authenticator: %s %s", new Object[]{str2, str}));
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* renamed from: io.grpc.internal.u1$b */
    /* compiled from: ProxyDetectorImpl */
    class C12445b implements C8019r<ProxySelector> {
        C12445b() {
        }

        /* renamed from: a */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* renamed from: io.grpc.internal.u1$c */
    /* compiled from: ProxyDetectorImpl */
    interface C12446c {
        /* renamed from: a */
        PasswordAuthentication mo50104a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4);
    }

    public C12443u1() {
        this(f19855f, f19854e, System.getenv("GRPC_PROXY_EXP"));
    }

    /* renamed from: c */
    private C13792f0 m27470c(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            try {
                URI uri = new URI("https", (String) null, C12404r0.m27329h(inetSocketAddress), inetSocketAddress.getPort(), (String) null, (String) null, (String) null);
                ProxySelector proxySelector = this.f19856a.get();
                if (proxySelector == null) {
                    f19853d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f19853d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a = this.f19857b.mo50104a(C12404r0.m27329h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", (String) null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C13829u.C13831b c = C13829u.m31770e().mo53506d(inetSocketAddress).mo53505c(inetSocketAddress2);
                if (a == null) {
                    return c.mo53503a();
                }
                C13829u.C13831b e = c.mo53507e(a.getUserName());
                if (a.getPassword() != null) {
                    str = new String(a.getPassword());
                }
                return e.mo53504b(str).mo53503a();
            } catch (URISyntaxException e2) {
                f19853d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", e2);
                return null;
            }
        } catch (Throwable th) {
            f19853d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    /* renamed from: d */
    private static InetSocketAddress m27471d(String str) {
        int i;
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        if (split.length > 1) {
            i = Integer.parseInt(split[1]);
        } else {
            i = 80;
        }
        f19853d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], i);
    }

    /* renamed from: a */
    public C13792f0 mo50044a(SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (this.f19858c != null) {
            return C13829u.m31770e().mo53505c(this.f19858c).mo53506d((InetSocketAddress) socketAddress).mo53503a();
        }
        return m27470c((InetSocketAddress) socketAddress);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [h6.r<java.net.ProxySelector>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C12443u1(p111h6.C8019r<java.net.ProxySelector> r1, p364io.grpc.internal.C12443u1.C12446c r2, java.lang.String r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p111h6.C8012n.m15755n(r1)
            h6.r r1 = (p111h6.C8019r) r1
            r0.f19856a = r1
            java.lang.Object r1 = p111h6.C8012n.m15755n(r2)
            io.grpc.internal.u1$c r1 = (p364io.grpc.internal.C12443u1.C12446c) r1
            r0.f19857b = r1
            if (r3 == 0) goto L_0x001c
            java.net.InetSocketAddress r1 = m27471d(r3)
            r0.f19858c = r1
            goto L_0x001f
        L_0x001c:
            r1 = 0
            r0.f19858c = r1
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12443u1.<init>(h6.r, io.grpc.internal.u1$c, java.lang.String):void");
    }
}
