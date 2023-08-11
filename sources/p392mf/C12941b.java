package p392mf;

import java.io.Closeable;

/* renamed from: mf.b */
/* compiled from: Closeable.kt */
public final class C12941b {
    /* renamed from: a */
    public static final void m29245a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C11894b.m25683a(th, th2);
        }
    }
}
