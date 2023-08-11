package p464yd;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p111h6.C8012n;
import p470zd.C14087b;
import p470zd.C14091d;
import p470zd.C14102g;

/* renamed from: yd.m */
/* compiled from: OkHttpTlsUpgrader */
final class C13911m {

    /* renamed from: a */
    static final List<C14102g> f22808a = Collections.unmodifiableList(Arrays.asList(new C14102g[]{C14102g.HTTP_2}));

    /* renamed from: a */
    static String m32135a(String str) {
        if (!str.startsWith("[") || !str.endsWith("]")) {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }

    /* renamed from: b */
    public static SSLSocket m32136b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, C14087b bVar) {
        List<C14102g> list;
        C8012n.m15756o(sSLSocketFactory, "sslSocketFactory");
        C8012n.m15756o(socket, "socket");
        C8012n.m15756o(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        bVar.mo53845c(sSLSocket, false);
        C13907j e = C13907j.m32117e();
        if (bVar.mo53848f()) {
            list = f22808a;
        } else {
            list = null;
        }
        String h = e.mo53636h(sSLSocket, str, list);
        List<C14102g> list2 = f22808a;
        boolean contains = list2.contains(C14102g.m32739a(h));
        C8012n.m15764w(contains, "Only " + list2 + " are supported, but negotiated protocol is %s", h);
        if (hostnameVerifier == null) {
            hostnameVerifier = C14091d.f23129a;
        }
        if (hostnameVerifier.verify(m32135a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
