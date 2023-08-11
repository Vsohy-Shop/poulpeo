package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.y0 */
/* compiled from: Sets.kt */
class C12731y0 extends C12729x0 {
    /* renamed from: e */
    public static <T> Set<T> m28551e() {
        return C12696i0.f20368b;
    }

    /* renamed from: f */
    public static <T> HashSet<T> m28552f(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        return (HashSet) C12710p.m28403e0(tArr, new HashSet(C12714q0.m28413d(tArr.length)));
    }

    /* renamed from: g */
    public static <T> Set<T> m28553g(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        return (Set) C12710p.m28403e0(tArr, new LinkedHashSet(C12714q0.m28413d(tArr.length)));
    }

    /* renamed from: h */
    public static final <T> Set<T> m28554h(Set<? extends T> set) {
        C12775o.m28639i(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return m28551e();
        }
        if (size != 1) {
            return set;
        }
        return C12729x0.m28549c(set.iterator().next());
    }

    /* renamed from: i */
    public static <T> Set<T> m28555i(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        if (tArr.length > 0) {
            return C12710p.m28408j0(tArr);
        }
        return m28551e();
    }
}
