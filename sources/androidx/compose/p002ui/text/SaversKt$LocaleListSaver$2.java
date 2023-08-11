package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.intl.Locale;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n411#1:422,3\n411#1:425,4\n411#1:429\n411#1:433\n411#1:434\n411#1:435\n411#1:430,2\n411#1:432\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$LocaleListSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$LocaleListSaver$2 extends C12777p implements Function1<Object, LocaleList> {
    public static final SaversKt$LocaleListSaver$2 INSTANCE = new SaversKt$LocaleListSaver$2();

    SaversKt$LocaleListSaver$2() {
        super(1);
    }

    public final LocaleList invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            Saver<Locale, Object> saver = SaversKt.getSaver(Locale.Companion);
            Locale locale = null;
            if (!C12775o.m28634d(obj2, Boolean.FALSE) && obj2 != null) {
                locale = saver.restore(obj2);
            }
            C12775o.m28636f(locale);
            arrayList.add(locale);
        }
        return new LocaleList((List<Locale>) arrayList);
    }
}
