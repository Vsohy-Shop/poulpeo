package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.intl.Locale;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n404#1:422,3\n404#1:425,4\n404#1:429,2\n404#1:431\n404#1:432\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$LocaleListSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$LocaleListSaver$1 extends C12777p implements C13088o<SaverScope, LocaleList, Object> {
    public static final SaversKt$LocaleListSaver$1 INSTANCE = new SaversKt$LocaleListSaver$1();

    SaversKt$LocaleListSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, LocaleList localeList) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(localeList, "it");
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SaversKt.save(localeList2.get(i), SaversKt.getSaver(Locale.Companion), saverScope));
        }
        return arrayList;
    }
}
