package p161m5;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: m5.d */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
public final class C8827d {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m17890a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
