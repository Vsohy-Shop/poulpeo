package p348gf;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: gf.b */
/* compiled from: Comparisons.kt */
class C12019b {

    /* renamed from: gf.b$a */
    /* compiled from: Comparisons.kt */
    static final class C12020a<T> implements Comparator {

        /* renamed from: b */
        final /* synthetic */ Function1<T, Comparable<?>>[] f18784b;

        C12020a(Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
            this.f18784b = function1Arr;
        }

        public final int compare(T t, T t2) {
            return C12019b.m26107d(t, t2, this.f18784b);
        }
    }

    /* renamed from: b */
    public static <T> Comparator<T> m26105b(Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        boolean z;
        C12775o.m28639i(function1Arr, "selectors");
        if (function1Arr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C12020a(function1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static <T extends Comparable<?>> int m26106c(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final <T> int m26107d(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int c = m26106c((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
            if (c != 0) {
                return c;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static <T extends Comparable<? super T>> Comparator<T> m26108e() {
        C12023e eVar = C12023e.f18785b;
        C12775o.m28637g(eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return eVar;
    }
}
