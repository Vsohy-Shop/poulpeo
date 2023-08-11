package p458xd;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p111h6.C8012n;

/* renamed from: xd.v */
/* compiled from: InternalChannelz */
public final class C13832v {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Logger f22305f = Logger.getLogger(C13832v.class.getName());

    /* renamed from: g */
    private static final C13832v f22306g = new C13832v();

    /* renamed from: a */
    private final ConcurrentNavigableMap<Long, C13840y<Object>> f22307a = new ConcurrentSkipListMap();

    /* renamed from: b */
    private final ConcurrentNavigableMap<Long, C13840y<Object>> f22308b = new ConcurrentSkipListMap();

    /* renamed from: c */
    private final ConcurrentMap<Long, C13840y<Object>> f22309c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ConcurrentMap<Long, C13840y<Object>> f22310d = new ConcurrentHashMap();

    /* renamed from: e */
    private final ConcurrentMap<Long, Object> f22311e = new ConcurrentHashMap();

    /* renamed from: xd.v$b */
    /* compiled from: InternalChannelz */
    public static final class C13834b {

        /* renamed from: a */
        public final C13835c f22312a;

        public C13834b(C13835c cVar) {
            this.f22312a = (C13835c) C8012n.m15755n(cVar);
        }
    }

    /* renamed from: xd.v$c */
    /* compiled from: InternalChannelz */
    public static final class C13835c {

        /* renamed from: a */
        public final String f22313a;

        /* renamed from: b */
        public final Certificate f22314b;

        /* renamed from: c */
        public final Certificate f22315c;

        public C13835c(SSLSession sSLSession) {
            Certificate certificate;
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate2 = null;
            if (localCertificates != null) {
                certificate = localCertificates[0];
            } else {
                certificate = null;
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                C13832v.f22305f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", new Object[]{sSLSession.getPeerHost()}), e);
            }
            this.f22313a = cipherSuite;
            this.f22314b = certificate;
            this.f22315c = certificate2;
        }
    }

    /* renamed from: b */
    private static <T extends C13840y<?>> void m31781b(Map<Long, T> map, T t) {
        C13840y yVar = (C13840y) map.put(Long.valueOf(t.mo49701f().mo53522d()), t);
    }

    /* renamed from: f */
    public static long m31782f(C13776a0 a0Var) {
        return a0Var.mo49701f().mo53522d();
    }

    /* renamed from: g */
    public static C13832v m31783g() {
        return f22306g;
    }

    /* renamed from: h */
    private static <T extends C13840y<?>> void m31784h(Map<Long, T> map, T t) {
        C13840y yVar = (C13840y) map.remove(Long.valueOf(m31782f(t)));
    }

    /* renamed from: c */
    public void mo53508c(C13840y<Object> yVar) {
        m31781b(this.f22310d, yVar);
    }

    /* renamed from: d */
    public void mo53509d(C13840y<Object> yVar) {
        m31781b(this.f22308b, yVar);
    }

    /* renamed from: e */
    public void mo53510e(C13840y<Object> yVar) {
        m31781b(this.f22309c, yVar);
    }

    /* renamed from: i */
    public void mo53511i(C13840y<Object> yVar) {
        m31784h(this.f22310d, yVar);
    }

    /* renamed from: j */
    public void mo53512j(C13840y<Object> yVar) {
        m31784h(this.f22308b, yVar);
    }

    /* renamed from: k */
    public void mo53513k(C13840y<Object> yVar) {
        m31784h(this.f22309c, yVar);
    }
}
