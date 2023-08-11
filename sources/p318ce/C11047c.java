package p318ce;

import com.appboy.Constants;
import com.google.common.util.concurrent.C6891a;
import com.google.common.util.concurrent.C6906d;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8003j;
import p111h6.C8012n;
import p364io.grpc.C12159b;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.StatusException;
import p364io.grpc.StatusRuntimeException;
import p458xd.C13788e;

/* renamed from: ce.c */
/* compiled from: ClientCalls */
public final class C11047c {

    /* renamed from: a */
    private static final Logger f17129a = Logger.getLogger(C11047c.class.getName());

    /* renamed from: b */
    static final C12159b.C12160a<C11051d> f17130b = C12159b.C12160a.m26541b("internal-stub-type");

    /* renamed from: ce.c$b */
    /* compiled from: ClientCalls */
    private static final class C11049b<RespT> extends C6891a<RespT> {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final C13788e<?, RespT> f17131i;

        C11049b(C13788e<?, RespT> eVar) {
            this.f17131i = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public boolean mo39723B(RespT respt) {
            return super.mo39723B(respt);
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public boolean mo39724C(Throwable th) {
            return super.mo39724C(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public void mo39733x() {
            this.f17131i.mo49848a("GrpcFuture was cancelled", (Throwable) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public String mo39734y() {
            return C8003j.m15723c(this).mo41840d("clientCall", this.f17131i).toString();
        }
    }

    /* renamed from: ce.c$c */
    /* compiled from: ClientCalls */
    private static abstract class C11050c<T> extends C13788e.C13789a<T> {
        private C11050c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo46131e();
    }

    /* renamed from: ce.c$d */
    /* compiled from: ClientCalls */
    enum C11051d {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    /* renamed from: ce.c$e */
    /* compiled from: ClientCalls */
    private static final class C11052e extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* renamed from: c */
        private static final Logger f17136c = Logger.getLogger(C11052e.class.getName());

        /* renamed from: b */
        private volatile Thread f17137b;

        C11052e() {
        }

        /* renamed from: b */
        private static void m23840b() {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo46132d() {
            Runnable runnable;
            m23840b();
            Runnable runnable2 = (Runnable) poll();
            if (runnable2 == null) {
                this.f17137b = Thread.currentThread();
                while (true) {
                    try {
                        runnable = (Runnable) poll();
                        if (runnable != null) {
                            break;
                        }
                        LockSupport.park(this);
                        m23840b();
                    } catch (Throwable th) {
                        this.f17137b = null;
                        throw th;
                    }
                }
                this.f17137b = null;
                runnable2 = runnable;
            }
            do {
                try {
                    runnable2.run();
                } catch (Throwable th2) {
                    f17136c.log(Level.WARNING, "Runnable threw exception", th2);
                }
                runnable2 = (Runnable) poll();
            } while (runnable2 != null);
        }

        public void execute(Runnable runnable) {
            add(runnable);
            LockSupport.unpark(this.f17137b);
        }
    }

    private C11047c() {
    }

    /* renamed from: a */
    private static <ReqT, RespT> void m23827a(C13788e<ReqT, RespT> eVar, ReqT reqt, C11050c<RespT> cVar) {
        m23832f(eVar, cVar);
        try {
            eVar.mo49851d(reqt);
            eVar.mo49849b();
        } catch (RuntimeException e) {
            throw m23829c(eVar, e);
        } catch (Error e2) {
            throw m23829c(eVar, e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [xd.d0<ReqT, RespT>, xd.d0] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <ReqT, RespT> RespT m23828b(p458xd.C13777b r3, p458xd.C13783d0<ReqT, RespT> r4, p364io.grpc.C12159b r5, ReqT r6) {
        /*
            ce.c$e r0 = new ce.c$e
            r0.<init>()
            io.grpc.b$a<ce.c$d> r1 = f17130b
            ce.c$d r2 = p318ce.C11047c.C11051d.BLOCKING
            io.grpc.b r5 = r5.mo49631p(r1, r2)
            io.grpc.b r5 = r5.mo49628m(r0)
            xd.e r3 = r3.mo49841h(r4, r5)
            r4 = 0
            com.google.common.util.concurrent.d r5 = m23830d(r3, r6)     // Catch:{ RuntimeException -> 0x004c, Error -> 0x0046 }
        L_0x001a:
            boolean r6 = r5.isDone()     // Catch:{ RuntimeException -> 0x004c, Error -> 0x0046 }
            if (r6 != 0) goto L_0x0036
            r0.mo46132d()     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x001a
        L_0x0024:
            r4 = move-exception
            r6 = 1
            java.lang.String r1 = "Thread interrupted"
            r3.mo49848a(r1, r4)     // Catch:{ RuntimeException -> 0x0033, Error -> 0x0030, all -> 0x002d }
            r4 = r6
            goto L_0x001a
        L_0x002d:
            r3 = move-exception
            r4 = r6
            goto L_0x0052
        L_0x0030:
            r5 = move-exception
            r4 = r6
            goto L_0x0047
        L_0x0033:
            r5 = move-exception
            r4 = r6
            goto L_0x004d
        L_0x0036:
            java.lang.Object r3 = m23831e(r5)     // Catch:{ RuntimeException -> 0x004c, Error -> 0x0046 }
            if (r4 == 0) goto L_0x0043
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L_0x0043:
            return r3
        L_0x0044:
            r3 = move-exception
            goto L_0x0052
        L_0x0046:
            r5 = move-exception
        L_0x0047:
            java.lang.RuntimeException r3 = m23829c(r3, r5)     // Catch:{ all -> 0x0044 }
            throw r3     // Catch:{ all -> 0x0044 }
        L_0x004c:
            r5 = move-exception
        L_0x004d:
            java.lang.RuntimeException r3 = m23829c(r3, r5)     // Catch:{ all -> 0x0044 }
            throw r3     // Catch:{ all -> 0x0044 }
        L_0x0052:
            if (r4 == 0) goto L_0x005b
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L_0x005b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p318ce.C11047c.m23828b(xd.b, xd.d0, io.grpc.b, java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    private static RuntimeException m23829c(C13788e<?, ?> eVar, Throwable th) {
        try {
            eVar.mo49848a((String) null, th);
        } catch (Throwable th2) {
            f17129a.log(Level.SEVERE, "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new AssertionError(th);
        }
    }

    /* renamed from: d */
    public static <ReqT, RespT> C6906d<RespT> m23830d(C13788e<ReqT, RespT> eVar, ReqT reqt) {
        C11049b bVar = new C11049b(eVar);
        m23827a(eVar, reqt, new C11053f(bVar));
        return bVar;
    }

    /* renamed from: e */
    private static <V> V m23831e(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw C12594t.f20184g.mo50310r("Thread interrupted").mo50309q(e).mo50300d();
        } catch (ExecutionException e2) {
            throw m23833g(e2.getCause());
        }
    }

    /* renamed from: f */
    private static <ReqT, RespT> void m23832f(C13788e<ReqT, RespT> eVar, C11050c<RespT> cVar) {
        eVar.mo46138e(cVar, new C12564o());
        cVar.mo46131e();
    }

    /* renamed from: g */
    private static StatusRuntimeException m23833g(Throwable th) {
        Throwable th2 = (Throwable) C8012n.m15756o(th, Constants.APPBOY_PUSH_TITLE_KEY);
        while (th2 != null) {
            if (th2 instanceof StatusException) {
                StatusException statusException = (StatusException) th2;
                return new StatusRuntimeException(statusException.mo49601a(), statusException.mo49602b());
            } else if (th2 instanceof StatusRuntimeException) {
                StatusRuntimeException statusRuntimeException = (StatusRuntimeException) th2;
                return new StatusRuntimeException(statusRuntimeException.mo49604a(), statusRuntimeException.mo49605b());
            } else {
                th2 = th2.getCause();
            }
        }
        return C12594t.f20185h.mo50310r("unexpected exception").mo50309q(th).mo50300d();
    }

    /* renamed from: ce.c$f */
    /* compiled from: ClientCalls */
    private static final class C11053f<RespT> extends C11050c<RespT> {

        /* renamed from: a */
        private final C11049b<RespT> f17138a;

        /* renamed from: b */
        private RespT f17139b;

        C11053f(C11049b<RespT> bVar) {
            super();
            this.f17138a = bVar;
        }

        /* renamed from: a */
        public void mo46134a(C12594t tVar, C12564o oVar) {
            if (tVar.mo50308p()) {
                if (this.f17139b == null) {
                    this.f17138a.mo39724C(C12594t.f20197t.mo50310r("No value received for unary call").mo50301e(oVar));
                }
                this.f17138a.mo39723B(this.f17139b);
                return;
            }
            this.f17138a.mo39724C(tVar.mo50301e(oVar));
        }

        /* renamed from: c */
        public void mo46136c(RespT respt) {
            if (this.f17139b == null) {
                this.f17139b = respt;
                return;
            }
            throw C12594t.f20197t.mo50310r("More than one value received for unary call").mo50300d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo46131e() {
            this.f17138a.f17131i.mo49850c(2);
        }

        /* renamed from: b */
        public void mo46135b(C12564o oVar) {
        }
    }
}
