package androidx.compose.p002ui.text;

import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.p002ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n*L\n374#1:422\n374#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$TextUnitSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$TextUnitSaver$2 extends C12777p implements Function1<Object, TextUnit> {
    public static final SaversKt$TextUnitSaver$2 INSTANCE = new SaversKt$TextUnitSaver$2();

    SaversKt$TextUnitSaver$2() {
        super(1);
    }

    /* renamed from: invoke-XNhUCwk  reason: not valid java name */
    public final TextUnit invoke(Object obj) {
        Float f;
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType textUnitType = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        C12775o.m28636f(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            textUnitType = (TextUnitType) obj3;
        }
        C12775o.m28636f(textUnitType);
        return TextUnit.m38639boximpl(TextUnitKt.m38661TextUnitanM5pPY(floatValue, textUnitType.m38680unboximpl()));
    }
}
