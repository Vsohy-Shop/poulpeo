package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.a0 */
/* compiled from: MutableCollectionsJVM.kt */
class C12664a0 extends C12732z {
    /* renamed from: A */
    public static <T> void m28170A(List<T> list, Comparator<? super T> comparator) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: z */
    public static <T extends Comparable<? super T>> void m28171z(List<T> list) {
        C12775o.m28639i(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
