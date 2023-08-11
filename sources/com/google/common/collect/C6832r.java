package com.google.common.collect;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.common.collect.C6832r.C6845i;
import com.google.common.collect.C6832r.C6850n;
import com.google.j2objc.annotations.Weak;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p111h6.C7995d;
import p111h6.C8012n;
import p142k6.C8582a;

/* renamed from: com.google.common.collect.r */
/* compiled from: MapMakerInternalMap */
class C6832r<K, V, E extends C6845i<K, V, E>, S extends C6850n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: k */
    static final C6836b0<Object, Object, C6841e> f8954k = new C6833a();
    private static final long serialVersionUID = 5;

    /* renamed from: b */
    final transient int f8955b;

    /* renamed from: c */
    final transient int f8956c;

    /* renamed from: d */
    final transient C6850n<K, V, E, S>[] f8957d;

    /* renamed from: e */
    final int f8958e;

    /* renamed from: f */
    final C7995d<Object> f8959f;

    /* renamed from: g */
    final transient C6846j<K, V, E, S> f8960g;

    /* renamed from: h */
    transient Set<K> f8961h;

    /* renamed from: i */
    transient Collection<V> f8962i;

    /* renamed from: j */
    transient Set<Map.Entry<K, V>> f8963j;

    /* renamed from: com.google.common.collect.r$a0 */
    /* compiled from: MapMakerInternalMap */
    interface C6834a0<K, V, E extends C6845i<K, V, E>> extends C6845i<K, V, E> {
        /* renamed from: a */
        C6836b0<K, V, E> mo39571a();
    }

    /* renamed from: com.google.common.collect.r$b */
    /* compiled from: MapMakerInternalMap */
    static abstract class C6835b<K, V> extends C6813g<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: b */
        final C6852p f8964b;

        /* renamed from: c */
        final C6852p f8965c;

        /* renamed from: d */
        final C7995d<Object> f8966d;

        /* renamed from: e */
        final C7995d<Object> f8967e;

        /* renamed from: f */
        final int f8968f;

        /* renamed from: g */
        transient ConcurrentMap<K, V> f8969g;

        C6835b(C6852p pVar, C6852p pVar2, C7995d<Object> dVar, C7995d<Object> dVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.f8964b = pVar;
            this.f8965c = pVar2;
            this.f8966d = dVar;
            this.f8967e = dVar2;
            this.f8968f = i;
            this.f8969g = concurrentMap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public ConcurrentMap<K, V> mo39444b() {
            return this.f8969g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo39572e(ObjectInputStream objectInputStream) {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.f8969g.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C6831q mo39573f(ObjectInputStream objectInputStream) {
            return new C6831q().mo39533g(objectInputStream.readInt()).mo39536j(this.f8964b).mo39537k(this.f8965c).mo39534h(this.f8966d).mo39527a(this.f8968f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo39574g(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeInt(this.f8969g.size());
            for (Map.Entry next : this.f8969g.entrySet()) {
                objectOutputStream.writeObject(next.getKey());
                objectOutputStream.writeObject(next.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }
    }

    /* renamed from: com.google.common.collect.r$b0 */
    /* compiled from: MapMakerInternalMap */
    interface C6836b0<K, V, E extends C6845i<K, V, E>> {
        /* renamed from: a */
        E mo39565a();

        /* renamed from: b */
        C6836b0<K, V, E> mo39566b(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        V get();
    }

    /* renamed from: com.google.common.collect.r$c */
    /* compiled from: MapMakerInternalMap */
    static abstract class C6837c<K, V, E extends C6845i<K, V, E>> implements C6845i<K, V, E> {

        /* renamed from: a */
        final K f8970a;

        /* renamed from: b */
        final int f8971b;

        /* renamed from: c */
        final E f8972c;

        C6837c(K k, int i, E e) {
            this.f8970a = k;
            this.f8971b = i;
            this.f8972c = e;
        }

        /* renamed from: b */
        public int mo39575b() {
            return this.f8971b;
        }

        public K getKey() {
            return this.f8970a;
        }

        public E getNext() {
            return this.f8972c;
        }
    }

    /* renamed from: com.google.common.collect.r$c0 */
    /* compiled from: MapMakerInternalMap */
    static final class C6838c0<K, V, E extends C6845i<K, V, E>> extends WeakReference<V> implements C6836b0<K, V, E> {
        @Weak

        /* renamed from: a */
        final E f8973a;

        C6838c0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f8973a = e;
        }

        /* renamed from: a */
        public E mo39565a() {
            return this.f8973a;
        }

        /* renamed from: b */
        public C6836b0<K, V, E> mo39566b(ReferenceQueue<V> referenceQueue, E e) {
            return new C6838c0(referenceQueue, get(), e);
        }
    }

    /* renamed from: com.google.common.collect.r$d */
    /* compiled from: MapMakerInternalMap */
    static abstract class C6839d<K, V, E extends C6845i<K, V, E>> extends WeakReference<K> implements C6845i<K, V, E> {

        /* renamed from: a */
        final int f8974a;

        /* renamed from: b */
        final E f8975b;

        C6839d(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f8974a = i;
            this.f8975b = e;
        }

        /* renamed from: b */
        public int mo39575b() {
            return this.f8974a;
        }

        public K getKey() {
            return get();
        }

        public E getNext() {
            return this.f8975b;
        }
    }

    /* renamed from: com.google.common.collect.r$d0 */
    /* compiled from: MapMakerInternalMap */
    final class C6840d0 extends C6804b<K, V> {

        /* renamed from: b */
        final K f8976b;

        /* renamed from: c */
        V f8977c;

        C6840d0(K k, V v) {
            this.f8976b = k;
            this.f8977c = v;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f8976b.equals(entry.getKey()) || !this.f8977c.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f8976b;
        }

        public V getValue() {
            return this.f8977c;
        }

        public int hashCode() {
            return this.f8976b.hashCode() ^ this.f8977c.hashCode();
        }

        public V setValue(V v) {
            V put = C6832r.this.put(this.f8976b, v);
            this.f8977c = v;
            return put;
        }
    }

    /* renamed from: com.google.common.collect.r$e */
    /* compiled from: MapMakerInternalMap */
    static final class C6841e implements C6845i<Object, Object, C6841e> {
        private C6841e() {
            throw new AssertionError();
        }

        /* renamed from: b */
        public int mo39575b() {
            throw new AssertionError();
        }

        /* renamed from: c */
        public C6841e getNext() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.collect.r$f */
    /* compiled from: MapMakerInternalMap */
    final class C6842f extends C6832r<K, V, E, S>.h<Map.Entry<K, V>> {
        C6842f(C6832r rVar) {
            super();
        }

        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return mo39593d();
        }
    }

    /* renamed from: com.google.common.collect.r$g */
    /* compiled from: MapMakerInternalMap */
    final class C6843g extends C6849m<Map.Entry<K, V>> {
        C6843g() {
            super((C6833a) null);
        }

        public void clear() {
            C6832r.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.google.common.collect.r r2 = com.google.common.collect.C6832r.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0028
                com.google.common.collect.r r2 = com.google.common.collect.C6832r.this
                h6.d r2 = r2.mo39554n()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.mo41828d(r4, r0)
                if (r4 == 0) goto L_0x0028
                r1 = 1
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C6832r.C6843g.contains(java.lang.Object):boolean");
        }

        public boolean isEmpty() {
            return C6832r.this.isEmpty();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6842f(C6832r.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.google.common.collect.r r2 = com.google.common.collect.C6832r.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C6832r.C6843g.remove(java.lang.Object):boolean");
        }

        public int size() {
            return C6832r.this.size();
        }
    }

    /* renamed from: com.google.common.collect.r$h */
    /* compiled from: MapMakerInternalMap */
    abstract class C6844h<T> implements Iterator<T> {

        /* renamed from: b */
        int f8980b;

        /* renamed from: c */
        int f8981c = -1;

        /* renamed from: d */
        C6850n<K, V, E, S> f8982d;

        /* renamed from: e */
        AtomicReferenceArray<E> f8983e;

        /* renamed from: f */
        E f8984f;

        /* renamed from: g */
        C6832r<K, V, E, S>.d0 f8985g;

        /* renamed from: h */
        C6832r<K, V, E, S>.d0 f8986h;

        C6844h() {
            this.f8980b = C6832r.this.f8957d.length - 1;
            mo39591a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo39591a() {
            this.f8985g = null;
            if (!mo39594e() && !mo39595f()) {
                while (true) {
                    int i = this.f8980b;
                    if (i >= 0) {
                        C6850n<K, V, E, S>[] nVarArr = C6832r.this.f8957d;
                        this.f8980b = i - 1;
                        C6850n<K, V, E, S> nVar = nVarArr[i];
                        this.f8982d = nVar;
                        if (nVar.f8990c != 0) {
                            AtomicReferenceArray<E> atomicReferenceArray = this.f8982d.f8993f;
                            this.f8983e = atomicReferenceArray;
                            this.f8981c = atomicReferenceArray.length() - 1;
                            if (mo39595f()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo39592c(E e) {
            try {
                Object key = e.getKey();
                Object e2 = C6832r.this.mo39544e(e);
                if (e2 != null) {
                    this.f8985g = new C6840d0(key, e2);
                    this.f8982d.mo39635r();
                    return true;
                }
                this.f8982d.mo39635r();
                return false;
            } catch (Throwable th) {
                this.f8982d.mo39635r();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6832r<K, V, E, S>.d0 mo39593d() {
            C6832r<K, V, E, S>.d0 d0Var = this.f8985g;
            if (d0Var != null) {
                this.f8986h = d0Var;
                mo39591a();
                return this.f8986h;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo39594e() {
            E e = this.f8984f;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f8984f = e.getNext();
                E e2 = this.f8984f;
                if (e2 == null) {
                    return false;
                }
                if (mo39592c(e2)) {
                    return true;
                }
                e = this.f8984f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo39595f() {
            while (true) {
                int i = this.f8981c;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f8983e;
                this.f8981c = i - 1;
                E e = (C6845i) atomicReferenceArray.get(i);
                this.f8984f = e;
                if (e != null && (mo39592c(e) || mo39594e())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            if (this.f8985g != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            boolean z;
            if (this.f8986h != null) {
                z = true;
            } else {
                z = false;
            }
            C6808d.m11618c(z);
            C6832r.this.remove(this.f8986h.getKey());
            this.f8986h = null;
        }
    }

    /* renamed from: com.google.common.collect.r$i */
    /* compiled from: MapMakerInternalMap */
    interface C6845i<K, V, E extends C6845i<K, V, E>> {
        /* renamed from: b */
        int mo39575b();

        K getKey();

        E getNext();

        V getValue();
    }

    /* renamed from: com.google.common.collect.r$j */
    /* compiled from: MapMakerInternalMap */
    interface C6846j<K, V, E extends C6845i<K, V, E>, S extends C6850n<K, V, E, S>> {
        /* renamed from: a */
        E mo39598a(S s, E e, E e2);

        /* renamed from: b */
        C6852p mo39599b();

        /* renamed from: c */
        C6852p mo39600c();

        /* renamed from: d */
        void mo39601d(S s, E e, V v);

        /* renamed from: e */
        S mo39602e(C6832r<K, V, E, S> rVar, int i, int i2);

        /* renamed from: f */
        E mo39603f(S s, K k, int i, E e);
    }

    /* renamed from: com.google.common.collect.r$k */
    /* compiled from: MapMakerInternalMap */
    final class C6847k extends C6832r<K, V, E, S>.h<K> {
        C6847k(C6832r rVar) {
            super();
        }

        public K next() {
            return mo39593d().getKey();
        }
    }

    /* renamed from: com.google.common.collect.r$l */
    /* compiled from: MapMakerInternalMap */
    final class C6848l extends C6849m<K> {
        C6848l() {
            super((C6833a) null);
        }

        public void clear() {
            C6832r.this.clear();
        }

        public boolean contains(Object obj) {
            return C6832r.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return C6832r.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new C6847k(C6832r.this);
        }

        public boolean remove(Object obj) {
            if (C6832r.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        public int size() {
            return C6832r.this.size();
        }
    }

    /* renamed from: com.google.common.collect.r$m */
    /* compiled from: MapMakerInternalMap */
    private static abstract class C6849m<E> extends AbstractSet<E> {
        private C6849m() {
        }

        public Object[] toArray() {
            return C6832r.m11703l(this).toArray();
        }

        /* synthetic */ C6849m(C6833a aVar) {
            this();
        }

        public <T> T[] toArray(T[] tArr) {
            return C6832r.m11703l(this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.r$o */
    /* compiled from: MapMakerInternalMap */
    private static final class C6851o<K, V> extends C6835b<K, V> {
        private static final long serialVersionUID = 3;

        C6851o(C6852p pVar, C6852p pVar2, C7995d<Object> dVar, C7995d<Object> dVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(pVar, pVar2, dVar, dVar2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f8969g = mo39573f(objectInputStream).mo39535i();
            mo39572e(objectInputStream);
        }

        private Object readResolve() {
            return this.f8969g;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            mo39574g(objectOutputStream);
        }
    }

    /* renamed from: com.google.common.collect.r$p */
    /* compiled from: MapMakerInternalMap */
    enum C6852p {
        STRONG {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C7995d<Object> mo39644b() {
                return C7995d.m15702c();
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C7995d<Object> mo39644b() {
                return C7995d.m15703f();
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C7995d<Object> mo39644b();
    }

    /* renamed from: com.google.common.collect.r$q */
    /* compiled from: MapMakerInternalMap */
    static final class C6855q<K, V> extends C6837c<K, V, C6855q<K, V>> {

        /* renamed from: d */
        private volatile V f8999d = null;

        /* renamed from: com.google.common.collect.r$q$a */
        /* compiled from: MapMakerInternalMap */
        static final class C6856a<K, V> implements C6846j<K, V, C6855q<K, V>, C6857r<K, V>> {

            /* renamed from: a */
            private static final C6856a<?, ?> f9000a = new C6856a<>();

            C6856a() {
            }

            /* renamed from: h */
            static <K, V> C6856a<K, V> m11783h() {
                return f9000a;
            }

            /* renamed from: b */
            public C6852p mo39599b() {
                return C6852p.STRONG;
            }

            /* renamed from: c */
            public C6852p mo39600c() {
                return C6852p.STRONG;
            }

            /* renamed from: g */
            public C6855q<K, V> mo39598a(C6857r<K, V> rVar, C6855q<K, V> qVar, C6855q<K, V> qVar2) {
                return qVar.mo39645c(qVar2);
            }

            /* renamed from: i */
            public C6855q<K, V> mo39603f(C6857r<K, V> rVar, K k, int i, C6855q<K, V> qVar) {
                return new C6855q<>(k, i, qVar);
            }

            /* renamed from: j */
            public C6857r<K, V> mo39602e(C6832r<K, V, C6855q<K, V>, C6857r<K, V>> rVar, int i, int i2) {
                return new C6857r<>(rVar, i, i2);
            }

            /* renamed from: k */
            public void mo39601d(C6857r<K, V> rVar, C6855q<K, V> qVar, V v) {
                qVar.mo39646d(v);
            }
        }

        C6855q(K k, int i, C6855q<K, V> qVar) {
            super(k, i, qVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6855q<K, V> mo39645c(C6855q<K, V> qVar) {
            C6855q<K, V> qVar2 = new C6855q<>(this.f8970a, this.f8971b, qVar);
            qVar2.f8999d = this.f8999d;
            return qVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo39646d(V v) {
            this.f8999d = v;
        }

        public V getValue() {
            return this.f8999d;
        }
    }

    /* renamed from: com.google.common.collect.r$s */
    /* compiled from: MapMakerInternalMap */
    static final class C6858s<K, V> extends C6837c<K, V, C6858s<K, V>> implements C6834a0<K, V, C6858s<K, V>> {

        /* renamed from: d */
        private volatile C6836b0<K, V, C6858s<K, V>> f9001d = C6832r.m11704m();

        /* renamed from: com.google.common.collect.r$s$a */
        /* compiled from: MapMakerInternalMap */
        static final class C6859a<K, V> implements C6846j<K, V, C6858s<K, V>, C6860t<K, V>> {

            /* renamed from: a */
            private static final C6859a<?, ?> f9002a = new C6859a<>();

            C6859a() {
            }

            /* renamed from: h */
            static <K, V> C6859a<K, V> m11799h() {
                return f9002a;
            }

            /* renamed from: b */
            public C6852p mo39599b() {
                return C6852p.STRONG;
            }

            /* renamed from: c */
            public C6852p mo39600c() {
                return C6852p.WEAK;
            }

            /* renamed from: g */
            public C6858s<K, V> mo39598a(C6860t<K, V> tVar, C6858s<K, V> sVar, C6858s<K, V> sVar2) {
                if (C6850n.m11745n(sVar)) {
                    return null;
                }
                return sVar.mo39652c(tVar.f9003i, sVar2);
            }

            /* renamed from: i */
            public C6858s<K, V> mo39603f(C6860t<K, V> tVar, K k, int i, C6858s<K, V> sVar) {
                return new C6858s<>(k, i, sVar);
            }

            /* renamed from: j */
            public C6860t<K, V> mo39602e(C6832r<K, V, C6858s<K, V>, C6860t<K, V>> rVar, int i, int i2) {
                return new C6860t<>(rVar, i, i2);
            }

            /* renamed from: k */
            public void mo39601d(C6860t<K, V> tVar, C6858s<K, V> sVar, V v) {
                sVar.mo39653d(v, tVar.f9003i);
            }
        }

        C6858s(K k, int i, C6858s<K, V> sVar) {
            super(k, i, sVar);
        }

        /* renamed from: a */
        public C6836b0<K, V, C6858s<K, V>> mo39571a() {
            return this.f9001d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6858s<K, V> mo39652c(ReferenceQueue<V> referenceQueue, C6858s<K, V> sVar) {
            C6858s<K, V> sVar2 = new C6858s<>(this.f8970a, this.f8971b, sVar);
            sVar2.f9001d = this.f9001d.mo39566b(referenceQueue, sVar2);
            return sVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo39653d(V v, ReferenceQueue<V> referenceQueue) {
            C6836b0<K, V, C6858s<K, V>> b0Var = this.f9001d;
            this.f9001d = new C6838c0(referenceQueue, v, this);
            b0Var.clear();
        }

        public V getValue() {
            return this.f9001d.get();
        }
    }

    /* renamed from: com.google.common.collect.r$u */
    /* compiled from: MapMakerInternalMap */
    final class C6861u extends C6832r<K, V, E, S>.h<V> {
        C6861u(C6832r rVar) {
            super();
        }

        public V next() {
            return mo39593d().getValue();
        }
    }

    /* renamed from: com.google.common.collect.r$v */
    /* compiled from: MapMakerInternalMap */
    final class C6862v extends AbstractCollection<V> {
        C6862v() {
        }

        public void clear() {
            C6832r.this.clear();
        }

        public boolean contains(Object obj) {
            return C6832r.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return C6832r.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new C6861u(C6832r.this);
        }

        public int size() {
            return C6832r.this.size();
        }

        public Object[] toArray() {
            return C6832r.m11703l(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C6832r.m11703l(this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.r$w */
    /* compiled from: MapMakerInternalMap */
    static final class C6863w<K, V> extends C6839d<K, V, C6863w<K, V>> {

        /* renamed from: c */
        private volatile V f9005c = null;

        /* renamed from: com.google.common.collect.r$w$a */
        /* compiled from: MapMakerInternalMap */
        static final class C6864a<K, V> implements C6846j<K, V, C6863w<K, V>, C6865x<K, V>> {

            /* renamed from: a */
            private static final C6864a<?, ?> f9006a = new C6864a<>();

            C6864a() {
            }

            /* renamed from: h */
            static <K, V> C6864a<K, V> m11817h() {
                return f9006a;
            }

            /* renamed from: b */
            public C6852p mo39599b() {
                return C6852p.WEAK;
            }

            /* renamed from: c */
            public C6852p mo39600c() {
                return C6852p.STRONG;
            }

            /* renamed from: g */
            public C6863w<K, V> mo39598a(C6865x<K, V> xVar, C6863w<K, V> wVar, C6863w<K, V> wVar2) {
                if (wVar.getKey() == null) {
                    return null;
                }
                return wVar.mo39667c(xVar.f9007i, wVar2);
            }

            /* renamed from: i */
            public C6863w<K, V> mo39603f(C6865x<K, V> xVar, K k, int i, C6863w<K, V> wVar) {
                return new C6863w<>(xVar.f9007i, k, i, wVar);
            }

            /* renamed from: j */
            public C6865x<K, V> mo39602e(C6832r<K, V, C6863w<K, V>, C6865x<K, V>> rVar, int i, int i2) {
                return new C6865x<>(rVar, i, i2);
            }

            /* renamed from: k */
            public void mo39601d(C6865x<K, V> xVar, C6863w<K, V> wVar, V v) {
                wVar.mo39668d(v);
            }
        }

        C6863w(ReferenceQueue<K> referenceQueue, K k, int i, C6863w<K, V> wVar) {
            super(referenceQueue, k, i, wVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6863w<K, V> mo39667c(ReferenceQueue<K> referenceQueue, C6863w<K, V> wVar) {
            C6863w<K, V> wVar2 = new C6863w<>(referenceQueue, getKey(), this.f8974a, wVar);
            wVar2.mo39668d(this.f9005c);
            return wVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo39668d(V v) {
            this.f9005c = v;
        }

        public V getValue() {
            return this.f9005c;
        }
    }

    /* renamed from: com.google.common.collect.r$y */
    /* compiled from: MapMakerInternalMap */
    static final class C6866y<K, V> extends C6839d<K, V, C6866y<K, V>> implements C6834a0<K, V, C6866y<K, V>> {

        /* renamed from: c */
        private volatile C6836b0<K, V, C6866y<K, V>> f9008c = C6832r.m11704m();

        /* renamed from: com.google.common.collect.r$y$a */
        /* compiled from: MapMakerInternalMap */
        static final class C6867a<K, V> implements C6846j<K, V, C6866y<K, V>, C6868z<K, V>> {

            /* renamed from: a */
            private static final C6867a<?, ?> f9009a = new C6867a<>();

            C6867a() {
            }

            /* renamed from: h */
            static <K, V> C6867a<K, V> m11836h() {
                return f9009a;
            }

            /* renamed from: b */
            public C6852p mo39599b() {
                return C6852p.WEAK;
            }

            /* renamed from: c */
            public C6852p mo39600c() {
                return C6852p.WEAK;
            }

            /* renamed from: g */
            public C6866y<K, V> mo39598a(C6868z<K, V> zVar, C6866y<K, V> yVar, C6866y<K, V> yVar2) {
                if (yVar.getKey() != null && !C6850n.m11745n(yVar)) {
                    return yVar.mo39674c(zVar.f9010i, zVar.f9011j, yVar2);
                }
                return null;
            }

            /* renamed from: i */
            public C6866y<K, V> mo39603f(C6868z<K, V> zVar, K k, int i, C6866y<K, V> yVar) {
                return new C6866y<>(zVar.f9010i, k, i, yVar);
            }

            /* renamed from: j */
            public C6868z<K, V> mo39602e(C6832r<K, V, C6866y<K, V>, C6868z<K, V>> rVar, int i, int i2) {
                return new C6868z<>(rVar, i, i2);
            }

            /* renamed from: k */
            public void mo39601d(C6868z<K, V> zVar, C6866y<K, V> yVar, V v) {
                yVar.mo39675d(v, zVar.f9011j);
            }
        }

        C6866y(ReferenceQueue<K> referenceQueue, K k, int i, C6866y<K, V> yVar) {
            super(referenceQueue, k, i, yVar);
        }

        /* renamed from: a */
        public C6836b0<K, V, C6866y<K, V>> mo39571a() {
            return this.f9008c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6866y<K, V> mo39674c(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C6866y<K, V> yVar) {
            C6866y<K, V> yVar2 = new C6866y<>(referenceQueue, getKey(), this.f8974a, yVar);
            yVar2.f9008c = this.f9008c.mo39566b(referenceQueue2, yVar2);
            return yVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo39675d(V v, ReferenceQueue<V> referenceQueue) {
            C6836b0<K, V, C6866y<K, V>> b0Var = this.f9008c;
            this.f9008c = new C6838c0(referenceQueue, v, this);
            b0Var.clear();
        }

        public V getValue() {
            return this.f9008c.get();
        }
    }

    private C6832r(C6831q qVar, C6846j<K, V, E, S> jVar) {
        this.f8958e = Math.min(qVar.mo39528b(), 65536);
        this.f8959f = qVar.mo39530d();
        this.f8960g = jVar;
        int min = Math.min(qVar.mo39529c(), BasicMeasure.EXACTLY);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f8958e) {
            i3++;
            i4 <<= 1;
        }
        this.f8956c = 32 - i3;
        this.f8955b = i4 - 1;
        this.f8957d = mo39547g(i4);
        int i5 = min / i4;
        while (i2 < (i4 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            C6850n<K, V, E, S>[] nVarArr = this.f8957d;
            if (i < nVarArr.length) {
                nVarArr[i] = mo39540c(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    static <K, V> C6832r<K, V, ? extends C6845i<K, V, ?>, ?> m11701b(C6831q qVar) {
        C6852p e = qVar.mo39531e();
        C6852p pVar = C6852p.STRONG;
        if (e == pVar && qVar.mo39532f() == pVar) {
            return new C6832r<>(qVar, C6855q.C6856a.m11783h());
        }
        if (qVar.mo39531e() == pVar && qVar.mo39532f() == C6852p.WEAK) {
            return new C6832r<>(qVar, C6858s.C6859a.m11799h());
        }
        C6852p e2 = qVar.mo39531e();
        C6852p pVar2 = C6852p.WEAK;
        if (e2 == pVar2 && qVar.mo39532f() == pVar) {
            return new C6832r<>(qVar, C6863w.C6864a.m11817h());
        }
        if (qVar.mo39531e() == pVar2 && qVar.mo39532f() == pVar2) {
            return new C6832r<>(qVar, C6866y.C6867a.m11836h());
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    static int m11702j(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static <E> ArrayList<E> m11703l(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C6828o.m11679a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: m */
    static <K, V, E extends C6845i<K, V, E>> C6836b0<K, V, E> m11704m() {
        return f8954k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6850n<K, V, E, S> mo39540c(int i, int i2) {
        return this.f8960g.mo39602e(this, i, i2);
    }

    public void clear() {
        for (C6850n<K, V, E, S> a : this.f8957d) {
            a.mo39619a();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int f = mo39546f(obj);
        return mo39552k(f).mo39621c(obj, f);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        C6850n<K, V, E, S>[] nVarArr = this.f8957d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = nVarArr.length;
            long j2 = 0;
            int i2 = z;
            while (i2 < length) {
                C6850n<K, V, E, S> nVar = nVarArr[i2];
                int i3 = nVar.f8990c;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.f8993f;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    for (C6845i iVar = (C6845i) atomicReferenceArray.get(i4); iVar != null; iVar = iVar.getNext()) {
                        V l = nVar.mo39630l(iVar);
                        if (l != null && mo39554n().mo41828d(obj2, l)) {
                            return true;
                        }
                    }
                }
                j2 += (long) nVar.f8991d;
                i2++;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public V mo39544e(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return e.getValue();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f8963j;
        if (set != null) {
            return set;
        }
        C6843g gVar = new C6843g();
        this.f8963j = gVar;
        return gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo39546f(Object obj) {
        return m11702j(this.f8959f.mo41829e(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C6850n<K, V, E, S>[] mo39547g(int i) {
        return new C6850n[i];
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int f = mo39546f(obj);
        return mo39552k(f).mo39626h(obj, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo39549h(E e) {
        int b = e.mo39575b();
        mo39552k(b).mo39638u(e, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo39550i(C6836b0<K, V, E> b0Var) {
        E a = b0Var.mo39565a();
        int b = a.mo39575b();
        mo39552k(b).mo39639v(a.getKey(), b, b0Var);
    }

    public boolean isEmpty() {
        C6850n<K, V, E, S>[] nVarArr = this.f8957d;
        long j = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].f8990c != 0) {
                return false;
            }
            j += (long) nVarArr[i].f8991d;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].f8990c != 0) {
                return false;
            }
            j -= (long) nVarArr[i2].f8991d;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C6850n<K, V, E, S> mo39552k(int i) {
        return this.f8957d[(i >>> this.f8956c) & this.f8955b];
    }

    public Set<K> keySet() {
        Set<K> set = this.f8961h;
        if (set != null) {
            return set;
        }
        C6848l lVar = new C6848l();
        this.f8961h = lVar;
        return lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C7995d<Object> mo39554n() {
        return this.f8960g.mo39600c().mo39644b();
    }

    public V put(K k, V v) {
        C8012n.m15755n(k);
        C8012n.m15755n(v);
        int f = mo39546f(k);
        return mo39552k(f).mo39637t(k, f, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        C8012n.m15755n(k);
        C8012n.m15755n(v);
        int f = mo39546f(k);
        return mo39552k(f).mo39637t(k, f, v, true);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int f = mo39546f(obj);
        return mo39552k(f).mo39640w(obj, f);
    }

    public boolean replace(K k, V v, V v2) {
        C8012n.m15755n(k);
        C8012n.m15755n(v2);
        if (v == null) {
            return false;
        }
        int f = mo39546f(k);
        return mo39552k(f).mo39613A(k, f, v, v2);
    }

    public int size() {
        C6850n<K, V, E, S>[] nVarArr = this.f8957d;
        long j = 0;
        for (C6850n<K, V, E, S> nVar : nVarArr) {
            j += (long) nVar.f8990c;
        }
        return C8582a.m17228a(j);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f8962i;
        if (collection != null) {
            return collection;
        }
        C6862v vVar = new C6862v();
        this.f8962i = vVar;
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C6851o(this.f8960g.mo39599b(), this.f8960g.mo39600c(), this.f8959f, this.f8960g.mo39600c().mo39644b(), this.f8958e, this);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int f = mo39546f(obj);
        return mo39552k(f).mo39641x(obj, f, obj2);
    }

    public V replace(K k, V v) {
        C8012n.m15755n(k);
        C8012n.m15755n(v);
        int f = mo39546f(k);
        return mo39552k(f).mo39643z(k, f, v);
    }

    /* renamed from: com.google.common.collect.r$a */
    /* compiled from: MapMakerInternalMap */
    class C6833a implements C6836b0<Object, Object, C6841e> {
        C6833a() {
        }

        /* renamed from: d */
        public C6841e mo39565a() {
            return null;
        }

        public Object get() {
            return null;
        }

        public void clear() {
        }

        /* renamed from: c */
        public C6836b0<Object, Object, C6841e> mo39566b(ReferenceQueue<Object> referenceQueue, C6841e eVar) {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.r$n */
    /* compiled from: MapMakerInternalMap */
    static abstract class C6850n<K, V, E extends C6845i<K, V, E>, S extends C6850n<K, V, E, S>> extends ReentrantLock {
        @Weak

        /* renamed from: b */
        final C6832r<K, V, E, S> f8989b;

        /* renamed from: c */
        volatile int f8990c;

        /* renamed from: d */
        int f8991d;

        /* renamed from: e */
        int f8992e;

        /* renamed from: f */
        volatile AtomicReferenceArray<E> f8993f;

        /* renamed from: g */
        final int f8994g;

        /* renamed from: h */
        final AtomicInteger f8995h = new AtomicInteger();

        C6850n(C6832r<K, V, E, S> rVar, int i, int i2) {
            this.f8989b = rVar;
            this.f8994g = i2;
            mo39631m(mo39634q(i));
        }

        /* renamed from: n */
        static <K, V, E extends C6845i<K, V, E>> boolean m11745n(E e) {
            if (e.getValue() == null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public boolean mo39613A(K k, int i, V v, V v2) {
            lock();
            try {
                mo39636s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6845i iVar = (C6845i) atomicReferenceArray.get(length);
                C6845i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.mo39575b() != i || key == null || !this.f8989b.f8959f.mo41828d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        Object value = iVar2.getValue();
                        if (value == null) {
                            if (m11745n(iVar2)) {
                                this.f8991d++;
                                atomicReferenceArray.set(length, mo39642y(iVar, iVar2));
                                this.f8990c--;
                            }
                            return false;
                        } else if (this.f8989b.mo39554n().mo41828d(v, value)) {
                            this.f8991d++;
                            mo39617E(iVar2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo39614B() {
            mo39615C();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo39615C() {
            if (tryLock()) {
                try {
                    mo39633p();
                    this.f8995h.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public abstract S mo39616D();

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo39617E(E e, V v) {
            this.f8989b.f8960g.mo39601d(mo39616D(), e, v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo39618F() {
            if (tryLock()) {
                try {
                    mo39633p();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39619a() {
            if (this.f8990c != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, (Object) null);
                    }
                    mo39632o();
                    this.f8995h.set(0);
                    this.f8991d++;
                    this.f8990c = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public <T> void mo39620b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo39621c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f8990c != 0) {
                    C6845i k = mo39629k(obj, i);
                    if (!(k == null || k.getValue() == null)) {
                        z = true;
                    }
                    return z;
                }
                mo39635r();
                return false;
            } finally {
                mo39635r();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public E mo39622d(E e, E e2) {
            return this.f8989b.f8960g.mo39598a(mo39616D(), e, e2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo39623e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f8989b.mo39549h((C6845i) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo39624f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f8989b.mo39550i((C6836b0) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo39625g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f8990c;
                AtomicReferenceArray<E> q = mo39634q(length << 1);
                this.f8992e = (q.length() * 3) / 4;
                int length2 = q.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C6845i iVar = (C6845i) atomicReferenceArray.get(i2);
                    if (iVar != null) {
                        C6845i next = iVar.getNext();
                        int b = iVar.mo39575b() & length2;
                        if (next == null) {
                            q.set(b, iVar);
                        } else {
                            C6845i iVar2 = iVar;
                            while (next != null) {
                                int b2 = next.mo39575b() & length2;
                                if (b2 != b) {
                                    iVar2 = next;
                                    b = b2;
                                }
                                next = next.getNext();
                            }
                            q.set(b, iVar2);
                            while (iVar != iVar2) {
                                int b3 = iVar.mo39575b() & length2;
                                C6845i d = mo39622d(iVar, (C6845i) q.get(b3));
                                if (d != null) {
                                    q.set(b3, d);
                                } else {
                                    i--;
                                }
                                iVar = iVar.getNext();
                            }
                        }
                    }
                }
                this.f8993f = q;
                this.f8990c = i;
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public V mo39626h(Object obj, int i) {
            try {
                C6845i k = mo39629k(obj, i);
                if (k == null) {
                    mo39635r();
                    return null;
                }
                V value = k.getValue();
                if (value == null) {
                    mo39618F();
                }
                mo39635r();
                return value;
            } catch (Throwable th) {
                mo39635r();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public E mo39627i(Object obj, int i) {
            if (this.f8990c == 0) {
                return null;
            }
            for (E j = mo39628j(i); j != null; j = j.getNext()) {
                if (j.mo39575b() == i) {
                    Object key = j.getKey();
                    if (key == null) {
                        mo39618F();
                    } else if (this.f8989b.f8959f.mo41828d(obj, key)) {
                        return j;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public E mo39628j(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
            return (C6845i) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public E mo39629k(Object obj, int i) {
            return mo39627i(obj, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public V mo39630l(E e) {
            if (e.getKey() == null) {
                mo39618F();
                return null;
            }
            V value = e.getValue();
            if (value != null) {
                return value;
            }
            mo39618F();
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo39631m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f8992e = length;
            if (length == this.f8994g) {
                this.f8992e = length + 1;
            }
            this.f8993f = atomicReferenceArray;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public AtomicReferenceArray<E> mo39634q(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo39635r() {
            if ((this.f8995h.incrementAndGet() & 63) == 0) {
                mo39614B();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo39636s() {
            mo39615C();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public V mo39637t(K k, int i, V v, boolean z) {
            lock();
            try {
                mo39636s();
                int i2 = this.f8990c + 1;
                if (i2 > this.f8992e) {
                    mo39625g();
                    i2 = this.f8990c + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6845i iVar = (C6845i) atomicReferenceArray.get(length);
                C6845i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.mo39575b() != i || key == null || !this.f8989b.f8959f.mo41828d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            this.f8991d++;
                            mo39617E(iVar2, v);
                            this.f8990c = this.f8990c;
                            return null;
                        } else if (z) {
                            unlock();
                            return value;
                        } else {
                            this.f8991d++;
                            mo39617E(iVar2, v);
                            unlock();
                            return value;
                        }
                    }
                }
                this.f8991d++;
                E f = this.f8989b.f8960g.mo39603f(mo39616D(), k, i, iVar);
                mo39617E(f, v);
                atomicReferenceArray.set(length, f);
                this.f8990c = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public boolean mo39638u(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = (C6845i) atomicReferenceArray.get(length);
                for (E e3 = e2; e3 != null; e3 = e3.getNext()) {
                    if (e3 == e) {
                        this.f8991d++;
                        atomicReferenceArray.set(length, mo39642y(e2, e3));
                        this.f8990c--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo39639v(K k, int i, C6836b0<K, V, E> b0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6845i iVar = (C6845i) atomicReferenceArray.get(length);
                C6845i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.mo39575b() != i || key == null || !this.f8989b.f8959f.mo41828d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else if (((C6834a0) iVar2).mo39571a() == b0Var) {
                        this.f8991d++;
                        atomicReferenceArray.set(length, mo39642y(iVar, iVar2));
                        this.f8990c--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public V mo39640w(Object obj, int i) {
            lock();
            try {
                mo39636s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6845i iVar = (C6845i) atomicReferenceArray.get(length);
                C6845i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.mo39575b() != i || key == null || !this.f8989b.f8959f.mo41828d(obj, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (!m11745n(iVar2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.f8991d++;
                        atomicReferenceArray.set(length, mo39642y(iVar, iVar2));
                        this.f8990c--;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo39641x(Object obj, int i, Object obj2) {
            lock();
            try {
                mo39636s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6845i iVar = (C6845i) atomicReferenceArray.get(length);
                C6845i iVar2 = iVar;
                while (true) {
                    boolean z = false;
                    if (iVar2 != null) {
                        Object key = iVar2.getKey();
                        if (iVar2.mo39575b() != i || key == null || !this.f8989b.f8959f.mo41828d(obj, key)) {
                            iVar2 = iVar2.getNext();
                        } else {
                            if (this.f8989b.mo39554n().mo41828d(obj2, iVar2.getValue())) {
                                z = true;
                            } else if (!m11745n(iVar2)) {
                                unlock();
                                return false;
                            }
                            this.f8991d++;
                            atomicReferenceArray.set(length, mo39642y(iVar, iVar2));
                            this.f8990c--;
                            return z;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public E mo39642y(E e, E e2) {
            int i = this.f8990c;
            E next = e2.getNext();
            while (e != e2) {
                E d = mo39622d(e, next);
                if (d != null) {
                    next = d;
                } else {
                    i--;
                }
                e = e.getNext();
            }
            this.f8990c = i;
            return next;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public V mo39643z(K k, int i, V v) {
            lock();
            try {
                mo39636s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f8993f;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6845i iVar = (C6845i) atomicReferenceArray.get(length);
                C6845i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.mo39575b() != i || key == null || !this.f8989b.f8959f.mo41828d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (m11745n(iVar2)) {
                                this.f8991d++;
                                atomicReferenceArray.set(length, mo39642y(iVar, iVar2));
                                this.f8990c--;
                            }
                            return null;
                        }
                        this.f8991d++;
                        mo39617E(iVar2, v);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo39632o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo39633p() {
        }
    }

    /* renamed from: com.google.common.collect.r$r */
    /* compiled from: MapMakerInternalMap */
    static final class C6857r<K, V> extends C6850n<K, V, C6855q<K, V>, C6857r<K, V>> {
        C6857r(C6832r<K, V, C6855q<K, V>, C6857r<K, V>> rVar, int i, int i2) {
            super(rVar, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public C6857r<K, V> mo39616D() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.r$t */
    /* compiled from: MapMakerInternalMap */
    static final class C6860t<K, V> extends C6850n<K, V, C6858s<K, V>, C6860t<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final ReferenceQueue<V> f9003i = new ReferenceQueue<>();

        C6860t(C6832r<K, V, C6858s<K, V>, C6860t<K, V>> rVar, int i, int i2) {
            super(rVar, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo39632o() {
            mo39620b(this.f9003i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo39633p() {
            mo39624f(this.f9003i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public C6860t<K, V> mo39616D() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.r$x */
    /* compiled from: MapMakerInternalMap */
    static final class C6865x<K, V> extends C6850n<K, V, C6863w<K, V>, C6865x<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final ReferenceQueue<K> f9007i = new ReferenceQueue<>();

        C6865x(C6832r<K, V, C6863w<K, V>, C6865x<K, V>> rVar, int i, int i2) {
            super(rVar, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo39632o() {
            mo39620b(this.f9007i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo39633p() {
            mo39623e(this.f9007i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public C6865x<K, V> mo39616D() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.r$z */
    /* compiled from: MapMakerInternalMap */
    static final class C6868z<K, V> extends C6850n<K, V, C6866y<K, V>, C6868z<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final ReferenceQueue<K> f9010i = new ReferenceQueue<>();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final ReferenceQueue<V> f9011j = new ReferenceQueue<>();

        C6868z(C6832r<K, V, C6866y<K, V>, C6868z<K, V>> rVar, int i, int i2) {
            super(rVar, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo39632o() {
            mo39620b(this.f9010i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo39633p() {
            mo39623e(this.f9010i);
            mo39624f(this.f9011j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public C6868z<K, V> mo39616D() {
            return this;
        }
    }
}
