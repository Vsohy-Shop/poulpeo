package p470zd;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: zd.b */
/* compiled from: ConnectionSpec */
public final class C14087b {

    /* renamed from: e */
    private static final C14086a[] f23110e;

    /* renamed from: f */
    public static final C14087b f23111f;

    /* renamed from: g */
    public static final C14087b f23112g;

    /* renamed from: h */
    public static final C14087b f23113h = new C14089b(false).mo53852e();

    /* renamed from: a */
    final boolean f23114a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String[] f23115b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f23116c;

    /* renamed from: d */
    final boolean f23117d;

    static {
        C14086a[] aVarArr = {C14086a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C14086a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C14086a.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C14086a.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, C14086a.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, C14086a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C14086a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C14086a.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, C14086a.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, C14086a.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, C14086a.TLS_RSA_WITH_AES_128_GCM_SHA256, C14086a.TLS_RSA_WITH_AES_128_CBC_SHA, C14086a.TLS_RSA_WITH_AES_256_CBC_SHA, C14086a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f23110e = aVarArr;
        C14089b g = new C14089b(true).mo53854g(aVarArr);
        C14103h hVar = C14103h.TLS_1_0;
        C14087b e = g.mo53857j(C14103h.TLS_1_2, C14103h.TLS_1_1, hVar).mo53855h(true).mo53852e();
        f23111f = e;
        f23112g = new C14089b(e).mo53857j(hVar).mo53855h(true).mo53852e();
    }

    /* renamed from: e */
    private C14087b m32677e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        Class<String> cls = String.class;
        if (this.f23115b != null) {
            strArr = (String[]) C14104i.m32743c(cls, this.f23115b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        return new C14089b(this).mo53853f(strArr).mo53856i((String[]) C14104i.m32743c(cls, this.f23116c, enabledProtocols)).mo53852e();
    }

    /* renamed from: c */
    public void mo53845c(SSLSocket sSLSocket, boolean z) {
        C14087b e = m32677e(sSLSocket, z);
        sSLSocket.setEnabledProtocols(e.f23116c);
        String[] strArr = e.f23115b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List<C14086a> mo53846d() {
        String[] strArr = this.f23115b;
        if (strArr == null) {
            return null;
        }
        C14086a[] aVarArr = new C14086a[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f23115b;
            if (i >= strArr2.length) {
                return C14104i.m32741a(aVarArr);
            }
            aVarArr[i] = C14086a.m32674a(strArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14087b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C14087b bVar = (C14087b) obj;
        boolean z = this.f23114a;
        if (z != bVar.f23114a) {
            return false;
        }
        if (!z || (Arrays.equals(this.f23115b, bVar.f23115b) && Arrays.equals(this.f23116c, bVar.f23116c) && this.f23117d == bVar.f23117d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo53848f() {
        return this.f23117d;
    }

    /* renamed from: g */
    public List<C14103h> mo53849g() {
        C14103h[] hVarArr = new C14103h[this.f23116c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f23116c;
            if (i >= strArr.length) {
                return C14104i.m32741a(hVarArr);
            }
            hVarArr[i] = C14103h.m32740a(strArr[i]);
            i++;
        }
    }

    public int hashCode() {
        if (this.f23114a) {
            return ((((527 + Arrays.hashCode(this.f23115b)) * 31) + Arrays.hashCode(this.f23116c)) * 31) + (this.f23117d ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f23114a) {
            return "ConnectionSpec()";
        }
        List<C14086a> d = mo53846d();
        if (d == null) {
            str = "[use default]";
        } else {
            str = d.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + mo53849g() + ", supportsTlsExtensions=" + this.f23117d + ")";
    }

    /* renamed from: zd.b$b */
    /* compiled from: ConnectionSpec */
    public static final class C14089b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f23118a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f23119b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f23120c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f23121d;

        public C14089b(boolean z) {
            this.f23118a = z;
        }

        /* renamed from: e */
        public C14087b mo53852e() {
            return new C14087b(this);
        }

        /* renamed from: f */
        public C14089b mo53853f(String... strArr) {
            if (this.f23118a) {
                if (strArr == null) {
                    this.f23119b = null;
                } else {
                    this.f23119b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: g */
        public C14089b mo53854g(C14086a... aVarArr) {
            if (this.f23118a) {
                String[] strArr = new String[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    strArr[i] = aVarArr[i].f23109b;
                }
                this.f23119b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: h */
        public C14089b mo53855h(boolean z) {
            if (this.f23118a) {
                this.f23121d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: i */
        public C14089b mo53856i(String... strArr) {
            if (this.f23118a) {
                if (strArr == null) {
                    this.f23120c = null;
                } else {
                    this.f23120c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: j */
        public C14089b mo53857j(C14103h... hVarArr) {
            if (!this.f23118a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (hVarArr.length != 0) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f23170b;
                }
                this.f23120c = strArr;
                return this;
            } else {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
        }

        public C14089b(C14087b bVar) {
            this.f23118a = bVar.f23114a;
            this.f23119b = bVar.f23115b;
            this.f23120c = bVar.f23116c;
            this.f23121d = bVar.f23117d;
        }
    }

    private C14087b(C14089b bVar) {
        this.f23114a = bVar.f23118a;
        this.f23115b = bVar.f23119b;
        this.f23116c = bVar.f23120c;
        this.f23117d = bVar.f23121d;
    }
}
