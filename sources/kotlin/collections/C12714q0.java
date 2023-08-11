package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;
import p342ff.C11972d;

/* renamed from: kotlin.collections.q0 */
/* compiled from: MapsJVM.kt */
class C12714q0 extends C12712p0 {
    /* renamed from: b */
    public static <K, V> Map<K, V> m28411b(Map<K, V> map) {
        C12775o.m28639i(map, "builder");
        return ((C11972d) map).mo49330j();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m28412c(int i) {
        return new C11972d(i);
    }

    /* renamed from: d */
    public static int m28413d(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public static final <K, V> Map<K, V> m28414e(C11906l<? extends K, ? extends V> lVar) {
        C12775o.m28639i(lVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(lVar.mo49111c(), lVar.mo49112d());
        C12775o.m28638h(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: f */
    public static final <K, V> Map<K, V> m28415f(Map<? extends K, ? extends V> map) {
        C12775o.m28639i(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C12775o.m28638h(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
