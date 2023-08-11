package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.h */
/* compiled from: ForwardingMap */
public abstract class C6814h<K, V> extends C6815i implements Map<K, V> {
    protected C6814h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo39444b();

    public void clear() {
        mo39444b().clear();
    }

    public boolean containsKey(Object obj) {
        return mo39444b().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo39444b().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo39444b().entrySet();
    }

    public boolean equals(Object obj) {
        if (obj == this || mo39444b().equals(obj)) {
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return mo39444b().get(obj);
    }

    public int hashCode() {
        return mo39444b().hashCode();
    }

    public boolean isEmpty() {
        return mo39444b().isEmpty();
    }

    public Set<K> keySet() {
        return mo39444b().keySet();
    }

    public V put(K k, V v) {
        return mo39444b().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo39444b().putAll(map);
    }

    public V remove(Object obj) {
        return mo39444b().remove(obj);
    }

    public int size() {
        return mo39444b().size();
    }

    public Collection<V> values() {
        return mo39444b().values();
    }
}
