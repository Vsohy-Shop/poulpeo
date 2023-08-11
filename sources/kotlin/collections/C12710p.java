package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12751c;
import kotlin.jvm.internal.C12775o;
import p436tf.C13528f;
import p448vf.C13650g;

/* renamed from: kotlin.collections.p */
/* compiled from: _Arrays.kt */
class C12710p extends C12708o {

    /* renamed from: kotlin.collections.p$a */
    /* compiled from: Sequences.kt */
    public static final class C12711a implements C13650g<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f20380a;

        public C12711a(Object[] objArr) {
            this.f20380a = objArr;
        }

        public Iterator<T> iterator() {
            return C12751c.m28576a(this.f20380a);
        }
    }

    /* renamed from: C */
    public static <T> C13650g<T> m28375C(T[] tArr) {
        boolean z;
        C12775o.m28639i(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C13657m.m31271e();
        }
        return new C12711a(tArr);
    }

    /* renamed from: D */
    public static boolean m28376D(int[] iArr, int i) {
        C12775o.m28639i(iArr, "<this>");
        if (m28388P(iArr, i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static <T> boolean m28377E(T[] tArr, T t) {
        C12775o.m28639i(tArr, "<this>");
        if (m28389Q(tArr, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static <T> List<T> m28378F(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        return (List) m28379G(tArr, new ArrayList());
    }

    /* renamed from: G */
    public static final <C extends Collection<? super T>, T> C m28379G(T[] tArr, C c) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: H */
    public static <T> T m28380H(T[] tArr) {
        boolean z;
        C12775o.m28639i(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: I */
    public static <T> T m28381I(T[] tArr) {
        boolean z;
        C12775o.m28639i(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: J */
    public static C13528f m28382J(int[] iArr) {
        C12775o.m28639i(iArr, "<this>");
        return new C13528f(0, m28384L(iArr));
    }

    /* renamed from: K */
    public static int m28383K(float[] fArr) {
        C12775o.m28639i(fArr, "<this>");
        return fArr.length - 1;
    }

    /* renamed from: L */
    public static int m28384L(int[] iArr) {
        C12775o.m28639i(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: M */
    public static <T> int m28385M(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: N */
    public static Integer m28386N(int[] iArr, int i) {
        C12775o.m28639i(iArr, "<this>");
        if (i < 0 || i > m28384L(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: O */
    public static <T> T m28387O(T[] tArr, int i) {
        C12775o.m28639i(tArr, "<this>");
        if (i < 0 || i > m28385M(tArr)) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: P */
    public static int m28388P(int[] iArr, int i) {
        C12775o.m28639i(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public static <T> int m28389Q(T[] tArr, T t) {
        C12775o.m28639i(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C12775o.m28634d(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: R */
    public static final <T, A extends Appendable> A m28390R(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(a, "buffer");
        C12775o.m28639i(charSequence, "separator");
        C12775o.m28639i(charSequence2, "prefix");
        C12775o.m28639i(charSequence3, "postfix");
        C12775o.m28639i(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C13744n.m31506a(a, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: S */
    public static final <T> String m28391S(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(charSequence, "separator");
        C12775o.m28639i(charSequence2, "prefix");
        C12775o.m28639i(charSequence3, "postfix");
        C12775o.m28639i(charSequence4, "truncated");
        String sb = ((StringBuilder) m28390R(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        C12775o.m28638h(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: T */
    public static /* synthetic */ String m28392T(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m28391S(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: U */
    public static <T> T m28393U(T[] tArr) {
        boolean z;
        C12775o.m28639i(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[m28385M(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: V */
    public static <T> int m28394V(T[] tArr, T t) {
        C12775o.m28639i(tArr, "<this>");
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (C12775o.m28634d(t, tArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: W */
    public static <T> T m28395W(T[] tArr) {
        boolean z;
        C12775o.m28639i(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    /* renamed from: X */
    public static int m28396X(int[] iArr) {
        boolean z;
        C12775o.m28639i(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = iArr[0];
            C12703l0 r = new C13528f(1, m28384L(iArr)).iterator();
            while (r.hasNext()) {
                int i2 = iArr[r.nextInt()];
                if (i < i2) {
                    i = i2;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: Y */
    public static char m28397Y(char[] cArr) {
        C12775o.m28639i(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: Z */
    public static <T> T m28398Z(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: a0 */
    public static <T> List<T> m28399a0(T[] tArr, C13528f fVar) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(fVar, "indices");
        if (fVar.isEmpty()) {
            return C12726w.m28524k();
        }
        return C12708o.m28336c(C12708o.m28349p(tArr, fVar.getStart().intValue(), fVar.getEndInclusive().intValue() + 1));
    }

    /* renamed from: b0 */
    public static final <T> T[] m28400b0(T[] tArr, Comparator<? super T> comparator) {
        boolean z;
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(comparator, "comparator");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        C12708o.m28334A(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: c0 */
    public static <T> List<T> m28401c0(T[] tArr, Comparator<? super T> comparator) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(comparator, "comparator");
        return C12708o.m28336c(m28400b0(tArr, comparator));
    }

    /* renamed from: d0 */
    public static int m28402d0(int[] iArr) {
        C12775o.m28639i(iArr, "<this>");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: e0 */
    public static final <T, C extends Collection<? super T>> C m28403e0(T[] tArr, C c) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: f0 */
    public static final <T> HashSet<T> m28404f0(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        return (HashSet) m28403e0(tArr, new HashSet(C12714q0.m28413d(tArr.length)));
    }

    /* renamed from: g0 */
    public static <T> List<T> m28405g0(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C12726w.m28524k();
        }
        if (length != 1) {
            return m28407i0(tArr);
        }
        return C12723v.m28509d(tArr[0]);
    }

    /* renamed from: h0 */
    public static List<Integer> m28406h0(int[] iArr) {
        C12775o.m28639i(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public static <T> List<T> m28407i0(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        return new ArrayList(C12726w.m28519f(tArr));
    }

    /* renamed from: j0 */
    public static final <T> Set<T> m28408j0(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C12731y0.m28551e();
        }
        if (length != 1) {
            return (Set) m28403e0(tArr, new LinkedHashSet(C12714q0.m28413d(tArr.length)));
        }
        return C12729x0.m28549c(tArr[0]);
    }
}
