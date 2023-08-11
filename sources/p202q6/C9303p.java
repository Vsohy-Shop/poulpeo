package p202q6;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: q6.p */
/* compiled from: CycleDetector */
class C9303p {

    /* renamed from: q6.p$b */
    /* compiled from: CycleDetector */
    private static class C9305b {

        /* renamed from: a */
        private final C9284d<?> f13661a;

        /* renamed from: b */
        private final Set<C9305b> f13662b = new HashSet();

        /* renamed from: c */
        private final Set<C9305b> f13663c = new HashSet();

        C9305b(C9284d<?> dVar) {
            this.f13661a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43587a(C9305b bVar) {
            this.f13662b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo43588b(C9305b bVar) {
            this.f13663c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C9284d<?> mo43589c() {
            return this.f13661a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<C9305b> mo43590d() {
            return this.f13662b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo43591e() {
            return this.f13662b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo43592f() {
            return this.f13663c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo43593g(C9305b bVar) {
            this.f13663c.remove(bVar);
        }
    }

    /* renamed from: q6.p$c */
    /* compiled from: CycleDetector */
    private static class C9306c {

        /* renamed from: a */
        private final Class<?> f13664a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f13665b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C9306c)) {
                return false;
            }
            C9306c cVar = (C9306c) obj;
            if (!cVar.f13664a.equals(this.f13664a) || cVar.f13665b != this.f13665b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f13664a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f13665b).hashCode();
        }

        private C9306c(Class<?> cls, boolean z) {
            this.f13664a = cls;
            this.f13665b = z;
        }
    }

    /* renamed from: a */
    static void m19129a(List<C9284d<?>> list) {
        Set<C9305b> c = m19131c(list);
        Set<C9305b> b = m19130b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C9305b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C9305b next2 : next.mo43590d()) {
                next2.mo43593g(next);
                if (next2.mo43592f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C9305b next3 : c) {
                if (!next3.mo43592f() && !next3.mo43591e()) {
                    arrayList.add(next3.mo43589c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C9305b> m19130b(Set<C9305b> set) {
        HashSet hashSet = new HashSet();
        for (C9305b next : set) {
            if (next.mo43592f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C9305b> m19131c(List<C9284d<?>> list) {
        Set<C9305b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C9284d next : list) {
            C9305b bVar = new C9305b(next);
            Iterator it = next.mo43566g().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C9306c cVar = new C9306c(cls, !next.mo43570m());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f13665b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C9305b> it2 : hashMap.values()) {
            for (C9305b bVar2 : it2) {
                for (C9307q next2 : bVar2.mo43589c().mo43564e()) {
                    if (next2.mo43598e() && (set = (Set) hashMap.get(new C9306c(next2.mo43596c(), next2.mo43601g()))) != null) {
                        for (C9305b bVar3 : set) {
                            bVar2.mo43587a(bVar3);
                            bVar3.mo43588b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
