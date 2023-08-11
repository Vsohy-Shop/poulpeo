package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;
import p448vf.C13650g;

/* renamed from: kotlin.collections.r0 */
/* compiled from: Maps.kt */
class C12716r0 extends C12714q0 {
    /* renamed from: g */
    public static <K, V> Map<K, V> m28416g() {
        C12693h0 h0Var = C12693h0.f20367b;
        C12775o.m28637g(h0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return h0Var;
    }

    /* renamed from: h */
    public static <K, V> V m28417h(Map<K, ? extends V> map, K k) {
        C12775o.m28639i(map, "<this>");
        return C12712p0.m28409a(map, k);
    }

    /* renamed from: i */
    public static <K, V> HashMap<K, V> m28418i(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C12714q0.m28413d(lVarArr.length));
        m28424o(hashMap, lVarArr);
        return hashMap;
    }

    /* renamed from: j */
    public static <K, V> Map<K, V> m28419j(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        if (lVarArr.length > 0) {
            return m28429t(lVarArr, new LinkedHashMap(C12714q0.m28413d(lVarArr.length)));
        }
        return m28416g();
    }

    /* renamed from: k */
    public static <K, V> Map<K, V> m28420k(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12714q0.m28413d(lVarArr.length));
        m28424o(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    /* renamed from: l */
    public static final <K, V> Map<K, V> m28421l(Map<K, ? extends V> map) {
        C12775o.m28639i(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m28416g();
        }
        if (size != 1) {
            return map;
        }
        return C12714q0.m28415f(map);
    }

    /* renamed from: m */
    public static <K, V> void m28422m(Map<? super K, ? super V> map, Iterable<? extends C11906l<? extends K, ? extends V>> iterable) {
        C12775o.m28639i(map, "<this>");
        C12775o.m28639i(iterable, "pairs");
        for (C11906l lVar : iterable) {
            map.put(lVar.mo49109a(), lVar.mo49110b());
        }
    }

    /* renamed from: n */
    public static <K, V> void m28423n(Map<? super K, ? super V> map, C13650g<? extends C11906l<? extends K, ? extends V>> gVar) {
        C12775o.m28639i(map, "<this>");
        C12775o.m28639i(gVar, "pairs");
        for (C11906l lVar : gVar) {
            map.put(lVar.mo49109a(), lVar.mo49110b());
        }
    }

    /* renamed from: o */
    public static <K, V> void m28424o(Map<? super K, ? super V> map, C11906l<? extends K, ? extends V>[] lVarArr) {
        C12775o.m28639i(map, "<this>");
        C12775o.m28639i(lVarArr, "pairs");
        for (C11906l<? extends K, ? extends V> lVar : lVarArr) {
            map.put(lVar.mo49109a(), lVar.mo49110b());
        }
    }

    /* renamed from: p */
    public static <K, V> Map<K, V> m28425p(Iterable<? extends C11906l<? extends K, ? extends V>> iterable) {
        Object obj;
        C12775o.m28639i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m28421l(m28426q(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m28416g();
        }
        if (size != 1) {
            return m28426q(iterable, new LinkedHashMap(C12714q0.m28413d(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C12714q0.m28414e((C11906l) obj);
    }

    /* renamed from: q */
    public static final <K, V, M extends Map<? super K, ? super V>> M m28426q(Iterable<? extends C11906l<? extends K, ? extends V>> iterable, M m) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(m, "destination");
        m28422m(m, iterable);
        return m;
    }

    /* renamed from: r */
    public static <K, V> Map<K, V> m28427r(Map<? extends K, ? extends V> map) {
        C12775o.m28639i(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m28416g();
        }
        if (size != 1) {
            return m28430u(map);
        }
        return C12714q0.m28415f(map);
    }

    /* renamed from: s */
    public static <K, V> Map<K, V> m28428s(C11906l<? extends K, ? extends V>[] lVarArr) {
        C12775o.m28639i(lVarArr, "<this>");
        int length = lVarArr.length;
        if (length == 0) {
            return m28416g();
        }
        if (length != 1) {
            return m28429t(lVarArr, new LinkedHashMap(C12714q0.m28413d(lVarArr.length)));
        }
        return C12714q0.m28414e(lVarArr[0]);
    }

    /* renamed from: t */
    public static final <K, V, M extends Map<? super K, ? super V>> M m28429t(C11906l<? extends K, ? extends V>[] lVarArr, M m) {
        C12775o.m28639i(lVarArr, "<this>");
        C12775o.m28639i(m, "destination");
        m28424o(m, lVarArr);
        return m;
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m28430u(Map<? extends K, ? extends V> map) {
        C12775o.m28639i(map, "<this>");
        return new LinkedHashMap(map);
    }
}
