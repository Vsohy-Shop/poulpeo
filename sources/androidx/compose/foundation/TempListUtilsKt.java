package androidx.compose.foundation;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n33#2,6:109\n33#2,6:115\n69#2,4:121\n74#2:126\n1#3:125\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n38#1:109,6\n61#1:115,6\n82#1:121,4\n82#1:126\n*E\n"})
/* compiled from: TempListUtils.kt */
public final class TempListUtilsKt {
    public static final <T> List<T> fastFilter(List<? extends T> list, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (function1.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [of.o<? super R, ? super T, ? extends R>, java.lang.Object, of.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R fastFold(java.util.List<? extends T> r3, R r4, p404of.C13088o<? super R, ? super T, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            int r0 = r3.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x001c
            java.lang.Object r2 = r3.get(r1)
            java.lang.Object r4 = r5.invoke(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.TempListUtilsKt.fastFold(java.util.List, java.lang.Object, of.o):java.lang.Object");
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, C13088o<? super Integer, ? super T, ? extends R> oVar) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(oVar, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = oVar.invoke(Integer.valueOf(i), list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "selector");
        if (list.isEmpty()) {
            return null;
        }
        R r = (Comparable) function1.invoke(list.get(0));
        int m = C12726w.m28526m(list);
        int i = 1;
        if (1 <= m) {
            while (true) {
                R r2 = (Comparable) function1.invoke(list.get(i));
                if (r2.compareTo(r) > 0) {
                    r = r2;
                }
                if (i == m) {
                    break;
                }
                i++;
            }
        }
        return r;
    }
}
