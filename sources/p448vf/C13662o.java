package p448vf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p412pf.C13212a;

/* renamed from: vf.o */
/* compiled from: _Sequences.kt */
class C13662o extends C13661n {

    /* renamed from: vf.o$a */
    /* compiled from: Iterables.kt */
    public static final class C13663a implements Iterable<T>, C13212a {

        /* renamed from: b */
        final /* synthetic */ C13650g f22003b;

        public C13663a(C13650g gVar) {
            this.f22003b = gVar;
        }

        public Iterator<T> iterator() {
            return this.f22003b.iterator();
        }
    }

    /* renamed from: vf.o$b */
    /* compiled from: _Sequences.kt */
    static final class C13664b extends C12777p implements Function1<T, Boolean> {

        /* renamed from: g */
        public static final C13664b f22004g = new C13664b();

        C13664b() {
            super(1);
        }

        public final Boolean invoke(T t) {
            return Boolean.valueOf(t == null);
        }
    }

    /* renamed from: A */
    public static final <T> List<T> m31276A(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return (List) m31291x(gVar, new ArrayList());
    }

    /* renamed from: j */
    public static <T> Iterable<T> m31277j(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return new C13663a(gVar);
    }

    /* renamed from: k */
    public static <T> int m31278k(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C12726w.m28533t();
            }
        }
        return i;
    }

    /* renamed from: l */
    public static <T> C13650g<T> m31279l(C13650g<? extends T> gVar, int i) {
        boolean z;
        C12775o.m28639i(gVar, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return gVar;
        } else {
            if (gVar instanceof C13644c) {
                return ((C13644c) gVar).mo53315b(i);
            }
            return new C13642b(gVar, i);
        }
    }

    /* renamed from: m */
    public static <T> C13650g<T> m31280m(C13650g<? extends T> gVar, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(gVar, "<this>");
        C12775o.m28639i(function1, "predicate");
        return new C13646e(gVar, true, function1);
    }

    /* renamed from: n */
    public static final <T> C13650g<T> m31281n(C13650g<? extends T> gVar, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(gVar, "<this>");
        C12775o.m28639i(function1, "predicate");
        return new C13646e(gVar, false, function1);
    }

    /* renamed from: o */
    public static final <T> C13650g<T> m31282o(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        C13650g<T> n = m31281n(gVar, C13664b.f22004g);
        C12775o.m28637g(n, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return n;
    }

    /* renamed from: p */
    public static <T> T m31283p(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: q */
    public static final <T, A extends Appendable> A m31284q(C13650g<? extends T> gVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12775o.m28639i(gVar, "<this>");
        C12775o.m28639i(a, "buffer");
        C12775o.m28639i(charSequence, "separator");
        C12775o.m28639i(charSequence2, "prefix");
        C12775o.m28639i(charSequence3, "postfix");
        C12775o.m28639i(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : gVar) {
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

    /* renamed from: r */
    public static final <T> String m31285r(C13650g<? extends T> gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12775o.m28639i(gVar, "<this>");
        C12775o.m28639i(charSequence, "separator");
        C12775o.m28639i(charSequence2, "prefix");
        C12775o.m28639i(charSequence3, "postfix");
        C12775o.m28639i(charSequence4, "truncated");
        String sb = ((StringBuilder) m31284q(gVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        C12775o.m28638h(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: s */
    public static /* synthetic */ String m31286s(C13650g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m31285r(gVar, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: t */
    public static <T, R> C13650g<R> m31287t(C13650g<? extends T> gVar, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(gVar, "<this>");
        C12775o.m28639i(function1, "transform");
        return new C13669r(gVar, function1);
    }

    /* renamed from: u */
    public static <T, R> C13650g<R> m31288u(C13650g<? extends T> gVar, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(gVar, "<this>");
        C12775o.m28639i(function1, "transform");
        return m31282o(new C13669r(gVar, function1));
    }

    /* renamed from: v */
    public static <T extends Comparable<? super T>> T m31289v(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: w */
    public static <T> C13650g<T> m31290w(C13650g<? extends T> gVar, int i) {
        boolean z;
        C12775o.m28639i(gVar, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C13657m.m31271e();
        } else {
            if (gVar instanceof C13644c) {
                return ((C13644c) gVar).mo53314a(i);
            }
            return new C13667q(gVar, i);
        }
    }

    /* renamed from: x */
    public static final <T, C extends Collection<? super T>> C m31291x(C13650g<? extends T> gVar, C c) {
        C12775o.m28639i(gVar, "<this>");
        C12775o.m28639i(c, "destination");
        for (Object add : gVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: y */
    public static <T> HashSet<T> m31292y(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return (HashSet) m31291x(gVar, new HashSet());
    }

    /* renamed from: z */
    public static <T> List<T> m31293z(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return C12726w.m28531r(m31276A(gVar));
    }
}
