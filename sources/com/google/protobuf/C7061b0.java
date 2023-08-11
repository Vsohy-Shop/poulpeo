package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.b0 */
/* compiled from: LazyField */
public class C7061b0 extends C7067c0 {

    /* renamed from: f */
    private final C7149p0 f9522f;

    /* renamed from: com.google.protobuf.b0$b */
    /* compiled from: LazyField */
    static class C7063b<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        private Map.Entry<K, C7061b0> f9523b;

        /* renamed from: a */
        public C7061b0 mo40177a() {
            return this.f9523b.getValue();
        }

        public K getKey() {
            return this.f9523b.getKey();
        }

        public Object getValue() {
            C7061b0 value = this.f9523b.getValue();
            if (value == null) {
                return null;
            }
            return value.mo40174f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C7149p0) {
                return this.f9523b.getValue().mo40207d((C7149p0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C7063b(Map.Entry<K, C7061b0> entry) {
            this.f9523b = entry;
        }
    }

    /* renamed from: com.google.protobuf.b0$c */
    /* compiled from: LazyField */
    static class C7064c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        private Iterator<Map.Entry<K, Object>> f9524b;

        public C7064c(Iterator<Map.Entry<K, Object>> it) {
            this.f9524b = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f9524b.next();
            if (next.getValue() instanceof C7061b0) {
                return new C7063b(next);
            }
            return next;
        }

        public boolean hasNext() {
            return this.f9524b.hasNext();
        }

        public void remove() {
            this.f9524b.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo40174f().equals(obj);
    }

    /* renamed from: f */
    public C7149p0 mo40174f() {
        return mo40206c(this.f9522f);
    }

    public int hashCode() {
        return mo40174f().hashCode();
    }

    public String toString() {
        return mo40174f().toString();
    }
}
