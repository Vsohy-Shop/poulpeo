package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    ConscryptSocketAdapter$Companion$factory$1() {
    }

    public SocketAdapter create(SSLSocket sSLSocket) {
        C12775o.m28639i(sSLSocket, "sslSocket");
        return new ConscryptSocketAdapter();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        C12775o.m28639i(sSLSocket, "sslSocket");
        if (!ConscryptPlatform.Companion.isSupported() || !Conscrypt.isConscrypt(sSLSocket)) {
            return false;
        }
        return true;
    }
}
