package com.squareup.okhttp.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class CertificateChainCleaner {
    private final TrustRootIndex trustRootIndex;

    public CertificateChainCleaner(TrustRootIndex trustRootIndex2) {
        this.trustRootIndex = trustRootIndex2;
    }

    private boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public List<Certificate> clean(List<Certificate> list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        while (true) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate findByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                return arrayList;
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                X509Certificate x509Certificate2 = (X509Certificate) it.next();
                if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN()) && verifySignature(x509Certificate, x509Certificate2)) {
                    it.remove();
                    arrayList.add(x509Certificate2);
                }
            }
            throw new SSLPeerUnverifiedException("Failed to find a cert that signed " + x509Certificate);
        }
    }
}
