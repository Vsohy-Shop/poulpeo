package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.x */
/* compiled from: Iterables.kt */
class C12728x extends C12726w {
    /* renamed from: v */
    public static <T> int m28544v(Iterable<? extends T> iterable, int i) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    /* renamed from: w */
    public static final <T> Integer m28545w(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: x */
    public static <T> List<T> m28546x(Iterable<? extends Iterable<? extends T>> iterable) {
        C12775o.m28639i(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable B : iterable) {
            boolean unused = C12669b0.m28178B(arrayList, B);
        }
        return arrayList;
    }
}
