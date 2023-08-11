package p329de;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;
import p364io.grpc.C12155a;
import p364io.grpc.C12167e;
import p364io.grpc.C12546k;
import p364io.grpc.C12594t;
import p458xd.C13813m;
import p458xd.C13814n;

/* renamed from: de.a */
/* compiled from: RoundRobinLoadBalancer */
final class C11807a extends C12546k {

    /* renamed from: g */
    static final C12155a.C12158c<C11811d<C13814n>> f18445g = C12155a.C12158c.m26520a("state-info");

    /* renamed from: h */
    private static final C12594t f18446h = C12594t.f20183f.mo50310r("no subchannels ready");

    /* renamed from: b */
    private final C12546k.C12551d f18447b;

    /* renamed from: c */
    private final Map<C12167e, C12546k.C12556h> f18448c = new HashMap();

    /* renamed from: d */
    private final Random f18449d;

    /* renamed from: e */
    private C13813m f18450e;

    /* renamed from: f */
    private C11812e f18451f = new C11809b(f18446h);

    /* renamed from: de.a$a */
    /* compiled from: RoundRobinLoadBalancer */
    class C11808a implements C12546k.C12558j {

        /* renamed from: a */
        final /* synthetic */ C12546k.C12556h f18452a;

        C11808a(C12546k.C12556h hVar) {
            this.f18452a = hVar;
        }

        /* renamed from: a */
        public void mo48963a(C13814n nVar) {
            C11807a.this.m25398j(this.f18452a, nVar);
        }
    }

    /* renamed from: de.a$b */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C11809b extends C11812e {

        /* renamed from: a */
        private final C12594t f18454a;

        C11809b(C12594t tVar) {
            super((C11808a) null);
            this.f18454a = (C12594t) C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
        }

        /* renamed from: a */
        public C12546k.C12552e mo48964a(C12546k.C12553f fVar) {
            if (this.f18454a.mo50308p()) {
                return C12546k.C12552e.m27761g();
            }
            return C12546k.C12552e.m27760f(this.f18454a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo48965b(C11812e eVar) {
            if (eVar instanceof C11809b) {
                C11809b bVar = (C11809b) eVar;
                if (C8007k.m15735a(this.f18454a, bVar.f18454a) || (this.f18454a.mo50308p() && bVar.f18454a.mo50308p())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return C8003j.m15722b(C11809b.class).mo41840d(NotificationCompat.CATEGORY_STATUS, this.f18454a).toString();
        }
    }

    /* renamed from: de.a$c */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C11810c extends C11812e {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater<C11810c> f18455c = AtomicIntegerFieldUpdater.newUpdater(C11810c.class, "b");

        /* renamed from: a */
        private final List<C12546k.C12556h> f18456a;

        /* renamed from: b */
        private volatile int f18457b;

        C11810c(List<C12546k.C12556h> list, int i) {
            super((C11808a) null);
            C8012n.m15746e(!list.isEmpty(), "empty list");
            this.f18456a = list;
            this.f18457b = i - 1;
        }

        /* renamed from: c */
        private C12546k.C12556h m25412c() {
            int size = this.f18456a.size();
            AtomicIntegerFieldUpdater<C11810c> atomicIntegerFieldUpdater = f18455c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i);
                incrementAndGet = i;
            }
            return this.f18456a.get(incrementAndGet);
        }

        /* renamed from: a */
        public C12546k.C12552e mo48964a(C12546k.C12553f fVar) {
            return C12546k.C12552e.m27762h(m25412c());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo48965b(C11812e eVar) {
            if (!(eVar instanceof C11810c)) {
                return false;
            }
            C11810c cVar = (C11810c) eVar;
            if (cVar == this || (this.f18456a.size() == cVar.f18456a.size() && new HashSet(this.f18456a).containsAll(cVar.f18456a))) {
                return true;
            }
            return false;
        }

        public String toString() {
            return C8003j.m15722b(C11810c.class).mo41840d("list", this.f18456a).toString();
        }
    }

    /* renamed from: de.a$d */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C11811d<T> {

        /* renamed from: a */
        T f18458a;

        C11811d(T t) {
            this.f18458a = t;
        }
    }

    /* renamed from: de.a$e */
    /* compiled from: RoundRobinLoadBalancer */
    private static abstract class C11812e extends C12546k.C12557i {
        private C11812e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo48965b(C11812e eVar);

        /* synthetic */ C11812e(C11808a aVar) {
            this();
        }
    }

    C11807a(C12546k.C12551d dVar) {
        this.f18447b = (C12546k.C12551d) C8012n.m15756o(dVar, "helper");
        this.f18449d = new Random();
    }

    /* renamed from: f */
    private static List<C12546k.C12556h> m25395f(Collection<C12546k.C12556h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C12546k.C12556h next : collection) {
            if (m25397i(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static C11811d<C13814n> m25396g(C12546k.C12556h hVar) {
        return (C11811d) C8012n.m15756o(hVar.mo49907c().mo49607b(f18445g), "STATE_INFO");
    }

    /* renamed from: i */
    static boolean m25397i(C12546k.C12556h hVar) {
        if (((C13814n) m25396g(hVar).f18458a).mo53469c() == C13813m.READY) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25398j(C12546k.C12556h hVar, C13814n nVar) {
        if (this.f18448c.get(m25401m(hVar.mo50232a())) == hVar) {
            C13813m c = nVar.mo53469c();
            C13813m mVar = C13813m.TRANSIENT_FAILURE;
            if (c == mVar || nVar.mo53469c() == C13813m.IDLE) {
                this.f18447b.mo49872d();
            }
            C13813m c2 = nVar.mo53469c();
            C13813m mVar2 = C13813m.IDLE;
            if (c2 == mVar2) {
                hVar.mo49909e();
            }
            C11811d<C13814n> g = m25396g(hVar);
            if (!((C13814n) g.f18458a).mo53469c().equals(mVar) || (!nVar.mo53469c().equals(C13813m.CONNECTING) && !nVar.mo53469c().equals(mVar2))) {
                g.f18458a = nVar;
                m25403o();
            }
        }
    }

    /* renamed from: k */
    private static <T> Set<T> m25399k(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* renamed from: l */
    private void m25400l(C12546k.C12556h hVar) {
        hVar.mo49910f();
        m25396g(hVar).f18458a = C13814n.m31720a(C13813m.SHUTDOWN);
    }

    /* renamed from: m */
    private static C12167e m25401m(C12167e eVar) {
        return new C12167e(eVar.mo49649a());
    }

    /* renamed from: n */
    private static Map<C12167e, C12167e> m25402n(List<C12167e> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (C12167e next : list) {
            hashMap.put(m25401m(next), next);
        }
        return hashMap;
    }

    /* renamed from: o */
    private void m25403o() {
        C13813m mVar;
        List<C12546k.C12556h> f = m25395f(mo48962h());
        if (f.isEmpty()) {
            C12594t tVar = f18446h;
            boolean z = false;
            for (C12546k.C12556h g : mo48962h()) {
                C13814n nVar = (C13814n) m25396g(g).f18458a;
                if (nVar.mo53469c() == C13813m.CONNECTING || nVar.mo53469c() == C13813m.IDLE) {
                    z = true;
                }
                if (tVar == f18446h || !tVar.mo50308p()) {
                    tVar = nVar.mo53470d();
                }
            }
            if (z) {
                mVar = C13813m.CONNECTING;
            } else {
                mVar = C13813m.TRANSIENT_FAILURE;
            }
            m25404p(mVar, new C11809b(tVar));
            return;
        }
        m25404p(C13813m.READY, new C11810c(f, this.f18449d.nextInt(f.size())));
    }

    /* renamed from: p */
    private void m25404p(C13813m mVar, C11812e eVar) {
        if (mVar != this.f18450e || !eVar.mo48965b(this.f18451f)) {
            this.f18447b.mo49873e(mVar, eVar);
            this.f18450e = mVar;
            this.f18451f = eVar;
        }
    }

    /* renamed from: b */
    public void mo48959b(C12594t tVar) {
        if (this.f18450e != C13813m.READY) {
            m25404p(C13813m.TRANSIENT_FAILURE, new C11809b(tVar));
        }
    }

    /* renamed from: c */
    public void mo48960c(C12546k.C12554g gVar) {
        List<C12167e> a = gVar.mo50222a();
        Set<C12167e> keySet = this.f18448c.keySet();
        Map<C12167e, C12167e> n = m25402n(a);
        Set<T> k = m25399k(keySet, n.keySet());
        for (Map.Entry next : n.entrySet()) {
            C12167e eVar = (C12167e) next.getKey();
            C12167e eVar2 = (C12167e) next.getValue();
            C12546k.C12556h hVar = this.f18448c.get(eVar);
            if (hVar != null) {
                hVar.mo49912h(Collections.singletonList(eVar2));
            } else {
                C12546k.C12556h hVar2 = (C12546k.C12556h) C8012n.m15756o(this.f18447b.mo49869a(C12546k.C12548b.m27743c().mo50212d(eVar2).mo50214f(C12155a.m26513c().mo49614d(f18445g, new C11811d(C13814n.m31720a(C13813m.IDLE))).mo49612a()).mo50211b()), "subchannel");
                hVar2.mo49911g(new C11808a(hVar2));
                this.f18448c.put(eVar, hVar2);
                hVar2.mo49909e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T remove : k) {
            arrayList.add(this.f18448c.remove(remove));
        }
        m25403o();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m25400l((C12546k.C12556h) it.next());
        }
    }

    /* renamed from: d */
    public void mo48961d() {
        for (C12546k.C12556h l : mo48962h()) {
            m25400l(l);
        }
        this.f18448c.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Collection<C12546k.C12556h> mo48962h() {
        return this.f18448c.values();
    }
}
