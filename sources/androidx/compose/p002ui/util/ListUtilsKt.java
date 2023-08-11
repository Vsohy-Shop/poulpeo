package androidx.compose.p002ui.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n33#1,6:207\n33#1,6:213\n33#1,6:219\n33#1,6:225\n33#1,6:231\n33#1,6:237\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:207,6\n102#1:213,6\n117#1:219,6\n134#1:225,6\n153#1:231,6\n201#1:237,6\n*E\n"})
/* renamed from: androidx.compose.ui.util.ListUtilsKt */
/* compiled from: ListUtils.kt */
public final class ListUtilsKt {
    public static final <T> boolean fastAll(List<? extends T> list, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "predicate");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!function1.invoke(list.get(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "predicate");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (function1.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> T fastFirstOrNull(List<? extends T> list, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "predicate");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, C13088o<? super Integer, ? super T, C11921v> oVar) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(oVar, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            oVar.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "action");
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(function1.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(c, "destination");
        C12775o.m28639i(function1, "transform");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(function1.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) function1.invoke(t);
        int m = C12726w.m28526m(list);
        int i = 1;
        if (1 <= m) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) function1.invoke(t2);
                if (comparable.compareTo(comparable2) < 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == m) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    public static final <T> int fastSumBy(List<? extends T> list, Function1<? super T, Integer> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "selector");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += function1.invoke(list.get(i2)).intValue();
        }
        return i;
    }
}
