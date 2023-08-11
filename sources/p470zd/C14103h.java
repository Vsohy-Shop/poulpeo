package p470zd;

/* renamed from: zd.h */
/* compiled from: TlsVersion */
public enum C14103h {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: b */
    final String f23170b;

    private C14103h(String str) {
        this.f23170b = str;
    }

    /* renamed from: a */
    public static C14103h m32740a(String str) {
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: " + str);
    }
}
