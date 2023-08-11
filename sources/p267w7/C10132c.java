package p267w7;

import java.util.Collections;
import java.util.Map;

/* renamed from: w7.c */
/* compiled from: MapBuilder */
public final class C10132c<K, V> {

    /* renamed from: a */
    private final Map<K, V> f15327a;

    private C10132c(int i) {
        this.f15327a = C10130a.m21318b(i);
    }

    /* renamed from: b */
    public static <K, V> C10132c<K, V> m21321b(int i) {
        return new C10132c<>(i);
    }

    /* renamed from: a */
    public Map<K, V> mo44728a() {
        if (this.f15327a.size() != 0) {
            return Collections.unmodifiableMap(this.f15327a);
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public C10132c<K, V> mo44729c(K k, V v) {
        this.f15327a.put(k, v);
        return this;
    }
}
