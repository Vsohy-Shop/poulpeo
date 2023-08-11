package androidx.compose.p002ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n33#2,6:214\n33#2,4:220\n38#2:225\n1#3:224\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n94#1:214,6\n137#1:220,4\n137#1:225\n*E\n"})
/* renamed from: androidx.compose.ui.TempListUtilsKt */
/* compiled from: TempListUtils.kt */
public final class TempListUtilsKt {
    private static final <T> void appendElement(Appendable appendable, T t, Function1<? super T, ? extends CharSequence> function1) {
        boolean z;
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    public static final <T, K, V> Map<K, V> fastAssociate(List<? extends T> list, Function1<? super T, ? extends C11906l<? extends K, ? extends V>> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C11906l lVar = (C11906l) function1.invoke(list.get(i));
            linkedHashMap.put(lVar.mo49111c(), lVar.mo49112d());
        }
        return linkedHashMap;
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a, obj, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return fastJoinTo(list, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(charSequence, "separator");
        C12775o.m28639i(charSequence2, "prefix");
        C12775o.m28639i(charSequence3, "postfix");
        C12775o.m28639i(charSequence4, "truncated");
        String sb = ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        C12775o.m28638h(sb, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = function1.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, C13088o<? super S, ? super T, ? extends S> oVar) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(oVar, "operation");
        if (!list.isEmpty()) {
            S Z = C12686e0.m28221Z(list);
            int m = C12726w.m28526m(list);
            int i = 1;
            if (1 <= m) {
                while (true) {
                    Z = oVar.invoke(Z, list.get(i));
                    if (i == m) {
                        break;
                    }
                    i++;
                }
            }
            return Z;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, C13088o<? super T, ? super R, ? extends V> oVar) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(list2, "other");
        C12775o.m28639i(oVar, "transform");
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(oVar.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, C13088o<? super T, ? super T, ? extends R> oVar) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(oVar, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return C12726w.m28524k();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Object obj = list.get(0);
        int m = C12726w.m28526m(list);
        while (i < m) {
            i++;
            Object obj2 = list.get(i);
            arrayList.add(oVar.invoke(obj, obj2));
            obj = obj2;
        }
        return arrayList;
    }
}
