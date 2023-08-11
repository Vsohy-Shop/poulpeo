package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C12775o;

/* renamed from: okio.x0 */
/* compiled from: JvmOkio.kt */
final class C13177x0 extends C13110a {

    /* renamed from: a */
    private final Socket f20981a;

    public C13177x0(Socket socket) {
        C12775o.m28639i(socket, "socket");
        this.f20981a = socket;
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
        try {
            this.f20981a.close();
        } catch (Exception e) {
            Logger a = C13147k0.f20931a;
            Level level = Level.WARNING;
            a.log(level, "Failed to close timed out socket " + this.f20981a, e);
        } catch (AssertionError e2) {
            if (C13145j0.m29740e(e2)) {
                Logger a2 = C13147k0.f20931a;
                Level level2 = Level.WARNING;
                a2.log(level2, "Failed to close timed out socket " + this.f20981a, e2);
                return;
            }
            throw e2;
        }
    }
}
