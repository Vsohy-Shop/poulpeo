package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;
import p336ef.C11915r;
import p436tf.C13528f;
import p448vf.C13650g;

/* renamed from: kotlin.collections.e0 */
/* compiled from: _Collections.kt */
class C12686e0 extends C12684d0 {

    /* renamed from: kotlin.collections.e0$a */
    /* compiled from: Sequences.kt */
    public static final class C12687a implements C13650g<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f20364a;

        public C12687a(Iterable iterable) {
            this.f20364a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f20364a.iterator();
        }
    }

    /* renamed from: A0 */
    public static int[] m28204A0(Collection<Integer> collection) {
        C12775o.m28639i(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: B0 */
    public static <T> List<T> m28205B0(Iterable<? extends T> iterable) {
        Object obj;
        C12775o.m28639i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C12726w.m28531r(m28206C0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C12726w.m28524k();
        }
        if (size != 1) {
            return m28207D0(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C12723v.m28509d(obj);
    }

    /* renamed from: C0 */
    public static final <T> List<T> m28206C0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m28207D0((Collection) iterable);
        }
        return (List) m28245x0(iterable, new ArrayList());
    }

    /* renamed from: D0 */
    public static <T> List<T> m28207D0(Collection<? extends T> collection) {
        C12775o.m28639i(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: E0 */
    public static <T> Set<T> m28208E0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m28245x0(iterable, new LinkedHashSet());
    }

    /* renamed from: F0 */
    public static <T> Set<T> m28209F0(Iterable<? extends T> iterable) {
        Object obj;
        C12775o.m28639i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C12731y0.m28554h((Set) m28245x0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C12731y0.m28551e();
        }
        if (size != 1) {
            return (Set) m28245x0(iterable, new LinkedHashSet(C12714q0.m28413d(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C12729x0.m28549c(obj);
    }

    /* renamed from: G0 */
    public static final <T, R> List<R> m28210G0(Iterable<? extends T> iterable, int i, int i2, boolean z, Function1<? super List<? extends T>, ? extends R> function1) {
        int i3;
        boolean z2;
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(function1, "transform");
        C12665a1.m28172a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator<List<T>> b = C12665a1.m28173b(iterable.iterator(), i, i2, z, true);
            while (b.hasNext()) {
                arrayList.add(function1.invoke(b.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i4 = size / i2;
        if (size % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList2 = new ArrayList(i4 + i3);
        C12722u0 u0Var = new C12722u0(list);
        int i5 = 0;
        while (true) {
            if (i5 < 0 || i5 >= size) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                break;
            }
            int i6 = C13537l.m30882i(i, size - i5);
            if (!z && i6 < i) {
                break;
            }
            u0Var.mo50600b(i5, i6 + i5);
            arrayList2.add(function1.invoke(u0Var));
            i5 += i2;
        }
        return arrayList2;
    }

    /* renamed from: H0 */
    public static /* synthetic */ List m28211H0(Iterable iterable, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m28210G0(iterable, i, i2, z, function1);
    }

    /* renamed from: I0 */
    public static <T, R> List<C11906l<T, R>> m28212I0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C12728x.m28544v(iterable, 10), C12728x.m28544v(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C11915r.m25707a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: R */
    public static <T> C13650g<T> m28213R(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        return new C12687a(iterable);
    }

    /* renamed from: S */
    public static <T> boolean m28214S(Iterable<? extends T> iterable, T t) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (m28225d0(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static <T> List<T> m28215T(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        return m28205B0(m28208E0(iterable));
    }

    /* renamed from: U */
    public static <T> List<T> m28216U(Iterable<? extends T> iterable, int i) {
        boolean z;
        ArrayList arrayList;
        C12775o.m28639i(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return m28205B0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C12726w.m28524k();
                }
                if (size == 1) {
                    return C12723v.m28509d(m28230i0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return C12726w.m28531r(arrayList);
        }
    }

    /* renamed from: V */
    public static <T> List<T> m28217V(List<? extends T> list, int i) {
        boolean z;
        C12775o.m28639i(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m28244w0(list, C13537l.m30877d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: W */
    public static <T> List<T> m28218W(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        return (List) m28219X(iterable, new ArrayList());
    }

    /* renamed from: X */
    public static final <C extends Collection<? super T>, T> C m28219X(Iterable<? extends T> iterable, C c) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: Y */
    public static <T> T m28220Y(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof List) {
            return m28221Z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: Z */
    public static <T> T m28221Z(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: a0 */
    public static <T> T m28222a0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: b0 */
    public static <T> T m28223b0(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: c0 */
    public static <T> T m28224c0(List<? extends T> list, int i) {
        C12775o.m28639i(list, "<this>");
        if (i < 0 || i > C12726w.m28526m(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: d0 */
    public static final <T> int m28225d0(Iterable<? extends T> iterable, T t) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C12726w.m28534u();
            }
            if (C12775o.m28634d(t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e0 */
    public static final <T, A extends Appendable> A m28226e0(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(a, "buffer");
        C12775o.m28639i(charSequence, "separator");
        C12775o.m28639i(charSequence2, "prefix");
        C12775o.m28639i(charSequence3, "postfix");
        C12775o.m28639i(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C13744n.m31506a(a, next, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: f0 */
    public static /* synthetic */ Appendable m28227f0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        Function1 function12;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return m28226e0(iterable, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    /* renamed from: g0 */
    public static final <T> String m28228g0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(charSequence, "separator");
        C12775o.m28639i(charSequence2, "prefix");
        C12775o.m28639i(charSequence3, "postfix");
        C12775o.m28639i(charSequence4, "truncated");
        String sb = ((StringBuilder) m28226e0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        C12775o.m28638h(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: h0 */
    public static /* synthetic */ String m28229h0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m28228g0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: i0 */
    public static final <T> T m28230i0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof List) {
            return m28231j0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: j0 */
    public static <T> T m28231j0(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C12726w.m28526m(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: k0 */
    public static <T> T m28232k0(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: l0 */
    public static Float m28233l0(Iterable<Float> iterable) {
        C12775o.m28639i(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: m0 */
    public static <T extends Comparable<? super T>> T m28234m0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: n0 */
    public static Float m28235n0(Iterable<Float> iterable) {
        C12775o.m28639i(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: o0 */
    public static <T> List<T> m28236o0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C12775o.m28639i(collection, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = C12669b0.m28178B(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: p0 */
    public static <T> List<T> m28237p0(Collection<? extends T> collection, T t) {
        C12775o.m28639i(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: q0 */
    public static <T> T m28238q0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof List) {
            return m28239r0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: r0 */
    public static final <T> T m28239r0(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: s0 */
    public static <T> T m28240s0(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: t0 */
    public static <T> List<T> m28241t0(List<? extends T> list, C13528f fVar) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(fVar, "indices");
        if (fVar.isEmpty()) {
            return C12726w.m28524k();
        }
        return m28205B0(list.subList(fVar.getStart().intValue(), fVar.getEndInclusive().intValue() + 1));
    }

    /* renamed from: u0 */
    public static <T extends Comparable<? super T>> List<T> m28242u0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m28205B0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C12775o.m28637g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C12775o.m28637g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sorted>");
            Comparable[] comparableArr = (Comparable[]) array;
            C12708o.m28359z(comparableArr);
            return C12708o.m28336c(comparableArr);
        }
        List<T> C0 = m28206C0(iterable);
        C12664a0.m28171z(C0);
        return C0;
    }

    /* renamed from: v0 */
    public static <T> List<T> m28243v0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m28205B0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C12775o.m28637g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C12775o.m28637g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
            C12708o.m28334A(array, comparator);
            return C12708o.m28336c(array);
        }
        List<T> C0 = m28206C0(iterable);
        C12664a0.m28170A(C0, comparator);
        return C0;
    }

    /* renamed from: w0 */
    public static <T> List<T> m28244w0(Iterable<? extends T> iterable, int i) {
        boolean z;
        C12775o.m28639i(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C12726w.m28524k();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m28205B0(iterable);
                }
                if (i == 1) {
                    return C12723v.m28509d(m28220Y(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C12726w.m28531r(arrayList);
        }
    }

    /* renamed from: x0 */
    public static final <T, C extends Collection<? super T>> C m28245x0(Iterable<? extends T> iterable, C c) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: y0 */
    public static float[] m28246y0(Collection<Float> collection) {
        C12775o.m28639i(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Float floatValue : collection) {
            fArr[i] = floatValue.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: z0 */
    public static final <T> HashSet<T> m28247z0(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        return (HashSet) m28245x0(iterable, new HashSet(C12714q0.m28413d(C12728x.m28544v(iterable, 12))));
    }
}
