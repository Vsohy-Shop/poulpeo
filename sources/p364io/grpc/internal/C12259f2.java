package p364io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p111h6.C8012n;

/* renamed from: io.grpc.internal.f2 */
/* compiled from: SharedResourceHolder */
public final class C12259f2 {

    /* renamed from: d */
    private static final C12259f2 f19310d = new C12259f2(new C12260a());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final IdentityHashMap<C12263d<?>, C12262c> f19311a = new IdentityHashMap<>();

    /* renamed from: b */
    private final C12264e f19312b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScheduledExecutorService f19313c;

    /* renamed from: io.grpc.internal.f2$a */
    /* compiled from: SharedResourceHolder */
    class C12260a implements C12264e {
        C12260a() {
        }

        /* renamed from: a */
        public ScheduledExecutorService mo49828a() {
            return Executors.newSingleThreadScheduledExecutor(C12404r0.m27330i("grpc-shared-destroyer-%d", true));
        }
    }

    /* renamed from: io.grpc.internal.f2$b */
    /* compiled from: SharedResourceHolder */
    class C12261b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12262c f19314b;

        /* renamed from: c */
        final /* synthetic */ C12263d f19315c;

        /* renamed from: d */
        final /* synthetic */ Object f19316d;

        C12261b(C12262c cVar, C12263d dVar, Object obj) {
            this.f19314b = cVar;
            this.f19315c = dVar;
            this.f19316d = obj;
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            synchronized (C12259f2.this) {
                if (this.f19314b.f19319b == 0) {
                    try {
                        this.f19315c.mo49831b(this.f19316d);
                        C12259f2.this.f19311a.remove(this.f19315c);
                        if (C12259f2.this.f19311a.isEmpty()) {
                            C12259f2.this.f19313c.shutdown();
                            ScheduledExecutorService unused = C12259f2.this.f19313c = null;
                        }
                    } catch (Throwable th) {
                        C12259f2.this.f19311a.remove(this.f19315c);
                        if (C12259f2.this.f19311a.isEmpty()) {
                            C12259f2.this.f19313c.shutdown();
                            ScheduledExecutorService unused2 = C12259f2.this.f19313c = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.f2$c */
    /* compiled from: SharedResourceHolder */
    private static class C12262c {

        /* renamed from: a */
        final Object f19318a;

        /* renamed from: b */
        int f19319b;

        /* renamed from: c */
        ScheduledFuture<?> f19320c;

        C12262c(Object obj) {
            this.f19318a = obj;
        }
    }

    /* renamed from: io.grpc.internal.f2$d */
    /* compiled from: SharedResourceHolder */
    public interface C12263d<T> {
        /* renamed from: a */
        T mo49830a();

        /* renamed from: b */
        void mo49831b(T t);
    }

    /* renamed from: io.grpc.internal.f2$e */
    /* compiled from: SharedResourceHolder */
    interface C12264e {
        /* renamed from: a */
        ScheduledExecutorService mo49828a();
    }

    C12259f2(C12264e eVar) {
        this.f19312b = eVar;
    }

    /* renamed from: d */
    public static <T> T m26841d(C12263d<T> dVar) {
        return f19310d.mo49826e(dVar);
    }

    /* renamed from: f */
    public static <T> T m26842f(C12263d<T> dVar, T t) {
        return f19310d.mo49827g(dVar, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <T> T mo49826e(C12263d<T> dVar) {
        C12262c cVar;
        cVar = this.f19311a.get(dVar);
        if (cVar == null) {
            cVar = new C12262c(dVar.mo49830a());
            this.f19311a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f19320c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f19320c = null;
        }
        cVar.f19319b++;
        return cVar.f19318a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized <T> T mo49827g(C12263d<T> dVar, T t) {
        boolean z;
        boolean z2;
        C12262c cVar = this.f19311a.get(dVar);
        if (cVar != null) {
            boolean z3 = false;
            if (t == cVar.f19318a) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15746e(z, "Releasing the wrong instance");
            if (cVar.f19319b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C8012n.m15762u(z2, "Refcount has already reached zero");
            int i = cVar.f19319b - 1;
            cVar.f19319b = i;
            if (i == 0) {
                if (cVar.f19320c == null) {
                    z3 = true;
                }
                C8012n.m15762u(z3, "Destroy task already scheduled");
                if (this.f19313c == null) {
                    this.f19313c = this.f19312b.mo49828a();
                }
                cVar.f19320c = this.f19313c.schedule(new C12235d1(new C12261b(cVar, dVar, t)), 1, TimeUnit.SECONDS);
            }
        } else {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        return null;
    }
}
