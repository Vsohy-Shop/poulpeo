package com.google.protobuf;

import com.google.protobuf.C7196z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.j0 */
/* compiled from: MapFieldLite */
public final class C7120j0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private static final C7120j0 f9640c;

    /* renamed from: b */
    private boolean f9641b = true;

    static {
        C7120j0 j0Var = new C7120j0();
        f9640c = j0Var;
        j0Var.mo40450j();
    }

    private C7120j0() {
    }

    /* renamed from: a */
    static <K, V> int m13316a(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m13317b(next.getValue()) ^ m13317b(next.getKey());
        }
        return i;
    }

    /* renamed from: b */
    private static int m13317b(Object obj) {
        if (obj instanceof byte[]) {
            return C7196z.m13947d((byte[]) obj);
        }
        if (!(obj instanceof C7196z.C7199c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private static void m13318c(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C7196z.m13944a(next);
            C7196z.m13944a(map.get(next));
        }
    }

    /* renamed from: e */
    public static <K, V> C7120j0<K, V> m13319e() {
        return f9640c;
    }

    /* renamed from: f */
    private void m13320f() {
        if (!mo40449i()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private static boolean m13321g(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean m13322h(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m13321g(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7120j0.m13322h(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        m13320f();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !m13322h(this, (Map) obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return m13316a(this);
    }

    /* renamed from: i */
    public boolean mo40449i() {
        return this.f9641b;
    }

    /* renamed from: j */
    public void mo40450j() {
        this.f9641b = false;
    }

    /* renamed from: l */
    public void mo40451l(C7120j0<K, V> j0Var) {
        m13320f();
        if (!j0Var.isEmpty()) {
            putAll(j0Var);
        }
    }

    /* renamed from: m */
    public C7120j0<K, V> mo40452m() {
        if (isEmpty()) {
            return new C7120j0<>();
        }
        return new C7120j0<>(this);
    }

    public V put(K k, V v) {
        m13320f();
        C7196z.m13944a(k);
        C7196z.m13944a(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m13320f();
        m13318c(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        m13320f();
        return super.remove(obj);
    }

    private C7120j0(Map<K, V> map) {
        super(map);
    }
}
