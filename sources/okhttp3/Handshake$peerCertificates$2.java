package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Handshake.kt */
final class Handshake$peerCertificates$2 extends C12777p implements C13074a<List<? extends Certificate>> {
    final /* synthetic */ C13074a<List<Certificate>> $peerCertificatesFn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Handshake$peerCertificates$2(C13074a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    public final List<Certificate> invoke() {
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return C12726w.m28524k();
        }
    }
}
