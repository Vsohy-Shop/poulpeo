package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p436tf.C13528f;

/* renamed from: kotlin.collections.w */
/* compiled from: Collections.kt */
class C12726w extends C12723v {
    /* renamed from: e */
    public static <T> ArrayList<T> m28518e(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C12697j(tArr, true));
    }

    /* renamed from: f */
    public static final <T> Collection<T> m28519f(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        return new C12697j(tArr, false);
    }

    /* renamed from: g */
    public static <T> int m28520g(List<? extends T> list, int i, int i2, Function1<? super T, Integer> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "comparison");
        m28532s(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = function1.invoke(list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: h */
    public static final <T extends Comparable<? super T>> int m28521h(List<? extends T> list, T t, int i, int i2) {
        C12775o.m28639i(list, "<this>");
        m28532s(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int c = C12019b.m26106c((Comparable) list.get(i4), t);
            if (c < 0) {
                i = i4 + 1;
            } else if (c <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: i */
    public static /* synthetic */ int m28522i(List list, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return m28520g(list, i, i2, function1);
    }

    /* renamed from: j */
    public static /* synthetic */ int m28523j(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m28521h(list, comparable, i, i2);
    }

    /* renamed from: k */
    public static <T> List<T> m28524k() {
        return C12691g0.f20366b;
    }

    /* renamed from: l */
    public static C13528f m28525l(Collection<?> collection) {
        C12775o.m28639i(collection, "<this>");
        return new C13528f(0, collection.size() - 1);
    }

    /* renamed from: m */
    public static <T> int m28526m(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: n */
    public static <T> List<T> m28527n(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        if (tArr.length > 0) {
            return C12708o.m28336c(tArr);
        }
        return m28524k();
    }

    /* renamed from: o */
    public static <T> List<T> m28528o(T t) {
        if (t != null) {
            return C12723v.m28509d(t);
        }
        return m28524k();
    }

    /* renamed from: p */
    public static <T> List<T> m28529p(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        return C12710p.m28378F(tArr);
    }

    /* renamed from: q */
    public static <T> List<T> m28530q(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C12697j(tArr, true));
    }

    /* renamed from: r */
    public static <T> List<T> m28531r(List<? extends T> list) {
        C12775o.m28639i(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return m28524k();
        }
        if (size != 1) {
            return list;
        }
        return C12723v.m28509d(list.get(0));
    }

    /* renamed from: s */
    private static final void m28532s(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    /* renamed from: t */
    public static void m28533t() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: u */
    public static void m28534u() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
