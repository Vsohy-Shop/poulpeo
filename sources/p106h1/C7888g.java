package p106h1;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p106h1.C7898l;

/* renamed from: h1.g */
/* compiled from: GroupedLinkedMap */
class C7888g<K extends C7898l, V> {

    /* renamed from: a */
    private final C7889a<K, V> f11016a = new C7889a<>();

    /* renamed from: b */
    private final Map<K, C7889a<K, V>> f11017b = new HashMap();

    /* renamed from: h1.g$a */
    /* compiled from: GroupedLinkedMap */
    private static class C7889a<K, V> {

        /* renamed from: a */
        final K f11018a;

        /* renamed from: b */
        private List<V> f11019b;

        /* renamed from: c */
        C7889a<K, V> f11020c;

        /* renamed from: d */
        C7889a<K, V> f11021d;

        C7889a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo41610a(V v) {
            if (this.f11019b == null) {
                this.f11019b = new ArrayList();
            }
            this.f11019b.add(v);
        }

        @Nullable
        /* renamed from: b */
        public V mo41611b() {
            int c = mo41612c();
            if (c > 0) {
                return this.f11019b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo41612c() {
            List<V> list = this.f11019b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C7889a(K k) {
            this.f11021d = this;
            this.f11020c = this;
            this.f11018a = k;
        }
    }

    C7888g() {
    }

    /* renamed from: b */
    private void m15442b(C7889a<K, V> aVar) {
        m15444e(aVar);
        C7889a<K, V> aVar2 = this.f11016a;
        aVar.f11021d = aVar2;
        aVar.f11020c = aVar2.f11020c;
        m15445g(aVar);
    }

    /* renamed from: c */
    private void m15443c(C7889a<K, V> aVar) {
        m15444e(aVar);
        C7889a<K, V> aVar2 = this.f11016a;
        aVar.f11021d = aVar2.f11021d;
        aVar.f11020c = aVar2;
        m15445g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m15444e(C7889a<K, V> aVar) {
        C7889a<K, V> aVar2 = aVar.f11021d;
        aVar2.f11020c = aVar.f11020c;
        aVar.f11020c.f11021d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m15445g(C7889a<K, V> aVar) {
        aVar.f11020c.f11021d = aVar;
        aVar.f11021d.f11020c = aVar;
    }

    @Nullable
    /* renamed from: a */
    public V mo41606a(K k) {
        C7889a aVar = this.f11017b.get(k);
        if (aVar == null) {
            aVar = new C7889a(k);
            this.f11017b.put(k, aVar);
        } else {
            k.mo41615a();
        }
        m15442b(aVar);
        return aVar.mo41611b();
    }

    /* renamed from: d */
    public void mo41607d(K k, V v) {
        C7889a aVar = this.f11017b.get(k);
        if (aVar == null) {
            aVar = new C7889a(k);
            m15443c(aVar);
            this.f11017b.put(k, aVar);
        } else {
            k.mo41615a();
        }
        aVar.mo41610a(v);
    }

    @Nullable
    /* renamed from: f */
    public V mo41608f() {
        for (C7889a<K, V> aVar = this.f11016a.f11021d; !aVar.equals(this.f11016a); aVar = aVar.f11021d) {
            V b = aVar.mo41611b();
            if (b != null) {
                return b;
            }
            m15444e(aVar);
            this.f11017b.remove(aVar.f11018a);
            ((C7898l) aVar.f11018a).mo41615a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C7889a<K, V> aVar = this.f11016a.f11020c;
        boolean z = false;
        while (!aVar.equals(this.f11016a)) {
            sb.append('{');
            sb.append(aVar.f11018a);
            sb.append(':');
            sb.append(aVar.mo41612c());
            sb.append("}, ");
            aVar = aVar.f11020c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
