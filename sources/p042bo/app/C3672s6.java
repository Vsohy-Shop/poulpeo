package p042bo.app;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.s6 */
public final class C3672s6 {

    /* renamed from: a */
    public static final C3672s6 f2557a = new C3672s6();

    /* renamed from: b */
    private static C3754v5 f2558b;

    /* renamed from: bo.app.s6$a */
    static final class C3673a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3673a f2559b = new C3673a();

        C3673a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception initializing static TLS socket factory.";
        }
    }

    /* renamed from: bo.app.s6$b */
    static final class C3674b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3674b f2560b = new C3674b();

        C3674b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception setting TLS socket factory on url connection.";
        }
    }

    static {
        try {
            f2558b = new C3754v5();
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f2557a, C8266c.C8267a.f11649e, e, false, C3673a.f2559b, 4, (Object) null);
        }
    }

    private C3672s6() {
    }

    /* renamed from: a */
    public final HttpURLConnection mo29643a(URL url) {
        C12775o.m28639i(url, "url");
        URLConnection openConnection = url.openConnection();
        if (C12775o.m28634d(url.getProtocol(), "https")) {
            if (openConnection != null) {
                try {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    C3754v5 v5Var = f2558b;
                    if (v5Var == null) {
                        C12775o.m28656z("socketFactory");
                        v5Var = null;
                    }
                    httpsURLConnection.setSSLSocketFactory(v5Var);
                } catch (Exception e) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3674b.f2560b, 4, (Object) null);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            }
        }
        if (openConnection != null) {
            return (HttpURLConnection) openConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }
}
