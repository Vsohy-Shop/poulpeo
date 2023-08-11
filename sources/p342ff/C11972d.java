package p342ff;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p412pf.C13212a;
import p412pf.C13216e;
import p436tf.C13528f;

/* renamed from: ff.d */
/* compiled from: MapBuilder.kt */
public final class C11972d<K, V> implements Map<K, V>, Serializable, C13216e {

    /* renamed from: n */
    private static final C11973a f18686n = new C11973a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public K[] f18687b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public V[] f18688c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int[] f18689d;

    /* renamed from: e */
    private int[] f18690e;

    /* renamed from: f */
    private int f18691f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f18692g;

    /* renamed from: h */
    private int f18693h;

    /* renamed from: i */
    private int f18694i;

    /* renamed from: j */
    private C11980f<K> f18695j;

    /* renamed from: k */
    private C11981g<V> f18696k;

    /* renamed from: l */
    private C11979e<K, V> f18697l;

    /* renamed from: m */
    private boolean f18698m;

    /* renamed from: ff.d$a */
    /* compiled from: MapBuilder.kt */
    private static final class C11973a {
        private C11973a() {
        }

        public /* synthetic */ C11973a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final int m26002c(int i) {
            return Integer.highestOneBit(C13537l.m30877d(i, 1) * 3);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final int m26003d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    /* renamed from: ff.d$b */
    /* compiled from: MapBuilder.kt */
    public static final class C11974b<K, V> extends C11976d<K, V> implements Iterator<Map.Entry<K, V>>, C13212a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11974b(C11972d<K, V> dVar) {
            super(dVar);
            C12775o.m28639i(dVar, "map");
        }

        /* renamed from: i */
        public C11975c<K, V> next() {
            if (mo49356a() < mo49358e().f18692g) {
                int a = mo49356a();
                mo49360g(a + 1);
                mo49361h(a);
                C11975c<K, V> cVar = new C11975c<>(mo49358e(), mo49357c());
                mo49359f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: j */
        public final void mo49347j(StringBuilder sb) {
            C12775o.m28639i(sb, "sb");
            if (mo49356a() < mo49358e().f18692g) {
                int a = mo49356a();
                mo49360g(a + 1);
                mo49361h(a);
                Object obj = mo49358e().f18687b[mo49357c()];
                if (C12775o.m28634d(obj, mo49358e())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] f = mo49358e().f18688c;
                C12775o.m28636f(f);
                Object obj2 = f[mo49357c()];
                if (C12775o.m28634d(obj2, mo49358e())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mo49359f();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: k */
        public final int mo49348k() {
            int i;
            if (mo49356a() < mo49358e().f18692g) {
                int a = mo49356a();
                mo49360g(a + 1);
                mo49361h(a);
                Object obj = mo49358e().f18687b[mo49357c()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] f = mo49358e().f18688c;
                C12775o.m28636f(f);
                Object obj2 = f[mo49357c()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                mo49359f();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: ff.d$c */
    /* compiled from: MapBuilder.kt */
    public static final class C11975c<K, V> implements Map.Entry<K, V>, C13216e.C13217a {

        /* renamed from: b */
        private final C11972d<K, V> f18699b;

        /* renamed from: c */
        private final int f18700c;

        public C11975c(C11972d<K, V> dVar, int i) {
            C12775o.m28639i(dVar, "map");
            this.f18699b = dVar;
            this.f18700c = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!C12775o.m28634d(entry.getKey(), getKey()) || !C12775o.m28634d(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public K getKey() {
            return this.f18699b.f18687b[this.f18700c];
        }

        public V getValue() {
            V[] f = this.f18699b.f18688c;
            C12775o.m28636f(f);
            return f[this.f18700c];
        }

        public int hashCode() {
            int i;
            Object key = getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            Object value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            this.f18699b.mo49331k();
            V[] a = this.f18699b.m25975i();
            int i = this.f18700c;
            V v2 = a[i];
            a[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: ff.d$d */
    /* compiled from: MapBuilder.kt */
    public static class C11976d<K, V> {

        /* renamed from: b */
        private final C11972d<K, V> f18701b;

        /* renamed from: c */
        private int f18702c;

        /* renamed from: d */
        private int f18703d = -1;

        public C11976d(C11972d<K, V> dVar) {
            C12775o.m28639i(dVar, "map");
            this.f18701b = dVar;
            mo49359f();
        }

        /* renamed from: a */
        public final int mo49356a() {
            return this.f18702c;
        }

        /* renamed from: c */
        public final int mo49357c() {
            return this.f18703d;
        }

        /* renamed from: e */
        public final C11972d<K, V> mo49358e() {
            return this.f18701b;
        }

        /* renamed from: f */
        public final void mo49359f() {
            while (this.f18702c < this.f18701b.f18692g) {
                int[] e = this.f18701b.f18689d;
                int i = this.f18702c;
                if (e[i] < 0) {
                    this.f18702c = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        public final void mo49360g(int i) {
            this.f18702c = i;
        }

        /* renamed from: h */
        public final void mo49361h(int i) {
            this.f18703d = i;
        }

        public final boolean hasNext() {
            if (this.f18702c < this.f18701b.f18692g) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z;
            if (this.f18703d != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f18701b.mo49331k();
                this.f18701b.m25968K(this.f18703d);
                this.f18703d = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: ff.d$e */
    /* compiled from: MapBuilder.kt */
    public static final class C11977e<K, V> extends C11976d<K, V> implements Iterator<K>, C13212a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11977e(C11972d<K, V> dVar) {
            super(dVar);
            C12775o.m28639i(dVar, "map");
        }

        public K next() {
            if (mo49356a() < mo49358e().f18692g) {
                int a = mo49356a();
                mo49360g(a + 1);
                mo49361h(a);
                K k = mo49358e().f18687b[mo49357c()];
                mo49359f();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: ff.d$f */
    /* compiled from: MapBuilder.kt */
    public static final class C11978f<K, V> extends C11976d<K, V> implements Iterator<V>, C13212a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11978f(C11972d<K, V> dVar) {
            super(dVar);
            C12775o.m28639i(dVar, "map");
        }

        public V next() {
            if (mo49356a() < mo49358e().f18692g) {
                int a = mo49356a();
                mo49360g(a + 1);
                mo49361h(a);
                V[] f = mo49358e().f18688c;
                C12775o.m28636f(f);
                V v = f[mo49357c()];
                mo49359f();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    private C11972d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f18687b = kArr;
        this.f18688c = vArr;
        this.f18689d = iArr;
        this.f18690e = iArr2;
        this.f18691f = i;
        this.f18692g = i2;
        this.f18693h = f18686n.m26003d(m25983w());
    }

    /* renamed from: A */
    private final int m25962A(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * -1640531527) >>> this.f18693h;
    }

    /* renamed from: D */
    private final boolean m25963D(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m25979q(collection.size());
        for (Map.Entry E : collection) {
            if (m25964E(E)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: E */
    private final boolean m25964E(Map.Entry<? extends K, ? extends V> entry) {
        int h = mo49327h(entry.getKey());
        Object[] i = m25975i();
        if (h >= 0) {
            i[h] = entry.getValue();
            return true;
        }
        int i2 = (-h) - 1;
        if (C12775o.m28634d(entry.getValue(), i[i2])) {
            return false;
        }
        i[i2] = entry.getValue();
        return true;
    }

    /* renamed from: F */
    private final boolean m25965F(int i) {
        int A = m25962A(this.f18687b[i]);
        int i2 = this.f18691f;
        while (true) {
            int[] iArr = this.f18690e;
            if (iArr[A] == 0) {
                iArr[A] = i + 1;
                this.f18689d[i] = A;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = A - 1;
            if (A == 0) {
                A = m25983w() - 1;
            } else {
                A = i3;
            }
        }
    }

    /* renamed from: G */
    private final void m25966G(int i) {
        if (this.f18692g > size()) {
            m25976l();
        }
        int i2 = 0;
        if (i != m25983w()) {
            this.f18690e = new int[i];
            this.f18693h = f18686n.m26003d(i);
        } else {
            C12708o.m28351r(this.f18690e, 0, 0, m25983w());
        }
        while (i2 < this.f18692g) {
            int i3 = i2 + 1;
            if (m25965F(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: I */
    private final void m25967I(int i) {
        int i2 = C13537l.m30882i(this.f18691f * 2, m25983w() / 2);
        int i3 = 0;
        int i4 = i;
        do {
            int i5 = i - 1;
            if (i == 0) {
                i = m25983w() - 1;
            } else {
                i = i5;
            }
            i3++;
            if (i3 > this.f18691f) {
                this.f18690e[i4] = 0;
                return;
            }
            int[] iArr = this.f18690e;
            int i6 = iArr[i];
            if (i6 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i4] = -1;
            } else {
                int i7 = i6 - 1;
                if (((m25962A(this.f18687b[i7]) - i) & (m25983w() - 1)) >= i3) {
                    this.f18690e[i4] = i6;
                    this.f18689d[i7] = i4;
                }
                i2--;
            }
            i4 = i;
            i3 = 0;
            i2--;
        } while (i2 >= 0);
        this.f18690e[i4] = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m25968K(int i) {
        C11971c.m25957f(this.f18687b, i);
        m25967I(this.f18689d[i]);
        this.f18689d[i] = -1;
        this.f18694i = size() - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final V[] m25975i() {
        V[] vArr = this.f18688c;
        if (vArr != null) {
            return vArr;
        }
        V[] d = C11971c.m25955d(m25982u());
        this.f18688c = d;
        return d;
    }

    /* renamed from: l */
    private final void m25976l() {
        int i;
        V[] vArr = this.f18688c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f18692g;
            if (i2 >= i) {
                break;
            }
            if (this.f18689d[i2] >= 0) {
                K[] kArr = this.f18687b;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C11971c.m25958g(this.f18687b, i3, i);
        if (vArr != null) {
            C11971c.m25958g(vArr, i3, this.f18692g);
        }
        this.f18692g = i3;
    }

    /* renamed from: o */
    private final boolean m25977o(Map<?, ?> map) {
        if (size() != map.size() || !mo49333m(map.entrySet())) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private final void m25978p(int i) {
        V[] vArr;
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > m25982u()) {
            int u = (m25982u() * 3) / 2;
            if (i <= u) {
                i = u;
            }
            this.f18687b = C11971c.m25956e(this.f18687b, i);
            V[] vArr2 = this.f18688c;
            if (vArr2 != null) {
                vArr = C11971c.m25956e(vArr2, i);
            } else {
                vArr = null;
            }
            this.f18688c = vArr;
            int[] copyOf = Arrays.copyOf(this.f18689d, i);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.f18689d = copyOf;
            int a = f18686n.m26002c(i);
            if (a > m25983w()) {
                m25966G(a);
            }
        } else if ((this.f18692g + i) - size() > m25982u()) {
            m25966G(m25983w());
        }
    }

    /* renamed from: q */
    private final void m25979q(int i) {
        m25978p(this.f18692g + i);
    }

    /* renamed from: s */
    private final int m25980s(K k) {
        int A = m25962A(k);
        int i = this.f18691f;
        while (true) {
            int i2 = this.f18690e[A];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C12775o.m28634d(this.f18687b[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = A - 1;
            if (A == 0) {
                A = m25983w() - 1;
            } else {
                A = i4;
            }
        }
    }

    /* renamed from: t */
    private final int m25981t(V v) {
        int i = this.f18692g;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f18689d[i] >= 0) {
                V[] vArr = this.f18688c;
                C12775o.m28636f(vArr);
                if (C12775o.m28634d(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: u */
    private final int m25982u() {
        return this.f18687b.length;
    }

    /* renamed from: w */
    private final int m25983w() {
        return this.f18690e.length;
    }

    private final Object writeReplace() {
        if (this.f18698m) {
            return new C11984i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: B */
    public final boolean mo49315B() {
        return this.f18698m;
    }

    /* renamed from: C */
    public final C11977e<K, V> mo49316C() {
        return new C11977e<>(this);
    }

    /* renamed from: H */
    public final boolean mo49317H(Map.Entry<? extends K, ? extends V> entry) {
        C12775o.m28639i(entry, "entry");
        mo49331k();
        int s = m25980s(entry.getKey());
        if (s < 0) {
            return false;
        }
        V[] vArr = this.f18688c;
        C12775o.m28636f(vArr);
        if (!C12775o.m28634d(vArr[s], entry.getValue())) {
            return false;
        }
        m25968K(s);
        return true;
    }

    /* renamed from: J */
    public final int mo49318J(K k) {
        mo49331k();
        int s = m25980s(k);
        if (s < 0) {
            return -1;
        }
        m25968K(s);
        return s;
    }

    /* renamed from: L */
    public final boolean mo49319L(V v) {
        mo49331k();
        int t = m25981t(v);
        if (t < 0) {
            return false;
        }
        m25968K(t);
        return true;
    }

    /* renamed from: M */
    public final C11978f<K, V> mo49320M() {
        return new C11978f<>(this);
    }

    public void clear() {
        mo49331k();
        C12703l0 r = new C13528f(0, this.f18692g - 1).iterator();
        while (r.hasNext()) {
            int nextInt = r.nextInt();
            int[] iArr = this.f18689d;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.f18690e[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C11971c.m25958g(this.f18687b, 0, this.f18692g);
        V[] vArr = this.f18688c;
        if (vArr != null) {
            C11971c.m25958g(vArr, 0, this.f18692g);
        }
        this.f18694i = 0;
        this.f18692g = 0;
    }

    public boolean containsKey(Object obj) {
        if (m25980s(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (m25981t(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo49341v();
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof Map) && m25977o((Map) obj))) {
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int s = m25980s(obj);
        if (s < 0) {
            return null;
        }
        V[] vArr = this.f18688c;
        C12775o.m28636f(vArr);
        return vArr[s];
    }

    /* renamed from: h */
    public final int mo49327h(K k) {
        mo49331k();
        while (true) {
            int A = m25962A(k);
            int i = C13537l.m30882i(this.f18691f * 2, m25983w() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.f18690e[A];
                if (i3 <= 0) {
                    if (this.f18692g >= m25982u()) {
                        m25979q(1);
                    } else {
                        int i4 = this.f18692g;
                        int i5 = i4 + 1;
                        this.f18692g = i5;
                        this.f18687b[i4] = k;
                        this.f18689d[i4] = A;
                        this.f18690e[A] = i5;
                        this.f18694i = size() + 1;
                        if (i2 > this.f18691f) {
                            this.f18691f = i2;
                        }
                        return i4;
                    }
                } else if (C12775o.m28634d(this.f18687b[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        m25966G(m25983w() * 2);
                        break;
                    }
                    int i6 = A - 1;
                    if (A == 0) {
                        A = m25983w() - 1;
                    } else {
                        A = i6;
                    }
                }
            }
        }
    }

    public int hashCode() {
        C11974b r = mo49337r();
        int i = 0;
        while (r.hasNext()) {
            i += r.mo49348k();
        }
        return i;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final Map<K, V> mo49330j() {
        mo49331k();
        this.f18698m = true;
        return this;
    }

    /* renamed from: k */
    public final void mo49331k() {
        if (this.f18698m) {
            throw new UnsupportedOperationException();
        }
    }

    public final /* bridge */ Set<K> keySet() {
        return mo49343x();
    }

    /* renamed from: m */
    public final boolean mo49333m(Collection<?> collection) {
        C12775o.m28639i(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo49334n((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean mo49334n(Map.Entry<? extends K, ? extends V> entry) {
        C12775o.m28639i(entry, "entry");
        int s = m25980s(entry.getKey());
        if (s < 0) {
            return false;
        }
        V[] vArr = this.f18688c;
        C12775o.m28636f(vArr);
        return C12775o.m28634d(vArr[s], entry.getValue());
    }

    public V put(K k, V v) {
        mo49331k();
        int h = mo49327h(k);
        V[] i = m25975i();
        if (h < 0) {
            int i2 = (-h) - 1;
            V v2 = i[i2];
            i[i2] = v;
            return v2;
        }
        i[h] = v;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C12775o.m28639i(map, TypedValues.TransitionType.S_FROM);
        mo49331k();
        m25963D(map.entrySet());
    }

    /* renamed from: r */
    public final C11974b<K, V> mo49337r() {
        return new C11974b<>(this);
    }

    public V remove(Object obj) {
        int J = mo49318J(obj);
        if (J < 0) {
            return null;
        }
        V[] vArr = this.f18688c;
        C12775o.m28636f(vArr);
        V v = vArr[J];
        C11971c.m25957f(vArr, J);
        return v;
    }

    public final /* bridge */ int size() {
        return mo49344y();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C11974b r = mo49337r();
        int i = 0;
        while (r.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            r.mo49347j(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: v */
    public Set<Map.Entry<K, V>> mo49341v() {
        C11979e<K, V> eVar = this.f18697l;
        if (eVar != null) {
            return eVar;
        }
        C11979e<K, V> eVar2 = new C11979e<>(this);
        this.f18697l = eVar2;
        return eVar2;
    }

    public final /* bridge */ Collection<V> values() {
        return mo49345z();
    }

    /* renamed from: x */
    public Set<K> mo49343x() {
        C11980f<K> fVar = this.f18695j;
        if (fVar != null) {
            return fVar;
        }
        C11980f<K> fVar2 = new C11980f<>(this);
        this.f18695j = fVar2;
        return fVar2;
    }

    /* renamed from: y */
    public int mo49344y() {
        return this.f18694i;
    }

    /* renamed from: z */
    public Collection<V> mo49345z() {
        C11981g<V> gVar = this.f18696k;
        if (gVar != null) {
            return gVar;
        }
        C11981g<V> gVar2 = new C11981g<>(this);
        this.f18696k = gVar2;
        return gVar2;
    }

    public C11972d() {
        this(8);
    }

    public C11972d(int i) {
        this(C11971c.m25955d(i), (V[]) null, new int[i], new int[f18686n.m26002c(i)], 2, 0);
    }
}
