package okhttp3;

import androidx.webkit.ProxyConfig;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.C13133f;
import p404of.C13074a;

/* compiled from: CertificatePinner.kt */
public final class CertificatePinner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: CertificatePinner.kt */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            C12775o.m28639i(str, "pattern");
            C12775o.m28639i(strArr, "pins");
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                getPins().add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(C12686e0.m28209F0(this.pins), (CertificateChainCleaner) null, 2, (DefaultConstructorMarker) null);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String pin(Certificate certificate) {
            C12775o.m28639i(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return C12775o.m28647q("sha256/", sha256Hash((X509Certificate) certificate).mo52597a());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final C13133f sha1Hash(X509Certificate x509Certificate) {
            C12775o.m28639i(x509Certificate, "<this>");
            C13133f.C13134a aVar = C13133f.f20903e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C12775o.m28638h(encoded, "publicKey.encoded");
            return C13133f.C13134a.m29686g(aVar, encoded, 0, 0, 3, (Object) null).mo52588E();
        }

        public final C13133f sha256Hash(X509Certificate x509Certificate) {
            C12775o.m28639i(x509Certificate, "<this>");
            C13133f.C13134a aVar = C13133f.f20903e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C12775o.m28638h(encoded, "publicKey.encoded");
            return C13133f.C13134a.m29686g(aVar, encoded, 0, 0, 3, (Object) null).mo52589F();
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class Pin {
        private final C13133f hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            boolean z;
            C12775o.m28639i(str, "pattern");
            C12775o.m28639i(str2, "pin");
            if ((!C13754v.m31525E(str, "*.", false, 2, (Object) null) || C13755w.m31571W(str, ProxyConfig.MATCH_ALL_SCHEMES, 1, false, 4, (Object) null) != -1) && ((!C13754v.m31525E(str, "**.", false, 2, (Object) null) || C13755w.m31571W(str, ProxyConfig.MATCH_ALL_SCHEMES, 2, false, 4, (Object) null) != -1) && C13755w.m31571W(str, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != -1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                String canonicalHost = HostnamesKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (C13754v.m31525E(str2, "sha1/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha1";
                        C13133f.C13134a aVar = C13133f.f20903e;
                        String substring = str2.substring(5);
                        C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
                        C13133f a = aVar.mo52619a(substring);
                        if (a != null) {
                            this.hash = a;
                            return;
                        }
                        throw new IllegalArgumentException(C12775o.m28647q("Invalid pin hash: ", str2));
                    } else if (C13754v.m31525E(str2, "sha256/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha256";
                        C13133f.C13134a aVar2 = C13133f.f20903e;
                        String substring2 = str2.substring(7);
                        C12775o.m28638h(substring2, "this as java.lang.String).substring(startIndex)");
                        C13133f a2 = aVar2.mo52619a(substring2);
                        if (a2 != null) {
                            this.hash = a2;
                            return;
                        }
                        throw new IllegalArgumentException(C12775o.m28647q("Invalid pin hash: ", str2));
                    } else {
                        throw new IllegalArgumentException(C12775o.m28647q("pins must start with 'sha256/' or 'sha1/': ", str2));
                    }
                } else {
                    throw new IllegalArgumentException(C12775o.m28647q("Invalid pattern: ", str));
                }
            } else {
                throw new IllegalArgumentException(C12775o.m28647q("Unexpected pattern: ", str).toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (C12775o.m28634d(this.pattern, pin.pattern) && C12775o.m28634d(this.hashAlgorithm, pin.hashAlgorithm) && C12775o.m28634d(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final C13133f getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            C12775o.m28639i(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (C12775o.m28634d(str, "sha256")) {
                return C12775o.m28634d(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (C12775o.m28634d(str, "sha1")) {
                return C12775o.m28634d(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            C12775o.m28639i(str, "hostname");
            if (C13754v.m31525E(this.pattern, "**.", false, 2, (Object) null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!C13754v.m31534v(str, str.length() - length, this.pattern, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (!(length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    return false;
                }
            } else if (!C13754v.m31525E(this.pattern, "*.", false, 2, (Object) null)) {
                return C12775o.m28634d(str, this.pattern);
            } else {
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!C13754v.m31534v(str, str.length() - length3, this.pattern, 1, length3, false, 16, (Object) null)) {
                    return false;
                }
                if (C13755w.m31575a0(str, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.mo52597a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        C12775o.m28639i(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final C13133f sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final C13133f sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) {
        C12775o.m28639i(str, "hostname");
        C12775o.m28639i(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, C13074a<? extends List<? extends X509Certificate>> aVar) {
        C12775o.m28639i(str, "hostname");
        C12775o.m28639i(aVar, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator<Pin> it = findMatchingPins.iterator();
                C13133f fVar = null;
                C13133f fVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        Pin next = it.next();
                        String hashAlgorithm = next.getHashAlgorithm();
                        if (C12775o.m28634d(hashAlgorithm, "sha256")) {
                            if (fVar == null) {
                                fVar = Companion.sha256Hash(x509Certificate);
                            }
                            if (C12775o.m28634d(next.getHash(), fVar)) {
                                return;
                            }
                        } else if (C12775o.m28634d(hashAlgorithm, "sha1")) {
                            if (fVar2 == null) {
                                fVar2 = Companion.sha1Hash(x509Certificate);
                            }
                            if (C12775o.m28634d(next.getHash(), fVar2)) {
                                return;
                            }
                        } else {
                            throw new AssertionError(C12775o.m28647q("unsupported hashAlgorithm: ", next.getHashAlgorithm()));
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(Companion.pin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Pin append : findMatchingPins) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (!C12775o.m28634d(certificatePinner.pins, this.pins) || !C12775o.m28634d(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        C12775o.m28639i(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> k = C12726w.m28524k();
        for (T next : set) {
            if (((Pin) next).matchesHostname(str)) {
                if (k.isEmpty()) {
                    k = new ArrayList<>();
                }
                C12772l0.m28611c(k).add(next);
            }
        }
        return k;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i;
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        if (certificateChainCleaner2 != null) {
            i = certificateChainCleaner2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
        C12775o.m28639i(certificateChainCleaner2, "certificateChainCleaner");
        if (C12775o.m28634d(this.certificateChainCleaner, certificateChainCleaner2)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner2);
    }

    public final void check(String str, Certificate... certificateArr) {
        C12775o.m28639i(str, "hostname");
        C12775o.m28639i(certificateArr, "peerCertificates");
        check(str, (List<? extends Certificate>) C12710p.m28405g0(certificateArr));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner2);
    }
}
