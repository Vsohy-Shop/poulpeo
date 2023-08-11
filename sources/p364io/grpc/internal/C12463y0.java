package p364io.grpc.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p111h6.C8003j;
import p111h6.C8012n;
import p111h6.C8016p;
import p111h6.C8019r;
import p364io.grpc.C12155a;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12167e;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12338k;
import p364io.grpc.internal.C12341k1;
import p364io.grpc.internal.C12402r;
import p364io.grpc.internal.C12429t;
import p458xd.C13781d;
import p458xd.C13783d0;
import p458xd.C13805j0;
import p458xd.C13813m;
import p458xd.C13814n;
import p458xd.C13829u;
import p458xd.C13832v;
import p458xd.C13840y;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.y0 */
/* compiled from: InternalSubchannel */
final class C12463y0 implements C13840y<Object>, C12373n2 {

    /* renamed from: a */
    private final C13841z f19890a;

    /* renamed from: b */
    private final String f19891b;

    /* renamed from: c */
    private final String f19892c;

    /* renamed from: d */
    private final C12338k.C12339a f19893d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12476j f19894e;

    /* renamed from: f */
    private final C12429t f19895f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ScheduledExecutorService f19896g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C13832v f19897h;

    /* renamed from: i */
    private final C12358m f19898i;

    /* renamed from: j */
    private final C12374o f19899j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C13781d f19900k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C13805j0 f19901l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C12477k f19902m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile List<C12167e> f19903n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C12338k f19904o;

    /* renamed from: p */
    private final C8016p f19905p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C13805j0.C13808c f19906q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C13805j0.C13808c f19907r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C12341k1 f19908s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Collection<C12447v> f19909t = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C12454w0<C12447v> f19910u = new C12464a();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C12447v f19911v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile C12341k1 f19912w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile C13814n f19913x = C13814n.m31720a(C13813m.IDLE);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C12594t f19914y;

    /* renamed from: io.grpc.internal.y0$a */
    /* compiled from: InternalSubchannel */
    class C12464a extends C12454w0<C12447v> {
        C12464a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo49866b() {
            C12463y0.this.f19894e.mo49914a(C12463y0.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo49867c() {
            C12463y0.this.f19894e.mo49915b(C12463y0.this);
        }
    }

    /* renamed from: io.grpc.internal.y0$b */
    /* compiled from: InternalSubchannel */
    class C12465b implements Runnable {
        C12465b() {
        }

        public void run() {
            C13805j0.C13808c unused = C12463y0.this.f19906q = null;
            C12463y0.this.f19900k.mo50002a(C13781d.C13782a.INFO, "CONNECTING after backoff");
            C12463y0.this.m27531M(C13813m.CONNECTING);
            C12463y0.this.m27537S();
        }
    }

    /* renamed from: io.grpc.internal.y0$c */
    /* compiled from: InternalSubchannel */
    class C12466c implements Runnable {
        C12466c() {
        }

        public void run() {
            if (C12463y0.this.f19913x.mo53469c() == C13813m.IDLE) {
                C12463y0.this.f19900k.mo50002a(C13781d.C13782a.INFO, "CONNECTING as requested");
                C12463y0.this.m27531M(C13813m.CONNECTING);
                C12463y0.this.m27537S();
            }
        }
    }

    /* renamed from: io.grpc.internal.y0$d */
    /* compiled from: InternalSubchannel */
    class C12467d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ List f19918b;

        /* renamed from: io.grpc.internal.y0$d$a */
        /* compiled from: InternalSubchannel */
        class C12468a implements Runnable {
            C12468a() {
            }

            public void run() {
                C12341k1 p = C12463y0.this.f19908s;
                C13805j0.C13808c unused = C12463y0.this.f19907r = null;
                C12341k1 unused2 = C12463y0.this.f19908s = null;
                p.mo49697b(C12594t.f20198u.mo50310r("InternalSubchannel closed transport due to address change"));
            }
        }

        C12467d(List list) {
            this.f19918b = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.y0$k r0 = r0.f19902m
                java.net.SocketAddress r0 = r0.mo50142a()
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.y0$k r1 = r1.f19902m
                java.util.List r2 = r7.f19918b
                r1.mo50149h(r2)
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                java.util.List r2 = r7.f19918b
                java.util.List unused = r1.f19903n = r2
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                xd.n r1 = r1.f19913x
                xd.m r1 = r1.mo53469c()
                xd.m r2 = p458xd.C13813m.READY
                r3 = 0
                if (r1 == r2) goto L_0x0039
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                xd.n r1 = r1.f19913x
                xd.m r1 = r1.mo53469c()
                xd.m r4 = p458xd.C13813m.CONNECTING
                if (r1 != r4) goto L_0x0091
            L_0x0039:
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.y0$k r1 = r1.f19902m
                boolean r0 = r1.mo50148g(r0)
                if (r0 != 0) goto L_0x0091
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                xd.n r0 = r0.f19913x
                xd.m r0 = r0.mo53469c()
                if (r0 != r2) goto L_0x006d
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.k1 r0 = r0.f19912w
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                p364io.grpc.internal.C12341k1 unused = r1.f19912w = r3
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.y0$k r1 = r1.f19902m
                r1.mo50147f()
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                xd.m r2 = p458xd.C13813m.IDLE
                r1.m27531M(r2)
                goto L_0x0092
            L_0x006d:
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.v r0 = r0.f19911v
                io.grpc.t r1 = p364io.grpc.C12594t.f20198u
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                io.grpc.t r1 = r1.mo50310r(r2)
                r0.mo49697b(r1)
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                p364io.grpc.internal.C12447v unused = r0.f19911v = r3
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.y0$k r0 = r0.f19902m
                r0.mo50147f()
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                r0.m27537S()
            L_0x0091:
                r0 = r3
            L_0x0092:
                if (r0 == 0) goto L_0x00e1
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                xd.j0$c r1 = r1.f19907r
                if (r1 == 0) goto L_0x00c0
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                io.grpc.internal.k1 r1 = r1.f19908s
                io.grpc.t r2 = p364io.grpc.C12594t.f20198u
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                io.grpc.t r2 = r2.mo50310r(r4)
                r1.mo49697b(r2)
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                xd.j0$c r1 = r1.f19907r
                r1.mo53463a()
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                p458xd.C13805j0.C13808c unused = r1.f19907r = r3
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                p364io.grpc.internal.C12341k1 unused = r1.f19908s = r3
            L_0x00c0:
                io.grpc.internal.y0 r1 = p364io.grpc.internal.C12463y0.this
                p364io.grpc.internal.C12341k1 unused = r1.f19908s = r0
                io.grpc.internal.y0 r0 = p364io.grpc.internal.C12463y0.this
                xd.j0 r1 = r0.f19901l
                io.grpc.internal.y0$d$a r2 = new io.grpc.internal.y0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.y0 r6 = p364io.grpc.internal.C12463y0.this
                java.util.concurrent.ScheduledExecutorService r6 = r6.f19896g
                xd.j0$c r1 = r1.mo53457c(r2, r3, r5, r6)
                p458xd.C13805j0.C13808c unused = r0.f19907r = r1
            L_0x00e1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12463y0.C12467d.run():void");
        }
    }

    /* renamed from: io.grpc.internal.y0$e */
    /* compiled from: InternalSubchannel */
    class C12469e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12594t f19921b;

        C12469e(C12594t tVar) {
            this.f19921b = tVar;
        }

        public void run() {
            C13813m c = C12463y0.this.f19913x.mo53469c();
            C13813m mVar = C13813m.SHUTDOWN;
            if (c != mVar) {
                C12594t unused = C12463y0.this.f19914y = this.f19921b;
                C12341k1 j = C12463y0.this.f19912w;
                C12447v l = C12463y0.this.f19911v;
                C12341k1 unused2 = C12463y0.this.f19912w = null;
                C12447v unused3 = C12463y0.this.f19911v = null;
                C12463y0.this.m27531M(mVar);
                C12463y0.this.f19902m.mo50147f();
                if (C12463y0.this.f19909t.isEmpty()) {
                    C12463y0.this.m27533O();
                }
                C12463y0.this.m27529K();
                if (C12463y0.this.f19907r != null) {
                    C12463y0.this.f19907r.mo53463a();
                    C12463y0.this.f19908s.mo49697b(this.f19921b);
                    C13805j0.C13808c unused4 = C12463y0.this.f19907r = null;
                    C12341k1 unused5 = C12463y0.this.f19908s = null;
                }
                if (j != null) {
                    j.mo49697b(this.f19921b);
                }
                if (l != null) {
                    l.mo49697b(this.f19921b);
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.y0$f */
    /* compiled from: InternalSubchannel */
    class C12470f implements Runnable {
        C12470f() {
        }

        public void run() {
            C12463y0.this.f19900k.mo50002a(C13781d.C13782a.INFO, "Terminated");
            C12463y0.this.f19894e.mo49917d(C12463y0.this);
        }
    }

    /* renamed from: io.grpc.internal.y0$g */
    /* compiled from: InternalSubchannel */
    class C12471g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12447v f19924b;

        /* renamed from: c */
        final /* synthetic */ boolean f19925c;

        C12471g(C12447v vVar, boolean z) {
            this.f19924b = vVar;
            this.f19925c = z;
        }

        public void run() {
            C12463y0.this.f19910u.mo50116e(this.f19924b, this.f19925c);
        }
    }

    /* renamed from: io.grpc.internal.y0$h */
    /* compiled from: InternalSubchannel */
    class C12472h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12594t f19927b;

        C12472h(C12594t tVar) {
            this.f19927b = tVar;
        }

        public void run() {
            for (C12341k1 c : new ArrayList(C12463y0.this.f19909t)) {
                c.mo49698c(this.f19927b);
            }
        }
    }

    /* renamed from: io.grpc.internal.y0$i */
    /* compiled from: InternalSubchannel */
    static final class C12473i extends C12340k0 {

        /* renamed from: a */
        private final C12447v f19929a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C12358m f19930b;

        /* renamed from: io.grpc.internal.y0$i$a */
        /* compiled from: InternalSubchannel */
        class C12474a extends C12313h0 {

            /* renamed from: a */
            final /* synthetic */ C12398q f19931a;

            /* renamed from: io.grpc.internal.y0$i$a$a */
            /* compiled from: InternalSubchannel */
            class C12475a extends C12321i0 {

                /* renamed from: a */
                final /* synthetic */ C12402r f19933a;

                C12475a(C12402r rVar) {
                    this.f19933a = rVar;
                }

                /* renamed from: d */
                public void mo49740d(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
                    C12473i.this.f19930b.mo49994a(tVar.mo50308p());
                    super.mo49740d(tVar, aVar, oVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: e */
                public C12402r mo49934e() {
                    return this.f19933a;
                }
            }

            C12474a(C12398q qVar) {
                this.f19931a = qVar;
            }

            /* renamed from: j */
            public void mo49667j(C12402r rVar) {
                C12473i.this.f19930b.mo49995b();
                super.mo49667j(new C12475a(rVar));
            }

            /* access modifiers changed from: protected */
            /* renamed from: m */
            public C12398q mo49927m() {
                return this.f19931a;
            }
        }

        /* synthetic */ C12473i(C12447v vVar, C12358m mVar, C12464a aVar) {
            this(vVar, mVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12447v mo49977a() {
            return this.f19929a;
        }

        /* renamed from: d */
        public C12398q mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr) {
            return new C12474a(super.mo49699d(d0Var, oVar, bVar, cVarArr));
        }

        private C12473i(C12447v vVar, C12358m mVar) {
            this.f19929a = vVar;
            this.f19930b = mVar;
        }
    }

    /* renamed from: io.grpc.internal.y0$j */
    /* compiled from: InternalSubchannel */
    static abstract class C12476j {
        C12476j() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo49914a(C12463y0 y0Var);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo49915b(C12463y0 y0Var);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo49916c(C12463y0 y0Var, C13814n nVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo49917d(C12463y0 y0Var);
    }

    /* renamed from: io.grpc.internal.y0$k */
    /* compiled from: InternalSubchannel */
    static final class C12477k {

        /* renamed from: a */
        private List<C12167e> f19935a;

        /* renamed from: b */
        private int f19936b;

        /* renamed from: c */
        private int f19937c;

        public C12477k(List<C12167e> list) {
            this.f19935a = list;
        }

        /* renamed from: a */
        public SocketAddress mo50142a() {
            return this.f19935a.get(this.f19936b).mo49649a().get(this.f19937c);
        }

        /* renamed from: b */
        public C12155a mo50143b() {
            return this.f19935a.get(this.f19936b).mo49650b();
        }

        /* renamed from: c */
        public void mo50144c() {
            int i = this.f19937c + 1;
            this.f19937c = i;
            if (i >= this.f19935a.get(this.f19936b).mo49649a().size()) {
                this.f19936b++;
                this.f19937c = 0;
            }
        }

        /* renamed from: d */
        public boolean mo50145d() {
            if (this.f19936b == 0 && this.f19937c == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo50146e() {
            if (this.f19936b < this.f19935a.size()) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public void mo50147f() {
            this.f19936b = 0;
            this.f19937c = 0;
        }

        /* renamed from: g */
        public boolean mo50148g(SocketAddress socketAddress) {
            int i = 0;
            while (i < this.f19935a.size()) {
                int indexOf = this.f19935a.get(i).mo49649a().indexOf(socketAddress);
                if (indexOf == -1) {
                    i++;
                } else {
                    this.f19936b = i;
                    this.f19937c = indexOf;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public void mo50149h(List<C12167e> list) {
            this.f19935a = list;
            mo50147f();
        }
    }

    /* renamed from: io.grpc.internal.y0$l */
    /* compiled from: InternalSubchannel */
    private class C12478l implements C12341k1.C12342a {

        /* renamed from: a */
        final C12447v f19938a;

        /* renamed from: b */
        final SocketAddress f19939b;

        /* renamed from: c */
        boolean f19940c = false;

        /* renamed from: io.grpc.internal.y0$l$a */
        /* compiled from: InternalSubchannel */
        class C12479a implements Runnable {
            C12479a() {
            }

            public void run() {
                boolean z;
                C12338k unused = C12463y0.this.f19904o = null;
                if (C12463y0.this.f19914y != null) {
                    if (C12463y0.this.f19912w == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C8012n.m15762u(z, "Unexpected non-null activeTransport");
                    C12478l lVar = C12478l.this;
                    lVar.f19938a.mo49697b(C12463y0.this.f19914y);
                    return;
                }
                C12447v l = C12463y0.this.f19911v;
                C12478l lVar2 = C12478l.this;
                C12447v vVar = lVar2.f19938a;
                if (l == vVar) {
                    C12341k1 unused2 = C12463y0.this.f19912w = vVar;
                    C12447v unused3 = C12463y0.this.f19911v = null;
                    C12463y0.this.m27531M(C13813m.READY);
                }
            }
        }

        /* renamed from: io.grpc.internal.y0$l$b */
        /* compiled from: InternalSubchannel */
        class C12480b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12594t f19943b;

            C12480b(C12594t tVar) {
                this.f19943b = tVar;
            }

            public void run() {
                boolean z;
                if (C12463y0.this.f19913x.mo53469c() != C13813m.SHUTDOWN) {
                    C12341k1 j = C12463y0.this.f19912w;
                    C12478l lVar = C12478l.this;
                    if (j == lVar.f19938a) {
                        C12341k1 unused = C12463y0.this.f19912w = null;
                        C12463y0.this.f19902m.mo50147f();
                        C12463y0.this.m27531M(C13813m.IDLE);
                        return;
                    }
                    C12447v l = C12463y0.this.f19911v;
                    C12478l lVar2 = C12478l.this;
                    if (l == lVar2.f19938a) {
                        if (C12463y0.this.f19913x.mo53469c() == C13813m.CONNECTING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C8012n.m15764w(z, "Expected state is CONNECTING, actual state is %s", C12463y0.this.f19913x.mo53469c());
                        C12463y0.this.f19902m.mo50144c();
                        if (!C12463y0.this.f19902m.mo50146e()) {
                            C12447v unused2 = C12463y0.this.f19911v = null;
                            C12463y0.this.f19902m.mo50147f();
                            C12463y0.this.m27536R(this.f19943b);
                            return;
                        }
                        C12463y0.this.m27537S();
                    }
                }
            }
        }

        /* renamed from: io.grpc.internal.y0$l$c */
        /* compiled from: InternalSubchannel */
        class C12481c implements Runnable {
            C12481c() {
            }

            public void run() {
                C12463y0.this.f19909t.remove(C12478l.this.f19938a);
                if (C12463y0.this.f19913x.mo53469c() == C13813m.SHUTDOWN && C12463y0.this.f19909t.isEmpty()) {
                    C12463y0.this.m27533O();
                }
            }
        }

        C12478l(C12447v vVar, SocketAddress socketAddress) {
            this.f19938a = vVar;
            this.f19939b = socketAddress;
        }

        /* renamed from: a */
        public void mo49860a(C12594t tVar) {
            C12463y0.this.f19900k.mo50003b(C13781d.C13782a.INFO, "{0} SHUTDOWN with {1}", this.f19938a.mo49701f(), C12463y0.this.m27535Q(tVar));
            this.f19940c = true;
            C12463y0.this.f19901l.execute(new C12480b(tVar));
        }

        /* renamed from: b */
        public void mo49861b() {
            C12463y0.this.f19900k.mo50002a(C13781d.C13782a.INFO, "READY");
            C12463y0.this.f19901l.execute(new C12479a());
        }

        /* renamed from: c */
        public void mo49862c() {
            C8012n.m15762u(this.f19940c, "transportShutdown() must be called before transportTerminated().");
            C12463y0.this.f19900k.mo50003b(C13781d.C13782a.INFO, "{0} Terminated", this.f19938a.mo49701f());
            C12463y0.this.f19897h.mo53511i(this.f19938a);
            C12463y0.this.m27534P(this.f19938a, false);
            C12463y0.this.f19901l.execute(new C12481c());
        }

        /* renamed from: d */
        public void mo49863d(boolean z) {
            C12463y0.this.m27534P(this.f19938a, z);
        }
    }

    /* renamed from: io.grpc.internal.y0$m */
    /* compiled from: InternalSubchannel */
    static final class C12482m extends C13781d {

        /* renamed from: a */
        C13841z f19946a;

        C12482m() {
        }

        /* renamed from: a */
        public void mo50002a(C13781d.C13782a aVar, String str) {
            C12368n.m27196d(this.f19946a, aVar, str);
        }

        /* renamed from: b */
        public void mo50003b(C13781d.C13782a aVar, String str, Object... objArr) {
            C12368n.m27197e(this.f19946a, aVar, str, objArr);
        }
    }

    C12463y0(List<C12167e> list, String str, String str2, C12338k.C12339a aVar, C12429t tVar, ScheduledExecutorService scheduledExecutorService, C8019r<C8016p> rVar, C13805j0 j0Var, C12476j jVar, C13832v vVar, C12358m mVar, C12374o oVar, C13841z zVar, C13781d dVar) {
        List<C12167e> list2 = list;
        C8012n.m15756o(list, "addressGroups");
        C8012n.m15746e(!list.isEmpty(), "addressGroups is empty");
        m27530L(list, "addressGroups contains null entry");
        List<C12167e> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f19903n = unmodifiableList;
        this.f19902m = new C12477k(unmodifiableList);
        this.f19891b = str;
        this.f19892c = str2;
        this.f19893d = aVar;
        this.f19895f = tVar;
        this.f19896g = scheduledExecutorService;
        this.f19905p = rVar.get();
        this.f19901l = j0Var;
        this.f19894e = jVar;
        this.f19897h = vVar;
        this.f19898i = mVar;
        this.f19899j = (C12374o) C8012n.m15756o(oVar, "channelTracer");
        this.f19890a = (C13841z) C8012n.m15756o(zVar, "logId");
        this.f19900k = (C13781d) C8012n.m15756o(dVar, "channelLogger");
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m27529K() {
        this.f19901l.mo53458d();
        C13805j0.C13808c cVar = this.f19906q;
        if (cVar != null) {
            cVar.mo53463a();
            this.f19906q = null;
            this.f19904o = null;
        }
    }

    /* renamed from: L */
    private static void m27530L(List<?> list, String str) {
        for (Object o : list) {
            C8012n.m15756o(o, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m27531M(C13813m mVar) {
        this.f19901l.mo53458d();
        m27532N(C13814n.m31720a(mVar));
    }

    /* renamed from: N */
    private void m27532N(C13814n nVar) {
        boolean z;
        this.f19901l.mo53458d();
        if (this.f19913x.mo53469c() != nVar.mo53469c()) {
            if (this.f19913x.mo53469c() != C13813m.SHUTDOWN) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "Cannot transition out of SHUTDOWN to " + nVar);
            this.f19913x = nVar;
            this.f19894e.mo49916c(this, nVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m27533O() {
        this.f19901l.execute(new C12470f());
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m27534P(C12447v vVar, boolean z) {
        this.f19901l.execute(new C12471g(vVar, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public String m27535Q(C12594t tVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(tVar.mo50306n());
        if (tVar.mo50307o() != null) {
            sb.append("(");
            sb.append(tVar.mo50307o());
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m27536R(C12594t tVar) {
        this.f19901l.mo53458d();
        m27532N(C13814n.m31721b(tVar));
        if (this.f19904o == null) {
            this.f19904o = this.f19893d.get();
        }
        long a = this.f19904o.mo49802a();
        C8016p pVar = this.f19905p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long d = a - pVar.mo41847d(timeUnit);
        boolean z = false;
        this.f19900k.mo50003b(C13781d.C13782a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", m27535Q(tVar), Long.valueOf(d));
        if (this.f19906q == null) {
            z = true;
        }
        C8012n.m15762u(z, "previous reconnectTask is not done");
        this.f19906q = this.f19901l.mo53457c(new C12465b(), d, timeUnit, this.f19896g);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m27537S() {
        boolean z;
        SocketAddress socketAddress;
        C13829u uVar;
        this.f19901l.mo53458d();
        if (this.f19906q == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Should have no reconnectTask scheduled");
        if (this.f19902m.mo50145d()) {
            this.f19905p.mo41848f().mo41849g();
        }
        SocketAddress a = this.f19902m.mo50142a();
        if (a instanceof C13829u) {
            uVar = (C13829u) a;
            socketAddress = uVar.mo53498c();
        } else {
            socketAddress = a;
            uVar = null;
        }
        C12155a b = this.f19902m.mo50143b();
        String str = (String) b.mo49607b(C12167e.f19073d);
        C12429t.C12430a aVar = new C12429t.C12430a();
        if (str == null) {
            str = this.f19891b;
        }
        C12429t.C12430a g = aVar.mo50076e(str).mo50078f(b).mo50080h(this.f19892c).mo50079g(uVar);
        C12482m mVar = new C12482m();
        mVar.f19946a = mo49701f();
        C12473i iVar = new C12473i(this.f19895f.mo49982r(socketAddress, g, mVar), this.f19898i, (C12464a) null);
        mVar.f19946a = iVar.mo49701f();
        this.f19897h.mo53508c(iVar);
        this.f19911v = iVar;
        this.f19909t.add(iVar);
        Runnable e = iVar.mo49700e(new C12478l(iVar, socketAddress));
        if (e != null) {
            this.f19901l.mo53456b(e);
        }
        this.f19900k.mo50003b(C13781d.C13782a.INFO, "Started transport {0}", mVar.f19946a);
    }

    /* renamed from: T */
    public void mo50130T(List<C12167e> list) {
        C8012n.m15756o(list, "newAddressGroups");
        m27530L(list, "newAddressGroups contains null entry");
        C8012n.m15746e(!list.isEmpty(), "newAddressGroups is empty");
        this.f19901l.execute(new C12467d(Collections.unmodifiableList(new ArrayList(list))));
    }

    /* renamed from: a */
    public C12422s mo50008a() {
        C12341k1 k1Var = this.f19912w;
        if (k1Var != null) {
            return k1Var;
        }
        this.f19901l.execute(new C12466c());
        return null;
    }

    /* renamed from: b */
    public void mo50131b(C12594t tVar) {
        this.f19901l.execute(new C12469e(tVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50132c(C12594t tVar) {
        mo50131b(tVar);
        this.f19901l.execute(new C12472h(tVar));
    }

    /* renamed from: f */
    public C13841z mo49701f() {
        return this.f19890a;
    }

    public String toString() {
        return C8003j.m15723c(this).mo41839c("logId", this.f19890a.mo53522d()).mo41840d("addressGroups", this.f19903n).toString();
    }
}
