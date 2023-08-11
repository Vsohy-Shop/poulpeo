package okhttp3;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import p404of.C13074a;

/* compiled from: Handshake.kt */
public final class Handshake {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final Lazy peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public Handshake(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<? extends Certificate> list, C13074a<? extends List<? extends Certificate>> aVar) {
        C12775o.m28639i(tlsVersion2, "tlsVersion");
        C12775o.m28639i(cipherSuite2, "cipherSuite");
        C12775o.m28639i(list, "localCertificates");
        C12775o.m28639i(aVar, "peerCertificatesFn");
        this.tlsVersion = tlsVersion2;
        this.cipherSuite = cipherSuite2;
        this.localCertificates = list;
        this.peerCertificates$delegate = C11901h.m25690b(new Handshake$peerCertificates$2(aVar));
    }

    public static final Handshake get(SSLSession sSLSession) {
        return Companion.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C12775o.m28638h(type, JSONAPIResourceIdSerializer.FIELD_TYPE);
        return type;
    }

    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m38782deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m38783deprecated_localCertificates() {
        return this.localCertificates;
    }

    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m38784deprecated_localPrincipal() {
        return localPrincipal();
    }

    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m38785deprecated_peerCertificates() {
        return peerCertificates();
    }

    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m38786deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m38787deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion != this.tlsVersion || !C12775o.m28634d(handshake.cipherSuite, this.cipherSuite) || !C12775o.m28634d(handshake.peerCertificates(), peerCertificates()) || !C12775o.m28634d(handshake.localCertificates, this.localCertificates)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        X509Certificate x509Certificate;
        Object b0 = C12686e0.m28223b0(this.localCertificates);
        if (b0 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) b0;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        X509Certificate x509Certificate;
        Object b0 = C12686e0.m28223b0(peerCertificates());
        if (b0 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) b0;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        Iterable<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(C12728x.m28544v(peerCertificates, 10));
        for (Certificate name : peerCertificates) {
            arrayList.add(getName(name));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        Iterable<Certificate> iterable = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(C12728x.m28544v(iterable, 10));
        for (Certificate name2 : iterable) {
            arrayList2.add(getName(name2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    public static final Handshake get(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion2, cipherSuite2, list, list2);
    }

    /* compiled from: Handshake.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return C12726w.m28524k();
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m38788deprecated_get(SSLSession sSLSession) {
            C12775o.m28639i(sSLSession, "sslSession");
            return get(sSLSession);
        }

        public final Handshake get(SSLSession sSLSession) {
            List<Certificate> list;
            C12775o.m28639i(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(C12775o.m28634d(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : C12775o.m28634d(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                    CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null".toString());
                    } else if (!C12775o.m28634d("NONE", protocol)) {
                        TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                        try {
                            list = toImmutableList(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = C12726w.m28524k();
                        }
                        return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException(C12775o.m28647q("cipherSuite == ", cipherSuite));
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            C12775o.m28639i(tlsVersion, "tlsVersion");
            C12775o.m28639i(cipherSuite, "cipherSuite");
            C12775o.m28639i(list, "peerCertificates");
            C12775o.m28639i(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }
}
