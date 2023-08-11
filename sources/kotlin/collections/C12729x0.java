package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.C12775o;
import p342ff.C11986j;

/* renamed from: kotlin.collections.x0 */
/* compiled from: SetsJVM.kt */
class C12729x0 {
    /* renamed from: a */
    public static <E> Set<E> m28547a(Set<E> set) {
        C12775o.m28639i(set, "builder");
        return ((C11986j) set).mo49395b();
    }

    /* renamed from: b */
    public static <E> Set<E> m28548b(int i) {
        return new C11986j(i);
    }

    /* renamed from: c */
    public static <T> Set<T> m28549c(T t) {
        Set<T> singleton = Collections.singleton(t);
        C12775o.m28638h(singleton, "singleton(element)");
        return singleton;
    }

    /* renamed from: d */
    public static <T> TreeSet<T> m28550d(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        return (TreeSet) C12710p.m28403e0(tArr, new TreeSet());
    }
}
