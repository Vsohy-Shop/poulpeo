package p364io.grpc;

import androidx.core.app.NotificationCompat;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;
import p458xd.C13781d;
import p458xd.C13794g0;
import p458xd.C13805j0;

/* renamed from: io.grpc.p */
/* compiled from: NameResolver */
public abstract class C12575p {

    /* renamed from: io.grpc.p$a */
    /* compiled from: NameResolver */
    class C12576a extends C12581e {

        /* renamed from: a */
        final /* synthetic */ C12582f f20149a;

        C12576a(C12582f fVar) {
            this.f20149a = fVar;
        }

        /* renamed from: a */
        public void mo49877a(C12594t tVar) {
            this.f20149a.mo49877a(tVar);
        }

        /* renamed from: c */
        public void mo49878c(C12583g gVar) {
            this.f20149a.mo50282b(gVar.mo50283a(), gVar.mo50284b());
        }
    }

    /* renamed from: io.grpc.p$b */
    /* compiled from: NameResolver */
    public static final class C12577b {

        /* renamed from: a */
        private final int f20151a;

        /* renamed from: b */
        private final C13794g0 f20152b;

        /* renamed from: c */
        private final C13805j0 f20153c;

        /* renamed from: d */
        private final C12585h f20154d;

        /* renamed from: e */
        private final ScheduledExecutorService f20155e;

        /* renamed from: f */
        private final C13781d f20156f;

        /* renamed from: g */
        private final Executor f20157g;

        /* renamed from: io.grpc.p$b$a */
        /* compiled from: NameResolver */
        public static final class C12578a {

            /* renamed from: a */
            private Integer f20158a;

            /* renamed from: b */
            private C13794g0 f20159b;

            /* renamed from: c */
            private C13805j0 f20160c;

            /* renamed from: d */
            private C12585h f20161d;

            /* renamed from: e */
            private ScheduledExecutorService f20162e;

            /* renamed from: f */
            private C13781d f20163f;

            /* renamed from: g */
            private Executor f20164g;

            C12578a() {
            }

            /* renamed from: a */
            public C12577b mo50269a() {
                return new C12577b(this.f20158a, this.f20159b, this.f20160c, this.f20161d, this.f20162e, this.f20163f, this.f20164g, (C12576a) null);
            }

            /* renamed from: b */
            public C12578a mo50270b(C13781d dVar) {
                this.f20163f = (C13781d) C8012n.m15755n(dVar);
                return this;
            }

            /* renamed from: c */
            public C12578a mo50271c(int i) {
                this.f20158a = Integer.valueOf(i);
                return this;
            }

            /* renamed from: d */
            public C12578a mo50272d(Executor executor) {
                this.f20164g = executor;
                return this;
            }

            /* renamed from: e */
            public C12578a mo50273e(C13794g0 g0Var) {
                this.f20159b = (C13794g0) C8012n.m15755n(g0Var);
                return this;
            }

            /* renamed from: f */
            public C12578a mo50274f(ScheduledExecutorService scheduledExecutorService) {
                this.f20162e = (ScheduledExecutorService) C8012n.m15755n(scheduledExecutorService);
                return this;
            }

            /* renamed from: g */
            public C12578a mo50275g(C12585h hVar) {
                this.f20161d = (C12585h) C8012n.m15755n(hVar);
                return this;
            }

            /* renamed from: h */
            public C12578a mo50276h(C13805j0 j0Var) {
                this.f20160c = (C13805j0) C8012n.m15755n(j0Var);
                return this;
            }
        }

        /* synthetic */ C12577b(Integer num, C13794g0 g0Var, C13805j0 j0Var, C12585h hVar, ScheduledExecutorService scheduledExecutorService, C13781d dVar, Executor executor, C12576a aVar) {
            this(num, g0Var, j0Var, hVar, scheduledExecutorService, dVar, executor);
        }

        /* renamed from: f */
        public static C12578a m27862f() {
            return new C12578a();
        }

        /* renamed from: a */
        public int mo50263a() {
            return this.f20151a;
        }

        /* renamed from: b */
        public Executor mo50264b() {
            return this.f20157g;
        }

        /* renamed from: c */
        public C13794g0 mo50265c() {
            return this.f20152b;
        }

        /* renamed from: d */
        public C12585h mo50266d() {
            return this.f20154d;
        }

        /* renamed from: e */
        public C13805j0 mo50267e() {
            return this.f20153c;
        }

        public String toString() {
            return C8003j.m15723c(this).mo41838b("defaultPort", this.f20151a).mo41840d("proxyDetector", this.f20152b).mo41840d("syncContext", this.f20153c).mo41840d("serviceConfigParser", this.f20154d).mo41840d("scheduledExecutorService", this.f20155e).mo41840d("channelLogger", this.f20156f).mo41840d("executor", this.f20157g).toString();
        }

        private C12577b(Integer num, C13794g0 g0Var, C13805j0 j0Var, C12585h hVar, ScheduledExecutorService scheduledExecutorService, C13781d dVar, Executor executor) {
            this.f20151a = ((Integer) C8012n.m15756o(num, "defaultPort not set")).intValue();
            this.f20152b = (C13794g0) C8012n.m15756o(g0Var, "proxyDetector not set");
            this.f20153c = (C13805j0) C8012n.m15756o(j0Var, "syncContext not set");
            this.f20154d = (C12585h) C8012n.m15756o(hVar, "serviceConfigParser not set");
            this.f20155e = scheduledExecutorService;
            this.f20156f = dVar;
            this.f20157g = executor;
        }
    }

    /* renamed from: io.grpc.p$d */
    /* compiled from: NameResolver */
    public static abstract class C12580d {
        /* renamed from: a */
        public abstract String mo49791a();

        /* renamed from: b */
        public abstract C12575p mo49792b(URI uri, C12577b bVar);
    }

    /* renamed from: io.grpc.p$e */
    /* compiled from: NameResolver */
    public static abstract class C12581e implements C12582f {
        /* renamed from: a */
        public abstract void mo49877a(C12594t tVar);

        @Deprecated
        /* renamed from: b */
        public final void mo50282b(List<C12167e> list, C12155a aVar) {
            mo49878c(C12583g.m27887d().mo50290b(list).mo50291c(aVar).mo50289a());
        }

        /* renamed from: c */
        public abstract void mo49878c(C12583g gVar);
    }

    /* renamed from: io.grpc.p$f */
    /* compiled from: NameResolver */
    public interface C12582f {
        /* renamed from: a */
        void mo49877a(C12594t tVar);

        /* renamed from: b */
        void mo50282b(List<C12167e> list, C12155a aVar);
    }

    /* renamed from: io.grpc.p$g */
    /* compiled from: NameResolver */
    public static final class C12583g {

        /* renamed from: a */
        private final List<C12167e> f20167a;

        /* renamed from: b */
        private final C12155a f20168b;

        /* renamed from: c */
        private final C12579c f20169c;

        /* renamed from: io.grpc.p$g$a */
        /* compiled from: NameResolver */
        public static final class C12584a {

            /* renamed from: a */
            private List<C12167e> f20170a = Collections.emptyList();

            /* renamed from: b */
            private C12155a f20171b = C12155a.f19047b;

            /* renamed from: c */
            private C12579c f20172c;

            C12584a() {
            }

            /* renamed from: a */
            public C12583g mo50289a() {
                return new C12583g(this.f20170a, this.f20171b, this.f20172c);
            }

            /* renamed from: b */
            public C12584a mo50290b(List<C12167e> list) {
                this.f20170a = list;
                return this;
            }

            /* renamed from: c */
            public C12584a mo50291c(C12155a aVar) {
                this.f20171b = aVar;
                return this;
            }

            /* renamed from: d */
            public C12584a mo50292d(C12579c cVar) {
                this.f20172c = cVar;
                return this;
            }
        }

        C12583g(List<C12167e> list, C12155a aVar, C12579c cVar) {
            this.f20167a = Collections.unmodifiableList(new ArrayList(list));
            this.f20168b = (C12155a) C8012n.m15756o(aVar, "attributes");
            this.f20169c = cVar;
        }

        /* renamed from: d */
        public static C12584a m27887d() {
            return new C12584a();
        }

        /* renamed from: a */
        public List<C12167e> mo50283a() {
            return this.f20167a;
        }

        /* renamed from: b */
        public C12155a mo50284b() {
            return this.f20168b;
        }

        /* renamed from: c */
        public C12579c mo50285c() {
            return this.f20169c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12583g)) {
                return false;
            }
            C12583g gVar = (C12583g) obj;
            if (!C8007k.m15735a(this.f20167a, gVar.f20167a) || !C8007k.m15735a(this.f20168b, gVar.f20168b) || !C8007k.m15735a(this.f20169c, gVar.f20169c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f20167a, this.f20168b, this.f20169c);
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("addresses", this.f20167a).mo41840d("attributes", this.f20168b).mo41840d("serviceConfig", this.f20169c).toString();
        }
    }

    /* renamed from: io.grpc.p$h */
    /* compiled from: NameResolver */
    public static abstract class C12585h {
        /* renamed from: a */
        public abstract C12579c mo49746a(Map<String, ?> map);
    }

    /* renamed from: a */
    public abstract String mo49753a();

    /* renamed from: c */
    public abstract void mo49755c();

    /* renamed from: d */
    public void mo49756d(C12581e eVar) {
        mo50004e(eVar);
    }

    /* renamed from: e */
    public void mo50004e(C12582f fVar) {
        if (fVar instanceof C12581e) {
            mo49756d((C12581e) fVar);
        } else {
            mo49756d(new C12576a(fVar));
        }
    }

    /* renamed from: io.grpc.p$c */
    /* compiled from: NameResolver */
    public static final class C12579c {

        /* renamed from: a */
        private final C12594t f20165a;

        /* renamed from: b */
        private final Object f20166b;

        private C12579c(Object obj) {
            this.f20166b = C8012n.m15756o(obj, "config");
            this.f20165a = null;
        }

        /* renamed from: a */
        public static C12579c m27876a(Object obj) {
            return new C12579c(obj);
        }

        /* renamed from: b */
        public static C12579c m27877b(C12594t tVar) {
            return new C12579c(tVar);
        }

        /* renamed from: c */
        public Object mo50277c() {
            return this.f20166b;
        }

        /* renamed from: d */
        public C12594t mo50278d() {
            return this.f20165a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12579c.class != obj.getClass()) {
                return false;
            }
            C12579c cVar = (C12579c) obj;
            if (!C8007k.m15735a(this.f20165a, cVar.f20165a) || !C8007k.m15735a(this.f20166b, cVar.f20166b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f20165a, this.f20166b);
        }

        public String toString() {
            if (this.f20166b != null) {
                return C8003j.m15723c(this).mo41840d("config", this.f20166b).toString();
            }
            return C8003j.m15723c(this).mo41840d(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, this.f20165a).toString();
        }

        private C12579c(C12594t tVar) {
            this.f20166b = null;
            this.f20165a = (C12594t) C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
            C8012n.m15751j(!tVar.mo50308p(), "cannot use OK status: %s", tVar);
        }
    }

    /* renamed from: b */
    public void mo49754b() {
    }
}
