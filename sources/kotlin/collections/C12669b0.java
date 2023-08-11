package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import p436tf.C13528f;
import p448vf.C13650g;

/* renamed from: kotlin.collections.b0 */
/* compiled from: MutableCollections.kt */
class C12669b0 extends C12664a0 {
    /* renamed from: B */
    public static <T> boolean m28178B(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: C */
    public static <T> boolean m28179C(Collection<? super T> collection, C13650g<? extends T> gVar) {
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(gVar, "elements");
        boolean z = false;
        for (Object add : gVar) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: D */
    public static <T> boolean m28180D(Collection<? super T> collection, T[] tArr) {
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(tArr, "elements");
        return collection.addAll(C12708o.m28336c(tArr));
    }

    /* renamed from: E */
    private static final <T> boolean m28181E(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: F */
    private static final <T> boolean m28182F(List<T> list, Function1<? super T, Boolean> function1, boolean z) {
        if (!(list instanceof RandomAccess)) {
            C12775o.m28637g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m28181E(C12772l0.m28610b(list), function1, z);
        }
        C12703l0 r = new C13528f(0, C12726w.m28526m(list)).iterator();
        int i = 0;
        while (r.hasNext()) {
            int nextInt = r.nextInt();
            T t = list.get(nextInt);
            if (function1.invoke(t).booleanValue() != z) {
                if (i != nextInt) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int m = C12726w.m28526m(list);
        if (i > m) {
            return true;
        }
        while (true) {
            list.remove(m);
            if (m == i) {
                return true;
            }
            m--;
        }
    }

    /* renamed from: G */
    public static <T> boolean m28183G(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(function1, "predicate");
        return m28181E(iterable, function1, true);
    }

    /* renamed from: H */
    public static <T> boolean m28184H(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(iterable, "elements");
        return C12772l0.m28609a(collection).removeAll(C12717s.m28433c(iterable, collection));
    }

    /* renamed from: I */
    public static <T> boolean m28185I(Collection<? super T> collection, C13650g<? extends T> gVar) {
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(gVar, "elements");
        Collection<? extends T> a = C12717s.m28431a(gVar);
        if (!(!a.isEmpty()) || !collection.removeAll(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static <T> boolean m28186J(Collection<? super T> collection, T[] tArr) {
        boolean z;
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z) || !collection.removeAll(C12717s.m28432b(tArr))) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static <T> boolean m28187K(List<T> list, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "predicate");
        return m28182F(list, function1, true);
    }

    /* renamed from: L */
    public static <T> T m28188L(List<T> list) {
        C12775o.m28639i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: M */
    public static <T> T m28189M(List<T> list) {
        C12775o.m28639i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* renamed from: N */
    public static <T> T m28190N(List<T> list) {
        C12775o.m28639i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C12726w.m28526m(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: O */
    public static <T> T m28191O(List<T> list) {
        C12775o.m28639i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C12726w.m28526m(list));
    }

    /* renamed from: P */
    public static <T> boolean m28192P(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(function1, "predicate");
        return m28181E(iterable, function1, false);
    }

    /* renamed from: Q */
    public static <T> boolean m28193Q(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(iterable, "elements");
        return C12772l0.m28609a(collection).retainAll(C12717s.m28433c(iterable, collection));
    }
}
