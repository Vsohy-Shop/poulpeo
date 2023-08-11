package p364io.grpc.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p111h6.C8003j;
import p111h6.C8012n;
import p111h6.C8016p;
import p111h6.C8019r;
import p364io.grpc.C12155a;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12167e;
import p364io.grpc.C12169g;
import p364io.grpc.C12546k;
import p364io.grpc.C12564o;
import p364io.grpc.C12575p;
import p364io.grpc.C12587r;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12325j;
import p364io.grpc.internal.C12333j1;
import p364io.grpc.internal.C12338k;
import p364io.grpc.internal.C12341k1;
import p364io.grpc.internal.C12358m;
import p364io.grpc.internal.C12383p;
import p364io.grpc.internal.C12463y0;
import p364io.grpc.internal.C12506z1;
import p458xd.C13773a;
import p458xd.C13777b;
import p458xd.C13780c0;
import p458xd.C13781d;
import p458xd.C13783d0;
import p458xd.C13788e;
import p458xd.C13791f;
import p458xd.C13794g0;
import p458xd.C13795h;
import p458xd.C13805j0;
import p458xd.C13811l;
import p458xd.C13813m;
import p458xd.C13814n;
import p458xd.C13815o;
import p458xd.C13824r;
import p458xd.C13827t;
import p458xd.C13832v;
import p458xd.C13836w;
import p458xd.C13840y;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.g1 */
/* compiled from: ManagedChannelImpl */
final class C12271g1 extends C13780c0 implements C13840y<Object> {

    /* renamed from: n0 */
    static final Logger f19332n0 = Logger.getLogger(C12271g1.class.getName());

    /* renamed from: o0 */
    static final Pattern f19333o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: p0 */
    static final C12594t f19334p0;

    /* renamed from: q0 */
    static final C12594t f19335q0;

    /* renamed from: r0 */
    static final C12594t f19336r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public static final C12333j1 f19337s0 = C12333j1.m27092a();
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public static final C12169g f19338t0 = new C12272a();
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public static final C13788e<Object, Object> f19339u0 = new C12278g();

    /* renamed from: A */
    private final C13777b f19340A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final String f19341B;

    /* renamed from: C */
    private C12575p f19342C;

    /* renamed from: D */
    private boolean f19343D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C12289o f19344E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public volatile C12546k.C12557i f19345F;

    /* renamed from: G */
    private boolean f19346G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final Set<C12463y0> f19347H = new HashSet(16, 0.75f);
    /* access modifiers changed from: private */

    /* renamed from: I */
    public Collection<C12295q.C12300e<?, ?>> f19348I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final Object f19349J = new Object();

    /* renamed from: K */
    private final Set<C12400q1> f19350K = new HashSet(1, 0.75f);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C12181a0 f19351L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C12308u f19352M = new C12308u(this, (C12272a) null);
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final AtomicBoolean f19353N = new AtomicBoolean(false);

    /* renamed from: O */
    private boolean f19354O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f19355P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public volatile boolean f19356Q;

    /* renamed from: R */
    private final CountDownLatch f19357R = new CountDownLatch(1);
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C12358m.C12360b f19358S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final C12358m f19359T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C12374o f19360U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C13781d f19361V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C13832v f19362W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C12295q f19363X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C12303r f19364Y = C12303r.NO_RESOLUTION;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C12333j1 f19365Z = f19337s0;

    /* renamed from: a */
    private final C13841z f19366a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C12333j1 f19367a0;

    /* renamed from: b */
    private final String f19368b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public boolean f19369b0 = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f19370c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final boolean f19371c0;

    /* renamed from: d */
    private final C12587r f19372d;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C12506z1.C12537t f19373d0 = new C12506z1.C12537t();

    /* renamed from: e */
    private final C12575p.C12580d f19374e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final long f19375e0;

    /* renamed from: f */
    private final C12575p.C12577b f19376f;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public final long f19377f0;

    /* renamed from: g */
    private final C12325j f19378g;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final boolean f19379g0;

    /* renamed from: h */
    private final C12429t f19380h;

    /* renamed from: h0 */
    private final C12341k1.C12342a f19381h0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C12429t f19382i;

    /* renamed from: i0 */
    final C12454w0<Object> f19383i0;

    /* renamed from: j */
    private final C12429t f19384j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C13805j0.C13808c f19385j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C12304s f19386k;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C12338k f19387k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Executor f19388l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public final C12383p.C12392e f19389l0;

    /* renamed from: m */
    private final C12396p1<? extends Executor> f19390m;

    /* renamed from: m0 */
    private final C12483y1 f19391m0;

    /* renamed from: n */
    private final C12396p1<? extends Executor> f19392n;

    /* renamed from: o */
    private final C12286l f19393o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C12286l f19394p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C12356l2 f19395q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final int f19396r;

    /* renamed from: s */
    final C13805j0 f19397s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f19398t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C13824r f19399u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C13811l f19400v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C8019r<C8016p> f19401w;

    /* renamed from: x */
    private final long f19402x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C12452w f19403y = new C12452w();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C12338k.C12339a f19404z;

    /* renamed from: io.grpc.internal.g1$a */
    /* compiled from: ManagedChannelImpl */
    class C12272a extends C12169g {
        C12272a() {
        }

        /* renamed from: a */
        public C12169g.C12171b mo49654a(C12546k.C12553f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* renamed from: io.grpc.internal.g1$b */
    /* compiled from: ManagedChannelImpl */
    final class C12273b implements C12358m.C12360b {

        /* renamed from: a */
        final /* synthetic */ C12356l2 f19405a;

        C12273b(C12356l2 l2Var) {
            this.f19405a = l2Var;
        }

        /* renamed from: a */
        public C12358m mo49844a() {
            return new C12358m(this.f19405a);
        }
    }

    /* renamed from: io.grpc.internal.g1$c */
    /* compiled from: ManagedChannelImpl */
    final class C12274c extends C12546k.C12557i {

        /* renamed from: a */
        private final C12546k.C12552e f19407a;

        /* renamed from: b */
        final /* synthetic */ Throwable f19408b;

        C12274c(Throwable th) {
            this.f19408b = th;
            this.f19407a = C12546k.C12552e.m27759e(C12594t.f20197t.mo50310r("Panic! This is a bug!").mo50309q(th));
        }

        /* renamed from: a */
        public C12546k.C12552e mo48964a(C12546k.C12553f fVar) {
            return this.f19407a;
        }

        public String toString() {
            return C8003j.m15722b(C12274c.class).mo41840d("panicPickResult", this.f19407a).toString();
        }
    }

    /* renamed from: io.grpc.internal.g1$d */
    /* compiled from: ManagedChannelImpl */
    class C12275d implements Thread.UncaughtExceptionHandler {
        C12275d() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = C12271g1.f19332n0;
            Level level = Level.SEVERE;
            logger.log(level, "[" + C12271g1.this.mo49701f() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C12271g1.this.mo49839A0(th);
        }
    }

    /* renamed from: io.grpc.internal.g1$e */
    /* compiled from: ManagedChannelImpl */
    class C12276e implements Executor {
        C12276e() {
        }

        public void execute(Runnable runnable) {
            C12271g1.this.f19394p.mo49864a().execute(runnable);
        }
    }

    /* renamed from: io.grpc.internal.g1$f */
    /* compiled from: ManagedChannelImpl */
    class C12277f extends C12370n0 {

        /* renamed from: b */
        final /* synthetic */ String f19412b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12277f(C12575p pVar, String str) {
            super(pVar);
            this.f19412b = str;
        }

        /* renamed from: a */
        public String mo49753a() {
            return this.f19412b;
        }
    }

    /* renamed from: io.grpc.internal.g1$h */
    /* compiled from: ManagedChannelImpl */
    private final class C12279h implements C12383p.C12392e {

        /* renamed from: io.grpc.internal.g1$h$a */
        /* compiled from: ManagedChannelImpl */
        final class C12280a implements Runnable {
            C12280a() {
            }

            public void run() {
                C12271g1.this.mo49843u0();
            }
        }

        /* renamed from: io.grpc.internal.g1$h$b */
        /* compiled from: ManagedChannelImpl */
        final class C12281b<ReqT> extends C12506z1<ReqT> {

            /* renamed from: B */
            final /* synthetic */ C13783d0 f19415B;

            /* renamed from: C */
            final /* synthetic */ C12564o f19416C;

            /* renamed from: D */
            final /* synthetic */ C12159b f19417D;

            /* renamed from: E */
            final /* synthetic */ C12189a2 f19418E;

            /* renamed from: F */
            final /* synthetic */ C12431t0 f19419F;

            /* renamed from: G */
            final /* synthetic */ C12506z1.C12520c0 f19420G;

            /* renamed from: H */
            final /* synthetic */ C13815o f19421H;

            /* renamed from: I */
            final /* synthetic */ C12279h f19422I;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            C12281b(p364io.grpc.internal.C12271g1.C12279h r16, p458xd.C13783d0 r17, p364io.grpc.C12564o r18, p364io.grpc.C12159b r19, p364io.grpc.internal.C12189a2 r20, p364io.grpc.internal.C12431t0 r21, p364io.grpc.internal.C12506z1.C12520c0 r22, p458xd.C13815o r23) {
                /*
                    r15 = this;
                    r13 = r15
                    r0 = r16
                    r1 = r19
                    r13.f19422I = r0
                    r2 = r17
                    r13.f19415B = r2
                    r3 = r18
                    r13.f19416C = r3
                    r13.f19417D = r1
                    r10 = r20
                    r13.f19418E = r10
                    r11 = r21
                    r13.f19419F = r11
                    r12 = r22
                    r13.f19420G = r12
                    r4 = r23
                    r13.f19421H = r4
                    io.grpc.internal.g1 r4 = p364io.grpc.internal.C12271g1.this
                    io.grpc.internal.z1$t r4 = r4.f19373d0
                    io.grpc.internal.g1 r5 = p364io.grpc.internal.C12271g1.this
                    long r5 = r5.f19375e0
                    io.grpc.internal.g1 r7 = p364io.grpc.internal.C12271g1.this
                    long r7 = r7.f19377f0
                    io.grpc.internal.g1 r9 = p364io.grpc.internal.C12271g1.this
                    java.util.concurrent.Executor r9 = r9.m26923v0(r1)
                    io.grpc.internal.g1 r0 = p364io.grpc.internal.C12271g1.this
                    io.grpc.internal.t r0 = r0.f19382i
                    java.util.concurrent.ScheduledExecutorService r14 = r0.mo49981i0()
                    r0 = r15
                    r1 = r17
                    r2 = r18
                    r3 = r4
                    r4 = r5
                    r6 = r7
                    r8 = r9
                    r9 = r14
                    r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12271g1.C12279h.C12281b.<init>(io.grpc.internal.g1$h, xd.d0, io.grpc.o, io.grpc.b, io.grpc.internal.a2, io.grpc.internal.t0, io.grpc.internal.z1$c0, xd.o):void");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d0 */
            public C12398q mo49854d0(C12564o oVar, C12161c.C12162a aVar, int i, boolean z) {
                C12159b q = this.f19417D.mo49632q(aVar);
                C12161c[] f = C12404r0.m27327f(q, oVar, i, z);
                C12422s b = this.f19422I.m26947c(new C12432t1(this.f19415B, oVar, q));
                C13815o b2 = this.f19421H.mo53475b();
                try {
                    return b.mo49699d(this.f19415B, oVar, q, f);
                } finally {
                    this.f19421H.mo53477f(b2);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e0 */
            public void mo49855e0() {
                C12271g1.this.f19352M.mo49921c(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f0 */
            public C12594t mo49856f0() {
                return C12271g1.this.f19352M.mo49919a(this);
            }
        }

        private C12279h() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C12422s m26947c(C12546k.C12553f fVar) {
            C12546k.C12557i l = C12271g1.this.f19345F;
            if (C12271g1.this.f19353N.get()) {
                return C12271g1.this.f19351L;
            }
            if (l == null) {
                C12271g1.this.f19397s.execute(new C12280a());
                return C12271g1.this.f19351L;
            }
            C12422s j = C12404r0.m27331j(l.mo48964a(fVar), fVar.mo50085a().mo49625j());
            if (j != null) {
                return j;
            }
            return C12271g1.this.f19351L;
        }

        /* renamed from: a */
        public C12398q mo49852a(C13783d0<?, ?> d0Var, C12159b bVar, C12564o oVar, C13815o oVar2) {
            C12189a2 a2Var;
            C12431t0 t0Var;
            if (!C12271g1.this.f19379g0) {
                C12422s c = m26947c(new C12432t1(d0Var, oVar, bVar));
                C13815o b = oVar2.mo53475b();
                try {
                    return c.mo49699d(d0Var, oVar, bVar, C12404r0.m27327f(bVar, oVar, 0, false));
                } finally {
                    oVar2.mo53477f(b);
                }
            } else {
                C12506z1.C12520c0 g = C12271g1.this.f19365Z.mo49971g();
                C12333j1.C12335b bVar2 = (C12333j1.C12335b) bVar.mo49623h(C12333j1.C12335b.f19566g);
                if (bVar2 == null) {
                    a2Var = null;
                } else {
                    a2Var = bVar2.f19571e;
                }
                if (bVar2 == null) {
                    t0Var = null;
                } else {
                    t0Var = bVar2.f19572f;
                }
                return new C12281b(this, d0Var, oVar, bVar, a2Var, t0Var, g, oVar2);
            }
        }

        /* synthetic */ C12279h(C12271g1 g1Var, C12272a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$i */
    /* compiled from: ManagedChannelImpl */
    static final class C12282i<ReqT, RespT> extends C13827t<ReqT, RespT> {

        /* renamed from: a */
        private final C12169g f19423a;

        /* renamed from: b */
        private final C13777b f19424b;

        /* renamed from: c */
        private final Executor f19425c;

        /* renamed from: d */
        private final C13783d0<ReqT, RespT> f19426d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C13815o f19427e;

        /* renamed from: f */
        private C12159b f19428f;

        /* renamed from: g */
        private C13788e<ReqT, RespT> f19429g;

        /* renamed from: io.grpc.internal.g1$i$a */
        /* compiled from: ManagedChannelImpl */
        class C12283a extends C12459x {

            /* renamed from: c */
            final /* synthetic */ C13788e.C13789a f19430c;

            /* renamed from: d */
            final /* synthetic */ C12594t f19431d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12283a(C13788e.C13789a aVar, C12594t tVar) {
                super(C12282i.this.f19427e);
                this.f19430c = aVar;
                this.f19431d = tVar;
            }

            /* renamed from: a */
            public void mo49858a() {
                this.f19430c.mo46134a(this.f19431d, new C12564o());
            }
        }

        C12282i(C12169g gVar, C13777b bVar, Executor executor, C13783d0<ReqT, RespT> d0Var, C12159b bVar2) {
            this.f19423a = gVar;
            this.f19424b = bVar;
            this.f19426d = d0Var;
            executor = bVar2.mo49620e() != null ? bVar2.mo49620e() : executor;
            this.f19425c = executor;
            this.f19428f = bVar2.mo49628m(executor);
            this.f19427e = C13815o.m31725e();
        }

        /* renamed from: h */
        private void m26953h(C13788e.C13789a<RespT> aVar, C12594t tVar) {
            this.f19425c.execute(new C12283a(aVar, tVar));
        }

        /* renamed from: a */
        public void mo49848a(String str, Throwable th) {
            C13788e<ReqT, RespT> eVar = this.f19429g;
            if (eVar != null) {
                eVar.mo49848a(str, th);
            }
        }

        /* renamed from: e */
        public void mo46138e(C13788e.C13789a<RespT> aVar, C12564o oVar) {
            C12169g.C12171b a = this.f19423a.mo49654a(new C12432t1(this.f19426d, oVar, this.f19428f));
            C12594t c = a.mo49657c();
            if (!c.mo50308p()) {
                m26953h(aVar, c);
                this.f19429g = C12271g1.f19339u0;
                return;
            }
            C13791f b = a.mo49656b();
            C12333j1.C12335b f = ((C12333j1) a.mo49655a()).mo49970f(this.f19426d);
            if (f != null) {
                this.f19428f = this.f19428f.mo49631p(C12333j1.C12335b.f19566g, f);
            }
            if (b != null) {
                this.f19429g = b.mo46137a(this.f19426d, this.f19428f, this.f19424b);
            } else {
                this.f19429g = this.f19424b.mo49841h(this.f19426d, this.f19428f);
            }
            this.f19429g.mo46138e(aVar, oVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C13788e<ReqT, RespT> mo49857f() {
            return this.f19429g;
        }
    }

    /* renamed from: io.grpc.internal.g1$j */
    /* compiled from: ManagedChannelImpl */
    class C12284j implements Runnable {
        C12284j() {
        }

        public void run() {
            C13805j0.C13808c unused = C12271g1.this.f19385j0 = null;
            C12271g1.this.m26862C0();
        }
    }

    /* renamed from: io.grpc.internal.g1$k */
    /* compiled from: ManagedChannelImpl */
    private final class C12285k implements C12341k1.C12342a {
        private C12285k() {
        }

        /* renamed from: a */
        public void mo49860a(C12594t tVar) {
            C8012n.m15762u(C12271g1.this.f19353N.get(), "Channel must have been shut down");
        }

        /* renamed from: c */
        public void mo49862c() {
            C8012n.m15762u(C12271g1.this.f19353N.get(), "Channel must have been shut down");
            boolean unused = C12271g1.this.f19355P = true;
            C12271g1.this.m26866E0(false);
            C12271g1.this.m26929y0();
            C12271g1.this.m26931z0();
        }

        /* renamed from: d */
        public void mo49863d(boolean z) {
            C12271g1 g1Var = C12271g1.this;
            g1Var.f19383i0.mo50116e(g1Var.f19351L, z);
        }

        /* synthetic */ C12285k(C12271g1 g1Var, C12272a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo49861b() {
        }
    }

    /* renamed from: io.grpc.internal.g1$l */
    /* compiled from: ManagedChannelImpl */
    private static final class C12286l {

        /* renamed from: a */
        private final C12396p1<? extends Executor> f19435a;

        /* renamed from: b */
        private Executor f19436b;

        C12286l(C12396p1<? extends Executor> p1Var) {
            this.f19435a = (C12396p1) C8012n.m15756o(p1Var, "executorPool");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized Executor mo49864a() {
            if (this.f19436b == null) {
                this.f19436b = (Executor) C8012n.m15757p(this.f19435a.mo49922a(), "%s.getObject()", this.f19436b);
            }
            return this.f19436b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo49865b() {
            Executor executor = this.f19436b;
            if (executor != null) {
                this.f19436b = (Executor) this.f19435a.mo49923b(executor);
            }
        }
    }

    /* renamed from: io.grpc.internal.g1$m */
    /* compiled from: ManagedChannelImpl */
    private final class C12287m extends C12454w0<Object> {
        private C12287m() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo49866b() {
            C12271g1.this.mo49843u0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo49867c() {
            if (!C12271g1.this.f19353N.get()) {
                C12271g1.this.m26864D0();
            }
        }

        /* synthetic */ C12287m(C12271g1 g1Var, C12272a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$n */
    /* compiled from: ManagedChannelImpl */
    private class C12288n implements Runnable {
        private C12288n() {
        }

        public void run() {
            C12271g1.this.m26920t0();
        }

        /* synthetic */ C12288n(C12271g1 g1Var, C12272a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$o */
    /* compiled from: ManagedChannelImpl */
    private final class C12289o extends C12546k.C12551d {

        /* renamed from: a */
        C12325j.C12327b f19439a;

        /* renamed from: b */
        boolean f19440b;

        /* renamed from: c */
        boolean f19441c;

        /* renamed from: io.grpc.internal.g1$o$a */
        /* compiled from: ManagedChannelImpl */
        final class C12290a implements Runnable {
            C12290a() {
            }

            public void run() {
                C12271g1.this.m26860B0();
            }
        }

        /* renamed from: io.grpc.internal.g1$o$b */
        /* compiled from: ManagedChannelImpl */
        final class C12291b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12546k.C12557i f19444b;

            /* renamed from: c */
            final /* synthetic */ C13813m f19445c;

            C12291b(C12546k.C12557i iVar, C13813m mVar) {
                this.f19444b = iVar;
                this.f19445c = mVar;
            }

            public void run() {
                C12289o oVar = C12289o.this;
                if (oVar == C12271g1.this.f19344E) {
                    C12271g1.this.m26868F0(this.f19444b);
                    if (this.f19445c != C13813m.SHUTDOWN) {
                        C12271g1.this.f19361V.mo50003b(C13781d.C13782a.INFO, "Entering {0} state with picker: {1}", this.f19445c, this.f19444b);
                        C12271g1.this.f19403y.mo50112a(this.f19445c);
                    }
                }
            }
        }

        private C12289o() {
        }

        /* renamed from: b */
        public C13781d mo49870b() {
            return C12271g1.this.f19361V;
        }

        /* renamed from: c */
        public C13805j0 mo49871c() {
            return C12271g1.this.f19397s;
        }

        /* renamed from: d */
        public void mo49872d() {
            C12271g1.this.f19397s.mo53458d();
            this.f19440b = true;
            C12271g1.this.f19397s.execute(new C12290a());
        }

        /* renamed from: e */
        public void mo49873e(C13813m mVar, C12546k.C12557i iVar) {
            C12271g1.this.f19397s.mo53458d();
            C8012n.m15756o(mVar, "newState");
            C8012n.m15756o(iVar, "newPicker");
            C12271g1.this.f19397s.execute(new C12291b(iVar, mVar));
        }

        /* renamed from: f */
        public C12241e mo49869a(C12546k.C12548b bVar) {
            C12271g1.this.f19397s.mo53458d();
            C8012n.m15762u(!C12271g1.this.f19355P, "Channel is being terminated");
            return new C12305t(bVar, this);
        }

        /* synthetic */ C12289o(C12271g1 g1Var, C12272a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$p */
    /* compiled from: ManagedChannelImpl */
    private final class C12292p extends C12575p.C12581e {

        /* renamed from: a */
        final C12289o f19447a;

        /* renamed from: b */
        final C12575p f19448b;

        /* renamed from: io.grpc.internal.g1$p$a */
        /* compiled from: ManagedChannelImpl */
        final class C12293a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12594t f19450b;

            C12293a(C12594t tVar) {
                this.f19450b = tVar;
            }

            public void run() {
                C12292p.this.m26973e(this.f19450b);
            }
        }

        /* renamed from: io.grpc.internal.g1$p$b */
        /* compiled from: ManagedChannelImpl */
        final class C12294b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12575p.C12583g f19452b;

            C12294b(C12575p.C12583g gVar) {
                this.f19452b = gVar;
            }

            public void run() {
                C12333j1 j1Var;
                C12594t tVar;
                C12333j1 j1Var2;
                String str;
                List<C12167e> a = this.f19452b.mo50283a();
                C13781d z = C12271g1.this.f19361V;
                C13781d.C13782a aVar = C13781d.C13782a.DEBUG;
                z.mo50003b(aVar, "Resolved address: {0}, config={1}", a, this.f19452b.mo50284b());
                C12303r d0 = C12271g1.this.f19364Y;
                C12303r rVar = C12303r.SUCCESS;
                if (d0 != rVar) {
                    C12271g1.this.f19361V.mo50003b(C13781d.C13782a.INFO, "Address resolved: {0}", a);
                    C12303r unused = C12271g1.this.f19364Y = rVar;
                }
                C12338k unused2 = C12271g1.this.f19387k0 = null;
                C12575p.C12579c c = this.f19452b.mo50285c();
                C12169g gVar = (C12169g) this.f19452b.mo50284b().mo49607b(C12169g.f19080a);
                if (c == null || c.mo50277c() == null) {
                    j1Var = null;
                } else {
                    j1Var = (C12333j1) c.mo50277c();
                }
                if (c != null) {
                    tVar = c.mo50278d();
                } else {
                    tVar = null;
                }
                if (!C12271g1.this.f19371c0) {
                    if (j1Var != null) {
                        C12271g1.this.f19361V.mo50002a(C13781d.C13782a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    if (C12271g1.this.f19367a0 == null) {
                        j1Var2 = C12271g1.f19337s0;
                    } else {
                        j1Var2 = C12271g1.this.f19367a0;
                    }
                    if (gVar != null) {
                        C12271g1.this.f19361V.mo50002a(C13781d.C13782a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    C12271g1.this.f19363X.mo49882n(j1Var2.mo49966c());
                } else {
                    if (j1Var != null) {
                        if (gVar != null) {
                            C12271g1.this.f19363X.mo49882n(gVar);
                            if (j1Var.mo49966c() != null) {
                                C12271g1.this.f19361V.mo50002a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            C12271g1.this.f19363X.mo49882n(j1Var.mo49966c());
                        }
                    } else if (C12271g1.this.f19367a0 != null) {
                        j1Var = C12271g1.this.f19367a0;
                        C12271g1.this.f19363X.mo49882n(j1Var.mo49966c());
                        C12271g1.this.f19361V.mo50002a(C13781d.C13782a.INFO, "Received no service config, using default service config");
                    } else if (tVar == null) {
                        j1Var = C12271g1.f19337s0;
                        C12271g1.this.f19363X.mo49882n((C12169g) null);
                    } else if (!C12271g1.this.f19369b0) {
                        C12271g1.this.f19361V.mo50002a(C13781d.C13782a.INFO, "Fallback to error due to invalid first service config without default config");
                        C12292p.this.mo49877a(c.mo50278d());
                        return;
                    } else {
                        j1Var = C12271g1.this.f19365Z;
                    }
                    if (!j1Var.equals(C12271g1.this.f19365Z)) {
                        C13781d z2 = C12271g1.this.f19361V;
                        C13781d.C13782a aVar2 = C13781d.C13782a.INFO;
                        Object[] objArr = new Object[1];
                        if (j1Var == C12271g1.f19337s0) {
                            str = " to empty";
                        } else {
                            str = "";
                        }
                        objArr[0] = str;
                        z2.mo50003b(aVar2, "Service config changed{0}", objArr);
                        C12333j1 unused3 = C12271g1.this.f19365Z = j1Var;
                    }
                    try {
                        boolean unused4 = C12271g1.this.f19369b0 = true;
                    } catch (RuntimeException e) {
                        C12271g1.f19332n0.log(Level.WARNING, "[" + C12271g1.this.mo49701f() + "] Unexpected exception from parsing service config", e);
                    }
                    j1Var2 = j1Var;
                }
                C12155a b = this.f19452b.mo50284b();
                C12292p pVar = C12292p.this;
                if (pVar.f19447a == C12271g1.this.f19344E) {
                    C12155a.C12157b c2 = b.mo49608d().mo49613c(C12169g.f19080a);
                    Map<String, ?> d = j1Var2.mo49967d();
                    if (d != null) {
                        c2.mo49614d(C12546k.f20110a, d).mo49612a();
                    }
                    C12594t d2 = C12292p.this.f19447a.f19439a.mo49954d(C12546k.C12554g.m27771d().mo50229b(a).mo50230c(c2.mo49612a()).mo50231d(j1Var2.mo49968e()).mo50228a());
                    if (!d2.mo50308p()) {
                        C12292p.this.m26973e(d2.mo50303f(C12292p.this.f19448b + " was used"));
                    }
                }
            }
        }

        C12292p(C12289o oVar, C12575p pVar) {
            this.f19447a = (C12289o) C8012n.m15756o(oVar, "helperImpl");
            this.f19448b = (C12575p) C8012n.m15756o(pVar, "resolver");
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m26973e(C12594t tVar) {
            C12271g1.f19332n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C12271g1.this.mo49701f(), tVar});
            C12271g1.this.f19363X.mo49881m();
            C12303r d0 = C12271g1.this.f19364Y;
            C12303r rVar = C12303r.ERROR;
            if (d0 != rVar) {
                C12271g1.this.f19361V.mo50003b(C13781d.C13782a.WARNING, "Failed to resolve name: {0}", tVar);
                C12303r unused = C12271g1.this.f19364Y = rVar;
            }
            if (this.f19447a == C12271g1.this.f19344E) {
                this.f19447a.f19439a.mo49952b(tVar);
                m26974f();
            }
        }

        /* renamed from: f */
        private void m26974f() {
            if (C12271g1.this.f19385j0 == null || !C12271g1.this.f19385j0.mo53464b()) {
                if (C12271g1.this.f19387k0 == null) {
                    C12271g1 g1Var = C12271g1.this;
                    C12338k unused = g1Var.f19387k0 = g1Var.f19404z.get();
                }
                long a = C12271g1.this.f19387k0.mo49802a();
                C12271g1.this.f19361V.mo50003b(C13781d.C13782a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
                C12271g1 g1Var2 = C12271g1.this;
                C13805j0.C13808c unused2 = g1Var2.f19385j0 = g1Var2.f19397s.mo53457c(new C12284j(), a, TimeUnit.NANOSECONDS, C12271g1.this.f19382i.mo49981i0());
            }
        }

        /* renamed from: a */
        public void mo49877a(C12594t tVar) {
            C8012n.m15746e(!tVar.mo50308p(), "the error status must not be OK");
            C12271g1.this.f19397s.execute(new C12293a(tVar));
        }

        /* renamed from: c */
        public void mo49878c(C12575p.C12583g gVar) {
            C12271g1.this.f19397s.execute(new C12294b(gVar));
        }
    }

    /* renamed from: io.grpc.internal.g1$q */
    /* compiled from: ManagedChannelImpl */
    private class C12295q extends C13777b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final AtomicReference<C12169g> f19454a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f19455b;

        /* renamed from: c */
        private final C13777b f19456c;

        /* renamed from: io.grpc.internal.g1$q$a */
        /* compiled from: ManagedChannelImpl */
        class C12296a extends C13777b {
            C12296a() {
            }

            /* renamed from: a */
            public String mo49840a() {
                return C12295q.this.f19455b;
            }

            /* renamed from: h */
            public <RequestT, ResponseT> C13788e<RequestT, ResponseT> mo49841h(C13783d0<RequestT, ResponseT> d0Var, C12159b bVar) {
                ScheduledExecutorService scheduledExecutorService;
                Executor u = C12271g1.this.m26923v0(bVar);
                C12383p.C12392e F = C12271g1.this.f19389l0;
                if (C12271g1.this.f19356Q) {
                    scheduledExecutorService = null;
                } else {
                    scheduledExecutorService = C12271g1.this.f19382i.mo49981i0();
                }
                return new C12383p(d0Var, u, bVar, F, scheduledExecutorService, C12271g1.this.f19359T, (C12169g) null).mo50031B(C12271g1.this.f19398t).mo50030A(C12271g1.this.f19399u).mo50033z(C12271g1.this.f19400v);
            }
        }

        /* renamed from: io.grpc.internal.g1$q$b */
        /* compiled from: ManagedChannelImpl */
        class C12297b implements Runnable {
            C12297b() {
            }

            public void run() {
                C12271g1.this.mo49843u0();
            }
        }

        /* renamed from: io.grpc.internal.g1$q$d */
        /* compiled from: ManagedChannelImpl */
        class C12299d implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12300e f19461b;

            C12299d(C12300e eVar) {
                this.f19461b = eVar;
            }

            public void run() {
                if (C12295q.this.f19454a.get() == C12271g1.f19338t0) {
                    if (C12271g1.this.f19348I == null) {
                        Collection unused = C12271g1.this.f19348I = new LinkedHashSet();
                        C12271g1 g1Var = C12271g1.this;
                        g1Var.f19383i0.mo50116e(g1Var.f19349J, true);
                    }
                    C12271g1.this.f19348I.add(this.f19461b);
                    return;
                }
                this.f19461b.mo49886p();
            }
        }

        /* renamed from: io.grpc.internal.g1$q$e */
        /* compiled from: ManagedChannelImpl */
        private final class C12300e<ReqT, RespT> extends C12487z<ReqT, RespT> {

            /* renamed from: l */
            final C13815o f19463l;

            /* renamed from: m */
            final C13783d0<ReqT, RespT> f19464m;

            /* renamed from: n */
            final C12159b f19465n;

            /* renamed from: io.grpc.internal.g1$q$e$a */
            /* compiled from: ManagedChannelImpl */
            class C12301a implements Runnable {
                C12301a() {
                }

                /* JADX INFO: finally extract failed */
                public void run() {
                    C13815o b = C12300e.this.f19463l.mo53475b();
                    try {
                        C12300e eVar = C12300e.this;
                        C13788e k = C12295q.this.m26980l(eVar.f19464m, eVar.f19465n);
                        C12300e.this.f19463l.mo53477f(b);
                        C12300e.this.mo50157n(k);
                        C12300e eVar2 = C12300e.this;
                        C12271g1.this.f19397s.execute(new C12302b());
                    } catch (Throwable th) {
                        C12300e.this.f19463l.mo53477f(b);
                        throw th;
                    }
                }
            }

            /* renamed from: io.grpc.internal.g1$q$e$b */
            /* compiled from: ManagedChannelImpl */
            final class C12302b implements Runnable {
                C12302b() {
                }

                public void run() {
                    if (C12271g1.this.f19348I != null) {
                        C12271g1.this.f19348I.remove(C12300e.this);
                        if (C12271g1.this.f19348I.isEmpty()) {
                            C12271g1 g1Var = C12271g1.this;
                            g1Var.f19383i0.mo50116e(g1Var.f19349J, false);
                            Collection unused = C12271g1.this.f19348I = null;
                            if (C12271g1.this.f19353N.get()) {
                                C12271g1.this.f19352M.mo49920b(C12271g1.f19335q0);
                            }
                        }
                    }
                }
            }

            C12300e(C13815o oVar, C13783d0<ReqT, RespT> d0Var, C12159b bVar) {
                super(C12271g1.this.m26923v0(bVar), C12271g1.this.f19386k, bVar.mo49619d());
                this.f19463l = oVar;
                this.f19464m = d0Var;
                this.f19465n = bVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: i */
            public void mo49885i() {
                super.mo49885i();
                C12271g1.this.f19397s.execute(new C12302b());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: p */
            public void mo49886p() {
                C12271g1.this.m26923v0(this.f19465n).execute(new C12301a());
            }
        }

        /* synthetic */ C12295q(C12271g1 g1Var, String str, C12272a aVar) {
            this(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public <ReqT, RespT> C13788e<ReqT, RespT> m26980l(C13783d0<ReqT, RespT> d0Var, C12159b bVar) {
            C12169g gVar = this.f19454a.get();
            if (gVar == null) {
                return this.f19456c.mo49841h(d0Var, bVar);
            }
            if (!(gVar instanceof C12333j1.C12336c)) {
                return new C12282i(gVar, this.f19456c, C12271g1.this.f19388l, d0Var, bVar);
            }
            C12333j1.C12335b f = ((C12333j1.C12336c) gVar).f19573b.mo49970f(d0Var);
            if (f != null) {
                bVar = bVar.mo49631p(C12333j1.C12335b.f19566g, f);
            }
            return this.f19456c.mo49841h(d0Var, bVar);
        }

        /* renamed from: a */
        public String mo49840a() {
            return this.f19455b;
        }

        /* renamed from: h */
        public <ReqT, RespT> C13788e<ReqT, RespT> mo49841h(C13783d0<ReqT, RespT> d0Var, C12159b bVar) {
            if (this.f19454a.get() != C12271g1.f19338t0) {
                return m26980l(d0Var, bVar);
            }
            C12271g1.this.f19397s.execute(new C12297b());
            if (this.f19454a.get() != C12271g1.f19338t0) {
                return m26980l(d0Var, bVar);
            }
            if (C12271g1.this.f19353N.get()) {
                return new C12298c();
            }
            C12300e eVar = new C12300e(C13815o.m31725e(), d0Var, bVar);
            C12271g1.this.f19397s.execute(new C12299d(eVar));
            return eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo49881m() {
            if (this.f19454a.get() == C12271g1.f19338t0) {
                mo49882n((C12169g) null);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo49882n(C12169g gVar) {
            C12169g gVar2 = this.f19454a.get();
            this.f19454a.set(gVar);
            if (gVar2 == C12271g1.f19338t0 && C12271g1.this.f19348I != null) {
                for (C12300e p : C12271g1.this.f19348I) {
                    p.mo49886p();
                }
            }
        }

        private C12295q(String str) {
            this.f19454a = new AtomicReference<>(C12271g1.f19338t0);
            this.f19456c = new C12296a();
            this.f19455b = (String) C8012n.m15756o(str, "authority");
        }

        /* renamed from: io.grpc.internal.g1$q$c */
        /* compiled from: ManagedChannelImpl */
        class C12298c extends C13788e<ReqT, RespT> {
            C12298c() {
            }

            /* renamed from: e */
            public void mo46138e(C13788e.C13789a<RespT> aVar, C12564o oVar) {
                aVar.mo46134a(C12271g1.f19335q0, new C12564o());
            }

            /* renamed from: b */
            public void mo49849b() {
            }

            /* renamed from: c */
            public void mo49850c(int i) {
            }

            /* renamed from: d */
            public void mo49851d(ReqT reqt) {
            }

            /* renamed from: a */
            public void mo49848a(String str, Throwable th) {
            }
        }
    }

    /* renamed from: io.grpc.internal.g1$r */
    /* compiled from: ManagedChannelImpl */
    enum C12303r {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* renamed from: io.grpc.internal.g1$s */
    /* compiled from: ManagedChannelImpl */
    private static final class C12304s implements ScheduledExecutorService {

        /* renamed from: b */
        final ScheduledExecutorService f19473b;

        /* synthetic */ C12304s(ScheduledExecutorService scheduledExecutorService, C12272a aVar) {
            this(scheduledExecutorService);
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.f19473b.awaitTermination(j, timeUnit);
        }

        public void execute(Runnable runnable) {
            this.f19473b.execute(runnable);
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f19473b.invokeAll(collection);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return this.f19473b.invokeAny(collection);
        }

        public boolean isShutdown() {
            return this.f19473b.isShutdown();
        }

        public boolean isTerminated() {
            return this.f19473b.isTerminated();
        }

        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.f19473b.schedule(callable, j, timeUnit);
        }

        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f19473b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f19473b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        public <T> Future<T> submit(Callable<T> callable) {
            return this.f19473b.submit(callable);
        }

        private C12304s(ScheduledExecutorService scheduledExecutorService) {
            this.f19473b = (ScheduledExecutorService) C8012n.m15756o(scheduledExecutorService, "delegate");
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return this.f19473b.invokeAll(collection, j, timeUnit);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return this.f19473b.invokeAny(collection, j, timeUnit);
        }

        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f19473b.schedule(runnable, j, timeUnit);
        }

        public Future<?> submit(Runnable runnable) {
            return this.f19473b.submit(runnable);
        }

        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.f19473b.submit(runnable, t);
        }
    }

    /* renamed from: io.grpc.internal.g1$t */
    /* compiled from: ManagedChannelImpl */
    private final class C12305t extends C12241e {

        /* renamed from: a */
        final C12546k.C12548b f19474a;

        /* renamed from: b */
        final C12289o f19475b;

        /* renamed from: c */
        final C13841z f19476c;

        /* renamed from: d */
        final C12368n f19477d;

        /* renamed from: e */
        final C12374o f19478e;

        /* renamed from: f */
        List<C12167e> f19479f;

        /* renamed from: g */
        C12463y0 f19480g;

        /* renamed from: h */
        boolean f19481h;

        /* renamed from: i */
        boolean f19482i;

        /* renamed from: j */
        C13805j0.C13808c f19483j;

        /* renamed from: io.grpc.internal.g1$t$a */
        /* compiled from: ManagedChannelImpl */
        final class C12306a extends C12463y0.C12476j {

            /* renamed from: a */
            final /* synthetic */ C12546k.C12558j f19485a;

            C12306a(C12546k.C12558j jVar) {
                this.f19485a = jVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo49914a(C12463y0 y0Var) {
                C12271g1.this.f19383i0.mo50116e(y0Var, true);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo49915b(C12463y0 y0Var) {
                C12271g1.this.f19383i0.mo50116e(y0Var, false);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo49916c(C12463y0 y0Var, C13814n nVar) {
                boolean z;
                if (this.f19485a != null) {
                    z = true;
                } else {
                    z = false;
                }
                C8012n.m15762u(z, "listener is null");
                this.f19485a.mo48963a(nVar);
                if (nVar.mo53469c() == C13813m.TRANSIENT_FAILURE || nVar.mo53469c() == C13813m.IDLE) {
                    C12289o oVar = C12305t.this.f19475b;
                    if (!oVar.f19441c && !oVar.f19440b) {
                        C12271g1.f19332n0.log(Level.WARNING, "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
                        C12271g1.this.m26860B0();
                        C12305t.this.f19475b.f19440b = true;
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo49917d(C12463y0 y0Var) {
                C12271g1.this.f19347H.remove(y0Var);
                C12271g1.this.f19362W.mo53513k(y0Var);
                C12271g1.this.m26931z0();
            }
        }

        /* renamed from: io.grpc.internal.g1$t$b */
        /* compiled from: ManagedChannelImpl */
        final class C12307b implements Runnable {
            C12307b() {
            }

            public void run() {
                C12305t.this.f19480g.mo50131b(C12271g1.f19336r0);
            }
        }

        C12305t(C12546k.C12548b bVar, C12289o oVar) {
            this.f19479f = bVar.mo50207a();
            if (C12271g1.this.f19370c != null) {
                bVar = bVar.mo50209d().mo50213e(m26994i(bVar.mo50207a())).mo50211b();
            }
            this.f19474a = (C12546k.C12548b) C8012n.m15756o(bVar, "args");
            this.f19475b = (C12289o) C8012n.m15756o(oVar, "helper");
            C13841z b = C13841z.m31798b("Subchannel", C12271g1.this.mo49840a());
            this.f19476c = b;
            int V = C12271g1.this.f19396r;
            long a = C12271g1.this.f19395q.mo49993a();
            C12374o oVar2 = new C12374o(b, V, a, "Subchannel for " + bVar.mo50207a());
            this.f19478e = oVar2;
            this.f19477d = new C12368n(oVar2, C12271g1.this.f19395q);
        }

        /* renamed from: i */
        private List<C12167e> m26994i(List<C12167e> list) {
            ArrayList arrayList = new ArrayList();
            for (C12167e next : list) {
                arrayList.add(new C12167e(next.mo49649a(), next.mo49650b().mo49608d().mo49613c(C12167e.f19073d).mo49612a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        /* renamed from: b */
        public List<C12167e> mo49906b() {
            C12271g1.this.f19397s.mo53458d();
            C8012n.m15762u(this.f19481h, "not started");
            return this.f19479f;
        }

        /* renamed from: c */
        public C12155a mo49907c() {
            return this.f19474a.mo50208b();
        }

        /* renamed from: d */
        public Object mo49908d() {
            C8012n.m15762u(this.f19481h, "Subchannel is not started");
            return this.f19480g;
        }

        /* renamed from: e */
        public void mo49909e() {
            C12271g1.this.f19397s.mo53458d();
            C8012n.m15762u(this.f19481h, "not started");
            this.f19480g.mo50008a();
        }

        /* renamed from: f */
        public void mo49910f() {
            C13805j0.C13808c cVar;
            C12271g1.this.f19397s.mo53458d();
            if (this.f19480g == null) {
                this.f19482i = true;
                return;
            }
            if (!this.f19482i) {
                this.f19482i = true;
            } else if (C12271g1.this.f19355P && (cVar = this.f19483j) != null) {
                cVar.mo53463a();
                this.f19483j = null;
            } else {
                return;
            }
            if (!C12271g1.this.f19355P) {
                this.f19483j = C12271g1.this.f19397s.mo53457c(new C12235d1(new C12307b()), 5, TimeUnit.SECONDS, C12271g1.this.f19382i.mo49981i0());
            } else {
                this.f19480g.mo50131b(C12271g1.f19335q0);
            }
        }

        /* renamed from: g */
        public void mo49911g(C12546k.C12558j jVar) {
            C12271g1.this.f19397s.mo53458d();
            C8012n.m15762u(!this.f19481h, "already started");
            C8012n.m15762u(!this.f19482i, "already shutdown");
            C8012n.m15762u(!C12271g1.this.f19355P, "Channel is being terminated");
            this.f19481h = true;
            List<C12167e> a = this.f19474a.mo50207a();
            String a2 = C12271g1.this.mo49840a();
            String Z = C12271g1.this.f19341B;
            C12338k.C12339a a0 = C12271g1.this.f19404z;
            C12429t v = C12271g1.this.f19382i;
            ScheduledExecutorService i0 = C12271g1.this.f19382i.mo49981i0();
            C8019r b0 = C12271g1.this.f19401w;
            C13805j0 j0Var = C12271g1.this.f19397s;
            C12306a aVar = new C12306a(jVar);
            C13832v X = C12271g1.this.f19362W;
            C12358m a3 = C12271g1.this.f19358S.mo49844a();
            C12374o oVar = this.f19478e;
            C12463y0 y0Var = new C12463y0(a, a2, Z, a0, v, i0, b0, j0Var, aVar, X, a3, oVar, this.f19476c, this.f19477d);
            C12271g1.this.f19360U.mo50011e(new C13836w.C13837a().mo53518b("Child Subchannel started").mo53519c(C13836w.C13838b.CT_INFO).mo53521e(C12271g1.this.f19395q.mo49993a()).mo53520d(y0Var).mo53517a());
            this.f19480g = y0Var;
            C12271g1.this.f19362W.mo53510e(y0Var);
            C12271g1.this.f19347H.add(y0Var);
        }

        /* renamed from: h */
        public void mo49912h(List<C12167e> list) {
            C12271g1.this.f19397s.mo53458d();
            this.f19479f = list;
            if (C12271g1.this.f19370c != null) {
                list = m26994i(list);
            }
            this.f19480g.mo50130T(list);
        }

        public String toString() {
            return this.f19476c.toString();
        }
    }

    static {
        C12594t tVar = C12594t.f20198u;
        f19334p0 = tVar.mo50310r("Channel shutdownNow invoked");
        f19335q0 = tVar.mo50310r("Channel shutdown invoked");
        f19336r0 = tVar.mo50310r("Subchannel shutdown invoked");
    }

    C12271g1(C12314h1 h1Var, C12429t tVar, C12338k.C12339a aVar, C12396p1<? extends Executor> p1Var, C8019r<C8016p> rVar, List<C13791f> list, C12356l2 l2Var) {
        C12272a aVar2;
        boolean z;
        boolean z2;
        C12314h1 h1Var2 = h1Var;
        C12429t tVar2 = tVar;
        C12396p1<? extends Executor> p1Var2 = p1Var;
        C12356l2 l2Var2 = l2Var;
        C13805j0 j0Var = new C13805j0(new C12275d());
        this.f19397s = j0Var;
        C12285k kVar = new C12285k(this, (C12272a) null);
        this.f19381h0 = kVar;
        this.f19383i0 = new C12287m(this, (C12272a) null);
        this.f19389l0 = new C12279h(this, (C12272a) null);
        String str = (String) C8012n.m15756o(h1Var2.f19515f, TypedValues.AttributesType.S_TARGET);
        this.f19368b = str;
        C13841z b = C13841z.m31798b("Channel", str);
        this.f19366a = b;
        this.f19395q = (C12356l2) C8012n.m15756o(l2Var2, "timeProvider");
        C12396p1<? extends Executor> p1Var3 = (C12396p1) C8012n.m15756o(h1Var2.f19510a, "executorPool");
        this.f19390m = p1Var3;
        Executor executor = (Executor) C8012n.m15756o(p1Var3.mo49922a(), "executor");
        this.f19388l = executor;
        this.f19380h = tVar2;
        C12345l lVar = new C12345l(tVar2, h1Var2.f19516g, executor);
        this.f19382i = lVar;
        this.f19384j = new C12345l(tVar2, (C13773a) null, executor);
        C12304s sVar = new C12304s(lVar.mo49981i0(), (C12272a) null);
        this.f19386k = sVar;
        this.f19396r = h1Var2.f19531v;
        C12374o oVar = r12;
        C12345l lVar2 = lVar;
        C12374o oVar2 = new C12374o(b, h1Var2.f19531v, l2Var.mo49993a(), "Channel for '" + str + "'");
        this.f19360U = oVar;
        C12368n nVar = new C12368n(oVar, l2Var2);
        this.f19361V = nVar;
        C13794g0 g0Var = h1Var2.f19534y;
        g0Var = g0Var == null ? C12404r0.f19756o : g0Var;
        boolean z3 = h1Var2.f19529t;
        this.f19379g0 = z3;
        C12325j jVar = new C12325j(h1Var2.f19520k);
        this.f19378g = jVar;
        this.f19394p = new C12286l((C12396p1) C8012n.m15756o(h1Var2.f19511b, "offloadExecutorPool"));
        this.f19372d = h1Var2.f19513d;
        C12212b2 b2Var = new C12212b2(z3, h1Var2.f19525p, h1Var2.f19526q, jVar);
        C12575p.C12577b a = C12575p.C12577b.m27862f().mo50271c(h1Var.mo49929c()).mo50273e(g0Var).mo50276h(j0Var).mo50274f(sVar).mo50275g(b2Var).mo50270b(nVar).mo50272d(new C12276e()).mo50269a();
        this.f19376f = a;
        String str2 = h1Var2.f19519j;
        this.f19370c = str2;
        C12575p.C12580d dVar = h1Var2.f19514e;
        this.f19374e = dVar;
        this.f19342C = m26927x0(str, str2, dVar, a);
        this.f19392n = (C12396p1) C8012n.m15756o(p1Var2, "balancerRpcExecutorPool");
        this.f19393o = new C12286l(p1Var2);
        C12181a0 a0Var = new C12181a0(executor, j0Var);
        this.f19351L = a0Var;
        a0Var.mo49700e(kVar);
        this.f19404z = aVar;
        Map<String, ?> map = h1Var2.f19532w;
        if (map != null) {
            C12575p.C12579c a2 = b2Var.mo49746a(map);
            if (a2.mo50278d() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C8012n.m15764w(z2, "Default config is invalid: %s", a2.mo50278d());
            C12333j1 j1Var = (C12333j1) a2.mo50277c();
            this.f19367a0 = j1Var;
            this.f19365Z = j1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f19367a0 = null;
        }
        boolean z4 = h1Var2.f19533x;
        this.f19371c0 = z4;
        C12295q qVar = new C12295q(this, this.f19342C.mo49753a(), aVar2);
        this.f19363X = qVar;
        this.f19340A = C13795h.m31682a(qVar, list);
        this.f19401w = (C8019r) C8012n.m15756o(rVar, "stopwatchSupplier");
        long j = h1Var2.f19524o;
        if (j == -1) {
            this.f19402x = j;
        } else {
            if (j >= C12314h1.f19500I) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15750i(z, "invalid idleTimeoutMillis %s", j);
            this.f19402x = h1Var2.f19524o;
        }
        this.f19391m0 = new C12483y1(new C12288n(this, (C12272a) null), j0Var, lVar2.mo49981i0(), rVar.get());
        this.f19398t = h1Var2.f19521l;
        this.f19399u = (C13824r) C8012n.m15756o(h1Var2.f19522m, "decompressorRegistry");
        this.f19400v = (C13811l) C8012n.m15756o(h1Var2.f19523n, "compressorRegistry");
        this.f19341B = h1Var2.f19518i;
        this.f19377f0 = h1Var2.f19527r;
        this.f19375e0 = h1Var2.f19528s;
        C12273b bVar = new C12273b(l2Var);
        this.f19358S = bVar;
        this.f19359T = bVar.mo49844a();
        C13832v vVar = (C13832v) C8012n.m15755n(h1Var2.f19530u);
        this.f19362W = vVar;
        vVar.mo53509d(this);
        if (!z4) {
            if (this.f19367a0 != null) {
                nVar.mo50002a(C13781d.C13782a.INFO, "Service config look-up disabled, using default service config");
            }
            this.f19369b0 = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m26860B0() {
        this.f19397s.mo53458d();
        m26918s0();
        m26862C0();
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m26862C0() {
        this.f19397s.mo53458d();
        if (this.f19343D) {
            this.f19342C.mo49754b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public void m26864D0() {
        long j = this.f19402x;
        if (j != -1) {
            this.f19391m0.mo50154k(j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m26866E0(boolean z) {
        boolean z2;
        this.f19397s.mo53458d();
        if (z) {
            C8012n.m15762u(this.f19343D, "nameResolver is not started");
            if (this.f19344E != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C8012n.m15762u(z2, "lbHelper is null");
        }
        if (this.f19342C != null) {
            m26918s0();
            this.f19342C.mo49755c();
            this.f19343D = false;
            if (z) {
                this.f19342C = m26927x0(this.f19368b, this.f19370c, this.f19374e, this.f19376f);
            } else {
                this.f19342C = null;
            }
        }
        C12289o oVar = this.f19344E;
        if (oVar != null) {
            oVar.f19439a.mo49953c();
            this.f19344E = null;
        }
        this.f19345F = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m26868F0(C12546k.C12557i iVar) {
        this.f19345F = iVar;
        this.f19351L.mo49704r(iVar);
    }

    /* renamed from: r0 */
    private void m26916r0(boolean z) {
        this.f19391m0.mo50153i(z);
    }

    /* renamed from: s0 */
    private void m26918s0() {
        this.f19397s.mo53458d();
        C13805j0.C13808c cVar = this.f19385j0;
        if (cVar != null) {
            cVar.mo53463a();
            this.f19385j0 = null;
            this.f19387k0 = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m26920t0() {
        m26866E0(true);
        this.f19351L.mo49704r((C12546k.C12557i) null);
        this.f19361V.mo50002a(C13781d.C13782a.INFO, "Entering IDLE state");
        this.f19403y.mo50112a(C13813m.IDLE);
        if (this.f19383i0.mo50114a(this.f19349J, this.f19351L)) {
            mo49843u0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public Executor m26923v0(C12159b bVar) {
        Executor e = bVar.mo49620e();
        if (e == null) {
            return this.f19388l;
        }
        return e;
    }

    /* renamed from: w0 */
    private static C12575p m26925w0(String str, C12575p.C12580d dVar, C12575p.C12577b bVar) {
        URI uri;
        C12575p b;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null && (b = dVar.mo49792b(uri, bVar)) != null) {
            return b;
        }
        String str2 = "";
        if (!f19333o0.matcher(str).matches()) {
            try {
                C12575p b2 = dVar.mo49792b(new URI(dVar.mo49791a(), str2, "/" + str, (String) null), bVar);
                if (b2 != null) {
                    return b2;
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            str2 = " (" + sb + ")";
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    /* renamed from: x0 */
    static C12575p m26927x0(String str, String str2, C12575p.C12580d dVar, C12575p.C12577b bVar) {
        C12575p w0 = m26925w0(str, dVar, bVar);
        if (str2 == null) {
            return w0;
        }
        return new C12277f(w0, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m26929y0() {
        if (this.f19354O) {
            for (C12463y0 c : this.f19347H) {
                c.mo50132c(f19334p0);
            }
            for (C12400q1 i : this.f19350K) {
                i.mo50041i().mo50132c(f19334p0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m26931z0() {
        if (!this.f19356Q && this.f19353N.get() && this.f19347H.isEmpty() && this.f19350K.isEmpty()) {
            this.f19361V.mo50002a(C13781d.C13782a.INFO, "Terminated");
            this.f19362W.mo53512j(this);
            this.f19390m.mo49923b(this.f19388l);
            this.f19393o.mo49865b();
            this.f19394p.mo49865b();
            this.f19382i.close();
            this.f19356Q = true;
            this.f19357R.countDown();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo49839A0(Throwable th) {
        if (!this.f19346G) {
            this.f19346G = true;
            m26916r0(true);
            m26866E0(false);
            m26868F0(new C12274c(th));
            this.f19361V.mo50002a(C13781d.C13782a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            this.f19403y.mo50112a(C13813m.TRANSIENT_FAILURE);
        }
    }

    /* renamed from: a */
    public String mo49840a() {
        return this.f19340A.mo49840a();
    }

    /* renamed from: f */
    public C13841z mo49701f() {
        return this.f19366a;
    }

    /* renamed from: h */
    public <ReqT, RespT> C13788e<ReqT, RespT> mo49841h(C13783d0<ReqT, RespT> d0Var, C12159b bVar) {
        return this.f19340A.mo49841h(d0Var, bVar);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41839c("logId", this.f19366a.mo53522d()).mo41840d(TypedValues.AttributesType.S_TARGET, this.f19368b).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo49843u0() {
        this.f19397s.mo53458d();
        if (!this.f19353N.get() && !this.f19346G) {
            if (this.f19383i0.mo50115d()) {
                m26916r0(false);
            } else {
                m26864D0();
            }
            if (this.f19344E == null) {
                this.f19361V.mo50002a(C13781d.C13782a.INFO, "Exiting idle mode");
                C12289o oVar = new C12289o(this, (C12272a) null);
                oVar.f19439a = this.f19378g.mo49949e(oVar);
                this.f19344E = oVar;
                this.f19342C.mo49756d(new C12292p(oVar, this.f19342C));
                this.f19343D = true;
            }
        }
    }

    /* renamed from: io.grpc.internal.g1$u */
    /* compiled from: ManagedChannelImpl */
    private final class C12308u {

        /* renamed from: a */
        final Object f19488a;

        /* renamed from: b */
        Collection<C12398q> f19489b;

        /* renamed from: c */
        C12594t f19490c;

        private C12308u() {
            this.f19488a = new Object();
            this.f19489b = new HashSet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12594t mo49919a(C12506z1<?> z1Var) {
            synchronized (this.f19488a) {
                C12594t tVar = this.f19490c;
                if (tVar != null) {
                    return tVar;
                }
                this.f19489b.add(z1Var);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            p364io.grpc.internal.C12271g1.m26907n(r2.f19491d).mo49697b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo49920b(p364io.grpc.C12594t r3) {
            /*
                r2 = this;
                java.lang.Object r0 = r2.f19488a
                monitor-enter(r0)
                io.grpc.t r1 = r2.f19490c     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                return
            L_0x0009:
                r2.f19490c = r3     // Catch:{ all -> 0x001e }
                java.util.Collection<io.grpc.internal.q> r1 = r2.f19489b     // Catch:{ all -> 0x001e }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x001d
                io.grpc.internal.g1 r0 = p364io.grpc.internal.C12271g1.this
                io.grpc.internal.a0 r0 = r0.f19351L
                r0.mo49697b(r3)
            L_0x001d:
                return
            L_0x001e:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12271g1.C12308u.mo49920b(io.grpc.t):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo49921c(C12506z1<?> z1Var) {
            C12594t tVar;
            synchronized (this.f19488a) {
                this.f19489b.remove(z1Var);
                if (this.f19489b.isEmpty()) {
                    tVar = this.f19490c;
                    this.f19489b = new HashSet();
                } else {
                    tVar = null;
                }
            }
            if (tVar != null) {
                C12271g1.this.f19351L.mo49697b(tVar);
            }
        }

        /* synthetic */ C12308u(C12271g1 g1Var, C12272a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.g1$g */
    /* compiled from: ManagedChannelImpl */
    class C12278g extends C13788e<Object, Object> {
        C12278g() {
        }

        /* renamed from: b */
        public void mo49849b() {
        }

        /* renamed from: c */
        public void mo49850c(int i) {
        }

        /* renamed from: d */
        public void mo49851d(Object obj) {
        }

        /* renamed from: a */
        public void mo49848a(String str, Throwable th) {
        }

        /* renamed from: e */
        public void mo46138e(C13788e.C13789a<Object> aVar, C12564o oVar) {
        }
    }
}
