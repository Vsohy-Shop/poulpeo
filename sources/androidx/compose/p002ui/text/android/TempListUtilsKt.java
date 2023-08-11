package androidx.compose.p002ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,85:1\n34#1,6:86\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n55#1:86,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.TempListUtilsKt */
/* compiled from: TempListUtils.kt */
public final class TempListUtilsKt {
    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(function1, "action");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
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
