package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import okhttp3.Handshake;
import p404of.C13074a;

/* compiled from: RealConnection.kt */
final class RealConnection$connectTls$2 extends C12777p implements C13074a<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    public final List<X509Certificate> invoke() {
        Handshake access$getHandshake$p = this.this$0.handshake;
        C12775o.m28636f(access$getHandshake$p);
        Iterable<Certificate> peerCertificates = access$getHandshake$p.peerCertificates();
        ArrayList arrayList = new ArrayList(C12728x.m28544v(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
