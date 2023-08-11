package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* compiled from: AndroidSocketAdapter.kt */
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    final /* synthetic */ String $packageName;

    AndroidSocketAdapter$Companion$factory$1(String str) {
        this.$packageName = str;
    }

    public SocketAdapter create(SSLSocket sSLSocket) {
        C12775o.m28639i(sSLSocket, "sslSocket");
        return AndroidSocketAdapter.Companion.build(sSLSocket.getClass());
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        C12775o.m28639i(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        C12775o.m28638h(name, "sslSocket.javaClass.name");
        return C13754v.m31525E(name, C12775o.m28647q(this.$packageName, "."), false, 2, (Object) null);
    }
}
