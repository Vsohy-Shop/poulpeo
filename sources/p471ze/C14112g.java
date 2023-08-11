package p471ze;

import androidx.compose.animation.core.C0344a;
import java.util.concurrent.atomic.AtomicReference;
import p364io.reactivex.exceptions.CompositeException;

/* renamed from: ze.g */
/* compiled from: ExceptionHelper */
public final class C14112g {

    /* renamed from: a */
    public static final Throwable f23185a = new C14113a();

    /* renamed from: a */
    public static <T> boolean m32756a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f23185a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!C0344a.m496a(atomicReference, th2, th3));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m32757b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f23185a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }

    /* renamed from: c */
    public static <E extends Throwable> Exception m32758c(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: d */
    public static RuntimeException m32759d(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: ze.g$a */
    /* compiled from: ExceptionHelper */
    static final class C14113a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        C14113a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
