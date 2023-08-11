package p364io.grpc.internal;

import com.google.common.util.concurrent.C6907e;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8003j;
import p111h6.C8012n;
import p335ee.C11890b;
import p335ee.C11891c;
import p335ee.C11892d;
import p364io.grpc.C12159b;
import p364io.grpc.C12166d;
import p364io.grpc.C12169g;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12333j1;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12402r;
import p458xd.C13783d0;
import p458xd.C13788e;
import p458xd.C13799i;
import p458xd.C13809k;
import p458xd.C13811l;
import p458xd.C13815o;
import p458xd.C13819p;
import p458xd.C13824r;
import p458xd.C13839x;

/* renamed from: io.grpc.internal.p */
/* compiled from: ClientCallImpl */
final class C12383p<ReqT, RespT> extends C13788e<ReqT, RespT> {

    /* renamed from: t */
    private static final Logger f19684t = Logger.getLogger(C12383p.class.getName());

    /* renamed from: u */
    private static final byte[] f19685u = "gzip".getBytes(Charset.forName("US-ASCII"));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13783d0<ReqT, RespT> f19686a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11892d f19687b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f19688c;

    /* renamed from: d */
    private final boolean f19689d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12358m f19690e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C13815o f19691f;

    /* renamed from: g */
    private volatile ScheduledFuture<?> f19692g;

    /* renamed from: h */
    private final boolean f19693h;

    /* renamed from: i */
    private C12159b f19694i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C12398q f19695j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f19696k;

    /* renamed from: l */
    private boolean f19697l;

    /* renamed from: m */
    private boolean f19698m;

    /* renamed from: n */
    private final C12392e f19699n;

    /* renamed from: o */
    private final C12383p<ReqT, RespT>.f f19700o = new C12393f();

    /* renamed from: p */
    private final ScheduledExecutorService f19701p;

    /* renamed from: q */
    private boolean f19702q;

    /* renamed from: r */
    private C13824r f19703r = C13824r.m31754c();

    /* renamed from: s */
    private C13811l f19704s = C13811l.m31718a();

    /* renamed from: io.grpc.internal.p$b */
    /* compiled from: ClientCallImpl */
    class C12385b extends C12459x {

        /* renamed from: c */
        final /* synthetic */ C13788e.C13789a f19705c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12385b(C13788e.C13789a aVar) {
            super(C12383p.this.f19691f);
            this.f19705c = aVar;
        }

        /* renamed from: a */
        public void mo49858a() {
            C12383p pVar = C12383p.this;
            pVar.m27261r(this.f19705c, C12166d.m26554a(pVar.f19691f), new C12564o());
        }
    }

    /* renamed from: io.grpc.internal.p$c */
    /* compiled from: ClientCallImpl */
    class C12386c extends C12459x {

        /* renamed from: c */
        final /* synthetic */ C13788e.C13789a f19707c;

        /* renamed from: d */
        final /* synthetic */ String f19708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12386c(C13788e.C13789a aVar, String str) {
            super(C12383p.this.f19691f);
            this.f19707c = aVar;
            this.f19708d = str;
        }

        /* renamed from: a */
        public void mo49858a() {
            C12383p.this.m27261r(this.f19707c, C12594t.f20197t.mo50310r(String.format("Unable to find compressor by name %s", new Object[]{this.f19708d})), new C12564o());
        }
    }

    /* renamed from: io.grpc.internal.p$d */
    /* compiled from: ClientCallImpl */
    private class C12387d implements C12402r {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C13788e.C13789a<RespT> f19710a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C12594t f19711b;

        /* renamed from: io.grpc.internal.p$d$a */
        /* compiled from: ClientCallImpl */
        final class C12388a extends C12459x {

            /* renamed from: c */
            final /* synthetic */ C11890b f19713c;

            /* renamed from: d */
            final /* synthetic */ C12564o f19714d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12388a(C11890b bVar, C12564o oVar) {
                super(C12383p.this.f19691f);
                this.f19713c = bVar;
                this.f19714d = oVar;
            }

            /* renamed from: b */
            private void m27288b() {
                if (C12387d.this.f19711b == null) {
                    try {
                        C12387d.this.f19710a.mo46135b(this.f19714d);
                    } catch (Throwable th) {
                        C12387d.this.m27283i(C12594t.f20184g.mo50309q(th).mo50310r("Failed to read headers"));
                    }
                }
            }

            /* renamed from: a */
            public void mo49858a() {
                C11891c.m25679g("ClientCall$Listener.headersRead", C12383p.this.f19687b);
                C11891c.m25676d(this.f19713c);
                try {
                    m27288b();
                } finally {
                    C11891c.m25681i("ClientCall$Listener.headersRead", C12383p.this.f19687b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$b */
        /* compiled from: ClientCallImpl */
        final class C12389b extends C12459x {

            /* renamed from: c */
            final /* synthetic */ C11890b f19716c;

            /* renamed from: d */
            final /* synthetic */ C12343k2.C12344a f19717d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12389b(C11890b bVar, C12343k2.C12344a aVar) {
                super(C12383p.this.f19691f);
                this.f19716c = bVar;
                this.f19717d = aVar;
            }

            /* renamed from: b */
            private void m27290b() {
                InputStream next;
                if (C12387d.this.f19711b != null) {
                    C12404r0.m27325d(this.f19717d);
                    return;
                }
                while (true) {
                    try {
                        next = this.f19717d.next();
                        if (next != null) {
                            C12387d.this.f19710a.mo46136c(C12383p.this.f19686a.mo53441i(next));
                            next.close();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12404r0.m27325d(this.f19717d);
                        C12387d.this.m27283i(C12594t.f20184g.mo50309q(th).mo50310r("Failed to read message."));
                        return;
                    }
                }
            }

            /* renamed from: a */
            public void mo49858a() {
                C11891c.m25679g("ClientCall$Listener.messagesAvailable", C12383p.this.f19687b);
                C11891c.m25676d(this.f19716c);
                try {
                    m27290b();
                } finally {
                    C11891c.m25681i("ClientCall$Listener.messagesAvailable", C12383p.this.f19687b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$c */
        /* compiled from: ClientCallImpl */
        final class C12390c extends C12459x {

            /* renamed from: c */
            final /* synthetic */ C11890b f19719c;

            /* renamed from: d */
            final /* synthetic */ C12594t f19720d;

            /* renamed from: e */
            final /* synthetic */ C12564o f19721e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12390c(C11890b bVar, C12594t tVar, C12564o oVar) {
                super(C12383p.this.f19691f);
                this.f19719c = bVar;
                this.f19720d = tVar;
                this.f19721e = oVar;
            }

            /* renamed from: b */
            private void m27292b() {
                C12594t tVar = this.f19720d;
                C12564o oVar = this.f19721e;
                if (C12387d.this.f19711b != null) {
                    tVar = C12387d.this.f19711b;
                    oVar = new C12564o();
                }
                boolean unused = C12383p.this.f19696k = true;
                try {
                    C12387d dVar = C12387d.this;
                    C12383p.this.m27261r(dVar.f19710a, tVar, oVar);
                } finally {
                    C12383p.this.m27267x();
                    C12383p.this.f19690e.mo49994a(tVar.mo50308p());
                }
            }

            /* renamed from: a */
            public void mo49858a() {
                C11891c.m25679g("ClientCall$Listener.onClose", C12383p.this.f19687b);
                C11891c.m25676d(this.f19719c);
                try {
                    m27292b();
                } finally {
                    C11891c.m25681i("ClientCall$Listener.onClose", C12383p.this.f19687b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d */
        /* compiled from: ClientCallImpl */
        final class C12391d extends C12459x {

            /* renamed from: c */
            final /* synthetic */ C11890b f19723c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12391d(C11890b bVar) {
                super(C12383p.this.f19691f);
                this.f19723c = bVar;
            }

            /* renamed from: b */
            private void m27294b() {
                if (C12387d.this.f19711b == null) {
                    try {
                        C12387d.this.f19710a.mo50165d();
                    } catch (Throwable th) {
                        C12387d.this.m27283i(C12594t.f20184g.mo50309q(th).mo50310r("Failed to call onReady."));
                    }
                }
            }

            /* renamed from: a */
            public void mo49858a() {
                C11891c.m25679g("ClientCall$Listener.onReady", C12383p.this.f19687b);
                C11891c.m25676d(this.f19723c);
                try {
                    m27294b();
                } finally {
                    C11891c.m25681i("ClientCall$Listener.onReady", C12383p.this.f19687b);
                }
            }
        }

        public C12387d(C13788e.C13789a<RespT> aVar) {
            this.f19710a = (C13788e.C13789a) C8012n.m15756o(aVar, "observer");
        }

        /* renamed from: h */
        private void m27282h(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
            C13819p g = C12383p.this.m27262s();
            if (tVar.mo50306n() == C12594t.C12596b.CANCELLED && g != null && g.mo53486g()) {
                C12460x0 x0Var = new C12460x0();
                C12383p.this.f19695j.mo49664h(x0Var);
                C12594t tVar2 = C12594t.f20187j;
                tVar = tVar2.mo50303f("ClientCall was cancelled at or after deadline. " + x0Var);
                oVar = new C12564o();
            }
            C12383p.this.f19688c.execute(new C12390c(C11891c.m25677e(), tVar, oVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public void m27283i(C12594t tVar) {
            this.f19711b = tVar;
            C12383p.this.f19695j.mo49660a(tVar);
        }

        /* renamed from: a */
        public void mo49737a(C12343k2.C12344a aVar) {
            C11891c.m25679g("ClientStreamListener.messagesAvailable", C12383p.this.f19687b);
            try {
                C12383p.this.f19688c.execute(new C12389b(C11891c.m25677e(), aVar));
            } finally {
                C11891c.m25681i("ClientStreamListener.messagesAvailable", C12383p.this.f19687b);
            }
        }

        /* renamed from: b */
        public void mo49738b(C12564o oVar) {
            C11891c.m25679g("ClientStreamListener.headersRead", C12383p.this.f19687b);
            try {
                C12383p.this.f19688c.execute(new C12388a(C11891c.m25677e(), oVar));
            } finally {
                C11891c.m25681i("ClientStreamListener.headersRead", C12383p.this.f19687b);
            }
        }

        /* renamed from: c */
        public void mo49739c() {
            if (!C12383p.this.f19686a.mo53439e().mo53450a()) {
                C11891c.m25679g("ClientStreamListener.onReady", C12383p.this.f19687b);
                try {
                    C12383p.this.f19688c.execute(new C12391d(C11891c.m25677e()));
                } finally {
                    C11891c.m25681i("ClientStreamListener.onReady", C12383p.this.f19687b);
                }
            }
        }

        /* renamed from: d */
        public void mo49740d(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
            C11891c.m25679g("ClientStreamListener.closed", C12383p.this.f19687b);
            try {
                m27282h(tVar, aVar, oVar);
            } finally {
                C11891c.m25681i("ClientStreamListener.closed", C12383p.this.f19687b);
            }
        }
    }

    /* renamed from: io.grpc.internal.p$e */
    /* compiled from: ClientCallImpl */
    interface C12392e {
        /* renamed from: a */
        C12398q mo49852a(C13783d0<?, ?> d0Var, C12159b bVar, C12564o oVar, C13815o oVar2);
    }

    /* renamed from: io.grpc.internal.p$f */
    /* compiled from: ClientCallImpl */
    private final class C12393f implements C13815o.C13816a {
        private C12393f() {
        }
    }

    /* renamed from: io.grpc.internal.p$g */
    /* compiled from: ClientCallImpl */
    private class C12394g implements Runnable {

        /* renamed from: b */
        private final long f19726b;

        C12394g(long j) {
            this.f19726b = j;
        }

        public void run() {
            C12460x0 x0Var = new C12460x0();
            C12383p.this.f19695j.mo49664h(x0Var);
            long abs = Math.abs(this.f19726b);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1);
            long abs2 = Math.abs(this.f19726b) % timeUnit.toNanos(1);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f19726b < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
            sb.append("s. ");
            sb.append(x0Var);
            C12383p.this.f19695j.mo49660a(C12594t.f20187j.mo50303f(sb.toString()));
        }
    }

    C12383p(C13783d0<ReqT, RespT> d0Var, Executor executor, C12159b bVar, C12392e eVar, ScheduledExecutorService scheduledExecutorService, C12358m mVar, C12169g gVar) {
        this.f19686a = d0Var;
        C11892d b = C11891c.m25674b(d0Var.mo53437c(), (long) System.identityHashCode(this));
        this.f19687b = b;
        boolean z = true;
        if (executor == C6907e.m11991a()) {
            this.f19688c = new C12230c2();
            this.f19689d = true;
        } else {
            this.f19688c = new C12236d2(executor);
            this.f19689d = false;
        }
        this.f19690e = mVar;
        this.f19691f = C13815o.m31725e();
        if (!(d0Var.mo53439e() == C13783d0.C13787d.UNARY || d0Var.mo53439e() == C13783d0.C13787d.SERVER_STREAMING)) {
            z = false;
        }
        this.f19693h = z;
        this.f19694i = bVar;
        this.f19699n = eVar;
        this.f19701p = scheduledExecutorService;
        C11891c.m25675c("ClientCall.<init>", b);
    }

    /* renamed from: C */
    private ScheduledFuture<?> m27247C(C13819p pVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long i = pVar.mo53489i(timeUnit);
        return this.f19701p.schedule(new C12235d1(new C12394g(i)), i, timeUnit);
    }

    /* renamed from: D */
    private void m27248D(C13788e.C13789a<RespT> aVar, C12564o oVar) {
        boolean z;
        C13809k kVar;
        boolean z2 = true;
        if (this.f19695j == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Already started");
        C8012n.m15762u(!this.f19697l, "call was cancelled");
        C8012n.m15756o(aVar, "observer");
        C8012n.m15756o(oVar, "headers");
        if (this.f19691f.mo53479h()) {
            this.f19695j = C12378o1.f19670a;
            this.f19688c.execute(new C12385b(aVar));
            return;
        }
        m27259p();
        String b = this.f19694i.mo49617b();
        if (b != null) {
            kVar = this.f19704s.mo53468b(b);
            if (kVar == null) {
                this.f19695j = C12378o1.f19670a;
                this.f19688c.execute(new C12386c(aVar, b));
                return;
            }
        } else {
            kVar = C13799i.C13801b.f22244a;
        }
        m27266w(oVar, this.f19703r, kVar, this.f19702q);
        C13819p s = m27262s();
        if (s == null || !s.mo53486g()) {
            z2 = false;
        }
        if (!z2) {
            m27264u(s, this.f19691f.mo53478g(), this.f19694i.mo49619d());
            this.f19695j = this.f19699n.mo49852a(this.f19686a, this.f19694i, oVar, this.f19691f);
        } else {
            this.f19695j = new C12257f0(C12594t.f20187j.mo50310r("ClientCall started after deadline exceeded: " + s), C12404r0.m27327f(this.f19694i, oVar, 0, false));
        }
        if (this.f19689d) {
            this.f19695j.mo49721l();
        }
        if (this.f19694i.mo49616a() != null) {
            this.f19695j.mo49719g(this.f19694i.mo49616a());
        }
        if (this.f19694i.mo49621f() != null) {
            this.f19695j.mo49661c(this.f19694i.mo49621f().intValue());
        }
        if (this.f19694i.mo49622g() != null) {
            this.f19695j.mo49662d(this.f19694i.mo49622g().intValue());
        }
        if (s != null) {
            this.f19695j.mo49663f(s);
        }
        this.f19695j.mo49717e(kVar);
        boolean z3 = this.f19702q;
        if (z3) {
            this.f19695j.mo49670o(z3);
        }
        this.f19695j.mo49669n(this.f19703r);
        this.f19690e.mo49995b();
        this.f19695j.mo49667j(new C12387d(aVar));
        this.f19691f.mo53474a(this.f19700o, C6907e.m11991a());
        if (!(s == null || s.equals(this.f19691f.mo53478g()) || this.f19701p == null)) {
            this.f19692g = m27247C(s);
        }
        if (this.f19696k) {
            m27267x();
        }
    }

    /* renamed from: p */
    private void m27259p() {
        C12159b bVar;
        C12333j1.C12335b bVar2 = (C12333j1.C12335b) this.f19694i.mo49623h(C12333j1.C12335b.f19566g);
        if (bVar2 != null) {
            Long l = bVar2.f19567a;
            if (l != null) {
                C13819p a = C13819p.m31740a(l.longValue(), TimeUnit.NANOSECONDS);
                C13819p d = this.f19694i.mo49619d();
                if (d == null || a.compareTo(d) < 0) {
                    this.f19694i = this.f19694i.mo49626k(a);
                }
            }
            Boolean bool = bVar2.f19568b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    bVar = this.f19694i.mo49633r();
                } else {
                    bVar = this.f19694i.mo49634s();
                }
                this.f19694i = bVar;
            }
            if (bVar2.f19569c != null) {
                Integer f = this.f19694i.mo49621f();
                if (f != null) {
                    this.f19694i = this.f19694i.mo49629n(Math.min(f.intValue(), bVar2.f19569c.intValue()));
                } else {
                    this.f19694i = this.f19694i.mo49629n(bVar2.f19569c.intValue());
                }
            }
            if (bVar2.f19570d != null) {
                Integer g = this.f19694i.mo49622g();
                if (g != null) {
                    this.f19694i = this.f19694i.mo49630o(Math.min(g.intValue(), bVar2.f19570d.intValue()));
                } else {
                    this.f19694i = this.f19694i.mo49630o(bVar2.f19570d.intValue());
                }
            }
        }
    }

    /* renamed from: q */
    private void m27260q(String str, Throwable th) {
        C12594t tVar;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f19684t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.f19697l) {
            this.f19697l = true;
            try {
                if (this.f19695j != null) {
                    C12594t tVar2 = C12594t.f20184g;
                    if (str != null) {
                        tVar = tVar2.mo50310r(str);
                    } else {
                        tVar = tVar2.mo50310r("Call cancelled without message");
                    }
                    if (th != null) {
                        tVar = tVar.mo50309q(th);
                    }
                    this.f19695j.mo49660a(tVar);
                }
            } finally {
                m27267x();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m27261r(C13788e.C13789a<RespT> aVar, C12594t tVar, C12564o oVar) {
        aVar.mo46134a(tVar, oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public C13819p m27262s() {
        return m27265v(this.f19694i.mo49619d(), this.f19691f.mo53478g());
    }

    /* renamed from: t */
    private void m27263t() {
        boolean z;
        if (this.f19695j != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Not started");
        C8012n.m15762u(!this.f19697l, "call was cancelled");
        C8012n.m15762u(!this.f19698m, "call already half-closed");
        this.f19698m = true;
        this.f19695j.mo49665i();
    }

    /* renamed from: u */
    private static void m27264u(C13819p pVar, C13819p pVar2, C13819p pVar3) {
        Logger logger = f19684t;
        if (logger.isLoggable(Level.FINE) && pVar != null && pVar.equals(pVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(Math.max(0, pVar.mo53489i(timeUnit)))}));
            if (pVar3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(" Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(pVar3.mo53489i(timeUnit))}));
            }
            logger.fine(sb.toString());
        }
    }

    /* renamed from: v */
    private static C13819p m27265v(C13819p pVar, C13819p pVar2) {
        if (pVar == null) {
            return pVar2;
        }
        if (pVar2 == null) {
            return pVar;
        }
        return pVar.mo53487h(pVar2);
    }

    /* renamed from: w */
    static void m27266w(C12564o oVar, C13824r rVar, C13809k kVar, boolean z) {
        C12564o.C12571g<String> gVar = C12404r0.f19745d;
        oVar.mo50240d(gVar);
        if (kVar != C13799i.C13801b.f22244a) {
            oVar.mo50244n(gVar, kVar.mo53452a());
        }
        C12564o.C12571g<byte[]> gVar2 = C12404r0.f19746e;
        oVar.mo50240d(gVar2);
        byte[] a = C13839x.m31796a(rVar);
        if (a.length != 0) {
            oVar.mo50244n(gVar2, a);
        }
        oVar.mo50240d(C12404r0.f19747f);
        C12564o.C12571g<byte[]> gVar3 = C12404r0.f19748g;
        oVar.mo50240d(gVar3);
        if (z) {
            oVar.mo50244n(gVar3, f19685u);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m27267x() {
        this.f19691f.mo53480i(this.f19700o);
        ScheduledFuture<?> scheduledFuture = this.f19692g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: y */
    private void m27268y(ReqT reqt) {
        boolean z;
        if (this.f19695j != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Not started");
        C8012n.m15762u(!this.f19697l, "call was cancelled");
        C8012n.m15762u(!this.f19698m, "call was half-closed");
        try {
            C12398q qVar = this.f19695j;
            if (qVar instanceof C12506z1) {
                ((C12506z1) qVar).mo50172h0(reqt);
            } else {
                qVar.mo49720k(this.f19686a.mo53442j(reqt));
            }
            if (!this.f19693h) {
                this.f19695j.flush();
            }
        } catch (RuntimeException e) {
            this.f19695j.mo49660a(C12594t.f20184g.mo50309q(e).mo50310r("Failed to stream message"));
        } catch (Error e2) {
            this.f19695j.mo49660a(C12594t.f20184g.mo50310r("Client sendMessage() failed with Error"));
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C12383p<ReqT, RespT> mo50030A(C13824r rVar) {
        this.f19703r = rVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C12383p<ReqT, RespT> mo50031B(boolean z) {
        this.f19702q = z;
        return this;
    }

    /* renamed from: a */
    public void mo49848a(String str, Throwable th) {
        C11891c.m25679g("ClientCall.cancel", this.f19687b);
        try {
            m27260q(str, th);
        } finally {
            C11891c.m25681i("ClientCall.cancel", this.f19687b);
        }
    }

    /* renamed from: b */
    public void mo49849b() {
        C11891c.m25679g("ClientCall.halfClose", this.f19687b);
        try {
            m27263t();
        } finally {
            C11891c.m25681i("ClientCall.halfClose", this.f19687b);
        }
    }

    /* renamed from: c */
    public void mo49850c(int i) {
        boolean z;
        C11891c.m25679g("ClientCall.request", this.f19687b);
        try {
            boolean z2 = true;
            if (this.f19695j != null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "Not started");
            if (i < 0) {
                z2 = false;
            }
            C8012n.m15746e(z2, "Number requested must be non-negative");
            this.f19695j.mo49716b(i);
        } finally {
            C11891c.m25681i("ClientCall.request", this.f19687b);
        }
    }

    /* renamed from: d */
    public void mo49851d(ReqT reqt) {
        C11891c.m25679g("ClientCall.sendMessage", this.f19687b);
        try {
            m27268y(reqt);
        } finally {
            C11891c.m25681i("ClientCall.sendMessage", this.f19687b);
        }
    }

    /* renamed from: e */
    public void mo46138e(C13788e.C13789a<RespT> aVar, C12564o oVar) {
        C11891c.m25679g("ClientCall.start", this.f19687b);
        try {
            m27248D(aVar, oVar);
        } finally {
            C11891c.m25681i("ClientCall.start", this.f19687b);
        }
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("method", this.f19686a).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C12383p<ReqT, RespT> mo50033z(C13811l lVar) {
        this.f19704s = lVar;
        return this;
    }
}
