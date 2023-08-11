package p364io.grpc.internal;

import java.util.List;
import java.util.Map;
import p111h6.C8003j;
import p111h6.C8012n;
import p364io.grpc.C12155a;
import p364io.grpc.C12167e;
import p364io.grpc.C12546k;
import p364io.grpc.C12559l;
import p364io.grpc.C12561m;
import p364io.grpc.C12575p;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12245e2;
import p458xd.C13781d;
import p458xd.C13813m;

/* renamed from: io.grpc.internal.j */
/* compiled from: AutoConfiguredLoadBalancerFactory */
public final class C12325j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12561m f19553a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f19554b;

    /* renamed from: io.grpc.internal.j$b */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    public final class C12327b {

        /* renamed from: a */
        private final C12546k.C12551d f19555a;

        /* renamed from: b */
        private C12546k f19556b;

        /* renamed from: c */
        private C12559l f19557c;

        C12327b(C12546k.C12551d dVar) {
            this.f19555a = dVar;
            C12559l d = C12325j.this.f19553a.mo50237d(C12325j.this.f19554b);
            this.f19557c = d;
            if (d != null) {
                this.f19556b = d.mo48968a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C12325j.this.f19554b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        /* renamed from: a */
        public C12546k mo49951a() {
            return this.f19556b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo49952b(C12594t tVar) {
            mo49951a().mo48959b(tVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo49953c() {
            this.f19556b.mo48961d();
            this.f19556b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C12594t mo49954d(C12546k.C12554g gVar) {
            List<C12167e> a = gVar.mo50222a();
            C12155a b = gVar.mo50223b();
            C12245e2.C12247b bVar = (C12245e2.C12247b) gVar.mo50224c();
            if (bVar == null) {
                try {
                    C12325j jVar = C12325j.this;
                    bVar = new C12245e2.C12247b(jVar.m27068d(jVar.f19554b, "using default policy"), (Object) null);
                } catch (C12331f e) {
                    this.f19555a.mo49873e(C13813m.TRANSIENT_FAILURE, new C12329d(C12594t.f20197t.mo50310r(e.getMessage())));
                    this.f19556b.mo48961d();
                    this.f19557c = null;
                    this.f19556b = new C12330e();
                    return C12594t.f20183f;
                }
            }
            if (this.f19557c == null || !bVar.f19288a.mo48969b().equals(this.f19557c.mo48969b())) {
                this.f19555a.mo49873e(C13813m.CONNECTING, new C12328c());
                this.f19556b.mo48961d();
                C12559l lVar = bVar.f19288a;
                this.f19557c = lVar;
                C12546k kVar = this.f19556b;
                this.f19556b = lVar.mo48968a(this.f19555a);
                this.f19555a.mo49870b().mo50003b(C13781d.C13782a.INFO, "Load balancer changed from {0} to {1}", kVar.getClass().getSimpleName(), this.f19556b.getClass().getSimpleName());
            }
            Object obj = bVar.f19289b;
            if (obj != null) {
                this.f19555a.mo49870b().mo50003b(C13781d.C13782a.DEBUG, "Load-balancing config: {0}", bVar.f19289b);
            }
            C12546k a2 = mo49951a();
            if (!gVar.mo50222a().isEmpty() || a2.mo50206a()) {
                a2.mo48960c(C12546k.C12554g.m27771d().mo50229b(gVar.mo50222a()).mo50230c(b).mo50231d(obj).mo50228a());
                return C12594t.f20183f;
            }
            C12594t tVar = C12594t.f20198u;
            return tVar.mo50310r("NameResolver returned no usable address. addrs=" + a + ", attrs=" + b);
        }
    }

    /* renamed from: io.grpc.internal.j$c */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C12328c extends C12546k.C12557i {
        private C12328c() {
        }

        /* renamed from: a */
        public C12546k.C12552e mo48964a(C12546k.C12553f fVar) {
            return C12546k.C12552e.m27761g();
        }

        public String toString() {
            return C8003j.m15722b(C12328c.class).toString();
        }
    }

    /* renamed from: io.grpc.internal.j$d */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C12329d extends C12546k.C12557i {

        /* renamed from: a */
        private final C12594t f19559a;

        C12329d(C12594t tVar) {
            this.f19559a = tVar;
        }

        /* renamed from: a */
        public C12546k.C12552e mo48964a(C12546k.C12553f fVar) {
            return C12546k.C12552e.m27760f(this.f19559a);
        }
    }

    /* renamed from: io.grpc.internal.j$f */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    static final class C12331f extends Exception {
        private static final long serialVersionUID = 1;

        private C12331f(String str) {
            super(str);
        }
    }

    public C12325j(String str) {
        this(C12561m.m27794b(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C12559l m27068d(String str, String str2) {
        C12559l d = this.f19553a.mo50237d(str);
        if (d != null) {
            return d;
        }
        throw new C12331f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    /* renamed from: e */
    public C12327b mo49949e(C12546k.C12551d dVar) {
        return new C12327b(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12575p.C12579c mo49950f(Map<String, ?> map) {
        List<C12245e2.C12246a> list;
        if (map != null) {
            try {
                list = C12245e2.m26798A(C12245e2.m26805g(map));
            } catch (RuntimeException e) {
                return C12575p.C12579c.m27877b(C12594t.f20185h.mo50310r("can't parse load balancer configuration").mo50309q(e));
            }
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return C12245e2.m26823y(list, this.f19553a);
    }

    C12325j(C12561m mVar, String str) {
        this.f19553a = (C12561m) C8012n.m15756o(mVar, "registry");
        this.f19554b = (String) C8012n.m15756o(str, "defaultPolicy");
    }

    /* renamed from: io.grpc.internal.j$e */
    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class C12330e extends C12546k {
        private C12330e() {
        }

        /* renamed from: d */
        public void mo48961d() {
        }

        /* renamed from: b */
        public void mo48959b(C12594t tVar) {
        }

        /* renamed from: c */
        public void mo48960c(C12546k.C12554g gVar) {
        }
    }
}
