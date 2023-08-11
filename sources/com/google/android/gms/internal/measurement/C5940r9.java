package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.r9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5940r9<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private static final C5940r9 f7323c;

    /* renamed from: b */
    private boolean f7324b = true;

    static {
        C5940r9 r9Var = new C5940r9();
        f7323c = r9Var;
        r9Var.f7324b = false;
    }

    private C5940r9() {
    }

    /* renamed from: a */
    public static <K, V> C5940r9<K, V> m9831a() {
        return f7323c;
    }

    /* renamed from: g */
    private static int m9832g(Object obj) {
        if (obj instanceof byte[]) {
            return C5708d9.m9015b((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    private final void m9833h() {
        if (!this.f7324b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C5940r9<K, V> mo34320b() {
        if (isEmpty()) {
            return new C5940r9<>();
        }
        return new C5940r9<>(this);
    }

    /* renamed from: c */
    public final void mo34321c() {
        this.f7324b = false;
    }

    public final void clear() {
        m9833h();
        super.clear();
    }

    /* renamed from: e */
    public final void mo34323e(C5940r9<K, V> r9Var) {
        m9833h();
        if (!r9Var.isEmpty()) {
            putAll(r9Var);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34326f() {
        return this.f7324b;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m9832g(entry.getValue()) ^ m9832g(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m9833h();
        C5708d9.m9018e(k);
        C5708d9.m9018e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m9833h();
        for (Object next : map.keySet()) {
            C5708d9.m9018e(next);
            C5708d9.m9018e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m9833h();
        return super.remove(obj);
    }

    private C5940r9(Map<K, V> map) {
        super(map);
    }
}
