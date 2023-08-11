package p364io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p111h6.C8020s;

/* renamed from: io.grpc.internal.d1 */
/* compiled from: LogExceptionRunnable */
public final class C12235d1 implements Runnable {

    /* renamed from: c */
    private static final Logger f19272c = Logger.getLogger(C12235d1.class.getName());

    /* renamed from: b */
    private final Runnable f19273b;

    public C12235d1(Runnable runnable) {
        this.f19273b = (Runnable) C8012n.m15756o(runnable, "task");
    }

    public void run() {
        try {
            this.f19273b.run();
        } catch (Throwable th) {
            Logger logger = f19272c;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + this.f19273b, th);
            C8020s.m15785f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f19273b + ")";
    }
}
