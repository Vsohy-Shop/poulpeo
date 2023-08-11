package p470zd;

import androidx.webkit.ProxyConfig;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: zd.d */
/* compiled from: OkHostnameVerifier */
public final class C14091d implements HostnameVerifier {

    /* renamed from: a */
    public static final C14091d f23129a = new C14091d();

    /* renamed from: b */
    private static final Pattern f23130b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C14091d() {
    }

    /* renamed from: a */
    private static List<String> m32700a(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: c */
    static boolean m32701c(String str) {
        return f23130b.matcher(str).matches();
    }

    /* renamed from: d */
    private boolean m32702d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(ProxyConfig.MATCH_ALL_SCHEMES)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m32703e(String str, X509Certificate x509Certificate) {
        String b;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> a = m32700a(x509Certificate, 2);
        int size = a.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (m32702d(lowerCase, a.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (b = new C14090c(x509Certificate.getSubjectX500Principal()).mo53858b("cn")) == null) {
            return false;
        }
        return m32702d(lowerCase, b);
    }

    /* renamed from: f */
    private boolean m32704f(String str, X509Certificate x509Certificate) {
        List<String> a = m32700a(x509Certificate, 7);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo53859b(String str, X509Certificate x509Certificate) {
        if (m32701c(str)) {
            return m32704f(str, x509Certificate);
        }
        return m32703e(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo53859b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
