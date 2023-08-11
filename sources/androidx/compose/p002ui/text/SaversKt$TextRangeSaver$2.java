package androidx.compose.p002ui.text;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n*L\n329#1:422\n329#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$TextRangeSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$TextRangeSaver$2 extends C12777p implements Function1<Object, TextRange> {
    public static final SaversKt$TextRangeSaver$2 INSTANCE = new SaversKt$TextRangeSaver$2();

    SaversKt$TextRangeSaver$2() {
        super(1);
    }

    /* renamed from: invoke-VqIyPBM  reason: not valid java name */
    public final TextRange invoke(Object obj) {
        Integer num;
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num2 = null;
        if (obj2 != null) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        C12775o.m28636f(num);
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num2 = (Integer) obj3;
        }
        C12775o.m28636f(num2);
        return TextRange.m37963boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
    }
}
