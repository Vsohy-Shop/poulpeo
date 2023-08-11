package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.z0 */
/* compiled from: _Sets.kt */
class C12733z0 extends C12731y0 {
    /* renamed from: j */
    public static <T> Set<T> m28557j(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        C12775o.m28639i(set, "<this>");
        C12775o.m28639i(iterable, "elements");
        Integer w = C12728x.m28545w(iterable);
        if (w != null) {
            i = set.size() + w.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C12714q0.m28413d(i));
        linkedHashSet.addAll(set);
        boolean unused = C12669b0.m28178B(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
