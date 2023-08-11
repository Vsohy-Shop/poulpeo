package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* compiled from: StandardAndroidSocketAdapter.kt */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Class<?> paramClass;
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* compiled from: StandardAndroidSocketAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SocketAdapter buildIfSupported$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.buildIfSupported(str);
        }

        public final SocketAdapter buildIfSupported(String str) {
            C12775o.m28639i(str, "packageName");
            try {
                Class<?> cls = Class.forName(C12775o.m28647q(str, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(C12775o.m28647q(str, ".OpenSSLSocketFactoryImpl"));
                Class<?> cls3 = Class.forName(C12775o.m28647q(str, ".SSLParametersImpl"));
                C12775o.m28638h(cls3, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, cls3);
            } catch (Exception e) {
                Platform.Companion.get().log("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        C12775o.m28639i(cls, "sslSocketClass");
        C12775o.m28639i(cls2, "sslSocketFactoryClass");
        C12775o.m28639i(cls3, "paramClass");
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        C12775o.m28639i(sSLSocketFactory, "sslSocketFactory");
        return this.sslSocketFactoryClass.isInstance(sSLSocketFactory);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        C12775o.m28639i(sSLSocketFactory, "sslSocketFactory");
        Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, this.paramClass, "sslParameters");
        C12775o.m28636f(readFieldOrNull);
        Class cls = X509TrustManager.class;
        X509TrustManager x509TrustManager = (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, cls, "x509TrustManager");
        if (x509TrustManager == null) {
            return (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, cls, "trustManager");
        }
        return x509TrustManager;
    }
}
