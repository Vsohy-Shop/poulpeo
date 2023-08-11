package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.p0 */
/* compiled from: MapWithDefault.kt */
class C12712p0 {
    /* renamed from: a */
    public static final <K, V> V m28409a(Map<K, ? extends V> map, K k) {
        C12775o.m28639i(map, "<this>");
        if (map instanceof C12707n0) {
            return ((C12707n0) map).mo50597d(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
