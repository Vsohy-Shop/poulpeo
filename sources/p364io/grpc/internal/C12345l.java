package p364io.grpc.internal;

import androidx.core.app.NotificationCompat;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p111h6.C8003j;
import p111h6.C8012n;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12371n1;
import p364io.grpc.internal.C12429t;
import p458xd.C13773a;
import p458xd.C13781d;
import p458xd.C13783d0;
import p458xd.C13803j;

/* renamed from: io.grpc.internal.l */
/* compiled from: CallCredentialsApplyingTransportFactory */
final class C12345l implements C12429t {

    /* renamed from: b */
    private final C12429t f19574b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C13773a f19575c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Executor f19576d;

    /* renamed from: io.grpc.internal.l$a */
    /* compiled from: CallCredentialsApplyingTransportFactory */
    private class C12346a extends C12340k0 {

        /* renamed from: a */
        private final C12447v f19577a;

        /* renamed from: b */
        private final String f19578b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AtomicInteger f19579c = new AtomicInteger(-2147483647);

        /* renamed from: d */
        private volatile C12594t f19580d;

        /* renamed from: e */
        private C12594t f19581e;

        /* renamed from: f */
        private C12594t f19582f;

        /* renamed from: g */
        private final C12371n1.C12372a f19583g = new C12347a();

        /* renamed from: io.grpc.internal.l$a$a */
        /* compiled from: CallCredentialsApplyingTransportFactory */
        class C12347a implements C12371n1.C12372a {
            C12347a() {
            }

            /* renamed from: b */
            public void mo49983b() {
                if (C12346a.this.f19579c.decrementAndGet() == 0) {
                    C12346a.this.m27129j();
                }
            }
        }

        /* renamed from: io.grpc.internal.l$a$b */
        /* compiled from: CallCredentialsApplyingTransportFactory */
        class C12348b extends C13773a.C13775b {

            /* renamed from: a */
            final /* synthetic */ C13783d0 f19586a;

            /* renamed from: b */
            final /* synthetic */ C12159b f19587b;

            C12348b(C13783d0 d0Var, C12159b bVar) {
                this.f19586a = d0Var;
                this.f19587b = bVar;
            }
        }

        C12346a(C12447v vVar, String str) {
            this.f19577a = (C12447v) C8012n.m15756o(vVar, "delegate");
            this.f19578b = (String) C8012n.m15756o(str, "authority");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            super.mo49698c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r0 == null) goto L_0x001a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            super.mo49697b(r0);
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m27129j() {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.atomic.AtomicInteger r0 = r3.f19579c     // Catch:{ all -> 0x0020 }
                int r0 = r0.get()     // Catch:{ all -> 0x0020 }
                if (r0 == 0) goto L_0x000b
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                return
            L_0x000b:
                io.grpc.t r0 = r3.f19581e     // Catch:{ all -> 0x0020 }
                io.grpc.t r1 = r3.f19582f     // Catch:{ all -> 0x0020 }
                r2 = 0
                r3.f19581e = r2     // Catch:{ all -> 0x0020 }
                r3.f19582f = r2     // Catch:{ all -> 0x0020 }
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                if (r0 == 0) goto L_0x001a
                super.mo49697b(r0)
            L_0x001a:
                if (r1 == 0) goto L_0x001f
                super.mo49698c(r1)
            L_0x001f:
                return
            L_0x0020:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0020 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12345l.C12346a.m27129j():void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12447v mo49977a() {
            return this.f19577a;
        }

        /* renamed from: b */
        public void mo49697b(C12594t tVar) {
            C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
            synchronized (this) {
                if (this.f19579c.get() < 0) {
                    this.f19580d = tVar;
                    this.f19579c.addAndGet(Integer.MAX_VALUE);
                    if (this.f19579c.get() != 0) {
                        this.f19581e = tVar;
                    } else {
                        super.mo49697b(tVar);
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo49698c(C12594t tVar) {
            C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
            synchronized (this) {
                if (this.f19579c.get() < 0) {
                    this.f19580d = tVar;
                    this.f19579c.addAndGet(Integer.MAX_VALUE);
                } else if (this.f19582f != null) {
                    return;
                }
                if (this.f19579c.get() != 0) {
                    this.f19582f = tVar;
                } else {
                    super.mo49698c(tVar);
                }
            }
        }

        /* renamed from: d */
        public C12398q mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr) {
            C13773a c = bVar.mo49618c();
            if (c == null) {
                c = C12345l.this.f19575c;
            } else if (C12345l.this.f19575c != null) {
                c = new C13803j(C12345l.this.f19575c, c);
            }
            if (c != null) {
                C12371n1 n1Var = new C12371n1(this.f19577a, d0Var, oVar, bVar, this.f19583g, cVarArr);
                if (this.f19579c.incrementAndGet() > 0) {
                    this.f19583g.mo49983b();
                    return new C12257f0(this.f19580d, cVarArr);
                }
                try {
                    c.mo53436a(new C12348b(d0Var, bVar), (Executor) C8003j.m15721a(bVar.mo49620e(), C12345l.this.f19576d), n1Var);
                } catch (Throwable th) {
                    n1Var.mo50006a(C12594t.f20191n.mo50310r("Credentials should use fail() instead of throwing exceptions").mo50309q(th));
                }
                return n1Var.mo50007c();
            } else if (this.f19579c.get() >= 0) {
                return new C12257f0(this.f19580d, cVarArr);
            } else {
                return this.f19577a.mo49699d(d0Var, oVar, bVar, cVarArr);
            }
        }
    }

    C12345l(C12429t tVar, C13773a aVar, Executor executor) {
        this.f19574b = (C12429t) C8012n.m15756o(tVar, "delegate");
        this.f19575c = aVar;
        this.f19576d = (Executor) C8012n.m15756o(executor, "appExecutor");
    }

    public void close() {
        this.f19574b.close();
    }

    /* renamed from: i0 */
    public ScheduledExecutorService mo49981i0() {
        return this.f19574b.mo49981i0();
    }

    /* renamed from: r */
    public C12447v mo49982r(SocketAddress socketAddress, C12429t.C12430a aVar, C13781d dVar) {
        return new C12346a(this.f19574b.mo49982r(socketAddress, aVar, dVar), aVar.mo50072a());
    }
}
