package p364io.grpc.internal;

import androidx.core.app.NotificationManagerCompat;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p111h6.C8007k;
import p111h6.C8012n;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12402r;
import p458xd.C13783d0;
import p458xd.C13805j0;
import p458xd.C13809k;
import p458xd.C13819p;
import p458xd.C13824r;

/* renamed from: io.grpc.internal.z1 */
/* compiled from: RetriableStream */
abstract class C12506z1<ReqT> implements C12398q {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static Random f19999A = new Random();

    /* renamed from: x */
    static final C12564o.C12571g<String> f20000x;

    /* renamed from: y */
    static final C12564o.C12571g<String> f20001y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final C12594t f20002z = C12594t.f20184g.mo50310r("Stream thrown away because RetriableStream committed");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13783d0<ReqT, ?> f20003a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f20004b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f20005c = new C13805j0(new C12507a());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ScheduledExecutorService f20006d;

    /* renamed from: e */
    private final C12564o f20007e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12189a2 f20008f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12431t0 f20009g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f20010h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f20011i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12537t f20012j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final long f20013k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f20014l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C12520c0 f20015m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C12460x0 f20016n = new C12460x0();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile C12544z f20017o = new C12544z(new ArrayList(8), Collections.emptyList(), (Collection<C12518b0>) null, (C12518b0) null, false, false, false, 0);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AtomicBoolean f20018p = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f20019q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C12402r f20020r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C12538u f20021s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C12538u f20022t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f20023u;

    /* renamed from: v */
    private C12594t f20024v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f20025w;

    /* renamed from: io.grpc.internal.z1$a */
    /* compiled from: RetriableStream */
    class C12507a implements Thread.UncaughtExceptionHandler {
        C12507a() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            throw C12594t.m27926l(th).mo50310r("Uncaught exception in the SynchronizationContext. Re-thrown.").mo50300d();
        }
    }

    /* renamed from: io.grpc.internal.z1$a0 */
    /* compiled from: RetriableStream */
    private final class C12508a0 implements C12402r {

        /* renamed from: a */
        final C12518b0 f20027a;

        /* renamed from: io.grpc.internal.z1$a0$a */
        /* compiled from: RetriableStream */
        class C12509a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12564o f20029b;

            C12509a(C12564o oVar) {
                this.f20029b = oVar;
            }

            public void run() {
                C12506z1.this.f20020r.mo49738b(this.f20029b);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$b */
        /* compiled from: RetriableStream */
        class C12510b implements Runnable {

            /* renamed from: io.grpc.internal.z1$a0$b$a */
            /* compiled from: RetriableStream */
            class C12511a implements Runnable {
                C12511a() {
                }

                public void run() {
                    C12508a0 a0Var = C12508a0.this;
                    C12506z1.this.m27666a0(C12506z1.this.m27664Y(a0Var.f20027a.f20051d + 1, false));
                }
            }

            C12510b() {
            }

            public void run() {
                C12506z1.this.f20004b.execute(new C12511a());
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$c */
        /* compiled from: RetriableStream */
        class C12512c implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12594t f20033b;

            /* renamed from: c */
            final /* synthetic */ C12402r.C12403a f20034c;

            /* renamed from: d */
            final /* synthetic */ C12564o f20035d;

            C12512c(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
                this.f20033b = tVar;
                this.f20034c = aVar;
                this.f20035d = oVar;
            }

            public void run() {
                boolean unused = C12506z1.this.f20025w = true;
                C12506z1.this.f20020r.mo49740d(this.f20033b, this.f20034c, this.f20035d);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$d */
        /* compiled from: RetriableStream */
        class C12513d implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12518b0 f20037b;

            C12513d(C12518b0 b0Var) {
                this.f20037b = b0Var;
            }

            public void run() {
                C12506z1.this.m27666a0(this.f20037b);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$e */
        /* compiled from: RetriableStream */
        class C12514e implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12594t f20039b;

            /* renamed from: c */
            final /* synthetic */ C12402r.C12403a f20040c;

            /* renamed from: d */
            final /* synthetic */ C12564o f20041d;

            C12514e(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
                this.f20039b = tVar;
                this.f20040c = aVar;
                this.f20041d = oVar;
            }

            public void run() {
                boolean unused = C12506z1.this.f20025w = true;
                C12506z1.this.f20020r.mo49740d(this.f20039b, this.f20040c, this.f20041d);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$f */
        /* compiled from: RetriableStream */
        class C12515f implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12343k2.C12344a f20043b;

            C12515f(C12343k2.C12344a aVar) {
                this.f20043b = aVar;
            }

            public void run() {
                C12506z1.this.f20020r.mo49737a(this.f20043b);
            }
        }

        /* renamed from: io.grpc.internal.z1$a0$g */
        /* compiled from: RetriableStream */
        class C12516g implements Runnable {
            C12516g() {
            }

            public void run() {
                if (!C12506z1.this.f20025w) {
                    C12506z1.this.f20020r.mo49739c();
                }
            }
        }

        C12508a0(C12518b0 b0Var) {
            this.f20027a = b0Var;
        }

        /* renamed from: e */
        private Integer m27701e(C12564o oVar) {
            String str = (String) oVar.mo50241f(C12506z1.f20001y);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: f */
        private C12539v m27702f(C12594t tVar, C12564o oVar) {
            boolean z;
            Integer e = m27701e(oVar);
            boolean z2 = true;
            boolean z3 = !C12506z1.this.f20009g.f19834c.contains(tVar.mo50306n());
            if (C12506z1.this.f20015m == null || (z3 && (e == null || e.intValue() >= 0))) {
                z = false;
            } else {
                z = !C12506z1.this.f20015m.mo50186b();
            }
            if (z3 || z) {
                z2 = false;
            }
            return new C12539v(z2, e);
        }

        /* renamed from: g */
        private C12542x m27703g(C12594t tVar, C12564o oVar) {
            boolean z;
            long j = 0;
            boolean z2 = false;
            if (C12506z1.this.f20008f == null) {
                return new C12542x(false, 0);
            }
            boolean contains = C12506z1.this.f20008f.f19145f.contains(tVar.mo50306n());
            Integer e = m27701e(oVar);
            if (C12506z1.this.f20015m == null || (!contains && (e == null || e.intValue() >= 0))) {
                z = false;
            } else {
                z = !C12506z1.this.f20015m.mo50186b();
            }
            if (C12506z1.this.f20008f.f19140a > this.f20027a.f20051d + 1 && !z) {
                if (e == null) {
                    if (contains) {
                        j = (long) (((double) C12506z1.this.f20023u) * C12506z1.f19999A.nextDouble());
                        C12506z1 z1Var = C12506z1.this;
                        long unused = z1Var.f20023u = Math.min((long) (((double) z1Var.f20023u) * C12506z1.this.f20008f.f19143d), C12506z1.this.f20008f.f19142c);
                    }
                } else if (e.intValue() >= 0) {
                    j = TimeUnit.MILLISECONDS.toNanos((long) e.intValue());
                    C12506z1 z1Var2 = C12506z1.this;
                    long unused2 = z1Var2.f20023u = z1Var2.f20008f.f19141b;
                }
                z2 = true;
            }
            return new C12542x(z2, j);
        }

        /* renamed from: a */
        public void mo49737a(C12343k2.C12344a aVar) {
            boolean z;
            C12544z O = C12506z1.this.f20017o;
            if (O.f20105f != null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "Headers should be received prior to messages.");
            if (O.f20105f == this.f20027a) {
                C12506z1.this.f20005c.execute(new C12515f(aVar));
            }
        }

        /* renamed from: b */
        public void mo49738b(C12564o oVar) {
            C12506z1.this.m27663X(this.f20027a);
            if (C12506z1.this.f20017o.f20105f == this.f20027a) {
                if (C12506z1.this.f20015m != null) {
                    C12506z1.this.f20015m.mo50187c();
                }
                C12506z1.this.f20005c.execute(new C12509a(oVar));
            }
        }

        /* renamed from: c */
        public void mo49739c() {
            if (C12506z1.this.isReady()) {
                C12506z1.this.f20005c.execute(new C12516g());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
            return;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo49740d(p364io.grpc.C12594t r6, p364io.grpc.internal.C12402r.C12403a r7, p364io.grpc.C12564o r8) {
            /*
                r5 = this;
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                java.lang.Object r0 = r0.f20011i
                monitor-enter(r0)
                io.grpc.internal.z1 r1 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x01a4 }
                io.grpc.internal.z1$z r2 = r1.f20017o     // Catch:{ all -> 0x01a4 }
                io.grpc.internal.z1$b0 r3 = r5.f20027a     // Catch:{ all -> 0x01a4 }
                io.grpc.internal.z1$z r2 = r2.mo50204g(r3)     // Catch:{ all -> 0x01a4 }
                p364io.grpc.internal.C12506z1.C12544z unused = r1.f20017o = r2     // Catch:{ all -> 0x01a4 }
                io.grpc.internal.z1 r1 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x01a4 }
                io.grpc.internal.x0 r1 = r1.f20016n     // Catch:{ all -> 0x01a4 }
                io.grpc.t$b r2 = r6.mo50306n()     // Catch:{ all -> 0x01a4 }
                r1.mo50127a(r2)     // Catch:{ all -> 0x01a4 }
                monitor-exit(r0)     // Catch:{ all -> 0x01a4 }
                io.grpc.internal.z1$b0 r0 = r5.f20027a
                boolean r1 = r0.f20050c
                if (r1 == 0) goto L_0x004a
                io.grpc.internal.z1 r1 = p364io.grpc.internal.C12506z1.this
                r1.m27663X(r0)
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.z1$z r0 = r0.f20017o
                io.grpc.internal.z1$b0 r0 = r0.f20105f
                io.grpc.internal.z1$b0 r1 = r5.f20027a
                if (r0 != r1) goto L_0x0049
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                java.util.concurrent.Executor r0 = r0.f20005c
                io.grpc.internal.z1$a0$c r1 = new io.grpc.internal.z1$a0$c
                r1.<init>(r6, r7, r8)
                r0.execute(r1)
            L_0x0049:
                return
            L_0x004a:
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.z1$z r0 = r0.f20017o
                io.grpc.internal.z1$b0 r0 = r0.f20105f
                if (r0 != 0) goto L_0x0182
                io.grpc.internal.r$a r0 = p364io.grpc.internal.C12402r.C12403a.REFUSED
                r1 = 1
                if (r7 != r0) goto L_0x00dc
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f20018p
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x00dc
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.z1$b0 r7 = r5.f20027a
                int r7 = r7.f20051d
                io.grpc.internal.z1$b0 r6 = r6.m27664Y(r7, r1)
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this
                boolean r7 = r7.f20010h
                if (r7 == 0) goto L_0x00b6
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this
                java.lang.Object r7 = r7.f20011i
                monitor-enter(r7)
                io.grpc.internal.z1 r8 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x00b3 }
                io.grpc.internal.z1$z r0 = r8.f20017o     // Catch:{ all -> 0x00b3 }
                io.grpc.internal.z1$b0 r3 = r5.f20027a     // Catch:{ all -> 0x00b3 }
                io.grpc.internal.z1$z r0 = r0.mo50203f(r3, r6)     // Catch:{ all -> 0x00b3 }
                p364io.grpc.internal.C12506z1.C12544z unused = r8.f20017o = r0     // Catch:{ all -> 0x00b3 }
                io.grpc.internal.z1 r8 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x00b3 }
                io.grpc.internal.z1$z r0 = r8.f20017o     // Catch:{ all -> 0x00b3 }
                boolean r8 = r8.m27668c0(r0)     // Catch:{ all -> 0x00b3 }
                if (r8 != 0) goto L_0x00a9
                io.grpc.internal.z1 r8 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x00b3 }
                io.grpc.internal.z1$z r8 = r8.f20017o     // Catch:{ all -> 0x00b3 }
                java.util.Collection<io.grpc.internal.z1$b0> r8 = r8.f20103d     // Catch:{ all -> 0x00b3 }
                int r8 = r8.size()     // Catch:{ all -> 0x00b3 }
                if (r8 != r1) goto L_0x00a9
                goto L_0x00aa
            L_0x00a9:
                r1 = r2
            L_0x00aa:
                monitor-exit(r7)     // Catch:{ all -> 0x00b3 }
                if (r1 == 0) goto L_0x00cd
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this
                r7.m27663X(r6)
                goto L_0x00cd
            L_0x00b3:
                r6 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x00b3 }
                throw r6
            L_0x00b6:
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.a2 r7 = r7.f20008f
                if (r7 == 0) goto L_0x00c8
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.a2 r7 = r7.f20008f
                int r7 = r7.f19140a
                if (r7 != r1) goto L_0x00cd
            L_0x00c8:
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this
                r7.m27663X(r6)
            L_0x00cd:
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this
                java.util.concurrent.Executor r7 = r7.f20004b
                io.grpc.internal.z1$a0$d r8 = new io.grpc.internal.z1$a0$d
                r8.<init>(r6)
                r7.execute(r8)
                return
            L_0x00dc:
                io.grpc.internal.r$a r0 = p364io.grpc.internal.C12402r.C12403a.DROPPED
                if (r7 != r0) goto L_0x00ef
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                boolean r0 = r0.f20010h
                if (r0 == 0) goto L_0x0182
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                r0.m27667b0()
                goto L_0x0182
            L_0x00ef:
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f20018p
                r0.set(r1)
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                boolean r0 = r0.f20010h
                if (r0 == 0) goto L_0x014a
                io.grpc.internal.z1$v r0 = r5.m27702f(r6, r8)
                boolean r1 = r0.f20092a
                if (r1 == 0) goto L_0x010f
                io.grpc.internal.z1 r1 = p364io.grpc.internal.C12506z1.this
                java.lang.Integer r2 = r0.f20093b
                r1.m27669g0(r2)
            L_0x010f:
                io.grpc.internal.z1 r1 = p364io.grpc.internal.C12506z1.this
                java.lang.Object r1 = r1.f20011i
                monitor-enter(r1)
                io.grpc.internal.z1 r2 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0147 }
                io.grpc.internal.z1$z r3 = r2.f20017o     // Catch:{ all -> 0x0147 }
                io.grpc.internal.z1$b0 r4 = r5.f20027a     // Catch:{ all -> 0x0147 }
                io.grpc.internal.z1$z r3 = r3.mo50202e(r4)     // Catch:{ all -> 0x0147 }
                p364io.grpc.internal.C12506z1.C12544z unused = r2.f20017o = r3     // Catch:{ all -> 0x0147 }
                boolean r0 = r0.f20092a     // Catch:{ all -> 0x0147 }
                if (r0 == 0) goto L_0x0145
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0147 }
                io.grpc.internal.z1$z r2 = r0.f20017o     // Catch:{ all -> 0x0147 }
                boolean r0 = r0.m27668c0(r2)     // Catch:{ all -> 0x0147 }
                if (r0 != 0) goto L_0x0143
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0147 }
                io.grpc.internal.z1$z r0 = r0.f20017o     // Catch:{ all -> 0x0147 }
                java.util.Collection<io.grpc.internal.z1$b0> r0 = r0.f20103d     // Catch:{ all -> 0x0147 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0147 }
                if (r0 != 0) goto L_0x0145
            L_0x0143:
                monitor-exit(r1)     // Catch:{ all -> 0x0147 }
                return
            L_0x0145:
                monitor-exit(r1)     // Catch:{ all -> 0x0147 }
                goto L_0x0182
            L_0x0147:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0147 }
                throw r6
            L_0x014a:
                io.grpc.internal.z1$x r0 = r5.m27703g(r6, r8)
                boolean r1 = r0.f20097a
                if (r1 == 0) goto L_0x0182
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this
                java.lang.Object r1 = r6.f20011i
                monitor-enter(r1)
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x017f }
                io.grpc.internal.z1$u r7 = new io.grpc.internal.z1$u     // Catch:{ all -> 0x017f }
                java.lang.Object r8 = r6.f20011i     // Catch:{ all -> 0x017f }
                r7.<init>(r8)     // Catch:{ all -> 0x017f }
                p364io.grpc.internal.C12506z1.C12538u unused = r6.f20021s = r7     // Catch:{ all -> 0x017f }
                monitor-exit(r1)     // Catch:{ all -> 0x017f }
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this
                java.util.concurrent.ScheduledExecutorService r6 = r6.f20006d
                io.grpc.internal.z1$a0$b r8 = new io.grpc.internal.z1$a0$b
                r8.<init>()
                long r0 = r0.f20098b
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                java.util.concurrent.ScheduledFuture r6 = r6.schedule(r8, r0, r2)
                r7.mo50195c(r6)
                return
            L_0x017f:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x017f }
                throw r6
            L_0x0182:
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.z1$b0 r1 = r5.f20027a
                r0.m27663X(r1)
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.z1$z r0 = r0.f20017o
                io.grpc.internal.z1$b0 r0 = r0.f20105f
                io.grpc.internal.z1$b0 r1 = r5.f20027a
                if (r0 != r1) goto L_0x01a3
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                java.util.concurrent.Executor r0 = r0.f20005c
                io.grpc.internal.z1$a0$e r1 = new io.grpc.internal.z1$a0$e
                r1.<init>(r6, r7, r8)
                r0.execute(r1)
            L_0x01a3:
                return
            L_0x01a4:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01a4 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12506z1.C12508a0.mo49740d(io.grpc.t, io.grpc.internal.r$a, io.grpc.o):void");
        }
    }

    /* renamed from: io.grpc.internal.z1$b */
    /* compiled from: RetriableStream */
    class C12517b implements C12535r {

        /* renamed from: a */
        final /* synthetic */ String f20046a;

        C12517b(String str) {
            this.f20046a = str;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49719g(this.f20046a);
        }
    }

    /* renamed from: io.grpc.internal.z1$b0 */
    /* compiled from: RetriableStream */
    private static final class C12518b0 {

        /* renamed from: a */
        C12398q f20048a;

        /* renamed from: b */
        boolean f20049b;

        /* renamed from: c */
        boolean f20050c;

        /* renamed from: d */
        final int f20051d;

        C12518b0(int i) {
            this.f20051d = i;
        }
    }

    /* renamed from: io.grpc.internal.z1$c */
    /* compiled from: RetriableStream */
    class C12519c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Collection f20052b;

        /* renamed from: c */
        final /* synthetic */ C12518b0 f20053c;

        /* renamed from: d */
        final /* synthetic */ Future f20054d;

        /* renamed from: e */
        final /* synthetic */ Future f20055e;

        C12519c(Collection collection, C12518b0 b0Var, Future future, Future future2) {
            this.f20052b = collection;
            this.f20053c = b0Var;
            this.f20054d = future;
            this.f20055e = future2;
        }

        public void run() {
            for (C12518b0 b0Var : this.f20052b) {
                if (b0Var != this.f20053c) {
                    b0Var.f20048a.mo49660a(C12506z1.f20002z);
                }
            }
            Future future = this.f20054d;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f20055e;
            if (future2 != null) {
                future2.cancel(false);
            }
            C12506z1.this.mo49855e0();
        }
    }

    /* renamed from: io.grpc.internal.z1$c0 */
    /* compiled from: RetriableStream */
    static final class C12520c0 {

        /* renamed from: a */
        final int f20057a;

        /* renamed from: b */
        final int f20058b;

        /* renamed from: c */
        final int f20059c;

        /* renamed from: d */
        final AtomicInteger f20060d;

        C12520c0(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f20060d = atomicInteger;
            this.f20059c = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.f20057a = i;
            this.f20058b = i / 2;
            atomicInteger.set(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo50185a() {
            if (this.f20060d.get() > this.f20058b) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo50186b() {
            int i;
            int i2;
            do {
                i = this.f20060d.get();
                if (i == 0) {
                    return false;
                }
                i2 = i + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            } while (!this.f20060d.compareAndSet(i, Math.max(i2, 0)));
            if (i2 > this.f20058b) {
                return true;
            }
            return false;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: c */
        void mo50187c() {
            /*
                r4 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicInteger r0 = r4.f20060d
                int r0 = r0.get()
                int r1 = r4.f20057a
                if (r0 != r1) goto L_0x000b
                goto L_0x001a
            L_0x000b:
                int r2 = r4.f20059c
                int r2 = r2 + r0
                java.util.concurrent.atomic.AtomicInteger r3 = r4.f20060d
                int r1 = java.lang.Math.min(r2, r1)
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12506z1.C12520c0.mo50187c():void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12520c0)) {
                return false;
            }
            C12520c0 c0Var = (C12520c0) obj;
            if (this.f20057a == c0Var.f20057a && this.f20059c == c0Var.f20059c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C8007k.m15736b(Integer.valueOf(this.f20057a), Integer.valueOf(this.f20059c));
        }
    }

    /* renamed from: io.grpc.internal.z1$d */
    /* compiled from: RetriableStream */
    class C12521d implements C12535r {

        /* renamed from: a */
        final /* synthetic */ C13809k f20061a;

        C12521d(C13809k kVar) {
            this.f20061a = kVar;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49717e(this.f20061a);
        }
    }

    /* renamed from: io.grpc.internal.z1$e */
    /* compiled from: RetriableStream */
    class C12522e implements C12535r {

        /* renamed from: a */
        final /* synthetic */ C13819p f20063a;

        C12522e(C13819p pVar) {
            this.f20063a = pVar;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49663f(this.f20063a);
        }
    }

    /* renamed from: io.grpc.internal.z1$f */
    /* compiled from: RetriableStream */
    class C12523f implements C12535r {

        /* renamed from: a */
        final /* synthetic */ C13824r f20065a;

        C12523f(C13824r rVar) {
            this.f20065a = rVar;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49669n(this.f20065a);
        }
    }

    /* renamed from: io.grpc.internal.z1$g */
    /* compiled from: RetriableStream */
    class C12524g implements C12535r {
        C12524g() {
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.flush();
        }
    }

    /* renamed from: io.grpc.internal.z1$h */
    /* compiled from: RetriableStream */
    class C12525h implements C12535r {

        /* renamed from: a */
        final /* synthetic */ boolean f20068a;

        C12525h(boolean z) {
            this.f20068a = z;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49670o(this.f20068a);
        }
    }

    /* renamed from: io.grpc.internal.z1$i */
    /* compiled from: RetriableStream */
    class C12526i implements C12535r {
        C12526i() {
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49665i();
        }
    }

    /* renamed from: io.grpc.internal.z1$j */
    /* compiled from: RetriableStream */
    class C12527j implements C12535r {

        /* renamed from: a */
        final /* synthetic */ int f20071a;

        C12527j(int i) {
            this.f20071a = i;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49661c(this.f20071a);
        }
    }

    /* renamed from: io.grpc.internal.z1$k */
    /* compiled from: RetriableStream */
    class C12528k implements C12535r {

        /* renamed from: a */
        final /* synthetic */ int f20073a;

        C12528k(int i) {
            this.f20073a = i;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49662d(this.f20073a);
        }
    }

    /* renamed from: io.grpc.internal.z1$l */
    /* compiled from: RetriableStream */
    class C12529l implements C12535r {
        C12529l() {
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49721l();
        }
    }

    /* renamed from: io.grpc.internal.z1$m */
    /* compiled from: RetriableStream */
    class C12530m implements C12535r {

        /* renamed from: a */
        final /* synthetic */ int f20076a;

        C12530m(int i) {
            this.f20076a = i;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49716b(this.f20076a);
        }
    }

    /* renamed from: io.grpc.internal.z1$n */
    /* compiled from: RetriableStream */
    class C12531n implements C12535r {

        /* renamed from: a */
        final /* synthetic */ Object f20078a;

        C12531n(Object obj) {
            this.f20078a = obj;
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49720k(C12506z1.this.f20003a.mo53442j(this.f20078a));
        }
    }

    /* renamed from: io.grpc.internal.z1$o */
    /* compiled from: RetriableStream */
    class C12532o extends C12161c.C12163b {

        /* renamed from: a */
        final /* synthetic */ C12161c f20080a;

        C12532o(C12161c cVar) {
            this.f20080a = cVar;
        }

        /* renamed from: a */
        public C12161c mo49641a(C12161c.C12164c cVar, C12564o oVar) {
            return this.f20080a;
        }
    }

    /* renamed from: io.grpc.internal.z1$p */
    /* compiled from: RetriableStream */
    class C12533p implements Runnable {
        C12533p() {
        }

        public void run() {
            if (!C12506z1.this.f20025w) {
                C12506z1.this.f20020r.mo49739c();
            }
        }
    }

    /* renamed from: io.grpc.internal.z1$q */
    /* compiled from: RetriableStream */
    class C12534q implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12594t f20083b;

        C12534q(C12594t tVar) {
            this.f20083b = tVar;
        }

        public void run() {
            boolean unused = C12506z1.this.f20025w = true;
            C12506z1.this.f20020r.mo49740d(this.f20083b, C12402r.C12403a.PROCESSED, new C12564o());
        }
    }

    /* renamed from: io.grpc.internal.z1$r */
    /* compiled from: RetriableStream */
    private interface C12535r {
        /* renamed from: a */
        void mo50183a(C12518b0 b0Var);
    }

    /* renamed from: io.grpc.internal.z1$s */
    /* compiled from: RetriableStream */
    class C12536s extends C12161c {

        /* renamed from: a */
        private final C12518b0 f20085a;

        /* renamed from: b */
        long f20086b;

        C12536s(C12518b0 b0Var) {
            this.f20085a = b0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
            if (r6 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
            r6.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo49963h(long r6) {
            /*
                r5 = this;
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                io.grpc.internal.z1$z r0 = r0.f20017o
                io.grpc.internal.z1$b0 r0 = r0.f20105f
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                io.grpc.internal.z1 r0 = p364io.grpc.internal.C12506z1.this
                java.lang.Object r0 = r0.f20011i
                monitor-enter(r0)
                io.grpc.internal.z1 r1 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1$z r1 = r1.f20017o     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1$b0 r1 = r1.f20105f     // Catch:{ all -> 0x0085 }
                if (r1 != 0) goto L_0x0083
                io.grpc.internal.z1$b0 r1 = r5.f20085a     // Catch:{ all -> 0x0085 }
                boolean r1 = r1.f20049b     // Catch:{ all -> 0x0085 }
                if (r1 == 0) goto L_0x0023
                goto L_0x0083
            L_0x0023:
                long r1 = r5.f20086b     // Catch:{ all -> 0x0085 }
                long r1 = r1 + r6
                r5.f20086b = r1     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                long r6 = r6.f20019q     // Catch:{ all -> 0x0085 }
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x0034
                monitor-exit(r0)     // Catch:{ all -> 0x0085 }
                return
            L_0x0034:
                long r6 = r5.f20086b     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1 r1 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                long r1 = r1.f20013k     // Catch:{ all -> 0x0085 }
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                r7 = 1
                if (r6 <= 0) goto L_0x0046
                io.grpc.internal.z1$b0 r6 = r5.f20085a     // Catch:{ all -> 0x0085 }
                r6.f20050c = r7     // Catch:{ all -> 0x0085 }
                goto L_0x006e
            L_0x0046:
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1$t r6 = r6.f20012j     // Catch:{ all -> 0x0085 }
                long r1 = r5.f20086b     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1 r3 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                long r3 = r3.f20019q     // Catch:{ all -> 0x0085 }
                long r1 = r1 - r3
                long r1 = r6.mo50192a(r1)     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                long r3 = r5.f20086b     // Catch:{ all -> 0x0085 }
                long unused = r6.f20019q = r3     // Catch:{ all -> 0x0085 }
                io.grpc.internal.z1 r6 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                long r3 = r6.f20014l     // Catch:{ all -> 0x0085 }
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L_0x006e
                io.grpc.internal.z1$b0 r6 = r5.f20085a     // Catch:{ all -> 0x0085 }
                r6.f20050c = r7     // Catch:{ all -> 0x0085 }
            L_0x006e:
                io.grpc.internal.z1$b0 r6 = r5.f20085a     // Catch:{ all -> 0x0085 }
                boolean r7 = r6.f20050c     // Catch:{ all -> 0x0085 }
                if (r7 == 0) goto L_0x007b
                io.grpc.internal.z1 r7 = p364io.grpc.internal.C12506z1.this     // Catch:{ all -> 0x0085 }
                java.lang.Runnable r6 = r7.m27662W(r6)     // Catch:{ all -> 0x0085 }
                goto L_0x007c
            L_0x007b:
                r6 = 0
            L_0x007c:
                monitor-exit(r0)     // Catch:{ all -> 0x0085 }
                if (r6 == 0) goto L_0x0082
                r6.run()
            L_0x0082:
                return
            L_0x0083:
                monitor-exit(r0)     // Catch:{ all -> 0x0085 }
                return
            L_0x0085:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0085 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12506z1.C12536s.mo49963h(long):void");
        }
    }

    /* renamed from: io.grpc.internal.z1$t */
    /* compiled from: RetriableStream */
    static final class C12537t {

        /* renamed from: a */
        private final AtomicLong f20088a = new AtomicLong();

        C12537t() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo50192a(long j) {
            return this.f20088a.addAndGet(j);
        }
    }

    /* renamed from: io.grpc.internal.z1$u */
    /* compiled from: RetriableStream */
    private static final class C12538u {

        /* renamed from: a */
        final Object f20089a;

        /* renamed from: b */
        Future<?> f20090b;

        /* renamed from: c */
        boolean f20091c;

        C12538u(Object obj) {
            this.f20089a = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo50193a() {
            return this.f20091c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Future<?> mo50194b() {
            this.f20091c = true;
            return this.f20090b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo50195c(Future<?> future) {
            synchronized (this.f20089a) {
                if (!this.f20091c) {
                    this.f20090b = future;
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.z1$v */
    /* compiled from: RetriableStream */
    private static final class C12539v {

        /* renamed from: a */
        final boolean f20092a;

        /* renamed from: b */
        final Integer f20093b;

        public C12539v(boolean z, Integer num) {
            this.f20092a = z;
            this.f20093b = num;
        }
    }

    /* renamed from: io.grpc.internal.z1$w */
    /* compiled from: RetriableStream */
    private final class C12540w implements Runnable {

        /* renamed from: b */
        final C12538u f20094b;

        /* renamed from: io.grpc.internal.z1$w$a */
        /* compiled from: RetriableStream */
        class C12541a implements Runnable {
            C12541a() {
            }

            public void run() {
                C12538u uVar;
                C12506z1 z1Var = C12506z1.this;
                boolean z = false;
                C12518b0 Q = z1Var.m27664Y(z1Var.f20017o.f20104e, false);
                synchronized (C12506z1.this.f20011i) {
                    uVar = null;
                    if (C12540w.this.f20094b.mo50193a()) {
                        z = true;
                    } else {
                        C12506z1 z1Var2 = C12506z1.this;
                        C12544z unused = z1Var2.f20017o = z1Var2.f20017o.mo50198a(Q);
                        C12506z1 z1Var3 = C12506z1.this;
                        if (!z1Var3.m27668c0(z1Var3.f20017o) || (C12506z1.this.f20015m != null && !C12506z1.this.f20015m.mo50185a())) {
                            C12506z1 z1Var4 = C12506z1.this;
                            C12544z unused2 = z1Var4.f20017o = z1Var4.f20017o.mo50201d();
                            C12538u unused3 = C12506z1.this.f20022t = null;
                        } else {
                            C12506z1 z1Var5 = C12506z1.this;
                            uVar = new C12538u(z1Var5.f20011i);
                            C12538u unused4 = z1Var5.f20022t = uVar;
                        }
                    }
                }
                if (z) {
                    Q.f20048a.mo49660a(C12594t.f20184g.mo50310r("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.mo50195c(C12506z1.this.f20006d.schedule(new C12540w(uVar), C12506z1.this.f20009g.f19833b, TimeUnit.NANOSECONDS));
                }
                C12506z1.this.m27666a0(Q);
            }
        }

        C12540w(C12538u uVar) {
            this.f20094b = uVar;
        }

        public void run() {
            C12506z1.this.f20004b.execute(new C12541a());
        }
    }

    /* renamed from: io.grpc.internal.z1$x */
    /* compiled from: RetriableStream */
    private static final class C12542x {

        /* renamed from: a */
        final boolean f20097a;

        /* renamed from: b */
        final long f20098b;

        C12542x(boolean z, long j) {
            this.f20097a = z;
            this.f20098b = j;
        }
    }

    /* renamed from: io.grpc.internal.z1$y */
    /* compiled from: RetriableStream */
    class C12543y implements C12535r {
        C12543y() {
        }

        /* renamed from: a */
        public void mo50183a(C12518b0 b0Var) {
            b0Var.f20048a.mo49667j(new C12508a0(b0Var));
        }
    }

    /* renamed from: io.grpc.internal.z1$z */
    /* compiled from: RetriableStream */
    private static final class C12544z {

        /* renamed from: a */
        final boolean f20100a;

        /* renamed from: b */
        final List<C12535r> f20101b;

        /* renamed from: c */
        final Collection<C12518b0> f20102c;

        /* renamed from: d */
        final Collection<C12518b0> f20103d;

        /* renamed from: e */
        final int f20104e;

        /* renamed from: f */
        final C12518b0 f20105f;

        /* renamed from: g */
        final boolean f20106g;

        /* renamed from: h */
        final boolean f20107h;

        C12544z(List<C12535r> list, Collection<C12518b0> collection, Collection<C12518b0> collection2, C12518b0 b0Var, boolean z, boolean z2, boolean z3, int i) {
            boolean z4;
            boolean z5;
            boolean z6;
            this.f20101b = list;
            this.f20102c = (Collection) C8012n.m15756o(collection, "drainedSubstreams");
            this.f20105f = b0Var;
            this.f20103d = collection2;
            this.f20106g = z;
            this.f20100a = z2;
            this.f20107h = z3;
            this.f20104e = i;
            boolean z7 = false;
            if (!z2 || list == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            C8012n.m15762u(z4, "passThrough should imply buffer is null");
            if (!z2 || b0Var != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            C8012n.m15762u(z5, "passThrough should imply winningSubstream != null");
            if (!z2 || ((collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f20049b))) {
                z6 = true;
            } else {
                z6 = false;
            }
            C8012n.m15762u(z6, "passThrough should imply winningSubstream is drained");
            C8012n.m15762u((!z || b0Var != null) ? true : z7, "cancelled should imply committed");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12544z mo50198a(C12518b0 b0Var) {
            boolean z;
            Collection collection;
            C8012n.m15762u(!this.f20107h, "hedging frozen");
            if (this.f20105f == null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "already committed");
            if (this.f20103d == null) {
                collection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f20103d);
                arrayList.add(b0Var);
                collection = Collections.unmodifiableCollection(arrayList);
            }
            return new C12544z(this.f20101b, this.f20102c, collection, this.f20105f, this.f20106g, this.f20100a, this.f20107h, this.f20104e + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12544z mo50199b() {
            return new C12544z(this.f20101b, this.f20102c, this.f20103d, this.f20105f, true, this.f20100a, this.f20107h, this.f20104e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C12544z mo50200c(C12518b0 b0Var) {
            boolean z;
            boolean z2;
            Set set;
            List<C12535r> list;
            if (this.f20105f == null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "Already committed");
            List<C12535r> list2 = this.f20101b;
            if (this.f20102c.contains(b0Var)) {
                set = Collections.singleton(b0Var);
                z2 = true;
                list = null;
            } else {
                list = list2;
                set = Collections.emptyList();
                z2 = false;
            }
            return new C12544z(list, set, this.f20103d, b0Var, this.f20106g, z2, this.f20107h, this.f20104e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C12544z mo50201d() {
            if (this.f20107h) {
                return this;
            }
            return new C12544z(this.f20101b, this.f20102c, this.f20103d, this.f20105f, this.f20106g, this.f20100a, true, this.f20104e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C12544z mo50202e(C12518b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f20103d);
            arrayList.remove(b0Var);
            return new C12544z(this.f20101b, this.f20102c, Collections.unmodifiableCollection(arrayList), this.f20105f, this.f20106g, this.f20100a, this.f20107h, this.f20104e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C12544z mo50203f(C12518b0 b0Var, C12518b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f20103d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new C12544z(this.f20101b, this.f20102c, Collections.unmodifiableCollection(arrayList), this.f20105f, this.f20106g, this.f20100a, this.f20107h, this.f20104e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C12544z mo50204g(C12518b0 b0Var) {
            b0Var.f20049b = true;
            if (!this.f20102c.contains(b0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f20102c);
            arrayList.remove(b0Var);
            return new C12544z(this.f20101b, Collections.unmodifiableCollection(arrayList), this.f20103d, this.f20105f, this.f20106g, this.f20100a, this.f20107h, this.f20104e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C12544z mo50205h(C12518b0 b0Var) {
            Collection unmodifiableCollection;
            boolean z;
            boolean z2 = true;
            C8012n.m15762u(!this.f20100a, "Already passThrough");
            if (b0Var.f20049b) {
                unmodifiableCollection = this.f20102c;
            } else if (this.f20102c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f20102c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            C12518b0 b0Var2 = this.f20105f;
            if (b0Var2 != null) {
                z = true;
            } else {
                z = false;
            }
            List<C12535r> list = this.f20101b;
            if (z) {
                if (b0Var2 != b0Var) {
                    z2 = false;
                }
                C8012n.m15762u(z2, "Another RPC attempt has already committed");
                list = null;
            }
            return new C12544z(list, collection, this.f20103d, this.f20105f, this.f20106g, z, this.f20107h, this.f20104e);
        }
    }

    static {
        C12564o.C12568d<String> dVar = C12564o.f20135d;
        f20000x = C12564o.C12571g.m27836e("grpc-previous-rpc-attempts", dVar);
        f20001y = C12564o.C12571g.m27836e("grpc-retry-pushback-ms", dVar);
    }

    C12506z1(C13783d0<ReqT, ?> d0Var, C12564o oVar, C12537t tVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, C12189a2 a2Var, C12431t0 t0Var, C12520c0 c0Var) {
        boolean z;
        C12189a2 a2Var2 = a2Var;
        C12431t0 t0Var2 = t0Var;
        this.f20003a = d0Var;
        this.f20012j = tVar;
        this.f20013k = j;
        this.f20014l = j2;
        this.f20004b = executor;
        this.f20006d = scheduledExecutorService;
        this.f20007e = oVar;
        this.f20008f = a2Var2;
        if (a2Var2 != null) {
            this.f20023u = a2Var2.f19141b;
        }
        this.f20009g = t0Var2;
        boolean z2 = false;
        if (a2Var2 == null || t0Var2 == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15746e(z, "Should not provide both retryPolicy and hedgingPolicy");
        this.f20010h = t0Var2 != null ? true : z2;
        this.f20015m = c0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public Runnable m27662W(C12518b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f20011i) {
            if (this.f20017o.f20105f != null) {
                return null;
            }
            Collection<C12518b0> collection = this.f20017o.f20102c;
            this.f20017o = this.f20017o.mo50200c(b0Var);
            this.f20012j.mo50192a(-this.f20019q);
            C12538u uVar = this.f20021s;
            if (uVar != null) {
                Future<?> b = uVar.mo50194b();
                this.f20021s = null;
                future = b;
            } else {
                future = null;
            }
            C12538u uVar2 = this.f20022t;
            if (uVar2 != null) {
                Future<?> b2 = uVar2.mo50194b();
                this.f20022t = null;
                future2 = b2;
            } else {
                future2 = null;
            }
            C12519c cVar = new C12519c(collection, b0Var, future, future2);
            return cVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m27663X(C12518b0 b0Var) {
        Runnable W = m27662W(b0Var);
        if (W != null) {
            W.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public C12518b0 m27664Y(int i, boolean z) {
        C12518b0 b0Var = new C12518b0(i);
        b0Var.f20048a = mo49854d0(mo50173i0(this.f20007e, i), new C12532o(new C12536s(b0Var)), i, z);
        return b0Var;
    }

    /* renamed from: Z */
    private void m27665Z(C12535r rVar) {
        Collection<C12518b0> collection;
        synchronized (this.f20011i) {
            if (!this.f20017o.f20100a) {
                this.f20017o.f20101b.add(rVar);
            }
            collection = this.f20017o.f20102c;
        }
        for (C12518b0 a : collection) {
            rVar.mo50183a(a);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        if (r2.hasNext() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0085, code lost:
        r4 = (p364io.grpc.internal.C12506z1.C12535r) r2.next();
        r4.mo50183a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        if ((r4 instanceof p364io.grpc.internal.C12506z1.C12543y) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r0 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r4 = r8.f20017o;
        r5 = r4.f20105f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0099, code lost:
        if (r5 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r5 == r9) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        if (r4.f20106g == false) goto L_0x007f;
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27666a0(p364io.grpc.internal.C12506z1.C12518b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L_0x0004:
            java.lang.Object r4 = r8.f20011i
            monitor-enter(r4)
            io.grpc.internal.z1$z r5 = r8.f20017o     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0019
            io.grpc.internal.z1$b0 r6 = r5.f20105f     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0013
            if (r6 == r9) goto L_0x0013
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0013:
            boolean r6 = r5.f20106g     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0019
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0019:
            java.util.List<io.grpc.internal.z1$r> r6 = r5.f20101b     // Catch:{ all -> 0x00a5 }
            int r6 = r6.size()     // Catch:{ all -> 0x00a5 }
            if (r2 != r6) goto L_0x004e
            io.grpc.internal.z1$z r0 = r5.mo50205h(r9)     // Catch:{ all -> 0x00a5 }
            r8.f20017o = r0     // Catch:{ all -> 0x00a5 }
            boolean r0 = r8.isReady()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x002f
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            return
        L_0x002f:
            io.grpc.internal.z1$p r1 = new io.grpc.internal.z1$p     // Catch:{ all -> 0x00a5 }
            r1.<init>()     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
        L_0x0035:
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r9 = r8.f20005c
            r9.execute(r1)
            return
        L_0x003d:
            io.grpc.internal.q r0 = r9.f20048a
            io.grpc.internal.z1$z r1 = r8.f20017o
            io.grpc.internal.z1$b0 r1 = r1.f20105f
            if (r1 != r9) goto L_0x0048
            io.grpc.t r9 = r8.f20024v
            goto L_0x004a
        L_0x0048:
            io.grpc.t r9 = f20002z
        L_0x004a:
            r0.mo49660a(r9)
            return
        L_0x004e:
            boolean r6 = r9.f20049b     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0054
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            return
        L_0x0054:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.z1$r> r7 = r5.f20101b     // Catch:{ all -> 0x00a5 }
            int r7 = r7.size()     // Catch:{ all -> 0x00a5 }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x006e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00a5 }
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f20101b     // Catch:{ all -> 0x00a5 }
            java.util.List r2 = r5.subList(r2, r6)     // Catch:{ all -> 0x00a5 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x007a
        L_0x006e:
            r3.clear()     // Catch:{ all -> 0x00a5 }
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f20101b     // Catch:{ all -> 0x00a5 }
            java.util.List r2 = r5.subList(r2, r6)     // Catch:{ all -> 0x00a5 }
            r3.addAll(r2)     // Catch:{ all -> 0x00a5 }
        L_0x007a:
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r2 = r3.iterator()
        L_0x007f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00a2
            java.lang.Object r4 = r2.next()
            io.grpc.internal.z1$r r4 = (p364io.grpc.internal.C12506z1.C12535r) r4
            r4.mo50183a(r9)
            boolean r4 = r4 instanceof p364io.grpc.internal.C12506z1.C12543y
            if (r4 == 0) goto L_0x0093
            r0 = 1
        L_0x0093:
            if (r0 == 0) goto L_0x007f
            io.grpc.internal.z1$z r4 = r8.f20017o
            io.grpc.internal.z1$b0 r5 = r4.f20105f
            if (r5 == 0) goto L_0x009e
            if (r5 == r9) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            boolean r4 = r4.f20106g
            if (r4 == 0) goto L_0x007f
        L_0x00a2:
            r2 = r6
            goto L_0x0004
        L_0x00a5:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12506z1.m27666a0(io.grpc.internal.z1$b0):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m27667b0() {
        Future<?> future;
        synchronized (this.f20011i) {
            C12538u uVar = this.f20022t;
            future = null;
            if (uVar != null) {
                Future<?> b = uVar.mo50194b();
                this.f20022t = null;
                future = b;
            }
            this.f20017o = this.f20017o.mo50201d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public boolean m27668c0(C12544z zVar) {
        if (zVar.f20105f != null || zVar.f20104e >= this.f20009g.f19832a || zVar.f20107h) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r1.cancel(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2.mo50195c(r5.f20006d.schedule(new p364io.grpc.internal.C12506z1.C12540w(r5, r2), (long) r6.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27669g0(java.lang.Integer r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r6.intValue()
            if (r0 >= 0) goto L_0x000d
            r5.m27667b0()
            return
        L_0x000d:
            java.lang.Object r0 = r5.f20011i
            monitor-enter(r0)
            io.grpc.internal.z1$u r1 = r5.f20022t     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0016:
            java.util.concurrent.Future r1 = r1.mo50194b()     // Catch:{ all -> 0x0040 }
            io.grpc.internal.z1$u r2 = new io.grpc.internal.z1$u     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r5.f20011i     // Catch:{ all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ all -> 0x0040 }
            r5.f20022t = r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r1.cancel(r0)
        L_0x002a:
            java.util.concurrent.ScheduledExecutorService r0 = r5.f20006d
            io.grpc.internal.z1$w r1 = new io.grpc.internal.z1$w
            r1.<init>(r2)
            int r6 = r6.intValue()
            long r3 = (long) r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r6 = r0.schedule(r1, r3, r6)
            r2.mo50195c(r6)
            return
        L_0x0040:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12506z1.m27669g0(java.lang.Integer):void");
    }

    /* renamed from: a */
    public final void mo49660a(C12594t tVar) {
        C12518b0 b0Var;
        C12518b0 b0Var2 = new C12518b0(0);
        b0Var2.f20048a = new C12378o1();
        Runnable W = m27662W(b0Var2);
        if (W != null) {
            W.run();
            this.f20005c.execute(new C12534q(tVar));
            return;
        }
        synchronized (this.f20011i) {
            if (this.f20017o.f20102c.contains(this.f20017o.f20105f)) {
                b0Var = this.f20017o.f20105f;
            } else {
                this.f20024v = tVar;
                b0Var = null;
            }
            this.f20017o = this.f20017o.mo50199b();
        }
        if (b0Var != null) {
            b0Var.f20048a.mo49660a(tVar);
        }
    }

    /* renamed from: b */
    public final void mo49716b(int i) {
        C12544z zVar = this.f20017o;
        if (zVar.f20100a) {
            zVar.f20105f.f20048a.mo49716b(i);
        } else {
            m27665Z(new C12530m(i));
        }
    }

    /* renamed from: c */
    public final void mo49661c(int i) {
        m27665Z(new C12527j(i));
    }

    /* renamed from: d */
    public final void mo49662d(int i) {
        m27665Z(new C12528k(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public abstract C12398q mo49854d0(C12564o oVar, C12161c.C12162a aVar, int i, boolean z);

    /* renamed from: e */
    public final void mo49717e(C13809k kVar) {
        m27665Z(new C12521d(kVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public abstract void mo49855e0();

    /* renamed from: f */
    public final void mo49663f(C13819p pVar) {
        m27665Z(new C12522e(pVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public abstract C12594t mo49856f0();

    public final void flush() {
        C12544z zVar = this.f20017o;
        if (zVar.f20100a) {
            zVar.f20105f.f20048a.flush();
        } else {
            m27665Z(new C12524g());
        }
    }

    /* renamed from: g */
    public final void mo49719g(String str) {
        m27665Z(new C12517b(str));
    }

    /* renamed from: h */
    public void mo49664h(C12460x0 x0Var) {
        C12544z zVar;
        synchronized (this.f20011i) {
            x0Var.mo50128b("closed", this.f20016n);
            zVar = this.f20017o;
        }
        if (zVar.f20105f != null) {
            C12460x0 x0Var2 = new C12460x0();
            zVar.f20105f.f20048a.mo49664h(x0Var2);
            x0Var.mo50128b("committed", x0Var2);
            return;
        }
        C12460x0 x0Var3 = new C12460x0();
        for (C12518b0 b0Var : zVar.f20102c) {
            C12460x0 x0Var4 = new C12460x0();
            b0Var.f20048a.mo49664h(x0Var4);
            x0Var3.mo50127a(x0Var4);
        }
        x0Var.mo50128b("open", x0Var3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final void mo50172h0(ReqT reqt) {
        C12544z zVar = this.f20017o;
        if (zVar.f20100a) {
            zVar.f20105f.f20048a.mo49720k(this.f20003a.mo53442j(reqt));
        } else {
            m27665Z(new C12531n(reqt));
        }
    }

    /* renamed from: i */
    public final void mo49665i() {
        m27665Z(new C12526i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final C12564o mo50173i0(C12564o oVar, int i) {
        C12564o oVar2 = new C12564o();
        oVar2.mo50243k(oVar);
        if (i > 0) {
            oVar2.mo50244n(f20000x, String.valueOf(i));
        }
        return oVar2;
    }

    public final boolean isReady() {
        for (C12518b0 b0Var : this.f20017o.f20102c) {
            if (b0Var.f20048a.isReady()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo49667j(C12402r rVar) {
        C12538u uVar;
        C12520c0 c0Var;
        this.f20020r = rVar;
        C12594t f0 = mo49856f0();
        if (f0 != null) {
            mo49660a(f0);
            return;
        }
        synchronized (this.f20011i) {
            this.f20017o.f20101b.add(new C12543y());
        }
        C12518b0 Y = m27664Y(0, false);
        if (this.f20010h) {
            synchronized (this.f20011i) {
                this.f20017o = this.f20017o.mo50198a(Y);
                if (!m27668c0(this.f20017o) || ((c0Var = this.f20015m) != null && !c0Var.mo50185a())) {
                    uVar = null;
                } else {
                    uVar = new C12538u(this.f20011i);
                    this.f20022t = uVar;
                }
            }
            if (uVar != null) {
                uVar.mo50195c(this.f20006d.schedule(new C12540w(uVar), this.f20009g.f19833b, TimeUnit.NANOSECONDS));
            }
        }
        m27666a0(Y);
    }

    /* renamed from: k */
    public final void mo49720k(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    /* renamed from: l */
    public void mo49721l() {
        m27665Z(new C12529l());
    }

    /* renamed from: n */
    public final void mo49669n(C13824r rVar) {
        m27665Z(new C12523f(rVar));
    }

    /* renamed from: o */
    public final void mo49670o(boolean z) {
        m27665Z(new C12525h(z));
    }
}
