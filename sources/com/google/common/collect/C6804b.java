package com.google.common.collect;

import java.util.Map;

/* renamed from: com.google.common.collect.b */
/* compiled from: AbstractMapEntry */
abstract class C6804b<K, V> implements Map.Entry<K, V> {
    C6804b() {
    }

    public abstract K getKey();

    public abstract V getValue();

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
