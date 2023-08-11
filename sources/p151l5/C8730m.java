package p151l5;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: l5.m */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C8730m {

    /* renamed from: a */
    static final Logger f12560a = Logger.getLogger(C8730m.class.getName());

    private C8730m() {
    }

    /* renamed from: a */
    public static void m17656a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f12560a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
