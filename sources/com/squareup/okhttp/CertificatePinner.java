package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.C13133f;

public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final Map<String, Set<C13133f>> hostnameToPins;

    public static final class Builder {
        /* access modifiers changed from: private */
        public final Map<String, Set<C13133f>> hostnameToPins = new LinkedHashMap();

        public Builder add(String str, String... strArr) {
            if (str != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Set put = this.hostnameToPins.put(str, Collections.unmodifiableSet(linkedHashSet));
                if (put != null) {
                    linkedHashSet.addAll(put);
                }
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    if (str2.startsWith("sha1/")) {
                        C13133f c = C13133f.m29651c(str2.substring(5));
                        if (c != null) {
                            linkedHashSet.add(c);
                            i++;
                        } else {
                            throw new IllegalArgumentException("pins must be base64: " + str2);
                        }
                    } else {
                        throw new IllegalArgumentException("pins must start with 'sha1/': " + str2);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("hostname == null");
        }

        public CertificatePinner build() {
            return new CertificatePinner(this);
        }
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + sha1((X509Certificate) certificate).mo52597a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static C13133f sha1(X509Certificate x509Certificate) {
        return Util.sha1(C13133f.m29655v(x509Certificate.getPublicKey().getEncoded()));
    }

    public void check(String str, List<Certificate> list) {
        Set<C13133f> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (!findMatchingPins.contains(sha1((X509Certificate) list.get(i)))) {
                    i++;
                } else {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(pin(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (C13133f a : findMatchingPins) {
                sb.append("\n    sha1/");
                sb.append(a.mo52597a());
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public Set<C13133f> findMatchingPins(String str) {
        Set<C13133f> set;
        Set<C13133f> set2 = this.hostnameToPins.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            set = this.hostnameToPins.get("*." + str.substring(indexOf + 1));
        } else {
            set = null;
        }
        if (set2 == null && set == null) {
            return null;
        }
        if (set2 != null && set != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set2);
            linkedHashSet.addAll(set);
            return linkedHashSet;
        } else if (set2 != null) {
            return set2;
        } else {
            return set;
        }
    }

    private CertificatePinner(Builder builder) {
        this.hostnameToPins = Util.immutableMap(builder.hostnameToPins);
    }

    public void check(String str, Certificate... certificateArr) {
        check(str, (List<Certificate>) Arrays.asList(certificateArr));
    }
}
