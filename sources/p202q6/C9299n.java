package p202q6;

import android.util.Log;
import androidx.compose.animation.core.C0344a;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p113h8.C8028a;
import p113h8.C8030b;
import p143k7.C8584a;
import p193p7.C9073c;
import p193p7.C9074d;

/* renamed from: q6.n */
/* compiled from: ComponentRuntime */
public class C9299n extends C9279a implements C8584a {

    /* renamed from: g */
    private static final C8030b<Set<Object>> f13650g = new C9296k();

    /* renamed from: a */
    private final Map<C9284d<?>, C8030b<?>> f13651a;

    /* renamed from: b */
    private final Map<Class<?>, C8030b<?>> f13652b;

    /* renamed from: c */
    private final Map<Class<?>, C9311u<?>> f13653c;

    /* renamed from: d */
    private final List<C8030b<C9294i>> f13654d;

    /* renamed from: e */
    private final C9309s f13655e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f13656f;

    /* renamed from: i */
    public static C9301b m19106i(Executor executor) {
        return new C9301b(executor);
    }

    /* renamed from: j */
    private void m19107j(List<C9284d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<C8030b<C9294i>> it = this.f13654d.iterator();
            while (it.hasNext()) {
                try {
                    C9294i iVar = (C9294i) it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f13651a.isEmpty()) {
                C9303p.m19129a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f13651a.keySet());
                arrayList2.addAll(list);
                C9303p.m19129a(arrayList2);
            }
            for (C9284d next : list) {
                this.f13651a.put(next, new C9310t(new C9295j(this, next)));
            }
            arrayList.addAll(m19115s(list));
            arrayList.addAll(m19116t());
            m19114r();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        m19113q();
    }

    /* renamed from: k */
    private void m19108k(Map<C9284d<?>, C8030b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C9284d dVar = (C9284d) next.getKey();
            C8030b bVar = (C8030b) next.getValue();
            if (dVar.mo43568k() || (dVar.mo43569l() && z)) {
                bVar.get();
            }
        }
        this.f13655e.mo43605e();
    }

    /* renamed from: m */
    private static <T> List<T> m19109m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m19110n(C9284d dVar) {
        return dVar.mo43565f().mo39762a(new C9280a0(dVar, this));
    }

    /* renamed from: q */
    private void m19113q() {
        Boolean bool = this.f13656f.get();
        if (bool != null) {
            m19108k(this.f13651a, bool.booleanValue());
        }
    }

    /* renamed from: r */
    private void m19114r() {
        for (C9284d next : this.f13651a.keySet()) {
            Iterator<C9307q> it = next.mo43564e().iterator();
            while (true) {
                if (it.hasNext()) {
                    C9307q next2 = it.next();
                    if (next2.mo43601g() && !this.f13653c.containsKey(next2.mo43596c())) {
                        this.f13653c.put(next2.mo43596c(), C9311u.m19159b(Collections.emptySet()));
                    } else if (this.f13652b.containsKey(next2.mo43596c())) {
                        continue;
                    } else if (next2.mo43600f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo43596c()}));
                    } else if (!next2.mo43601g()) {
                        this.f13652b.put(next2.mo43596c(), C9315y.m19168e());
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private List<Runnable> m19115s(List<C9284d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C9284d next : list) {
            if (next.mo43570m()) {
                C8030b bVar = this.f13651a.get(next);
                for (Class cls : next.mo43566g()) {
                    if (!this.f13652b.containsKey(cls)) {
                        this.f13652b.put(cls, bVar);
                    } else {
                        arrayList.add(new C9297l((C9315y) this.f13652b.get(cls), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private List<Runnable> m19116t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f13651a.entrySet()) {
            C9284d dVar = (C9284d) next.getKey();
            if (!dVar.mo43570m()) {
                C8030b bVar = (C8030b) next.getValue();
                for (Class cls : dVar.mo43566g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f13653c.containsKey(entry.getKey())) {
                this.f13653c.put((Class) entry.getKey(), C9311u.m19159b((Collection) entry.getValue()));
            } else {
                C9311u uVar = this.f13653c.get(entry.getKey());
                for (C8030b mVar : (Set) entry.getValue()) {
                    arrayList.add(new C9298m(uVar, mVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo43559a(Class cls) {
        return super.mo43559a(cls);
    }

    /* renamed from: b */
    public synchronized <T> C8030b<T> mo43561b(Class<T> cls) {
        C9316z.m19177c(cls, "Null interface requested.");
        return this.f13652b.get(cls);
    }

    /* renamed from: c */
    public synchronized <T> C8030b<Set<T>> mo43562c(Class<T> cls) {
        C9311u uVar = this.f13653c.get(cls);
        if (uVar != null) {
            return uVar;
        }
        return f13650g;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo43560d(Class cls) {
        return super.mo43560d(cls);
    }

    /* renamed from: e */
    public <T> C8028a<T> mo43563e(Class<T> cls) {
        C8030b<T> b = mo43561b(cls);
        if (b == null) {
            return C9315y.m19168e();
        }
        if (b instanceof C9315y) {
            return (C9315y) b;
        }
        return C9315y.m19172i(b);
    }

    /* renamed from: l */
    public void mo43582l(boolean z) {
        HashMap hashMap;
        if (C0344a.m496a(this.f13656f, (Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f13651a);
            }
            m19108k(hashMap, z);
        }
    }

    private C9299n(Executor executor, Iterable<C8030b<C9294i>> iterable, Collection<C9284d<?>> collection) {
        this.f13651a = new HashMap();
        this.f13652b = new HashMap();
        this.f13653c = new HashMap();
        this.f13656f = new AtomicReference<>();
        C9309s sVar = new C9309s(executor);
        this.f13655e = sVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9284d.m19071p(sVar, C9309s.class, C9074d.class, C9073c.class));
        arrayList.add(C9284d.m19071p(this, C8584a.class, new Class[0]));
        for (C9284d next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f13654d = m19109m(iterable);
        m19107j(arrayList);
    }

    /* renamed from: q6.n$b */
    /* compiled from: ComponentRuntime */
    public static final class C9301b {

        /* renamed from: a */
        private final Executor f13657a;

        /* renamed from: b */
        private final List<C8030b<C9294i>> f13658b = new ArrayList();

        /* renamed from: c */
        private final List<C9284d<?>> f13659c = new ArrayList();

        C9301b(Executor executor) {
            this.f13657a = executor;
        }

        /* renamed from: b */
        public C9301b mo43583b(C9284d<?> dVar) {
            this.f13659c.add(dVar);
            return this;
        }

        /* renamed from: c */
        public C9301b mo43584c(C9294i iVar) {
            this.f13658b.add(new C9302o(iVar));
            return this;
        }

        /* renamed from: d */
        public C9301b mo43585d(Collection<C8030b<C9294i>> collection) {
            this.f13658b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C9299n mo43586e() {
            return new C9299n(this.f13657a, this.f13658b, this.f13659c);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ C9294i m19124f(C9294i iVar) {
            return iVar;
        }
    }
}
