package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.de */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4879de extends LinkedHashMap {

    /* renamed from: c */
    private static final C4879de f5192c;

    /* renamed from: b */
    private boolean f5193b = true;

    static {
        C4879de deVar = new C4879de();
        f5192c = deVar;
        deVar.f5193b = false;
    }

    private C4879de() {
    }

    /* renamed from: f */
    private static int m6925f(Object obj) {
        if (obj instanceof byte[]) {
            return C5032md.m7195b((byte[]) obj);
        }
        if (!(obj instanceof C4913fd)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private final void m6926g() {
        if (!this.f5193b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final C4879de mo32746a() {
        if (isEmpty()) {
            return new C4879de();
        }
        return new C4879de(this);
    }

    /* renamed from: b */
    public final void mo32747b() {
        this.f5193b = false;
    }

    /* renamed from: c */
    public final void mo32748c(C4879de deVar) {
        m6926g();
        if (!deVar.isEmpty()) {
            putAll(deVar);
        }
    }

    public final void clear() {
        m6926g();
        super.clear();
    }

    /* renamed from: e */
    public final boolean mo32750e() {
        return this.f5193b;
    }

    public final Set entrySet() {
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

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m6925f(entry.getValue()) ^ m6925f(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m6926g();
        C5032md.m7198e(obj);
        C5032md.m7198e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m6926g();
        for (Object next : map.keySet()) {
            C5032md.m7198e(next);
            C5032md.m7198e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m6926g();
        return super.remove(obj);
    }

    private C4879de(Map map) {
        super(map);
    }
}
