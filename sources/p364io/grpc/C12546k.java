package p364io.grpc;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;
import p364io.grpc.C12155a;
import p364io.grpc.C12161c;
import p458xd.C13781d;
import p458xd.C13783d0;
import p458xd.C13805j0;
import p458xd.C13813m;
import p458xd.C13814n;

/* renamed from: io.grpc.k */
/* compiled from: LoadBalancer */
public abstract class C12546k {

    /* renamed from: a */
    public static final C12155a.C12158c<Map<String, ?>> f20110a = C12155a.C12158c.m26520a("health-checking-config");

    /* renamed from: io.grpc.k$b */
    /* compiled from: LoadBalancer */
    public static final class C12548b {

        /* renamed from: a */
        private final List<C12167e> f20111a;

        /* renamed from: b */
        private final C12155a f20112b;

        /* renamed from: c */
        private final Object[][] f20113c;

        /* renamed from: io.grpc.k$b$a */
        /* compiled from: LoadBalancer */
        public static final class C12549a {

            /* renamed from: a */
            private List<C12167e> f20114a;

            /* renamed from: b */
            private C12155a f20115b = C12155a.f19047b;

            /* renamed from: c */
            private Object[][] f20116c = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

            C12549a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public <T> C12549a m27748c(Object[][] objArr) {
                int length = objArr.length;
                int[] iArr = new int[2];
                iArr[1] = 2;
                iArr[0] = length;
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
                this.f20116c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            /* renamed from: b */
            public C12548b mo50211b() {
                return new C12548b(this.f20114a, this.f20115b, this.f20116c);
            }

            /* renamed from: d */
            public C12549a mo50212d(C12167e eVar) {
                this.f20114a = Collections.singletonList(eVar);
                return this;
            }

            /* renamed from: e */
            public C12549a mo50213e(List<C12167e> list) {
                C8012n.m15746e(!list.isEmpty(), "addrs is empty");
                this.f20114a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            /* renamed from: f */
            public C12549a mo50214f(C12155a aVar) {
                this.f20115b = (C12155a) C8012n.m15756o(aVar, "attrs");
                return this;
            }
        }

        /* renamed from: c */
        public static C12549a m27743c() {
            return new C12549a();
        }

        /* renamed from: a */
        public List<C12167e> mo50207a() {
            return this.f20111a;
        }

        /* renamed from: b */
        public C12155a mo50208b() {
            return this.f20112b;
        }

        /* renamed from: d */
        public C12549a mo50209d() {
            return m27743c().mo50213e(this.f20111a).mo50214f(this.f20112b).m27748c(this.f20113c);
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("addrs", this.f20111a).mo41840d("attrs", this.f20112b).mo41840d("customOptions", Arrays.deepToString(this.f20113c)).toString();
        }

        private C12548b(List<C12167e> list, C12155a aVar, Object[][] objArr) {
            this.f20111a = (List) C8012n.m15756o(list, "addresses are not set");
            this.f20112b = (C12155a) C8012n.m15756o(aVar, "attrs");
            this.f20113c = (Object[][]) C8012n.m15756o(objArr, "customOptions");
        }
    }

    /* renamed from: io.grpc.k$c */
    /* compiled from: LoadBalancer */
    public static abstract class C12550c {
        /* renamed from: a */
        public abstract C12546k mo48968a(C12551d dVar);
    }

    /* renamed from: io.grpc.k$d */
    /* compiled from: LoadBalancer */
    public static abstract class C12551d {
        /* renamed from: a */
        public C12556h mo49869a(C12548b bVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C13781d mo49870b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public C13805j0 mo49871c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo49872d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract void mo49873e(C13813m mVar, C12557i iVar);
    }

    /* renamed from: io.grpc.k$e */
    /* compiled from: LoadBalancer */
    public static final class C12552e {

        /* renamed from: e */
        private static final C12552e f20117e = new C12552e((C12556h) null, (C12161c.C12162a) null, C12594t.f20183f, false);

        /* renamed from: a */
        private final C12556h f20118a;

        /* renamed from: b */
        private final C12161c.C12162a f20119b;

        /* renamed from: c */
        private final C12594t f20120c;

        /* renamed from: d */
        private final boolean f20121d;

        private C12552e(C12556h hVar, C12161c.C12162a aVar, C12594t tVar, boolean z) {
            this.f20118a = hVar;
            this.f20119b = aVar;
            this.f20120c = (C12594t) C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
            this.f20121d = z;
        }

        /* renamed from: e */
        public static C12552e m27759e(C12594t tVar) {
            C8012n.m15746e(!tVar.mo50308p(), "drop status shouldn't be OK");
            return new C12552e((C12556h) null, (C12161c.C12162a) null, tVar, true);
        }

        /* renamed from: f */
        public static C12552e m27760f(C12594t tVar) {
            C8012n.m15746e(!tVar.mo50308p(), "error status shouldn't be OK");
            return new C12552e((C12556h) null, (C12161c.C12162a) null, tVar, false);
        }

        /* renamed from: g */
        public static C12552e m27761g() {
            return f20117e;
        }

        /* renamed from: h */
        public static C12552e m27762h(C12556h hVar) {
            return m27763i(hVar, (C12161c.C12162a) null);
        }

        /* renamed from: i */
        public static C12552e m27763i(C12556h hVar, C12161c.C12162a aVar) {
            return new C12552e((C12556h) C8012n.m15756o(hVar, "subchannel"), aVar, C12594t.f20183f, false);
        }

        /* renamed from: a */
        public C12594t mo50215a() {
            return this.f20120c;
        }

        /* renamed from: b */
        public C12161c.C12162a mo50216b() {
            return this.f20119b;
        }

        /* renamed from: c */
        public C12556h mo50217c() {
            return this.f20118a;
        }

        /* renamed from: d */
        public boolean mo50218d() {
            return this.f20121d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12552e)) {
                return false;
            }
            C12552e eVar = (C12552e) obj;
            if (!C8007k.m15735a(this.f20118a, eVar.f20118a) || !C8007k.m15735a(this.f20120c, eVar.f20120c) || !C8007k.m15735a(this.f20119b, eVar.f20119b) || this.f20121d != eVar.f20121d) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f20118a, this.f20120c, this.f20119b, Boolean.valueOf(this.f20121d));
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("subchannel", this.f20118a).mo41840d("streamTracerFactory", this.f20119b).mo41840d(NotificationCompat.CATEGORY_STATUS, this.f20120c).mo41841e("drop", this.f20121d).toString();
        }
    }

    /* renamed from: io.grpc.k$f */
    /* compiled from: LoadBalancer */
    public static abstract class C12553f {
        /* renamed from: a */
        public abstract C12159b mo50085a();

        /* renamed from: b */
        public abstract C12564o mo50086b();

        /* renamed from: c */
        public abstract C13783d0<?, ?> mo50087c();
    }

    /* renamed from: io.grpc.k$g */
    /* compiled from: LoadBalancer */
    public static final class C12554g {

        /* renamed from: a */
        private final List<C12167e> f20122a;

        /* renamed from: b */
        private final C12155a f20123b;

        /* renamed from: c */
        private final Object f20124c;

        /* renamed from: io.grpc.k$g$a */
        /* compiled from: LoadBalancer */
        public static final class C12555a {

            /* renamed from: a */
            private List<C12167e> f20125a;

            /* renamed from: b */
            private C12155a f20126b = C12155a.f19047b;

            /* renamed from: c */
            private Object f20127c;

            C12555a() {
            }

            /* renamed from: a */
            public C12554g mo50228a() {
                return new C12554g(this.f20125a, this.f20126b, this.f20127c);
            }

            /* renamed from: b */
            public C12555a mo50229b(List<C12167e> list) {
                this.f20125a = list;
                return this;
            }

            /* renamed from: c */
            public C12555a mo50230c(C12155a aVar) {
                this.f20126b = aVar;
                return this;
            }

            /* renamed from: d */
            public C12555a mo50231d(Object obj) {
                this.f20127c = obj;
                return this;
            }
        }

        /* renamed from: d */
        public static C12555a m27771d() {
            return new C12555a();
        }

        /* renamed from: a */
        public List<C12167e> mo50222a() {
            return this.f20122a;
        }

        /* renamed from: b */
        public C12155a mo50223b() {
            return this.f20123b;
        }

        /* renamed from: c */
        public Object mo50224c() {
            return this.f20124c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12554g)) {
                return false;
            }
            C12554g gVar = (C12554g) obj;
            if (!C8007k.m15735a(this.f20122a, gVar.f20122a) || !C8007k.m15735a(this.f20123b, gVar.f20123b) || !C8007k.m15735a(this.f20124c, gVar.f20124c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f20122a, this.f20123b, this.f20124c);
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("addresses", this.f20122a).mo41840d("attributes", this.f20123b).mo41840d("loadBalancingPolicyConfig", this.f20124c).toString();
        }

        private C12554g(List<C12167e> list, C12155a aVar, Object obj) {
            this.f20122a = Collections.unmodifiableList(new ArrayList((Collection) C8012n.m15756o(list, "addresses")));
            this.f20123b = (C12155a) C8012n.m15756o(aVar, "attributes");
            this.f20124c = obj;
        }
    }

    /* renamed from: io.grpc.k$h */
    /* compiled from: LoadBalancer */
    public static abstract class C12556h {
        /* renamed from: a */
        public final C12167e mo50232a() {
            List<C12167e> b = mo49906b();
            boolean z = true;
            if (b.size() != 1) {
                z = false;
            }
            C8012n.m15764w(z, "%s does not have exactly one group", b);
            return b.get(0);
        }

        /* renamed from: b */
        public List<C12167e> mo49906b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract C12155a mo49907c();

        /* renamed from: d */
        public Object mo49908d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract void mo49909e();

        /* renamed from: f */
        public abstract void mo49910f();

        /* renamed from: g */
        public void mo49911g(C12558j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: h */
        public void mo49912h(List<C12167e> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: io.grpc.k$i */
    /* compiled from: LoadBalancer */
    public static abstract class C12557i {
        /* renamed from: a */
        public abstract C12552e mo48964a(C12553f fVar);
    }

    /* renamed from: io.grpc.k$j */
    /* compiled from: LoadBalancer */
    public interface C12558j {
        /* renamed from: a */
        void mo48963a(C13814n nVar);
    }

    /* renamed from: a */
    public boolean mo50206a() {
        return false;
    }

    /* renamed from: b */
    public abstract void mo48959b(C12594t tVar);

    /* renamed from: c */
    public abstract void mo48960c(C12554g gVar);

    /* renamed from: d */
    public abstract void mo48961d();
}
