package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.C12775o;

/* renamed from: okio.k0 */
/* compiled from: JvmOkio.kt */
final /* synthetic */ class C13147k0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f20931a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final C13175w0 m29761b(File file) {
        C12775o.m28639i(file, "<this>");
        return C13145j0.m29743h(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final boolean m29762c(AssertionError assertionError) {
        boolean z;
        C12775o.m28639i(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = C13755w.m31552J(message, "getsockname failed", false, 2, (Object) null);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final C13175w0 m29763d(File file) {
        C12775o.m28639i(file, "<this>");
        return m29767h(file, false, 1, (Object) null);
    }

    /* renamed from: e */
    public static final C13175w0 m29764e(File file, boolean z) {
        C12775o.m28639i(file, "<this>");
        return C13145j0.m29743h(new FileOutputStream(file, z));
    }

    /* renamed from: f */
    public static final C13175w0 m29765f(OutputStream outputStream) {
        C12775o.m28639i(outputStream, "<this>");
        return new C13154n0(outputStream, new C13181z0());
    }

    /* renamed from: g */
    public static final C13175w0 m29766g(Socket socket) {
        C12775o.m28639i(socket, "<this>");
        C13177x0 x0Var = new C13177x0(socket);
        OutputStream outputStream = socket.getOutputStream();
        C12775o.m28638h(outputStream, "getOutputStream()");
        return x0Var.sink(new C13154n0(outputStream, x0Var));
    }

    /* renamed from: h */
    public static /* synthetic */ C13175w0 m29767h(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return C13145j0.m29742g(file, z);
    }

    /* renamed from: i */
    public static final C13179y0 m29768i(File file) {
        C12775o.m28639i(file, "<this>");
        return new C13160q(new FileInputStream(file), C13181z0.NONE);
    }

    /* renamed from: j */
    public static final C13179y0 m29769j(InputStream inputStream) {
        C12775o.m28639i(inputStream, "<this>");
        return new C13160q(inputStream, new C13181z0());
    }

    /* renamed from: k */
    public static final C13179y0 m29770k(Socket socket) {
        C12775o.m28639i(socket, "<this>");
        C13177x0 x0Var = new C13177x0(socket);
        InputStream inputStream = socket.getInputStream();
        C12775o.m28638h(inputStream, "getInputStream()");
        return x0Var.source(new C13160q(inputStream, x0Var));
    }
}
