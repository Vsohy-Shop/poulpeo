package okhttp3.internal.tls;

import androidx.webkit.ProxyConfig;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.C13116a1;

/* compiled from: OkHostnameVerifier.kt */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C12775o.m28638h(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C12726w.m28524k();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (C12775o.m28634d(next.get(0), Integer.valueOf(i))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C12726w.m28524k();
        }
    }

    private final boolean isAscii(String str) {
        if (str.length() == ((int) C13116a1.m29510b(str, 0, 0, 3, (Object) null))) {
            return true;
        }
        return false;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        Iterable<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && ((Collection) subjectAltNames).isEmpty()) {
            return false;
        }
        for (String verifyHostname : subjectAltNames) {
            if (INSTANCE.verifyHostname(asciiToLowercase, verifyHostname)) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        Iterable<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && ((Collection) subjectAltNames).isEmpty()) {
            return false;
        }
        for (String canonicalHost2 : subjectAltNames) {
            if (C12775o.m28634d(canonicalHost, HostnamesKt.toCanonicalHost(canonicalHost2))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        C12775o.m28639i(x509Certificate, "certificate");
        return C12686e0.m28236o0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C12775o.m28639i(str, "host");
        C12775o.m28639i(sSLSession, "session");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        C12775o.m28639i(str, "host");
        C12775o.m28639i(x509Certificate, "certificate");
        if (Util.canParseAsIpAddress(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !C13754v.m31525E(str, ".", false, 2, (Object) null) && !C13754v.m31529q(str, "..", false, 2, (Object) null)) {
            if (!(str2 == null || str2.length() == 0) && !C13754v.m31525E(str2, ".", false, 2, (Object) null) && !C13754v.m31529q(str2, "..", false, 2, (Object) null)) {
                if (!C13754v.m31529q(str, ".", false, 2, (Object) null)) {
                    str = C12775o.m28647q(str, ".");
                }
                String str3 = str;
                if (!C13754v.m31529q(str2, ".", false, 2, (Object) null)) {
                    str2 = C12775o.m28647q(str2, ".");
                }
                String asciiToLowercase = asciiToLowercase(str2);
                if (!C13755w.m31552J(asciiToLowercase, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null)) {
                    return C12775o.m28634d(str3, asciiToLowercase);
                }
                if (!C13754v.m31525E(asciiToLowercase, "*.", false, 2, (Object) null) || C13755w.m31570V(asciiToLowercase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < asciiToLowercase.length() || C12775o.m28634d("*.", asciiToLowercase)) {
                    return false;
                }
                String substring = asciiToLowercase.substring(1);
                C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
                if (!C13754v.m31529q(str3, substring, false, 2, (Object) null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                return length <= 0 || C13755w.m31575a0(str3, '.', length + -1, false, 4, (Object) null) == -1;
            }
        }
        return false;
    }
}
