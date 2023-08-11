package p458xd;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: xd.o */
/* compiled from: Context */
public class C13815o {

    /* renamed from: b */
    static final Logger f22279b = Logger.getLogger(C13815o.class.getName());

    /* renamed from: c */
    public static final C13815o f22280c = new C13815o();

    /* renamed from: a */
    final int f22281a = 0;

    /* renamed from: xd.o$a */
    /* compiled from: Context */
    public interface C13816a {
    }

    /* renamed from: xd.o$b */
    /* compiled from: Context */
    private static final class C13817b {

        /* renamed from: a */
        static final C13818c f22282a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f22282a = m31735a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C13815o.f22279b.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        /* renamed from: a */
        private static C13818c m31735a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (C13818c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(C13818c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new C13810k0();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    /* renamed from: xd.o$c */
    /* compiled from: Context */
    public static abstract class C13818c {
        @Deprecated
        /* renamed from: a */
        public void mo53481a(C13815o oVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        /* renamed from: b */
        public abstract C13815o mo53465b();

        /* renamed from: c */
        public abstract void mo53466c(C13815o oVar, C13815o oVar2);

        /* renamed from: d */
        public C13815o mo53467d(C13815o oVar) {
            C13815o b = mo53465b();
            mo53481a(oVar);
            return b;
        }
    }

    private C13815o() {
        m31727k(0);
    }

    /* renamed from: d */
    static <T> T m31724d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: e */
    public static C13815o m31725e() {
        C13815o b = m31726j().mo53465b();
        if (b == null) {
            return f22280c;
        }
        return b;
    }

    /* renamed from: j */
    static C13818c m31726j() {
        return C13817b.f22282a;
    }

    /* renamed from: k */
    private static void m31727k(int i) {
        if (i == 1000) {
            f22279b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    /* renamed from: a */
    public void mo53474a(C13816a aVar, Executor executor) {
        m31724d(aVar, "cancellationListener");
        m31724d(executor, "executor");
    }

    /* renamed from: b */
    public C13815o mo53475b() {
        C13815o d = m31726j().mo53467d(this);
        if (d == null) {
            return f22280c;
        }
        return d;
    }

    /* renamed from: c */
    public Throwable mo53476c() {
        return null;
    }

    /* renamed from: f */
    public void mo53477f(C13815o oVar) {
        m31724d(oVar, "toAttach");
        m31726j().mo53466c(this, oVar);
    }

    /* renamed from: g */
    public C13819p mo53478g() {
        return null;
    }

    /* renamed from: h */
    public boolean mo53479h() {
        return false;
    }

    /* renamed from: i */
    public void mo53480i(C13816a aVar) {
    }
}
