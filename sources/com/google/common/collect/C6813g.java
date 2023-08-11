package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.common.collect.g */
/* compiled from: ForwardingConcurrentMap */
public abstract class C6813g<K, V> extends C6814h<K, V> implements ConcurrentMap<K, V> {
    protected C6813g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ConcurrentMap<K, V> mo39439c();

    public V putIfAbsent(K k, V v) {
        return mo39439c().putIfAbsent(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return mo39439c().remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return mo39439c().replace(k, v);
    }

    public boolean replace(K k, V v, V v2) {
        return mo39439c().replace(k, v, v2);
    }
}
