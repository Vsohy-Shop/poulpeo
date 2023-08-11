package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Handshake.kt */
final class Handshake$Companion$get$1 extends C12777p implements C13074a<List<? extends Certificate>> {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
