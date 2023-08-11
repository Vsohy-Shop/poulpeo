package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p342ff.C11969b;

/* renamed from: kotlin.collections.v */
/* compiled from: CollectionsJVM.kt */
class C12723v {
    /* renamed from: a */
    public static <E> List<E> m28506a(List<E> list) {
        C12775o.m28639i(list, "builder");
        return ((C11969b) list).mo49301s();
    }

    /* renamed from: b */
    public static final <T> Object[] m28507b(T[] tArr, boolean z) {
        C12775o.m28639i(tArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z && C12775o.m28634d(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C12775o.m28638h(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: c */
    public static <E> List<E> m28508c(int i) {
        return new C11969b(i);
    }

    /* renamed from: d */
    public static <T> List<T> m28509d(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C12775o.m28638h(singletonList, "singletonList(element)");
        return singletonList;
    }
}
